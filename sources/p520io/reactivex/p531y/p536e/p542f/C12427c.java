package p520io.reactivex.p531y.p536e.p542f;

import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11986t;
import p520io.reactivex.C11987u;
import p520io.reactivex.C11988v;
import p520io.reactivex.Single;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12010c;

/* renamed from: io.reactivex.y.e.f.c */
/* compiled from: SingleCreate */
public final class C12427c<T> extends Single<T> {

    /* renamed from: c */
    final C11988v<T> f28787c;

    /* renamed from: io.reactivex.y.e.f.c$a */
    /* compiled from: SingleCreate */
    static final class C12428a<T> extends AtomicReference<Disposable> implements C11986t<T>, Disposable {

        /* renamed from: c */
        final C11987u<? super T> f28788c;

        C12428a(C11987u<? super T> uVar) {
            this.f28788c = uVar;
        }

        /* renamed from: a */
        public boolean mo30571a(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            Object obj = get();
            C12010c cVar = C12010c.DISPOSED;
            if (obj != cVar) {
                Disposable disposable = (Disposable) getAndSet(cVar);
                if (disposable != C12010c.DISPOSED) {
                    try {
                        this.f28788c.onError(th);
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

        public void onError(Throwable th) {
            if (!mo30571a(th)) {
                C11915a.m38466b(th);
            }
        }

        public void onSuccess(T t) {
            Object obj = get();
            C12010c cVar = C12010c.DISPOSED;
            if (obj != cVar) {
                Disposable disposable = (Disposable) getAndSet(cVar);
                if (disposable != C12010c.DISPOSED) {
                    if (t == null) {
                        try {
                            this.f28788c.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                        } catch (Throwable th) {
                            if (disposable != null) {
                                disposable.dispose();
                            }
                            throw th;
                        }
                    } else {
                        this.f28788c.onSuccess(t);
                    }
                    if (disposable != null) {
                        disposable.dispose();
                    }
                }
            }
        }

        public String toString() {
            return String.format("%s{%s}", new Object[]{C12428a.class.getSimpleName(), super.toString()});
        }
    }

    public C12427c(C11988v<T> vVar) {
        this.f28787c = vVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17771b(C11987u<? super T> uVar) {
        C12428a aVar = new C12428a(uVar);
        uVar.onSubscribe(aVar);
        try {
            this.f28787c.mo7288a(aVar);
        } catch (Throwable th) {
            C12003b.m38614b(th);
            aVar.onError(th);
        }
    }
}
