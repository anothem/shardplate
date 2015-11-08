package uk.co.shardbits.shardplate;

public final class StringUtil {

    private StringUtil() {
        throw new AssertionError("Don't instantiate this");
    }

    /**
     * This is pretty much identical to {@link android.text.TextUtils#isEmpty(CharSequence)}
     * but allows us to not have an "Android dependency" for such a simple util. It helps
     * immensely with running simple JUnit tests for Presenters and similar modules.
     */
    public static boolean isNullOrEmpty(String s) {
        return s == null || s.isEmpty();
    }

}