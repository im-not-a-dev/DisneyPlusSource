package p163g.p449j.p450a.p451a.p457d.p464g;

/* renamed from: g.j.a.a.d.g.r8 */
public final class C11291r8 implements C11305s8 {

    /* renamed from: a */
    private static final C11283r1<Boolean> f26492a;

    /* renamed from: b */
    private static final C11283r1<Boolean> f26493b;

    /* renamed from: c */
    private static final C11283r1<Boolean> f26494c;

    static {
        C11382y1 y1Var = new C11382y1(C11298s1.m36065a("com.google.android.gms.measurement"));
        f26492a = y1Var.mo29191a("measurement.log_installs_enabled", false);
        f26493b = y1Var.mo29191a("measurement.log_third_party_store_events_enabled", false);
        f26494c = y1Var.mo29191a("measurement.log_upgrades_enabled", false);
    }

    /* renamed from: a */
    public final boolean mo28873a() {
        return ((Boolean) f26493b.mo28863a()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo28874b() {
        return ((Boolean) f26494c.mo28863a()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo28875c() {
        return ((Boolean) f26492a.mo28863a()).booleanValue();
    }
}
