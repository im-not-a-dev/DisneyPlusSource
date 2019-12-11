package p163g.p449j.p450a.p451a.p457d.p464g;

/* renamed from: g.j.a.a.d.g.k9 */
public final class C11186k9 implements C11208l9 {

    /* renamed from: a */
    private static final C11283r1<Boolean> f26303a;

    /* renamed from: b */
    private static final C11283r1<Boolean> f26304b;

    /* renamed from: c */
    private static final C11283r1<Boolean> f26305c;

    static {
        C11382y1 y1Var = new C11382y1(C11298s1.m36065a("com.google.android.gms.measurement"));
        f26303a = y1Var.mo29191a("measurement.sdk.dynamite.allow_remote_dynamite", false);
        f26304b = y1Var.mo29191a("measurement.collection.init_params_control_enabled", true);
        f26305c = y1Var.mo29191a("measurement.sdk.dynamite.use_dynamite", false);
        y1Var.mo29191a("measurement.sdk.dynamite.use_dynamite2", false);
        y1Var.mo29189a("measurement.id.sdk.dynamite.use_dynamite", 0);
    }

    /* renamed from: a */
    public final boolean mo28624a() {
        return ((Boolean) f26303a.mo28863a()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo28625b() {
        return ((Boolean) f26305c.mo28863a()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo28626c() {
        return ((Boolean) f26304b.mo28863a()).booleanValue();
    }
}
