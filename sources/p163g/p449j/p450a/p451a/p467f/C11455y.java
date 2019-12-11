package p163g.p449j.p450a.p451a.p467f;

import java.util.concurrent.CancellationException;

/* renamed from: g.j.a.a.f.y */
final class C11455y implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ C11454x f26810U;

    /* renamed from: c */
    private final /* synthetic */ C11435h f26811c;

    C11455y(C11454x xVar, C11435h hVar) {
        this.f26810U = xVar;
        this.f26811c = hVar;
    }

    public final void run() {
        try {
            C11435h a = this.f26810U.f26808b.mo27319a(this.f26811c.mo29263b());
            if (a == null) {
                this.f26810U.mo15690a((Exception) new NullPointerException("Continuation returned null"));
                return;
            }
            a.mo29256a(C11437j.f26775b, (C11432e<? super TResult>) this.f26810U);
            a.mo29255a(C11437j.f26775b, (C11430d) this.f26810U);
            a.mo29253a(C11437j.f26775b, (C11426b) this.f26810U);
        } catch (C11433f e) {
            if (e.getCause() instanceof Exception) {
                this.f26810U.mo15690a((Exception) e.getCause());
            } else {
                this.f26810U.mo15690a((Exception) e);
            }
        } catch (CancellationException unused) {
            this.f26810U.mo29246a();
        } catch (Exception e2) {
            this.f26810U.mo15690a(e2);
        }
    }
}
