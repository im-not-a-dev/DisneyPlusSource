package p163g.p449j.p450a.p451a.p467f;

/* renamed from: g.j.a.a.f.o */
final class C11445o implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ C11444n f26786U;

    /* renamed from: c */
    private final /* synthetic */ C11435h f26787c;

    C11445o(C11444n nVar, C11435h hVar) {
        this.f26786U = nVar;
        this.f26787c = hVar;
    }

    public final void run() {
        try {
            C11435h hVar = (C11435h) this.f26786U.f26784b.mo25466a(this.f26787c);
            if (hVar == null) {
                this.f26786U.mo15690a((Exception) new NullPointerException("Continuation returned null"));
                return;
            }
            hVar.mo29256a(C11437j.f26775b, (C11432e<? super TResult>) this.f26786U);
            hVar.mo29255a(C11437j.f26775b, (C11430d) this.f26786U);
            hVar.mo29253a(C11437j.f26775b, (C11426b) this.f26786U);
        } catch (C11433f e) {
            if (e.getCause() instanceof Exception) {
                this.f26786U.f26785c.mo29260a((Exception) e.getCause());
            } else {
                this.f26786U.f26785c.mo29260a((Exception) e);
            }
        } catch (Exception e2) {
            this.f26786U.f26785c.mo29260a(e2);
        }
    }
}
