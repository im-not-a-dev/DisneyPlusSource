package p520io.reactivex.p531y.p536e.p541e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11968q;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p533b.C12036b;
import p520io.reactivex.p531y.p534c.C12046i;
import p520io.reactivex.p531y.p534c.C12051n;
import p520io.reactivex.p531y.p543f.C12491c;
import p520io.reactivex.p531y.p547j.C12543c;

/* renamed from: io.reactivex.y.e.e.v0 */
/* compiled from: ObservableSwitchMap */
public final class C12402v0<T, R> extends C12294a<T, R> {

    /* renamed from: U */
    final Function<? super T, ? extends ObservableSource<? extends R>> f28711U;

    /* renamed from: V */
    final int f28712V;

    /* renamed from: W */
    final boolean f28713W;

    /* renamed from: io.reactivex.y.e.e.v0$a */
    /* compiled from: ObservableSwitchMap */
    static final class C12403a<T, R> extends AtomicReference<Disposable> implements C11968q<R> {

        /* renamed from: U */
        final long f28714U;

        /* renamed from: V */
        final int f28715V;

        /* renamed from: W */
        volatile C12051n<R> f28716W;

        /* renamed from: X */
        volatile boolean f28717X;

        /* renamed from: c */
        final C12404b<T, R> f28718c;

        C12403a(C12404b<T, R> bVar, long j, int i) {
            this.f28718c = bVar;
            this.f28714U = j;
            this.f28715V = i;
        }

        /* renamed from: a */
        public void mo30560a() {
            C12010c.m38621a((AtomicReference<Disposable>) this);
        }

        public void onComplete() {
            if (this.f28714U == this.f28718c.f28729c0) {
                this.f28717X = true;
                this.f28718c.mo30563b();
            }
        }

        public void onError(Throwable th) {
            this.f28718c.mo30562a(this, th);
        }

        public void onNext(R r) {
            if (this.f28714U == this.f28718c.f28729c0) {
                if (r != null) {
                    this.f28716W.offer(r);
                }
                this.f28718c.mo30563b();
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38624c(this, disposable)) {
                if (disposable instanceof C12046i) {
                    C12046i iVar = (C12046i) disposable;
                    int a = iVar.mo30285a(7);
                    if (a == 1) {
                        this.f28716W = iVar;
                        this.f28717X = true;
                        this.f28718c.mo30563b();
                        return;
                    } else if (a == 2) {
                        this.f28716W = iVar;
                        return;
                    }
                }
                this.f28716W = new C12491c(this.f28715V);
            }
        }
    }

    /* renamed from: io.reactivex.y.e.e.v0$b */
    /* compiled from: ObservableSwitchMap */
    static final class C12404b<T, R> extends AtomicInteger implements C11968q<T>, Disposable {

        /* renamed from: d0 */
        static final C12403a<Object, Object> f28719d0 = new C12403a<>(null, -1, 1);

        /* renamed from: U */
        final Function<? super T, ? extends ObservableSource<? extends R>> f28720U;

        /* renamed from: V */
        final int f28721V;

        /* renamed from: W */
        final boolean f28722W;

        /* renamed from: X */
        final C12543c f28723X;

        /* renamed from: Y */
        volatile boolean f28724Y;

        /* renamed from: Z */
        volatile boolean f28725Z;

        /* renamed from: a0 */
        Disposable f28726a0;

        /* renamed from: b0 */
        final AtomicReference<C12403a<T, R>> f28727b0 = new AtomicReference<>();

        /* renamed from: c */
        final C11968q<? super R> f28728c;

        /* renamed from: c0 */
        volatile long f28729c0;

        static {
            f28719d0.mo30560a();
        }

        C12404b(C11968q<? super R> qVar, Function<? super T, ? extends ObservableSource<? extends R>> function, int i, boolean z) {
            this.f28728c = qVar;
            this.f28720U = function;
            this.f28721V = i;
            this.f28722W = z;
            this.f28723X = new C12543c();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30561a() {
            C12403a<Object, Object> aVar = (C12403a) this.f28727b0.get();
            C12403a<Object, Object> aVar2 = f28719d0;
            if (aVar != aVar2) {
                C12403a<Object, Object> aVar3 = (C12403a) this.f28727b0.getAndSet(aVar2);
                if (aVar3 != f28719d0 && aVar3 != null) {
                    aVar3.mo30560a();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x000f A[SYNTHETIC] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo30563b() {
            /*
                r13 = this;
                int r0 = r13.getAndIncrement()
                if (r0 == 0) goto L_0x0007
                return
            L_0x0007:
                io.reactivex.q<? super R> r0 = r13.f28728c
                java.util.concurrent.atomic.AtomicReference<io.reactivex.y.e.e.v0$a<T, R>> r1 = r13.f28727b0
                boolean r2 = r13.f28722W
                r3 = 1
                r4 = 1
            L_0x000f:
                boolean r5 = r13.f28725Z
                if (r5 == 0) goto L_0x0014
                return
            L_0x0014:
                boolean r5 = r13.f28724Y
                r6 = 0
                if (r5 == 0) goto L_0x0052
                java.lang.Object r5 = r1.get()
                if (r5 != 0) goto L_0x0021
                r5 = 1
                goto L_0x0022
            L_0x0021:
                r5 = 0
            L_0x0022:
                if (r2 == 0) goto L_0x0038
                if (r5 == 0) goto L_0x0052
                io.reactivex.y.j.c r1 = r13.f28723X
                java.lang.Object r1 = r1.get()
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                if (r1 == 0) goto L_0x0034
                r0.onError(r1)
                goto L_0x0037
            L_0x0034:
                r0.onComplete()
            L_0x0037:
                return
            L_0x0038:
                io.reactivex.y.j.c r7 = r13.f28723X
                java.lang.Object r7 = r7.get()
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 == 0) goto L_0x004c
                io.reactivex.y.j.c r1 = r13.f28723X
                java.lang.Throwable r1 = r1.mo30668a()
                r0.onError(r1)
                return
            L_0x004c:
                if (r5 == 0) goto L_0x0052
                r0.onComplete()
                return
            L_0x0052:
                java.lang.Object r5 = r1.get()
                io.reactivex.y.e.e.v0$a r5 = (p520io.reactivex.p531y.p536e.p541e.C12402v0.C12403a) r5
                if (r5 == 0) goto L_0x00e9
                io.reactivex.y.c.n<R> r7 = r5.f28716W
                if (r7 == 0) goto L_0x00e9
                boolean r8 = r5.f28717X
                r9 = 0
                if (r8 == 0) goto L_0x0089
                boolean r8 = r7.isEmpty()
                if (r2 == 0) goto L_0x006f
                if (r8 == 0) goto L_0x0089
                r1.compareAndSet(r5, r9)
                goto L_0x000f
            L_0x006f:
                io.reactivex.y.j.c r10 = r13.f28723X
                java.lang.Object r10 = r10.get()
                java.lang.Throwable r10 = (java.lang.Throwable) r10
                if (r10 == 0) goto L_0x0083
                io.reactivex.y.j.c r1 = r13.f28723X
                java.lang.Throwable r1 = r1.mo30668a()
                r0.onError(r1)
                return
            L_0x0083:
                if (r8 == 0) goto L_0x0089
                r1.compareAndSet(r5, r9)
                goto L_0x000f
            L_0x0089:
                r8 = 0
            L_0x008a:
                boolean r10 = r13.f28725Z
                if (r10 == 0) goto L_0x008f
                return
            L_0x008f:
                java.lang.Object r10 = r1.get()
                if (r5 == r10) goto L_0x0097
            L_0x0095:
                r8 = 1
                goto L_0x00e1
            L_0x0097:
                if (r2 != 0) goto L_0x00ad
                io.reactivex.y.j.c r10 = r13.f28723X
                java.lang.Object r10 = r10.get()
                java.lang.Throwable r10 = (java.lang.Throwable) r10
                if (r10 == 0) goto L_0x00ad
                io.reactivex.y.j.c r1 = r13.f28723X
                java.lang.Throwable r1 = r1.mo30668a()
                r0.onError(r1)
                return
            L_0x00ad:
                boolean r10 = r5.f28717X
                java.lang.Object r11 = r7.poll()     // Catch:{ all -> 0x00b4 }
                goto L_0x00d2
            L_0x00b4:
                r8 = move-exception
                p520io.reactivex.p530x.C12003b.m38614b(r8)
                io.reactivex.y.j.c r11 = r13.f28723X
                r11.mo30669a(r8)
                r1.compareAndSet(r5, r9)
                if (r2 != 0) goto L_0x00cd
                r13.mo30561a()
                io.reactivex.disposables.Disposable r8 = r13.f28726a0
                r8.dispose()
                r13.f28724Y = r3
                goto L_0x00d0
            L_0x00cd:
                r5.mo30560a()
            L_0x00d0:
                r11 = r9
                r8 = 1
            L_0x00d2:
                if (r11 != 0) goto L_0x00d6
                r12 = 1
                goto L_0x00d7
            L_0x00d6:
                r12 = 0
            L_0x00d7:
                if (r10 == 0) goto L_0x00df
                if (r12 == 0) goto L_0x00df
                r1.compareAndSet(r5, r9)
                goto L_0x0095
            L_0x00df:
                if (r12 == 0) goto L_0x00e5
            L_0x00e1:
                if (r8 == 0) goto L_0x00e9
                goto L_0x000f
            L_0x00e5:
                r0.onNext(r11)
                goto L_0x008a
            L_0x00e9:
                int r4 = -r4
                int r4 = r13.addAndGet(r4)
                if (r4 != 0) goto L_0x000f
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p520io.reactivex.p531y.p536e.p541e.C12402v0.C12404b.mo30563b():void");
        }

        public void dispose() {
            if (!this.f28725Z) {
                this.f28725Z = true;
                this.f28726a0.dispose();
                mo30561a();
            }
        }

        public boolean isDisposed() {
            return this.f28725Z;
        }

        public void onComplete() {
            if (!this.f28724Y) {
                this.f28724Y = true;
                mo30563b();
            }
        }

        public void onError(Throwable th) {
            if (this.f28724Y || !this.f28723X.mo30669a(th)) {
                C11915a.m38466b(th);
                return;
            }
            if (!this.f28722W) {
                mo30561a();
            }
            this.f28724Y = true;
            mo30563b();
        }

        public void onNext(T t) {
            long j = this.f28729c0 + 1;
            this.f28729c0 = j;
            C12403a aVar = (C12403a) this.f28727b0.get();
            if (aVar != null) {
                aVar.mo30560a();
            }
            try {
                Object apply = this.f28720U.apply(t);
                C12036b.m38663a(apply, "The ObservableSource returned is null");
                ObservableSource observableSource = (ObservableSource) apply;
                C12403a aVar2 = new C12403a(this, j, this.f28721V);
                while (true) {
                    C12403a<Object, Object> aVar3 = (C12403a) this.f28727b0.get();
                    if (aVar3 != f28719d0) {
                        if (this.f28727b0.compareAndSet(aVar3, aVar2)) {
                            observableSource.mo30162a(aVar2);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            } catch (Throwable th) {
                C12003b.m38614b(th);
                this.f28726a0.dispose();
                onError(th);
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38620a(this.f28726a0, disposable)) {
                this.f28726a0 = disposable;
                this.f28728c.onSubscribe(this);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30562a(C12403a<T, R> aVar, Throwable th) {
            if (aVar.f28714U != this.f28729c0 || !this.f28723X.mo30669a(th)) {
                C11915a.m38466b(th);
                return;
            }
            if (!this.f28722W) {
                this.f28726a0.dispose();
                this.f28724Y = true;
            }
            aVar.f28717X = true;
            mo30563b();
        }
    }

    public C12402v0(ObservableSource<T> observableSource, Function<? super T, ? extends ObservableSource<? extends R>> function, int i, boolean z) {
        super(observableSource);
        this.f28711U = function;
        this.f28712V = i;
        this.f28713W = z;
    }

    /* renamed from: b */
    public void mo27408b(C11968q<? super R> qVar) {
        if (!C12372p0.m39091a(this.f28379c, qVar, this.f28711U)) {
            this.f28379c.mo30162a(new C12404b(qVar, this.f28711U, this.f28712V, this.f28713W));
        }
    }
}
