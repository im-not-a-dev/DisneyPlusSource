package p520io.reactivex.p531y.p544g;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11969r;
import p520io.reactivex.C11969r.C11972c;
import p520io.reactivex.disposables.CompositeDisposable;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p531y.p532a.C12011d;
import p520io.reactivex.p531y.p532a.C12012e;

/* renamed from: io.reactivex.y.g.b */
/* compiled from: ComputationScheduler */
public final class C12493b extends C11969r implements C12518n {

    /* renamed from: d */
    static final C12495b f28937d = new C12495b(0, f28938e);

    /* renamed from: e */
    static final C12513j f28938e = new C12513j("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);

    /* renamed from: f */
    static final int f28939f = m39237a(Runtime.getRuntime().availableProcessors(), Integer.getInteger("rx2.computation-threads", 0).intValue());

    /* renamed from: g */
    static final C12496c f28940g = new C12496c(new C12513j("RxComputationShutdown"));

    /* renamed from: b */
    final ThreadFactory f28941b;

    /* renamed from: c */
    final AtomicReference<C12495b> f28942c;

    /* renamed from: io.reactivex.y.g.b$a */
    /* compiled from: ComputationScheduler */
    static final class C12494a extends C11972c {

        /* renamed from: U */
        private final CompositeDisposable f28943U = new CompositeDisposable();

        /* renamed from: V */
        private final C12012e f28944V = new C12012e();

        /* renamed from: W */
        private final C12496c f28945W;

        /* renamed from: X */
        volatile boolean f28946X;

        /* renamed from: c */
        private final C12012e f28947c = new C12012e();

        C12494a(C12496c cVar) {
            this.f28945W = cVar;
            this.f28944V.mo30250b(this.f28947c);
            this.f28944V.mo30250b(this.f28943U);
        }

        /* renamed from: a */
        public Disposable mo30296a(Runnable runnable) {
            if (this.f28946X) {
                return C12011d.INSTANCE;
            }
            return this.f28945W.mo30628a(runnable, 0, TimeUnit.MILLISECONDS, this.f28947c);
        }

        public void dispose() {
            if (!this.f28946X) {
                this.f28946X = true;
                this.f28944V.dispose();
            }
        }

        public boolean isDisposed() {
            return this.f28946X;
        }

        /* renamed from: a */
        public Disposable mo30298a(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f28946X) {
                return C12011d.INSTANCE;
            }
            return this.f28945W.mo30628a(runnable, j, timeUnit, this.f28943U);
        }
    }

    /* renamed from: io.reactivex.y.g.b$b */
    /* compiled from: ComputationScheduler */
    static final class C12495b implements C12518n {

        /* renamed from: a */
        final int f28948a;

        /* renamed from: b */
        final C12496c[] f28949b;

        /* renamed from: c */
        long f28950c;

        C12495b(int i, ThreadFactory threadFactory) {
            this.f28948a = i;
            this.f28949b = new C12496c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.f28949b[i2] = new C12496c(threadFactory);
            }
        }

        /* renamed from: a */
        public C12496c mo30602a() {
            int i = this.f28948a;
            if (i == 0) {
                return C12493b.f28940g;
            }
            C12496c[] cVarArr = this.f28949b;
            long j = this.f28950c;
            this.f28950c = 1 + j;
            return cVarArr[(int) (j % ((long) i))];
        }

        /* renamed from: b */
        public void mo30603b() {
            for (C12496c dispose : this.f28949b) {
                dispose.dispose();
            }
        }
    }

    /* renamed from: io.reactivex.y.g.b$c */
    /* compiled from: ComputationScheduler */
    static final class C12496c extends C12511h {
        C12496c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        f28940g.dispose();
        f28937d.mo30603b();
    }

    public C12493b() {
        this(f28938e);
    }

    /* renamed from: a */
    static int m39237a(int i, int i2) {
        return (i2 <= 0 || i2 > i) ? i : i2;
    }

    /* renamed from: a */
    public C11972c mo30292a() {
        return new C12494a(((C12495b) this.f28942c.get()).mo30602a());
    }

    /* renamed from: b */
    public void mo30601b() {
        C12495b bVar = new C12495b(f28939f, this.f28941b);
        if (!this.f28942c.compareAndSet(f28937d, bVar)) {
            bVar.mo30603b();
        }
    }

    public C12493b(ThreadFactory threadFactory) {
        this.f28941b = threadFactory;
        this.f28942c = new AtomicReference<>(f28937d);
        mo30601b();
    }

    /* renamed from: a */
    public Disposable mo30291a(Runnable runnable, long j, TimeUnit timeUnit) {
        return ((C12495b) this.f28942c.get()).mo30602a().mo30631b(runnable, j, timeUnit);
    }

    /* renamed from: a */
    public Disposable mo30290a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return ((C12495b) this.f28942c.get()).mo30602a().mo30630b(runnable, j, j2, timeUnit);
    }
}
