package p520io.reactivex.p531y.p536e.p538b;

import java.util.NoSuchElementException;
import org.reactivestreams.C14314c;
import org.reactivestreams.Subscriber;
import p520io.reactivex.C11955i;
import p520io.reactivex.Flowable;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p531y.p546i.C12535c;
import p520io.reactivex.p531y.p546i.C12539g;

/* renamed from: io.reactivex.y.e.b.i0 */
/* compiled from: FlowableSingle */
public final class C12159i0<T> extends C12111a<T, T> {

    /* renamed from: V */
    final T f28016V;

    /* renamed from: W */
    final boolean f28017W;

    /* renamed from: io.reactivex.y.e.b.i0$a */
    /* compiled from: FlowableSingle */
    static final class C12160a<T> extends C12535c<T> implements C11955i<T> {

        /* renamed from: V */
        final T f28018V;

        /* renamed from: W */
        final boolean f28019W;

        /* renamed from: X */
        C14314c f28020X;

        /* renamed from: Y */
        boolean f28021Y;

        C12160a(Subscriber<? super T> subscriber, T t, boolean z) {
            super(subscriber);
            this.f28018V = t;
            this.f28019W = z;
        }

        /* renamed from: a */
        public void mo29945a(C14314c cVar) {
            if (C12539g.m39329a(this.f28020X, cVar)) {
                this.f28020X = cVar;
                this.f29056c.mo29945a(this);
                cVar.mo29946b(Long.MAX_VALUE);
            }
        }

        public void cancel() {
            super.cancel();
            this.f28020X.cancel();
        }

        public void onComplete() {
            if (!this.f28021Y) {
                this.f28021Y = true;
                T t = this.f29055U;
                this.f29055U = null;
                if (t == null) {
                    t = this.f28018V;
                }
                if (t != null) {
                    mo30654b(t);
                } else if (this.f28019W) {
                    this.f29056c.onError(new NoSuchElementException());
                } else {
                    this.f29056c.onComplete();
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f28021Y) {
                C11915a.m38466b(th);
                return;
            }
            this.f28021Y = true;
            this.f29056c.onError(th);
        }

        public void onNext(T t) {
            if (!this.f28021Y) {
                if (this.f29055U != null) {
                    this.f28021Y = true;
                    this.f28020X.cancel();
                    this.f29056c.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.f29055U = t;
            }
        }
    }

    public C12159i0(Flowable<T> flowable, T t, boolean z) {
        super(flowable);
        this.f28016V = t;
        this.f28017W = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29935a(Subscriber<? super T> subscriber) {
        this.f27888U.mo30080a((C11955i<? super T>) new C12160a<Object>(subscriber, this.f28016V, this.f28017W));
    }
}
