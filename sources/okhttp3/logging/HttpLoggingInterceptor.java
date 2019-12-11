package okhttp3.logging;

import com.facebook.stetho.common.Utf8Charset;
import com.facebook.stetho.server.http.HttpHeaders;
import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import okhttp3.C14240k;
import okhttp3.C14256t;
import okhttp3.C14258u;
import okhttp3.C14262x;
import okhttp3.C14264y;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.p688d0.p691i.C14163e;
import okio.Buffer;
import okio.BufferedSource;
import okio.C14284j;
import okio.C14302x;

public final class HttpLoggingInterceptor implements Interceptor {

    /* renamed from: d */
    private static final Charset f31776d = Charset.forName(Utf8Charset.NAME);

    /* renamed from: a */
    private final C14242a f31777a;

    /* renamed from: b */
    private volatile Set<String> f31778b;

    /* renamed from: c */
    private volatile Level f31779c;

    public enum Level {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    /* renamed from: okhttp3.logging.HttpLoggingInterceptor$a */
    public interface C14242a {

        /* renamed from: a */
        public static final C14242a f31785a = C14243a.f31786b;

        /* renamed from: a */
        void mo36192a(String str);
    }

    public HttpLoggingInterceptor() {
        this(C14242a.f31785a);
    }

    /* renamed from: a */
    public HttpLoggingInterceptor mo36191a(Level level) {
        if (level != null) {
            this.f31779c = level;
            return this;
        }
        throw new NullPointerException("level == null. Use Level.NONE instead.");
    }

    public Response intercept(Chain chain) throws IOException {
        String str;
        String str2;
        long j;
        char c;
        String str3;
        String str4;
        Throwable th;
        Chain chain2 = chain;
        Level level = this.f31779c;
        Request m0 = chain.mo35785m0();
        if (level == Level.NONE) {
            return chain2.mo35780a(m0);
        }
        boolean z = true;
        boolean z2 = level == Level.BODY;
        boolean z3 = z2 || level == Level.HEADERS;
        C14262x a = m0.mo35830a();
        if (a == null) {
            z = false;
        }
        C14240k a2 = chain.mo35781a();
        StringBuilder sb = new StringBuilder();
        sb.append("--> ");
        sb.append(m0.mo35835e());
        sb.append(' ');
        sb.append(m0.mo35837g());
        String str5 = "";
        if (a2 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" ");
            sb2.append(a2.mo35955a());
            str = sb2.toString();
        } else {
            str = str5;
        }
        sb.append(str);
        String sb3 = sb.toString();
        String str6 = "-byte body)";
        String str7 = " (";
        if (!z3 && z) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(sb3);
            sb4.append(str7);
            sb4.append(a.mo35741a());
            sb4.append(str6);
            sb3 = sb4.toString();
        }
        this.f31777a.mo36192a(sb3);
        String str8 = "-byte body omitted)";
        if (z3) {
            if (z) {
                if (a.mo35743b() != null) {
                    C14242a aVar = this.f31777a;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Content-Type: ");
                    sb5.append(a.mo35743b());
                    aVar.mo36192a(sb5.toString());
                }
                if (a.mo35741a() != -1) {
                    C14242a aVar2 = this.f31777a;
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("Content-Length: ");
                    sb6.append(a.mo35741a());
                    aVar2.mo36192a(sb6.toString());
                }
            }
            C14256t c2 = m0.mo35833c();
            int b = c2.mo36246b();
            for (int i = 0; i < b; i++) {
                String a3 = c2.mo36243a(i);
                if (!HttpHeaders.CONTENT_TYPE.equalsIgnoreCase(a3) && !HttpHeaders.CONTENT_LENGTH.equalsIgnoreCase(a3)) {
                    m45399a(c2, i);
                }
            }
            String str9 = "--> END ";
            if (!z2 || !z) {
                C14242a aVar3 = this.f31777a;
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str9);
                sb7.append(m0.mo35835e());
                aVar3.mo36192a(sb7.toString());
            } else if (m45400a(m0.mo35833c())) {
                C14242a aVar4 = this.f31777a;
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str9);
                sb8.append(m0.mo35835e());
                sb8.append(" (encoded body omitted)");
                aVar4.mo36192a(sb8.toString());
            } else if (a.mo36275c()) {
                C14242a aVar5 = this.f31777a;
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str9);
                sb9.append(m0.mo35835e());
                sb9.append(" (duplex request body omitted)");
                aVar5.mo36192a(sb9.toString());
            } else {
                Buffer buffer = new Buffer();
                a.mo35742a(buffer);
                Charset charset = f31776d;
                C14258u b2 = a.mo35743b();
                if (b2 != null) {
                    charset = b2.mo36261a(f31776d);
                }
                this.f31777a.mo36192a(str5);
                if (m45401a(buffer)) {
                    this.f31777a.mo36192a(buffer.mo36300a(charset));
                    C14242a aVar6 = this.f31777a;
                    StringBuilder sb10 = new StringBuilder();
                    sb10.append(str9);
                    sb10.append(m0.mo35835e());
                    sb10.append(str7);
                    sb10.append(a.mo35741a());
                    sb10.append(str6);
                    aVar6.mo36192a(sb10.toString());
                } else {
                    C14242a aVar7 = this.f31777a;
                    StringBuilder sb11 = new StringBuilder();
                    sb11.append(str9);
                    sb11.append(m0.mo35835e());
                    sb11.append(" (binary ");
                    sb11.append(a.mo35741a());
                    sb11.append(str8);
                    aVar7.mo36192a(sb11.toString());
                }
            }
        }
        long nanoTime = System.nanoTime();
        try {
            Response a4 = chain2.mo35780a(m0);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            C14264y a5 = a4.mo35855a();
            long b3 = a5.mo35701b();
            if (b3 != -1) {
                StringBuilder sb12 = new StringBuilder();
                sb12.append(b3);
                sb12.append("-byte");
                str2 = sb12.toString();
            } else {
                str2 = "unknown-length";
            }
            C14242a aVar8 = this.f31777a;
            StringBuilder sb13 = new StringBuilder();
            String str10 = str6;
            sb13.append("<-- ");
            sb13.append(a4.mo35858c());
            if (a4.mo35864g().isEmpty()) {
                str3 = str5;
                j = b3;
                c = ' ';
            } else {
                StringBuilder sb14 = new StringBuilder();
                j = b3;
                c = ' ';
                sb14.append(' ');
                sb14.append(a4.mo35864g());
                str3 = sb14.toString();
            }
            sb13.append(str3);
            sb13.append(c);
            sb13.append(a4.mo35870m().mo35837g());
            sb13.append(str7);
            sb13.append(millis);
            sb13.append("ms");
            if (!z3) {
                StringBuilder sb15 = new StringBuilder();
                sb15.append(", ");
                sb15.append(str2);
                sb15.append(" body");
                str4 = sb15.toString();
            } else {
                str4 = str5;
            }
            sb13.append(str4);
            sb13.append(')');
            aVar8.mo36192a(sb13.toString());
            if (z3) {
                C14256t e = a4.mo35862e();
                int b4 = e.mo36246b();
                for (int i2 = 0; i2 < b4; i2++) {
                    m45399a(e, i2);
                }
                if (!z2 || !C14163e.m45019b(a4)) {
                    this.f31777a.mo36192a("<-- END HTTP");
                } else if (m45400a(a4.mo35862e())) {
                    this.f31777a.mo36192a("<-- END HTTP (encoded body omitted)");
                } else {
                    BufferedSource d = a5.mo35703d();
                    d.mo36314b(Long.MAX_VALUE);
                    Buffer Z = d.mo36288Z();
                    Long l = null;
                    if ("gzip".equalsIgnoreCase(e.mo36244a("Content-Encoding"))) {
                        l = Long.valueOf(Z.mo36335h());
                        C14284j jVar = new C14284j(Z.clone());
                        try {
                            Z = new Buffer();
                            Z.mo36298a((C14302x) jVar);
                            jVar.close();
                        } catch (Throwable th2) {
                            Throwable th3 = th2;
                            try {
                                jVar.close();
                            } catch (Throwable th4) {
                                th.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    }
                    Charset charset2 = f31776d;
                    C14258u c3 = a5.mo35702c();
                    if (c3 != null) {
                        charset2 = c3.mo36261a(f31776d);
                    }
                    if (!m45401a(Z)) {
                        this.f31777a.mo36192a(str5);
                        C14242a aVar9 = this.f31777a;
                        StringBuilder sb16 = new StringBuilder();
                        sb16.append("<-- END HTTP (binary ");
                        sb16.append(Z.mo36335h());
                        sb16.append(str8);
                        aVar9.mo36192a(sb16.toString());
                        return a4;
                    }
                    if (j != 0) {
                        this.f31777a.mo36192a(str5);
                        this.f31777a.mo36192a(Z.clone().mo36300a(charset2));
                    }
                    String str11 = "<-- END HTTP (";
                    if (l != null) {
                        C14242a aVar10 = this.f31777a;
                        StringBuilder sb17 = new StringBuilder();
                        sb17.append(str11);
                        sb17.append(Z.mo36335h());
                        sb17.append("-byte, ");
                        sb17.append(l);
                        sb17.append("-gzipped-byte body)");
                        aVar10.mo36192a(sb17.toString());
                    } else {
                        C14242a aVar11 = this.f31777a;
                        StringBuilder sb18 = new StringBuilder();
                        sb18.append(str11);
                        sb18.append(Z.mo36335h());
                        sb18.append(str10);
                        aVar11.mo36192a(sb18.toString());
                    }
                }
            }
            return a4;
        } catch (Exception e2) {
            Exception exc = e2;
            C14242a aVar12 = this.f31777a;
            StringBuilder sb19 = new StringBuilder();
            sb19.append("<-- HTTP FAILED: ");
            sb19.append(exc);
            aVar12.mo36192a(sb19.toString());
            throw exc;
        }
    }

    public HttpLoggingInterceptor(C14242a aVar) {
        this.f31778b = Collections.emptySet();
        this.f31779c = Level.NONE;
        this.f31777a = aVar;
    }

    /* renamed from: a */
    private void m45399a(C14256t tVar, int i) {
        String b = this.f31778b.contains(tVar.mo36243a(i)) ? "██" : tVar.mo36247b(i);
        C14242a aVar = this.f31777a;
        StringBuilder sb = new StringBuilder();
        sb.append(tVar.mo36243a(i));
        sb.append(": ");
        sb.append(b);
        aVar.mo36192a(sb.toString());
    }

    /* renamed from: a */
    static boolean m45401a(Buffer buffer) {
        try {
            Buffer buffer2 = new Buffer();
            buffer.mo36305a(buffer2, 0, buffer.mo36335h() < 64 ? buffer.mo36335h() : 64);
            int i = 0;
            while (true) {
                if (i >= 16) {
                    break;
                } else if (buffer2.mo36309a0()) {
                    break;
                } else {
                    int g = buffer2.mo36332g();
                    if (Character.isISOControl(g) && !Character.isWhitespace(g)) {
                        return false;
                    }
                    i++;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m45400a(C14256t tVar) {
        String a = tVar.mo36244a("Content-Encoding");
        return a != null && !a.equalsIgnoreCase("identity") && !a.equalsIgnoreCase("gzip");
    }
}
