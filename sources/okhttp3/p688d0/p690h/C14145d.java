package okhttp3.p688d0.p690h;

import com.facebook.stetho.server.http.HttpHeaders;
import java.io.IOException;
import java.net.ProtocolException;
import okhttp3.C14252r;
import okhttp3.C14264y;
import okhttp3.Call;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Response.C14114a;
import okhttp3.p688d0.C14124c;
import okhttp3.p688d0.p691i.C14160c;
import okhttp3.p688d0.p691i.C14166h;
import okio.Buffer;
import okio.C14281g;
import okio.C14282h;
import okio.C14287m;
import okio.C14300v;
import okio.C14302x;

/* renamed from: okhttp3.d0.h.d */
/* compiled from: Exchange */
public final class C14145d {

    /* renamed from: a */
    final C14155k f31406a;

    /* renamed from: b */
    final Call f31407b;

    /* renamed from: c */
    final C14252r f31408c;

    /* renamed from: d */
    final C14148e f31409d;

    /* renamed from: e */
    final C14160c f31410e;

    /* renamed from: f */
    private boolean f31411f;

    /* renamed from: okhttp3.d0.h.d$a */
    /* compiled from: Exchange */
    private final class C14146a extends C14281g {

        /* renamed from: U */
        private boolean f31412U;

        /* renamed from: V */
        private long f31413V;

        /* renamed from: W */
        private long f31414W;

        /* renamed from: X */
        private boolean f31415X;

        C14146a(C14300v vVar, long j) {
            super(vVar);
            this.f31413V = j;
        }

        /* renamed from: a */
        private IOException m44923a(IOException iOException) {
            if (this.f31412U) {
                return iOException;
            }
            this.f31412U = true;
            return C14145d.this.mo35932a(this.f31414W, false, true, iOException);
        }

        /* renamed from: b */
        public void mo35927b(Buffer buffer, long j) throws IOException {
            if (!this.f31415X) {
                long j2 = this.f31413V;
                if (j2 == -1 || this.f31414W + j <= j2) {
                    try {
                        super.mo35927b(buffer, j);
                        this.f31414W += j;
                    } catch (IOException e) {
                        throw m44923a(e);
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("expected ");
                    sb.append(this.f31413V);
                    sb.append(" bytes but received ");
                    sb.append(this.f31414W + j);
                    throw new ProtocolException(sb.toString());
                }
            } else {
                throw new IllegalStateException("closed");
            }
        }

        public void close() throws IOException {
            if (!this.f31415X) {
                this.f31415X = true;
                long j = this.f31413V;
                if (j == -1 || this.f31414W == j) {
                    try {
                        super.close();
                        m44923a(null);
                    } catch (IOException e) {
                        throw m44923a(e);
                    }
                } else {
                    throw new ProtocolException("unexpected end of stream");
                }
            }
        }

        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e) {
                throw m44923a(e);
            }
        }
    }

    /* renamed from: okhttp3.d0.h.d$b */
    /* compiled from: Exchange */
    final class C14147b extends C14282h {

        /* renamed from: U */
        private final long f31417U;

        /* renamed from: V */
        private long f31418V;

        /* renamed from: W */
        private boolean f31419W;

        /* renamed from: X */
        private boolean f31420X;

        C14147b(C14302x xVar, long j) {
            super(xVar);
            this.f31417U = j;
            if (j == 0) {
                mo35948a(null);
            }
        }

        /* renamed from: a */
        public long mo35899a(Buffer buffer, long j) throws IOException {
            if (!this.f31420X) {
                try {
                    long a = mo36412a().mo35899a(buffer, j);
                    if (a == -1) {
                        mo35948a(null);
                        return -1;
                    }
                    long j2 = this.f31418V + a;
                    if (this.f31417U != -1) {
                        if (j2 > this.f31417U) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("expected ");
                            sb.append(this.f31417U);
                            sb.append(" bytes but received ");
                            sb.append(j2);
                            throw new ProtocolException(sb.toString());
                        }
                    }
                    this.f31418V = j2;
                    if (j2 == this.f31417U) {
                        mo35948a(null);
                    }
                    return a;
                } catch (IOException e) {
                    throw mo35948a(e);
                }
            } else {
                throw new IllegalStateException("closed");
            }
        }

        public void close() throws IOException {
            if (!this.f31420X) {
                this.f31420X = true;
                try {
                    super.close();
                    mo35948a(null);
                } catch (IOException e) {
                    throw mo35948a(e);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public IOException mo35948a(IOException iOException) {
            if (this.f31419W) {
                return iOException;
            }
            this.f31419W = true;
            return C14145d.this.mo35932a(this.f31418V, true, false, iOException);
        }
    }

    public C14145d(C14155k kVar, Call call, C14252r rVar, C14148e eVar, C14160c cVar) {
        this.f31406a = kVar;
        this.f31407b = call;
        this.f31408c = rVar;
        this.f31409d = eVar;
        this.f31410e = cVar;
    }

    /* renamed from: a */
    public void mo35938a(Request request) throws IOException {
        try {
            this.f31408c.mo36232d(this.f31407b);
            this.f31410e.mo36006a(request);
            this.f31408c.mo36222a(this.f31407b, request);
        } catch (IOException e) {
            this.f31408c.mo36228b(this.f31407b, e);
            mo35937a(e);
            throw e;
        }
    }

    /* renamed from: b */
    public C14149f mo35939b() {
        return this.f31410e.mo36003a();
    }

    /* renamed from: c */
    public void mo35941c() {
        this.f31410e.cancel();
        this.f31406a.mo35988a(this, true, true, null);
    }

    /* renamed from: d */
    public void mo35942d() throws IOException {
        try {
            this.f31410e.mo36008b();
        } catch (IOException e) {
            this.f31408c.mo36228b(this.f31407b, e);
            mo35937a(e);
            throw e;
        }
    }

    /* renamed from: e */
    public void mo35943e() throws IOException {
        try {
            this.f31410e.mo36009c();
        } catch (IOException e) {
            this.f31408c.mo36228b(this.f31407b, e);
            mo35937a(e);
            throw e;
        }
    }

    /* renamed from: f */
    public boolean mo35944f() {
        return this.f31411f;
    }

    /* renamed from: g */
    public void mo35945g() {
        this.f31410e.mo36003a().mo35966e();
    }

    /* renamed from: h */
    public void mo35946h() {
        this.f31406a.mo35988a(this, true, false, null);
    }

    /* renamed from: i */
    public void mo35947i() {
        this.f31408c.mo36234f(this.f31407b);
    }

    /* renamed from: b */
    public void mo35940b(Response response) {
        this.f31408c.mo36223a(this.f31407b, response);
    }

    /* renamed from: a */
    public C14300v mo35935a(Request request, boolean z) throws IOException {
        this.f31411f = z;
        long a = request.mo35830a().mo35741a();
        this.f31408c.mo36230c(this.f31407b);
        return new C14146a(this.f31410e.mo36004a(request, a), a);
    }

    /* renamed from: a */
    public C14114a mo35933a(boolean z) throws IOException {
        try {
            C14114a a = this.f31410e.mo36002a(z);
            if (a != null) {
                C14124c.f31328a.mo35824a(a, this);
            }
            return a;
        } catch (IOException e) {
            this.f31408c.mo36231c(this.f31407b, e);
            mo35937a(e);
            throw e;
        }
    }

    /* renamed from: a */
    public C14264y mo35934a(Response response) throws IOException {
        try {
            this.f31408c.mo36233e(this.f31407b);
            String e = response.mo35861e(HttpHeaders.CONTENT_TYPE);
            long b = this.f31410e.mo36007b(response);
            return new C14166h(e, b, C14287m.m45716a((C14302x) new C14147b(this.f31410e.mo36005a(response), b)));
        } catch (IOException e2) {
            this.f31408c.mo36231c(this.f31407b, e2);
            mo35937a(e2);
            throw e2;
        }
    }

    /* renamed from: a */
    public void mo35936a() {
        this.f31410e.cancel();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo35937a(IOException iOException) {
        this.f31409d.mo35953d();
        this.f31410e.mo36003a().mo35957a(iOException);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public IOException mo35932a(long j, boolean z, boolean z2, IOException iOException) {
        if (iOException != null) {
            mo35937a(iOException);
        }
        if (z2) {
            if (iOException != null) {
                this.f31408c.mo36228b(this.f31407b, iOException);
            } else {
                this.f31408c.mo36215a(this.f31407b, j);
            }
        }
        if (z) {
            if (iOException != null) {
                this.f31408c.mo36231c(this.f31407b, iOException);
            } else {
                this.f31408c.mo36227b(this.f31407b, j);
            }
        }
        return this.f31406a.mo35988a(this, z2, z, iOException);
    }
}
