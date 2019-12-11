package okhttp3.p688d0.p697o;

import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import okhttp3.p688d0.p695m.C14225e;

/* renamed from: okhttp3.d0.o.c */
/* compiled from: CertificateChainCleaner */
public abstract class C14229c {
    /* renamed from: a */
    public static C14229c m45353a(X509TrustManager x509TrustManager) {
        return C14225e.m45335d().mo36132a(x509TrustManager);
    }

    /* renamed from: a */
    public abstract List<Certificate> mo36141a(List<Certificate> list, String str) throws SSLPeerUnverifiedException;
}
