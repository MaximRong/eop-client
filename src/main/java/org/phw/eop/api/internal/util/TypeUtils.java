package org.phw.eop.api.internal.util;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

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
        Type[] types = investigate(cls, interfaceCls);
        return types != null && types.length > pos ? types[pos] : null;
    }

    static Type[] investigate(Type t, Class<?> s, Type... typeArgs) {
        if (t instanceof Class<?>) {
            return investigate((Class<?>) t, s, typeArgs);
        }
        else if (t instanceof ParameterizedType) {
            return investigate((ParameterizedType) t, s, typeArgs);
        }

        return null;
    }

    static Type[] investigate(Class<?> c, Class<?> s, Type... typeArgs) {
        Type[] types = investigate(c.getGenericSuperclass(), s, typeArgs);
        if (types != null) {
            return types;
        }

        for (Type i : c.getGenericInterfaces()) {
            types = investigate(i, s, typeArgs);
            if (types != null) {
                return types;
            }
        }

        return null;
    }

    static Type[] investigate(ParameterizedType p, Class<?> s, Type... typeArgs) {
        final Class<?> c = (Class<?>) p.getRawType();

        Type[] localArgs = p.getActualTypeArguments();
        if (typeArgs != null && typeArgs.length > 0) {
            int nextTypeArg = 0;
            for (Type local : localArgs) {
                if (local instanceof TypeVariable) {
                    // reify local type arg to instantiated one.
                    localArgs[nextTypeArg] = typeArgs[nextTypeArg];
                    nextTypeArg++;
                }
            }
        }
        Type[] types = investigate(c, s, localArgs);
        return types != null ? types : c == s ? localArgs : null;
    }
}
