package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.C9698f;
import com.google.android.gms.common.api.C9702g;
import com.google.android.gms.common.api.C9702g.C9703a;
import com.google.android.gms.common.api.C9706i;
import com.google.android.gms.common.api.C9810l;
import com.google.android.gms.common.api.C9811m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C9890n;
import com.google.android.gms.common.internal.C9908u;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p163g.p449j.p450a.p451a.p457d.p461d.C10997h;

@KeepName
public abstract class BasePendingResult<R extends C9810l> extends C9702g<R> {

    /* renamed from: p */
    static final ThreadLocal<Boolean> f22740p = new C9736f2();

    /* renamed from: a */
    private final Object f22741a;

    /* renamed from: b */
    private final C9707a<R> f22742b;

    /* renamed from: c */
    private final WeakReference<C9698f> f22743c;

    /* renamed from: d */
    private final CountDownLatch f22744d;

    /* renamed from: e */
    private final ArrayList<C9703a> f22745e;

    /* renamed from: f */
    private C9811m<? super R> f22746f;

    /* renamed from: g */
    private final AtomicReference<C9801x1> f22747g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public R f22748h;

    /* renamed from: i */
    private Status f22749i;

    /* renamed from: j */
    private volatile boolean f22750j;

    /* renamed from: k */
    private boolean f22751k;

    /* renamed from: l */
    private boolean f22752l;

    /* renamed from: m */
    private C9890n f22753m;

    /* renamed from: n */
    private volatile C9783r1<R> f22754n;

    /* renamed from: o */
    private boolean f22755o;

    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$a */
    public static class C9707a<R extends C9810l> extends C10997h {
        public C9707a(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        public final void mo25093a(C9811m<? super R> mVar, R r) {
            sendMessage(obtainMessage(1, new Pair(mVar, r)));
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Pair pair = (Pair) message.obj;
                C9811m mVar = (C9811m) pair.first;
                C9810l lVar = (C9810l) pair.second;
                try {
                    mVar.mo25229a(lVar);
                } catch (RuntimeException e) {
                    BasePendingResult.m30138c(lVar);
                    throw e;
                }
            } else if (i != 2) {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
            } else {
                ((BasePendingResult) message.obj).mo25087b(Status.f22698a0);
            }
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$b */
    private final class C9708b {
        private C9708b() {
        }

        /* access modifiers changed from: protected */
        public final void finalize() throws Throwable {
            BasePendingResult.m30138c(BasePendingResult.this.f22748h);
            super.finalize();
        }

        /* synthetic */ C9708b(BasePendingResult basePendingResult, C9736f2 f2Var) {
            this();
        }
    }

    @Deprecated
    BasePendingResult() {
        this.f22741a = new Object();
        this.f22744d = new CountDownLatch(1);
        this.f22745e = new ArrayList<>();
        this.f22747g = new AtomicReference<>();
        this.f22755o = false;
        this.f22742b = new C9707a<>(Looper.getMainLooper());
        this.f22743c = new WeakReference<>(null);
    }

    /* renamed from: g */
    private final R mo25125g() {
        R r;
        synchronized (this.f22741a) {
            C9908u.m30865b(!this.f22750j, "Result has already been consumed.");
            C9908u.m30865b(mo25089c(), "Result is not ready.");
            r = this.f22748h;
            this.f22748h = null;
            this.f22746f = null;
            this.f22750j = true;
        }
        C9801x1 x1Var = (C9801x1) this.f22747g.getAndSet(null);
        if (x1Var != null) {
            x1Var.mo25252a(this);
        }
        return r;
    }

    /* renamed from: a */
    public final R mo25079a(long j, TimeUnit timeUnit) {
        if (j > 0) {
            C9908u.m30867c("await must not be called on the UI thread when time is greater than zero.");
        }
        boolean z = true;
        C9908u.m30865b(!this.f22750j, "Result has already been consumed.");
        if (this.f22754n != null) {
            z = false;
        }
        C9908u.m30865b(z, "Cannot await if then() has been called.");
        try {
            if (!this.f22744d.await(j, timeUnit)) {
                mo25087b(Status.f22698a0);
            }
        } catch (InterruptedException unused) {
            mo25087b(Status.f22696Y);
        }
        C9908u.m30865b(mo25089c(), "Result is not ready.");
        return mo25125g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract R mo24966a(Status status);

    /* renamed from: b */
    public boolean mo25088b() {
        boolean z;
        synchronized (this.f22741a) {
            z = this.f22751k;
        }
        return z;
    }

    /* renamed from: c */
    public final boolean mo25089c() {
        return this.f22744d.getCount() == 0;
    }

    /* renamed from: d */
    public final Integer mo25090d() {
        return null;
    }

    /* renamed from: e */
    public final boolean mo25091e() {
        boolean b;
        synchronized (this.f22741a) {
            if (((C9698f) this.f22743c.get()) == null || !this.f22755o) {
                mo25084a();
            }
            b = mo25088b();
        }
        return b;
    }

    /* renamed from: f */
    public final void mo25092f() {
        this.f22755o = this.f22755o || ((Boolean) f22740p.get()).booleanValue();
    }

    /* renamed from: c */
    public static void m30138c(C9810l lVar) {
        if (lVar instanceof C9706i) {
            try {
                ((C9706i) lVar).mo25083a();
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(lVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                Log.w("BasePendingResult", sb.toString(), e);
            }
        }
    }

    /* renamed from: b */
    public final void mo25087b(Status status) {
        synchronized (this.f22741a) {
            if (!mo25089c()) {
                mo25086a((R) mo24966a(status));
                this.f22752l = true;
            }
        }
    }

    protected BasePendingResult(C9698f fVar) {
        this.f22741a = new Object();
        this.f22744d = new CountDownLatch(1);
        this.f22745e = new ArrayList<>();
        this.f22747g = new AtomicReference<>();
        this.f22755o = false;
        this.f22742b = new C9707a<>(fVar != null ? fVar.mo25067f() : Looper.getMainLooper());
        this.f22743c = new WeakReference<>(fVar);
    }

    /* renamed from: b */
    private final void mo25123b(R r) {
        this.f22748h = r;
        this.f22753m = null;
        this.f22744d.countDown();
        this.f22749i = this.f22748h.getStatus();
        if (this.f22751k) {
            this.f22746f = null;
        } else if (this.f22746f != null) {
            this.f22742b.removeMessages(2);
            this.f22742b.mo25093a(this.f22746f, mo25125g());
        } else if (this.f22748h instanceof C9706i) {
            new C9708b(this, null);
        }
        ArrayList<C9703a> arrayList = this.f22745e;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((C9703a) obj).mo25082a(this.f22749i);
        }
        this.f22745e.clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25081a(com.google.android.gms.common.api.C9811m<? super R> r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f22741a
            monitor-enter(r0)
            if (r6 != 0) goto L_0x000a
            r6 = 0
            r5.f22746f = r6     // Catch:{ all -> 0x003f }
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x000a:
            boolean r1 = r5.f22750j     // Catch:{ all -> 0x003f }
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0012
            r1 = 1
            goto L_0x0013
        L_0x0012:
            r1 = 0
        L_0x0013:
            java.lang.String r4 = "Result has already been consumed."
            com.google.android.gms.common.internal.C9908u.m30865b(r1, r4)     // Catch:{ all -> 0x003f }
            com.google.android.gms.common.api.internal.r1<R> r1 = r5.f22754n     // Catch:{ all -> 0x003f }
            if (r1 != 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r2 = 0
        L_0x001e:
            java.lang.String r1 = "Cannot set callbacks if then() has been called."
            com.google.android.gms.common.internal.C9908u.m30865b(r2, r1)     // Catch:{ all -> 0x003f }
            boolean r1 = r5.mo25088b()     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x002b
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x002b:
            boolean r1 = r5.mo25089c()     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x003b
            com.google.android.gms.common.api.internal.BasePendingResult$a<R> r1 = r5.f22742b     // Catch:{ all -> 0x003f }
            com.google.android.gms.common.api.l r2 = r5.mo25125g()     // Catch:{ all -> 0x003f }
            r1.mo25093a(r6, r2)     // Catch:{ all -> 0x003f }
            goto L_0x003d
        L_0x003b:
            r5.f22746f = r6     // Catch:{ all -> 0x003f }
        L_0x003d:
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x003f:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.mo25081a(com.google.android.gms.common.api.m):void");
    }

    /* renamed from: a */
    public final void mo25080a(C9703a aVar) {
        C9908u.m30861a(aVar != null, (Object) "Callback cannot be null.");
        synchronized (this.f22741a) {
            if (mo25089c()) {
                aVar.mo25082a(this.f22749i);
            } else {
                this.f22745e.add(aVar);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:8|(2:10|11)|12|13|14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0015 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo25084a() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f22741a
            monitor-enter(r0)
            boolean r1 = r2.f22751k     // Catch:{ all -> 0x002a }
            if (r1 != 0) goto L_0x0028
            boolean r1 = r2.f22750j     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x000c
            goto L_0x0028
        L_0x000c:
            com.google.android.gms.common.internal.n r1 = r2.f22753m     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0015
            com.google.android.gms.common.internal.n r1 = r2.f22753m     // Catch:{ RemoteException -> 0x0015 }
            r1.cancel()     // Catch:{ RemoteException -> 0x0015 }
        L_0x0015:
            R r1 = r2.f22748h     // Catch:{ all -> 0x002a }
            m30138c(r1)     // Catch:{ all -> 0x002a }
            r1 = 1
            r2.f22751k = r1     // Catch:{ all -> 0x002a }
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.f22699b0     // Catch:{ all -> 0x002a }
            com.google.android.gms.common.api.l r1 = r2.mo24966a(r1)     // Catch:{ all -> 0x002a }
            r2.mo25123b((R) r1)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x0028:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x002a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.mo25084a():void");
    }

    /* renamed from: a */
    public final void mo25086a(R r) {
        synchronized (this.f22741a) {
            if (this.f22752l || this.f22751k) {
                m30138c(r);
                return;
            }
            mo25089c();
            boolean z = true;
            C9908u.m30865b(!mo25089c(), "Results have already been set");
            if (this.f22750j) {
                z = false;
            }
            C9908u.m30865b(z, "Result has already been consumed");
            mo25123b(r);
        }
    }

    /* renamed from: a */
    public final void mo25085a(C9801x1 x1Var) {
        this.f22747g.set(x1Var);
    }
}
