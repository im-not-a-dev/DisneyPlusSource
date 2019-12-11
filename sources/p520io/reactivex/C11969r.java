package p520io.reactivex;

import java.util.concurrent.TimeUnit;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p525e0.C11933a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12011d;
import p520io.reactivex.p531y.p532a.C12014g;
import p520io.reactivex.p531y.p544g.C12511h;
import p520io.reactivex.p531y.p547j.C12548h;

/* renamed from: io.reactivex.r */
/* compiled from: Scheduler */
public abstract class C11969r {

    /* renamed from: a */
    static final long f27651a = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    /* renamed from: io.reactivex.r$a */
    /* compiled from: Scheduler */
    static final class C11970a implements Disposable, Runnable, C11933a {

        /* renamed from: U */
        final C11972c f27652U;

        /* renamed from: V */
        Thread f27653V;

        /* renamed from: c */
        final Runnable f27654c;

        C11970a(Runnable runnable, C11972c cVar) {
            this.f27654c = runnable;
            this.f27652U = cVar;
        }

        public void dispose() {
            if (this.f27653V == Thread.currentThread()) {
                C11972c cVar = this.f27652U;
                if (cVar instanceof C12511h) {
                    ((C12511h) cVar).mo30629a();
                    return;
                }
            }
            this.f27652U.dispose();
        }

        public boolean isDisposed() {
            return this.f27652U.isDisposed();
        }

        public void run() {
            this.f27653V = Thread.currentThread();
            try {
                this.f27654c.run();
            } finally {
                dispose();
                this.f27653V = null;
            }
        }
    }

    /* renamed from: io.reactivex.r$b */
    /* compiled from: Scheduler */
    static final class C11971b implements Disposable, Runnable, C11933a {

        /* renamed from: U */
        final C11972c f27655U;

        /* renamed from: V */
        volatile boolean f27656V;

        /* renamed from: c */
        final Runnable f27657c;

        C11971b(Runnable runnable, C11972c cVar) {
            this.f27657c = runnable;
            this.f27655U = cVar;
        }

        public void dispose() {
            this.f27656V = true;
            this.f27655U.dispose();
        }

        public boolean isDisposed() {
            return this.f27656V;
        }

        public void run() {
            if (!this.f27656V) {
                try {
                    this.f27657c.run();
                } catch (Throwable th) {
                    C12003b.m38614b(th);
                    this.f27655U.dispose();
                    throw C12548h.m39353b(th);
                }
            }
        }
    }

    /* renamed from: io.reactivex.r$c */
    /* compiled from: Scheduler */
    public static abstract class C11972c implements Disposable {

        /* renamed from: io.reactivex.r$c$a */
        /* compiled from: Scheduler */
        final class C11973a implements Runnable, C11933a {

            /* renamed from: U */
            final C12014g f27658U;

            /* renamed from: V */
            final long f27659V;

            /* renamed from: W */
            long f27660W;

            /* renamed from: X */
            long f27661X;

            /* renamed from: Y */
            long f27662Y;

            /* renamed from: c */
            final Runnable f27664c;

            C11973a(long j, Runnable runnable, long j2, C12014g gVar, long j3) {
                this.f27664c = runnable;
                this.f27658U = gVar;
                this.f27659V = j3;
                this.f27661X = j2;
                this.f27662Y = j;
            }

            public void run() {
                long j;
                this.f27664c.run();
                if (!this.f27658U.isDisposed()) {
                    long a = C11972c.this.mo30295a(TimeUnit.NANOSECONDS);
                    long j2 = C11969r.f27651a;
                    long j3 = a + j2;
                    long j4 = this.f27661X;
                    if (j3 >= j4) {
                        long j5 = this.f27659V;
                        if (a < j4 + j5 + j2) {
                            long j6 = this.f27662Y;
                            long j7 = this.f27660W + 1;
                            this.f27660W = j7;
                            j = j6 + (j7 * j5);
                            this.f27661X = a;
                            this.f27658U.mo30345a(C11972c.this.mo30298a(this, j - a, TimeUnit.NANOSECONDS));
                        }
                    }
                    long j8 = this.f27659V;
                    long j9 = a + j8;
                    long j10 = this.f27660W + 1;
                    this.f27660W = j10;
                    this.f27662Y = j9 - (j8 * j10);
                    j = j9;
                    this.f27661X = a;
                    this.f27658U.mo30345a(C11972c.this.mo30298a(this, j - a, TimeUnit.NANOSECONDS));
                }
            }
        }

        /* renamed from: a */
        public Disposable mo30296a(Runnable runnable) {
            return mo30298a(runnable, 0, TimeUnit.NANOSECONDS);
        }

        /* renamed from: a */
        public abstract Disposable mo30298a(Runnable runnable, long j, TimeUnit timeUnit);

        /* renamed from: a */
        public Disposable mo30297a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            long j3 = j;
            TimeUnit timeUnit2 = timeUnit;
            C12014g gVar = new C12014g();
            C12014g gVar2 = new C12014g(gVar);
            Runnable a = C11915a.m38459a(runnable);
            long nanos = timeUnit2.toNanos(j2);
            long a2 = mo30295a(TimeUnit.NANOSECONDS);
            C12014g gVar3 = gVar;
            C11973a aVar = r0;
            C11973a aVar2 = new C11973a(a2 + timeUnit2.toNanos(j3), a, a2, gVar2, nanos);
            Disposable a3 = mo30298a(aVar, j3, timeUnit2);
            if (a3 == C12011d.INSTANCE) {
                return a3;
            }
            gVar3.mo30345a(a3);
            return gVar2;
        }

        /* renamed from: a */
        public long mo30295a(TimeUnit timeUnit) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: a */
    public Disposable mo30289a(Runnable runnable) {
        return mo30291a(runnable, 0, TimeUnit.NANOSECONDS);
    }

    /* renamed from: a */
    public abstract C11972c mo30292a();

    /* renamed from: a */
    public Disposable mo30291a(Runnable runnable, long j, TimeUnit timeUnit) {
        C11972c a = mo30292a();
        C11970a aVar = new C11970a(C11915a.m38459a(runnable), a);
        a.mo30298a(aVar, j, timeUnit);
        return aVar;
    }

    /* renamed from: a */
    public Disposable mo30290a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        C11972c a = mo30292a();
        C11971b bVar = new C11971b(C11915a.m38459a(runnable), a);
        Disposable a2 = a.mo30297a(bVar, j, j2, timeUnit);
        return a2 == C12011d.INSTANCE ? a2 : bVar;
    }
}
