//: net/mindview/util/TypeCounter.java
// Counts instances of a type family.
package ThinkingInJava4th源码code.TIJ4code.net.mindview.util;

import java.util.*;

public class TypeCounter extends HashMap<Class<?>, Integer> {
    private Class<?> baseType;

    public TypeCounter(Class<?> baseType) {
        this.baseType = baseType;
    }

    public void count(Object obj) {
        Class<?> type = obj.getClass();
        if (!baseType.isAssignableFrom(type))       // r:assignable 可分配的 判断type是否是baseType的本类或衍生(包括子类 子接口 (实现不算))
            throw new RuntimeException(obj + " incorrect type: "
                    + type + ", should be type or subtype of "
                    + baseType);
        countClass(type);
    }

    private void countClass(Class<?> type) {
        Integer quantity = get(type);
        put(type, quantity == null ? 1 : quantity + 1);
        Class<?> superClass = type.getSuperclass();
        if (superClass != null &&
                baseType.isAssignableFrom(superClass))      // 是父接口
            countClass(superClass);
    }

    public String toString() {
        StringBuilder result = new StringBuilder("{");
        for (Map.Entry<Class<?>, Integer> pair : entrySet()) {
            result.append(pair.getKey().getSimpleName());
            result.append("=");
            result.append(pair.getValue());
            result.append(", ");
        }
        result.delete(result.length() - 2, result.length());
        result.append("}");
        return result.toString();
    }
} ///:~
