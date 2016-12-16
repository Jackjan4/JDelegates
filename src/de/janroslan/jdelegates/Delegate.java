package de.janroslan.jdelegates;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 *
 * @author jackjan
 * @param <T>
 */
public class Delegate<T> {

    private Method m;
    private Object instance;

    public Delegate(Class c, Object instance, String methodName, Class... paramTypes) {
        this.instance = instance;

        try {
            m = c.getDeclaredMethod(methodName, paramTypes);
            m.setAccessible(true);

        } catch (NoSuchMethodException | SecurityException ex) {
            ex.printStackTrace();
        }
    }

    public T invoke(Object... params) {
        Object result = null;

        if (params.length != m.getParameterCount()) {
            throw new IllegalArgumentException("Parameter count is not correct");
        }

        try {
            result = m.invoke(instance, params);

        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            ex.printStackTrace();
        }

        return (T) result;
    }
}
