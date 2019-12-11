package okhttp3.p688d0.p691i;

import com.facebook.stetho.server.http.HttpHeaders;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import okhttp3.C14247n;
import okhttp3.C14256t;
import okhttp3.C14256t.C14257a;
import okhttp3.Cookie;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.p688d0.C14126e;
import okio.ByteString;

/* renamed from: okhttp3.d0.i.e */
/* compiled from: HttpHeaders */
public final class C14163e {
    static {
        ByteString.m45615e("\"\\");
        ByteString.m45615e("\t ,=");
    }

    /* renamed from: a */
    public static long m45013a(Response response) {
        return m45014a(response.mo35862e());
    }

    /* renamed from: b */
    public static boolean m45020b(C14256t tVar) {
        return m45021c(tVar).contains("*");
    }

    /* renamed from: c */
    public static boolean m45022c(Response response) {
        return m45020b(response.mo35862e());
    }

    /* renamed from: d */
    private static Set<String> m45023d(Response response) {
        return m45021c(response.mo35862e());
    }

    /* renamed from: e */
    public static C14256t m45024e(Response response) {
        return m45015a(response.mo35865h().mo35870m().mo35833c(), response.mo35862e());
    }

    /* renamed from: a */
    public static long m45014a(C14256t tVar) {
        return m45012a(tVar.mo36244a(HttpHeaders.CONTENT_LENGTH));
    }

    /* renamed from: b */
    public static boolean m45019b(Response response) {
        if (response.mo35870m().mo35835e().equals("HEAD")) {
            return false;
        }
        int c = response.mo35858c();
        if (((c >= 100 && c < 200) || c == 204 || c == 304) && m45013a(response) == -1) {
            if ("chunked".equalsIgnoreCase(response.mo35861e("Transfer-Encoding"))) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static Set<String> m45021c(C14256t tVar) {
        Set emptySet = Collections.emptySet();
        int b = tVar.mo36246b();
        Set set = emptySet;
        for (int i = 0; i < b; i++) {
            if ("Vary".equalsIgnoreCase(tVar.mo36243a(i))) {
                String b2 = tVar.mo36247b(i);
                if (set.isEmpty()) {
                    set = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                }
                for (String trim : b2.split(",")) {
                    set.add(trim.trim());
                }
            }
        }
        return set;
    }

    /* renamed from: a */
    private static long m45012a(String str) {
        long j = -1;
        if (str == null) {
            return -1;
        }
        try {
            j = Long.parseLong(str);
        } catch (NumberFormatException unused) {
        }
        return j;
    }

    /* renamed from: a */
    public static boolean m45017a(Response response, C14256t tVar, Request request) {
        for (String str : m45023d(response)) {
            if (!Objects.equals(tVar.mo36248b(str), request.mo35831b(str))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static C14256t m45015a(C14256t tVar, C14256t tVar2) {
        Set c = m45021c(tVar2);
        if (c.isEmpty()) {
            return C14126e.f31332c;
        }
        C14257a aVar = new C14257a();
        int b = tVar.mo36246b();
        for (int i = 0; i < b; i++) {
            String a = tVar.mo36243a(i);
            if (c.contains(a)) {
                aVar.mo36254a(a, tVar.mo36247b(i));
            }
        }
        return aVar.mo36255a();
    }

    /* renamed from: b */
    public static int m45018b(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != 9) {
                break;
            }
            i++;
        }
        return i;
    }

    /* renamed from: a */
    public static void m45016a(C14247n nVar, HttpUrl httpUrl, C14256t tVar) {
        if (nVar != C14247n.f31800a) {
            List a = Cookie.m44608a(httpUrl, tVar);
            if (!a.isEmpty()) {
                nVar.saveFromResponse(httpUrl, a);
            }
        }
    }

    /* renamed from: a */
    public static int m45011a(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    /* renamed from: a */
    public static int m45010a(String str, int i) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            i = (int) parseLong;
            return i;
        } catch (NumberFormatException unused) {
        }
    }
}
