package p163g.p503n.p504a;

import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.disposables.Disposable;

/* renamed from: g.n.a.d */
/* compiled from: AutoDisposableHelper */
enum C11791d implements Disposable {
    DISPOSED;

    /* renamed from: a */
    static boolean m37928a(AtomicReference<Disposable> atomicReference) {
        Disposable disposable = (Disposable) atomicReference.get();
        C11791d dVar = DISPOSED;
        if (disposable != dVar) {
            Disposable disposable2 = (Disposable) atomicReference.getAndSet(dVar);
            if (disposable2 != dVar) {
                if (disposable2 != null) {
                    disposable2.dispose();
                }
                return true;
            }
        }
        return false;
    }

    public void dispose() {
    }

    public boolean isDisposed() {
        return true;
    }
}
