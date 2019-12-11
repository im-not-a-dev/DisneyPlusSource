package p520io.reactivex.p531y.p536e.p538b;

import org.reactivestreams.C14314c;
import org.reactivestreams.Subscriber;
import p520io.reactivex.C11955i;
import p520io.reactivex.Flowable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.C11951g;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p546i.C12536d;
import p520io.reactivex.p531y.p546i.C12539g;

/* renamed from: io.reactivex.y.e.b.h */
/* compiled from: FlowableDoOnLifecycle */
public final class C12153h<T> extends C12111a<T, T> {

    /* renamed from: V */
    private final Consumer<? super C14314c> f27997V;

    /* renamed from: W */
    private final C11951g f27998W;

    /* renamed from: X */
    private final C11945a f27999X;

    /* renamed from: io.reactivex.y.e.b.h$a */
    /* compiled from: FlowableDoOnLifecycle */
    static final class C12154a<T> implements C11955i<T>, C14314c {

        /* renamed from: U */
        final Consumer<? super C14314c> f28000U;

        /* renamed from: V */
        final C11951g f28001V;

        /* renamed from: W */
        final C11945a f28002W;

        /* renamed from: X */
        C14314c f28003X;

        /* renamed from: c */
        final Subscriber<? super T> f28004c;

        C12154a(Subscriber<? super T> subscriber, Consumer<? super C14314c> consumer, C11951g gVar, C11945a aVar) {
            this.f28004c = subscriber;
            this.f28000U = consumer;
            this.f28002W = aVar;
            this.f28001V = gVar;
        }

        /* renamed from: a */
        public void mo29945a(C14314c cVar) {
            try {
                this.f28000U.accept(cVar);
                if (C12539g.m39329a(this.f28003X, cVar)) {
                    this.f28003X = cVar;
                    this.f28004c.mo29945a(this);
                }
            } catch (Throwable th) {
                C12003b.m38614b(th);
                cVar.cancel();
                this.f28003X = C12539g.CANCELLED;
                C12536d.m39310a(th, this.f28004c);
            }
        }

        /* renamed from: b */
        public void mo29946b(long j) {
            try {
                this.f28001V.mo30265a(j);
            } catch (Throwable th) {
                C12003b.m38614b(th);
                C11915a.m38466b(th);
            }
            this.f28003X.mo29946b(j);
        }

        public void cancel() {
            C14314c cVar = this.f28003X;
            C12539g gVar = C12539g.CANCELLED;
            if (cVar != gVar) {
                this.f28003X = gVar;
                try {
                    this.f28002W.run();
                } catch (Throwable th) {
                    C12003b.m38614b(th);
                    C11915a.m38466b(th);
                }
                cVar.cancel();
            }
        }

        public void onComplete() {
            if (this.f28003X != C12539g.CANCELLED) {
                this.f28004c.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f28003X != C12539g.CANCELLED) {
                this.f28004c.onError(th);
            } else {
                C11915a.m38466b(th);
            }
        }

        public void onNext(T t) {
            this.f28004c.onNext(t);
        }
    }

    public C12153h(Flowable<T> flowable, Consumer<? super C14314c> consumer, C11951g gVar, C11945a aVar) {
        super(flowable);
        this.f27997V = consumer;
        this.f27998W = gVar;
        this.f27999X = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29935a(Subscriber<? super T> subscriber) {
        this.f27888U.mo30080a((C11955i<? super T>) new C12154a<Object>(subscriber, this.f27997V, this.f27998W, this.f27999X));
    }
}
