package p163g.p413f.p414a.p420u;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.C8105a;
import com.bumptech.glide.load.p334n.C8251q;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p163g.p413f.p414a.p420u.p421l.C10746h;
import p163g.p413f.p414a.p420u.p421l.C10747i;
import p163g.p413f.p414a.p420u.p422m.C10756d;
import p163g.p413f.p414a.p424w.C10775k;

/* renamed from: g.f.a.u.f */
/* compiled from: RequestFutureTarget */
public class C10728f<R> implements C10725c<R>, C10730g<R> {

    /* renamed from: d0 */
    private static final C10729a f25374d0 = new C10729a();

    /* renamed from: U */
    private final int f25375U;

    /* renamed from: V */
    private final boolean f25376V;

    /* renamed from: W */
    private final C10729a f25377W;

    /* renamed from: X */
    private R f25378X;

    /* renamed from: Y */
    private C10726d f25379Y;

    /* renamed from: Z */
    private boolean f25380Z;

    /* renamed from: a0 */
    private boolean f25381a0;

    /* renamed from: b0 */
    private boolean f25382b0;

    /* renamed from: c */
    private final int f25383c;

    /* renamed from: c0 */
    private C8251q f25384c0;

    /* renamed from: g.f.a.u.f$a */
    /* compiled from: RequestFutureTarget */
    static class C10729a {
        C10729a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo27748a(Object obj, long j) throws InterruptedException {
            obj.wait(j);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo27747a(Object obj) {
            obj.notifyAll();
        }
    }

    public C10728f(int i, int i2) {
        this(i, i2, true, f25374d0);
    }

    /* renamed from: a */
    public void mo27566a() {
    }

    /* renamed from: a */
    public synchronized void mo27734a(C10726d dVar) {
        this.f25379Y = dVar;
    }

    /* renamed from: a */
    public void mo27735a(C10746h hVar) {
    }

    /* renamed from: b */
    public void mo27570b() {
    }

    /* renamed from: b */
    public void mo27738b(Drawable drawable) {
    }

    /* renamed from: b */
    public void mo27739b(C10746h hVar) {
        hVar.mo27751a(this.f25383c, this.f25375U);
    }

    /* renamed from: c */
    public void mo27572c() {
    }

    /* renamed from: c */
    public void mo27740c(Drawable drawable) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0021, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean cancel(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.isDone()     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x000a
            r3 = 0
            monitor-exit(r2)
            return r3
        L_0x000a:
            r0 = 1
            r2.f25380Z = r0     // Catch:{ all -> 0x0022 }
            g.f.a.u.f$a r1 = r2.f25377W     // Catch:{ all -> 0x0022 }
            r1.mo27747a(r2)     // Catch:{ all -> 0x0022 }
            if (r3 == 0) goto L_0x0020
            g.f.a.u.d r3 = r2.f25379Y     // Catch:{ all -> 0x0022 }
            if (r3 == 0) goto L_0x0020
            g.f.a.u.d r3 = r2.f25379Y     // Catch:{ all -> 0x0022 }
            r3.clear()     // Catch:{ all -> 0x0022 }
            r3 = 0
            r2.f25379Y = r3     // Catch:{ all -> 0x0022 }
        L_0x0020:
            monitor-exit(r2)
            return r0
        L_0x0022:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p413f.p414a.p420u.C10728f.cancel(boolean):boolean");
    }

    /* renamed from: d */
    public synchronized C10726d mo27742d() {
        return this.f25379Y;
    }

    public R get() throws InterruptedException, ExecutionException {
        try {
            return m33813a((Long) null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    public synchronized boolean isCancelled() {
        return this.f25380Z;
    }

    public synchronized boolean isDone() {
        return this.f25380Z || this.f25381a0 || this.f25382b0;
    }

    C10728f(int i, int i2, boolean z, C10729a aVar) {
        this.f25383c = i;
        this.f25375U = i2;
        this.f25376V = z;
        this.f25377W = aVar;
    }

    /* renamed from: a */
    public synchronized void mo20646a(Drawable drawable) {
    }

    public R get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return m33813a(Long.valueOf(timeUnit.toMillis(j)));
    }

    /* renamed from: a */
    public synchronized void mo20648a(R r, C10756d<? super R> dVar) {
    }

    /* renamed from: a */
    private synchronized R m33813a(Long l) throws ExecutionException, InterruptedException, TimeoutException {
        if (this.f25376V && !isDone()) {
            C10775k.m34029a();
        }
        if (this.f25380Z) {
            throw new CancellationException();
        } else if (this.f25382b0) {
            throw new ExecutionException(this.f25384c0);
        } else if (this.f25381a0) {
            return this.f25378X;
        } else {
            if (l == null) {
                this.f25377W.mo27748a(this, 0);
            } else if (l.longValue() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                long longValue = l.longValue() + currentTimeMillis;
                while (!isDone() && currentTimeMillis < longValue) {
                    this.f25377W.mo27748a(this, longValue - currentTimeMillis);
                    currentTimeMillis = System.currentTimeMillis();
                }
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            } else if (this.f25382b0) {
                throw new ExecutionException(this.f25384c0);
            } else if (this.f25380Z) {
                throw new CancellationException();
            } else if (this.f25381a0) {
                return this.f25378X;
            } else {
                throw new TimeoutException();
            }
        }
    }

    /* renamed from: a */
    public synchronized boolean mo27736a(C8251q qVar, Object obj, C10747i<R> iVar, boolean z) {
        this.f25382b0 = true;
        this.f25384c0 = qVar;
        this.f25377W.mo27747a(this);
        return false;
    }

    /* renamed from: a */
    public synchronized boolean mo27737a(R r, Object obj, C10747i<R> iVar, C8105a aVar, boolean z) {
        this.f25381a0 = true;
        this.f25378X = r;
        this.f25377W.mo27747a(this);
        return false;
    }
}
