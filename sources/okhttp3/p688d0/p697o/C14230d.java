package okhttp3.p688d0.p697o;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import okhttp3.p688d0.C14126e;

/* renamed from: okhttp3.d0.o.d */
/* compiled from: OkHostnameVerifier */
public final class C14230d implements HostnameVerifier {

    /* renamed from: a */
    public static final C14230d f31727a = new C14230d();

    private C14230d() {
    }

    /* renamed from: b */
    private boolean m45357b(String str, X509Certificate x509Certificate) {
        String lowerCase = str.toLowerCase(Locale.US);
        for (String a : m45356a(x509Certificate, 2)) {
            if (mo36160a(lowerCase, a)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private boolean m45358c(String str, X509Certificate x509Certificate) {
        List a = m45356a(x509Certificate, 7);
        int size = a.size();
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase((String) a.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo36161a(String str, X509Certificate x509Certificate) {
        if (C14126e.m44847d(str)) {
            return m45358c(str, x509Certificate);
        }
        return m45357b(str, x509Certificate);
    }

    public boolean verify(String str, SSLSession sSLSession) {
        try {
            return mo36161a(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static List<String> m45355a(X509Certificate x509Certificate) {
        List a = m45356a(x509Certificate, 7);
        List a2 = m45356a(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(a.size() + a2.size());
        arrayList.addAll(a);
        arrayList.addAll(a2);
        return arrayList;
    }

    /* renamed from: a */
    private static List<String> m45356a(X509Certificate x509Certificate, int i) {
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List list : subjectAlternativeNames) {
                if (list != null) {
                    if (list.size() >= 2) {
                        Integer num = (Integer) list.get(0);
                        if (num != null) {
                            if (num.intValue() == i) {
                                String str = (String) list.get(1);
                                if (str != null) {
                                    arrayList.add(str);
                                }
                            }
                        }
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    /* renamed from: a */
    public boolean mo36160a(String str, String str2) {
        if (!(str == null || str.length() == 0)) {
            String str3 = ".";
            if (!str.startsWith(str3)) {
                String str4 = "..";
                if (!str.endsWith(str4) && str2 != null && str2.length() != 0 && !str2.startsWith(str3) && !str2.endsWith(str4)) {
                    if (!str.endsWith(str3)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append('.');
                        str = sb.toString();
                    }
                    if (!str2.endsWith(str3)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str2);
                        sb2.append('.');
                        str2 = sb2.toString();
                    }
                    String lowerCase = str2.toLowerCase(Locale.US);
                    if (!lowerCase.contains("*")) {
                        return str.equals(lowerCase);
                    }
                    String str5 = "*.";
                    if (!lowerCase.startsWith(str5) || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || str5.equals(lowerCase)) {
                        return false;
                    }
                    String substring = lowerCase.substring(1);
                    if (!str.endsWith(substring)) {
                        return false;
                    }
                    int length = str.length() - substring.length();
                    if (length <= 0 || str.lastIndexOf(46, length - 1) == -1) {
                        return true;
                    }
                    return false;
                }
            }
        }
        return false;
    }
}
