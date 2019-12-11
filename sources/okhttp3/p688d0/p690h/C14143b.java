package okhttp3.p688d0.p690h;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.p688d0.p691i.C14165g;

/* renamed from: okhttp3.d0.h.b */
/* compiled from: ConnectInterceptor */
public final class C14143b implements Interceptor {
    public C14143b(OkHttpClient okHttpClient) {
    }

    public Response intercept(Chain chain) throws IOException {
        C14165g gVar = (C14165g) chain;
        Request m0 = gVar.mo35785m0();
        C14155k f = gVar.mo36014f();
        return gVar.mo36012a(m0, f, f.mo35989a(chain, !m0.mo35835e().equals("GET")));
    }
}
