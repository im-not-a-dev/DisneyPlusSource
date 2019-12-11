package com.bamtech.core.networking.p039g;

import com.bamtech.core.logging.LogDispatcher;
import com.bamtech.core.logging.LogDispatcher.DefaultImpls;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* renamed from: com.bamtech.core.networking.g.b */
/* compiled from: DisabledSSLX509TrustManager.kt */
public final class C1695b implements X509TrustManager {

    /* renamed from: a */
    private final LogDispatcher f5887a;

    public C1695b(LogDispatcher logDispatcher) {
        this.f5887a = logDispatcher;
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        LogDispatcher logDispatcher = this.f5887a;
        if (logDispatcher != null) {
            DefaultImpls.w$default(logDispatcher, this, "Not checking client certificates ", false, 4, null);
        }
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        LogDispatcher logDispatcher = this.f5887a;
        if (logDispatcher != null) {
            DefaultImpls.w$default(logDispatcher, this, "Not checking server certificates ", false, 4, null);
        }
    }

    public X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }
}
