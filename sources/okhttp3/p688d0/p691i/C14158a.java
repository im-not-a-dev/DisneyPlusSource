package okhttp3.p688d0.p691i;

import com.facebook.stetho.server.http.HttpHeaders;
import java.io.IOException;
import java.util.List;
import okhttp3.C14247n;
import okhttp3.C14256t.C14257a;
import okhttp3.C14258u;
import okhttp3.C14262x;
import okhttp3.C14264y;
import okhttp3.Cookie;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import okhttp3.Request;
import okhttp3.Request.C14113a;
import okhttp3.Response;
import okhttp3.Response.C14114a;
import okhttp3.p688d0.C14126e;
import okhttp3.p688d0.C14127f;
import okio.C14284j;
import okio.C14287m;
import okio.C14302x;

/* renamed from: okhttp3.d0.i.a */
/* compiled from: BridgeInterceptor */
public final class C14158a implements Interceptor {

    /* renamed from: a */
    private final C14247n f31485a;

    public C14158a(C14247n nVar) {
        this.f31485a = nVar;
    }

    /* renamed from: a */
    private String m44999a(List<Cookie> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append("; ");
            }
            Cookie cookie = (Cookie) list.get(i);
            sb.append(cookie.mo35733d());
            sb.append('=');
            sb.append(cookie.mo35738h());
        }
        return sb.toString();
    }

    public Response intercept(Chain chain) throws IOException {
        Request m0 = chain.mo35785m0();
        C14113a f = m0.mo35836f();
        C14262x a = m0.mo35830a();
        String str = HttpHeaders.CONTENT_TYPE;
        String str2 = HttpHeaders.CONTENT_LENGTH;
        if (a != null) {
            C14258u b = a.mo35743b();
            if (b != null) {
                f.mo35849b(str, b.toString());
            }
            long a2 = a.mo35741a();
            String str3 = "Transfer-Encoding";
            if (a2 != -1) {
                f.mo35849b(str2, Long.toString(a2));
                f.mo35839a(str3);
            } else {
                f.mo35849b(str3, "chunked");
                f.mo35839a(str2);
            }
        }
        String str4 = "Host";
        boolean z = false;
        if (m0.mo35829a(str4) == null) {
            f.mo35849b(str4, C14126e.m44818a(m0.mo35837g(), false));
        }
        String str5 = "Connection";
        if (m0.mo35829a(str5) == null) {
            f.mo35849b(str5, "Keep-Alive");
        }
        String str6 = "Accept-Encoding";
        String str7 = "gzip";
        if (m0.mo35829a(str6) == null && m0.mo35829a("Range") == null) {
            z = true;
            f.mo35849b(str6, str7);
        }
        List loadForRequest = this.f31485a.loadForRequest(m0.mo35837g());
        if (!loadForRequest.isEmpty()) {
            f.mo35849b("Cookie", m44999a(loadForRequest));
        }
        String str8 = "User-Agent";
        if (m0.mo35829a(str8) == null) {
            f.mo35849b(str8, C14127f.m44848a());
        }
        Response a3 = chain.mo35780a(f.mo35846a());
        C14163e.m45016a(this.f31485a, m0.mo35837g(), a3.mo35862e());
        C14114a i = a3.mo35866i();
        i.mo35877a(m0);
        if (z) {
            String str9 = "Content-Encoding";
            if (str7.equalsIgnoreCase(a3.mo35861e(str9)) && C14163e.m45019b(a3)) {
                C14284j jVar = new C14284j(a3.mo35855a().mo35703d());
                C14257a a4 = a3.mo35862e().mo36245a();
                a4.mo36258c(str9);
                a4.mo36258c(str2);
                i.mo35880a(a4.mo36255a());
                i.mo35882a((C14264y) new C14166h(a3.mo35861e(str), -1, C14287m.m45716a((C14302x) jVar)));
            }
        }
        return i.mo35883a();
    }
}
