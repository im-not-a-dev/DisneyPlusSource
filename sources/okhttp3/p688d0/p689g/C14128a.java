package okhttp3.p688d0.p689g;

import com.facebook.stetho.server.http.HttpHeaders;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.C14256t;
import okhttp3.C14256t.C14257a;
import okhttp3.C14259v;
import okhttp3.C14264y;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Response.C14114a;
import okhttp3.p688d0.C14124c;
import okhttp3.p688d0.C14126e;
import okhttp3.p688d0.p689g.C14131c.C14132a;
import okhttp3.p688d0.p691i.C14163e;
import okhttp3.p688d0.p691i.C14164f;
import okhttp3.p688d0.p691i.C14166h;
import okio.Buffer;
import okio.BufferedSource;
import okio.C14280f;
import okio.C14287m;
import okio.C14300v;
import okio.C14302x;
import okio.C14303y;

/* renamed from: okhttp3.d0.g.a */
/* compiled from: CacheInterceptor */
public final class C14128a implements Interceptor {

    /* renamed from: a */
    final C14141f f31341a;

    /* renamed from: okhttp3.d0.g.a$a */
    /* compiled from: CacheInterceptor */
    class C14129a implements C14302x {

        /* renamed from: U */
        final /* synthetic */ BufferedSource f31342U;

        /* renamed from: V */
        final /* synthetic */ C14130b f31343V;

        /* renamed from: W */
        final /* synthetic */ C14280f f31344W;

        /* renamed from: c */
        boolean f31345c;

        C14129a(C14128a aVar, BufferedSource bufferedSource, C14130b bVar, C14280f fVar) {
            this.f31342U = bufferedSource;
            this.f31343V = bVar;
            this.f31344W = fVar;
        }

        /* renamed from: X */
        public C14303y mo35898X() {
            return this.f31342U.mo35898X();
        }

        /* renamed from: a */
        public long mo35899a(Buffer buffer, long j) throws IOException {
            try {
                long a = this.f31342U.mo35899a(buffer, j);
                if (a == -1) {
                    if (!this.f31345c) {
                        this.f31345c = true;
                        this.f31344W.close();
                    }
                    return -1;
                }
                buffer.mo36305a(this.f31344W.mo36337h0(), buffer.mo36335h() - a, a);
                this.f31344W.mo36341i0();
                return a;
            } catch (IOException e) {
                if (!this.f31345c) {
                    this.f31345c = true;
                    this.f31343V.mo35698a();
                }
                throw e;
            }
        }

        public void close() throws IOException {
            if (!this.f31345c && !C14126e.m44836a((C14302x) this, 100, TimeUnit.MILLISECONDS)) {
                this.f31345c = true;
                this.f31343V.mo35698a();
            }
            this.f31342U.close();
        }
    }

    public C14128a(C14141f fVar) {
        this.f31341a = fVar;
    }

    /* renamed from: a */
    private static Response m44849a(Response response) {
        if (response == null || response.mo35855a() == null) {
            return response;
        }
        C14114a i = response.mo35866i();
        i.mo35882a((C14264y) null);
        return i.mo35883a();
    }

    /* renamed from: b */
    static boolean m44853b(String str) {
        return !"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str);
    }

    public Response intercept(Chain chain) throws IOException {
        C14141f fVar = this.f31341a;
        Response b = fVar != null ? fVar.mo35697b(chain.mo35785m0()) : null;
        C14131c a = new C14132a(System.currentTimeMillis(), chain.mo35785m0(), b).mo35900a();
        Request request = a.f31346a;
        Response response = a.f31347b;
        C14141f fVar2 = this.f31341a;
        if (fVar2 != null) {
            fVar2.mo35696a(a);
        }
        if (b != null && response == null) {
            C14126e.m44830a((Closeable) b.mo35855a());
        }
        if (request == null && response == null) {
            C14114a aVar = new C14114a();
            aVar.mo35877a(chain.mo35785m0());
            aVar.mo35881a(C14259v.HTTP_1_1);
            aVar.mo35873a(504);
            aVar.mo35875a("Unsatisfiable Request (only-if-cached)");
            aVar.mo35882a(C14126e.f31333d);
            aVar.mo35885b(-1);
            aVar.mo35874a(System.currentTimeMillis());
            return aVar.mo35883a();
        } else if (request == null) {
            C14114a i = response.mo35866i();
            i.mo35878a(m44849a(response));
            return i.mo35883a();
        } else {
            try {
                Response a2 = chain.mo35780a(request);
                if (a2 == null && b != null) {
                }
                if (response != null) {
                    if (a2.mo35858c() == 304) {
                        C14114a i2 = response.mo35866i();
                        i2.mo35880a(m44851a(response.mo35862e(), a2.mo35862e()));
                        i2.mo35885b(a2.mo35871n());
                        i2.mo35874a(a2.mo35869l());
                        i2.mo35878a(m44849a(response));
                        i2.mo35887b(m44849a(a2));
                        Response a3 = i2.mo35883a();
                        a2.mo35855a().close();
                        this.f31341a.mo35693a();
                        this.f31341a.mo35695a(response, a3);
                        return a3;
                    }
                    C14126e.m44830a((Closeable) response.mo35855a());
                }
                C14114a i3 = a2.mo35866i();
                i3.mo35878a(m44849a(response));
                i3.mo35887b(m44849a(a2));
                Response a4 = i3.mo35883a();
                if (this.f31341a != null) {
                    if (C14163e.m45019b(a4) && C14131c.m44857a(a4, request)) {
                        return m44850a(this.f31341a.mo35692a(a4), a4);
                    }
                    if (C14164f.m45025a(request.mo35835e())) {
                        try {
                            this.f31341a.mo35694a(request);
                        } catch (IOException unused) {
                        }
                    }
                }
                return a4;
            } finally {
                if (b != null) {
                    C14126e.m44830a((Closeable) b.mo35855a());
                }
            }
        }
    }

    /* renamed from: a */
    private Response m44850a(C14130b bVar, Response response) throws IOException {
        if (bVar == null) {
            return response;
        }
        C14300v body = bVar.body();
        if (body == null) {
            return response;
        }
        C14129a aVar = new C14129a(this, response.mo35855a().mo35703d(), bVar, C14287m.m45717a(body));
        String e = response.mo35861e(HttpHeaders.CONTENT_TYPE);
        long b = response.mo35855a().mo35701b();
        C14114a i = response.mo35866i();
        i.mo35882a((C14264y) new C14166h(e, b, C14287m.m45716a((C14302x) aVar)));
        return i.mo35883a();
    }

    /* renamed from: a */
    private static C14256t m44851a(C14256t tVar, C14256t tVar2) {
        C14257a aVar = new C14257a();
        int b = tVar.mo36246b();
        for (int i = 0; i < b; i++) {
            String a = tVar.mo36243a(i);
            String b2 = tVar.mo36247b(i);
            if ((!"Warning".equalsIgnoreCase(a) || !b2.startsWith("1")) && (m44852a(a) || !m44853b(a) || tVar2.mo36244a(a) == null)) {
                C14124c.f31328a.mo35827a(aVar, a, b2);
            }
        }
        int b3 = tVar2.mo36246b();
        for (int i2 = 0; i2 < b3; i2++) {
            String a2 = tVar2.mo36243a(i2);
            if (!m44852a(a2) && m44853b(a2)) {
                C14124c.f31328a.mo35827a(aVar, a2, tVar2.mo36247b(i2));
            }
        }
        return aVar.mo36255a();
    }

    /* renamed from: a */
    static boolean m44852a(String str) {
        return HttpHeaders.CONTENT_LENGTH.equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || HttpHeaders.CONTENT_TYPE.equalsIgnoreCase(str);
    }
}
