package p520io.reactivex.p531y.p544g;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p531y.p532a.C12009b;

/* renamed from: io.reactivex.y.g.m */
/* compiled from: ScheduledRunnable */
public final class C12517m extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, Disposable {

    /* renamed from: U */
    static final Object f29004U = new Object();

    /* renamed from: V */
    static final Object f29005V = new Object();

    /* renamed from: W */
    static final Object f29006W = new Object();

    /* renamed from: X */
    static final Object f29007X = new Object();

    /* renamed from: c */
    final Runnable f29008c;

    public C12517m(Runnable runnable, C12009b bVar) {
        super(3);
        this.f29008c = runnable;
        lazySet(0, bVar);
    }

    /* renamed from: a */
    public void mo30636a(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj != f29007X) {
                if (obj == f29005V) {
                    future.cancel(false);
                    return;
                } else if (obj == f29006W) {
                    future.cancel(true);
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    public Object call() {
        run();
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dispose() {
        /*
            r5 = this;
        L_0x0000:
            r0 = 1
            java.lang.Object r1 = r5.get(r0)
            java.lang.Object r2 = f29007X
            r3 = 0
            if (r1 == r2) goto L_0x0035
            java.lang.Object r2 = f29005V
            if (r1 == r2) goto L_0x0035
            java.lang.Object r2 = f29006W
            if (r1 != r2) goto L_0x0013
            goto L_0x0035
        L_0x0013:
            r2 = 2
            java.lang.Object r2 = r5.get(r2)
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            if (r2 == r4) goto L_0x0020
            r2 = 1
            goto L_0x0021
        L_0x0020:
            r2 = 0
        L_0x0021:
            if (r2 == 0) goto L_0x0026
            java.lang.Object r4 = f29006W
            goto L_0x0028
        L_0x0026:
            java.lang.Object r4 = f29005V
        L_0x0028:
            boolean r0 = r5.compareAndSet(r0, r1, r4)
            if (r0 == 0) goto L_0x0000
            if (r1 == 0) goto L_0x0035
            java.util.concurrent.Future r1 = (java.util.concurrent.Future) r1
            r1.cancel(r2)
        L_0x0035:
            java.lang.Object r0 = r5.get(r3)
            java.lang.Object r1 = f29007X
            if (r0 == r1) goto L_0x004f
            java.lang.Object r1 = f29004U
            if (r0 == r1) goto L_0x004f
            if (r0 != 0) goto L_0x0044
            goto L_0x004f
        L_0x0044:
            boolean r1 = r5.compareAndSet(r3, r0, r1)
            if (r1 == 0) goto L_0x0035
            io.reactivex.y.a.b r0 = (p520io.reactivex.p531y.p532a.C12009b) r0
            r0.mo30251c(r5)
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p520io.reactivex.p531y.p544g.C12517m.dispose():void");
    }

    public boolean isDisposed() {
        Object obj = get(0);
        if (obj == f29004U || obj == f29007X) {
            return true;
        }
        return false;
    }

    public void run() {
        Object obj;
        Object obj2;
        lazySet(2, Thread.currentThread());
        try {
            this.f29008c.run();
        } catch (Throwable th) {
            lazySet(2, null);
            Object obj3 = get(0);
            if (!(obj3 == f29004U || !compareAndSet(0, obj3, f29007X) || obj3 == null)) {
                ((C12009b) obj3).mo30251c(this);
            }
            do {
                obj2 = get(1);
                if (obj2 == f29005V || obj2 == f29006W) {
                    throw th;
                }
            } while (!compareAndSet(1, obj2, f29007X));
            throw th;
        }
        lazySet(2, null);
        Object obj4 = get(0);
        if (!(obj4 == f29004U || !compareAndSet(0, obj4, f29007X) || obj4 == null)) {
            ((C12009b) obj4).mo30251c(this);
        }
        do {
            obj = get(1);
            if (obj == f29005V || obj == f29006W) {
                return;
            }
        } while (!compareAndSet(1, obj, f29007X));
    }
}
