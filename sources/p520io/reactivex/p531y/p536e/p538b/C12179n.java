package p520io.reactivex.p531y.p536e.p538b;

import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.C14314c;
import org.reactivestreams.Subscriber;
import p520io.reactivex.C11955i;
import p520io.reactivex.CompletableObserver;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.Flowable;
import p520io.reactivex.disposables.CompositeDisposable;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p533b.C12036b;
import p520io.reactivex.p531y.p546i.C12533a;
import p520io.reactivex.p531y.p546i.C12539g;
import p520io.reactivex.p531y.p547j.C12543c;

/* renamed from: io.reactivex.y.e.b.n */
/* compiled from: FlowableFlatMapCompletable */
public final class C12179n<T> extends C12111a<T, T> {

    /* renamed from: V */
    final Function<? super T, ? extends CompletableSource> f28093V;

    /* renamed from: W */
    final int f28094W;

    /* renamed from: X */
    final boolean f28095X;

    /* renamed from: io.reactivex.y.e.b.n$a */
    /* compiled from: FlowableFlatMapCompletable */
    static final class C12180a<T> extends C12533a<T> implements C11955i<T> {

        /* renamed from: U */
        final C12543c f28096U = new C12543c();

        /* renamed from: V */
        final Function<? super T, ? extends CompletableSource> f28097V;

        /* renamed from: W */
        final boolean f28098W;

        /* renamed from: X */
        final CompositeDisposable f28099X = new CompositeDisposable();

        /* renamed from: Y */
        final int f28100Y;

        /* renamed from: Z */
        C14314c f28101Z;

        /* renamed from: a0 */
        volatile boolean f28102a0;

        /* renamed from: c */
        final Subscriber<? super T> f28103c;

        /* renamed from: io.reactivex.y.e.b.n$a$a */
        /* compiled from: FlowableFlatMapCompletable */
        final class C12181a extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
            C12181a() {
            }

            public void dispose() {
                C12010c.m38621a((AtomicReference<Disposable>) this);
            }

            public boolean isDisposed() {
                return C12010c.m38619a((Disposable) get());
            }

            public void onComplete() {
                C12180a.this.mo30434a(this);
            }

            public void onError(Throwable th) {
                C12180a.this.mo30435a(this, th);
            }

            public void onSubscribe(Disposable disposable) {
                C12010c.m38624c(this, disposable);
            }
        }

        C12180a(Subscriber<? super T> subscriber, Function<? super T, ? extends CompletableSource> function, boolean z, int i) {
            this.f28103c = subscriber;
            this.f28097V = function;
            this.f28098W = z;
            this.f28100Y = i;
            lazySet(1);
        }

        /* renamed from: a */
        public int mo30285a(int i) {
            return i & 2;
        }

        /* renamed from: a */
        public void mo29945a(C14314c cVar) {
            if (C12539g.m39329a(this.f28101Z, cVar)) {
                this.f28101Z = cVar;
                this.f28103c.mo29945a(this);
                int i = this.f28100Y;
                if (i == Integer.MAX_VALUE) {
                    cVar.mo29946b(Long.MAX_VALUE);
                } else {
                    cVar.mo29946b((long) i);
                }
            }
        }

        /* renamed from: b */
        public void mo29946b(long j) {
        }

        public void cancel() {
            this.f28102a0 = true;
            this.f28101Z.cancel();
            this.f28099X.dispose();
        }

        public void clear() {
        }

        public boolean isEmpty() {
            return true;
        }

        public void onComplete() {
            if (decrementAndGet() == 0) {
                Throwable a = this.f28096U.mo30668a();
                if (a != null) {
                    this.f28103c.onError(a);
                } else {
                    this.f28103c.onComplete();
                }
            } else if (this.f28100Y != Integer.MAX_VALUE) {
                this.f28101Z.mo29946b(1);
            }
        }

        public void onError(Throwable th) {
            if (!this.f28096U.mo30669a(th)) {
                C11915a.m38466b(th);
            } else if (!this.f28098W) {
                cancel();
                if (getAndSet(0) > 0) {
                    this.f28103c.onError(this.f28096U.mo30668a());
                }
            } else if (decrementAndGet() == 0) {
                this.f28103c.onError(this.f28096U.mo30668a());
            } else if (this.f28100Y != Integer.MAX_VALUE) {
                this.f28101Z.mo29946b(1);
            }
        }

        public void onNext(T t) {
            try {
                Object apply = this.f28097V.apply(t);
                C12036b.m38663a(apply, "The mapper returned a null CompletableSource");
                CompletableSource completableSource = (CompletableSource) apply;
                getAndIncrement();
                C12181a aVar = new C12181a();
                if (!this.f28102a0 && this.f28099X.mo30250b(aVar)) {
                    completableSource.subscribe(aVar);
                }
            } catch (Throwable th) {
                C12003b.m38614b(th);
                this.f28101Z.cancel();
                onError(th);
            }
        }

        public T poll() throws Exception {
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30434a(C12181a aVar) {
            this.f28099X.mo30251c(aVar);
            onComplete();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30435a(C12181a aVar, Throwable th) {
            this.f28099X.mo30251c(aVar);
            onError(th);
        }
    }

    public C12179n(Flowable<T> flowable, Function<? super T, ? extends CompletableSource> function, boolean z, int i) {
        super(flowable);
        this.f28093V = function;
        this.f28095X = z;
        this.f28094W = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29935a(Subscriber<? super T> subscriber) {
        this.f27888U.mo30080a((C11955i<? super T>) new C12180a<Object>(subscriber, this.f28093V, this.f28095X, this.f28094W));
    }
}
