package p520io.reactivex.p531y.p532a;

import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11950f;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12003b;

/* renamed from: io.reactivex.y.a.a */
/* compiled from: CancellableDisposable */
public final class C12008a extends AtomicReference<C11950f> implements Disposable {
    public C12008a(C11950f fVar) {
        super(fVar);
    }

    public void dispose() {
        if (get() != null) {
            C11950f fVar = (C11950f) getAndSet(null);
            if (fVar != null) {
                try {
                    fVar.cancel();
                } catch (Exception e) {
                    C12003b.m38614b(e);
                    C11915a.m38466b((Throwable) e);
                }
            }
        }
    }

    public boolean isDisposed() {
        return get() == null;
    }
}
