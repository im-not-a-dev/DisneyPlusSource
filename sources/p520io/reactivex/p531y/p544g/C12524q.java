package p520io.reactivex.p531y.p544g;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p520io.reactivex.C11969r;
import p520io.reactivex.C11969r.C11972c;
import p520io.reactivex.disposables.C11929b;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p531y.p532a.C12011d;
import p520io.reactivex.p531y.p533b.C12036b;

/* renamed from: io.reactivex.y.g.q */
/* compiled from: TrampolineScheduler */
public final class C12524q extends C11969r {

    /* renamed from: b */
    private static final C12524q f29021b = new C12524q();

    /* renamed from: io.reactivex.y.g.q$a */
    /* compiled from: TrampolineScheduler */
    static final class C12525a implements Runnable {

        /* renamed from: U */
        private final C12527c f29022U;

        /* renamed from: V */
        private final long f29023V;

        /* renamed from: c */
        private final Runnable f29024c;

        C12525a(Runnable runnable, C12527c cVar, long j) {
            this.f29024c = runnable;
            this.f29022U = cVar;
            this.f29023V = j;
        }

        public void run() {
            if (!this.f29022U.f29031W) {
                long a = this.f29022U.mo30295a(TimeUnit.MILLISECONDS);
                long j = this.f29023V;
                if (j > a) {
                    try {
                        Thread.sleep(j - a);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        C11915a.m38466b((Throwable) e);
                        return;
                    }
                }
                if (!this.f29022U.f29031W) {
                    this.f29024c.run();
                }
            }
        }
    }

    /* renamed from: io.reactivex.y.g.q$b */
    /* compiled from: TrampolineScheduler */
    static final class C12526b implements Comparable<C12526b> {

        /* renamed from: U */
        final long f29025U;

        /* renamed from: V */
        final int f29026V;

        /* renamed from: W */
        volatile boolean f29027W;

        /* renamed from: c */
        final Runnable f29028c;

        C12526b(Runnable runnable, Long l, int i) {
            this.f29028c = runnable;
            this.f29025U = l.longValue();
            this.f29026V = i;
        }

        /* renamed from: a */
        public int compareTo(C12526b bVar) {
            int a = C12036b.m38661a(this.f29025U, bVar.f29025U);
            return a == 0 ? C12036b.m38659a(this.f29026V, bVar.f29026V) : a;
        }
    }

    /* renamed from: io.reactivex.y.g.q$c */
    /* compiled from: TrampolineScheduler */
    static final class C12527c extends C11972c implements Disposable {

        /* renamed from: U */
        private final AtomicInteger f29029U = new AtomicInteger();

        /* renamed from: V */
        final AtomicInteger f29030V = new AtomicInteger();

        /* renamed from: W */
        volatile boolean f29031W;

        /* renamed from: c */
        final PriorityBlockingQueue<C12526b> f29032c = new PriorityBlockingQueue<>();

        /* renamed from: io.reactivex.y.g.q$c$a */
        /* compiled from: TrampolineScheduler */
        final class C12528a implements Runnable {

            /* renamed from: c */
            final C12526b f29034c;

            C12528a(C12526b bVar) {
                this.f29034c = bVar;
            }

            public void run() {
                C12526b bVar = this.f29034c;
                bVar.f29027W = true;
                C12527c.this.f29032c.remove(bVar);
            }
        }

        C12527c() {
        }

        /* renamed from: a */
        public Disposable mo30296a(Runnable runnable) {
            return mo30644a(runnable, mo30295a(TimeUnit.MILLISECONDS));
        }

        public void dispose() {
            this.f29031W = true;
        }

        public boolean isDisposed() {
            return this.f29031W;
        }

        /* renamed from: a */
        public Disposable mo30298a(Runnable runnable, long j, TimeUnit timeUnit) {
            long a = mo30295a(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j);
            return mo30644a(new C12525a(runnable, this, a), a);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Disposable mo30644a(Runnable runnable, long j) {
            if (this.f29031W) {
                return C12011d.INSTANCE;
            }
            C12526b bVar = new C12526b(runnable, Long.valueOf(j), this.f29030V.incrementAndGet());
            this.f29032c.add(bVar);
            if (this.f29029U.getAndIncrement() != 0) {
                return C11929b.m38492a((Runnable) new C12528a(bVar));
            }
            int i = 1;
            while (!this.f29031W) {
                C12526b bVar2 = (C12526b) this.f29032c.poll();
                if (bVar2 == null) {
                    i = this.f29029U.addAndGet(-i);
                    if (i == 0) {
                        return C12011d.INSTANCE;
                    }
                } else if (!bVar2.f29027W) {
                    bVar2.f29028c.run();
                }
            }
            this.f29032c.clear();
            return C12011d.INSTANCE;
        }
    }

    C12524q() {
    }

    /* renamed from: b */
    public static C12524q m39283b() {
        return f29021b;
    }

    /* renamed from: a */
    public C11972c mo30292a() {
        return new C12527c();
    }

    /* renamed from: a */
    public Disposable mo30289a(Runnable runnable) {
        C11915a.m38459a(runnable).run();
        return C12011d.INSTANCE;
    }

    /* renamed from: a */
    public Disposable mo30291a(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            C11915a.m38459a(runnable).run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            C11915a.m38466b((Throwable) e);
        }
        return C12011d.INSTANCE;
    }
}
