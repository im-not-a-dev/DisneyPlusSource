package p520io.reactivex.p531y.p536e.p541e;

import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11968q;
import p520io.reactivex.C11969r;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p531y.p532a.C12010c;

/* renamed from: io.reactivex.y.e.e.u0 */
/* compiled from: ObservableSubscribeOn */
public final class C12396u0<T> extends C12294a<T, T> {

    /* renamed from: U */
    final C11969r f28694U;

    /* renamed from: io.reactivex.y.e.e.u0$a */
    /* compiled from: ObservableSubscribeOn */
    static final class C12397a<T> extends AtomicReference<Disposable> implements C11968q<T>, Disposable {

        /* renamed from: U */
        final AtomicReference<Disposable> f28695U = new AtomicReference<>();

        /* renamed from: c */
        final C11968q<? super T> f28696c;

        C12397a(C11968q<? super T> qVar) {
            this.f28696c = qVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30552a(Disposable disposable) {
            C12010c.m38624c(this, disposable);
        }

        public void dispose() {
            C12010c.m38621a(this.f28695U);
            C12010c.m38621a((AtomicReference<Disposable>) this);
        }

        public boolean isDisposed() {
            return C12010c.m38619a((Disposable) get());
        }

        public void onComplete() {
            this.f28696c.onComplete();
        }

        public void onError(Throwable th) {
            this.f28696c.onError(th);
        }

        public void onNext(T t) {
            this.f28696c.onNext(t);
        }

        public void onSubscribe(Disposable disposable) {
            C12010c.m38624c(this.f28695U, disposable);
        }
    }

    /* renamed from: io.reactivex.y.e.e.u0$b */
    /* compiled from: ObservableSubscribeOn */
    final class C12398b implements Runnable {

        /* renamed from: c */
        private final C12397a<T> f28698c;

        C12398b(C12397a<T> aVar) {
            this.f28698c = aVar;
        }

        public void run() {
            C12396u0.this.f28379c.mo30162a(this.f28698c);
        }
    }

    public C12396u0(ObservableSource<T> observableSource, C11969r rVar) {
        super(observableSource);
        this.f28694U = rVar;
    }

    /* renamed from: b */
    public void mo27408b(C11968q<? super T> qVar) {
        C12397a aVar = new C12397a(qVar);
        qVar.onSubscribe(aVar);
        aVar.mo30552a(this.f28694U.mo30289a(new C12398b(aVar)));
    }
}
