package okhttp3.p688d0.p691i;

/* renamed from: okhttp3.d0.i.f */
/* compiled from: HttpMethod */
public final class C14164f {
    /* renamed from: a */
    public static boolean m45025a(String str) {
        return str.equals("POST") || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE") || str.equals("MOVE");
    }

    /* renamed from: b */
    public static boolean m45026b(String str) {
        return !str.equals("GET") && !str.equals("HEAD");
    }

    /* renamed from: c */
    public static boolean m45027c(String str) {
        return !str.equals("PROPFIND");
    }

    /* renamed from: d */
    public static boolean m45028d(String str) {
        return str.equals("PROPFIND");
    }

    /* renamed from: e */
    public static boolean m45029e(String str) {
        return str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT");
    }
}
