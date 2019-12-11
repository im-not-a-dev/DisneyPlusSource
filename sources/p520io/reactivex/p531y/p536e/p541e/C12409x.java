package p520io.reactivex.p531y.p536e.p541e;

import java.util.concurrent.Callable;
import p520io.reactivex.C11968q;
import p520io.reactivex.Observable;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p533b.C12036b;
import p520io.reactivex.p531y.p535d.C12058g;

/* renamed from: io.reactivex.y.e.e.x */
/* compiled from: ObservableFromCallable */
public final class C12409x<T> extends Observable<T> implements Callable<T> {

    /* renamed from: c */
    final Callable<? extends T> f28741c;

    public C12409x(Callable<? extends T> callable) {
        this.f28741c = callable;
    }

    /* renamed from: b */
    public void mo27408b(C11968q<? super T> qVar) {
        C12058g gVar = new C12058g(qVar);
        qVar.onSubscribe(gVar);
        if (!gVar.isDisposed()) {
            try {
                Object call = this.f28741c.call();
                C12036b.m38663a(call, "Callable returned null");
                gVar.mo30375a(call);
            } catch (Throwable th) {
                C12003b.m38614b(th);
                if (!gVar.isDisposed()) {
                    qVar.onError(th);
                } else {
                    C11915a.m38466b(th);
                }
            }
        }
    }

    public T call() throws Exception {
        T call = this.f28741c.call();
        C12036b.m38663a(call, "The callable returned a null value");
        return call;
    }
}
