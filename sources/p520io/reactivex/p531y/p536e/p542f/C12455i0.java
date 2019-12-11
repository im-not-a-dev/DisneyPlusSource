package p520io.reactivex.p531y.p536e.p542f;

import java.util.Arrays;
import java.util.NoSuchElementException;
import p520io.reactivex.C11987u;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12011d;
import p520io.reactivex.p531y.p533b.C12036b;

/* renamed from: io.reactivex.y.e.f.i0 */
/* compiled from: SingleZipIterable */
public final class C12455i0<T, R> extends Single<R> {

    /* renamed from: U */
    final Function<? super Object[], ? extends R> f28847U;

    /* renamed from: c */
    final Iterable<? extends SingleSource<? extends T>> f28848c;

    /* renamed from: io.reactivex.y.e.f.i0$a */
    /* compiled from: SingleZipIterable */
    final class C12456a implements Function<T, R> {
        C12456a() {
        }

        public R apply(T t) throws Exception {
            R apply = C12455i0.this.f28847U.apply(new Object[]{t});
            C12036b.m38663a(apply, "The zipper returned a null value");
            return apply;
        }
    }

    public C12455i0(Iterable<? extends SingleSource<? extends T>> iterable, Function<? super Object[], ? extends R> function) {
        this.f28848c = iterable;
        this.f28847U = function;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17771b(C11987u<? super R> uVar) {
        SingleSource[] singleSourceArr = new SingleSource[8];
        try {
            SingleSource[] singleSourceArr2 = singleSourceArr;
            int i = 0;
            for (SingleSource singleSource : this.f28848c) {
                if (singleSource == null) {
                    C12011d.m38632a((Throwable) new NullPointerException("One of the sources is null"), uVar);
                    return;
                }
                if (i == singleSourceArr2.length) {
                    singleSourceArr2 = (SingleSource[]) Arrays.copyOf(singleSourceArr2, (i >> 2) + i);
                }
                int i2 = i + 1;
                singleSourceArr2[i] = singleSource;
                i = i2;
            }
            if (i == 0) {
                C12011d.m38632a((Throwable) new NoSuchElementException(), uVar);
            } else if (i == 1) {
                singleSourceArr2[0].mo30216a(new C12484a(uVar, new C12456a()));
            } else {
                C12451b bVar = new C12451b(uVar, i, this.f28847U);
                uVar.onSubscribe(bVar);
                for (int i3 = 0; i3 < i && !bVar.isDisposed(); i3++) {
                    singleSourceArr2[i3].mo30216a(bVar.f28838V[i3]);
                }
            }
        } catch (Throwable th) {
            C12003b.m38614b(th);
            C12011d.m38632a(th, uVar);
        }
    }
}
