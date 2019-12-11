package p161f.p162a;

import com.appboy.p033s.C1557c;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: f.a.h6 */
public class C4467h6 {

    /* renamed from: a */
    private static final String f11096a = C1557c.m7461a(C4467h6.class);

    /* renamed from: b */
    private static C4450f6 f11097b;

    static {
        try {
            f11097b = new C4450f6();
        } catch (Exception e) {
            C1557c.m7470c(f11096a, "Exception initializing static TLS socket factory.", e);
        }
    }

    /* renamed from: a */
    public static URLConnection m15466a(URL url) {
        URLConnection openConnection = url.openConnection();
        if (url.getProtocol().equals("https")) {
            try {
                ((HttpsURLConnection) openConnection).setSSLSocketFactory(f11097b);
            } catch (Exception e) {
                C1557c.m7470c(f11096a, "Exception setting TLS socket factory on url connection.", e);
            }
        }
        return openConnection;
    }
}
