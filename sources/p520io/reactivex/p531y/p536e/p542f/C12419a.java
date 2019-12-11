package p520io.reactivex.p531y.p536e.p542f;

import java.util.concurrent.atomic.AtomicBoolean;
import p520io.reactivex.C11987u;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.CompositeDisposable;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12011d;

/* renamed from: io.reactivex.y.e.f.a */
/* compiled from: SingleAmb */
public final class C12419a<T> extends Single<T> {

    /* renamed from: U */
    private final Iterable<? extends SingleSource<? extends T>> f28763U;

    /* renamed from: c */
    private final SingleSource<? extends T>[] f28764c;

    /* renamed from: io.reactivex.y.e.f.a$a */
    /* compiled from: SingleAmb */
    static final class C12420a<T> implements C11987u<T> {

        /* renamed from: U */
        final C11987u<? super T> f28765U;

        /* renamed from: V */
        final AtomicBoolean f28766V;

        /* renamed from: W */
        Disposable f28767W;

        /* renamed from: c */
        final CompositeDisposable f28768c;

        C12420a(C11987u<? super T> uVar, CompositeDisposable compositeDisposable, AtomicBoolean atomicBoolean) {
            this.f28765U = uVar;
            this.f28768c = compositeDisposable;
            this.f28766V = atomicBoolean;
        }

        public void onError(Throwable th) {
            if (this.f28766V.compareAndSet(false, true)) {
                this.f28768c.mo30251c(this.f28767W);
                this.f28768c.dispose();
                this.f28765U.onError(th);
                return;
            }
            C11915a.m38466b(th);
        }

        public void onSubscribe(Disposable disposable) {
            this.f28767W = disposable;
            this.f28768c.mo30250b(disposable);
        }

        public void onSuccess(T t) {
            if (this.f28766V.compareAndSet(false, true)) {
                this.f28768c.mo30251c(this.f28767W);
                this.f28768c.dispose();
                this.f28765U.onSuccess(t);
            }
        }
    }

    public C12419a(SingleSource<? extends T>[] singleSourceArr, Iterable<? extends SingleSource<? extends T>> iterable) {
        this.f28764c = singleSourceArr;
        this.f28763U = iterable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17771b(C11987u<? super T> uVar) {
        int i;
        SingleSource<? extends T>[] singleSourceArr = this.f28764c;
        String str = "One of the sources is null";
        if (singleSourceArr == null) {
            singleSourceArr = new SingleSource[8];
            try {
                i = 0;
                for (SingleSource<? extends T> singleSource : this.f28763U) {
                    if (singleSource == null) {
                        C12011d.m38632a((Throwable) new NullPointerException(str), uVar);
                        return;
                    }
                    if (i == singleSourceArr.length) {
                        SingleSource<? extends T>[] singleSourceArr2 = new SingleSource[((i >> 2) + i)];
                        System.arraycopy(singleSourceArr, 0, singleSourceArr2, 0, i);
                        singleSourceArr = singleSourceArr2;
                    }
                    int i2 = i + 1;
                    singleSourceArr[i] = singleSource;
                    i = i2;
                }
            } catch (Throwable th) {
                C12003b.m38614b(th);
                C12011d.m38632a(th, uVar);
                return;
            }
        } else {
            i = singleSourceArr.length;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        uVar.onSubscribe(compositeDisposable);
        int i3 = 0;
        while (i3 < i) {
            SingleSource<? extends T> singleSource2 = singleSourceArr[i3];
            if (!compositeDisposable.isDisposed()) {
                if (singleSource2 == null) {
                    compositeDisposable.dispose();
                    NullPointerException nullPointerException = new NullPointerException(str);
                    if (atomicBoolean.compareAndSet(false, true)) {
                        uVar.onError(nullPointerException);
                    } else {
                        C11915a.m38466b((Throwable) nullPointerException);
                    }
                    return;
                }
                singleSource2.mo30216a(new C12420a(uVar, compositeDisposable, atomicBoolean));
                i3++;
            } else {
                return;
            }
        }
    }
}
