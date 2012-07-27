package org.phw.eop.api.internal.mapping;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.phw.eop.api.Req;
import org.phw.eop.api.internal.mapping.annotation.EopBean;
import org.phw.eop.api.internal.mapping.annotation.ReqField;
import org.phw.eop.api.internal.mapping.annotation.Transient;
import org.phw.eop.api.internal.mapping.propmapping.IPropMapping;
import org.phw.eop.api.internal.util.EopMap;
import org.phw.eop.api.internal.util.EopUtils;
import org.phw.eop.api.internal.util.Strings;

/**
 * 请求Bean到EopMap的映射。</br>
 * 
 * 1.加密限制作用范围：父节点securete>子节点securete。</br>
 * 2.映射规则作用范围：父节点strategy<子节点tagName。</br>
 * 3.支持属性类型：Primitive、String、Map、List、Bean。</br>
 * 
 * @author wanglei
 * 
 * 2012-1-9
 */
public class ReqMappings {

    /**
     * 获取Req Params。
     */
    public static EopMap getParams(Req req, SecuretType secureteType) {
        EopMap eopMap = new EopMap();
        if (req == null) {
            return eopMap;
        }
        Map map = parseBean(req, secureteType);
        for (Object key : map.keySet()) {
            eopMap.put(key.toString(), map.get(key));
        }
        return eopMap;
    }

    /**
     * 解析Req Bean。
     * @param bean 当前Field。
     * @param secureteType 加密类型。
     * @return Map。
     */
    private static Map parseBean(Object bean, SecuretType secureteType) {
        Map retMap = new HashMap();
        try {
            List<Field> fields = EopUtils.getDeclaredField(bean.getClass());
            for (Field field : fields) {
                EopBean beanAt = bean.getClass().getAnnotation(EopBean.class);
                ReqField fieldAt = field.getAnnotation(ReqField.class);
                // fieldAt maybe null
                boolean emptyMapped = fieldAt == null ? false : fieldAt.emptyMapped();
                // 映射名称
                String key = getMappingKey(beanAt, fieldAt, field, secureteType);
                // 无映射规则或加密类型不一致
                if (key == null) {
                    continue;
                }
                Class<?> typeClass = field.getType();
                Object fieldValue = getFieldValue(bean, field);
                // 简单类型、String
                if (typeClass.isPrimitive() || String.class.isAssignableFrom(typeClass)) {
                    EopUtils.putMap(retMap, key, getFieldValue(bean, field), emptyMapped);
                }
                // List，必须指定元素泛型，不支持mappedOut
                else if (List.class.isAssignableFrom(typeClass)) {
                    if (fieldValue == null && !emptyMapped) {
                        continue;
                    }
                    Class<?> subType = getFieldGenericType(field);
                    if (subType == null) {
                        continue;
                    }
                    List<Object> list = fieldValue == null ? parseEmptyList(subType, secureteType) : parseList(
                            (List<Object>) fieldValue, subType, secureteType);
                    retMap.put(key, list);
                }
                // Map，不支持同时mappedOut、emptyMapped
                else if (Map.class.isAssignableFrom(typeClass)) {
                    if (fieldAt != null && fieldAt.mappedOut()) {
                        retMap.putAll(fieldValue == null ? new HashMap() : (Map) fieldValue);
                    }
                    else {
                        EopUtils.putMap(retMap, key, fieldValue, emptyMapped);
                    }
                }
                // Bean
                else {
                    if (fieldValue == null && !emptyMapped) {
                        continue;
                    }
                    Map map = fieldValue == null ? parseEmptyBean(typeClass, secureteType) : parseBean(
                            fieldValue, secureteType);
                    if (fieldAt != null && fieldAt.mappedOut()) {
                        retMap.putAll(map);
                    }
                    else {
                        retMap.put(key, map);
                    }
                }
            }
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
        return retMap;
    }

    /**
     * 解析Empty Bean。
     * @param clazz 当前Field类。
     * @param secureteType 加密类型。
     * @return Map。
     */
    private static Map parseEmptyBean(Class clazz, SecuretType secureteType) {
        Map retMap = new HashMap();
        List<Field> fields = EopUtils.getDeclaredField(clazz);
        for (Field field : fields) {
            EopBean beanAt = (EopBean) clazz.getAnnotation(EopBean.class);
            ReqField fieldAt = field.getAnnotation(ReqField.class);
            boolean emptyMapped = fieldAt == null ? false : fieldAt.emptyMapped();
            // 映射名称
            String key = getMappingKey(beanAt, fieldAt, field, secureteType);
            // 无映射规则或加密类型不一致
            if (key == null) {
                continue;
            }
            Class<?> typeClass = field.getType();
            // 简单类型、String
            if (typeClass.isPrimitive() || String.class.isAssignableFrom(typeClass)) {
                EopUtils.putMap(retMap, key, null, emptyMapped);
            }
            // List
            else if (List.class.isAssignableFrom(typeClass)) {
                if (fieldAt != null && !emptyMapped) {
                    continue;
                }
                Class<?> subType = getFieldGenericType(field);
                if (subType == null) {
                    continue;
                }
                retMap.put(key, parseEmptyList(subType, secureteType));
            }
            // Map
            else if (Map.class.isAssignableFrom(typeClass)) {
                if (fieldAt != null && !fieldAt.mappedOut()) {
                    EopUtils.putMap(retMap, key, null, emptyMapped);
                }
            }
            // Bean
            else {
                if (fieldAt != null && !fieldAt.emptyMapped()) {
                    continue;
                }
                Map map = parseEmptyBean(typeClass, secureteType);
                if (fieldAt != null && fieldAt.mappedOut()) {
                    retMap.putAll(map);
                }
                else {
                    retMap.put(key, map);
                }
            }
        }
        return retMap;
    }

    /**
     * 解析List Field。
     */
    private static List<Object> parseList(List<Object> objList, Class<?> subType, SecuretType secureteType) {
        // 简单类型、String、Map
        if (subType.isPrimitive() || String.class.isAssignableFrom(subType) || Map.class.isAssignableFrom(subType)) {
            return objList;
        }
        List<Object> retList = new ArrayList<Object>();
        // List Nested
        if (List.class.isAssignableFrom(subType)) {
            // not support yet
        }
        // Bean
        else {
            for (Object obj : objList) {
                retList.add(parseBean(obj, secureteType));
            }
        }

        return retList;
    }

    /**
     * 解析Empty List。
     * @param subType
     * @param secureteType
     * @return
     * @throws Exception
     */
    private static List<Object> parseEmptyList(Class<?> subType, SecuretType secureteType) {
        List<Object> retList = new ArrayList<Object>();
        // 简单类型、String、Map
        if (subType.isPrimitive() || String.class.isAssignableFrom(subType) || Map.class.isAssignableFrom(subType)) {
            retList.add("");
            return retList;
        }
        // List Nested
        if (List.class.isAssignableFrom(subType)) {
            // not support yet
        }
        // Bean
        else {
            retList.add(parseEmptyBean(subType, secureteType));
        }
        return retList;
    }

    /**
     * 获取映射名称。
     * @param beanAt Bean注解。
     * @param fieldAt Field注解。
     * @param fieldName Field名称。
     * @return
     */
    private static String getMappingKey(EopBean beanAt, ReqField fieldAt, Field field, SecuretType secureteType) {
        if (field.getName().equals("serialVersionUID")) {
            return null;
        }
        if (field.getAnnotation(Transient.class) != null) {
            return null;
        }
        if (fieldAt != null && fieldAt.securete() == secureteType) {
            return fieldAt.tagName();
        }
        if (beanAt != null && beanAt.securete() == secureteType) {

            Class<? extends IPropMapping> clazz = beanAt.propMapping();
            try {
                return clazz.newInstance().convert(field.getName());
            }
            catch (InstantiationException e) {
            }
            catch (IllegalAccessException e) {
            }
        }
        return null;
    }

    /**
     * 获取Field泛型。
     */
    public static Class<?> getFieldGenericType(Field field) {
        Type fieldType = field.getGenericType();
        if (fieldType instanceof ParameterizedType) {
            ParameterizedType paramType = (ParameterizedType) fieldType;
            Type[] genericTypes = paramType.getActualTypeArguments();
            if (genericTypes != null && genericTypes.length > 0 && genericTypes[0] instanceof Class<?>) {
                return (Class<?>) genericTypes[0];
            }
        }
        return null;
    }

    /**
     * 获取对象的Field值。
     */
    public static Object getFieldValue(Object target, Field field) {
        try {
            String methodname = "get" + Strings.capitalize(field.getName());
            Method method = target.getClass().getDeclaredMethod(methodname);
            method.setAccessible(true);
            return method.invoke(target);
        }
        catch (NoSuchMethodException e) {
        }
        catch (InvocationTargetException e) {
        }
        catch (IllegalAccessException e) {
        }

        try {
            field.setAccessible(true);
            return field.get(target);
        }
        catch (Exception fe) {
        }
        return null;
    }

}
