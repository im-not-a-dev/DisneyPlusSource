package okhttp3.p688d0.p693k;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.C14256t;
import okhttp3.C14256t.C14257a;
import okhttp3.C14259v;
import okhttp3.Interceptor.Chain;
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
import okio.C14300v;
import okio.C14302x;

/* renamed from: okhttp3.d0.k.g */
/* compiled from: Http2ExchangeCodec */
public final class C14200g implements C14160c {

    /* renamed from: g */
    private static final List<String> f31637g = C14126e.m44825a((T[]) new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});

    /* renamed from: h */
    private static final List<String> f31638h = C14126e.m44825a((T[]) new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});

    /* renamed from: a */
    private final Chain f31639a;

    /* renamed from: b */
    private final C14149f f31640b;

    /* renamed from: c */
    private final C14185f f31641c;

    /* renamed from: d */
    private volatile C14204i f31642d;

    /* renamed from: e */
    private final C14259v f31643e;

    /* renamed from: f */
    private volatile boolean f31644f;

    public C14200g(OkHttpClient okHttpClient, C14149f fVar, Chain chain, C14185f fVar2) {
        C14259v vVar;
        this.f31640b = fVar;
        this.f31639a = chain;
        this.f31641c = fVar2;
        if (okHttpClient.mo35805s().contains(C14259v.H2_PRIOR_KNOWLEDGE)) {
            vVar = C14259v.H2_PRIOR_KNOWLEDGE;
        } else {
            vVar = C14259v.HTTP_2;
        }
        this.f31643e = vVar;
    }

    /* renamed from: a */
    public C14149f mo36003a() {
        return this.f31640b;
    }

    /* renamed from: b */
    public void mo36008b() throws IOException {
        this.f31642d.mo36080d().close();
    }

    /* renamed from: c */
    public void mo36009c() throws IOException {
        this.f31641c.flush();
    }

    public void cancel() {
        this.f31644f = true;
        if (this.f31642d != null) {
            this.f31642d.mo36073a(C14179b.CANCEL);
        }
    }

    /* renamed from: b */
    public static List<C14180c> m45180b(Request request) {
        C14256t c = request.mo35833c();
        ArrayList arrayList = new ArrayList(c.mo36246b() + 4);
        arrayList.add(new C14180c(C14180c.f31545f, request.mo35835e()));
        arrayList.add(new C14180c(C14180c.f31546g, C14167i.m45042a(request.mo35837g())));
        String a = request.mo35829a("Host");
        if (a != null) {
            arrayList.add(new C14180c(C14180c.f31548i, a));
        }
        arrayList.add(new C14180c(C14180c.f31547h, request.mo35837g().mo35764o()));
        int b = c.mo36246b();
        for (int i = 0; i < b; i++) {
            String lowerCase = c.mo36243a(i).toLowerCase(Locale.US);
            if (!f31637g.contains(lowerCase) || (lowerCase.equals("te") && c.mo36247b(i).equals("trailers"))) {
                arrayList.add(new C14180c(lowerCase, c.mo36247b(i)));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public C14300v mo36004a(Request request, long j) {
        return this.f31642d.mo36080d();
    }

    /* renamed from: a */
    public void mo36006a(Request request) throws IOException {
        if (this.f31642d == null) {
            this.f31642d = this.f31641c.mo36031a(m45180b(request), request.mo35830a() != null);
            if (!this.f31644f) {
                this.f31642d.mo36084h().mo36417a((long) this.f31639a.mo35782b(), TimeUnit.MILLISECONDS);
                this.f31642d.mo36087k().mo36417a((long) this.f31639a.mo35783c(), TimeUnit.MILLISECONDS);
                return;
            }
            this.f31642d.mo36073a(C14179b.CANCEL);
            throw new IOException("Canceled");
        }
    }

    /* renamed from: a */
    public C14114a mo36002a(boolean z) throws IOException {
        C14114a a = m45179a(this.f31642d.mo36085i(), this.f31643e);
        if (!z || C14124c.f31328a.mo35821a(a) != 100) {
            return a;
        }
        return null;
    }

    /* renamed from: b */
    public long mo36007b(Response response) {
        return C14163e.m45013a(response);
    }

    /* renamed from: a */
    public static C14114a m45179a(C14256t tVar, C14259v vVar) throws IOException {
        C14257a aVar = new C14257a();
        int b = tVar.mo36246b();
        C14169k kVar = null;
        for (int i = 0; i < b; i++) {
            String a = tVar.mo36243a(i);
            String b2 = tVar.mo36247b(i);
            if (a.equals(":status")) {
                StringBuilder sb = new StringBuilder();
                sb.append("HTTP/1.1 ");
                sb.append(b2);
                kVar = C14169k.m45050a(sb.toString());
            } else if (!f31638h.contains(a)) {
                C14124c.f31328a.mo35827a(aVar, a, b2);
            }
        }
        if (kVar != null) {
            C14114a aVar2 = new C14114a();
            aVar2.mo35881a(vVar);
            aVar2.mo35873a(kVar.f31505b);
            aVar2.mo35875a(kVar.f31506c);
            aVar2.mo35880a(aVar.mo36255a());
            return aVar2;
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    /* renamed from: a */
    public C14302x mo36005a(Response response) {
        return this.f31642d.mo36081e();
    }
}
