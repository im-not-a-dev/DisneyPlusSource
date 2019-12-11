package okhttp3.p688d0.p691i;

import java.io.IOException;
import java.util.List;
import okhttp3.C14240k;
import okhttp3.Call;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.p688d0.p690h.C14145d;
import okhttp3.p688d0.p690h.C14155k;

/* renamed from: okhttp3.d0.i.g */
/* compiled from: RealInterceptorChain */
public final class C14165g implements Chain {

    /* renamed from: a */
    private final List<Interceptor> f31490a;

    /* renamed from: b */
    private final C14155k f31491b;

    /* renamed from: c */
    private final C14145d f31492c;

    /* renamed from: d */
    private final int f31493d;

    /* renamed from: e */
    private final Request f31494e;

    /* renamed from: f */
    private final Call f31495f;

    /* renamed from: g */
    private final int f31496g;

    /* renamed from: h */
    private final int f31497h;

    /* renamed from: i */
    private final int f31498i;

    /* renamed from: j */
    private int f31499j;

    public C14165g(List<Interceptor> list, C14155k kVar, C14145d dVar, int i, Request request, Call call, int i2, int i3, int i4) {
        this.f31490a = list;
        this.f31491b = kVar;
        this.f31492c = dVar;
        this.f31493d = i;
        this.f31494e = request;
        this.f31495f = call;
        this.f31496g = i2;
        this.f31497h = i3;
        this.f31498i = i4;
    }

    /* renamed from: a */
    public C14240k mo35781a() {
        C14145d dVar = this.f31492c;
        if (dVar != null) {
            return dVar.mo35939b();
        }
        return null;
    }

    /* renamed from: b */
    public int mo35782b() {
        return this.f31497h;
    }

    /* renamed from: c */
    public int mo35783c() {
        return this.f31498i;
    }

    /* renamed from: d */
    public int mo35784d() {
        return this.f31496g;
    }

    /* renamed from: e */
    public C14145d mo36013e() {
        C14145d dVar = this.f31492c;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalStateException();
    }

    /* renamed from: f */
    public C14155k mo36014f() {
        return this.f31491b;
    }

    /* renamed from: m0 */
    public Request mo35785m0() {
        return this.f31494e;
    }

    /* renamed from: a */
    public Response mo35780a(Request request) throws IOException {
        return mo36012a(request, this.f31491b, this.f31492c);
    }

    /* renamed from: a */
    public Response mo36012a(Request request, C14155k kVar, C14145d dVar) throws IOException {
        if (this.f31493d < this.f31490a.size()) {
            this.f31499j++;
            C14145d dVar2 = this.f31492c;
            String str = "network interceptor ";
            if (dVar2 == null || dVar2.mo35939b().mo35960a(request.mo35837g())) {
                String str2 = " must call proceed() exactly once";
                if (this.f31492c == null || this.f31499j <= 1) {
                    C14165g gVar = new C14165g(this.f31490a, kVar, dVar, this.f31493d + 1, request, this.f31495f, this.f31496g, this.f31497h, this.f31498i);
                    Interceptor interceptor = (Interceptor) this.f31490a.get(this.f31493d);
                    Response intercept = interceptor.intercept(gVar);
                    if (dVar == null || this.f31493d + 1 >= this.f31490a.size() || gVar.f31499j == 1) {
                        String str3 = "interceptor ";
                        if (intercept == null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(str3);
                            sb.append(interceptor);
                            sb.append(" returned null");
                            throw new NullPointerException(sb.toString());
                        } else if (intercept.mo35855a() != null) {
                            return intercept;
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str3);
                            sb2.append(interceptor);
                            sb2.append(" returned a response with no body");
                            throw new IllegalStateException(sb2.toString());
                        }
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(str);
                        sb3.append(interceptor);
                        sb3.append(str2);
                        throw new IllegalStateException(sb3.toString());
                    }
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str);
                    sb4.append(this.f31490a.get(this.f31493d - 1));
                    sb4.append(str2);
                    throw new IllegalStateException(sb4.toString());
                }
            } else {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(this.f31490a.get(this.f31493d - 1));
                sb5.append(" must retain the same host and port");
                throw new IllegalStateException(sb5.toString());
            }
        } else {
            throw new AssertionError();
        }
    }
}
