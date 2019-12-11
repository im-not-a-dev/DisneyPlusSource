package okhttp3.p688d0.p690h;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.C14232e;
import okhttp3.C14236i;
import okhttp3.C14240k;
import okhttp3.C14252r;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.Interceptor.Chain;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.p688d0.C14124c;
import okhttp3.p688d0.C14126e;
import okhttp3.p688d0.p695m.C14225e;
import okio.C14274d;

/* renamed from: okhttp3.d0.h.k */
/* compiled from: Transmitter */
public final class C14155k {

    /* renamed from: a */
    private final OkHttpClient f31468a;

    /* renamed from: b */
    private final C14150g f31469b;

    /* renamed from: c */
    private final Call f31470c;

    /* renamed from: d */
    private final C14252r f31471d;

    /* renamed from: e */
    private final C14274d f31472e = new C14156a();

    /* renamed from: f */
    private Object f31473f;

    /* renamed from: g */
    private Request f31474g;

    /* renamed from: h */
    private C14148e f31475h;

    /* renamed from: i */
    public C14149f f31476i;

    /* renamed from: j */
    private C14145d f31477j;

    /* renamed from: k */
    private boolean f31478k;

    /* renamed from: l */
    private boolean f31479l;

    /* renamed from: m */
    private boolean f31480m;

    /* renamed from: n */
    private boolean f31481n;

    /* renamed from: o */
    private boolean f31482o;

    /* renamed from: okhttp3.d0.h.k$a */
    /* compiled from: Transmitter */
    class C14156a extends C14274d {
        C14156a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public void mo36001i() {
            C14155k.this.mo35994c();
        }
    }

    /* renamed from: okhttp3.d0.h.k$b */
    /* compiled from: Transmitter */
    static final class C14157b extends WeakReference<C14155k> {

        /* renamed from: a */
        final Object f31484a;

        C14157b(C14155k kVar, Object obj) {
            super(kVar);
            this.f31484a = obj;
        }
    }

    public C14155k(OkHttpClient okHttpClient, Call call) {
        this.f31468a = okHttpClient;
        this.f31469b = C14124c.f31328a.mo35823a(okHttpClient.mo35791e());
        this.f31470c = call;
        this.f31471d = okHttpClient.mo35796j().mo35893a(call);
        this.f31472e.mo36417a((long) okHttpClient.mo35788b(), TimeUnit.MILLISECONDS);
    }

    /* renamed from: b */
    private IOException m44983b(IOException iOException) {
        if (this.f31481n || !this.f31472e.mo36406h()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* renamed from: a */
    public void mo35990a() {
        this.f31473f = C14225e.m45335d().mo36131a("response.body().close()");
        this.f31471d.mo36226b(this.f31470c);
    }

    /* renamed from: c */
    public void mo35994c() {
        C14145d dVar;
        C14149f fVar;
        synchronized (this.f31469b) {
            this.f31480m = true;
            dVar = this.f31477j;
            if (this.f31475h == null || this.f31475h.mo35949a() == null) {
                fVar = this.f31476i;
            } else {
                fVar = this.f31475h.mo35949a();
            }
        }
        if (dVar != null) {
            dVar.mo35936a();
        } else if (fVar != null) {
            fVar.mo35963b();
        }
    }

    /* renamed from: d */
    public void mo35995d() {
        synchronized (this.f31469b) {
            if (!this.f31482o) {
                this.f31477j = null;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    /* renamed from: e */
    public boolean mo35996e() {
        boolean z;
        synchronized (this.f31469b) {
            z = this.f31477j != null;
        }
        return z;
    }

    /* renamed from: f */
    public boolean mo35997f() {
        boolean z;
        synchronized (this.f31469b) {
            z = this.f31480m;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public Socket mo35998g() {
        int i = 0;
        int size = this.f31476i.f31446p.size();
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (((Reference) this.f31476i.f31446p.get(i)).get() == this) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            C14149f fVar = this.f31476i;
            fVar.f31446p.remove(i);
            this.f31476i = null;
            if (!fVar.f31446p.isEmpty()) {
                return null;
            }
            fVar.f31447q = System.nanoTime();
            if (this.f31469b.mo35973a(fVar)) {
                return fVar.mo35968g();
            }
            return null;
        }
        throw new IllegalStateException();
    }

    /* renamed from: h */
    public void mo35999h() {
        if (!this.f31481n) {
            this.f31481n = true;
            this.f31472e.mo36406h();
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: i */
    public void mo36000i() {
        this.f31472e.mo36405g();
    }

    /* renamed from: a */
    public void mo35991a(Request request) {
        Request request2 = this.f31474g;
        if (request2 != null) {
            if (C14126e.m44835a(request2.mo35837g(), request.mo35837g()) && this.f31475h.mo35951b()) {
                return;
            }
            if (this.f31477j != null) {
                throw new IllegalStateException();
            } else if (this.f31475h != null) {
                m44981a((IOException) null, true);
                this.f31475h = null;
            }
        }
        this.f31474g = request;
        C14148e eVar = new C14148e(this, this.f31469b, m44982a(request.mo35837g()), this.f31470c, this.f31471d);
        this.f31475h = eVar;
    }

    /* renamed from: b */
    public boolean mo35993b() {
        return this.f31475h.mo35952c() && this.f31475h.mo35951b();
    }

    /* renamed from: a */
    private C14232e m44982a(HttpUrl httpUrl) {
        C14236i iVar;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        if (httpUrl.mo35756h()) {
            SSLSocketFactory z = this.f31468a.mo35812z();
            hostnameVerifier = this.f31468a.mo35799m();
            sSLSocketFactory = z;
            iVar = this.f31468a.mo35789c();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            iVar = null;
        }
        C14232e eVar = new C14232e(httpUrl.mo35755g(), httpUrl.mo35760k(), this.f31468a.mo35795i(), this.f31468a.mo35811y(), sSLSocketFactory, hostnameVerifier, iVar, this.f31468a.mo35807u(), this.f31468a.mo35806t(), this.f31468a.mo35805s(), this.f31468a.mo35792f(), this.f31468a.mo35808v());
        return eVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C14145d mo35989a(Chain chain, boolean z) {
        synchronized (this.f31469b) {
            if (this.f31482o) {
                throw new IllegalStateException("released");
            } else if (this.f31477j != null) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
            }
        }
        C14145d dVar = new C14145d(this, this.f31470c, this.f31471d, this.f31475h, this.f31475h.mo35950a(this.f31468a, chain, z));
        synchronized (this.f31469b) {
            this.f31477j = dVar;
            this.f31478k = false;
            this.f31479l = false;
        }
        return dVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo35992a(C14149f fVar) {
        if (this.f31476i == null) {
            this.f31476i = fVar;
            fVar.f31446p.add(new C14157b(this, this.f31473f));
            return;
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0038, code lost:
        if (r1 == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003a, code lost:
        r6 = m44981a(r6, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003e, code lost:
        return r6;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.IOException mo35988a(okhttp3.p688d0.p690h.C14145d r3, boolean r4, boolean r5, java.io.IOException r6) {
        /*
            r2 = this;
            okhttp3.d0.h.g r0 = r2.f31469b
            monitor-enter(r0)
            okhttp3.d0.h.d r1 = r2.f31477j     // Catch:{ all -> 0x003f }
            if (r3 == r1) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return r6
        L_0x0009:
            r3 = 0
            r1 = 1
            if (r4 == 0) goto L_0x0013
            boolean r4 = r2.f31478k     // Catch:{ all -> 0x003f }
            r4 = r4 ^ r1
            r2.f31478k = r1     // Catch:{ all -> 0x003f }
            goto L_0x0014
        L_0x0013:
            r4 = 0
        L_0x0014:
            if (r5 == 0) goto L_0x001d
            boolean r5 = r2.f31479l     // Catch:{ all -> 0x003f }
            if (r5 != 0) goto L_0x001b
            r4 = 1
        L_0x001b:
            r2.f31479l = r1     // Catch:{ all -> 0x003f }
        L_0x001d:
            boolean r5 = r2.f31478k     // Catch:{ all -> 0x003f }
            if (r5 == 0) goto L_0x0036
            boolean r5 = r2.f31479l     // Catch:{ all -> 0x003f }
            if (r5 == 0) goto L_0x0036
            if (r4 == 0) goto L_0x0036
            okhttp3.d0.h.d r4 = r2.f31477j     // Catch:{ all -> 0x003f }
            okhttp3.d0.h.f r4 = r4.mo35939b()     // Catch:{ all -> 0x003f }
            int r5 = r4.f31443m     // Catch:{ all -> 0x003f }
            int r5 = r5 + r1
            r4.f31443m = r5     // Catch:{ all -> 0x003f }
            r4 = 0
            r2.f31477j = r4     // Catch:{ all -> 0x003f }
            goto L_0x0037
        L_0x0036:
            r1 = 0
        L_0x0037:
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x003e
            java.io.IOException r6 = r2.m44981a(r6, r3)
        L_0x003e:
            return r6
        L_0x003f:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.p688d0.p690h.C14155k.mo35988a(okhttp3.d0.h.d, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    /* renamed from: a */
    public IOException mo35987a(IOException iOException) {
        synchronized (this.f31469b) {
            this.f31482o = true;
        }
        return m44981a(iOException, false);
    }

    /* renamed from: a */
    private IOException m44981a(IOException iOException, boolean z) {
        C14149f fVar;
        Socket g;
        boolean z2;
        boolean z3;
        synchronized (this.f31469b) {
            if (z) {
                if (this.f31477j != null) {
                    throw new IllegalStateException("cannot release connection while it is in use");
                }
            }
            fVar = this.f31476i;
            g = (this.f31476i == null || this.f31477j != null || (!z && !this.f31482o)) ? null : mo35998g();
            if (this.f31476i != null) {
                fVar = null;
            }
            z2 = true;
            z3 = this.f31482o && this.f31477j == null;
        }
        C14126e.m44832a(g);
        if (fVar != null) {
            this.f31471d.mo36229b(this.f31470c, (C14240k) fVar);
        }
        if (z3) {
            if (iOException == null) {
                z2 = false;
            }
            iOException = m44983b(iOException);
            if (z2) {
                this.f31471d.mo36216a(this.f31470c, iOException);
            } else {
                this.f31471d.mo36214a(this.f31470c);
            }
        }
        return iOException;
    }
}
