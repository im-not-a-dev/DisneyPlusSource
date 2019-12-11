package p163g.p449j.p450a.p451a.p457d.p464g;

/* renamed from: g.j.a.a.d.g.ca */
public final class C11065ca implements C11081da {

    /* renamed from: a */
    private static final C11283r1<Boolean> f26118a;

    /* renamed from: b */
    private static final C11283r1<Boolean> f26119b;

    /* renamed from: c */
    private static final C11283r1<Boolean> f26120c;

    static {
        C11382y1 y1Var = new C11382y1(C11298s1.m36065a("com.google.android.gms.measurement"));
        f26118a = y1Var.mo29191a("measurement.sdk.collection.last_deep_link_referrer", false);
        f26119b = y1Var.mo29191a("measurement.sdk.collection.last_deep_link_referrer_campaign", false);
        f26120c = y1Var.mo29191a("measurement.sdk.collection.last_gclid_from_referrer", false);
    }

    /* renamed from: a */
    public final boolean mo28365a() {
        return ((Boolean) f26120c.mo28863a()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo28366b() {
        return ((Boolean) f26119b.mo28863a()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo28367c() {
        return ((Boolean) f26118a.mo28863a()).booleanValue();
    }
}
