package okhttp3.p688d0.p690h;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.C14232e;
import okhttp3.C14240k;
import okhttp3.C14252r;
import okhttp3.C14255s;
import okhttp3.C14259v;
import okhttp3.C14262x;
import okhttp3.C14266z;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.Interceptor.Chain;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Request.C14113a;
import okhttp3.Response;
import okhttp3.Response.C14114a;
import okhttp3.p688d0.C14124c;
import okhttp3.p688d0.C14126e;
import okhttp3.p688d0.C14127f;
import okhttp3.p688d0.p691i.C14160c;
import okhttp3.p688d0.p692j.C14170a;
import okhttp3.p688d0.p693k.C14178a;
import okhttp3.p688d0.p693k.C14179b;
import okhttp3.p688d0.p693k.C14185f;
import okhttp3.p688d0.p693k.C14185f.C14192g;
import okhttp3.p688d0.p693k.C14185f.C14193h;
import okhttp3.p688d0.p693k.C14200g;
import okhttp3.p688d0.p693k.C14204i;
import okhttp3.p688d0.p693k.C14214n;
import okhttp3.p688d0.p695m.C14225e;
import okhttp3.p688d0.p697o.C14230d;
import okio.BufferedSource;
import okio.C14280f;
import okio.C14287m;

/* renamed from: okhttp3.d0.h.f */
/* compiled from: RealConnection */
public final class C14149f extends C14193h implements C14240k {

    /* renamed from: b */
    public final C14150g f31432b;

    /* renamed from: c */
    private final C14266z f31433c;

    /* renamed from: d */
    private Socket f31434d;

    /* renamed from: e */
    private Socket f31435e;

    /* renamed from: f */
    private C14255s f31436f;

    /* renamed from: g */
    private C14259v f31437g;

    /* renamed from: h */
    private C14185f f31438h;

    /* renamed from: i */
    private BufferedSource f31439i;

    /* renamed from: j */
    private C14280f f31440j;

    /* renamed from: k */
    boolean f31441k;

    /* renamed from: l */
    int f31442l;

    /* renamed from: m */
    int f31443m;

    /* renamed from: n */
    private int f31444n;

    /* renamed from: o */
    private int f31445o = 1;

    /* renamed from: p */
    final List<Reference<C14155k>> f31446p = new ArrayList();

    /* renamed from: q */
    long f31447q = Long.MAX_VALUE;

    public C14149f(C14150g gVar, C14266z zVar) {
        this.f31432b = gVar;
        this.f31433c = zVar;
    }

    /* renamed from: h */
    private Request m44942h() throws IOException {
        C14113a aVar = new C14113a();
        aVar.mo35843a(this.f31433c.mo36280a().mo36176k());
        aVar.mo35841a("CONNECT", (C14262x) null);
        aVar.mo35849b("Host", C14126e.m44818a(this.f31433c.mo36280a().mo36176k(), true));
        aVar.mo35849b("Proxy-Connection", "Keep-Alive");
        aVar.mo35849b("User-Agent", C14127f.m44848a());
        Request a = aVar.mo35846a();
        C14114a aVar2 = new C14114a();
        aVar2.mo35877a(a);
        aVar2.mo35881a(C14259v.HTTP_1_1);
        aVar2.mo35873a(407);
        aVar2.mo35875a("Preemptive Authenticate");
        aVar2.mo35882a(C14126e.f31333d);
        aVar2.mo35885b(-1);
        aVar2.mo35874a(-1);
        aVar2.mo35886b("Proxy-Authenticate", "OkHttp-Preemptive");
        Request a2 = this.f31433c.mo36280a().mo36171g().mo35889a(this.f31433c, aVar2.mo35883a());
        return a2 != null ? a2 : a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0143 A[EDGE_INSN: B:63:0x0143->B:56:0x0143 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo35956a(int r17, int r18, int r19, int r20, boolean r21, okhttp3.Call r22, okhttp3.C14252r r23) {
        /*
            r16 = this;
            r7 = r16
            r8 = r22
            r9 = r23
            okhttp3.v r0 = r7.f31437g
            if (r0 != 0) goto L_0x0151
            okhttp3.z r0 = r7.f31433c
            okhttp3.e r0 = r0.mo36280a()
            java.util.List r0 = r0.mo36165b()
            okhttp3.d0.h.c r10 = new okhttp3.d0.h.c
            r10.<init>(r0)
            okhttp3.z r1 = r7.f31433c
            okhttp3.e r1 = r1.mo36280a()
            javax.net.ssl.SSLSocketFactory r1 = r1.mo36175j()
            if (r1 != 0) goto L_0x0074
            okhttp3.m r1 = okhttp3.C14245m.f31791i
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0067
            okhttp3.z r0 = r7.f31433c
            okhttp3.e r0 = r0.mo36280a()
            okhttp3.HttpUrl r0 = r0.mo36176k()
            java.lang.String r0 = r0.mo35755g()
            okhttp3.d0.m.e r1 = okhttp3.p688d0.p695m.C14225e.m45335d()
            boolean r1 = r1.mo36140b(r0)
            if (r1 == 0) goto L_0x0046
            goto L_0x0086
        L_0x0046:
            okhttp3.d0.h.i r1 = new okhttp3.d0.h.i
            java.net.UnknownServiceException r2 = new java.net.UnknownServiceException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "CLEARTEXT communication to "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = " not permitted by network security policy"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            r1.<init>(r2)
            throw r1
        L_0x0067:
            okhttp3.d0.h.i r0 = new okhttp3.d0.h.i
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "CLEARTEXT communication not enabled for client"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0074:
            okhttp3.z r0 = r7.f31433c
            okhttp3.e r0 = r0.mo36280a()
            java.util.List r0 = r0.mo36168e()
            okhttp3.v r1 = okhttp3.C14259v.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0144
        L_0x0086:
            r11 = 0
            r12 = r11
        L_0x0088:
            okhttp3.z r0 = r7.f31433c     // Catch:{ IOException -> 0x00f9 }
            boolean r0 = r0.mo36282c()     // Catch:{ IOException -> 0x00f9 }
            if (r0 == 0) goto L_0x00a9
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r22
            r6 = r23
            r1.m44937a(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x00f9 }
            java.net.Socket r0 = r7.f31434d     // Catch:{ IOException -> 0x00f9 }
            if (r0 != 0) goto L_0x00a4
            goto L_0x00c6
        L_0x00a4:
            r13 = r17
            r14 = r18
            goto L_0x00b0
        L_0x00a9:
            r13 = r17
            r14 = r18
            r7.m44938a(r13, r14, r8, r9)     // Catch:{ IOException -> 0x00f7 }
        L_0x00b0:
            r15 = r20
            r7.m44940a(r10, r15, r8, r9)     // Catch:{ IOException -> 0x00f5 }
            okhttp3.z r0 = r7.f31433c     // Catch:{ IOException -> 0x00f5 }
            java.net.InetSocketAddress r0 = r0.mo36283d()     // Catch:{ IOException -> 0x00f5 }
            okhttp3.z r1 = r7.f31433c     // Catch:{ IOException -> 0x00f5 }
            java.net.Proxy r1 = r1.mo36281b()     // Catch:{ IOException -> 0x00f5 }
            okhttp3.v r2 = r7.f31437g     // Catch:{ IOException -> 0x00f5 }
            r9.mo36220a(r8, r0, r1, r2)     // Catch:{ IOException -> 0x00f5 }
        L_0x00c6:
            okhttp3.z r0 = r7.f31433c
            boolean r0 = r0.mo36282c()
            if (r0 == 0) goto L_0x00e0
            java.net.Socket r0 = r7.f31434d
            if (r0 == 0) goto L_0x00d3
            goto L_0x00e0
        L_0x00d3:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Too many tunnel connections attempted: 21"
            r0.<init>(r1)
            okhttp3.d0.h.i r1 = new okhttp3.d0.h.i
            r1.<init>(r0)
            throw r1
        L_0x00e0:
            okhttp3.d0.k.f r0 = r7.f31438h
            if (r0 == 0) goto L_0x00f4
            okhttp3.d0.h.g r1 = r7.f31432b
            monitor-enter(r1)
            okhttp3.d0.k.f r0 = r7.f31438h     // Catch:{ all -> 0x00f1 }
            int r0 = r0.mo36044b()     // Catch:{ all -> 0x00f1 }
            r7.f31445o = r0     // Catch:{ all -> 0x00f1 }
            monitor-exit(r1)     // Catch:{ all -> 0x00f1 }
            goto L_0x00f4
        L_0x00f1:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00f1 }
            throw r0
        L_0x00f4:
            return
        L_0x00f5:
            r0 = move-exception
            goto L_0x0100
        L_0x00f7:
            r0 = move-exception
            goto L_0x00fe
        L_0x00f9:
            r0 = move-exception
            r13 = r17
            r14 = r18
        L_0x00fe:
            r15 = r20
        L_0x0100:
            java.net.Socket r1 = r7.f31435e
            okhttp3.p688d0.C14126e.m44832a(r1)
            java.net.Socket r1 = r7.f31434d
            okhttp3.p688d0.C14126e.m44832a(r1)
            r7.f31435e = r11
            r7.f31434d = r11
            r7.f31439i = r11
            r7.f31440j = r11
            r7.f31436f = r11
            r7.f31437g = r11
            r7.f31438h = r11
            okhttp3.z r1 = r7.f31433c
            java.net.InetSocketAddress r3 = r1.mo36283d()
            okhttp3.z r1 = r7.f31433c
            java.net.Proxy r4 = r1.mo36281b()
            r5 = 0
            r1 = r23
            r2 = r22
            r6 = r0
            r1.mo36221a(r2, r3, r4, r5, r6)
            if (r12 != 0) goto L_0x0136
            okhttp3.d0.h.i r1 = new okhttp3.d0.h.i
            r1.<init>(r0)
            r12 = r1
            goto L_0x0139
        L_0x0136:
            r12.mo35980a(r0)
        L_0x0139:
            if (r21 == 0) goto L_0x0143
            boolean r0 = r10.mo35931a(r0)
            if (r0 == 0) goto L_0x0143
            goto L_0x0088
        L_0x0143:
            throw r12
        L_0x0144:
            okhttp3.d0.h.i r0 = new okhttp3.d0.h.i
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0151:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "already connected"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.p688d0.p690h.C14149f.mo35956a(int, int, int, int, boolean, okhttp3.Call, okhttp3.r):void");
    }

    /* renamed from: b */
    public void mo35963b() {
        C14126e.m44832a(this.f31434d);
    }

    /* renamed from: c */
    public C14255s mo35964c() {
        return this.f31436f;
    }

    /* renamed from: d */
    public boolean mo35965d() {
        return this.f31438h != null;
    }

    /* renamed from: e */
    public void mo35966e() {
        synchronized (this.f31432b) {
            this.f31441k = true;
        }
    }

    /* renamed from: f */
    public C14266z mo35967f() {
        return this.f31433c;
    }

    /* renamed from: g */
    public Socket mo35968g() {
        return this.f31435e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.f31433c.mo36280a().mo36176k().mo35755g());
        sb.append(":");
        sb.append(this.f31433c.mo36280a().mo36176k().mo35760k());
        sb.append(", proxy=");
        sb.append(this.f31433c.mo36281b());
        sb.append(" hostAddress=");
        sb.append(this.f31433c.mo36283d());
        sb.append(" cipherSuite=");
        C14255s sVar = this.f31436f;
        sb.append(sVar != null ? sVar.mo36236a() : "none");
        sb.append(" protocol=");
        sb.append(this.f31437g);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    private void m44937a(int i, int i2, int i3, Call call, C14252r rVar) throws IOException {
        Request h = m44942h();
        HttpUrl g = h.mo35837g();
        int i4 = 0;
        while (i4 < 21) {
            m44938a(i, i2, call, rVar);
            h = m44935a(i2, i3, h, g);
            if (h != null) {
                C14126e.m44832a(this.f31434d);
                this.f31434d = null;
                this.f31440j = null;
                this.f31439i = null;
                rVar.mo36220a(call, this.f31433c.mo36283d(), this.f31433c.mo36281b(), null);
                i4++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private void m44938a(int i, int i2, Call call, C14252r rVar) throws IOException {
        Socket socket;
        Proxy b = this.f31433c.mo36281b();
        C14232e a = this.f31433c.mo36280a();
        if (b.type() == Type.DIRECT || b.type() == Type.HTTP) {
            socket = a.mo36174i().createSocket();
        } else {
            socket = new Socket(b);
        }
        this.f31434d = socket;
        rVar.mo36219a(call, this.f31433c.mo36283d(), b);
        this.f31434d.setSoTimeout(i2);
        try {
            C14225e.m45335d().mo36135a(this.f31434d, this.f31433c.mo36283d(), i);
            try {
                this.f31439i = C14287m.m45716a(C14287m.m45727b(this.f31434d));
                this.f31440j = C14287m.m45717a(C14287m.m45723a(this.f31434d));
            } catch (NullPointerException e) {
                if ("throw with null exception".equals(e.getMessage())) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to connect to ");
            sb.append(this.f31433c.mo36283d());
            ConnectException connectException = new ConnectException(sb.toString());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* renamed from: a */
    private void m44940a(C14144c cVar, int i, Call call, C14252r rVar) throws IOException {
        if (this.f31433c.mo36280a().mo36175j() != null) {
            rVar.mo36235g(call);
            m44939a(cVar);
            rVar.mo36225a(call, this.f31436f);
            if (this.f31437g == C14259v.HTTP_2) {
                m44936a(i);
            }
        } else if (this.f31433c.mo36280a().mo36168e().contains(C14259v.H2_PRIOR_KNOWLEDGE)) {
            this.f31435e = this.f31434d;
            this.f31437g = C14259v.H2_PRIOR_KNOWLEDGE;
            m44936a(i);
        } else {
            this.f31435e = this.f31434d;
            this.f31437g = C14259v.HTTP_1_1;
        }
    }

    /* renamed from: a */
    private void m44936a(int i) throws IOException {
        this.f31435e.setSoTimeout(0);
        C14192g gVar = new C14192g(true);
        gVar.mo36055a(this.f31435e, this.f31433c.mo36280a().mo36176k().mo35755g(), this.f31439i, this.f31440j);
        gVar.mo36056a((C14193h) this);
        gVar.mo36054a(i);
        this.f31438h = gVar.mo36057a();
        this.f31438h.mo36048c();
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.net.Socket, javax.net.ssl.SSLSocket] */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0139 A[Catch:{ all -> 0x012f }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x013f A[Catch:{ all -> 0x012f }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0142  */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m44939a(okhttp3.p688d0.p690h.C14144c r8) throws java.io.IOException {
        /*
            r7 = this;
            okhttp3.z r0 = r7.f31433c
            okhttp3.e r0 = r0.mo36280a()
            javax.net.ssl.SSLSocketFactory r1 = r0.mo36175j()
            r2 = 0
            java.net.Socket r3 = r7.f31434d     // Catch:{ AssertionError -> 0x0132 }
            okhttp3.HttpUrl r4 = r0.mo36176k()     // Catch:{ AssertionError -> 0x0132 }
            java.lang.String r4 = r4.mo35755g()     // Catch:{ AssertionError -> 0x0132 }
            okhttp3.HttpUrl r5 = r0.mo36176k()     // Catch:{ AssertionError -> 0x0132 }
            int r5 = r5.mo35760k()     // Catch:{ AssertionError -> 0x0132 }
            r6 = 1
            java.net.Socket r1 = r1.createSocket(r3, r4, r5, r6)     // Catch:{ AssertionError -> 0x0132 }
            javax.net.ssl.SSLSocket r1 = (javax.net.ssl.SSLSocket) r1     // Catch:{ AssertionError -> 0x0132 }
            okhttp3.m r8 = r8.mo35930a(r1)     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            boolean r3 = r8.mo36197c()     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            if (r3 == 0) goto L_0x0041
            okhttp3.d0.m.e r3 = okhttp3.p688d0.p695m.C14225e.m45335d()     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            okhttp3.HttpUrl r4 = r0.mo36176k()     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            java.lang.String r4 = r4.mo35755g()     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            java.util.List r5 = r0.mo36168e()     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            r3.mo36136a(r1, r4, r5)     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        L_0x0041:
            r1.startHandshake()     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            javax.net.ssl.SSLSession r3 = r1.getSession()     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            okhttp3.s r4 = okhttp3.C14255s.m45456a(r3)     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            javax.net.ssl.HostnameVerifier r5 = r0.mo36167d()     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            okhttp3.HttpUrl r6 = r0.mo36176k()     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            java.lang.String r6 = r6.mo35755g()     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            boolean r3 = r5.verify(r6, r3)     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            if (r3 != 0) goto L_0x00d8
            java.util.List r8 = r4.mo36238c()     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            boolean r2 = r8.isEmpty()     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            java.lang.String r3 = "Hostname "
            if (r2 != 0) goto L_0x00b6
            r2 = 0
            java.lang.Object r8 = r8.get(r2)     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            java.security.cert.X509Certificate r8 = (java.security.cert.X509Certificate) r8     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            javax.net.ssl.SSLPeerUnverifiedException r2 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            r4.<init>()     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            r4.append(r3)     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            okhttp3.HttpUrl r0 = r0.mo36176k()     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            java.lang.String r0 = r0.mo35755g()     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            r4.append(r0)     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            java.lang.String r0 = " not verified:\n    certificate: "
            r4.append(r0)     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            java.lang.String r0 = okhttp3.C14236i.m45378a(r8)     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            r4.append(r0)     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            java.lang.String r0 = "\n    DN: "
            r4.append(r0)     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            java.security.Principal r0 = r8.getSubjectDN()     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            java.lang.String r0 = r0.getName()     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            r4.append(r0)     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            java.lang.String r0 = "\n    subjectAltNames: "
            r4.append(r0)     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            java.util.List r8 = okhttp3.p688d0.p697o.C14230d.m45355a(r8)     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            r4.append(r8)     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            java.lang.String r8 = r4.toString()     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            r2.<init>(r8)     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            throw r2     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        L_0x00b6:
            javax.net.ssl.SSLPeerUnverifiedException r8 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            r2.<init>()     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            r2.append(r3)     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            okhttp3.HttpUrl r0 = r0.mo36176k()     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            java.lang.String r0 = r0.mo35755g()     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            r2.append(r0)     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            java.lang.String r0 = " not verified (no certificates)"
            r2.append(r0)     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            java.lang.String r0 = r2.toString()     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            r8.<init>(r0)     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            throw r8     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        L_0x00d8:
            okhttp3.i r3 = r0.mo36163a()     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            okhttp3.HttpUrl r0 = r0.mo36176k()     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            java.lang.String r0 = r0.mo35755g()     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            java.util.List r5 = r4.mo36238c()     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            r3.mo36180a(r0, r5)     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            boolean r8 = r8.mo36197c()     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            if (r8 == 0) goto L_0x00f9
            okhttp3.d0.m.e r8 = okhttp3.p688d0.p695m.C14225e.m45335d()     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            java.lang.String r2 = r8.mo36137b(r1)     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        L_0x00f9:
            r7.f31435e = r1     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            java.net.Socket r8 = r7.f31435e     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            okio.x r8 = okio.C14287m.m45727b(r8)     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            okio.BufferedSource r8 = okio.C14287m.m45716a(r8)     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            r7.f31439i = r8     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            java.net.Socket r8 = r7.f31435e     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            okio.v r8 = okio.C14287m.m45723a(r8)     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            okio.f r8 = okio.C14287m.m45717a(r8)     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            r7.f31440j = r8     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            r7.f31436f = r4     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            if (r2 == 0) goto L_0x011c
            okhttp3.v r8 = okhttp3.C14259v.m45485a(r2)     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            goto L_0x011e
        L_0x011c:
            okhttp3.v r8 = okhttp3.C14259v.HTTP_1_1     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        L_0x011e:
            r7.f31437g = r8     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            if (r1 == 0) goto L_0x0129
            okhttp3.d0.m.e r8 = okhttp3.p688d0.p695m.C14225e.m45335d()
            r8.mo36150a(r1)
        L_0x0129:
            return
        L_0x012a:
            r8 = move-exception
            goto L_0x0140
        L_0x012c:
            r8 = move-exception
            r2 = r1
            goto L_0x0133
        L_0x012f:
            r8 = move-exception
            r1 = r2
            goto L_0x0140
        L_0x0132:
            r8 = move-exception
        L_0x0133:
            boolean r0 = okhttp3.p688d0.C14126e.m44833a(r8)     // Catch:{ all -> 0x012f }
            if (r0 == 0) goto L_0x013f
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x012f }
            r0.<init>(r8)     // Catch:{ all -> 0x012f }
            throw r0     // Catch:{ all -> 0x012f }
        L_0x013f:
            throw r8     // Catch:{ all -> 0x012f }
        L_0x0140:
            if (r1 == 0) goto L_0x0149
            okhttp3.d0.m.e r0 = okhttp3.p688d0.p695m.C14225e.m45335d()
            r0.mo36150a(r1)
        L_0x0149:
            okhttp3.p688d0.C14126e.m44832a(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.p688d0.p690h.C14149f.m44939a(okhttp3.d0.h.c):void");
    }

    /* renamed from: a */
    private Request m44935a(int i, int i2, Request request, HttpUrl httpUrl) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("CONNECT ");
        sb.append(C14126e.m44818a(httpUrl, true));
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        while (true) {
            C14170a aVar = new C14170a(null, null, this.f31439i, this.f31440j);
            this.f31439i.mo35898X().mo36417a((long) i, TimeUnit.MILLISECONDS);
            this.f31440j.mo36019X().mo36417a((long) i2, TimeUnit.MILLISECONDS);
            aVar.mo36016a(request.mo35833c(), sb2);
            aVar.mo36008b();
            C14114a a = aVar.mo36002a(false);
            a.mo35877a(request);
            Response a2 = a.mo35883a();
            aVar.mo36017c(a2);
            int c = a2.mo35858c();
            if (c != 200) {
                if (c == 407) {
                    Request a3 = this.f31433c.mo36280a().mo36171g().mo35889a(this.f31433c, a2);
                    if (a3 != null) {
                        if ("close".equalsIgnoreCase(a2.mo35861e("Connection"))) {
                            return a3;
                        }
                        request = a3;
                    } else {
                        throw new IOException("Failed to authenticate with proxy");
                    }
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Unexpected response code for CONNECT: ");
                    sb3.append(a2.mo35858c());
                    throw new IOException(sb3.toString());
                }
            } else if (this.f31439i.mo36288Z().mo36309a0() && this.f31440j.mo36337h0().mo36309a0()) {
                return null;
            } else {
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo35961a(C14232e eVar, List<C14266z> list) {
        if (this.f31446p.size() >= this.f31445o || this.f31441k || !C14124c.f31328a.mo35828a(this.f31433c.mo36280a(), eVar)) {
            return false;
        }
        if (eVar.mo36176k().mo35755g().equals(mo35967f().mo36280a().mo36176k().mo35755g())) {
            return true;
        }
        if (this.f31438h == null || list == null || !m44941a(list) || eVar.mo36167d() != C14230d.f31727a || !mo35960a(eVar.mo36176k())) {
            return false;
        }
        try {
            eVar.mo36163a().mo36180a(eVar.mo36176k().mo35755g(), mo35964c().mo36238c());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    /* renamed from: a */
    private boolean m44941a(List<C14266z> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C14266z zVar = (C14266z) list.get(i);
            if (zVar.mo36281b().type() == Type.DIRECT && this.f31433c.mo36281b().type() == Type.DIRECT && this.f31433c.mo36283d().equals(zVar.mo36283d())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo35960a(HttpUrl httpUrl) {
        if (httpUrl.mo35760k() != this.f31433c.mo36280a().mo36176k().mo35760k()) {
            return false;
        }
        boolean z = true;
        if (!httpUrl.mo35755g().equals(this.f31433c.mo36280a().mo36176k().mo35755g()) && (this.f31436f == null || !C14230d.f31727a.mo36161a(httpUrl.mo35755g(), (X509Certificate) this.f31436f.mo36238c().get(0)))) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C14160c mo35954a(OkHttpClient okHttpClient, Chain chain) throws SocketException {
        C14185f fVar = this.f31438h;
        if (fVar != null) {
            return new C14200g(okHttpClient, this, chain, fVar);
        }
        this.f31435e.setSoTimeout(chain.mo35782b());
        this.f31439i.mo35898X().mo36417a((long) chain.mo35782b(), TimeUnit.MILLISECONDS);
        this.f31440j.mo36019X().mo36417a((long) chain.mo35783c(), TimeUnit.MILLISECONDS);
        return new C14170a(okHttpClient, this, this.f31439i, this.f31440j);
    }

    /* renamed from: a */
    public boolean mo35962a(boolean z) {
        int soTimeout;
        if (this.f31435e.isClosed() || this.f31435e.isInputShutdown() || this.f31435e.isOutputShutdown()) {
            return false;
        }
        C14185f fVar = this.f31438h;
        if (fVar != null) {
            return !fVar.mo36043a();
        }
        if (z) {
            try {
                soTimeout = this.f31435e.getSoTimeout();
                this.f31435e.setSoTimeout(1);
                if (this.f31439i.mo36309a0()) {
                    this.f31435e.setSoTimeout(soTimeout);
                    return false;
                }
                this.f31435e.setSoTimeout(soTimeout);
                return true;
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            } catch (Throwable th) {
                this.f31435e.setSoTimeout(soTimeout);
                throw th;
            }
        }
        return true;
    }

    /* renamed from: a */
    public void mo35959a(C14204i iVar) throws IOException {
        iVar.mo36074a(C14179b.REFUSED_STREAM, (IOException) null);
    }

    /* renamed from: a */
    public void mo35958a(C14185f fVar) {
        synchronized (this.f31432b) {
            this.f31445o = fVar.mo36044b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo35957a(IOException iOException) {
        synchronized (this.f31432b) {
            if (iOException instanceof C14214n) {
                C14179b bVar = ((C14214n) iOException).f31698c;
                if (bVar == C14179b.REFUSED_STREAM) {
                    this.f31444n++;
                    if (this.f31444n > 1) {
                        this.f31441k = true;
                        this.f31442l++;
                    }
                } else if (bVar != C14179b.CANCEL) {
                    this.f31441k = true;
                    this.f31442l++;
                }
            } else if (!mo35965d() || (iOException instanceof C14178a)) {
                this.f31441k = true;
                if (this.f31443m == 0) {
                    if (iOException != null) {
                        this.f31432b.mo35972a(this.f31433c, iOException);
                    }
                    this.f31442l++;
                }
            }
        }
    }

    /* renamed from: a */
    public C14259v mo35955a() {
        return this.f31437g;
    }
}
