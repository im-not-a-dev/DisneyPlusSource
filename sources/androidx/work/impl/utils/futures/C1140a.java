package androidx.work.impl.utils.futures;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: androidx.work.impl.utils.futures.a */
/* compiled from: AbstractFuture */
public abstract class C1140a<V> implements ListenableFuture<V> {

    /* renamed from: W */
    static final boolean f4341W = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: X */
    private static final Logger f4342X = Logger.getLogger(C1140a.class.getName());

    /* renamed from: Y */
    static final C1142b f4343Y;

    /* renamed from: Z */
    private static final Object f4344Z = new Object();

    /* renamed from: U */
    volatile C1146e f4345U;

    /* renamed from: V */
    volatile C1150i f4346V;

    /* renamed from: c */
    volatile Object f4347c;

    /* renamed from: androidx.work.impl.utils.futures.a$b */
    /* compiled from: AbstractFuture */
    private static abstract class C1142b {
        private C1142b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo5922a(C1150i iVar, C1150i iVar2);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo5923a(C1150i iVar, Thread thread);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract boolean mo5924a(C1140a<?> aVar, C1146e eVar, C1146e eVar2);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract boolean mo5925a(C1140a<?> aVar, C1150i iVar, C1150i iVar2);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract boolean mo5926a(C1140a<?> aVar, Object obj, Object obj2);
    }

    /* renamed from: androidx.work.impl.utils.futures.a$c */
    /* compiled from: AbstractFuture */
    private static final class C1143c {

        /* renamed from: c */
        static final C1143c f4348c;

        /* renamed from: d */
        static final C1143c f4349d;

        /* renamed from: a */
        final boolean f4350a;

        /* renamed from: b */
        final Throwable f4351b;

        static {
            if (C1140a.f4341W) {
                f4349d = null;
                f4348c = null;
                return;
            }
            f4349d = new C1143c(false, null);
            f4348c = new C1143c(true, null);
        }

        C1143c(boolean z, Throwable th) {
            this.f4350a = z;
            this.f4351b = th;
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.a$d */
    /* compiled from: AbstractFuture */
    private static final class C1144d {

        /* renamed from: b */
        static final C1144d f4352b = new C1144d(new C1145a("Failure occurred while trying to finish a future."));

        /* renamed from: a */
        final Throwable f4353a;

        /* renamed from: androidx.work.impl.utils.futures.a$d$a */
        /* compiled from: AbstractFuture */
        static class C1145a extends Throwable {
            C1145a(String str) {
                super(str);
            }

            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        C1144d(Throwable th) {
            C1140a.m5931b(th);
            this.f4353a = th;
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.a$e */
    /* compiled from: AbstractFuture */
    private static final class C1146e {

        /* renamed from: d */
        static final C1146e f4354d = new C1146e(null, null);

        /* renamed from: a */
        final Runnable f4355a;

        /* renamed from: b */
        final Executor f4356b;

        /* renamed from: c */
        C1146e f4357c;

        C1146e(Runnable runnable, Executor executor) {
            this.f4355a = runnable;
            this.f4356b = executor;
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.a$f */
    /* compiled from: AbstractFuture */
    private static final class C1147f extends C1142b {

        /* renamed from: a */
        final AtomicReferenceFieldUpdater<C1150i, Thread> f4358a;

        /* renamed from: b */
        final AtomicReferenceFieldUpdater<C1150i, C1150i> f4359b;

        /* renamed from: c */
        final AtomicReferenceFieldUpdater<C1140a, C1150i> f4360c;

        /* renamed from: d */
        final AtomicReferenceFieldUpdater<C1140a, C1146e> f4361d;

        /* renamed from: e */
        final AtomicReferenceFieldUpdater<C1140a, Object> f4362e;

        C1147f(AtomicReferenceFieldUpdater<C1150i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C1150i, C1150i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<C1140a, C1150i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<C1140a, C1146e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<C1140a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f4358a = atomicReferenceFieldUpdater;
            this.f4359b = atomicReferenceFieldUpdater2;
            this.f4360c = atomicReferenceFieldUpdater3;
            this.f4361d = atomicReferenceFieldUpdater4;
            this.f4362e = atomicReferenceFieldUpdater5;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5923a(C1150i iVar, Thread thread) {
            this.f4358a.lazySet(iVar, thread);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5922a(C1150i iVar, C1150i iVar2) {
            this.f4359b.lazySet(iVar, iVar2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo5925a(C1140a<?> aVar, C1150i iVar, C1150i iVar2) {
            return this.f4360c.compareAndSet(aVar, iVar, iVar2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo5924a(C1140a<?> aVar, C1146e eVar, C1146e eVar2) {
            return this.f4361d.compareAndSet(aVar, eVar, eVar2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo5926a(C1140a<?> aVar, Object obj, Object obj2) {
            return this.f4362e.compareAndSet(aVar, obj, obj2);
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.a$g */
    /* compiled from: AbstractFuture */
    private static final class C1148g<V> implements Runnable {

        /* renamed from: U */
        final ListenableFuture<? extends V> f4363U;

        /* renamed from: c */
        final C1140a<V> f4364c;

        C1148g(C1140a<V> aVar, ListenableFuture<? extends V> listenableFuture) {
            this.f4364c = aVar;
            this.f4363U = listenableFuture;
        }

        public void run() {
            if (this.f4364c.f4347c == this) {
                if (C1140a.f4343Y.mo5926a(this.f4364c, (Object) this, C1140a.m5930b(this.f4363U))) {
                    C1140a.m5928a(this.f4364c);
                }
            }
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.a$h */
    /* compiled from: AbstractFuture */
    private static final class C1149h extends C1142b {
        C1149h() {
            super();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5923a(C1150i iVar, Thread thread) {
            iVar.f4366a = thread;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5922a(C1150i iVar, C1150i iVar2) {
            iVar.f4367b = iVar2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo5925a(C1140a<?> aVar, C1150i iVar, C1150i iVar2) {
            synchronized (aVar) {
                if (aVar.f4346V != iVar) {
                    return false;
                }
                aVar.f4346V = iVar2;
                return true;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo5924a(C1140a<?> aVar, C1146e eVar, C1146e eVar2) {
            synchronized (aVar) {
                if (aVar.f4345U != eVar) {
                    return false;
                }
                aVar.f4345U = eVar2;
                return true;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo5926a(C1140a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f4347c != obj) {
                    return false;
                }
                aVar.f4347c = obj2;
                return true;
            }
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.a$i */
    /* compiled from: AbstractFuture */
    private static final class C1150i {

        /* renamed from: c */
        static final C1150i f4365c = new C1150i(false);

        /* renamed from: a */
        volatile Thread f4366a;

        /* renamed from: b */
        volatile C1150i f4367b;

        C1150i(boolean z) {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5930a(C1150i iVar) {
            C1140a.f4343Y.mo5922a(this, iVar);
        }

        C1150i() {
            C1140a.f4343Y.mo5923a(this, Thread.currentThread());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5929a() {
            Thread thread = this.f4366a;
            if (thread != null) {
                this.f4366a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v9, types: [androidx.work.impl.utils.futures.a$h] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    static {
        /*
            java.lang.Class<androidx.work.impl.utils.futures.a$i> r0 = androidx.work.impl.utils.futures.C1140a.C1150i.class
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            f4341W = r1
            java.lang.Class<androidx.work.impl.utils.futures.a> r1 = androidx.work.impl.utils.futures.C1140a.class
            java.lang.String r1 = r1.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            f4342X = r1
            androidx.work.impl.utils.futures.a$f r1 = new androidx.work.impl.utils.futures.a$f     // Catch:{ all -> 0x004e }
            java.lang.Class<java.lang.Thread> r2 = java.lang.Thread.class
            java.lang.String r3 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r3)     // Catch:{ all -> 0x004e }
            java.lang.String r2 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r0, r2)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.work.impl.utils.futures.a> r2 = androidx.work.impl.utils.futures.C1140a.class
            java.lang.String r5 = "V"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r5)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.work.impl.utils.futures.a> r0 = androidx.work.impl.utils.futures.C1140a.class
            java.lang.Class<androidx.work.impl.utils.futures.a$e> r2 = androidx.work.impl.utils.futures.C1140a.C1146e.class
            java.lang.String r6 = "U"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r6)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.work.impl.utils.futures.a> r0 = androidx.work.impl.utils.futures.C1140a.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.lang.String r7 = "c"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r7)     // Catch:{ all -> 0x004e }
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x004e }
            r0 = 0
            goto L_0x0054
        L_0x004e:
            r0 = move-exception
            androidx.work.impl.utils.futures.a$h r1 = new androidx.work.impl.utils.futures.a$h
            r1.<init>()
        L_0x0054:
            f4343Y = r1
            java.lang.Class<java.util.concurrent.locks.LockSupport> r1 = java.util.concurrent.locks.LockSupport.class
            if (r0 == 0) goto L_0x0063
            java.util.logging.Logger r1 = f4342X
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x0063:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f4344Z = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.futures.C1140a.<clinit>():void");
    }

    protected C1140a() {
    }

    /* renamed from: a */
    private void m5927a(C1150i iVar) {
        iVar.f4366a = null;
        while (true) {
            C1150i iVar2 = this.f4346V;
            if (iVar2 != C1150i.f4365c) {
                C1150i iVar3 = null;
                while (iVar2 != null) {
                    C1150i iVar4 = iVar2.f4367b;
                    if (iVar2.f4366a != null) {
                        iVar3 = iVar2;
                    } else if (iVar3 != null) {
                        iVar3.f4367b = iVar4;
                        if (iVar3.f4366a == null) {
                        }
                    } else if (!f4343Y.mo5925a(this, iVar2, iVar4)) {
                    }
                    iVar2 = iVar4;
                }
                return;
            }
            return;
        }
    }

    /* renamed from: b */
    static Object m5930b(ListenableFuture<?> listenableFuture) {
        if (listenableFuture instanceof C1140a) {
            Object obj = ((C1140a) listenableFuture).f4347c;
            if (obj instanceof C1143c) {
                C1143c cVar = (C1143c) obj;
                if (cVar.f4350a) {
                    Throwable th = cVar.f4351b;
                    obj = th != null ? new C1143c(false, th) : C1143c.f4349d;
                }
            }
            return obj;
        }
        boolean isCancelled = listenableFuture.isCancelled();
        if ((!f4341W) && isCancelled) {
            return C1143c.f4349d;
        }
        try {
            Object a = m5925a((Future<V>) listenableFuture);
            if (a == null) {
                a = f4344Z;
            }
            return a;
        } catch (ExecutionException e) {
            return new C1144d(e.getCause());
        } catch (CancellationException e2) {
            if (isCancelled) {
                return new C1143c(false, e2);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
            sb.append(listenableFuture);
            return new C1144d(new IllegalArgumentException(sb.toString(), e2));
        } catch (Throwable th2) {
            return new C1144d(th2);
        }
    }

    /* renamed from: c */
    private V m5933c(Object obj) throws ExecutionException {
        if (obj instanceof C1143c) {
            throw m5926a("Task was cancelled.", ((C1143c) obj).f4351b);
        } else if (obj instanceof C1144d) {
            throw new ExecutionException(((C1144d) obj).f4353a);
        } else if (obj == f4344Z) {
            return null;
        } else {
            return obj;
        }
    }

    /* renamed from: d */
    private void m5935d() {
        C1150i iVar;
        do {
            iVar = this.f4346V;
        } while (!f4343Y.mo5925a(this, iVar, C1150i.f4365c));
        while (iVar != null) {
            iVar.mo5929a();
            iVar = iVar.f4367b;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5912a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo5914b() {
    }

    public final boolean cancel(boolean z) {
        Object obj = this.f4347c;
        if (!(obj == null) && !(obj instanceof C1148g)) {
            return false;
        }
        C1143c cVar = f4341W ? new C1143c(z, new CancellationException("Future.cancel() was called.")) : z ? C1143c.f4348c : C1143c.f4349d;
        boolean z2 = false;
        Object obj2 = obj;
        C1140a aVar = this;
        while (true) {
            if (f4343Y.mo5926a(aVar, obj2, (Object) cVar)) {
                if (z) {
                    aVar.mo5914b();
                }
                m5928a(aVar);
                if (!(obj2 instanceof C1148g)) {
                    return true;
                }
                ListenableFuture<? extends V> listenableFuture = ((C1148g) obj2).f4363U;
                if (listenableFuture instanceof C1140a) {
                    aVar = (C1140a) listenableFuture;
                    obj2 = aVar.f4347c;
                    if (!(obj2 == null) && !(obj2 instanceof C1148g)) {
                        return true;
                    }
                    z2 = true;
                } else {
                    listenableFuture.cancel(z);
                    return true;
                }
            } else {
                obj2 = aVar.f4347c;
                if (!(obj2 instanceof C1148g)) {
                    return z2;
                }
            }
        }
    }

    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.f4347c;
            if ((obj != null) && (!(obj instanceof C1148g))) {
                return m5933c(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                C1150i iVar = this.f4346V;
                if (iVar != C1150i.f4365c) {
                    C1150i iVar2 = new C1150i();
                    do {
                        iVar2.mo5930a(iVar);
                        if (f4343Y.mo5925a(this, iVar, iVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f4347c;
                                    if ((obj2 != null) && (!(obj2 instanceof C1148g))) {
                                        return m5933c(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    m5927a(iVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m5927a(iVar2);
                        } else {
                            iVar = this.f4346V;
                        }
                    } while (iVar != C1150i.f4365c);
                }
                return m5933c(this.f4347c);
            }
            while (nanos > 0) {
                Object obj3 = this.f4347c;
                if ((obj3 != null) && (!(obj3 instanceof C1148g))) {
                    return m5933c(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String aVar = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            StringBuilder sb = new StringBuilder();
            sb.append("Waited ");
            sb.append(j2);
            String str = " ";
            sb.append(str);
            sb.append(timeUnit.toString().toLowerCase(Locale.ROOT));
            String sb2 = sb.toString();
            if (nanos + 1000 < 0) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                sb3.append(" (plus ");
                String sb4 = sb3.toString();
                long j3 = -nanos;
                long convert = timeUnit2.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit2.toNanos(convert);
                int i = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                boolean z = i == 0 || nanos2 > 1000;
                if (i > 0) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(sb4);
                    sb5.append(convert);
                    sb5.append(str);
                    sb5.append(lowerCase);
                    String sb6 = sb5.toString();
                    if (z) {
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append(sb6);
                        sb7.append(",");
                        sb6 = sb7.toString();
                    }
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(sb6);
                    sb8.append(str);
                    sb4 = sb8.toString();
                }
                if (z) {
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append(sb4);
                    sb9.append(nanos2);
                    sb9.append(" nanoseconds ");
                    sb4 = sb9.toString();
                }
                StringBuilder sb10 = new StringBuilder();
                sb10.append(sb4);
                sb10.append("delay)");
                sb2 = sb10.toString();
            }
            if (isDone()) {
                StringBuilder sb11 = new StringBuilder();
                sb11.append(sb2);
                sb11.append(" but future completed as timeout expired");
                throw new TimeoutException(sb11.toString());
            }
            StringBuilder sb12 = new StringBuilder();
            sb12.append(sb2);
            sb12.append(" for ");
            sb12.append(aVar);
            throw new TimeoutException(sb12.toString());
        }
        throw new InterruptedException();
    }

    public final boolean isCancelled() {
        return this.f4347c instanceof C1143c;
    }

    public final boolean isDone() {
        Object obj = this.f4347c;
        return (!(obj instanceof C1148g)) & (obj != null);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        String str2 = "]";
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m5929a(sb);
        } else {
            try {
                str = mo5915c();
            } catch (RuntimeException e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Exception thrown from implementation: ");
                sb2.append(e.getClass());
                str = sb2.toString();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append(str2);
            } else if (isDone()) {
                m5929a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: d */
    private String m5934d(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo5915c() {
        Object obj = this.f4347c;
        if (obj instanceof C1148g) {
            StringBuilder sb = new StringBuilder();
            sb.append("setFuture=[");
            sb.append(m5934d(((C1148g) obj).f4363U));
            sb.append("]");
            return sb.toString();
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("remaining delay=[");
            sb2.append(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS));
            sb2.append(" ms]");
            return sb2.toString();
        }
    }

    /* renamed from: a */
    public final void mo5913a(Runnable runnable, Executor executor) {
        m5931b((T) runnable);
        m5931b((T) executor);
        C1146e eVar = this.f4345U;
        if (eVar != C1146e.f4354d) {
            C1146e eVar2 = new C1146e(runnable, executor);
            do {
                eVar2.f4357c = eVar;
                if (!f4343Y.mo5924a(this, eVar, eVar2)) {
                    eVar = this.f4345U;
                } else {
                    return;
                }
            } while (eVar != C1146e.f4354d);
        }
        m5932b(runnable, executor);
    }

    /* renamed from: b */
    private static void m5932b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f4342X;
            Level level = Level.SEVERE;
            StringBuilder sb = new StringBuilder();
            sb.append("RuntimeException while executing runnable ");
            sb.append(runnable);
            sb.append(" with executor ");
            sb.append(executor);
            logger.log(level, sb.toString(), e);
        }
    }

    /* renamed from: b */
    static <T> T m5931b(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo5910a(V v) {
        if (v == null) {
            v = f4344Z;
        }
        if (!f4343Y.mo5926a(this, (Object) null, (Object) v)) {
            return false;
        }
        m5928a(this);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo5911a(Throwable th) {
        m5931b((T) th);
        if (!f4343Y.mo5926a(this, (Object) null, (Object) new C1144d(th))) {
            return false;
        }
        m5928a(this);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo5909a(ListenableFuture<? extends V> listenableFuture) {
        C1148g gVar;
        C1144d dVar;
        m5931b((T) listenableFuture);
        Object obj = this.f4347c;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (!f4343Y.mo5926a(this, (Object) null, m5930b(listenableFuture))) {
                    return false;
                }
                m5928a(this);
                return true;
            }
            gVar = new C1148g(this, listenableFuture);
            if (f4343Y.mo5926a(this, (Object) null, (Object) gVar)) {
                try {
                    listenableFuture.mo5913a(gVar, C1151b.INSTANCE);
                } catch (Throwable unused) {
                    dVar = C1144d.f4352b;
                }
                return true;
            }
            obj = this.f4347c;
        }
        if (obj instanceof C1143c) {
            listenableFuture.cancel(((C1143c) obj).f4350a);
        }
        return false;
        f4343Y.mo5926a(this, (Object) gVar, (Object) dVar);
        return true;
    }

    /* renamed from: a */
    private static <V> V m5925a(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=androidx.work.impl.utils.futures.a<?>, code=androidx.work.impl.utils.futures.a, for r4v0, types: [androidx.work.impl.utils.futures.a<?>, androidx.work.impl.utils.futures.a] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m5928a(androidx.work.impl.utils.futures.C1140a r4) {
        /*
            r0 = 0
        L_0x0001:
            r4.m5935d()
            r4.mo5912a()
            androidx.work.impl.utils.futures.a$e r4 = r4.m5924a(r0)
        L_0x000b:
            if (r4 == 0) goto L_0x0033
            androidx.work.impl.utils.futures.a$e r0 = r4.f4357c
            java.lang.Runnable r1 = r4.f4355a
            boolean r2 = r1 instanceof androidx.work.impl.utils.futures.C1140a.C1148g
            if (r2 == 0) goto L_0x002c
            androidx.work.impl.utils.futures.a$g r1 = (androidx.work.impl.utils.futures.C1140a.C1148g) r1
            androidx.work.impl.utils.futures.a<V> r4 = r1.f4364c
            java.lang.Object r2 = r4.f4347c
            if (r2 != r1) goto L_0x0031
            com.google.common.util.concurrent.ListenableFuture<? extends V> r2 = r1.f4363U
            java.lang.Object r2 = m5930b(r2)
            androidx.work.impl.utils.futures.a$b r3 = f4343Y
            boolean r1 = r3.mo5926a(r4, r1, r2)
            if (r1 == 0) goto L_0x0031
            goto L_0x0001
        L_0x002c:
            java.util.concurrent.Executor r4 = r4.f4356b
            m5932b(r1, r4)
        L_0x0031:
            r4 = r0
            goto L_0x000b
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.futures.C1140a.m5928a(androidx.work.impl.utils.futures.a):void");
    }

    public final V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f4347c;
            if ((obj2 != null) && (!(obj2 instanceof C1148g))) {
                return m5933c(obj2);
            }
            C1150i iVar = this.f4346V;
            if (iVar != C1150i.f4365c) {
                C1150i iVar2 = new C1150i();
                do {
                    iVar2.mo5930a(iVar);
                    if (f4343Y.mo5925a(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f4347c;
                            } else {
                                m5927a(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof C1148g))));
                        return m5933c(obj);
                    }
                    iVar = this.f4346V;
                } while (iVar != C1150i.f4365c);
            }
            return m5933c(this.f4347c);
        }
        throw new InterruptedException();
    }

    /* renamed from: a */
    private C1146e m5924a(C1146e eVar) {
        C1146e eVar2;
        do {
            eVar2 = this.f4345U;
        } while (!f4343Y.mo5924a(this, eVar2, C1146e.f4354d));
        C1146e eVar3 = eVar2;
        C1146e eVar4 = eVar;
        C1146e eVar5 = eVar3;
        while (eVar5 != null) {
            C1146e eVar6 = eVar5.f4357c;
            eVar5.f4357c = eVar4;
            eVar4 = eVar5;
            eVar5 = eVar6;
        }
        return eVar4;
    }

    /* renamed from: a */
    private void m5929a(StringBuilder sb) {
        String str = "]";
        try {
            Object a = m5925a((Future<V>) this);
            sb.append("SUCCESS, result=[");
            sb.append(m5934d(a));
            sb.append(str);
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append(str);
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    /* renamed from: a */
    private static CancellationException m5926a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }
}
