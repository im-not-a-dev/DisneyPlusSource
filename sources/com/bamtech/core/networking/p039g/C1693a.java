package com.bamtech.core.networking.p039g;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.TypeCastException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\u0010\u0004J)\u0010\b\u001a\u00020\t2\u0010\u0010\n\u001a\f\u0012\u0006\b\u0001\u0012\u00020\f\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0002\u0010\u000fJ)\u0010\u0010\u001a\u00020\t2\u0010\u0010\n\u001a\f\u0012\u0006\b\u0001\u0012\u00020\f\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0002\u0010\u0012J2\u0010\u0013\u001a\u00020\t2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00160\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u001a"}, mo31007d2 = {"Lcom/bamtech/core/networking/security/CompositeX509TrustManager;", "Ljavax/net/ssl/X509TrustManager;", "trustManagers", "", "(Ljava/util/List;)V", "getTrustManagers", "()Ljava/util/List;", "setTrustManagers", "checkClientTrusted", "", "chain", "", "Ljava/security/cert/X509Certificate;", "authType", "", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V", "checkServerTrusted", "getAcceptedIssuers", "()[Ljava/security/cert/X509Certificate;", "initializeSSLContext", "keyManagers", "Ljavax/net/ssl/KeyManager;", "Ljavax/net/ssl/TrustManager;", "secureRandom", "Ljava/security/SecureRandom;", "Companion", "networking-security"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtech.core.networking.g.a */
/* compiled from: CompositeX509TrustManager.kt */
public final class C1693a implements X509TrustManager {

    /* renamed from: b */
    public static final C1694a f5885b = new C1694a(null);

    /* renamed from: a */
    private List<? extends X509TrustManager> f5886a;

    /* renamed from: com.bamtech.core.networking.g.a$a */
    /* compiled from: CompositeX509TrustManager.kt */
    public static final class C1694a {
        private C1694a() {
        }

        /* renamed from: a */
        public final X509TrustManager mo7511a(String str, KeyStore keyStore) {
            try {
                TrustManagerFactory instance = TrustManagerFactory.getInstance(str);
                Intrinsics.checkReturnedValueIsNotNull((Object) instance, "TrustManagerFactory.getInstance(algorithm)");
                instance.init(keyStore);
                TrustManager[] trustManagers = instance.getTrustManagers();
                Intrinsics.checkReturnedValueIsNotNull((Object) trustManagers, "factory.getTrustManagers()");
                ArrayList arrayList = new ArrayList();
                for (TrustManager trustManager : trustManagers) {
                    if (trustManager instanceof X509TrustManager) {
                        arrayList.add(trustManager);
                    }
                }
                return (X509TrustManager) C13199w.m40589f((List) arrayList);
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
                throw new IllegalStateException("Couldn't find TrustManager");
            } catch (KeyStoreException e2) {
                e2.printStackTrace();
                throw new IllegalStateException("Couldn't find TrustManager");
            }
        }

        /* renamed from: b */
        public final X509TrustManager mo7512b(KeyStore keyStore) {
            String defaultAlgorithm = TrustManagerFactory.getDefaultAlgorithm();
            Intrinsics.checkReturnedValueIsNotNull((Object) defaultAlgorithm, "TrustManagerFactory.getDefaultAlgorithm()");
            return mo7511a(defaultAlgorithm, keyStore);
        }

        public /* synthetic */ C1694a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final X509TrustManager mo7510a() {
            return mo7512b(null);
        }

        /* renamed from: a */
        public final C1693a mo7509a(KeyStore keyStore) {
            List c = C13185o.m40520c(mo7510a(), mo7512b(keyStore));
            C13199w.m40597j(c);
            return new C1693a(c);
        }
    }

    public C1693a(List<? extends X509TrustManager> list) {
        this.f5886a = list;
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        for (X509TrustManager checkClientTrusted : this.f5886a) {
            try {
                checkClientTrusted.checkClientTrusted(x509CertificateArr, str);
                return;
            } catch (CertificateException unused) {
            }
        }
        throw new CertificateException("Certificate chain not trusted");
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        for (X509TrustManager checkServerTrusted : this.f5886a) {
            try {
                checkServerTrusted.checkServerTrusted(x509CertificateArr, str);
                return;
            } catch (CertificateException unused) {
            }
        }
        throw new CertificateException("Certificate chain not trusted");
    }

    public X509Certificate[] getAcceptedIssuers() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f5886a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            X509Certificate[] acceptedIssuers = ((X509TrustManager) it.next()).getAcceptedIssuers();
            Intrinsics.checkReturnedValueIsNotNull((Object) acceptedIssuers, "trustManager.acceptedIssuers");
            for (X509Certificate add : acceptedIssuers) {
                arrayList.add(add);
            }
        }
        Object[] array = arrayList.toArray(new X509Certificate[0]);
        if (array != null) {
            return (X509Certificate[]) array;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
