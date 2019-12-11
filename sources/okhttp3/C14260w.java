package okhttp3;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.p688d0.C14125d;
import okhttp3.p688d0.p690h.C14155k;

/* renamed from: okhttp3.w */
/* compiled from: RealCall */
final class C14260w implements Call {
    /* access modifiers changed from: private */

    /* renamed from: U */
    public C14155k f31828U;

    /* renamed from: V */
    final Request f31829V;

    /* renamed from: W */
    final boolean f31830W;

    /* renamed from: X */
    private boolean f31831X;

    /* renamed from: c */
    final OkHttpClient f31832c;

    /* renamed from: okhttp3.w$a */
    /* compiled from: RealCall */
    final class C14261a extends C14125d {

        /* renamed from: U */
        private final C14235h f31833U;

        /* renamed from: V */
        private volatile AtomicInteger f31834V = new AtomicInteger(0);

        static {
            Class<C14260w> cls = C14260w.class;
        }

        C14261a(C14235h hVar) {
            super("OkHttp %s", C14260w.this.mo36268c());
            this.f31833U = hVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36271a(C14261a aVar) {
            this.f31834V = aVar.f31834V;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x002d A[SYNTHETIC, Splitter:B:12:0x002d] */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x004d A[Catch:{ all -> 0x0026 }] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo35896b() {
            /*
                r5 = this;
                okhttp3.w r0 = okhttp3.C14260w.this
                okhttp3.d0.h.k r0 = r0.f31828U
                r0.mo36000i()
                r0 = 0
                okhttp3.w r1 = okhttp3.C14260w.this     // Catch:{ IOException -> 0x0028 }
                okhttp3.Response r0 = r1.mo36266a()     // Catch:{ IOException -> 0x0028 }
                r1 = 1
                okhttp3.h r2 = r5.f31833U     // Catch:{ IOException -> 0x0024 }
                okhttp3.w r3 = okhttp3.C14260w.this     // Catch:{ IOException -> 0x0024 }
                r2.mo7494a(r3, r0)     // Catch:{ IOException -> 0x0024 }
            L_0x0018:
                okhttp3.w r0 = okhttp3.C14260w.this
                okhttp3.OkHttpClient r0 = r0.f31832c
                okhttp3.o r0 = r0.mo35794h()
                r0.mo36212b(r5)
                goto L_0x0055
            L_0x0024:
                r0 = move-exception
                goto L_0x002b
            L_0x0026:
                r0 = move-exception
                goto L_0x0056
            L_0x0028:
                r1 = move-exception
                r0 = r1
                r1 = 0
            L_0x002b:
                if (r1 == 0) goto L_0x004d
                okhttp3.d0.m.e r1 = okhttp3.p688d0.p695m.C14225e.m45335d()     // Catch:{ all -> 0x0026 }
                r2 = 4
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0026 }
                r3.<init>()     // Catch:{ all -> 0x0026 }
                java.lang.String r4 = "Callback failure for "
                r3.append(r4)     // Catch:{ all -> 0x0026 }
                okhttp3.w r4 = okhttp3.C14260w.this     // Catch:{ all -> 0x0026 }
                java.lang.String r4 = r4.mo36269d()     // Catch:{ all -> 0x0026 }
                r3.append(r4)     // Catch:{ all -> 0x0026 }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0026 }
                r1.mo36133a(r2, r3, r0)     // Catch:{ all -> 0x0026 }
                goto L_0x0018
            L_0x004d:
                okhttp3.h r1 = r5.f31833U     // Catch:{ all -> 0x0026 }
                okhttp3.w r2 = okhttp3.C14260w.this     // Catch:{ all -> 0x0026 }
                r1.mo7493a(r2, r0)     // Catch:{ all -> 0x0026 }
                goto L_0x0018
            L_0x0055:
                return
            L_0x0056:
                okhttp3.w r1 = okhttp3.C14260w.this
                okhttp3.OkHttpClient r1 = r1.f31832c
                okhttp3.o r1 = r1.mo35794h()
                r1.mo36212b(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.C14260w.C14261a.mo35896b():void");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public AtomicInteger mo36272c() {
            return this.f31834V;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public C14260w mo36273d() {
            return C14260w.this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public String mo36274e() {
            return C14260w.this.f31829V.mo35837g().mo35755g();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36270a(ExecutorService executorService) {
            try {
                executorService.execute(this);
            } catch (RejectedExecutionException e) {
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(e);
                C14260w.this.f31828U.mo35987a((IOException) interruptedIOException);
                this.f31833U.mo7493a((Call) C14260w.this, (IOException) interruptedIOException);
                C14260w.this.f31832c.mo35794h().mo36212b(this);
            } catch (Throwable th) {
                C14260w.this.f31832c.mo35794h().mo36212b(this);
                throw th;
            }
        }
    }

    private C14260w(OkHttpClient okHttpClient, Request request, boolean z) {
        this.f31832c = okHttpClient;
        this.f31829V = request;
        this.f31830W = z;
    }

    /* renamed from: b */
    public boolean mo36267b() {
        return this.f31828U.mo35997f();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public String mo36268c() {
        return this.f31829V.mo35837g().mo35763n();
    }

    public void cancel() {
        this.f31828U.mo35994c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public String mo36269d() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo36267b() ? "canceled " : "");
        sb.append(this.f31830W ? "web socket" : "call");
        sb.append(" to ");
        sb.append(mo36268c());
        return sb.toString();
    }

    /* renamed from: m0 */
    public Request mo35725m0() {
        return this.f31829V;
    }

    /* renamed from: n0 */
    public Response mo35726n0() throws IOException {
        synchronized (this) {
            if (!this.f31831X) {
                this.f31831X = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        this.f31828U.mo36000i();
        this.f31828U.mo35990a();
        try {
            this.f31832c.mo35794h().mo36210a(this);
            return mo36266a();
        } finally {
            this.f31832c.mo35794h().mo36213b(this);
        }
    }

    /* renamed from: a */
    static C14260w m45487a(OkHttpClient okHttpClient, Request request, boolean z) {
        C14260w wVar = new C14260w(okHttpClient, request, z);
        wVar.f31828U = new C14155k(okHttpClient, wVar);
        return wVar;
    }

    public C14260w clone() {
        return m45487a(this.f31832c, this.f31829V, this.f31830W);
    }

    /* renamed from: a */
    public void mo35722a(C14235h hVar) {
        synchronized (this) {
            if (!this.f31831X) {
                this.f31831X = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        this.f31828U.mo35990a();
        this.f31832c.mo35794h().mo36209a(new C14261a(hVar));
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a5  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public okhttp3.Response mo36266a() throws java.io.IOException {
        /*
            r11 = this;
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            okhttp3.OkHttpClient r0 = r11.f31832c
            java.util.List r0 = r0.mo35800n()
            r1.addAll(r0)
            okhttp3.d0.i.j r0 = new okhttp3.d0.i.j
            okhttp3.OkHttpClient r2 = r11.f31832c
            r0.<init>(r2)
            r1.add(r0)
            okhttp3.d0.i.a r0 = new okhttp3.d0.i.a
            okhttp3.OkHttpClient r2 = r11.f31832c
            okhttp3.n r2 = r2.mo35793g()
            r0.<init>(r2)
            r1.add(r0)
            okhttp3.d0.g.a r0 = new okhttp3.d0.g.a
            okhttp3.OkHttpClient r2 = r11.f31832c
            okhttp3.d0.g.f r2 = r2.mo35801o()
            r0.<init>(r2)
            r1.add(r0)
            okhttp3.d0.h.b r0 = new okhttp3.d0.h.b
            okhttp3.OkHttpClient r2 = r11.f31832c
            r0.<init>(r2)
            r1.add(r0)
            boolean r0 = r11.f31830W
            if (r0 != 0) goto L_0x004b
            okhttp3.OkHttpClient r0 = r11.f31832c
            java.util.List r0 = r0.mo35802p()
            r1.addAll(r0)
        L_0x004b:
            okhttp3.d0.i.b r0 = new okhttp3.d0.i.b
            boolean r2 = r11.f31830W
            r0.<init>(r2)
            r1.add(r0)
            okhttp3.d0.i.g r10 = new okhttp3.d0.i.g
            okhttp3.d0.h.k r2 = r11.f31828U
            r3 = 0
            r4 = 0
            okhttp3.Request r5 = r11.f31829V
            okhttp3.OkHttpClient r0 = r11.f31832c
            int r7 = r0.mo35790d()
            okhttp3.OkHttpClient r0 = r11.f31832c
            int r8 = r0.mo35809w()
            okhttp3.OkHttpClient r0 = r11.f31832c
            int r9 = r0.mo35786A()
            r0 = r10
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = 0
            r1 = 0
            okhttp3.Request r2 = r11.f31829V     // Catch:{ IOException -> 0x0097, all -> 0x0095 }
            okhttp3.Response r2 = r10.mo35780a(r2)     // Catch:{ IOException -> 0x0097, all -> 0x0095 }
            okhttp3.d0.h.k r3 = r11.f31828U     // Catch:{ IOException -> 0x0097, all -> 0x0095 }
            boolean r3 = r3.mo35997f()     // Catch:{ IOException -> 0x0097, all -> 0x0095 }
            if (r3 != 0) goto L_0x008a
            okhttp3.d0.h.k r0 = r11.f31828U
            r0.mo35987a(r1)
            return r2
        L_0x008a:
            okhttp3.p688d0.C14126e.m44830a(r2)     // Catch:{ IOException -> 0x0097, all -> 0x0095 }
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x0097, all -> 0x0095 }
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch:{ IOException -> 0x0097, all -> 0x0095 }
            throw r2     // Catch:{ IOException -> 0x0097, all -> 0x0095 }
        L_0x0095:
            r2 = move-exception
            goto L_0x00a3
        L_0x0097:
            r0 = move-exception
            r2 = 1
            okhttp3.d0.h.k r3 = r11.f31828U     // Catch:{ all -> 0x00a0 }
            java.io.IOException r0 = r3.mo35987a(r0)     // Catch:{ all -> 0x00a0 }
            throw r0     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            r0 = move-exception
            r2 = r0
            r0 = 1
        L_0x00a3:
            if (r0 != 0) goto L_0x00aa
            okhttp3.d0.h.k r0 = r11.f31828U
            r0.mo35987a(r1)
        L_0x00aa:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.C14260w.mo36266a():okhttp3.Response");
    }
}
