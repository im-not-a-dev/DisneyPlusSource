package com.bamtech.core.networking.p039g;

import com.bamtech.core.logging.LogDispatcher;
import com.bamtech.core.logging.LogDispatcher.DefaultImpls;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.C12880j;
import okhttp3.C14245m;
import okhttp3.C14245m.C14246a;
import okhttp3.OkHttpClient.Builder;

/* renamed from: com.bamtech.core.networking.g.c */
/* compiled from: OkHttpSocketFactory.kt */
public final class C1696c {
    /* renamed from: a */
    public static final X509TrustManager m7804a(LogDispatcher logDispatcher) {
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            C12880j.m40222a((Object) instance, "TrustManagerFactory.getInstance(defaultAlgorithm)");
            try {
                instance.init(null);
                TrustManager[] trustManagers = instance.getTrustManagers();
                C12880j.m40222a((Object) trustManagers, "factory.trustManagers");
                for (TrustManager trustManager : trustManagers) {
                    if (trustManager instanceof X509TrustManager) {
                        return (X509TrustManager) trustManager;
                    }
                }
                throw new AssertionError("The system is not capable of handling X509 certificates");
            } catch (KeyStoreException e) {
                if (logDispatcher != null) {
                    DefaultImpls.ex$default(logDispatcher, e, null, null, false, 14, null);
                }
                throw new AssertionError(e);
            }
        } catch (NoSuchAlgorithmException e2) {
            if (logDispatcher != null) {
                DefaultImpls.ex$default(logDispatcher, e2, null, null, false, 14, null);
            }
            throw new AssertionError(e2);
        }
    }

    /* renamed from: a */
    public static final void m7805a(Builder builder, X509TrustManager x509TrustManager) {
        try {
            builder.mo35816a((SSLSocketFactory) new C1697d(x509TrustManager), x509TrustManager);
            C14245m a = new C14246a(C14245m.f31789g).mo36206a();
            C12880j.m40222a((Object) a, "connectionSpec");
            C14245m mVar = C14245m.f31790h;
            C12880j.m40222a((Object) mVar, "ConnectionSpec.COMPATIBLE_TLS");
            C14245m mVar2 = C14245m.f31791i;
            C12880j.m40222a((Object) mVar2, "ConnectionSpec.CLEARTEXT");
            builder.mo35815a(C13185o.m40520c(a, mVar, mVar2));
        } catch (Exception unused) {
            throw new AssertionError("Unable to configure TLS 1.2-enabled SSLSocketFactory");
        }
    }
}
