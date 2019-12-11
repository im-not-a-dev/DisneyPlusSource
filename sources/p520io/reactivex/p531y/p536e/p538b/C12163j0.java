package p520io.reactivex.p531y.p536e.p538b;

import java.util.NoSuchElementException;
import org.reactivestreams.C14314c;
import p520io.reactivex.C11955i;
import p520io.reactivex.C11987u;
import p520io.reactivex.Flowable;
import p520io.reactivex.Single;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p531y.p534c.C12039b;
import p520io.reactivex.p531y.p546i.C12539g;

/* renamed from: io.reactivex.y.e.b.j0 */
/* compiled from: FlowableSingleSingle */
public final class C12163j0<T> extends Single<T> implements C12039b<T> {

    /* renamed from: U */
    final T f28031U;

    /* renamed from: c */
    final Flowable<T> f28032c;

    /* renamed from: io.reactivex.y.e.b.j0$a */
    /* compiled from: FlowableSingleSingle */
    static final class C12164a<T> implements C11955i<T>, Disposable {

        /* renamed from: U */
        final T f28033U;

        /* renamed from: V */
        C14314c f28034V;

        /* renamed from: W */
        boolean f28035W;

        /* renamed from: X */
        T f28036X;

        /* renamed from: c */
        final C11987u<? super T> f28037c;

        C12164a(C11987u<? super T> uVar, T t) {
            this.f28037c = uVar;
            this.f28033U = t;
        }

        /* renamed from: a */
        public void mo29945a(C14314c cVar) {
            if (C12539g.m39329a(this.f28034V, cVar)) {
                this.f28034V = cVar;
                this.f28037c.onSubscribe(this);
                cVar.mo29946b(Long.MAX_VALUE);
            }
        }

        public void dispose() {
            this.f28034V.cancel();
            this.f28034V = C12539g.CANCELLED;
        }

        public boolean isDisposed() {
            return this.f28034V == C12539g.CANCELLED;
        }

        public void onComplete() {
            if (!this.f28035W) {
                this.f28035W = true;
                this.f28034V = C12539g.CANCELLED;
                T t = this.f28036X;
                this.f28036X = null;
                if (t == null) {
                    t = this.f28033U;
                }
                if (t != null) {
                    this.f28037c.onSuccess(t);
                } else {
                    this.f28037c.onError(new NoSuchElementException());
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f28035W) {
                C11915a.m38466b(th);
                return;
            }
            this.f28035W = true;
            this.f28034V = C12539g.CANCELLED;
            this.f28037c.onError(th);
        }

        public void onNext(T t) {
            if (!this.f28035W) {
                if (this.f28036X != null) {
                    this.f28035W = true;
                    this.f28034V.cancel();
                    this.f28034V = C12539g.CANCELLED;
                    this.f28037c.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.f28036X = t;
            }
        }
    }

    public C12163j0(Flowable<T> flowable, T t) {
        this.f28032c = flowable;
        this.f28031U = t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17771b(C11987u<? super T> uVar) {
        this.f28032c.mo30080a((C11955i<? super T>) new C12164a<Object>(uVar, this.f28031U));
    }

    /* renamed from: b */
    public Flowable<T> mo30362b() {
        return C11915a.m38446a((Flowable<T>) new C12159i0<T>(this.f28032c, this.f28031U, true));
    }
}
