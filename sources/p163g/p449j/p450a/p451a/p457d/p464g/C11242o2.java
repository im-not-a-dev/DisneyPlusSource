package p163g.p449j.p450a.p451a.p457d.p464g;

/* renamed from: g.j.a.a.d.g.o2 */
final class C11242o2 {

    /* renamed from: a */
    private static final Class<?> f26386a = m35819a("libcore.io.Memory");

    /* renamed from: b */
    private static final boolean f26387b = (m35819a("org.robolectric.Robolectric") != null);

    /* renamed from: a */
    static boolean m35820a() {
        return f26386a != null && !f26387b;
    }

    /* renamed from: b */
    static Class<?> m35821b() {
        return f26386a;
    }

    /* renamed from: a */
    private static <T> Class<T> m35819a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
