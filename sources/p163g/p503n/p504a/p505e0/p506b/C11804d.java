package p163g.p503n.p504a.p505e0.p506b;

import java.util.concurrent.atomic.AtomicBoolean;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p527w.p529c.C11992a;

/* renamed from: g.n.a.e0.b.d */
/* compiled from: MainThreadDisposable */
public abstract class C11804d implements Disposable {

    /* renamed from: c */
    private final AtomicBoolean f27445c = new AtomicBoolean();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo27430b();

    public final void dispose() {
        if (!this.f27445c.compareAndSet(false, true)) {
            return;
        }
        if (C11803c.m37948a()) {
            mo27430b();
        } else {
            C11992a.m38600a().mo30289a(new C11802b(this));
        }
    }

    public final boolean isDisposed() {
        return this.f27445c.get();
    }
}
