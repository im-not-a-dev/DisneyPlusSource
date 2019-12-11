package p520io.reactivex.p531y.p536e.p538b;

import org.reactivestreams.C14314c;
import org.reactivestreams.Subscriber;
import p520io.reactivex.C11955i;
import p520io.reactivex.Flowable;
import p520io.reactivex.functions.C11952h;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p546i.C12539g;

/* renamed from: io.reactivex.y.e.b.l0 */
/* compiled from: FlowableTakeWhile */
public final class C12172l0<T> extends C12111a<T, T> {

    /* renamed from: V */
    final C11952h<? super T> f28052V;

    /* renamed from: io.reactivex.y.e.b.l0$a */
    /* compiled from: FlowableTakeWhile */
    static final class C12173a<T> implements C11955i<T>, C14314c {

        /* renamed from: U */
        final C11952h<? super T> f28053U;

        /* renamed from: V */
        C14314c f28054V;

        /* renamed from: W */
        boolean f28055W;

        /* renamed from: c */
        final Subscriber<? super T> f28056c;

        C12173a(Subscriber<? super T> subscriber, C11952h<? super T> hVar) {
            this.f28056c = subscriber;
            this.f28053U = hVar;
        }

        /* renamed from: a */
        public void mo29945a(C14314c cVar) {
            if (C12539g.m39329a(this.f28054V, cVar)) {
                this.f28054V = cVar;
                this.f28056c.mo29945a(this);
            }
        }

        /* renamed from: b */
        public void mo29946b(long j) {
            this.f28054V.mo29946b(j);
        }

        public void cancel() {
            this.f28054V.cancel();
        }

        public void onComplete() {
            if (!this.f28055W) {
                this.f28055W = true;
                this.f28056c.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f28055W) {
                C11915a.m38466b(th);
                return;
            }
            this.f28055W = true;
            this.f28056c.onError(th);
        }

        public void onNext(T t) {
            if (!this.f28055W) {
                try {
                    if (!this.f28053U.test(t)) {
                        this.f28055W = true;
                        this.f28054V.cancel();
                        this.f28056c.onComplete();
                        return;
                    }
                    this.f28056c.onNext(t);
                } catch (Throwable th) {
                    C12003b.m38614b(th);
                    this.f28054V.cancel();
                    onError(th);
                }
            }
        }
    }

    public C12172l0(Flowable<T> flowable, C11952h<? super T> hVar) {
        super(flowable);
        this.f28052V = hVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29935a(Subscriber<? super T> subscriber) {
        this.f27888U.mo30080a((C11955i<? super T>) new C12173a<Object>(subscriber, this.f28052V));
    }
}
