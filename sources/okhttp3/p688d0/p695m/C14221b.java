package okhttp3.p688d0.p695m;

import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.C14259v;
import org.conscrypt.Conscrypt;

/* renamed from: okhttp3.d0.m.b */
/* compiled from: ConscryptPlatform */
public class C14221b extends C14225e {
    private C14221b() {
    }

    /* renamed from: c */
    public static C14221b m45319c() {
        try {
            Class.forName("org.conscrypt.Conscrypt");
            if (!Conscrypt.isAvailable()) {
                return null;
            }
            return new C14221b();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: f */
    private Provider m45320f() {
        return Conscrypt.newProviderBuilder().provideTrustManager().build();
    }

    /* renamed from: a */
    public void mo36136a(SSLSocket sSLSocket, String str, List<C14259v> list) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) C14225e.m45332a(list).toArray(new String[0]));
            return;
        }
        super.mo36136a(sSLSocket, str, list);
    }

    /* renamed from: b */
    public String mo36137b(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return super.mo36137b(sSLSocket);
    }

    /* renamed from: b */
    public SSLContext mo36138b() {
        try {
            return SSLContext.getInstance("TLSv1.3", m45320f());
        } catch (NoSuchAlgorithmException e) {
            try {
                return SSLContext.getInstance("TLS", m45320f());
            } catch (NoSuchAlgorithmException unused) {
                throw new IllegalStateException("No TLS provider", e);
            }
        }
    }

    /* renamed from: a */
    public void mo36149a(SSLSocketFactory sSLSocketFactory) {
        if (Conscrypt.isConscrypt(sSLSocketFactory)) {
            Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }
}
