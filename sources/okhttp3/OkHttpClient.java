package okhttp3;

import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import okhttp3.C14252r.C14254b;
import okhttp3.C14256t.C14257a;
import okhttp3.Call.Factory;
import okhttp3.Response.C14114a;
import okhttp3.p688d0.C14124c;
import okhttp3.p688d0.C14126e;
import okhttp3.p688d0.p689g.C14141f;
import okhttp3.p688d0.p690h.C14145d;
import okhttp3.p688d0.p690h.C14150g;
import okhttp3.p688d0.p695m.C14225e;
import okhttp3.p688d0.p696n.C14226a;
import okhttp3.p688d0.p697o.C14229c;
import okhttp3.p688d0.p697o.C14230d;

public class OkHttpClient implements Cloneable, Factory, C14118b0 {

    /* renamed from: v0 */
    static final List<C14259v> f31218v0 = C14126e.m44825a((T[]) new C14259v[]{C14259v.HTTP_2, C14259v.HTTP_1_1});

    /* renamed from: w0 */
    static final List<C14245m> f31219w0 = C14126e.m44825a((T[]) new C14245m[]{C14245m.f31789g, C14245m.f31791i});

    /* renamed from: U */
    final Proxy f31220U;

    /* renamed from: V */
    final List<C14259v> f31221V;

    /* renamed from: W */
    final List<C14245m> f31222W;

    /* renamed from: X */
    final List<Interceptor> f31223X;

    /* renamed from: Y */
    final List<Interceptor> f31224Y;

    /* renamed from: Z */
    final C14254b f31225Z;

    /* renamed from: a0 */
    final ProxySelector f31226a0;

    /* renamed from: b0 */
    final C14247n f31227b0;

    /* renamed from: c */
    final C14249o f31228c;

    /* renamed from: c0 */
    final Cache f31229c0;

    /* renamed from: d0 */
    final C14141f f31230d0;

    /* renamed from: e0 */
    final SocketFactory f31231e0;

    /* renamed from: f0 */
    final SSLSocketFactory f31232f0;

    /* renamed from: g0 */
    final C14229c f31233g0;

    /* renamed from: h0 */
    final HostnameVerifier f31234h0;

    /* renamed from: i0 */
    final C14236i f31235i0;

    /* renamed from: j0 */
    final C14234g f31236j0;

    /* renamed from: k0 */
    final C14234g f31237k0;

    /* renamed from: l0 */
    final C14241l f31238l0;

    /* renamed from: m0 */
    final C14251q f31239m0;

    /* renamed from: n0 */
    final boolean f31240n0;

    /* renamed from: o0 */
    final boolean f31241o0;

    /* renamed from: p0 */
    final boolean f31242p0;

    /* renamed from: q0 */
    final int f31243q0;

    /* renamed from: r0 */
    final int f31244r0;

    /* renamed from: s0 */
    final int f31245s0;

    /* renamed from: t0 */
    final int f31246t0;

    /* renamed from: u0 */
    final int f31247u0;

    public static final class Builder {

        /* renamed from: A */
        int f31248A;

        /* renamed from: B */
        int f31249B;

        /* renamed from: a */
        C14249o f31250a;

        /* renamed from: b */
        Proxy f31251b;

        /* renamed from: c */
        List<C14259v> f31252c;

        /* renamed from: d */
        List<C14245m> f31253d;

        /* renamed from: e */
        final List<Interceptor> f31254e;

        /* renamed from: f */
        final List<Interceptor> f31255f;

        /* renamed from: g */
        C14254b f31256g;

        /* renamed from: h */
        ProxySelector f31257h;

        /* renamed from: i */
        C14247n f31258i;

        /* renamed from: j */
        Cache f31259j;

        /* renamed from: k */
        C14141f f31260k;

        /* renamed from: l */
        SocketFactory f31261l;

        /* renamed from: m */
        SSLSocketFactory f31262m;

        /* renamed from: n */
        C14229c f31263n;

        /* renamed from: o */
        HostnameVerifier f31264o;

        /* renamed from: p */
        C14236i f31265p;

        /* renamed from: q */
        C14234g f31266q;

        /* renamed from: r */
        C14234g f31267r;

        /* renamed from: s */
        C14241l f31268s;

        /* renamed from: t */
        C14251q f31269t;

        /* renamed from: u */
        boolean f31270u;

        /* renamed from: v */
        boolean f31271v;

        /* renamed from: w */
        boolean f31272w;

        /* renamed from: x */
        int f31273x;

        /* renamed from: y */
        int f31274y;

        /* renamed from: z */
        int f31275z;

        public Builder() {
            this.f31254e = new ArrayList();
            this.f31255f = new ArrayList();
            this.f31250a = new C14249o();
            this.f31252c = OkHttpClient.f31218v0;
            this.f31253d = OkHttpClient.f31219w0;
            this.f31256g = C14252r.m45430a(C14252r.f31809a);
            this.f31257h = ProxySelector.getDefault();
            if (this.f31257h == null) {
                this.f31257h = new C14226a();
            }
            this.f31258i = C14247n.f31800a;
            this.f31261l = SocketFactory.getDefault();
            this.f31264o = C14230d.f31727a;
            this.f31265p = C14236i.f31740c;
            C14234g gVar = C14234g.f31739a;
            this.f31266q = gVar;
            this.f31267r = gVar;
            this.f31268s = new C14241l();
            this.f31269t = C14251q.f31808a;
            this.f31270u = true;
            this.f31271v = true;
            this.f31272w = true;
            this.f31273x = 0;
            this.f31274y = 10000;
            this.f31275z = 10000;
            this.f31248A = 10000;
            this.f31249B = 0;
        }

        /* renamed from: a */
        public Builder mo35813a(long j, TimeUnit timeUnit) {
            this.f31275z = C14126e.m44813a("timeout", j, timeUnit);
            return this;
        }

        /* renamed from: a */
        public Builder mo35814a(Proxy proxy) {
            this.f31251b = proxy;
            return this;
        }

        /* renamed from: a */
        public Builder mo35819a(C14247n nVar) {
            if (nVar != null) {
                this.f31258i = nVar;
                return this;
            }
            throw new NullPointerException("cookieJar == null");
        }

        /* renamed from: a */
        public Builder mo35817a(Cache cache) {
            this.f31259j = cache;
            this.f31260k = null;
            return this;
        }

        /* renamed from: a */
        public Builder mo35816a(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
            if (sSLSocketFactory == null) {
                throw new NullPointerException("sslSocketFactory == null");
            } else if (x509TrustManager != null) {
                this.f31262m = sSLSocketFactory;
                this.f31263n = C14229c.m45353a(x509TrustManager);
                return this;
            } else {
                throw new NullPointerException("trustManager == null");
            }
        }

        /* renamed from: a */
        public Builder mo35815a(List<C14245m> list) {
            this.f31253d = C14126e.m44823a(list);
            return this;
        }

        /* renamed from: a */
        public Builder mo35818a(Interceptor interceptor) {
            if (interceptor != null) {
                this.f31254e.add(interceptor);
                return this;
            }
            throw new IllegalArgumentException("interceptor == null");
        }

        /* renamed from: a */
        public OkHttpClient mo35820a() {
            return new OkHttpClient(this);
        }

        Builder(OkHttpClient okHttpClient) {
            this.f31254e = new ArrayList();
            this.f31255f = new ArrayList();
            this.f31250a = okHttpClient.f31228c;
            this.f31251b = okHttpClient.f31220U;
            this.f31252c = okHttpClient.f31221V;
            this.f31253d = okHttpClient.f31222W;
            this.f31254e.addAll(okHttpClient.f31223X);
            this.f31255f.addAll(okHttpClient.f31224Y);
            this.f31256g = okHttpClient.f31225Z;
            this.f31257h = okHttpClient.f31226a0;
            this.f31258i = okHttpClient.f31227b0;
            this.f31260k = okHttpClient.f31230d0;
            this.f31259j = okHttpClient.f31229c0;
            this.f31261l = okHttpClient.f31231e0;
            this.f31262m = okHttpClient.f31232f0;
            this.f31263n = okHttpClient.f31233g0;
            this.f31264o = okHttpClient.f31234h0;
            this.f31265p = okHttpClient.f31235i0;
            this.f31266q = okHttpClient.f31236j0;
            this.f31267r = okHttpClient.f31237k0;
            this.f31268s = okHttpClient.f31238l0;
            this.f31269t = okHttpClient.f31239m0;
            this.f31270u = okHttpClient.f31240n0;
            this.f31271v = okHttpClient.f31241o0;
            this.f31272w = okHttpClient.f31242p0;
            this.f31273x = okHttpClient.f31243q0;
            this.f31274y = okHttpClient.f31244r0;
            this.f31275z = okHttpClient.f31245s0;
            this.f31248A = okHttpClient.f31246t0;
            this.f31249B = okHttpClient.f31247u0;
        }
    }

    /* renamed from: okhttp3.OkHttpClient$a */
    class C14112a extends C14124c {
        C14112a() {
        }

        /* renamed from: a */
        public void mo35826a(C14257a aVar, String str) {
            aVar.mo36253a(str);
        }

        /* renamed from: a */
        public void mo35827a(C14257a aVar, String str, String str2) {
            aVar.mo36257b(str, str2);
        }

        /* renamed from: a */
        public C14150g mo35823a(C14241l lVar) {
            return lVar.f31775a;
        }

        /* renamed from: a */
        public boolean mo35828a(C14232e eVar, C14232e eVar2) {
            return eVar.mo36164a(eVar2);
        }

        /* renamed from: a */
        public int mo35821a(C14114a aVar) {
            return aVar.f31303c;
        }

        /* renamed from: a */
        public void mo35825a(C14245m mVar, SSLSocket sSLSocket, boolean z) {
            mVar.mo36194a(sSLSocket, z);
        }

        /* renamed from: a */
        public void mo35824a(C14114a aVar, C14145d dVar) {
            aVar.mo35884a(dVar);
        }

        /* renamed from: a */
        public C14145d mo35822a(Response response) {
            return response.f31299f0;
        }
    }

    static {
        C14124c.f31328a = new C14112a();
    }

    public OkHttpClient() {
        this(new Builder());
    }

    /* renamed from: a */
    private static SSLSocketFactory m44691a(X509TrustManager x509TrustManager) {
        try {
            SSLContext b = C14225e.m45335d().mo36138b();
            b.init(null, new TrustManager[]{x509TrustManager}, null);
            return b.getSocketFactory();
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS", e);
        }
    }

    /* renamed from: A */
    public int mo35786A() {
        return this.f31246t0;
    }

    /* renamed from: b */
    public int mo35788b() {
        return this.f31243q0;
    }

    /* renamed from: c */
    public C14236i mo35789c() {
        return this.f31235i0;
    }

    /* renamed from: d */
    public int mo35790d() {
        return this.f31244r0;
    }

    /* renamed from: e */
    public C14241l mo35791e() {
        return this.f31238l0;
    }

    /* renamed from: f */
    public List<C14245m> mo35792f() {
        return this.f31222W;
    }

    /* renamed from: g */
    public C14247n mo35793g() {
        return this.f31227b0;
    }

    /* renamed from: h */
    public C14249o mo35794h() {
        return this.f31228c;
    }

    /* renamed from: i */
    public C14251q mo35795i() {
        return this.f31239m0;
    }

    /* renamed from: j */
    public C14254b mo35796j() {
        return this.f31225Z;
    }

    /* renamed from: k */
    public boolean mo35797k() {
        return this.f31241o0;
    }

    /* renamed from: l */
    public boolean mo35798l() {
        return this.f31240n0;
    }

    /* renamed from: m */
    public HostnameVerifier mo35799m() {
        return this.f31234h0;
    }

    /* renamed from: n */
    public List<Interceptor> mo35800n() {
        return this.f31223X;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public C14141f mo35801o() {
        Cache cache = this.f31229c0;
        return cache != null ? cache.f31133c : this.f31230d0;
    }

    /* renamed from: p */
    public List<Interceptor> mo35802p() {
        return this.f31224Y;
    }

    /* renamed from: q */
    public Builder mo35803q() {
        return new Builder(this);
    }

    /* renamed from: r */
    public int mo35804r() {
        return this.f31247u0;
    }

    /* renamed from: s */
    public List<C14259v> mo35805s() {
        return this.f31221V;
    }

    /* renamed from: t */
    public Proxy mo35806t() {
        return this.f31220U;
    }

    /* renamed from: u */
    public C14234g mo35807u() {
        return this.f31236j0;
    }

    /* renamed from: v */
    public ProxySelector mo35808v() {
        return this.f31226a0;
    }

    /* renamed from: w */
    public int mo35809w() {
        return this.f31245s0;
    }

    /* renamed from: x */
    public boolean mo35810x() {
        return this.f31242p0;
    }

    /* renamed from: y */
    public SocketFactory mo35811y() {
        return this.f31231e0;
    }

    /* renamed from: z */
    public SSLSocketFactory mo35812z() {
        return this.f31232f0;
    }

    OkHttpClient(Builder builder) {
        boolean z;
        this.f31228c = builder.f31250a;
        this.f31220U = builder.f31251b;
        this.f31221V = builder.f31252c;
        this.f31222W = builder.f31253d;
        this.f31223X = C14126e.m44823a(builder.f31254e);
        this.f31224Y = C14126e.m44823a(builder.f31255f);
        this.f31225Z = builder.f31256g;
        this.f31226a0 = builder.f31257h;
        this.f31227b0 = builder.f31258i;
        this.f31229c0 = builder.f31259j;
        this.f31230d0 = builder.f31260k;
        this.f31231e0 = builder.f31261l;
        Iterator it = this.f31222W.iterator();
        loop0:
        while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                C14245m mVar = (C14245m) it.next();
                if (z || mVar.mo36196b()) {
                    z = true;
                }
            }
        }
        if (builder.f31262m != null || !z) {
            this.f31232f0 = builder.f31262m;
            this.f31233g0 = builder.f31263n;
        } else {
            X509TrustManager a = C14126e.m44828a();
            this.f31232f0 = m44691a(a);
            this.f31233g0 = C14229c.m45353a(a);
        }
        if (this.f31232f0 != null) {
            C14225e.m45335d().mo36149a(this.f31232f0);
        }
        this.f31234h0 = builder.f31264o;
        this.f31235i0 = builder.f31265p.mo36179a(this.f31233g0);
        this.f31236j0 = builder.f31266q;
        this.f31237k0 = builder.f31267r;
        this.f31238l0 = builder.f31268s;
        this.f31239m0 = builder.f31269t;
        this.f31240n0 = builder.f31270u;
        this.f31241o0 = builder.f31271v;
        this.f31242p0 = builder.f31272w;
        this.f31243q0 = builder.f31273x;
        this.f31244r0 = builder.f31274y;
        this.f31245s0 = builder.f31275z;
        this.f31246t0 = builder.f31248A;
        this.f31247u0 = builder.f31249B;
        if (this.f31223X.contains(null)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Null interceptor: ");
            sb.append(this.f31223X);
            throw new IllegalStateException(sb.toString());
        } else if (this.f31224Y.contains(null)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Null network interceptor: ");
            sb2.append(this.f31224Y);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* renamed from: a */
    public C14234g mo35787a() {
        return this.f31237k0;
    }

    /* renamed from: a */
    public Call mo35727a(Request request) {
        return C14260w.m45487a(this, request, false);
    }
}
