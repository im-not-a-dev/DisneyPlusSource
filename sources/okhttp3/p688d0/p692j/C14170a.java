package okhttp3.p688d0.p692j;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okhttp3.C14256t;
import okhttp3.C14256t.C14257a;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Response.C14114a;
import okhttp3.p688d0.C14124c;
import okhttp3.p688d0.C14126e;
import okhttp3.p688d0.p690h.C14149f;
import okhttp3.p688d0.p691i.C14160c;
import okhttp3.p688d0.p691i.C14163e;
import okhttp3.p688d0.p691i.C14167i;
import okhttp3.p688d0.p691i.C14169k;
import okio.Buffer;
import okio.BufferedSource;
import okio.C14280f;
import okio.C14283i;
import okio.C14300v;
import okio.C14302x;
import okio.C14303y;

/* renamed from: okhttp3.d0.j.a */
/* compiled from: Http1ExchangeCodec */
public final class C14170a implements C14160c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final OkHttpClient f31507a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C14149f f31508b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final BufferedSource f31509c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C14280f f31510d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f31511e = 0;

    /* renamed from: f */
    private long f31512f = 262144;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C14256t f31513g;

    /* renamed from: okhttp3.d0.j.a$b */
    /* compiled from: Http1ExchangeCodec */
    private abstract class C14172b implements C14302x {

        /* renamed from: U */
        protected boolean f31514U;

        /* renamed from: c */
        protected final C14283i f31516c;

        private C14172b() {
            this.f31516c = new C14283i(C14170a.this.f31509c.mo35898X());
        }

        /* renamed from: X */
        public C14303y mo35898X() {
            return this.f31516c;
        }

        /* renamed from: a */
        public long mo35899a(Buffer buffer, long j) throws IOException {
            try {
                return C14170a.this.f31509c.mo35899a(buffer, j);
            } catch (IOException e) {
                C14170a.this.f31508b.mo35966e();
                mo36018a();
                throw e;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo36018a() {
            if (C14170a.this.f31511e != 6) {
                if (C14170a.this.f31511e == 5) {
                    C14170a.this.m45057a(this.f31516c);
                    C14170a.this.f31511e = 6;
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("state: ");
                sb.append(C14170a.this.f31511e);
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    /* renamed from: okhttp3.d0.j.a$c */
    /* compiled from: Http1ExchangeCodec */
    private final class C14173c implements C14300v {

        /* renamed from: U */
        private boolean f31517U;

        /* renamed from: c */
        private final C14283i f31519c = new C14283i(C14170a.this.f31510d.mo36019X());

        C14173c() {
        }

        /* renamed from: X */
        public C14303y mo36019X() {
            return this.f31519c;
        }

        /* renamed from: b */
        public void mo35927b(Buffer buffer, long j) throws IOException {
            if (this.f31517U) {
                throw new IllegalStateException("closed");
            } else if (j != 0) {
                C14170a.this.f31510d.mo36333g(j);
                String str = "\r\n";
                C14170a.this.f31510d.mo36301a(str);
                C14170a.this.f31510d.mo35927b(buffer, j);
                C14170a.this.f31510d.mo36301a(str);
            }
        }

        public synchronized void close() throws IOException {
            if (!this.f31517U) {
                this.f31517U = true;
                C14170a.this.f31510d.mo36301a("0\r\n\r\n");
                C14170a.this.m45057a(this.f31519c);
                C14170a.this.f31511e = 3;
            }
        }

        public synchronized void flush() throws IOException {
            if (!this.f31517U) {
                C14170a.this.f31510d.flush();
            }
        }
    }

    /* renamed from: okhttp3.d0.j.a$d */
    /* compiled from: Http1ExchangeCodec */
    private class C14174d extends C14172b {

        /* renamed from: W */
        private final HttpUrl f31520W;

        /* renamed from: X */
        private long f31521X = -1;

        /* renamed from: Y */
        private boolean f31522Y = true;

        C14174d(HttpUrl httpUrl) {
            super();
            this.f31520W = httpUrl;
        }

        /* renamed from: b */
        private void m45084b() throws IOException {
            if (this.f31521X != -1) {
                C14170a.this.f31509c.mo36324d0();
            }
            try {
                this.f31521X = C14170a.this.f31509c.mo36331f0();
                String trim = C14170a.this.f31509c.mo36324d0().trim();
                if (this.f31521X < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("expected chunk size and optional extensions but was \"");
                    sb.append(this.f31521X);
                    sb.append(trim);
                    sb.append("\"");
                    throw new ProtocolException(sb.toString());
                } else if (this.f31521X == 0) {
                    this.f31522Y = false;
                    C14170a aVar = C14170a.this;
                    aVar.f31513g = aVar.m45068h();
                    C14163e.m45016a(C14170a.this.f31507a.mo35793g(), this.f31520W, C14170a.this.f31513g);
                    mo36018a();
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        /* renamed from: a */
        public long mo35899a(Buffer buffer, long j) throws IOException {
            if (j < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("byteCount < 0: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
            } else if (this.f31514U) {
                throw new IllegalStateException("closed");
            } else if (!this.f31522Y) {
                return -1;
            } else {
                long j2 = this.f31521X;
                if (j2 == 0 || j2 == -1) {
                    m45084b();
                    if (!this.f31522Y) {
                        return -1;
                    }
                }
                long a = super.mo35899a(buffer, Math.min(j, this.f31521X));
                if (a != -1) {
                    this.f31521X -= a;
                    return a;
                }
                C14170a.this.f31508b.mo35966e();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                mo36018a();
                throw protocolException;
            }
        }

        public void close() throws IOException {
            if (!this.f31514U) {
                if (this.f31522Y && !C14126e.m44836a((C14302x) this, 100, TimeUnit.MILLISECONDS)) {
                    C14170a.this.f31508b.mo35966e();
                    mo36018a();
                }
                this.f31514U = true;
            }
        }
    }

    /* renamed from: okhttp3.d0.j.a$e */
    /* compiled from: Http1ExchangeCodec */
    private class C14175e extends C14172b {

        /* renamed from: W */
        private long f31524W;

        C14175e(long j) {
            super();
            this.f31524W = j;
            if (this.f31524W == 0) {
                mo36018a();
            }
        }

        /* renamed from: a */
        public long mo35899a(Buffer buffer, long j) throws IOException {
            if (j < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("byteCount < 0: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
            } else if (!this.f31514U) {
                long j2 = this.f31524W;
                if (j2 == 0) {
                    return -1;
                }
                long a = super.mo35899a(buffer, Math.min(j2, j));
                if (a != -1) {
                    this.f31524W -= a;
                    if (this.f31524W == 0) {
                        mo36018a();
                    }
                    return a;
                }
                C14170a.this.f31508b.mo35966e();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                mo36018a();
                throw protocolException;
            } else {
                throw new IllegalStateException("closed");
            }
        }

        public void close() throws IOException {
            if (!this.f31514U) {
                if (this.f31524W != 0 && !C14126e.m44836a((C14302x) this, 100, TimeUnit.MILLISECONDS)) {
                    C14170a.this.f31508b.mo35966e();
                    mo36018a();
                }
                this.f31514U = true;
            }
        }
    }

    /* renamed from: okhttp3.d0.j.a$f */
    /* compiled from: Http1ExchangeCodec */
    private final class C14176f implements C14300v {

        /* renamed from: U */
        private boolean f31526U;

        /* renamed from: c */
        private final C14283i f31528c;

        private C14176f() {
            this.f31528c = new C14283i(C14170a.this.f31510d.mo36019X());
        }

        /* renamed from: X */
        public C14303y mo36019X() {
            return this.f31528c;
        }

        /* renamed from: b */
        public void mo35927b(Buffer buffer, long j) throws IOException {
            if (!this.f31526U) {
                C14126e.m44829a(buffer.mo36335h(), 0, j);
                C14170a.this.f31510d.mo35927b(buffer, j);
                return;
            }
            throw new IllegalStateException("closed");
        }

        public void close() throws IOException {
            if (!this.f31526U) {
                this.f31526U = true;
                C14170a.this.m45057a(this.f31528c);
                C14170a.this.f31511e = 3;
            }
        }

        public void flush() throws IOException {
            if (!this.f31526U) {
                C14170a.this.f31510d.flush();
            }
        }
    }

    /* renamed from: okhttp3.d0.j.a$g */
    /* compiled from: Http1ExchangeCodec */
    private class C14177g extends C14172b {

        /* renamed from: W */
        private boolean f31529W;

        private C14177g(C14170a aVar) {
            super();
        }

        /* renamed from: a */
        public long mo35899a(Buffer buffer, long j) throws IOException {
            if (j < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("byteCount < 0: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
            } else if (this.f31514U) {
                throw new IllegalStateException("closed");
            } else if (this.f31529W) {
                return -1;
            } else {
                long a = super.mo35899a(buffer, j);
                if (a != -1) {
                    return a;
                }
                this.f31529W = true;
                mo36018a();
                return -1;
            }
        }

        public void close() throws IOException {
            if (!this.f31514U) {
                if (!this.f31529W) {
                    mo36018a();
                }
                this.f31514U = true;
            }
        }
    }

    public C14170a(OkHttpClient okHttpClient, C14149f fVar, BufferedSource bufferedSource, C14280f fVar2) {
        this.f31507a = okHttpClient;
        this.f31508b = fVar;
        this.f31509c = bufferedSource;
        this.f31510d = fVar2;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public C14256t m45068h() throws IOException {
        C14257a aVar = new C14257a();
        while (true) {
            String g = m45066g();
            if (g.length() == 0) {
                return aVar.mo36255a();
            }
            C14124c.f31328a.mo35826a(aVar, g);
        }
    }

    public void cancel() {
        C14149f fVar = this.f31508b;
        if (fVar != null) {
            fVar.mo35963b();
        }
    }

    /* renamed from: d */
    private C14300v m45061d() {
        if (this.f31511e == 1) {
            this.f31511e = 2;
            return new C14173c();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.f31511e);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: e */
    private C14300v m45063e() {
        if (this.f31511e == 1) {
            this.f31511e = 2;
            return new C14176f();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.f31511e);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: f */
    private C14302x m45065f() {
        if (this.f31511e == 4) {
            this.f31511e = 5;
            this.f31508b.mo35966e();
            return new C14177g();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.f31511e);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: g */
    private String m45066g() throws IOException {
        String d = this.f31509c.mo36322d(this.f31512f);
        this.f31512f -= (long) d.length();
        return d;
    }

    /* renamed from: b */
    public long mo36007b(Response response) {
        if (!C14163e.m45019b(response)) {
            return 0;
        }
        if ("chunked".equalsIgnoreCase(response.mo35861e("Transfer-Encoding"))) {
            return -1;
        }
        return C14163e.m45013a(response);
    }

    /* renamed from: c */
    public void mo36009c() throws IOException {
        this.f31510d.flush();
    }

    /* renamed from: c */
    public void mo36017c(Response response) throws IOException {
        long a = C14163e.m45013a(response);
        if (a != -1) {
            C14302x a2 = m45054a(a);
            C14126e.m44843b(a2, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
            a2.close();
        }
    }

    /* renamed from: a */
    public C14149f mo36003a() {
        return this.f31508b;
    }

    /* renamed from: b */
    public void mo36008b() throws IOException {
        this.f31510d.flush();
    }

    /* renamed from: a */
    public C14300v mo36004a(Request request, long j) throws IOException {
        if (request.mo35830a() == null || !request.mo35830a().mo36275c()) {
            if ("chunked".equalsIgnoreCase(request.mo35829a("Transfer-Encoding"))) {
                return m45061d();
            }
            if (j != -1) {
                return m45063e();
            }
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        throw new ProtocolException("Duplex connections are not supported for HTTP/1");
    }

    /* renamed from: a */
    public void mo36006a(Request request) throws IOException {
        mo36016a(request.mo35833c(), C14167i.m45043a(request, this.f31508b.mo35967f().mo36281b().type()));
    }

    /* renamed from: a */
    public C14302x mo36005a(Response response) {
        if (!C14163e.m45019b(response)) {
            return m45054a(0);
        }
        if ("chunked".equalsIgnoreCase(response.mo35861e("Transfer-Encoding"))) {
            return m45055a(response.mo35870m().mo35837g());
        }
        long a = C14163e.m45013a(response);
        if (a != -1) {
            return m45054a(a);
        }
        return m45065f();
    }

    /* renamed from: a */
    public void mo36016a(C14256t tVar, String str) throws IOException {
        if (this.f31511e == 0) {
            String str2 = "\r\n";
            this.f31510d.mo36301a(str).mo36301a(str2);
            int b = tVar.mo36246b();
            for (int i = 0; i < b; i++) {
                this.f31510d.mo36301a(tVar.mo36243a(i)).mo36301a(": ").mo36301a(tVar.mo36247b(i)).mo36301a(str2);
            }
            this.f31510d.mo36301a(str2);
            this.f31511e = 1;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.f31511e);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public C14114a mo36002a(boolean z) throws IOException {
        int i = this.f31511e;
        if (i == 1 || i == 3) {
            try {
                C14169k a = C14169k.m45050a(m45066g());
                C14114a aVar = new C14114a();
                aVar.mo35881a(a.f31504a);
                aVar.mo35873a(a.f31505b);
                aVar.mo35875a(a.f31506c);
                aVar.mo35880a(m45068h());
                if (z && a.f31505b == 100) {
                    return null;
                }
                if (a.f31505b == 100) {
                    this.f31511e = 3;
                    return aVar;
                }
                this.f31511e = 4;
                return aVar;
            } catch (EOFException e) {
                C14149f fVar = this.f31508b;
                String n = fVar != null ? fVar.mo35967f().mo36280a().mo36176k().mo35763n() : "unknown";
                StringBuilder sb = new StringBuilder();
                sb.append("unexpected end of stream on ");
                sb.append(n);
                throw new IOException(sb.toString(), e);
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("state: ");
            sb2.append(this.f31511e);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* renamed from: a */
    private C14302x m45054a(long j) {
        if (this.f31511e == 4) {
            this.f31511e = 5;
            return new C14175e(j);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.f31511e);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    private C14302x m45055a(HttpUrl httpUrl) {
        if (this.f31511e == 4) {
            this.f31511e = 5;
            return new C14174d(httpUrl);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.f31511e);
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m45057a(C14283i iVar) {
        C14303y g = iVar.mo36422g();
        iVar.mo36414a(C14303y.f31915d);
        g.mo36415a();
        g.mo36418b();
    }
}
