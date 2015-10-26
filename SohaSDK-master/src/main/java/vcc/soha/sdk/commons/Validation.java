package vcc.soha.sdk.commons;

/**
 * Created by hainam1421 on 10/25/2015.
 */
public class Validation {
    private Validation() {
        throw new UnsupportedOperationException();
    }

    public static <T> T checkNotNull(T obj) {
        if (obj == null) {
            throw new NullPointerException();
        }
        return obj;
    }

    public static void checkArgument(boolean condition) {
        if (!condition) {
            throw new IllegalArgumentException();
        }
    }
}
