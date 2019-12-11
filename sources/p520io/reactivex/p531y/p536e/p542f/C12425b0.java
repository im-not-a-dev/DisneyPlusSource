package p520io.reactivex.p531y.p536e.p542f;

import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11987u;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p530x.C11998a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p533b.C12036b;
import p520io.reactivex.p531y.p535d.C12062k;

/* renamed from: io.reactivex.y.e.f.b0 */
/* compiled from: SingleResumeNext */
public final class C12425b0<T> extends Single<T> {

    /* renamed from: U */
    final Function<? super Throwable, ? extends SingleSource<? extends T>> f28783U;

    /* renamed from: c */
    final SingleSource<? extends T> f28784c;

    /* renamed from: io.reactivex.y.e.f.b0$a */
    /* compiled from: SingleResumeNext */
    static final class C12426a<T> extends AtomicReference<Disposable> implements C11987u<T>, Disposable {

        /* renamed from: U */
        final Function<? super Throwable, ? extends SingleSource<? extends T>> f28785U;

        /* renamed from: c */
        final C11987u<? super T> f28786c;

        C12426a(C11987u<? super T> uVar, Function<? super Throwable, ? extends SingleSource<? extends T>> function) {
            this.f28786c = uVar;
            this.f28785U = function;
        }

        public void dispose() {
            C12010c.m38621a((AtomicReference<Disposable>) this);
        }

        public boolean isDisposed() {
            return C12010c.m38619a((Disposable) get());
        }

        public void onError(Throwable th) {
            try {
                ((SingleSource) C12036b.m38663a(this.f28785U.apply(th), "The nextFunction returned a null SingleSource.")).mo30216a(new C12062k(this, this.f28786c));
            } catch (Throwable th2) {
                C12003b.m38614b(th2);
                this.f28786c.onError(new C11998a(th, th2));
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38624c(this, disposable)) {
                this.f28786c.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            this.f28786c.onSuccess(t);
        }
    }

    public C12425b0(SingleSource<? extends T> singleSource, Function<? super Throwable, ? extends SingleSource<? extends T>> function) {
        this.f28784c = singleSource;
        this.f28783U = function;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17771b(C11987u<? super T> uVar) {
        this.f28784c.mo30216a(new C12426a(uVar, this.f28783U));
    }
}
