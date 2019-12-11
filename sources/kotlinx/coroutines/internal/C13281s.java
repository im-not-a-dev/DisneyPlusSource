package kotlinx.coroutines.internal;

/* renamed from: kotlinx.coroutines.internal.s */
/* compiled from: SystemProps.kt */
final /* synthetic */ class C13281s {

    /* renamed from: a */
    private static final int f29714a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static final int m40828a() {
        return f29714a;
    }

    /* renamed from: a */
    public static final String m40829a(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
