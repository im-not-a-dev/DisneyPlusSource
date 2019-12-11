package org.joda.time.p699tz;

/* renamed from: org.joda.time.tz.ZoneInfoLogger */
public class ZoneInfoLogger {
    static ThreadLocal<Boolean> cVerbose = new ThreadLocal<Boolean>() {
        /* access modifiers changed from: protected */
        public Boolean initialValue() {
            return Boolean.FALSE;
        }
    };

    public static void set(boolean z) {
        cVerbose.set(Boolean.valueOf(z));
    }

    public static boolean verbose() {
        return ((Boolean) cVerbose.get()).booleanValue();
    }
}
