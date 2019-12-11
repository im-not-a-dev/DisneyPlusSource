package okhttp3;

import com.facebook.stetho.server.http.HttpHeaders;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.C14256t.C14257a;
import okhttp3.Request.C14113a;
import okhttp3.Response.C14114a;
import okhttp3.p688d0.C14126e;
import okhttp3.p688d0.p689g.C14130b;
import okhttp3.p688d0.p689g.C14131c;
import okhttp3.p688d0.p689g.C14133d;
import okhttp3.p688d0.p689g.C14133d.C14136c;
import okhttp3.p688d0.p689g.C14133d.C14139e;
import okhttp3.p688d0.p689g.C14141f;
import okhttp3.p688d0.p691i.C14163e;
import okhttp3.p688d0.p691i.C14164f;
import okhttp3.p688d0.p691i.C14169k;
import okhttp3.p688d0.p694l.C14215a;
import okhttp3.p688d0.p695m.C14225e;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.C14280f;
import okio.C14281g;
import okio.C14282h;
import okio.C14287m;
import okio.C14300v;
import okio.C14302x;

public final class Cache implements Closeable, Flushable {

    /* renamed from: U */
    final C14133d f31127U;

    /* renamed from: V */
    int f31128V;

    /* renamed from: W */
    int f31129W;

    /* renamed from: X */
    private int f31130X;

    /* renamed from: Y */
    private int f31131Y;

    /* renamed from: Z */
    private int f31132Z;

    /* renamed from: c */
    final C14141f f31133c;

    /* renamed from: okhttp3.Cache$a */
    class C14104a implements C14141f {
        C14104a() {
        }

        /* renamed from: a */
        public C14130b mo35692a(Response response) throws IOException {
            return Cache.this.mo35685a(response);
        }

        /* renamed from: b */
        public Response mo35697b(Request request) throws IOException {
            return Cache.this.mo35684a(request);
        }

        /* renamed from: a */
        public void mo35694a(Request request) throws IOException {
            Cache.this.mo35689b(request);
        }

        /* renamed from: a */
        public void mo35695a(Response response, Response response2) {
            Cache.this.mo35687a(response, response2);
        }

        /* renamed from: a */
        public void mo35693a() {
            Cache.this.mo35686a();
        }

        /* renamed from: a */
        public void mo35696a(C14131c cVar) {
            Cache.this.mo35688a(cVar);
        }
    }

    /* renamed from: okhttp3.Cache$b */
    private final class C14105b implements C14130b {

        /* renamed from: a */
        private final C14136c f31135a;

        /* renamed from: b */
        private C14300v f31136b;

        /* renamed from: c */
        private C14300v f31137c;

        /* renamed from: d */
        boolean f31138d;

        /* renamed from: okhttp3.Cache$b$a */
        class C14106a extends C14281g {

            /* renamed from: U */
            final /* synthetic */ C14136c f31140U;

            C14106a(C14300v vVar, Cache cache, C14136c cVar) {
                this.f31140U = cVar;
                super(vVar);
            }

            public void close() throws IOException {
                synchronized (Cache.this) {
                    if (!C14105b.this.f31138d) {
                        C14105b.this.f31138d = true;
                        Cache.this.f31128V++;
                        super.close();
                        this.f31140U.mo35919b();
                    }
                }
            }
        }

        C14105b(C14136c cVar) {
            this.f31135a = cVar;
            this.f31136b = cVar.mo35917a(1);
            this.f31137c = new C14106a(this.f31136b, Cache.this, cVar);
        }

        /* JADX INFO: used method not loaded: okhttp3.d0.e.a(java.io.Closeable):null, types can be incorrect */
        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            r4.f31135a.mo35918a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
            okhttp3.p688d0.C14126e.m44830a((java.io.Closeable) r4.f31136b);
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo35698a() {
            /*
                r4 = this;
                okhttp3.Cache r0 = okhttp3.Cache.this
                monitor-enter(r0)
                boolean r1 = r4.f31138d     // Catch:{ all -> 0x001f }
                if (r1 == 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x001f }
                return
            L_0x0009:
                r1 = 1
                r4.f31138d = r1     // Catch:{ all -> 0x001f }
                okhttp3.Cache r2 = okhttp3.Cache.this     // Catch:{ all -> 0x001f }
                int r3 = r2.f31129W     // Catch:{ all -> 0x001f }
                int r3 = r3 + r1
                r2.f31129W = r3     // Catch:{ all -> 0x001f }
                monitor-exit(r0)     // Catch:{ all -> 0x001f }
                okio.v r0 = r4.f31136b
                okhttp3.p688d0.C14126e.m44830a(r0)
                okhttp3.d0.g.d$c r0 = r4.f31135a     // Catch:{ IOException -> 0x001e }
                r0.mo35918a()     // Catch:{ IOException -> 0x001e }
            L_0x001e:
                return
            L_0x001f:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x001f }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.Cache.C14105b.mo35698a():void");
        }

        public C14300v body() {
            return this.f31137c;
        }
    }

    /* renamed from: okhttp3.Cache$c */
    private static class C14107c extends C14264y {

        /* renamed from: U */
        private final BufferedSource f31142U;

        /* renamed from: V */
        private final String f31143V;

        /* renamed from: W */
        private final String f31144W;

        /* renamed from: c */
        final C14139e f31145c;

        /* renamed from: okhttp3.Cache$c$a */
        class C14108a extends C14282h {

            /* renamed from: U */
            final /* synthetic */ C14139e f31146U;

            C14108a(C14107c cVar, C14302x xVar, C14139e eVar) {
                this.f31146U = eVar;
                super(xVar);
            }

            public void close() throws IOException {
                this.f31146U.close();
                super.close();
            }
        }

        C14107c(C14139e eVar, String str, String str2) {
            this.f31145c = eVar;
            this.f31143V = str;
            this.f31144W = str2;
            this.f31142U = C14287m.m45716a((C14302x) new C14108a(this, eVar.mo35925b(1), eVar));
        }

        /* renamed from: b */
        public long mo35701b() {
            try {
                if (this.f31144W != null) {
                    return Long.parseLong(this.f31144W);
                }
                return -1;
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        /* renamed from: c */
        public C14258u mo35702c() {
            String str = this.f31143V;
            if (str != null) {
                return C14258u.m45482b(str);
            }
            return null;
        }

        /* renamed from: d */
        public BufferedSource mo35703d() {
            return this.f31142U;
        }
    }

    /* renamed from: okhttp3.Cache$d */
    private static final class C14109d {

        /* renamed from: k */
        private static final String f31147k;

        /* renamed from: l */
        private static final String f31148l;

        /* renamed from: a */
        private final String f31149a;

        /* renamed from: b */
        private final C14256t f31150b;

        /* renamed from: c */
        private final String f31151c;

        /* renamed from: d */
        private final C14259v f31152d;

        /* renamed from: e */
        private final int f31153e;

        /* renamed from: f */
        private final String f31154f;

        /* renamed from: g */
        private final C14256t f31155g;

        /* renamed from: h */
        private final C14255s f31156h;

        /* renamed from: i */
        private final long f31157i;

        /* renamed from: j */
        private final long f31158j;

        static {
            StringBuilder sb = new StringBuilder();
            sb.append(C14225e.m45335d().mo36152a());
            sb.append("-Sent-Millis");
            f31147k = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C14225e.m45335d().mo36152a());
            sb2.append("-Received-Millis");
            f31148l = sb2.toString();
        }

        C14109d(C14302x xVar) throws IOException {
            C14116a0 a0Var;
            try {
                BufferedSource a = C14287m.m45716a(xVar);
                this.f31149a = a.mo36324d0();
                this.f31151c = a.mo36324d0();
                C14257a aVar = new C14257a();
                int a2 = Cache.m44561a(a);
                for (int i = 0; i < a2; i++) {
                    aVar.mo36253a(a.mo36324d0());
                }
                this.f31150b = aVar.mo36255a();
                C14169k a3 = C14169k.m45050a(a.mo36324d0());
                this.f31152d = a3.f31504a;
                this.f31153e = a3.f31505b;
                this.f31154f = a3.f31506c;
                C14257a aVar2 = new C14257a();
                int a4 = Cache.m44561a(a);
                for (int i2 = 0; i2 < a4; i2++) {
                    aVar2.mo36253a(a.mo36324d0());
                }
                String b = aVar2.mo36256b(f31147k);
                String b2 = aVar2.mo36256b(f31148l);
                aVar2.mo36258c(f31147k);
                aVar2.mo36258c(f31148l);
                long j = 0;
                this.f31157i = b != null ? Long.parseLong(b) : 0;
                if (b2 != null) {
                    j = Long.parseLong(b2);
                }
                this.f31158j = j;
                this.f31155g = aVar2.mo36255a();
                if (m44582a()) {
                    String d0 = a.mo36324d0();
                    if (d0.length() <= 0) {
                        C14239j a5 = C14239j.m45394a(a.mo36324d0());
                        List a6 = m44580a(a);
                        List a7 = m44580a(a);
                        if (!a.mo36309a0()) {
                            a0Var = C14116a0.m44797a(a.mo36324d0());
                        } else {
                            a0Var = C14116a0.SSL_3_0;
                        }
                        this.f31156h = C14255s.m45457a(a0Var, a5, a6, a7);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("expected \"\" but was \"");
                        sb.append(d0);
                        sb.append("\"");
                        throw new IOException(sb.toString());
                    }
                } else {
                    this.f31156h = null;
                }
            } finally {
                xVar.close();
            }
        }

        /* renamed from: a */
        public void mo35706a(C14136c cVar) throws IOException {
            String str;
            C14280f a = C14287m.m45717a(cVar.mo35917a(0));
            a.mo36301a(this.f31149a).writeByte(10);
            a.mo36301a(this.f31151c).writeByte(10);
            a.mo36336h((long) this.f31150b.mo36246b()).writeByte(10);
            int b = this.f31150b.mo36246b();
            int i = 0;
            while (true) {
                str = ": ";
                if (i >= b) {
                    break;
                }
                a.mo36301a(this.f31150b.mo36243a(i)).mo36301a(str).mo36301a(this.f31150b.mo36247b(i)).writeByte(10);
                i++;
            }
            a.mo36301a(new C14169k(this.f31152d, this.f31153e, this.f31154f).toString()).writeByte(10);
            a.mo36336h((long) (this.f31155g.mo36246b() + 2)).writeByte(10);
            int b2 = this.f31155g.mo36246b();
            for (int i2 = 0; i2 < b2; i2++) {
                a.mo36301a(this.f31155g.mo36243a(i2)).mo36301a(str).mo36301a(this.f31155g.mo36247b(i2)).writeByte(10);
            }
            a.mo36301a(f31147k).mo36301a(str).mo36336h(this.f31157i).writeByte(10);
            a.mo36301a(f31148l).mo36301a(str).mo36336h(this.f31158j).writeByte(10);
            if (m44582a()) {
                a.writeByte(10);
                a.mo36301a(this.f31156h.mo36236a().mo36189a()).writeByte(10);
                m44581a(a, this.f31156h.mo36238c());
                m44581a(a, this.f31156h.mo36237b());
                a.mo36301a(this.f31156h.mo36239d().mo35890a()).writeByte(10);
            }
            a.close();
        }

        /* renamed from: a */
        private boolean m44582a() {
            return this.f31149a.startsWith("https://");
        }

        C14109d(Response response) {
            this.f31149a = response.mo35870m().mo35837g().toString();
            this.f31150b = C14163e.m45024e(response);
            this.f31151c = response.mo35870m().mo35835e();
            this.f31152d = response.mo35868k();
            this.f31153e = response.mo35858c();
            this.f31154f = response.mo35864g();
            this.f31155g = response.mo35862e();
            this.f31156h = response.mo35860d();
            this.f31157i = response.mo35871n();
            this.f31158j = response.mo35869l();
        }

        /* renamed from: a */
        private List<Certificate> m44580a(BufferedSource bufferedSource) throws IOException {
            int a = Cache.m44561a(bufferedSource);
            if (a == -1) {
                return Collections.emptyList();
            }
            try {
                CertificateFactory instance = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(a);
                for (int i = 0; i < a; i++) {
                    String d0 = bufferedSource.mo36324d0();
                    Buffer buffer = new Buffer();
                    buffer.mo36318c(ByteString.m45613c(d0));
                    arrayList.add(instance.generateCertificate(buffer.mo36334g0()));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        /* renamed from: a */
        private void m44581a(C14280f fVar, List<Certificate> list) throws IOException {
            try {
                fVar.mo36336h((long) list.size()).writeByte(10);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    fVar.mo36301a(ByteString.m45612a(((Certificate) list.get(i)).getEncoded()).mo36371a()).writeByte(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        /* renamed from: a */
        public boolean mo35707a(Request request, Response response) {
            return this.f31149a.equals(request.mo35837g().toString()) && this.f31151c.equals(request.mo35835e()) && C14163e.m45017a(response, this.f31150b, request);
        }

        /* renamed from: a */
        public Response mo35705a(C14139e eVar) {
            String a = this.f31155g.mo36244a(HttpHeaders.CONTENT_TYPE);
            String a2 = this.f31155g.mo36244a(HttpHeaders.CONTENT_LENGTH);
            C14113a aVar = new C14113a();
            aVar.mo35848b(this.f31149a);
            aVar.mo35841a(this.f31151c, (C14262x) null);
            aVar.mo35844a(this.f31150b);
            Request a3 = aVar.mo35846a();
            C14114a aVar2 = new C14114a();
            aVar2.mo35877a(a3);
            aVar2.mo35881a(this.f31152d);
            aVar2.mo35873a(this.f31153e);
            aVar2.mo35875a(this.f31154f);
            aVar2.mo35880a(this.f31155g);
            aVar2.mo35882a((C14264y) new C14107c(eVar, a, a2));
            aVar2.mo35879a(this.f31156h);
            aVar2.mo35885b(this.f31157i);
            aVar2.mo35874a(this.f31158j);
            return aVar2.mo35883a();
        }
    }

    public Cache(File file, long j) {
        this(file, j, C14215a.f31699a);
    }

    /* renamed from: a */
    public static String m44562a(HttpUrl httpUrl) {
        return ByteString.m45615e(httpUrl.toString()).mo36388h().mo36386f();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo35689b(Request request) throws IOException {
        this.f31127U.mo35914g(m44562a(request.mo35837g()));
    }

    public void close() throws IOException {
        this.f31127U.close();
    }

    public void flush() throws IOException {
        this.f31127U.flush();
    }

    Cache(File file, long j, C14215a aVar) {
        this.f31133c = new C14104a();
        this.f31127U = C14133d.m44864a(aVar, file, 201105, 2, j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Response mo35684a(Request request) {
        try {
            C14139e f = this.f31127U.mo35911f(m44562a(request.mo35837g()));
            if (f == null) {
                return null;
            }
            try {
                C14109d dVar = new C14109d(f.mo35925b(0));
                Response a = dVar.mo35705a(f);
                if (dVar.mo35707a(request, a)) {
                    return a;
                }
                C14126e.m44830a((Closeable) a.mo35855a());
                return null;
            } catch (IOException unused) {
                C14126e.m44830a((Closeable) f);
                return null;
            }
        } catch (IOException unused2) {
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C14130b mo35685a(Response response) {
        C14136c cVar;
        String e = response.mo35870m().mo35835e();
        if (C14164f.m45025a(response.mo35870m().mo35835e())) {
            try {
                mo35689b(response.mo35870m());
            } catch (IOException unused) {
            }
            return null;
        } else if (!e.equals("GET") || C14163e.m45022c(response)) {
            return null;
        } else {
            C14109d dVar = new C14109d(response);
            try {
                cVar = this.f31127U.mo35909e(m44562a(response.mo35870m().mo35837g()));
                if (cVar == null) {
                    return null;
                }
                try {
                    dVar.mo35706a(cVar);
                    return new C14105b(cVar);
                } catch (IOException unused2) {
                    m44563a(cVar);
                    return null;
                }
            } catch (IOException unused3) {
                cVar = null;
                m44563a(cVar);
                return null;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo35687a(Response response, Response response2) {
        C14136c cVar;
        C14109d dVar = new C14109d(response2);
        try {
            cVar = ((C14107c) response.mo35855a()).f31145c.mo35924a();
            if (cVar != null) {
                try {
                    dVar.mo35706a(cVar);
                    cVar.mo35919b();
                } catch (IOException unused) {
                }
            }
        } catch (IOException unused2) {
            cVar = null;
            m44563a(cVar);
        }
    }

    /* renamed from: a */
    private void m44563a(C14136c cVar) {
        if (cVar != null) {
            try {
                cVar.mo35918a();
            } catch (IOException unused) {
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo35688a(C14131c cVar) {
        this.f31132Z++;
        if (cVar.f31346a != null) {
            this.f31130X++;
        } else if (cVar.f31347b != null) {
            this.f31131Y++;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo35686a() {
        this.f31131Y++;
    }

    /* renamed from: a */
    static int m44561a(BufferedSource bufferedSource) throws IOException {
        try {
            long c0 = bufferedSource.mo36320c0();
            String d0 = bufferedSource.mo36324d0();
            if (c0 >= 0 && c0 <= 2147483647L && d0.isEmpty()) {
                return (int) c0;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("expected an int but was \"");
            sb.append(c0);
            sb.append(d0);
            sb.append("\"");
            throw new IOException(sb.toString());
        } catch (NumberFormatException e) {
            throw new IOException(e.getMessage());
        }
    }
}
