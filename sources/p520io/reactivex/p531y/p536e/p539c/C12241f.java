package p520io.reactivex.p531y.p536e.p539c;

import java.util.concurrent.atomic.AtomicInteger;
import p520io.reactivex.C11958l;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12010c;

/* renamed from: io.reactivex.y.e.c.f */
/* compiled from: MaybeDoFinally */
public final class C12241f<T> extends C12221a<T, T> {

    /* renamed from: U */
    final C11945a f28272U;

    /* renamed from: io.reactivex.y.e.c.f$a */
    /* compiled from: MaybeDoFinally */
    static final class C12242a<T> extends AtomicInteger implements C11958l<T>, Disposable {

        /* renamed from: U */
        final C11945a f28273U;

        /* renamed from: V */
        Disposable f28274V;

        /* renamed from: c */
        final C11958l<? super T> f28275c;

        C12242a(C11958l<? super T> lVar, C11945a aVar) {
            this.f28275c = lVar;
            this.f28273U = aVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30470a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f28273U.run();
                } catch (Throwable th) {
                    C12003b.m38614b(th);
                    C11915a.m38466b(th);
                }
            }
        }

        public void dispose() {
            this.f28274V.dispose();
            mo30470a();
        }

        public boolean isDisposed() {
            return this.f28274V.isDisposed();
        }

        public void onComplete() {
            this.f28275c.onComplete();
            mo30470a();
        }

        public void onError(Throwable th) {
            this.f28275c.onError(th);
            mo30470a();
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38620a(this.f28274V, disposable)) {
                this.f28274V = disposable;
                this.f28275c.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            this.f28275c.onSuccess(t);
            mo30470a();
        }
    }

    public C12241f(MaybeSource<T> maybeSource, C11945a aVar) {
        super(maybeSource);
        this.f28272U = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo29936b(C11958l<? super T> lVar) {
        this.f28234c.mo30113a(new C12242a(lVar, this.f28272U));
    }
}
