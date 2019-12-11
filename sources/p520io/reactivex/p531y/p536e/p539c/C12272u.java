package p520io.reactivex.p531y.p536e.p539c;

import p520io.reactivex.C11958l;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p533b.C12036b;

/* renamed from: io.reactivex.y.e.c.u */
/* compiled from: MaybeMap */
public final class C12272u<T, R> extends C12221a<T, R> {

    /* renamed from: U */
    final Function<? super T, ? extends R> f28327U;

    /* renamed from: io.reactivex.y.e.c.u$a */
    /* compiled from: MaybeMap */
    static final class C12273a<T, R> implements C11958l<T>, Disposable {

        /* renamed from: U */
        final Function<? super T, ? extends R> f28328U;

        /* renamed from: V */
        Disposable f28329V;

        /* renamed from: c */
        final C11958l<? super R> f28330c;

        C12273a(C11958l<? super R> lVar, Function<? super T, ? extends R> function) {
            this.f28330c = lVar;
            this.f28328U = function;
        }

        public void dispose() {
            Disposable disposable = this.f28329V;
            this.f28329V = C12010c.DISPOSED;
            disposable.dispose();
        }

        public boolean isDisposed() {
            return this.f28329V.isDisposed();
        }

        public void onComplete() {
            this.f28330c.onComplete();
        }

        public void onError(Throwable th) {
            this.f28330c.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38620a(this.f28329V, disposable)) {
                this.f28329V = disposable;
                this.f28330c.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            try {
                Object apply = this.f28328U.apply(t);
                C12036b.m38663a(apply, "The mapper returned a null item");
                this.f28330c.onSuccess(apply);
            } catch (Throwable th) {
                C12003b.m38614b(th);
                this.f28330c.onError(th);
            }
        }
    }

    public C12272u(MaybeSource<T> maybeSource, Function<? super T, ? extends R> function) {
        super(maybeSource);
        this.f28327U = function;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo29936b(C11958l<? super R> lVar) {
        this.f28234c.mo30113a(new C12273a(lVar, this.f28327U));
    }
}
