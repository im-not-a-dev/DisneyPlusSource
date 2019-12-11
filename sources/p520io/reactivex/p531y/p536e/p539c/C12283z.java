package p520io.reactivex.p531y.p536e.p539c;

import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11958l;
import p520io.reactivex.C11969r;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p532a.C12014g;

/* renamed from: io.reactivex.y.e.c.z */
/* compiled from: MaybeSubscribeOn */
public final class C12283z<T> extends C12221a<T, T> {

    /* renamed from: U */
    final C11969r f28356U;

    /* renamed from: io.reactivex.y.e.c.z$a */
    /* compiled from: MaybeSubscribeOn */
    static final class C12284a<T> extends AtomicReference<Disposable> implements C11958l<T>, Disposable {

        /* renamed from: U */
        final C11958l<? super T> f28357U;

        /* renamed from: c */
        final C12014g f28358c = new C12014g();

        C12284a(C11958l<? super T> lVar) {
            this.f28357U = lVar;
        }

        public void dispose() {
            C12010c.m38621a((AtomicReference<Disposable>) this);
            this.f28358c.dispose();
        }

        public boolean isDisposed() {
            return C12010c.m38619a((Disposable) get());
        }

        public void onComplete() {
            this.f28357U.onComplete();
        }

        public void onError(Throwable th) {
            this.f28357U.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            C12010c.m38624c(this, disposable);
        }

        public void onSuccess(T t) {
            this.f28357U.onSuccess(t);
        }
    }

    /* renamed from: io.reactivex.y.e.c.z$b */
    /* compiled from: MaybeSubscribeOn */
    static final class C12285b<T> implements Runnable {

        /* renamed from: U */
        final MaybeSource<T> f28359U;

        /* renamed from: c */
        final C11958l<? super T> f28360c;

        C12285b(C11958l<? super T> lVar, MaybeSource<T> maybeSource) {
            this.f28360c = lVar;
            this.f28359U = maybeSource;
        }

        public void run() {
            this.f28359U.mo30113a(this.f28360c);
        }
    }

    public C12283z(MaybeSource<T> maybeSource, C11969r rVar) {
        super(maybeSource);
        this.f28356U = rVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo29936b(C11958l<? super T> lVar) {
        C12284a aVar = new C12284a(lVar);
        lVar.onSubscribe(aVar);
        aVar.f28358c.mo30345a(this.f28356U.mo30289a(new C12285b(aVar, this.f28234c)));
    }
}
