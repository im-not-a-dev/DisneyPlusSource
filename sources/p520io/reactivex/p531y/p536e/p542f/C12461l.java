package p520io.reactivex.p531y.p536e.p542f;

import p520io.reactivex.C11987u;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12011d;

/* renamed from: io.reactivex.y.e.f.l */
/* compiled from: SingleDoOnSubscribe */
public final class C12461l<T> extends Single<T> {

    /* renamed from: U */
    final Consumer<? super Disposable> f28858U;

    /* renamed from: c */
    final SingleSource<T> f28859c;

    /* renamed from: io.reactivex.y.e.f.l$a */
    /* compiled from: SingleDoOnSubscribe */
    static final class C12462a<T> implements C11987u<T> {

        /* renamed from: U */
        final Consumer<? super Disposable> f28860U;

        /* renamed from: V */
        boolean f28861V;

        /* renamed from: c */
        final C11987u<? super T> f28862c;

        C12462a(C11987u<? super T> uVar, Consumer<? super Disposable> consumer) {
            this.f28862c = uVar;
            this.f28860U = consumer;
        }

        public void onError(Throwable th) {
            if (this.f28861V) {
                C11915a.m38466b(th);
            } else {
                this.f28862c.onError(th);
            }
        }

        public void onSubscribe(Disposable disposable) {
            try {
                this.f28860U.accept(disposable);
                this.f28862c.onSubscribe(disposable);
            } catch (Throwable th) {
                C12003b.m38614b(th);
                this.f28861V = true;
                disposable.dispose();
                C12011d.m38632a(th, this.f28862c);
            }
        }

        public void onSuccess(T t) {
            if (!this.f28861V) {
                this.f28862c.onSuccess(t);
            }
        }
    }

    public C12461l(SingleSource<T> singleSource, Consumer<? super Disposable> consumer) {
        this.f28859c = singleSource;
        this.f28858U = consumer;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17771b(C11987u<? super T> uVar) {
        this.f28859c.mo30216a(new C12462a(uVar, this.f28858U));
    }
}
