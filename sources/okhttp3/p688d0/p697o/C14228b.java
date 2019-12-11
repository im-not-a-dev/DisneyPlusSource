package okhttp3.p688d0.p697o;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* renamed from: okhttp3.d0.o.b */
/* compiled from: BasicTrustRootIndex */
public final class C14228b implements C14231e {

    /* renamed from: a */
    private final Map<X500Principal, Set<X509Certificate>> f31726a = new LinkedHashMap();

    public C14228b(X509Certificate... x509CertificateArr) {
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Set set = (Set) this.f31726a.get(subjectX500Principal);
            if (set == null) {
                set = new LinkedHashSet(1);
                this.f31726a.put(subjectX500Principal, set);
            }
            set.add(x509Certificate);
        }
    }

    /* renamed from: a */
    public X509Certificate mo36146a(X509Certificate x509Certificate) {
        Set<X509Certificate> set = (Set) this.f31726a.get(x509Certificate.getIssuerX500Principal());
        if (set == null) {
            return null;
        }
        for (X509Certificate x509Certificate2 : set) {
            try {
                x509Certificate.verify(x509Certificate2.getPublicKey());
                return x509Certificate2;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C14228b) || !((C14228b) obj).f31726a.equals(this.f31726a)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return this.f31726a.hashCode();
    }
}
