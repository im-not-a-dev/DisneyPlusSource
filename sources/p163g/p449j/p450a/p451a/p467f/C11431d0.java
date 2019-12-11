package p163g.p449j.p450a.p451a.p467f;

import java.util.concurrent.Callable;

/* renamed from: g.j.a.a.f.d0 */
final class C11431d0 implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ Callable f26771U;

    /* renamed from: c */
    private final /* synthetic */ C11429c0 f26772c;

    C11431d0(C11429c0 c0Var, Callable callable) {
        this.f26772c = c0Var;
        this.f26771U = callable;
    }

    public final void run() {
        try {
            this.f26772c.mo29261a(this.f26771U.call());
        } catch (Exception e) {
            this.f26772c.mo29260a(e);
        }
    }
}
