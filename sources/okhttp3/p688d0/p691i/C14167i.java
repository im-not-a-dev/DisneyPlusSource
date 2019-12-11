package okhttp3.p688d0.p691i;

import java.net.Proxy.Type;
import okhttp3.HttpUrl;
import okhttp3.Request;

/* renamed from: okhttp3.d0.i.i */
/* compiled from: RequestLine */
public final class C14167i {
    /* renamed from: a */
    public static String m45043a(Request request, Type type) {
        StringBuilder sb = new StringBuilder();
        sb.append(request.mo35835e());
        sb.append(' ');
        if (m45044b(request, type)) {
            sb.append(request.mo35837g());
        } else {
            sb.append(m45042a(request.mo35837g()));
        }
        sb.append(" HTTP/1.1");
        return sb.toString();
    }

    /* renamed from: b */
    private static boolean m45044b(Request request, Type type) {
        return !request.mo35834d() && type == Type.HTTP;
    }

    /* renamed from: a */
    public static String m45042a(HttpUrl httpUrl) {
        String c = httpUrl.mo35750c();
        String e = httpUrl.mo35752e();
        if (e == null) {
            return c;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c);
        sb.append('?');
        sb.append(e);
        return sb.toString();
    }
}
