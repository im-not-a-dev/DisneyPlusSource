package p520io.reactivex.p531y.p536e.p538b;

import java.util.Collection;
import java.util.concurrent.Callable;
import org.reactivestreams.C14314c;
import org.reactivestreams.Subscriber;
import p520io.reactivex.C11955i;
import p520io.reactivex.Flowable;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p533b.C12036b;
import p520io.reactivex.p531y.p546i.C12535c;
import p520io.reactivex.p531y.p546i.C12536d;
import p520io.reactivex.p531y.p546i.C12539g;

/* renamed from: io.reactivex.y.e.b.n0 */
/* compiled from: FlowableToList */
public final class C12182n0<T, U extends Collection<? super T>> extends C12111a<T, U> {

    /* renamed from: V */
    final Callable<U> f28105V;

    /* renamed from: io.reactivex.y.e.b.n0$a */
    /* compiled from: FlowableToList */
    static final class C12183a<T, U extends Collection<? super T>> extends C12535c<U> implements C11955i<T>, C14314c {

        /* renamed from: V */
        C14314c f28106V;

        /* JADX WARNING: type inference failed for: r2v0, types: [T, U] */
        /* JADX WARNING: Incorrect type for immutable var: ssa=U, code=null, for r2v0, types: [T, U] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        C12183a(org.reactivestreams.Subscriber<? super U> r1, U r2) {
            /*
                r0 = this;
                r0.<init>(r1)
                r0.f29055U = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p520io.reactivex.p531y.p536e.p538b.C12182n0.C12183a.<init>(org.reactivestreams.Subscriber, java.util.Collection):void");
        }

        /* renamed from: a */
        public void mo29945a(C14314c cVar) {
            if (C12539g.m39329a(this.f28106V, cVar)) {
                this.f28106V = cVar;
                this.f29056c.mo29945a(this);
                cVar.mo29946b(Long.MAX_VALUE);
            }
        }

        public void cancel() {
            super.cancel();
            this.f28106V.cancel();
        }

        public void onComplete() {
            mo30654b(this.f29055U);
        }

        public void onError(Throwable th) {
            this.f29055U = null;
            this.f29056c.onError(th);
        }

        public void onNext(T t) {
            Collection collection = (Collection) this.f29055U;
            if (collection != null) {
                collection.add(t);
            }
        }
    }

    public C12182n0(Flowable<T> flowable, Callable<U> callable) {
        super(flowable);
        this.f28105V = callable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29935a(Subscriber<? super U> subscriber) {
        try {
            Object call = this.f28105V.call();
            C12036b.m38663a(call, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
            this.f27888U.mo30080a((C11955i<? super T>) new C12183a<Object>(subscriber, (Collection) call));
        } catch (Throwable th) {
            C12003b.m38614b(th);
            C12536d.m39310a(th, subscriber);
        }
    }
}
