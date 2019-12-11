package p163g.p449j.p450a.p451a.p457d.p464g;

/* renamed from: g.j.a.a.d.g.nb */
public final class C11237nb implements C11174jb {

    /* renamed from: a */
    private static final C11283r1<Boolean> f26379a;

    /* renamed from: b */
    private static final C11283r1<Boolean> f26380b;

    /* renamed from: c */
    private static final C11283r1<Boolean> f26381c;

    static {
        C11382y1 y1Var = new C11382y1(C11298s1.m36065a("com.google.android.gms.measurement"));
        f26379a = y1Var.mo29191a("measurement.service.sessions.remove_disabled_session_number", false);
        f26380b = y1Var.mo29191a("measurement.service.sessions.session_number_enabled", false);
        f26381c = y1Var.mo29191a("measurement.service.sessions.session_number_backfill_enabled", false);
        y1Var.mo29189a("measurement.id.session_number", 0);
    }

    /* renamed from: a */
    public final boolean mo28615a() {
        return ((Boolean) f26381c.mo28863a()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo28616b() {
        return ((Boolean) f26379a.mo28863a()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo28617c() {
        return ((Boolean) f26380b.mo28863a()).booleanValue();
    }
}
