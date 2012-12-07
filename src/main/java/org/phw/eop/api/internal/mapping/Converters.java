package org.phw.eop.api.internal.mapping;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

import org.phw.eop.api.ApiException;
import org.phw.eop.api.Constants;
import org.phw.eop.api.internal.mapping.annotation.EopBean;
import org.phw.eop.api.internal.mapping.annotation.RspField;
import org.phw.eop.api.internal.mapping.propmapping.IPropMapping;
import org.phw.eop.api.internal.util.EopUtils;
import org.phw.eop.api.internal.util.StringUtils;
import org.phw.eop.api.internal.util.Strings;

public class Converters {
    private static Map<Class, Class> primitiveMap = new HashMap<Class, Class>();
    static {
        primitiveMap.put(boolean.class, Boolean.class);
        primitiveMap.put(byte.class, Byte.class);
        primitiveMap.put(char.class, Character.class);
        primitiveMap.put(short.class, Short.class);
        primitiveMap.put(int.class, Integer.class);
        primitiveMap.put(long.class, Long.class);
        primitiveMap.put(float.class, Float.class);
        primitiveMap.put(double.class, Double.class);
        primitiveMap.put(String.class, String.class);
    }

    public static boolean isCheckJsonType = false; // 是否对JSON返回的数据类型进行校验，默认不校验。给内部测试JSON返回时用的开关。规则：返回的"基本"类型只有String,Long,Boolean,Date,采取严格校验方式，如果类型不匹配，报错

    private Converters() {}

    /**
     * 获取映射名称。
     * @param beanAt
     * @param fieldAt
     * @param field
     * @return
     */
    private static String getMappingKey(EopBean beanAt, RspField fieldAt, Field field) {
        if (fieldAt != null && fieldAt.tagName() != null) { return fieldAt.tagName(); }
        if (beanAt != null) {
            Class<? extends IPropMapping> clazz = beanAt.propMapping();
            try {
                return clazz.newInstance().convert(field.getName());
            }
            catch (InstantiationException e) {}
            catch (IllegalAccessException e) {}
        }
        return null;
    }

    /**
     * 使用指定 的读取器去转换字符串为对象。
     * 
     * @param <T> 领域泛型
     * @param clazz 领域类型
     * @param reader 读取器
     * @return 领域对象
     * @throws ApiException
     */
    public static <T> void convert(T rsp, Reader reader) throws ApiException {

        try {
            Class<T> clazz = (Class<T>) rsp.getClass();

            BeanInfo beanInfo = Introspector.getBeanInfo(clazz, Object.class);
            PropertyDescriptor[] pds = beanInfo.getPropertyDescriptors();

            for (PropertyDescriptor pd : pds) {
                Method method = pd.getWriteMethod();
                if (method == null) { // ignore read-only fields
                    continue;
                }

                String itemName = pd.getName();
                Field field = EopUtils.getDeclaredField(clazz, itemName);
                if (field == null) {
                    continue;
                }
                EopBean jsonClazz = clazz.getAnnotation(EopBean.class);
                RspField jsonField = field.getAnnotation(RspField.class);
                itemName = getMappingKey(jsonClazz, jsonField, field);
                if (Strings.isEmpty(itemName)) {
                    continue;
                }

                Class<?> typeClass = field.getType();
                if (typeClass.isPrimitive()) {
                    typeClass = primitiveMap.get(typeClass);
                }

                if (!List.class.isAssignableFrom(typeClass) && !reader.hasReturnField(itemName)) {
                    continue; // ignore non-return field
                }

                // 目前
                if (String.class.isAssignableFrom(typeClass)) {
                    Object value = reader.getPrimitiveObject(itemName);
                    if (value instanceof String) {
                        method.invoke(rsp, value.toString());
                    }
                    else {
                        if (isCheckJsonType && value != null) { throw new ApiException(itemName + " is not a String"); }
                        if (value != null) {
                            method.invoke(rsp, value.toString());
                        }
                        else {
                            method.invoke(rsp, "");
                        }
                    }
                }
                else if (Long.class.isAssignableFrom(typeClass)) {
                    Object value = reader.getPrimitiveObject(itemName);
                    if (value instanceof Long) {
                        method.invoke(rsp, (Long) value);
                    }
                    else {
                        if (isCheckJsonType && value != null) { throw new ApiException(itemName
                                + " is not a Number(Long)"); }
                        if (StringUtils.isNumeric(value)) {
                            method.invoke(rsp, Long.valueOf("" + value));
                        }
                    }
                }
                else if (Integer.class.isAssignableFrom(typeClass)) {
                    Object value = reader.getPrimitiveObject(itemName);
                    if (value instanceof Integer) {
                        method.invoke(rsp, (Integer) value);
                    }
                    else {
                        if (isCheckJsonType && value != null) { throw new ApiException(itemName
                                + " is not a Number(Integer)"); }
                        if (StringUtils.isNumeric(value)) {
                            method.invoke(rsp, Integer.valueOf("" + value));
                        }
                    }
                }
                else if (Boolean.class.isAssignableFrom(typeClass)) {
                    Object value = reader.getPrimitiveObject(itemName);
                    if (value instanceof Boolean) {
                        method.invoke(rsp, (Boolean) value);
                    }
                    else {
                        if (isCheckJsonType && value != null) { throw new ApiException(itemName + " is not a Boolean"); }
                        if (value != null) {
                            method.invoke(rsp, Boolean.valueOf(value.toString()));
                        }
                    }
                }
                else if (Double.class.isAssignableFrom(typeClass)) {
                    Object value = reader.getPrimitiveObject(itemName);
                    if (value instanceof Double) {
                        method.invoke(rsp, (Double) value);
                    }
                    else {
                        if (isCheckJsonType && value != null) { throw new ApiException(itemName + " is not a Double"); }
                    }
                }
                else if (Number.class.isAssignableFrom(typeClass)) {
                    Object value = reader.getPrimitiveObject(itemName);
                    if (value instanceof Number) {
                        method.invoke(rsp, (Number) value);
                    }
                    else {
                        if (isCheckJsonType && value != null) { throw new ApiException(itemName + " is not a Number"); }
                    }
                }
                else if (Date.class.isAssignableFrom(typeClass)) {
                    DateFormat format = new SimpleDateFormat(Constants.DATE_TIME_FORMAT);
                    format.setTimeZone(TimeZone.getTimeZone(Constants.DATE_TIMEZONE));
                    Object value = reader.getPrimitiveObject(itemName);
                    if (value instanceof String) {
                        method.invoke(rsp, format.parse(value.toString()));
                    }
                }
                else if (List.class.isAssignableFrom(typeClass)) {
                    Type fieldType = field.getGenericType();
                    if (fieldType instanceof ParameterizedType) {
                        ParameterizedType paramType = (ParameterizedType) fieldType;
                        Type[] genericTypes = paramType.getActualTypeArguments();
                        if (genericTypes != null && genericTypes.length > 0) {
                            Class<?> subType = genericTypes[0] instanceof Class<?> ?
                                    (Class<?>) genericTypes[0] : Void.class;
                            List<?> listObjs = reader.getListObjects(itemName, subType);
                            if (listObjs != null) {
                                method.invoke(rsp, listObjs);
                            }
                        }
                    }
                }
                else {
                    if (TypeVariable.class.isAssignableFrom(field.getGenericType().getClass())) typeClass = Void.class;
                    Object obj = reader.getObject(itemName, typeClass);
                    if (obj != null) {
                        method.invoke(rsp, obj);
                    }
                }
            }
        }
        catch (Exception e) {
            throw new ApiException(e);
        }

    }

}
