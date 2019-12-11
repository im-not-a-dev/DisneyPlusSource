package p163g.p164a.p165a;

/* renamed from: g.a.a.q0 */
/* compiled from: MobileIdentities */
class C4749q0 {

    /* renamed from: g.a.a.q0$a */
    /* compiled from: MobileIdentities */
    static class C4750a implements Runnable {
        C4750a() {
        }

        public void run() {
            C4749q0.m16526d();
            C4696l.m16364f();
            C4693k.m16341a();
            C4749q0.m16527e();
            C4787z0.m16668a();
            C4673f1.m16289k().mo16015g();
        }
    }

    /* renamed from: g.a.a.q0$b */
    /* compiled from: MobileIdentities */
    static class C4751b implements Runnable {
        C4751b() {
        }

        public void run() {
            C4783y0.m16612J();
            C4783y0.m16615M();
        }
    }

    /* renamed from: g.a.a.q0$c */
    /* compiled from: MobileIdentities */
    static class C4752c implements Runnable {
        C4752c() {
        }

        public void run() {
            C4783y0.m16613K();
            C4783y0.m16614L();
        }
    }

    /* renamed from: c */
    static void m16525c() {
        C4783y0.m16630a("Config - Privacy status set to opt out, purging all Adobe SDK identities from device.", new Object[0]);
        C4696l.m16361e();
        C4783y0.m16650j().execute(new C4750a());
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m16526d() {
        C4783y0.m16642d().execute(new C4751b());
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static void m16527e() {
        C4783y0.m16642d().execute(new C4752c());
    }
}
