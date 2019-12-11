package p163g.p449j.p450a.p451a.p457d.p464g;

/* renamed from: g.j.a.a.d.g.ob */
public final class C11251ob implements C11265pb {

    /* renamed from: a */
    private static final C11283r1<Boolean> f26418a;

    /* renamed from: b */
    private static final C11283r1<Boolean> f26419b;

    /* renamed from: c */
    private static final C11283r1<Boolean> f26420c;

    /* renamed from: d */
    private static final C11283r1<Boolean> f26421d;

    static {
        C11382y1 y1Var = new C11382y1(C11298s1.m36065a("com.google.android.gms.measurement"));
        f26418a = y1Var.mo29191a("measurement.client.sessions.background_sessions_enabled", true);
        f26419b = y1Var.mo29191a("measurement.client.sessions.immediate_start_enabled_foreground", false);
        y1Var.mo29191a("measurement.client.sessions.immediate_start_enabled", false);
        f26420c = y1Var.mo29191a("measurement.client.sessions.remove_expired_session_properties_enabled", true);
        f26421d = y1Var.mo29191a("measurement.client.sessions.session_id_enabled", true);
        y1Var.mo29189a("measurement.id.sessionization_client", 0);
    }

    /* renamed from: a */
    public final boolean mo28793a() {
        return ((Boolean) f26418a.mo28863a()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo28794b() {
        return ((Boolean) f26419b.mo28863a()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo28795c() {
        return ((Boolean) f26420c.mo28863a()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo28796d() {
        return ((Boolean) f26421d.mo28863a()).booleanValue();
    }
}
