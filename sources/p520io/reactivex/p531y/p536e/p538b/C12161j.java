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

/* renamed from: io.reactivex.y.e.b.j */
/* compiled from: FlowableElementAtSingle */
public final class C12161j<T> extends Single<T> implements C12039b<T> {

    /* renamed from: U */
    final long f28022U;

    /* renamed from: V */
    final T f28023V;

    /* renamed from: c */
    final Flowable<T> f28024c;

    /* renamed from: io.reactivex.y.e.b.j$a */
    /* compiled from: FlowableElementAtSingle */
    static final class C12162a<T> implements C11955i<T>, Disposable {

        /* renamed from: U */
        final long f28025U;

        /* renamed from: V */
        final T f28026V;

        /* renamed from: W */
        C14314c f28027W;

        /* renamed from: X */
        long f28028X;

        /* renamed from: Y */
        boolean f28029Y;

        /* renamed from: c */
        final C11987u<? super T> f28030c;

        C12162a(C11987u<? super T> uVar, long j, T t) {
            this.f28030c = uVar;
            this.f28025U = j;
            this.f28026V = t;
        }

        /* renamed from: a */
        public void mo29945a(C14314c cVar) {
            if (C12539g.m39329a(this.f28027W, cVar)) {
                this.f28027W = cVar;
                this.f28030c.onSubscribe(this);
                cVar.mo29946b(Long.MAX_VALUE);
            }
        }

        public void dispose() {
            this.f28027W.cancel();
            this.f28027W = C12539g.CANCELLED;
        }

        public boolean isDisposed() {
            return this.f28027W == C12539g.CANCELLED;
        }

        public void onComplete() {
            this.f28027W = C12539g.CANCELLED;
            if (!this.f28029Y) {
                this.f28029Y = true;
                T t = this.f28026V;
                if (t != null) {
                    this.f28030c.onSuccess(t);
                } else {
                    this.f28030c.onError(new NoSuchElementException());
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f28029Y) {
                C11915a.m38466b(th);
                return;
            }
            this.f28029Y = true;
            this.f28027W = C12539g.CANCELLED;
            this.f28030c.onError(th);
        }

        public void onNext(T t) {
            if (!this.f28029Y) {
                long j = this.f28028X;
                if (j == this.f28025U) {
                    this.f28029Y = true;
                    this.f28027W.cancel();
                    this.f28027W = C12539g.CANCELLED;
                    this.f28030c.onSuccess(t);
                    return;
                }
                this.f28028X = j + 1;
            }
        }
    }

    public C12161j(Flowable<T> flowable, long j, T t) {
        this.f28024c = flowable;
        this.f28022U = j;
        this.f28023V = t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17771b(C11987u<? super T> uVar) {
        this.f28024c.mo30080a((C11955i<? super T>) new C12162a<Object>(uVar, this.f28022U, this.f28023V));
    }

    /* renamed from: b */
    public Flowable<T> mo30362b() {
        C12157i iVar = new C12157i(this.f28024c, this.f28022U, this.f28023V, true);
        return C11915a.m38446a((Flowable<T>) iVar);
    }
}
