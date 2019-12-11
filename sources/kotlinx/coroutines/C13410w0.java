package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.C13405v0.C13406a;

/* renamed from: kotlinx.coroutines.w0 */
/* compiled from: EventLoop.kt */
public abstract class C13410w0 extends C13402u0 {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo34628a(long j, C13406a aVar) {
        if (C13292j0.m40863a()) {
            if (!(this != C13330l0.f29765Z)) {
                throw new AssertionError();
            }
        }
        C13330l0.f29765Z.mo34618b(j, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract Thread mo34355j();

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo34629k() {
        Thread j = mo34355j();
        if (Thread.currentThread() != j) {
            C13235e2 a = C13239f2.m40692a();
            if (a != null) {
                a.mo34376a(j);
            } else {
                LockSupport.unpark(j);
            }
        }
    }
}
