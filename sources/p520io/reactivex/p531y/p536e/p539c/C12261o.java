package p520io.reactivex.p531y.p536e.p539c;

import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11958l;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p533b.C12036b;

/* renamed from: io.reactivex.y.e.c.o */
/* compiled from: MaybeFlatten */
public final class C12261o<T, R> extends C12221a<T, R> {

    /* renamed from: U */
    final Function<? super T, ? extends MaybeSource<? extends R>> f28312U;

    /* renamed from: io.reactivex.y.e.c.o$a */
    /* compiled from: MaybeFlatten */
    static final class C12262a<T, R> extends AtomicReference<Disposable> implements C11958l<T>, Disposable {

        /* renamed from: U */
        final Function<? super T, ? extends MaybeSource<? extends R>> f28313U;

        /* renamed from: V */
        Disposable f28314V;

        /* renamed from: c */
        final C11958l<? super R> f28315c;

        /* renamed from: io.reactivex.y.e.c.o$a$a */
        /* compiled from: MaybeFlatten */
        final class C12263a implements C11958l<R> {
            C12263a() {
            }

            public void onComplete() {
                C12262a.this.f28315c.onComplete();
            }

            public void onError(Throwable th) {
                C12262a.this.f28315c.onError(th);
            }

            public void onSubscribe(Disposable disposable) {
                C12010c.m38624c(C12262a.this, disposable);
            }

            public void onSuccess(R r) {
                C12262a.this.f28315c.onSuccess(r);
            }
        }

        C12262a(C11958l<? super R> lVar, Function<? super T, ? extends MaybeSource<? extends R>> function) {
            this.f28315c = lVar;
            this.f28313U = function;
        }

        public void dispose() {
            C12010c.m38621a((AtomicReference<Disposable>) this);
            this.f28314V.dispose();
        }

        public boolean isDisposed() {
            return C12010c.m38619a((Disposable) get());
        }

        public void onComplete() {
            this.f28315c.onComplete();
        }

        public void onError(Throwable th) {
            this.f28315c.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38620a(this.f28314V, disposable)) {
                this.f28314V = disposable;
                this.f28315c.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            try {
                Object apply = this.f28313U.apply(t);
                C12036b.m38663a(apply, "The mapper returned a null MaybeSource");
                MaybeSource maybeSource = (MaybeSource) apply;
                if (!isDisposed()) {
                    maybeSource.mo30113a(new C12263a());
                }
            } catch (Exception e) {
                C12003b.m38614b(e);
                this.f28315c.onError(e);
            }
        }
    }

    public C12261o(MaybeSource<T> maybeSource, Function<? super T, ? extends MaybeSource<? extends R>> function) {
        super(maybeSource);
        this.f28312U = function;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo29936b(C11958l<? super R> lVar) {
        this.f28234c.mo30113a(new C12262a(lVar, this.f28312U));
    }
}
