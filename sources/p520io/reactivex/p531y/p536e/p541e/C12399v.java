package p520io.reactivex.p531y.p536e.p541e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11968q;
import p520io.reactivex.C11987u;
import p520io.reactivex.Observable;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.CompositeDisposable;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p533b.C12036b;
import p520io.reactivex.p531y.p543f.C12491c;
import p520io.reactivex.p531y.p547j.C12543c;

/* renamed from: io.reactivex.y.e.e.v */
/* compiled from: ObservableFlatMapSingle */
public final class C12399v<T, R> extends C12294a<T, R> {

    /* renamed from: U */
    final Function<? super T, ? extends SingleSource<? extends R>> f28699U;

    /* renamed from: V */
    final boolean f28700V;

    /* renamed from: io.reactivex.y.e.e.v$a */
    /* compiled from: ObservableFlatMapSingle */
    static final class C12400a<T, R> extends AtomicInteger implements C11968q<T>, Disposable {

        /* renamed from: U */
        final boolean f28701U;

        /* renamed from: V */
        final CompositeDisposable f28702V = new CompositeDisposable();

        /* renamed from: W */
        final AtomicInteger f28703W = new AtomicInteger(1);

        /* renamed from: X */
        final C12543c f28704X = new C12543c();

        /* renamed from: Y */
        final Function<? super T, ? extends SingleSource<? extends R>> f28705Y;

        /* renamed from: Z */
        final AtomicReference<C12491c<R>> f28706Z = new AtomicReference<>();

        /* renamed from: a0 */
        Disposable f28707a0;

        /* renamed from: b0 */
        volatile boolean f28708b0;

        /* renamed from: c */
        final C11968q<? super R> f28709c;

        /* renamed from: io.reactivex.y.e.e.v$a$a */
        /* compiled from: ObservableFlatMapSingle */
        final class C12401a extends AtomicReference<Disposable> implements C11987u<R>, Disposable {
            C12401a() {
            }

            public void dispose() {
                C12010c.m38621a((AtomicReference<Disposable>) this);
            }

            public boolean isDisposed() {
                return C12010c.m38619a((Disposable) get());
            }

            public void onError(Throwable th) {
                C12400a.this.mo30556a(this, th);
            }

            public void onSubscribe(Disposable disposable) {
                C12010c.m38624c(this, disposable);
            }

            public void onSuccess(R r) {
                C12400a.this.mo30555a(this, r);
            }
        }

        C12400a(C11968q<? super R> qVar, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z) {
            this.f28709c = qVar;
            this.f28705Y = function;
            this.f28701U = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30555a(C12401a aVar, R r) {
            this.f28702V.mo30251c(aVar);
            if (get() == 0) {
                boolean z = true;
                if (compareAndSet(0, 1)) {
                    this.f28709c.onNext(r);
                    if (this.f28703W.decrementAndGet() != 0) {
                        z = false;
                    }
                    C12491c cVar = (C12491c) this.f28706Z.get();
                    if (!z || (cVar != null && !cVar.isEmpty())) {
                        if (decrementAndGet() == 0) {
                            return;
                        }
                        mo30558c();
                    }
                    Throwable a = this.f28704X.mo30668a();
                    if (a != null) {
                        this.f28709c.onError(a);
                    } else {
                        this.f28709c.onComplete();
                    }
                    return;
                }
            }
            C12491c d = mo30559d();
            synchronized (d) {
                d.offer(r);
            }
            this.f28703W.decrementAndGet();
            if (getAndIncrement() != 0) {
                return;
            }
            mo30558c();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo30557b() {
            if (getAndIncrement() == 0) {
                mo30558c();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo30558c() {
            C11968q<? super R> qVar = this.f28709c;
            AtomicInteger atomicInteger = this.f28703W;
            AtomicReference<C12491c<R>> atomicReference = this.f28706Z;
            int i = 1;
            while (!this.f28708b0) {
                if (this.f28701U || ((Throwable) this.f28704X.get()) == null) {
                    boolean z = false;
                    boolean z2 = atomicInteger.get() == 0;
                    C12491c cVar = (C12491c) atomicReference.get();
                    Object poll = cVar != null ? cVar.poll() : null;
                    if (poll == null) {
                        z = true;
                    }
                    if (z2 && z) {
                        Throwable a = this.f28704X.mo30668a();
                        if (a != null) {
                            qVar.onError(a);
                        } else {
                            qVar.onComplete();
                        }
                        return;
                    } else if (z) {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        qVar.onNext(poll);
                    }
                } else {
                    Throwable a2 = this.f28704X.mo30668a();
                    mo30554a();
                    qVar.onError(a2);
                    return;
                }
            }
            mo30554a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public C12491c<R> mo30559d() {
            C12491c<R> cVar;
            do {
                C12491c<R> cVar2 = (C12491c) this.f28706Z.get();
                if (cVar2 != null) {
                    return cVar2;
                }
                cVar = new C12491c<>(Observable.m38313l());
            } while (!this.f28706Z.compareAndSet(null, cVar));
            return cVar;
        }

        public void dispose() {
            this.f28708b0 = true;
            this.f28707a0.dispose();
            this.f28702V.dispose();
        }

        public boolean isDisposed() {
            return this.f28708b0;
        }

        public void onComplete() {
            this.f28703W.decrementAndGet();
            mo30557b();
        }

        public void onError(Throwable th) {
            this.f28703W.decrementAndGet();
            if (this.f28704X.mo30669a(th)) {
                if (!this.f28701U) {
                    this.f28702V.dispose();
                }
                mo30557b();
                return;
            }
            C11915a.m38466b(th);
        }

        public void onNext(T t) {
            try {
                Object apply = this.f28705Y.apply(t);
                C12036b.m38663a(apply, "The mapper returned a null SingleSource");
                SingleSource singleSource = (SingleSource) apply;
                this.f28703W.getAndIncrement();
                C12401a aVar = new C12401a();
                if (!this.f28708b0 && this.f28702V.mo30250b(aVar)) {
                    singleSource.mo30216a(aVar);
                }
            } catch (Throwable th) {
                C12003b.m38614b(th);
                this.f28707a0.dispose();
                onError(th);
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38620a(this.f28707a0, disposable)) {
                this.f28707a0 = disposable;
                this.f28709c.onSubscribe(this);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30556a(C12401a aVar, Throwable th) {
            this.f28702V.mo30251c(aVar);
            if (this.f28704X.mo30669a(th)) {
                if (!this.f28701U) {
                    this.f28707a0.dispose();
                    this.f28702V.dispose();
                }
                this.f28703W.decrementAndGet();
                mo30557b();
                return;
            }
            C11915a.m38466b(th);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30554a() {
            C12491c cVar = (C12491c) this.f28706Z.get();
            if (cVar != null) {
                cVar.clear();
            }
        }
    }

    public C12399v(ObservableSource<T> observableSource, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z) {
        super(observableSource);
        this.f28699U = function;
        this.f28700V = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo27408b(C11968q<? super R> qVar) {
        this.f28379c.mo30162a(new C12400a(qVar, this.f28699U, this.f28700V));
    }
}
