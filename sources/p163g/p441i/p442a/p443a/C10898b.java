package p163g.p441i.p442a.p443a;

/* renamed from: g.i.a.a.b */
/* compiled from: Base64Variants */
public final class C10898b {

    /* renamed from: a */
    public static final C10897a f25835a;

    /* renamed from: b */
    public static final C10897a f25836b = new C10897a(f25835a, "MIME-NO-LINEFEEDS", Integer.MAX_VALUE);

    static {
        C10897a aVar = new C10897a("MIME", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", true, '=', 76);
        f25835a = aVar;
        new C10897a(f25835a, "PEM", true, '=', 64);
        StringBuilder sb = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        sb.setCharAt(sb.indexOf("+"), '-');
        sb.setCharAt(sb.indexOf("/"), '_');
        new C10897a("MODIFIED-FOR-URL", sb.toString(), false, 0, Integer.MAX_VALUE);
    }

    /* renamed from: a */
    public static C10897a m34366a() {
        return f25836b;
    }
}
