package p520io.reactivex.p531y.p544g;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11969r;
import p520io.reactivex.C11969r.C11972c;
import p520io.reactivex.disposables.CompositeDisposable;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p525e0.C11933a;
import p520io.reactivex.p525e0.C11934b;
import p520io.reactivex.p531y.p532a.C12009b;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p532a.C12011d;
import p520io.reactivex.p531y.p532a.C12014g;
import p520io.reactivex.p531y.p543f.C12488a;

/* renamed from: io.reactivex.y.g.d */
/* compiled from: ExecutorScheduler */
public final class C12498d extends C11969r {

    /* renamed from: d */
    static final C11969r f28952d = C11934b.m38501c();

    /* renamed from: b */
    final boolean f28953b;

    /* renamed from: c */
    final Executor f28954c;

    /* renamed from: io.reactivex.y.g.d$a */
    /* compiled from: ExecutorScheduler */
    final class C12499a implements Runnable {

        /* renamed from: c */
        private final C12500b f28956c;

        C12499a(C12500b bVar) {
            this.f28956c = bVar;
        }

        public void run() {
            C12500b bVar = this.f28956c;
            bVar.f28957U.mo30345a(C12498d.this.mo30289a(bVar));
        }
    }

    /* renamed from: io.reactivex.y.g.d$b */
    /* compiled from: ExecutorScheduler */
    static final class C12500b extends AtomicReference<Runnable> implements Runnable, Disposable, C11933a {

        /* renamed from: U */
        final C12014g f28957U = new C12014g();

        /* renamed from: c */
        final C12014g f28958c = new C12014g();

        C12500b(Runnable runnable) {
            super(runnable);
        }

        public void dispose() {
            if (getAndSet(null) != null) {
                this.f28958c.dispose();
                this.f28957U.dispose();
            }
        }

        public boolean isDisposed() {
            return get() == null;
        }

        public void run() {
            Runnable runnable = (Runnable) get();
            if (runnable != null) {
                try {
                    runnable.run();
                } finally {
                    lazySet(null);
                    this.f28958c.lazySet(C12010c.DISPOSED);
                    this.f28957U.lazySet(C12010c.DISPOSED);
                }
            }
        }
    }

    /* renamed from: io.reactivex.y.g.d$c */
    /* compiled from: ExecutorScheduler */
    public static final class C12501c extends C11972c implements Runnable {

        /* renamed from: U */
        final Executor f28959U;

        /* renamed from: V */
        final C12488a<Runnable> f28960V;

        /* renamed from: W */
        volatile boolean f28961W;

        /* renamed from: X */
        final AtomicInteger f28962X = new AtomicInteger();

        /* renamed from: Y */
        final CompositeDisposable f28963Y = new CompositeDisposable();

        /* renamed from: c */
        final boolean f28964c;

        /* renamed from: io.reactivex.y.g.d$c$a */
        /* compiled from: ExecutorScheduler */
        static final class C12502a extends AtomicBoolean implements Runnable, Disposable {

            /* renamed from: c */
            final Runnable f28965c;

            C12502a(Runnable runnable) {
                this.f28965c = runnable;
            }

            public void dispose() {
                lazySet(true);
            }

            public boolean isDisposed() {
                return get();
            }

            public void run() {
                if (!get()) {
                    try {
                        this.f28965c.run();
                    } finally {
                        lazySet(true);
                    }
                }
            }
        }

        /* renamed from: io.reactivex.y.g.d$c$b */
        /* compiled from: ExecutorScheduler */
        static final class C12503b extends AtomicInteger implements Runnable, Disposable {

            /* renamed from: U */
            final C12009b f28966U;

            /* renamed from: V */
            volatile Thread f28967V;

            /* renamed from: c */
            final Runnable f28968c;

            C12503b(Runnable runnable, C12009b bVar) {
                this.f28968c = runnable;
                this.f28966U = bVar;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public void mo30613a() {
                C12009b bVar = this.f28966U;
                if (bVar != null) {
                    bVar.mo30251c(this);
                }
            }

            public void dispose() {
                while (true) {
                    int i = get();
                    if (i < 2) {
                        if (i == 0) {
                            if (compareAndSet(0, 4)) {
                                mo30613a();
                                return;
                            }
                        } else if (compareAndSet(1, 3)) {
                            Thread thread = this.f28967V;
                            if (thread != null) {
                                thread.interrupt();
                                this.f28967V = null;
                            }
                            set(4);
                            mo30613a();
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }

            public boolean isDisposed() {
                return get() >= 2;
            }

            public void run() {
                if (get() == 0) {
                    this.f28967V = Thread.currentThread();
                    if (compareAndSet(0, 1)) {
                        try {
                            this.f28968c.run();
                            this.f28967V = null;
                            if (compareAndSet(1, 2)) {
                                mo30613a();
                                return;
                            }
                            while (get() == 3) {
                                Thread.yield();
                            }
                            Thread.interrupted();
                        } catch (Throwable th) {
                            this.f28967V = null;
                            if (!compareAndSet(1, 2)) {
                                while (get() == 3) {
                                    Thread.yield();
                                }
                                Thread.interrupted();
                            } else {
                                mo30613a();
                            }
                            throw th;
                        }
                    } else {
                        this.f28967V = null;
                    }
                }
            }
        }

        /* renamed from: io.reactivex.y.g.d$c$c */
        /* compiled from: ExecutorScheduler */
        final class C12504c implements Runnable {

            /* renamed from: U */
            private final Runnable f28969U;

            /* renamed from: c */
            private final C12014g f28971c;

            C12504c(C12014g gVar, Runnable runnable) {
                this.f28971c = gVar;
                this.f28969U = runnable;
            }

            public void run() {
                this.f28971c.mo30345a(C12501c.this.mo30296a(this.f28969U));
            }
        }

        public C12501c(Executor executor, boolean z) {
            this.f28959U = executor;
            this.f28960V = new C12488a<>();
            this.f28964c = z;
        }

        /* renamed from: a */
        public Disposable mo30296a(Runnable runnable) {
            Disposable disposable;
            if (this.f28961W) {
                return C12011d.INSTANCE;
            }
            Runnable a = C11915a.m38459a(runnable);
            if (this.f28964c) {
                disposable = new C12503b(a, this.f28963Y);
                this.f28963Y.mo30250b(disposable);
            } else {
                disposable = new C12502a(a);
            }
            this.f28960V.offer(disposable);
            if (this.f28962X.getAndIncrement() == 0) {
                try {
                    this.f28959U.execute(this);
                } catch (RejectedExecutionException e) {
                    this.f28961W = true;
                    this.f28960V.clear();
                    C11915a.m38466b((Throwable) e);
                    return C12011d.INSTANCE;
                }
            }
            return disposable;
        }

        public void dispose() {
            if (!this.f28961W) {
                this.f28961W = true;
                this.f28963Y.dispose();
                if (this.f28962X.getAndIncrement() == 0) {
                    this.f28960V.clear();
                }
            }
        }

        public boolean isDisposed() {
            return this.f28961W;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
            r1 = r3.f28962X.addAndGet(-r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
            if (r1 != 0) goto L_0x0003;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
            if (r3.f28961W == false) goto L_0x001b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
            r0.clear();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
                io.reactivex.y.f.a<java.lang.Runnable> r0 = r3.f28960V
                r1 = 1
            L_0x0003:
                boolean r2 = r3.f28961W
                if (r2 == 0) goto L_0x000b
                r0.clear()
                return
            L_0x000b:
                java.lang.Object r2 = r0.poll()
                java.lang.Runnable r2 = (java.lang.Runnable) r2
                if (r2 != 0) goto L_0x0025
                boolean r2 = r3.f28961W
                if (r2 == 0) goto L_0x001b
                r0.clear()
                return
            L_0x001b:
                java.util.concurrent.atomic.AtomicInteger r2 = r3.f28962X
                int r1 = -r1
                int r1 = r2.addAndGet(r1)
                if (r1 != 0) goto L_0x0003
                return
            L_0x0025:
                r2.run()
                boolean r2 = r3.f28961W
                if (r2 == 0) goto L_0x000b
                r0.clear()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p520io.reactivex.p531y.p544g.C12498d.C12501c.run():void");
        }

        /* renamed from: a */
        public Disposable mo30298a(Runnable runnable, long j, TimeUnit timeUnit) {
            if (j <= 0) {
                return mo30296a(runnable);
            }
            if (this.f28961W) {
                return C12011d.INSTANCE;
            }
            C12014g gVar = new C12014g();
            C12014g gVar2 = new C12014g(gVar);
            C12517m mVar = new C12517m(new C12504c(gVar2, C11915a.m38459a(runnable)), this.f28963Y);
            this.f28963Y.mo30250b(mVar);
            Executor executor = this.f28959U;
            if (executor instanceof ScheduledExecutorService) {
                try {
                    mVar.mo30636a(((ScheduledExecutorService) executor).schedule(mVar, j, timeUnit));
                } catch (RejectedExecutionException e) {
                    this.f28961W = true;
                    C11915a.m38466b((Throwable) e);
                    return C12011d.INSTANCE;
                }
            } else {
                mVar.mo30636a(new C12497c(C12498d.f28952d.mo30291a(mVar, j, timeUnit)));
            }
            gVar.mo30345a(mVar);
            return gVar2;
        }
    }

    public C12498d(Executor executor, boolean z) {
        this.f28954c = executor;
        this.f28953b = z;
    }

    /* renamed from: a */
    public C11972c mo30292a() {
        return new C12501c(this.f28954c, this.f28953b);
    }

    /* renamed from: a */
    public Disposable mo30289a(Runnable runnable) {
        Runnable a = C11915a.m38459a(runnable);
        try {
            if (this.f28954c instanceof ExecutorService) {
                C12516l lVar = new C12516l(a);
                lVar.mo30600a(((ExecutorService) this.f28954c).submit(lVar));
                return lVar;
            } else if (this.f28953b) {
                C12503b bVar = new C12503b(a, null);
                this.f28954c.execute(bVar);
                return bVar;
            } else {
                C12502a aVar = new C12502a(a);
                this.f28954c.execute(aVar);
                return aVar;
            }
        } catch (RejectedExecutionException e) {
            C11915a.m38466b((Throwable) e);
            return C12011d.INSTANCE;
        }
    }

    /* renamed from: a */
    public Disposable mo30291a(Runnable runnable, long j, TimeUnit timeUnit) {
        Runnable a = C11915a.m38459a(runnable);
        if (this.f28954c instanceof ScheduledExecutorService) {
            try {
                C12516l lVar = new C12516l(a);
                lVar.mo30600a(((ScheduledExecutorService) this.f28954c).schedule(lVar, j, timeUnit));
                return lVar;
            } catch (RejectedExecutionException e) {
                C11915a.m38466b((Throwable) e);
                return C12011d.INSTANCE;
            }
        } else {
            C12500b bVar = new C12500b(a);
            bVar.f28958c.mo30345a(f28952d.mo30291a(new C12499a(bVar), j, timeUnit));
            return bVar;
        }
    }

    /* renamed from: a */
    public Disposable mo30290a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        if (!(this.f28954c instanceof ScheduledExecutorService)) {
            return super.mo30290a(runnable, j, j2, timeUnit);
        }
        try {
            C12515k kVar = new C12515k(C11915a.m38459a(runnable));
            kVar.mo30600a(((ScheduledExecutorService) this.f28954c).scheduleAtFixedRate(kVar, j, j2, timeUnit));
            return kVar;
        } catch (RejectedExecutionException e) {
            C11915a.m38466b((Throwable) e);
            return C12011d.INSTANCE;
        }
    }
}
