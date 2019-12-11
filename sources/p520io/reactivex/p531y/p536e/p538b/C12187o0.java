package p520io.reactivex.p531y.p536e.p538b;

import java.util.Collection;
import java.util.concurrent.Callable;
import org.reactivestreams.C14314c;
import p520io.reactivex.C11955i;
import p520io.reactivex.C11987u;
import p520io.reactivex.Flowable;
import p520io.reactivex.Single;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12011d;
import p520io.reactivex.p531y.p533b.C12036b;
import p520io.reactivex.p531y.p534c.C12039b;
import p520io.reactivex.p531y.p546i.C12539g;
import p520io.reactivex.p531y.p547j.C12542b;

/* renamed from: io.reactivex.y.e.b.o0 */
/* compiled from: FlowableToListSingle */
public final class C12187o0<T, U extends Collection<? super T>> extends Single<U> implements C12039b<U> {

    /* renamed from: U */
    final Callable<U> f28120U;

    /* renamed from: c */
    final Flowable<T> f28121c;

    /* renamed from: io.reactivex.y.e.b.o0$a */
    /* compiled from: FlowableToListSingle */
    static final class C12188a<T, U extends Collection<? super T>> implements C11955i<T>, Disposable {

        /* renamed from: U */
        C14314c f28122U;

        /* renamed from: V */
        U f28123V;

        /* renamed from: c */
        final C11987u<? super U> f28124c;

        C12188a(C11987u<? super U> uVar, U u) {
            this.f28124c = uVar;
            this.f28123V = u;
        }

        /* renamed from: a */
        public void mo29945a(C14314c cVar) {
            if (C12539g.m39329a(this.f28122U, cVar)) {
                this.f28122U = cVar;
                this.f28124c.onSubscribe(this);
                cVar.mo29946b(Long.MAX_VALUE);
            }
        }

        public void dispose() {
            this.f28122U.cancel();
            this.f28122U = C12539g.CANCELLED;
        }

        public boolean isDisposed() {
            return this.f28122U == C12539g.CANCELLED;
        }

        public void onComplete() {
            this.f28122U = C12539g.CANCELLED;
            this.f28124c.onSuccess(this.f28123V);
        }

        public void onError(Throwable th) {
            this.f28123V = null;
            this.f28122U = C12539g.CANCELLED;
            this.f28124c.onError(th);
        }

        public void onNext(T t) {
            this.f28123V.add(t);
        }
    }

    public C12187o0(Flowable<T> flowable) {
        this(flowable, C12542b.m39337a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17771b(C11987u<? super U> uVar) {
        try {
            Object call = this.f28120U.call();
            C12036b.m38663a(call, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
            this.f28121c.mo30080a((C11955i<? super T>) new C12188a<Object>(uVar, (Collection) call));
        } catch (Throwable th) {
            C12003b.m38614b(th);
            C12011d.m38632a(th, uVar);
        }
    }

    public C12187o0(Flowable<T> flowable, Callable<U> callable) {
        this.f28121c = flowable;
        this.f28120U = callable;
    }

    /* renamed from: b */
    public Flowable<U> mo30362b() {
        return C11915a.m38446a((Flowable<T>) new C12182n0<T>(this.f28121c, this.f28120U));
    }
}
