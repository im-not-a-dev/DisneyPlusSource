package okhttp3.p688d0.p695m;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.C14259v;
import okhttp3.OkHttpClient;
import okhttp3.p688d0.C14126e;
import okhttp3.p688d0.p697o.C14227a;
import okhttp3.p688d0.p697o.C14228b;
import okhttp3.p688d0.p697o.C14229c;
import okhttp3.p688d0.p697o.C14231e;
import okio.Buffer;

/* renamed from: okhttp3.d0.m.e */
/* compiled from: Platform */
public class C14225e {

    /* renamed from: a */
    private static final C14225e f31723a = m45334c();

    /* renamed from: b */
    private static final Logger f31724b = Logger.getLogger(OkHttpClient.class.getName());

    /* renamed from: b */
    static byte[] m45333b(List<C14259v> list) {
        Buffer buffer = new Buffer();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C14259v vVar = (C14259v) list.get(i);
            if (vVar != C14259v.HTTP_1_0) {
                buffer.writeByte(vVar.toString().length());
                buffer.m45552a(vVar.toString());
            }
        }
        return buffer.mo36287Y();
    }

    /* renamed from: c */
    private static C14225e m45334c() {
        C14225e c = C14217a.m45303c();
        if (c != null) {
            return c;
        }
        if (m45336e()) {
            C14221b c2 = C14221b.m45319c();
            if (c2 != null) {
                return c2;
            }
        }
        C14224d c3 = C14224d.m45329c();
        if (c3 != null) {
            return c3;
        }
        C14225e c4 = C14222c.m45325c();
        if (c4 != null) {
            return c4;
        }
        return new C14225e();
    }

    /* renamed from: d */
    public static C14225e m45335d() {
        return f31723a;
    }

    /* renamed from: e */
    public static boolean m45336e() {
        if ("conscrypt".equals(C14126e.m44816a("okhttp.platform", (String) null))) {
            return true;
        }
        return "Conscrypt".equals(Security.getProviders()[0].getName());
    }

    /* renamed from: a */
    public String mo36152a() {
        return "OkHttp";
    }

    /* renamed from: a */
    public void mo36135a(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        socket.connect(inetSocketAddress, i);
    }

    /* renamed from: a */
    public void mo36150a(SSLSocket sSLSocket) {
    }

    /* renamed from: a */
    public void mo36136a(SSLSocket sSLSocket, String str, List<C14259v> list) {
    }

    /* renamed from: a */
    public void mo36149a(SSLSocketFactory sSLSocketFactory) {
    }

    /* renamed from: b */
    public String mo36137b(SSLSocket sSLSocket) {
        return null;
    }

    /* renamed from: b */
    public boolean mo36140b(String str) {
        return true;
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    /* renamed from: a */
    public void mo36133a(int i, String str, Throwable th) {
        f31724b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    /* renamed from: a */
    public Object mo36131a(String str) {
        if (f31724b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    /* renamed from: a */
    public void mo36134a(String str, Object obj) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
            str = sb.toString();
        }
        mo36133a(5, str, (Throwable) obj);
    }

    /* renamed from: a */
    public static List<String> m45332a(List<C14259v> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C14259v vVar = (C14259v) list.get(i);
            if (vVar != C14259v.HTTP_1_0) {
                arrayList.add(vVar.toString());
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public SSLContext mo36138b() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    /* renamed from: b */
    public C14231e mo36139b(X509TrustManager x509TrustManager) {
        return new C14228b(x509TrustManager.getAcceptedIssuers());
    }

    /* renamed from: a */
    public C14229c mo36132a(X509TrustManager x509TrustManager) {
        return new C14227a(mo36139b(x509TrustManager));
    }
}
