package okhttp3;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import okhttp3.p688d0.C14126e;

/* renamed from: okhttp3.s */
/* compiled from: Handshake */
public final class C14255s {

    /* renamed from: a */
    private final C14116a0 f31810a;

    /* renamed from: b */
    private final C14239j f31811b;

    /* renamed from: c */
    private final List<Certificate> f31812c;

    /* renamed from: d */
    private final List<Certificate> f31813d;

    private C14255s(C14116a0 a0Var, C14239j jVar, List<Certificate> list, List<Certificate> list2) {
        this.f31810a = a0Var;
        this.f31811b = jVar;
        this.f31812c = list;
        this.f31813d = list2;
    }

    /* renamed from: a */
    public static C14255s m45456a(SSLSession sSLSession) throws IOException {
        Certificate[] certificateArr;
        List list;
        List list2;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        } else if (!"SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            C14239j a = C14239j.m45394a(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            } else if (!"NONE".equals(protocol)) {
                C14116a0 a2 = C14116a0.m44797a(protocol);
                try {
                    certificateArr = sSLSession.getPeerCertificates();
                } catch (SSLPeerUnverifiedException unused) {
                    certificateArr = null;
                }
                if (certificateArr != null) {
                    list = C14126e.m44825a((T[]) certificateArr);
                } else {
                    list = Collections.emptyList();
                }
                Certificate[] localCertificates = sSLSession.getLocalCertificates();
                if (localCertificates != null) {
                    list2 = C14126e.m44825a((T[]) localCertificates);
                } else {
                    list2 = Collections.emptyList();
                }
                return new C14255s(a2, a, list, list2);
            } else {
                throw new IOException("tlsVersion == NONE");
            }
        } else {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
    }

    /* renamed from: b */
    public List<Certificate> mo36237b() {
        return this.f31813d;
    }

    /* renamed from: c */
    public List<Certificate> mo36238c() {
        return this.f31812c;
    }

    /* renamed from: d */
    public C14116a0 mo36239d() {
        return this.f31810a;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof C14255s)) {
            return false;
        }
        C14255s sVar = (C14255s) obj;
        if (this.f31810a.equals(sVar.f31810a) && this.f31811b.equals(sVar.f31811b) && this.f31812c.equals(sVar.f31812c) && this.f31813d.equals(sVar.f31813d)) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return ((((((527 + this.f31810a.hashCode()) * 31) + this.f31811b.hashCode()) * 31) + this.f31812c.hashCode()) * 31) + this.f31813d.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Handshake{tlsVersion=");
        sb.append(this.f31810a);
        sb.append(" cipherSuite=");
        sb.append(this.f31811b);
        sb.append(" peerCertificates=");
        sb.append(m45455a(this.f31812c));
        sb.append(" localCertificates=");
        sb.append(m45455a(this.f31813d));
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public static C14255s m45457a(C14116a0 a0Var, C14239j jVar, List<Certificate> list, List<Certificate> list2) {
        if (a0Var == null) {
            throw new NullPointerException("tlsVersion == null");
        } else if (jVar != null) {
            return new C14255s(a0Var, jVar, C14126e.m44823a(list), C14126e.m44823a(list2));
        } else {
            throw new NullPointerException("cipherSuite == null");
        }
    }

    /* renamed from: a */
    public C14239j mo36236a() {
        return this.f31811b;
    }

    /* renamed from: a */
    private List<String> m45455a(List<Certificate> list) {
        ArrayList arrayList = new ArrayList();
        for (Certificate certificate : list) {
            if (certificate instanceof X509Certificate) {
                arrayList.add(String.valueOf(((X509Certificate) certificate).getSubjectDN()));
            } else {
                arrayList.add(certificate.getType());
            }
        }
        return arrayList;
    }
}
