package p163g.p164a.p165a;

/* renamed from: g.a.a.t0 */
/* compiled from: PiiQueue */
final class C4766t0 extends C4660c1 {

    /* renamed from: s */
    private static C4766t0 f11856s;

    /* renamed from: t */
    private static final Object f11857t = new Object();

    protected C4766t0() {
    }

    /* renamed from: o */
    protected static C4766t0 m16544o() {
        C4766t0 t0Var;
        synchronized (f11857t) {
            if (f11856s == null) {
                f11856s = new C4766t0();
            }
            t0Var = f11856s;
        }
        return t0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public String mo15995k() {
        return "ADBMobilePIICache.sqlite";
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C4660c1 mo15996l() {
        return m16544o();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public String mo15997m() {
        return "PII";
    }
}
