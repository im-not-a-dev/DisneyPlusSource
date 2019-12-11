package p163g.p449j.p450a.p451a.p467f;

/* renamed from: g.j.a.a.f.m */
final class C11443m implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ C11442l f26781U;

    /* renamed from: c */
    private final /* synthetic */ C11435h f26782c;

    C11443m(C11442l lVar, C11435h hVar) {
        this.f26781U = lVar;
        this.f26782c = hVar;
    }

    public final void run() {
        if (this.f26782c.mo29266c()) {
            this.f26781U.f26780c.mo29269f();
            return;
        }
        try {
            this.f26781U.f26780c.mo29261a(this.f26781U.f26779b.mo25466a(this.f26782c));
        } catch (C11433f e) {
            if (e.getCause() instanceof Exception) {
                this.f26781U.f26780c.mo29260a((Exception) e.getCause());
            } else {
                this.f26781U.f26780c.mo29260a((Exception) e);
            }
        } catch (Exception e2) {
            this.f26781U.f26780c.mo29260a(e2);
        }
    }
}
