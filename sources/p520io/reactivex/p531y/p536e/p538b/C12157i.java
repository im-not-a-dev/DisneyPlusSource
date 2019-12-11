package p520io.reactivex.p531y.p536e.p538b;

import java.util.NoSuchElementException;
import org.reactivestreams.C14314c;
import org.reactivestreams.Subscriber;
import p520io.reactivex.C11955i;
import p520io.reactivex.Flowable;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p531y.p546i.C12535c;
import p520io.reactivex.p531y.p546i.C12539g;

/* renamed from: io.reactivex.y.e.b.i */
/* compiled from: FlowableElementAt */
public final class C12157i<T> extends C12111a<T, T> {

    /* renamed from: V */
    final long f28007V;

    /* renamed from: W */
    final T f28008W;

    /* renamed from: X */
    final boolean f28009X;

    /* renamed from: io.reactivex.y.e.b.i$a */
    /* compiled from: FlowableElementAt */
    static final class C12158a<T> extends C12535c<T> implements C11955i<T> {

        /* renamed from: V */
        final long f28010V;

        /* renamed from: W */
        final T f28011W;

        /* renamed from: X */
        final boolean f28012X;

        /* renamed from: Y */
        C14314c f28013Y;

        /* renamed from: Z */
        long f28014Z;

        /* renamed from: a0 */
        boolean f28015a0;

        C12158a(Subscriber<? super T> subscriber, long j, T t, boolean z) {
            super(subscriber);
            this.f28010V = j;
            this.f28011W = t;
            this.f28012X = z;
        }

        /* renamed from: a */
        public void mo29945a(C14314c cVar) {
            if (C12539g.m39329a(this.f28013Y, cVar)) {
                this.f28013Y = cVar;
                this.f29056c.mo29945a(this);
                cVar.mo29946b(Long.MAX_VALUE);
            }
        }

        public void cancel() {
            super.cancel();
            this.f28013Y.cancel();
        }

        public void onComplete() {
            if (!this.f28015a0) {
                this.f28015a0 = true;
                T t = this.f28011W;
                if (t != null) {
                    mo30654b(t);
                } else if (this.f28012X) {
                    this.f29056c.onError(new NoSuchElementException());
                } else {
                    this.f29056c.onComplete();
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f28015a0) {
                C11915a.m38466b(th);
                return;
            }
            this.f28015a0 = true;
            this.f29056c.onError(th);
        }

        public void onNext(T t) {
            if (!this.f28015a0) {
                long j = this.f28014Z;
                if (j == this.f28010V) {
                    this.f28015a0 = true;
                    this.f28013Y.cancel();
                    mo30654b(t);
                    return;
                }
                this.f28014Z = j + 1;
            }
        }
    }

    public C12157i(Flowable<T> flowable, long j, T t, boolean z) {
        super(flowable);
        this.f28007V = j;
        this.f28008W = t;
        this.f28009X = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29935a(Subscriber<? super T> subscriber) {
        Flowable<T> flowable = this.f27888U;
        C12158a aVar = new C12158a(subscriber, this.f28007V, this.f28008W, this.f28009X);
        flowable.mo30080a((C11955i<? super T>) aVar);
    }
}
