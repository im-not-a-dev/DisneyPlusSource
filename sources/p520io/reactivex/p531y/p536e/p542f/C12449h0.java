package p520io.reactivex.p531y.p536e.p542f;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11987u;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p533b.C12036b;

/* renamed from: io.reactivex.y.e.f.h0 */
/* compiled from: SingleZipArray */
public final class C12449h0<T, R> extends Single<R> {

    /* renamed from: U */
    final Function<? super Object[], ? extends R> f28834U;

    /* renamed from: c */
    final SingleSource<? extends T>[] f28835c;

    /* renamed from: io.reactivex.y.e.f.h0$a */
    /* compiled from: SingleZipArray */
    final class C12450a implements Function<T, R> {
        C12450a() {
        }

        public R apply(T t) throws Exception {
            R apply = C12449h0.this.f28834U.apply(new Object[]{t});
            C12036b.m38663a(apply, "The zipper returned a null value");
            return apply;
        }
    }

    /* renamed from: io.reactivex.y.e.f.h0$b */
    /* compiled from: SingleZipArray */
    static final class C12451b<T, R> extends AtomicInteger implements Disposable {

        /* renamed from: U */
        final Function<? super Object[], ? extends R> f28837U;

        /* renamed from: V */
        final C12452c<T>[] f28838V;

        /* renamed from: W */
        final Object[] f28839W;

        /* renamed from: c */
        final C11987u<? super R> f28840c;

        C12451b(C11987u<? super R> uVar, int i, Function<? super Object[], ? extends R> function) {
            super(i);
            this.f28840c = uVar;
            this.f28837U = function;
            C12452c<T>[] cVarArr = new C12452c[i];
            for (int i2 = 0; i2 < i; i2++) {
                cVarArr[i2] = new C12452c<>(this, i2);
            }
            this.f28838V = cVarArr;
            this.f28839W = new Object[i];
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30579a(T t, int i) {
            this.f28839W[i] = t;
            if (decrementAndGet() == 0) {
                try {
                    Object apply = this.f28837U.apply(this.f28839W);
                    C12036b.m38663a(apply, "The zipper returned a null value");
                    this.f28840c.onSuccess(apply);
                } catch (Throwable th) {
                    C12003b.m38614b(th);
                    this.f28840c.onError(th);
                }
            }
        }

        public void dispose() {
            if (getAndSet(0) > 0) {
                for (C12452c<T> a : this.f28838V) {
                    a.mo30581a();
                }
            }
        }

        public boolean isDisposed() {
            return get() <= 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30578a(int i) {
            C12452c<T>[] cVarArr = this.f28838V;
            int length = cVarArr.length;
            for (int i2 = 0; i2 < i; i2++) {
                cVarArr[i2].mo30581a();
            }
            while (true) {
                i++;
                if (i < length) {
                    cVarArr[i].mo30581a();
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30580a(Throwable th, int i) {
            if (getAndSet(0) > 0) {
                mo30578a(i);
                this.f28840c.onError(th);
                return;
            }
            C11915a.m38466b(th);
        }
    }

    /* renamed from: io.reactivex.y.e.f.h0$c */
    /* compiled from: SingleZipArray */
    static final class C12452c<T> extends AtomicReference<Disposable> implements C11987u<T> {

        /* renamed from: U */
        final int f28841U;

        /* renamed from: c */
        final C12451b<T, ?> f28842c;

        C12452c(C12451b<T, ?> bVar, int i) {
            this.f28842c = bVar;
            this.f28841U = i;
        }

        /* renamed from: a */
        public void mo30581a() {
            C12010c.m38621a((AtomicReference<Disposable>) this);
        }

        public void onError(Throwable th) {
            this.f28842c.mo30580a(th, this.f28841U);
        }

        public void onSubscribe(Disposable disposable) {
            C12010c.m38624c(this, disposable);
        }

        public void onSuccess(T t) {
            this.f28842c.mo30579a(t, this.f28841U);
        }
    }

    public C12449h0(SingleSource<? extends T>[] singleSourceArr, Function<? super Object[], ? extends R> function) {
        this.f28835c = singleSourceArr;
        this.f28834U = function;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17771b(C11987u<? super R> uVar) {
        SingleSource<? extends T>[] singleSourceArr = this.f28835c;
        int length = singleSourceArr.length;
        int i = 0;
        if (length == 1) {
            singleSourceArr[0].mo30216a(new C12484a(uVar, new C12450a()));
            return;
        }
        C12451b bVar = new C12451b(uVar, length, this.f28834U);
        uVar.onSubscribe(bVar);
        while (i < length && !bVar.isDisposed()) {
            SingleSource<? extends T> singleSource = singleSourceArr[i];
            if (singleSource == null) {
                bVar.mo30580a((Throwable) new NullPointerException("One of the sources is null"), i);
                return;
            } else {
                singleSource.mo30216a(bVar.f28838V[i]);
                i++;
            }
        }
    }
}
