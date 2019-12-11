package kotlinx.coroutines.p595m2;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.C13145v;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import kotlinx.coroutines.C13235e2;
import kotlinx.coroutines.C13239f2;
import kotlinx.coroutines.C13292j0;
import kotlinx.coroutines.C13323k0;
import kotlinx.coroutines.internal.C13279q;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0000\u0018\u0000 U2\u00020\u00012\u00020\u0002:\u0003UVWB+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0006H\b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u001c\u001a\u00020\u00192\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001d\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0006H\b¢\u0006\u0004\b\u001d\u0010\u000eJ\u0015\u0010\u001f\u001a\b\u0018\u00010\u001eR\u00020\u0000H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u000fH\b¢\u0006\u0004\b!\u0010\u0011J\u0010\u0010\"\u001a\u00020\u0003H\b¢\u0006\u0004\b\"\u0010\u0013J-\u0010%\u001a\u00020\u000f2\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u001b\u0010(\u001a\u00020\u000f2\n\u0010'\u001a\u00060\u0014j\u0002`\u0015H\u0016¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u000fH\b¢\u0006\u0004\b*\u0010\u0011J\u0010\u0010+\u001a\u00020\u0003H\b¢\u0006\u0004\b+\u0010\u0013J\u001b\u0010-\u001a\u00020\u00032\n\u0010,\u001a\u00060\u001eR\u00020\u0000H\u0002¢\u0006\u0004\b-\u0010.J\u0015\u0010/\u001a\b\u0018\u00010\u001eR\u00020\u0000H\u0002¢\u0006\u0004\b/\u0010 J\u001b\u00100\u001a\u00020\u000f2\n\u0010,\u001a\u00060\u001eR\u00020\u0000H\u0002¢\u0006\u0004\b0\u00101J+\u00104\u001a\u00020\u000f2\n\u0010,\u001a\u00060\u001eR\u00020\u00002\u0006\u00102\u001a\u00020\u00032\u0006\u00103\u001a\u00020\u0003H\u0002¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u000fH\u0002¢\u0006\u0004\b6\u0010\u0011J\u0017\u00108\u001a\u00020\u000f2\u0006\u00107\u001a\u00020\u0019H\u0002¢\u0006\u0004\b8\u00109J\u0015\u0010;\u001a\u00020\u000f2\u0006\u0010:\u001a\u00020\u0006¢\u0006\u0004\b;\u0010<J\u001f\u0010=\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00192\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\bH\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020#H\u0002¢\u0006\u0004\bA\u0010BR\u0017\u0010\r\u001a\u00020\u00038Â\u0002@\u0002X\u0004¢\u0006\u0006\u001a\u0004\bC\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010DR\u0016\u0010F\u001a\u00020E8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0017\u0010\u001d\u001a\u00020\u00038Â\u0002@\u0002X\u0004¢\u0006\u0006\u001a\u0004\bH\u0010\u0013R\u0016\u0010J\u001a\u00020I8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010LR\u0016\u0010M\u001a\u00020#8B@\u0002X\u0004¢\u0006\u0006\u001a\u0004\bM\u0010BR\u0016\u0010\u0005\u001a\u00020\u00038\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010DR\u0016\u0010O\u001a\u00020N8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010QR\"\u0010S\u001a\u000e\u0012\n\u0012\b\u0018\u00010\u001eR\u00020\u00000R8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bS\u0010T¨\u0006X"}, mo31007d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;", "", "corePoolSize", "maxPoolSize", "", "idleWorkerKeepAliveNs", "", "schedulerName", "<init>", "(IIJLjava/lang/String;)V", "state", "blockingWorkers", "(J)I", "", "close", "()V", "createNewWorker", "()I", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlinx/coroutines/scheduling/TaskContext;", "taskContext", "Lkotlinx/coroutines/scheduling/Task;", "createTask$kotlinx_coroutines_core", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/TaskContext;)Lkotlinx/coroutines/scheduling/Task;", "createTask", "createdWorkers", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "currentWorker", "()Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "decrementBlockingWorkers", "decrementCreatedWorkers", "", "fair", "dispatch", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/TaskContext;Z)V", "command", "execute", "(Ljava/lang/Runnable;)V", "incrementBlockingWorkers", "incrementCreatedWorkers", "worker", "parkedWorkersStackNextIndex", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;)I", "parkedWorkersStackPop", "parkedWorkersStackPush", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;)V", "oldIndex", "newIndex", "parkedWorkersStackTopUpdate", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;II)V", "requestCpuWorker", "task", "runSafely", "(Lkotlinx/coroutines/scheduling/Task;)V", "timeout", "shutdown", "(J)V", "submitToLocalQueue", "(Lkotlinx/coroutines/scheduling/Task;Z)I", "toString", "()Ljava/lang/String;", "tryUnpark", "()Z", "getBlockingWorkers", "I", "Ljava/util/concurrent/Semaphore;", "cpuPermits", "Ljava/util/concurrent/Semaphore;", "getCreatedWorkers", "Lkotlinx/coroutines/scheduling/GlobalQueue;", "globalQueue", "Lkotlinx/coroutines/scheduling/GlobalQueue;", "J", "isTerminated", "Ljava/util/Random;", "random", "Ljava/util/Random;", "Ljava/lang/String;", "", "workers", "[Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "Companion", "Worker", "WorkerState", "kotlinx-coroutines-core"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: kotlinx.coroutines.m2.a */
/* compiled from: CoroutineScheduler.kt */
public final class C13345a implements Executor, Closeable {

    /* renamed from: b0 */
    private static final AtomicLongFieldUpdater f29789b0 = AtomicLongFieldUpdater.newUpdater(C13345a.class, "parkedWorkersStack");

    /* renamed from: c0 */
    static final AtomicLongFieldUpdater f29790c0 = AtomicLongFieldUpdater.newUpdater(C13345a.class, "controlState");

    /* renamed from: d0 */
    private static final AtomicIntegerFieldUpdater f29791d0 = AtomicIntegerFieldUpdater.newUpdater(C13345a.class, "_isTerminated");
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public static final int f29792e0 = C13282t.m40831a("kotlinx.coroutines.scheduler.spins", 1000, 1, 0, 8, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public static final int f29793f0 = (f29792e0 + C13282t.m40831a("kotlinx.coroutines.scheduler.yields", 0, 0, 0, 8, (Object) null));
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public static final int f29794g0 = ((int) TimeUnit.SECONDS.toNanos(1));
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public static final int f29795h0 = ((int) C12762h.m39918b(C12762h.m39915a(C13360m.f29840a / ((long) 4), 10), (long) f29794g0));
    /* access modifiers changed from: private */

    /* renamed from: i0 */
    public static final C13279q f29796i0 = new C13279q("NOT_IN_STACK");
    /* access modifiers changed from: private */

    /* renamed from: U */
    public final Semaphore f29797U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public final C13347b[] f29798V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public final Random f29799W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public final int f29800X;

    /* renamed from: Y */
    private final int f29801Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public final long f29802Z;
    private volatile int _isTerminated;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public final String f29803a0;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C13352e f29804c;
    volatile long controlState;
    private volatile long parkedWorkersStack;

    /* renamed from: kotlinx.coroutines.m2.a$a */
    /* compiled from: CoroutineScheduler.kt */
    public static final class C13346a {
        private C13346a() {
        }

        public /* synthetic */ C13346a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: kotlinx.coroutines.m2.a$b */
    /* compiled from: CoroutineScheduler.kt */
    public final class C13347b extends Thread {

        /* renamed from: a0 */
        private static final AtomicIntegerFieldUpdater f29805a0 = AtomicIntegerFieldUpdater.newUpdater(C13347b.class, "terminationState");

        /* renamed from: U */
        private long f29806U;

        /* renamed from: V */
        private long f29807V;

        /* renamed from: W */
        private int f29808W;

        /* renamed from: X */
        private int f29809X;

        /* renamed from: Y */
        private int f29810Y;

        /* renamed from: c */
        private final C13362o f29812c;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        private volatile int spins;
        private volatile C13348c state;
        private volatile int terminationState;

        private C13347b() {
            setDaemon(true);
            this.f29812c = new C13362o();
            this.state = C13348c.RETIRING;
            this.terminationState = 0;
            this.nextParkedWorker = C13345a.f29796i0;
            this.f29808W = C13345a.f29795h0;
            this.f29809X = C13345a.this.f29799W.nextInt();
        }

        /* renamed from: k */
        private final boolean m41023k() {
            C13356i a = C13345a.this.f29804c.mo34545a(C13359l.PROBABLY_BLOCKING);
            if (a == null) {
                return true;
            }
            this.f29812c.mo34555a(a, C13345a.this.f29804c);
            return false;
        }

        /* renamed from: l */
        private final void m41024l() {
            mo34529a(C13348c.PARKING);
            if (m41023k()) {
                this.terminationState = 0;
                if (this.f29806U == 0) {
                    this.f29806U = System.nanoTime() + C13345a.this.f29802Z;
                }
                if (m41021a(C13345a.this.f29802Z) && System.nanoTime() - this.f29806U >= 0) {
                    this.f29806U = 0;
                    m41028p();
                }
            }
        }

        /* renamed from: m */
        private final void m41025m() {
            int i = this.spins;
            if (i <= C13345a.f29793f0) {
                this.spins = i + 1;
                if (i >= C13345a.f29792e0) {
                    Thread.yield();
                    return;
                }
                return;
            }
            if (this.f29808W < C13345a.f29794g0) {
                this.f29808W = C12762h.m39917b((this.f29808W * 3) >>> 1, C13345a.f29794g0);
            }
            mo34529a(C13348c.PARKING);
            m41021a((long) this.f29808W);
        }

        /* renamed from: n */
        private final C13356i m41026n() {
            boolean z = mo34526a(C13345a.this.f29800X * 2) == 0;
            if (z) {
                C13356i a = C13345a.this.f29804c.mo34545a(C13359l.NON_BLOCKING);
                if (a != null) {
                    return a;
                }
            }
            C13356i b = this.f29812c.mo34557b();
            if (b != null) {
                return b;
            }
            if (!z) {
                C13356i iVar = (C13356i) C13345a.this.f29804c.mo34434c();
                if (iVar != null) {
                    return iVar;
                }
            }
            return m41027o();
        }

        /* renamed from: o */
        private final C13356i m41027o() {
            int c = C13345a.this.m41009h();
            if (c < 2) {
                return null;
            }
            int i = this.f29810Y;
            if (i == 0) {
                i = mo34526a(c);
            }
            int i2 = i + 1;
            if (i2 > c) {
                i2 = 1;
            }
            this.f29810Y = i2;
            C13347b bVar = C13345a.this.f29798V[i2];
            if (bVar == null || bVar == this || !this.f29812c.mo34556a(bVar.f29812c, C13345a.this.f29804c)) {
                return null;
            }
            return this.f29812c.mo34557b();
        }

        /* renamed from: p */
        private final void m41028p() {
            synchronized (C13345a.this.f29798V) {
                if (!C13345a.this.isTerminated()) {
                    if (C13345a.this.m41009h() > C13345a.this.f29800X) {
                        if (m41023k()) {
                            if (f29805a0.compareAndSet(this, 0, 1)) {
                                int i = this.indexInArray;
                                mo34531b(0);
                                C13345a.this.m40990a(this, i, 0);
                                int andDecrement = (int) (C13345a.f29790c0.getAndDecrement(C13345a.this) & 2097151);
                                if (andDecrement != i) {
                                    C13347b bVar = C13345a.this.f29798V[andDecrement];
                                    if (bVar != null) {
                                        C13345a.this.f29798V[i] = bVar;
                                        bVar.mo34531b(i);
                                        C13345a.this.m40990a(bVar, andDecrement, i);
                                    } else {
                                        C12880j.m40220a();
                                        throw null;
                                    }
                                }
                                C13345a.this.f29798V[andDecrement] = null;
                                C13145v vVar = C13145v.f29587a;
                                this.state = C13348c.TERMINATED;
                            }
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        public final void mo34528a(Object obj) {
            this.nextParkedWorker = obj;
        }

        /* renamed from: b */
        public final int mo34530b() {
            return this.indexInArray;
        }

        /* renamed from: c */
        public final C13362o mo34532c() {
            return this.f29812c;
        }

        /* renamed from: d */
        public final Object mo34533d() {
            return this.nextParkedWorker;
        }

        /* renamed from: e */
        public final C13345a mo34534e() {
            return C13345a.this;
        }

        /* renamed from: f */
        public final void mo34535f() {
            this.f29808W = C13345a.f29795h0;
            this.spins = 0;
        }

        /* renamed from: g */
        public final boolean mo34536g() {
            return this.state == C13348c.BLOCKING;
        }

        public final C13348c getState() {
            return this.state;
        }

        /* renamed from: h */
        public final boolean mo34538h() {
            return this.state == C13348c.PARKING;
        }

        /* renamed from: i */
        public final boolean mo34539i() {
            if (this.state == C13348c.CPU_ACQUIRED) {
                return true;
            }
            if (!C13345a.this.f29797U.tryAcquire()) {
                return false;
            }
            this.state = C13348c.CPU_ACQUIRED;
            return true;
        }

        /* renamed from: j */
        public final boolean mo34540j() {
            int i = this.terminationState;
            if (i == 1 || i == -1) {
                return false;
            }
            if (i == 0) {
                return f29805a0.compareAndSet(this, 0, -1);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid terminationState = ");
            sb.append(i);
            throw new IllegalStateException(sb.toString().toString());
        }

        public void run() {
            boolean z = false;
            while (!C13345a.this.isTerminated() && this.state != C13348c.TERMINATED) {
                C13356i a = mo34527a();
                if (a == null) {
                    if (this.state == C13348c.CPU_ACQUIRED) {
                        m41025m();
                    } else {
                        m41024l();
                    }
                    z = true;
                } else {
                    C13359l a2 = a.mo34550a();
                    if (z) {
                        m41022b(a2);
                        z = false;
                    }
                    m41020a(a2, a.f29835c);
                    C13345a.this.m40995a(a);
                    m41019a(a2);
                }
            }
            mo34529a(C13348c.TERMINATED);
        }

        /* renamed from: a */
        public final boolean mo34529a(C13348c cVar) {
            C13348c cVar2 = this.state;
            boolean z = cVar2 == C13348c.CPU_ACQUIRED;
            if (z) {
                C13345a.this.f29797U.release();
            }
            if (cVar2 != cVar) {
                this.state = cVar;
            }
            return z;
        }

        /* renamed from: b */
        public final void mo34531b(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(C13345a.this.f29803a0);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        /* renamed from: b */
        private final void m41022b(C13359l lVar) {
            this.f29806U = 0;
            this.f29810Y = 0;
            if (this.state == C13348c.PARKING) {
                if (C13292j0.m40863a()) {
                    if (!(lVar == C13359l.PROBABLY_BLOCKING)) {
                        throw new AssertionError();
                    }
                }
                this.state = C13348c.BLOCKING;
                this.f29808W = C13345a.f29795h0;
            }
            this.spins = 0;
        }

        /* renamed from: a */
        private final void m41020a(C13359l lVar, long j) {
            if (lVar != C13359l.NON_BLOCKING) {
                C13345a.f29790c0.addAndGet(C13345a.this, 2097152);
                if (mo34529a(C13348c.BLOCKING)) {
                    C13345a.this.m41013j();
                }
            } else if (C13345a.this.f29797U.availablePermits() != 0) {
                long a = C13360m.f29845f.mo34549a();
                long j2 = a - j;
                long j3 = C13360m.f29840a;
                if (j2 >= j3 && a - this.f29807V >= j3 * ((long) 5)) {
                    this.f29807V = a;
                    C13345a.this.m41013j();
                }
            }
        }

        public C13347b(C13345a aVar, int i) {
            this();
            mo34531b(i);
        }

        /* renamed from: a */
        private final void m41019a(C13359l lVar) {
            if (lVar != C13359l.NON_BLOCKING) {
                C13345a.f29790c0.addAndGet(C13345a.this, -2097152);
                C13348c cVar = this.state;
                if (cVar != C13348c.TERMINATED) {
                    if (C13292j0.m40863a()) {
                        if (!(cVar == C13348c.BLOCKING)) {
                            throw new AssertionError();
                        }
                    }
                    this.state = C13348c.RETIRING;
                }
            }
        }

        /* renamed from: a */
        public final int mo34526a(int i) {
            int i2 = this.f29809X;
            this.f29809X = i2 ^ (i2 << 13);
            int i3 = this.f29809X;
            this.f29809X = i3 ^ (i3 >> 17);
            int i4 = this.f29809X;
            this.f29809X = i4 ^ (i4 << 5);
            int i5 = i - 1;
            if ((i5 & i) == 0) {
                return this.f29809X & i5;
            }
            return (this.f29809X & Integer.MAX_VALUE) % i;
        }

        /* renamed from: a */
        private final boolean m41021a(long j) {
            C13345a.this.m40998b(this);
            if (!m41023k()) {
                return false;
            }
            LockSupport.parkNanos(j);
            return true;
        }

        /* renamed from: a */
        public final C13356i mo34527a() {
            if (mo34539i()) {
                return m41026n();
            }
            C13356i b = this.f29812c.mo34557b();
            if (b == null) {
                b = C13345a.this.f29804c.mo34545a(C13359l.PROBABLY_BLOCKING);
            }
            return b;
        }
    }

    /* renamed from: kotlinx.coroutines.m2.a$c */
    /* compiled from: CoroutineScheduler.kt */
    public enum C13348c {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        RETIRING,
        TERMINATED
    }

    static {
        new C13346a(null);
    }

    public C13345a(int i, int i2, long j, String str) {
        this.f29800X = i;
        this.f29801Y = i2;
        this.f29802Z = j;
        this.f29803a0 = str;
        if (this.f29800X >= 1) {
            String str2 = "Max pool size ";
            if (this.f29801Y >= this.f29800X) {
                if (this.f29801Y <= 2097150) {
                    if (this.f29802Z > 0) {
                        this.f29804c = new C13352e();
                        this.f29797U = new Semaphore(this.f29800X, false);
                        this.parkedWorkersStack = 0;
                        this.f29798V = new C13347b[(this.f29801Y + 1)];
                        this.controlState = 0;
                        this.f29799W = new Random();
                        this._isTerminated = 0;
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Idle worker keep alive time ");
                    sb.append(this.f29802Z);
                    sb.append(" must be positive");
                    throw new IllegalArgumentException(sb.toString().toString());
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(this.f29801Y);
                sb2.append(" should not exceed maximal supported number of threads 2097150");
                throw new IllegalArgumentException(sb2.toString().toString());
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str2);
            sb3.append(this.f29801Y);
            sb3.append(" should be greater than or equals to core pool size ");
            sb3.append(this.f29800X);
            throw new IllegalArgumentException(sb3.toString().toString());
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Core pool size ");
        sb4.append(this.f29800X);
        sb4.append(" should be at least 1");
        throw new IllegalArgumentException(sb4.toString().toString());
    }

    /* access modifiers changed from: private */
    public final boolean isTerminated() {
        return this._isTerminated != 0;
    }

    /* renamed from: k */
    private final boolean m41015k() {
        while (true) {
            C13347b i = m41011i();
            if (i == null) {
                return false;
            }
            i.mo34535f();
            boolean h = i.mo34538h();
            LockSupport.unpark(i);
            if (h && i.mo34540j()) {
                return true;
            }
        }
    }

    public void close() {
        mo34521a(10000);
    }

    public void execute(Runnable runnable) {
        m40991a(this, runnable, null, false, 6, null);
    }

    public String toString() {
        C13347b[] bVarArr;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (C13347b bVar : this.f29798V) {
            if (bVar != null) {
                int c = bVar.mo34532c().mo34559c();
                int i6 = C13349b.$EnumSwitchMapping$0[bVar.getState().ordinal()];
                if (i6 == 1) {
                    i3++;
                } else if (i6 == 2) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(String.valueOf(c));
                    sb.append("b");
                    arrayList.add(sb.toString());
                } else if (i6 == 3) {
                    i++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(String.valueOf(c));
                    sb2.append("c");
                    arrayList.add(sb2.toString());
                } else if (i6 == 4) {
                    i4++;
                    if (c > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(String.valueOf(c));
                        sb3.append("r");
                        arrayList.add(sb3.toString());
                    }
                } else if (i6 == 5) {
                    i5++;
                }
            }
        }
        long j = this.controlState;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f29803a0);
        sb4.append('@');
        sb4.append(C13323k0.m40939b(this));
        sb4.append('[');
        sb4.append("Pool Size {");
        sb4.append("core = ");
        sb4.append(this.f29800X);
        String str = ", ";
        sb4.append(str);
        sb4.append("max = ");
        sb4.append(this.f29801Y);
        String str2 = "}, ";
        sb4.append(str2);
        sb4.append("Worker States {");
        sb4.append("CPU = ");
        sb4.append(i);
        sb4.append(str);
        String str3 = "blocking = ";
        sb4.append(str3);
        sb4.append(i2);
        sb4.append(str);
        sb4.append("parked = ");
        sb4.append(i3);
        sb4.append(str);
        sb4.append("retired = ");
        sb4.append(i4);
        sb4.append(str);
        sb4.append("terminated = ");
        sb4.append(i5);
        sb4.append(str2);
        sb4.append("running workers queues = ");
        sb4.append(arrayList);
        sb4.append(str);
        sb4.append("global queue size = ");
        sb4.append(this.f29804c.mo34433b());
        sb4.append(str);
        sb4.append("Control State Workers {");
        sb4.append("created = ");
        sb4.append((int) (2097151 & j));
        sb4.append(str);
        sb4.append(str3);
        sb4.append((int) ((j & 4398044413952L) >> 21));
        sb4.append('}');
        sb4.append("]");
        return sb4.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x007c, code lost:
        return 0;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m41005f() {
        /*
            r10 = this;
            kotlinx.coroutines.m2.a$b[] r0 = r10.f29798V
            monitor-enter(r0)
            boolean r1 = r10.isTerminated()     // Catch:{ all -> 0x007d }
            if (r1 == 0) goto L_0x000c
            r1 = -1
            monitor-exit(r0)
            return r1
        L_0x000c:
            long r1 = r10.controlState     // Catch:{ all -> 0x007d }
            r3 = 2097151(0x1fffff, double:1.0361303E-317)
            long r5 = r1 & r3
            int r6 = (int) r5     // Catch:{ all -> 0x007d }
            r7 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r1 = r1 & r7
            r5 = 21
            long r1 = r1 >> r5
            int r2 = (int) r1     // Catch:{ all -> 0x007d }
            int r1 = r6 - r2
            int r2 = r10.f29800X     // Catch:{ all -> 0x007d }
            r5 = 0
            if (r1 < r2) goto L_0x0027
            monitor-exit(r0)
            return r5
        L_0x0027:
            int r2 = r10.f29801Y     // Catch:{ all -> 0x007d }
            if (r6 >= r2) goto L_0x007b
            java.util.concurrent.Semaphore r2 = r10.f29797U     // Catch:{ all -> 0x007d }
            int r2 = r2.availablePermits()     // Catch:{ all -> 0x007d }
            if (r2 != 0) goto L_0x0034
            goto L_0x007b
        L_0x0034:
            long r6 = r10.controlState     // Catch:{ all -> 0x007d }
            long r6 = r6 & r3
            int r2 = (int) r6     // Catch:{ all -> 0x007d }
            r6 = 1
            int r2 = r2 + r6
            if (r2 <= 0) goto L_0x0044
            kotlinx.coroutines.m2.a$b[] r7 = r10.f29798V     // Catch:{ all -> 0x007d }
            r7 = r7[r2]     // Catch:{ all -> 0x007d }
            if (r7 != 0) goto L_0x0044
            r7 = 1
            goto L_0x0045
        L_0x0044:
            r7 = 0
        L_0x0045:
            if (r7 == 0) goto L_0x006f
            kotlinx.coroutines.m2.a$b r7 = new kotlinx.coroutines.m2.a$b     // Catch:{ all -> 0x007d }
            r7.<init>(r10, r2)     // Catch:{ all -> 0x007d }
            r7.start()     // Catch:{ all -> 0x007d }
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = f29790c0     // Catch:{ all -> 0x007d }
            long r8 = r8.incrementAndGet(r10)     // Catch:{ all -> 0x007d }
            long r3 = r3 & r8
            int r4 = (int) r3     // Catch:{ all -> 0x007d }
            if (r2 != r4) goto L_0x005a
            r5 = 1
        L_0x005a:
            if (r5 == 0) goto L_0x0063
            kotlinx.coroutines.m2.a$b[] r3 = r10.f29798V     // Catch:{ all -> 0x007d }
            r3[r2] = r7     // Catch:{ all -> 0x007d }
            int r1 = r1 + r6
            monitor-exit(r0)
            return r1
        L_0x0063:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x007d }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x007d }
            r2.<init>(r1)     // Catch:{ all -> 0x007d }
            throw r2     // Catch:{ all -> 0x007d }
        L_0x006f:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x007d }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x007d }
            r2.<init>(r1)     // Catch:{ all -> 0x007d }
            throw r2     // Catch:{ all -> 0x007d }
        L_0x007b:
            monitor-exit(r0)
            return r5
        L_0x007d:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p595m2.C13345a.m41005f():int");
    }

    /* renamed from: g */
    private final C13347b m41008g() {
        Thread currentThread = Thread.currentThread();
        if (!(currentThread instanceof C13347b)) {
            currentThread = null;
        }
        C13347b bVar = (C13347b) currentThread;
        if (bVar == null || !C12880j.m40224a((Object) bVar.mo34534e(), (Object) this)) {
            return null;
        }
        return bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final int m41009h() {
        return (int) (this.controlState & 2097151);
    }

    /* renamed from: i */
    private final C13347b m41011i() {
        while (true) {
            long j = this.parkedWorkersStack;
            C13347b bVar = this.f29798V[(int) (2097151 & j)];
            if (bVar == null) {
                return null;
            }
            long j2 = (2097152 + j) & -2097152;
            int a = m40987a(bVar);
            if (a >= 0) {
                if (f29789b0.compareAndSet(this, j, ((long) a) | j2)) {
                    bVar.mo34528a((Object) f29796i0);
                    return bVar;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final void m41013j() {
        if (this.f29797U.availablePermits() == 0) {
            m41015k();
        } else if (!m41015k()) {
            long j = this.controlState;
            if (((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21)) < this.f29800X) {
                int f = m41005f();
                if (f == 1 && this.f29800X > 1) {
                    m41005f();
                }
                if (f > 0) {
                    return;
                }
            }
            m41015k();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m40998b(C13347b bVar) {
        long j;
        long j2;
        int b;
        if (bVar.mo34533d() == f29796i0) {
            do {
                j = this.parkedWorkersStack;
                int i = (int) (2097151 & j);
                j2 = (2097152 + j) & -2097152;
                b = bVar.mo34530b();
                if (C13292j0.m40863a()) {
                    if (!(b != 0)) {
                        throw new AssertionError();
                    }
                }
                bVar.mo34528a((Object) this.f29798V[i]);
            } while (!f29789b0.compareAndSet(this, j, ((long) b) | j2));
        }
    }

    /* renamed from: a */
    private final int m40987a(C13347b bVar) {
        Object d = bVar.mo34533d();
        while (d != f29796i0) {
            if (d == null) {
                return 0;
            }
            C13347b bVar2 = (C13347b) d;
            int b = bVar2.mo34530b();
            if (b != 0) {
                return b;
            }
            d = bVar2.mo34533d();
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006a, code lost:
        if (r9 != null) goto L_0x0075;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo34521a(long r9) {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f29791d0
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            kotlinx.coroutines.m2.a$b r0 = r8.m41008g()
            kotlinx.coroutines.m2.a$b[] r3 = r8.f29798V
            monitor-enter(r3)
            long r4 = r8.controlState     // Catch:{ all -> 0x00a3 }
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r5 = (int) r4
            monitor-exit(r3)
            if (r2 > r5) goto L_0x005f
            r3 = 1
        L_0x001d:
            kotlinx.coroutines.m2.a$b[] r4 = r8.f29798V
            r4 = r4[r3]
            if (r4 == 0) goto L_0x005a
            if (r4 == r0) goto L_0x0055
        L_0x0025:
            boolean r6 = r4.isAlive()
            if (r6 == 0) goto L_0x0032
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r4.join(r9)
            goto L_0x0025
        L_0x0032:
            kotlinx.coroutines.m2.a$c r6 = r4.getState()
            boolean r7 = kotlinx.coroutines.C13292j0.m40863a()
            if (r7 == 0) goto L_0x004c
            kotlinx.coroutines.m2.a$c r7 = kotlinx.coroutines.p595m2.C13345a.C13348c.TERMINATED
            if (r6 != r7) goto L_0x0042
            r6 = 1
            goto L_0x0043
        L_0x0042:
            r6 = 0
        L_0x0043:
            if (r6 == 0) goto L_0x0046
            goto L_0x004c
        L_0x0046:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            r9.<init>()
            throw r9
        L_0x004c:
            kotlinx.coroutines.m2.o r4 = r4.mo34532c()
            kotlinx.coroutines.m2.e r6 = r8.f29804c
            r4.mo34554a(r6)
        L_0x0055:
            if (r3 == r5) goto L_0x005f
            int r3 = r3 + 1
            goto L_0x001d
        L_0x005a:
            kotlin.jvm.internal.C12880j.m40220a()
            r9 = 0
            throw r9
        L_0x005f:
            kotlinx.coroutines.m2.e r9 = r8.f29804c
            r9.mo34431a()
        L_0x0064:
            if (r0 == 0) goto L_0x006d
            kotlinx.coroutines.m2.i r9 = r0.mo34527a()
            if (r9 == 0) goto L_0x006d
            goto L_0x0075
        L_0x006d:
            kotlinx.coroutines.m2.e r9 = r8.f29804c
            java.lang.Object r9 = r9.mo34434c()
            kotlinx.coroutines.m2.i r9 = (kotlinx.coroutines.p595m2.C13356i) r9
        L_0x0075:
            if (r9 == 0) goto L_0x007b
            r8.m40995a(r9)
            goto L_0x0064
        L_0x007b:
            if (r0 == 0) goto L_0x0082
            kotlinx.coroutines.m2.a$c r9 = kotlinx.coroutines.p595m2.C13345a.C13348c.TERMINATED
            r0.mo34529a(r9)
        L_0x0082:
            boolean r9 = kotlinx.coroutines.C13292j0.m40863a()
            if (r9 == 0) goto L_0x009c
            java.util.concurrent.Semaphore r9 = r8.f29797U
            int r9 = r9.availablePermits()
            int r10 = r8.f29800X
            if (r9 != r10) goto L_0x0093
            r1 = 1
        L_0x0093:
            if (r1 == 0) goto L_0x0096
            goto L_0x009c
        L_0x0096:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            r9.<init>()
            throw r9
        L_0x009c:
            r9 = 0
            r8.parkedWorkersStack = r9
            r8.controlState = r9
            return
        L_0x00a3:
            r9 = move-exception
            monitor-exit(r3)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p595m2.C13345a.mo34521a(long):void");
    }

    /* renamed from: a */
    public static /* synthetic */ void m40991a(C13345a aVar, Runnable runnable, C13357j jVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            jVar = C13355h.f29832U;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        aVar.mo34522a(runnable, jVar, z);
    }

    /* renamed from: a */
    public final void mo34522a(Runnable runnable, C13357j jVar, boolean z) {
        C13235e2 a = C13239f2.m40692a();
        if (a != null) {
            a.mo34380e();
        }
        C13356i a2 = mo34520a(runnable, jVar);
        int a3 = m40989a(a2, z);
        if (a3 != -1) {
            if (a3 != 1) {
                m41013j();
            } else if (this.f29804c.mo34432a(a2)) {
                m41013j();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f29803a0);
                sb.append(" was terminated");
                throw new RejectedExecutionException(sb.toString());
            }
        }
    }

    /* renamed from: a */
    public final C13356i mo34520a(Runnable runnable, C13357j jVar) {
        long a = C13360m.f29845f.mo34549a();
        if (!(runnable instanceof C13356i)) {
            return new C13358k(runnable, a, jVar);
        }
        C13356i iVar = (C13356i) runnable;
        iVar.f29835c = a;
        iVar.f29834U = jVar;
        return iVar;
    }

    /* renamed from: a */
    private final int m40989a(C13356i iVar, boolean z) {
        boolean z2;
        C13347b g = m41008g();
        if (g == null || g.getState() == C13348c.TERMINATED) {
            return 1;
        }
        int i = -1;
        if (iVar.mo34550a() == C13359l.NON_BLOCKING) {
            if (g.mo34536g()) {
                i = 0;
            } else if (!g.mo34539i()) {
                return 1;
            }
        }
        if (z) {
            z2 = g.mo34532c().mo34558b(iVar, this.f29804c);
        } else {
            z2 = g.mo34532c().mo34555a(iVar, this.f29804c);
        }
        if (!z2 || g.mo34532c().mo34553a() > C13360m.f29841b) {
            return 0;
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m40995a(C13356i iVar) {
        C13235e2 a;
        try {
            iVar.run();
            a = C13239f2.m40692a();
            if (a == null) {
                return;
            }
        } catch (Throwable th) {
            C13235e2 a2 = C13239f2.m40692a();
            if (a2 != null) {
                a2.mo34378c();
            }
            throw th;
        }
        a.mo34378c();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m40990a(C13347b bVar, int i, int i2) {
        while (true) {
            long j = this.parkedWorkersStack;
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & -2097152;
            int i4 = i3 == i ? i2 == 0 ? m40987a(bVar) : i2 : i3;
            if (i4 >= 0) {
                if (f29789b0.compareAndSet(this, j, j2 | ((long) i4))) {
                    return;
                }
            }
        }
    }
}
