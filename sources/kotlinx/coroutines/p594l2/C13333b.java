package kotlinx.coroutines.p594l2;

import kotlin.C13145v;
import kotlin.p573a0.C12688f;
import kotlinx.coroutines.C13210a;
import kotlinx.coroutines.C13218b0;
import p520io.reactivex.CompletableEmitter;

/* renamed from: kotlinx.coroutines.l2.b */
/* compiled from: RxCompletable.kt */
final class C13333b extends C13210a<C13145v> {

    /* renamed from: W */
    private final CompletableEmitter f29768W;

    public C13333b(C12688f fVar, CompletableEmitter completableEmitter) {
        super(fVar, true);
        this.f29768W = completableEmitter;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo34333e(C13145v vVar) {
        try {
            if (!this.f29768W.isDisposed()) {
                this.f29768W.onComplete();
            }
        } catch (Throwable th) {
            C13218b0.m40651a(mo31038b(), th);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo34328a(Throwable th, boolean z) {
        if (!this.f29768W.isDisposed()) {
            try {
                this.f29768W.onError(th);
            } catch (Throwable th2) {
                C13218b0.m40651a(mo31038b(), th2);
            }
        } else if (!z) {
            C13218b0.m40651a(mo31038b(), th);
        }
    }
}
