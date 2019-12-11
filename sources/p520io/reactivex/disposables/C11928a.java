package p520io.reactivex.disposables;

import p520io.reactivex.functions.C11945a;
import p520io.reactivex.p531y.p547j.C12548h;

/* renamed from: io.reactivex.disposables.a */
/* compiled from: ActionDisposable */
final class C11928a extends C11930c<C11945a> {
    C11928a(C11945a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo30253a(C11945a aVar) {
        try {
            aVar.run();
        } catch (Throwable th) {
            throw C12548h.m39353b(th);
        }
    }
}
