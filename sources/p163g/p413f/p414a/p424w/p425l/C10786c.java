package p163g.p413f.p414a.p424w.p425l;

/* renamed from: g.f.a.w.l.c */
/* compiled from: StateVerifier */
public abstract class C10786c {

    /* renamed from: g.f.a.w.l.c$b */
    /* compiled from: StateVerifier */
    private static class C10788b extends C10786c {

        /* renamed from: a */
        private volatile boolean f25495a;

        C10788b() {
            super();
        }

        /* renamed from: a */
        public void mo27821a() {
            if (this.f25495a) {
                throw new IllegalStateException("Already released");
            }
        }

        /* renamed from: a */
        public void mo27822a(boolean z) {
            this.f25495a = z;
        }
    }

    /* renamed from: b */
    public static C10786c m34054b() {
        return new C10788b();
    }

    /* renamed from: a */
    public abstract void mo27821a();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo27822a(boolean z);

    private C10786c() {
    }
}
