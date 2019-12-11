package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import okhttp3.C14256t.C14257a;
import okhttp3.p688d0.p690h.C14145d;
import okio.Buffer;
import okio.BufferedSource;
import okio.C14302x;

public final class Response implements Closeable {

    /* renamed from: U */
    final C14259v f31287U;

    /* renamed from: V */
    final int f31288V;

    /* renamed from: W */
    final String f31289W;

    /* renamed from: X */
    final C14255s f31290X;

    /* renamed from: Y */
    final C14256t f31291Y;

    /* renamed from: Z */
    final C14264y f31292Z;

    /* renamed from: a0 */
    final Response f31293a0;

    /* renamed from: b0 */
    final Response f31294b0;

    /* renamed from: c */
    final Request f31295c;

    /* renamed from: c0 */
    final Response f31296c0;

    /* renamed from: d0 */
    final long f31297d0;

    /* renamed from: e0 */
    final long f31298e0;

    /* renamed from: f0 */
    final C14145d f31299f0;

    /* renamed from: g0 */
    private volatile CacheControl f31300g0;

    /* renamed from: okhttp3.Response$a */
    public static class C14114a {

        /* renamed from: a */
        Request f31301a;

        /* renamed from: b */
        C14259v f31302b;

        /* renamed from: c */
        int f31303c;

        /* renamed from: d */
        String f31304d;

        /* renamed from: e */
        C14255s f31305e;

        /* renamed from: f */
        C14257a f31306f;

        /* renamed from: g */
        C14264y f31307g;

        /* renamed from: h */
        Response f31308h;

        /* renamed from: i */
        Response f31309i;

        /* renamed from: j */
        Response f31310j;

        /* renamed from: k */
        long f31311k;

        /* renamed from: l */
        long f31312l;

        /* renamed from: m */
        C14145d f31313m;

        public C14114a() {
            this.f31303c = -1;
            this.f31306f = new C14257a();
        }

        /* renamed from: d */
        private void m44778d(Response response) {
            if (response.f31292Z != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        /* renamed from: a */
        public C14114a mo35877a(Request request) {
            this.f31301a = request;
            return this;
        }

        /* renamed from: b */
        public C14114a mo35886b(String str, String str2) {
            this.f31306f.mo36259c(str, str2);
            return this;
        }

        /* renamed from: c */
        public C14114a mo35888c(Response response) {
            if (response != null) {
                m44778d(response);
            }
            this.f31310j = response;
            return this;
        }

        /* renamed from: a */
        public C14114a mo35881a(C14259v vVar) {
            this.f31302b = vVar;
            return this;
        }

        /* renamed from: b */
        public C14114a mo35887b(Response response) {
            if (response != null) {
                m44777a("networkResponse", response);
            }
            this.f31308h = response;
            return this;
        }

        /* renamed from: a */
        public C14114a mo35873a(int i) {
            this.f31303c = i;
            return this;
        }

        C14114a(Response response) {
            this.f31303c = -1;
            this.f31301a = response.f31295c;
            this.f31302b = response.f31287U;
            this.f31303c = response.f31288V;
            this.f31304d = response.f31289W;
            this.f31305e = response.f31290X;
            this.f31306f = response.f31291Y.mo36245a();
            this.f31307g = response.f31292Z;
            this.f31308h = response.f31293a0;
            this.f31309i = response.f31294b0;
            this.f31310j = response.f31296c0;
            this.f31311k = response.f31297d0;
            this.f31312l = response.f31298e0;
            this.f31313m = response.f31299f0;
        }

        /* renamed from: a */
        public C14114a mo35875a(String str) {
            this.f31304d = str;
            return this;
        }

        /* renamed from: b */
        public C14114a mo35885b(long j) {
            this.f31311k = j;
            return this;
        }

        /* renamed from: a */
        public C14114a mo35879a(C14255s sVar) {
            this.f31305e = sVar;
            return this;
        }

        /* renamed from: a */
        public C14114a mo35876a(String str, String str2) {
            this.f31306f.mo36254a(str, str2);
            return this;
        }

        /* renamed from: a */
        public C14114a mo35880a(C14256t tVar) {
            this.f31306f = tVar.mo36245a();
            return this;
        }

        /* renamed from: a */
        public C14114a mo35882a(C14264y yVar) {
            this.f31307g = yVar;
            return this;
        }

        /* renamed from: a */
        public C14114a mo35878a(Response response) {
            if (response != null) {
                m44777a("cacheResponse", response);
            }
            this.f31309i = response;
            return this;
        }

        /* renamed from: a */
        private void m44777a(String str, Response response) {
            if (response.f31292Z != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(".body != null");
                throw new IllegalArgumentException(sb.toString());
            } else if (response.f31293a0 != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(".networkResponse != null");
                throw new IllegalArgumentException(sb2.toString());
            } else if (response.f31294b0 != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(".cacheResponse != null");
                throw new IllegalArgumentException(sb3.toString());
            } else if (response.f31296c0 != null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(".priorResponse != null");
                throw new IllegalArgumentException(sb4.toString());
            }
        }

        /* renamed from: a */
        public C14114a mo35874a(long j) {
            this.f31312l = j;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo35884a(C14145d dVar) {
            this.f31313m = dVar;
        }

        /* renamed from: a */
        public Response mo35883a() {
            if (this.f31301a == null) {
                throw new IllegalStateException("request == null");
            } else if (this.f31302b == null) {
                throw new IllegalStateException("protocol == null");
            } else if (this.f31303c < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("code < 0: ");
                sb.append(this.f31303c);
                throw new IllegalStateException(sb.toString());
            } else if (this.f31304d != null) {
                return new Response(this);
            } else {
                throw new IllegalStateException("message == null");
            }
        }
    }

    Response(C14114a aVar) {
        this.f31295c = aVar.f31301a;
        this.f31287U = aVar.f31302b;
        this.f31288V = aVar.f31303c;
        this.f31289W = aVar.f31304d;
        this.f31290X = aVar.f31305e;
        this.f31291Y = aVar.f31306f.mo36255a();
        this.f31292Z = aVar.f31307g;
        this.f31293a0 = aVar.f31308h;
        this.f31294b0 = aVar.f31309i;
        this.f31296c0 = aVar.f31310j;
        this.f31297d0 = aVar.f31311k;
        this.f31298e0 = aVar.f31312l;
        this.f31299f0 = aVar.f31313m;
    }

    /* renamed from: a */
    public String mo35854a(String str, String str2) {
        String a = this.f31291Y.mo36244a(str);
        return a != null ? a : str2;
    }

    /* renamed from: b */
    public CacheControl mo35857b() {
        CacheControl cacheControl = this.f31300g0;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl a = CacheControl.m44586a(this.f31291Y);
        this.f31300g0 = a;
        return a;
    }

    /* renamed from: c */
    public int mo35858c() {
        return this.f31288V;
    }

    public void close() {
        C14264y yVar = this.f31292Z;
        if (yVar != null) {
            yVar.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    /* renamed from: d */
    public C14255s mo35860d() {
        return this.f31290X;
    }

    /* renamed from: e */
    public String mo35861e(String str) {
        return mo35854a(str, null);
    }

    /* renamed from: f */
    public boolean mo35863f() {
        int i = this.f31288V;
        return i >= 200 && i < 300;
    }

    /* renamed from: g */
    public String mo35864g() {
        return this.f31289W;
    }

    /* renamed from: h */
    public Response mo35865h() {
        return this.f31293a0;
    }

    /* renamed from: i */
    public C14114a mo35866i() {
        return new C14114a(this);
    }

    /* renamed from: j */
    public Response mo35867j() {
        return this.f31296c0;
    }

    /* renamed from: k */
    public C14259v mo35868k() {
        return this.f31287U;
    }

    /* renamed from: l */
    public long mo35869l() {
        return this.f31298e0;
    }

    /* renamed from: m */
    public Request mo35870m() {
        return this.f31295c;
    }

    /* renamed from: n */
    public long mo35871n() {
        return this.f31297d0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Response{protocol=");
        sb.append(this.f31287U);
        sb.append(", code=");
        sb.append(this.f31288V);
        sb.append(", message=");
        sb.append(this.f31289W);
        sb.append(", url=");
        sb.append(this.f31295c.mo35837g());
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public C14264y mo35856a(long j) throws IOException {
        BufferedSource peek = this.f31292Z.mo35703d().peek();
        Buffer buffer = new Buffer();
        peek.mo36314b(j);
        buffer.mo36307a((C14302x) peek, Math.min(j, peek.mo36288Z().mo36335h()));
        return C14264y.m45512a(this.f31292Z.mo35702c(), buffer.mo36335h(), buffer);
    }

    /* renamed from: e */
    public C14256t mo35862e() {
        return this.f31291Y;
    }

    /* renamed from: a */
    public C14264y mo35855a() {
        return this.f31292Z;
    }
}
