package p163g.p449j.p450a.p451a.p467f;

/* renamed from: g.j.a.a.f.w */
final class C11453w implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ C11452v f26805U;

    /* renamed from: c */
    private final /* synthetic */ C11435h f26806c;

    C11453w(C11452v vVar, C11435h hVar) {
        this.f26805U = vVar;
        this.f26806c = hVar;
    }

    public final void run() {
        synchronized (this.f26805U.f26803b) {
            if (this.f26805U.f26804c != null) {
                this.f26805U.f26804c.onSuccess(this.f26806c.mo29263b());
            }
        }
    }
}
