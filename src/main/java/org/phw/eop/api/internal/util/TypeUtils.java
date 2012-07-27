package org.phw.eop.api.internal.util;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class TypeUtils {
    /**
     * 取得一个类泛型接口中的泛型对应的实际类型。
     * @param cls 目标类型
     * @param interfaceCls 泛型接口类型
     * @return 目标类型实现的泛型接口类型的实际类型
     */
    public static Type getActualType(Class cls, Class interfaceCls) {
        return getActualType(cls, interfaceCls, 0);
    }

    /**
     * 取得一个类泛型接口中的泛型对应的实际类型。
     * @param cls 目标类型
     * @param interfaceCls 泛型接口类型
     * @param pos 第几个泛型
     * @return 目标类型实现的泛型接口类型的实际类型
     */
    public static Type getActualType(Class cls, Class interfaceCls, int pos) {
        Type[] genericInterfaces = cls.getGenericInterfaces();
        for (Type genericInterface : genericInterfaces) {
            if (genericInterface instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) genericInterface;
                if (parameterizedType.getRawType() == interfaceCls) {
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    if (actualTypeArguments.length > pos) {
                        return actualTypeArguments[pos];
                    }
                }
            }
        }
        return null;
    }
}
