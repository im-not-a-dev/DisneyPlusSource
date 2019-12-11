package p520io.reactivex.p531y.p536e.p537a;

import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11914c;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableEmitter;
import p520io.reactivex.CompletableObserver;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11950f;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12008a;
import p520io.reactivex.p531y.p532a.C12010c;

/* renamed from: io.reactivex.y.e.a.c */
/* compiled from: CompletableCreate */
public final class C12068c extends Completable {

    /* renamed from: c */
    final C11914c f27793c;

    /* renamed from: io.reactivex.y.e.a.c$a */
    /* compiled from: CompletableCreate */
    static final class C12069a extends AtomicReference<Disposable> implements CompletableEmitter, Disposable {

        /* renamed from: c */
        final CompletableObserver f27794c;

        C12069a(CompletableObserver completableObserver) {
            this.f27794c = completableObserver;
        }

        /* renamed from: a */
        public boolean mo30379a(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            Object obj = get();
            C12010c cVar = C12010c.DISPOSED;
            if (obj != cVar) {
                Disposable disposable = (Disposable) getAndSet(cVar);
                if (disposable != C12010c.DISPOSED) {
                    try {
                        this.f27794c.onError(th);
                        return true;
                    } finally {
                        if (disposable != null) {
                            disposable.dispose();
                        }
                    }
                }
            }
            return false;
        }

        public void dispose() {
            C12010c.m38621a((AtomicReference<Disposable>) this);
        }

        public boolean isDisposed() {
            return C12010c.m38619a((Disposable) get());
        }

        public void onComplete() {
            Object obj = get();
            C12010c cVar = C12010c.DISPOSED;
            if (obj != cVar) {
                Disposable disposable = (Disposable) getAndSet(cVar);
                if (disposable != C12010c.DISPOSED) {
                    try {
                        this.f27794c.onComplete();
                    } finally {
                        if (disposable != null) {
                            disposable.dispose();
                        }
                    }
                }
            }
        }

        public void onError(Throwable th) {
            if (!mo30379a(th)) {
                C11915a.m38466b(th);
            }
        }

        public String toString() {
            return String.format("%s{%s}", new Object[]{C12069a.class.getSimpleName(), super.toString()});
        }

        /* renamed from: a */
        public void mo30378a(Disposable disposable) {
            C12010c.m38623b(this, disposable);
        }

        /* renamed from: a */
        public void mo30057a(C11950f fVar) {
            mo30378a((Disposable) new C12008a(fVar));
        }
    }

    public C12068c(C11914c cVar) {
        this.f27793c = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29934a(CompletableObserver completableObserver) {
        C12069a aVar = new C12069a(completableObserver);
        completableObserver.onSubscribe(aVar);
        try {
            this.f27793c.subscribe(aVar);
        } catch (Throwable th) {
            C12003b.m38614b(th);
            aVar.onError(th);
        }
    }
}
