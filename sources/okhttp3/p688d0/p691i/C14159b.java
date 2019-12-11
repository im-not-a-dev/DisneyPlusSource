package okhttp3.p688d0.p691i;

import java.io.IOException;
import java.net.ProtocolException;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Response.C14114a;
import okhttp3.p688d0.C14126e;
import okhttp3.p688d0.p690h.C14145d;
import okio.C14280f;
import okio.C14287m;

/* renamed from: okhttp3.d0.i.b */
/* compiled from: CallServerInterceptor */
public final class C14159b implements Interceptor {

    /* renamed from: a */
    private final boolean f31486a;

    public C14159b(boolean z) {
        this.f31486a = z;
    }

    public Response intercept(Chain chain) throws IOException {
        boolean z;
        Response response;
        C14165g gVar = (C14165g) chain;
        C14145d e = gVar.mo36013e();
        Request m0 = gVar.mo35785m0();
        long currentTimeMillis = System.currentTimeMillis();
        e.mo35938a(m0);
        C14114a aVar = null;
        if (!C14164f.m45026b(m0.mo35835e()) || m0.mo35830a() == null) {
            e.mo35946h();
            z = false;
        } else {
            if ("100-continue".equalsIgnoreCase(m0.mo35829a("Expect"))) {
                e.mo35943e();
                e.mo35947i();
                aVar = e.mo35933a(true);
                z = true;
            } else {
                z = false;
            }
            if (aVar != null) {
                e.mo35946h();
                if (!e.mo35939b().mo35965d()) {
                    e.mo35945g();
                }
            } else if (m0.mo35830a().mo36275c()) {
                e.mo35943e();
                m0.mo35830a().mo35742a(C14287m.m45717a(e.mo35935a(m0, true)));
            } else {
                C14280f a = C14287m.m45717a(e.mo35935a(m0, false));
                m0.mo35830a().mo35742a(a);
                a.close();
            }
        }
        if (m0.mo35830a() == null || !m0.mo35830a().mo36275c()) {
            e.mo35942d();
        }
        if (!z) {
            e.mo35947i();
        }
        if (aVar == null) {
            aVar = e.mo35933a(false);
        }
        aVar.mo35877a(m0);
        aVar.mo35879a(e.mo35939b().mo35964c());
        aVar.mo35885b(currentTimeMillis);
        aVar.mo35874a(System.currentTimeMillis());
        Response a2 = aVar.mo35883a();
        int c = a2.mo35858c();
        if (c == 100) {
            C14114a a3 = e.mo35933a(false);
            a3.mo35877a(m0);
            a3.mo35879a(e.mo35939b().mo35964c());
            a3.mo35885b(currentTimeMillis);
            a3.mo35874a(System.currentTimeMillis());
            a2 = a3.mo35883a();
            c = a2.mo35858c();
        }
        e.mo35940b(a2);
        if (!this.f31486a || c != 101) {
            C14114a i = a2.mo35866i();
            i.mo35882a(e.mo35934a(a2));
            response = i.mo35883a();
        } else {
            C14114a i2 = a2.mo35866i();
            i2.mo35882a(C14126e.f31333d);
            response = i2.mo35883a();
        }
        String str = "Connection";
        String str2 = "close";
        if (str2.equalsIgnoreCase(response.mo35870m().mo35829a(str)) || str2.equalsIgnoreCase(response.mo35861e(str))) {
            e.mo35945g();
        }
        if ((c != 204 && c != 205) || response.mo35855a().mo35701b() <= 0) {
            return response;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("HTTP ");
        sb.append(c);
        sb.append(" had non-zero Content-Length: ");
        sb.append(response.mo35855a().mo35701b());
        throw new ProtocolException(sb.toString());
    }
}
