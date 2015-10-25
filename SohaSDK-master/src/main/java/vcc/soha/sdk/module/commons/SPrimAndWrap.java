package vcc.soha.sdk.module.commons;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by hainam1421 on 10/25/2015.
 */
public final class SPrimAndWrap {
    /**
     * UnsupportedOperationException
     */
    private SPrimAndWrap() {
        throw new UnsupportedOperationException();
    }

    /**
     * Khởi tạo đinh nghĩa Primtive to wrapper
     */
    private static final Map<Class<?>, Class<?>> PRIMITIVE_TO_WRAPPER_TYPE;

    /**
     * Block Code
     */
    static {
        Map<Class<?>, Class<?>> primToWrap = new HashMap<Class<?>, Class<?>>(16);
        Map<Class<?>, Class<?>> wrapToPrim = new HashMap<Class<?>, Class<?>>(16);

        add(primToWrap, wrapToPrim, boolean.class, Boolean.class);
        add(primToWrap, wrapToPrim, byte.class, Byte.class);
        add(primToWrap, wrapToPrim, char.class, Character.class);
        add(primToWrap, wrapToPrim, double.class, Double.class);
        add(primToWrap, wrapToPrim, float.class, Float.class);
        add(primToWrap, wrapToPrim, int.class, Integer.class);
        add(primToWrap, wrapToPrim, long.class, Long.class);
        add(primToWrap, wrapToPrim, short.class, Short.class);
        add(primToWrap, wrapToPrim, void.class, Void.class);

        PRIMITIVE_TO_WRAPPER_TYPE = Collections.unmodifiableMap(primToWrap);

    }

    private static void add(Map<Class<?>, Class<?>> forward,
                            Map<Class<?>, Class<?>> backward, Class<?> key, Class<?> value) {
        forward.put(key, value);
        backward.put(value, key);
    }

    public static <T> Class<T> wrap(Class<T> type) {
        // cast is safe: long.class and Long.class are both of type Class<Long>
        @SuppressWarnings("unchecked")
        Class<T> wrapped = (Class<T>) PRIMITIVE_TO_WRAPPER_TYPE.get(
                Preconditions.checkNotNull(type));
        return (wrapped == null) ? type : wrapped;
    }
}
