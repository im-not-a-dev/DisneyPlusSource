package kotlinx.coroutines;

import kotlinx.coroutines.internal.C13253a;

/* renamed from: kotlinx.coroutines.u0 */
/* compiled from: EventLoop.common.kt */
public abstract class C13402u0 extends C13418z {

    /* renamed from: U */
    private boolean f29901U;

    /* renamed from: V */
    private C13253a<C13387q0<?>> f29902V;

    /* renamed from: c */
    private long f29903c;

    /* renamed from: c */
    private final long m41228c(boolean z) {
        return z ? 4294967296L : 1;
    }

    /* renamed from: a */
    public final void mo34609a(C13387q0<?> q0Var) {
        C13253a<C13387q0<?>> aVar = this.f29902V;
        if (aVar == null) {
            aVar = new C13253a<>();
            this.f29902V = aVar;
        }
        aVar.mo34403a(q0Var);
    }

    /* renamed from: b */
    public final void mo34611b(boolean z) {
        this.f29903c += m41228c(z);
        if (!z) {
            this.f29901U = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public long mo34612f() {
        C13253a<C13387q0<?>> aVar = this.f29902V;
        if (aVar == null || aVar.mo34404a()) {
            return Long.MAX_VALUE;
        }
        return 0;
    }

    /* renamed from: g */
    public final boolean mo34613g() {
        return this.f29903c >= m41228c(true);
    }

    /* renamed from: h */
    public final boolean mo34614h() {
        C13253a<C13387q0<?>> aVar = this.f29902V;
        if (aVar != null) {
            return aVar.mo34404a();
        }
        return true;
    }

    /* renamed from: i */
    public final boolean mo34615i() {
        C13253a<C13387q0<?>> aVar = this.f29902V;
        if (aVar != null) {
            C13387q0 q0Var = (C13387q0) aVar.mo34405b();
            if (q0Var != null) {
                q0Var.run();
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void shutdown() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m41227a(C13402u0 u0Var, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            u0Var.mo34611b(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
    }

    /* renamed from: a */
    public final void mo34610a(boolean z) {
        this.f29903c -= m41228c(z);
        if (this.f29903c <= 0) {
            if (C13292j0.m40863a()) {
                if (!(this.f29903c == 0)) {
                    throw new AssertionError();
                }
            }
            if (this.f29901U) {
                shutdown();
            }
        }
    }
}
