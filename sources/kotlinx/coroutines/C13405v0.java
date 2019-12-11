package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import kotlin.p573a0.C12688f;
import kotlinx.coroutines.internal.C13271k;
import kotlinx.coroutines.internal.C13288v;
import kotlinx.coroutines.internal.C13289w;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b \u0018\u00002\u00020\u00012\u00020\u0002:\u00044567B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\bH\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\r\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\u00052\n\u0010\u0010\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0014\u001a\u00020\u00132\n\u0010\u0010\u001a\u00060\u0007j\u0002`\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001a\u001a\u00020\u0005H\u0004¢\u0006\u0004\b\u001a\u0010\u0004J\u001d\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b!\u0010\"J#\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\u00162\n\u0010\r\u001a\u00060\u0007j\u0002`\bH\u0004¢\u0006\u0004\b%\u0010&J%\u0010)\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u00162\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050'H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u001cH\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0005H\u0014¢\u0006\u0004\b-\u0010\u0004R\u0016\u0010.\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u00138T@\u0014X\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0016\u00103\u001a\u00020\u00168T@\u0014X\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u0018¨\u00068"}, mo31007d2 = {"Lkotlinx/coroutines/EventLoopImplBase;", "Lkotlinx/coroutines/EventLoopImplPlatform;", "Lkotlinx/coroutines/Delay;", "<init>", "()V", "", "closeQueue", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "dequeue", "()Ljava/lang/Runnable;", "Lkotlin/coroutines/CoroutineContext;", "context", "block", "dispatch", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "task", "enqueue", "(Ljava/lang/Runnable;)V", "", "enqueueImpl", "(Ljava/lang/Runnable;)Z", "", "processNextEvent", "()J", "rescheduleAllDelayed", "resetAll", "now", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "delayedTask", "schedule", "(JLkotlinx/coroutines/EventLoopImplBase$DelayedTask;)V", "", "scheduleImpl", "(JLkotlinx/coroutines/EventLoopImplBase$DelayedTask;)I", "timeMillis", "Lkotlinx/coroutines/DisposableHandle;", "scheduleInvokeOnTimeout", "(JLjava/lang/Runnable;)Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/CancellableContinuation;", "continuation", "scheduleResumeAfterDelay", "(JLkotlinx/coroutines/CancellableContinuation;)V", "shouldUnpark", "(Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;)Z", "shutdown", "isCompleted", "Z", "isEmpty", "()Z", "getNextTime", "nextTime", "DelayedResumeTask", "DelayedRunnableTask", "DelayedTask", "DelayedTaskQueue", "kotlinx-coroutines-core"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: kotlinx.coroutines.v0 */
/* compiled from: EventLoop.common.kt */
public abstract class C13405v0 extends C13410w0 implements C13343m0 {

    /* renamed from: W */
    private static final AtomicReferenceFieldUpdater f29904W;

    /* renamed from: X */
    private static final AtomicReferenceFieldUpdater f29905X;
    private volatile Object _delayed = null;
    private volatile Object _queue = null;
    /* access modifiers changed from: private */
    public volatile boolean isCompleted;

    /* renamed from: kotlinx.coroutines.v0$a */
    /* compiled from: EventLoop.common.kt */
    public static abstract class C13406a implements Runnable, Comparable<C13406a>, C13396s0, C13289w {

        /* renamed from: U */
        private int f29906U;

        /* renamed from: V */
        public long f29907V;

        /* renamed from: c */
        private Object f29908c;

        /* renamed from: a */
        public C13288v<?> mo34461a() {
            Object obj = this.f29908c;
            if (!(obj instanceof C13288v)) {
                obj = null;
            }
            return (C13288v) obj;
        }

        public final synchronized void dispose() {
            Object obj = this.f29908c;
            if (obj != C13416y0.f29912a) {
                if (!(obj instanceof C13407b)) {
                    obj = null;
                }
                C13407b bVar = (C13407b) obj;
                if (bVar != null) {
                    bVar.mo34457b(this);
                }
                this.f29908c = C13416y0.f29912a;
            }
        }

        public int getIndex() {
            return this.f29906U;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Delayed[nanos=");
            sb.append(this.f29907V);
            sb.append(']');
            return sb.toString();
        }

        /* renamed from: a */
        public void mo34463a(C13288v<?> vVar) {
            if (this.f29908c != C13416y0.f29912a) {
                this.f29908c = vVar;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* renamed from: a */
        public void mo34462a(int i) {
            this.f29906U = i;
        }

        /* renamed from: a */
        public int compareTo(C13406a aVar) {
            int i = ((this.f29907V - aVar.f29907V) > 0 ? 1 : ((this.f29907V - aVar.f29907V) == 0 ? 0 : -1));
            if (i > 0) {
                return 1;
            }
            return i < 0 ? -1 : 0;
        }

        /* renamed from: a */
        public final boolean mo34624a(long j) {
            return j - this.f29907V >= 0;
        }

        /* renamed from: a */
        public final synchronized int mo34622a(long j, C13407b bVar, C13405v0 v0Var) {
            if (this.f29908c == C13416y0.f29912a) {
                return 2;
            }
            synchronized (bVar) {
                C13406a aVar = (C13406a) bVar.mo34453a();
                if (v0Var.isCompleted) {
                    return 1;
                }
                if (aVar == null) {
                    bVar.f29909b = j;
                } else {
                    long j2 = aVar.f29907V;
                    if (j2 - j < 0) {
                        j = j2;
                    }
                    if (j - bVar.f29909b > 0) {
                        bVar.f29909b = j;
                    }
                }
                if (this.f29907V - bVar.f29909b < 0) {
                    this.f29907V = bVar.f29909b;
                }
                bVar.mo34455a(this);
                return 0;
            }
        }
    }

    /* renamed from: kotlinx.coroutines.v0$b */
    /* compiled from: EventLoop.common.kt */
    public static final class C13407b extends C13288v<C13406a> {

        /* renamed from: b */
        public long f29909b;

        public C13407b(long j) {
            this.f29909b = j;
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<C13405v0> cls2 = C13405v0.class;
        f29904W = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_queue");
        f29905X = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_delayed");
    }

    /* renamed from: c */
    private final int m41240c(long j, C13406a aVar) {
        if (this.isCompleted) {
            return 1;
        }
        C13407b bVar = (C13407b) this._delayed;
        if (bVar == null) {
            f29905X.compareAndSet(this, null, new C13407b(j));
            Object obj = this._delayed;
            if (obj != null) {
                bVar = (C13407b) obj;
            } else {
                C12880j.m40220a();
                throw null;
            }
        }
        return aVar.mo34622a(j, bVar, this);
    }

    /* renamed from: o */
    private final void m41241o() {
        if (!C13292j0.m40863a() || this.isCompleted) {
            while (true) {
                Object obj = this._queue;
                if (obj == null) {
                    if (f29904W.compareAndSet(this, null, C13416y0.f29913b)) {
                        return;
                    }
                } else if (obj instanceof C13271k) {
                    ((C13271k) obj).mo34436a();
                    return;
                } else if (obj != C13416y0.f29913b) {
                    C13271k kVar = new C13271k(8, true);
                    if (obj != null) {
                        kVar.mo34435a((Runnable) obj);
                        if (f29904W.compareAndSet(this, obj, kVar)) {
                            return;
                        }
                    } else {
                        throw new C13142s("null cannot be cast to non-null type kotlinx.coroutines.Runnable /* = java.lang.Runnable */");
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: p */
    private final Runnable m41242p() {
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (obj instanceof C13271k) {
                if (obj != null) {
                    C13271k kVar = (C13271k) obj;
                    Object e = kVar.mo34440e();
                    if (e != C13271k.f29702g) {
                        return (Runnable) e;
                    }
                    f29904W.compareAndSet(this, obj, kVar.mo34439d());
                } else {
                    throw new C13142s("null cannot be cast to non-null type kotlinx.coroutines.Queue<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> /* = kotlinx.coroutines.internal.LockFreeTaskQueueCore<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> */");
                }
            } else if (obj == C13416y0.f29913b) {
                return null;
            } else {
                if (f29904W.compareAndSet(this, obj, null)) {
                    if (obj != null) {
                        return (Runnable) obj;
                    }
                    throw new C13142s("null cannot be cast to non-null type kotlinx.coroutines.Runnable /* = java.lang.Runnable */");
                }
            }
        }
    }

    /* renamed from: q */
    private final void m41243q() {
        C13235e2 a = C13239f2.m40692a();
        long b = a != null ? a.mo34377b() : System.nanoTime();
        while (true) {
            C13407b bVar = (C13407b) this._delayed;
            if (bVar != null) {
                C13406a aVar = (C13406a) bVar.mo34460e();
                if (aVar != null) {
                    mo34628a(b, aVar);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public final void mo34618b(long j, C13406a aVar) {
        int c = m41240c(j, aVar);
        if (c != 0) {
            if (c == 1) {
                mo34628a(j, aVar);
            } else if (c != 2) {
                throw new IllegalStateException("unexpected result".toString());
            }
        } else if (m41237a(aVar)) {
            mo34629k();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public long mo34612f() {
        if (super.mo34612f() == 0) {
            return 0;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof C13271k) {
                if (!((C13271k) obj).mo34438c()) {
                    return 0;
                }
            } else if (obj == C13416y0.f29913b) {
                return Long.MAX_VALUE;
            } else {
                return 0;
            }
        }
        C13407b bVar = (C13407b) this._delayed;
        if (bVar != null) {
            C13406a aVar = (C13406a) bVar.mo34459d();
            if (aVar != null) {
                long j = aVar.f29907V;
                C13235e2 a = C13239f2.m40692a();
                return C12762h.m39915a(j - (a != null ? a.mo34377b() : System.nanoTime()), 0);
            }
        }
        return Long.MAX_VALUE;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        if (r0 == kotlinx.coroutines.C13416y0.m41269a()) goto L_0x001a;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo34619l() {
        /*
            r4 = this;
            boolean r0 = r4.mo34614h()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.lang.Object r0 = r4._delayed
            kotlinx.coroutines.v0$b r0 = (kotlinx.coroutines.C13405v0.C13407b) r0
            if (r0 == 0) goto L_0x0015
            boolean r0 = r0.mo34458c()
            if (r0 != 0) goto L_0x0015
            return r1
        L_0x0015:
            java.lang.Object r0 = r4._queue
            r2 = 1
            if (r0 != 0) goto L_0x001c
        L_0x001a:
            r1 = 1
            goto L_0x002e
        L_0x001c:
            boolean r3 = r0 instanceof kotlinx.coroutines.internal.C13271k
            if (r3 == 0) goto L_0x0027
            kotlinx.coroutines.internal.k r0 = (kotlinx.coroutines.internal.C13271k) r0
            boolean r1 = r0.mo34438c()
            goto L_0x002e
        L_0x0027:
            kotlinx.coroutines.internal.q r3 = kotlinx.coroutines.C13416y0.f29913b
            if (r0 != r3) goto L_0x002e
            goto L_0x001a
        L_0x002e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C13405v0.mo34619l():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0055  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo34620m() {
        /*
            r7 = this;
            boolean r0 = r7.mo34615i()
            if (r0 == 0) goto L_0x000b
            long r0 = r7.mo34612f()
            return r0
        L_0x000b:
            java.lang.Object r0 = r7._delayed
            kotlinx.coroutines.v0$b r0 = (kotlinx.coroutines.C13405v0.C13407b) r0
            if (r0 == 0) goto L_0x004f
            boolean r1 = r0.mo34458c()
            if (r1 != 0) goto L_0x004f
            kotlinx.coroutines.e2 r1 = kotlinx.coroutines.C13239f2.m40692a()
            if (r1 == 0) goto L_0x0022
            long r1 = r1.mo34377b()
            goto L_0x0026
        L_0x0022:
            long r1 = java.lang.System.nanoTime()
        L_0x0026:
            monitor-enter(r0)
            kotlinx.coroutines.internal.w r3 = r0.mo34453a()     // Catch:{ all -> 0x004c }
            r4 = 0
            if (r3 == 0) goto L_0x0046
            kotlinx.coroutines.v0$a r3 = (kotlinx.coroutines.C13405v0.C13406a) r3     // Catch:{ all -> 0x004c }
            boolean r5 = r3.mo34624a(r1)     // Catch:{ all -> 0x004c }
            r6 = 0
            if (r5 == 0) goto L_0x003c
            boolean r3 = r7.m41239b(r3)     // Catch:{ all -> 0x004c }
            goto L_0x003d
        L_0x003c:
            r3 = 0
        L_0x003d:
            if (r3 == 0) goto L_0x0044
            kotlinx.coroutines.internal.w r3 = r0.mo34454a(r6)     // Catch:{ all -> 0x004c }
            r4 = r3
        L_0x0044:
            monitor-exit(r0)
            goto L_0x0047
        L_0x0046:
            monitor-exit(r0)
        L_0x0047:
            kotlinx.coroutines.v0$a r4 = (kotlinx.coroutines.C13405v0.C13406a) r4
            if (r4 == 0) goto L_0x004f
            goto L_0x0026
        L_0x004c:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x004f:
            java.lang.Runnable r0 = r7.m41242p()
            if (r0 == 0) goto L_0x0058
            r0.run()
        L_0x0058:
            long r0 = r7.mo34612f()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C13405v0.mo34620m():long");
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo34621n() {
        this._queue = null;
        this._delayed = null;
    }

    /* access modifiers changed from: protected */
    public void shutdown() {
        C13231d2.f29660b.mo34369b();
        this.isCompleted = true;
        m41241o();
        do {
        } while (mo34620m() <= 0);
        m41243q();
    }

    /* renamed from: a */
    public final void mo34340a(C12688f fVar, Runnable runnable) {
        mo34617a(runnable);
    }

    /* renamed from: a */
    public final void mo34617a(Runnable runnable) {
        if (m41239b(runnable)) {
            mo34629k();
        } else {
            C13330l0.f29765Z.mo34617a(runnable);
        }
    }

    /* renamed from: b */
    private final boolean m41239b(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (this.isCompleted) {
                return false;
            }
            if (obj == null) {
                if (f29904W.compareAndSet(this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof C13271k) {
                if (obj != null) {
                    C13271k kVar = (C13271k) obj;
                    int a = kVar.mo34435a(runnable);
                    if (a == 0) {
                        return true;
                    }
                    if (a == 1) {
                        f29904W.compareAndSet(this, obj, kVar.mo34439d());
                    } else if (a == 2) {
                        return false;
                    }
                } else {
                    throw new C13142s("null cannot be cast to non-null type kotlinx.coroutines.Queue<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> /* = kotlinx.coroutines.internal.LockFreeTaskQueueCore<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> */");
                }
            } else if (obj == C13416y0.f29913b) {
                return false;
            } else {
                C13271k kVar2 = new C13271k(8, true);
                if (obj != null) {
                    kVar2.mo34435a((Runnable) obj);
                    kVar2.mo34435a(runnable);
                    if (f29904W.compareAndSet(this, obj, kVar2)) {
                        return true;
                    }
                } else {
                    throw new C13142s("null cannot be cast to non-null type kotlinx.coroutines.Runnable /* = java.lang.Runnable */");
                }
            }
        }
    }

    /* renamed from: a */
    private final boolean m41237a(C13406a aVar) {
        C13407b bVar = (C13407b) this._delayed;
        return (bVar != null ? (C13406a) bVar.mo34459d() : null) == aVar;
    }
}
