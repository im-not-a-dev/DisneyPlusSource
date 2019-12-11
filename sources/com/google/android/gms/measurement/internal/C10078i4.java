package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C9908u;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.gms.measurement.internal.i4 */
public final class C10078i4 extends C10101k5 {
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final AtomicLong f23534l = new AtomicLong(Long.MIN_VALUE);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C10111l4 f23535c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C10111l4 f23536d;

    /* renamed from: e */
    private final PriorityBlockingQueue<C10122m4<?>> f23537e = new PriorityBlockingQueue<>();

    /* renamed from: f */
    private final BlockingQueue<C10122m4<?>> f23538f = new LinkedBlockingQueue();

    /* renamed from: g */
    private final UncaughtExceptionHandler f23539g = new C10100k4(this, "Thread death: Uncaught exception on worker thread");

    /* renamed from: h */
    private final UncaughtExceptionHandler f23540h = new C10100k4(this, "Thread death: Uncaught exception on network thread");
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Object f23541i = new Object();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final Semaphore f23542j = new Semaphore(2);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public volatile boolean f23543k;

    C10078i4(C10145o4 o4Var) {
        super(o4Var);
    }

    /* renamed from: a */
    public final <V> Future<V> mo25799a(Callable<V> callable) throws IllegalStateException {
        mo25884p();
        C9908u.m30853a(callable);
        C10122m4 m4Var = new C10122m4(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f23535c) {
            if (!this.f23537e.isEmpty()) {
                mo25898e().mo25877w().mo25908a("Callable skipped the worker queue.");
            }
            m4Var.run();
        } else {
            m31338a(m4Var);
        }
        return m4Var;
    }

    /* renamed from: b */
    public final <V> Future<V> mo25801b(Callable<V> callable) throws IllegalStateException {
        mo25884p();
        C9908u.m30853a(callable);
        C10122m4 m4Var = new C10122m4(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f23535c) {
            m4Var.run();
        } else {
            m31338a(m4Var);
        }
        return m4Var;
    }

    /* renamed from: i */
    public final void mo25803i() {
        if (Thread.currentThread() != this.f23536d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    /* renamed from: j */
    public final void mo25662j() {
        if (Thread.currentThread() != this.f23535c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final boolean mo25655r() {
        return false;
    }

    /* renamed from: t */
    public final boolean mo25804t() {
        return Thread.currentThread() == this.f23535c;
    }

    /* renamed from: b */
    public final void mo25802b(Runnable runnable) throws IllegalStateException {
        mo25884p();
        C9908u.m30853a(runnable);
        C10122m4 m4Var = new C10122m4(this, runnable, false, "Task exception on network thread");
        synchronized (this.f23541i) {
            this.f23538f.add(m4Var);
            if (this.f23536d == null) {
                this.f23536d = new C10111l4(this, "Measurement Network", this.f23538f);
                this.f23536d.setUncaughtExceptionHandler(this.f23540h);
                this.f23536d.start();
            } else {
                this.f23536d.mo25892a();
            }
        }
    }

    /* renamed from: a */
    public final void mo25800a(Runnable runnable) throws IllegalStateException {
        mo25884p();
        C9908u.m30853a(runnable);
        m31338a(new C10122m4<>(this, runnable, false, "Task exception on worker thread"));
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:16|17|(1:19)(1:20)|21|22|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
        r2 = mo25898e().mo25877w();
        r3 = "Timed out waiting for ";
        r4 = java.lang.String.valueOf(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        if (r4.length() == 0) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        r3 = r3.concat(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        r3 = new java.lang.String(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        r2.mo25908a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r2 = mo25898e().mo25877w();
        r3 = "Interrupted waiting for ";
        r4 = java.lang.String.valueOf(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        if (r4.length() != 0) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        r3 = r3.concat(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
        r3 = new java.lang.String(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        r2.mo25908a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005b, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000e, code lost:
        r1 = r1.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r1 != null) goto L_0x0036;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0037 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T mo25798a(java.util.concurrent.atomic.AtomicReference<T> r1, long r2, java.lang.String r4, java.lang.Runnable r5) {
        /*
            r0 = this;
            monitor-enter(r1)
            com.google.android.gms.measurement.internal.i4 r2 = r0.mo25897d()     // Catch:{ all -> 0x005c }
            r2.mo25800a(r5)     // Catch:{ all -> 0x005c }
            r2 = 15000(0x3a98, double:7.411E-320)
            r1.wait(r2)     // Catch:{ InterruptedException -> 0x0037 }
            monitor-exit(r1)     // Catch:{ all -> 0x005c }
            java.lang.Object r1 = r1.get()
            if (r1 != 0) goto L_0x0036
            com.google.android.gms.measurement.internal.k3 r2 = r0.mo25898e()
            com.google.android.gms.measurement.internal.m3 r2 = r2.mo25877w()
            java.lang.String r3 = "Timed out waiting for "
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r5 = r4.length()
            if (r5 == 0) goto L_0x002d
            java.lang.String r3 = r3.concat(r4)
            goto L_0x0033
        L_0x002d:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r3)
            r3 = r4
        L_0x0033:
            r2.mo25908a(r3)
        L_0x0036:
            return r1
        L_0x0037:
            com.google.android.gms.measurement.internal.k3 r2 = r0.mo25898e()     // Catch:{ all -> 0x005c }
            com.google.android.gms.measurement.internal.m3 r2 = r2.mo25877w()     // Catch:{ all -> 0x005c }
            java.lang.String r3 = "Interrupted waiting for "
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x005c }
            int r5 = r4.length()     // Catch:{ all -> 0x005c }
            if (r5 == 0) goto L_0x0050
            java.lang.String r3 = r3.concat(r4)     // Catch:{ all -> 0x005c }
            goto L_0x0056
        L_0x0050:
            java.lang.String r4 = new java.lang.String     // Catch:{ all -> 0x005c }
            r4.<init>(r3)     // Catch:{ all -> 0x005c }
            r3 = r4
        L_0x0056:
            r2.mo25908a(r3)     // Catch:{ all -> 0x005c }
            r2 = 0
            monitor-exit(r1)     // Catch:{ all -> 0x005c }
            return r2
        L_0x005c:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x005c }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C10078i4.mo25798a(java.util.concurrent.atomic.AtomicReference, long, java.lang.String, java.lang.Runnable):java.lang.Object");
    }

    /* renamed from: a */
    private final void m31338a(C10122m4<?> m4Var) {
        synchronized (this.f23541i) {
            this.f23537e.add(m4Var);
            if (this.f23535c == null) {
                this.f23535c = new C10111l4(this, "Measurement Worker", this.f23537e);
                this.f23535c.setUncaughtExceptionHandler(this.f23539g);
                this.f23535c.start();
            } else {
                this.f23535c.mo25892a();
            }
        }
    }
}
