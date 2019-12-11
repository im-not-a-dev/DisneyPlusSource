package okhttp3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: okhttp3.j */
/* compiled from: CipherSuite */
public final class C14239j {

    /* renamed from: b */
    static final Comparator<String> f31756b = C14117b.f31322c;

    /* renamed from: c */
    private static final Map<String, C14239j> f31757c = new LinkedHashMap();

    /* renamed from: d */
    public static final C14239j f31758d = m45395a("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);

    /* renamed from: e */
    public static final C14239j f31759e = m45395a("TLS_RSA_WITH_AES_128_CBC_SHA", 47);

    /* renamed from: f */
    public static final C14239j f31760f = m45395a("TLS_RSA_WITH_AES_256_CBC_SHA", 53);

    /* renamed from: g */
    public static final C14239j f31761g = m45395a("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);

    /* renamed from: h */
    public static final C14239j f31762h = m45395a("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);

    /* renamed from: i */
    public static final C14239j f31763i = m45395a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);

    /* renamed from: j */
    public static final C14239j f31764j = m45395a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);

    /* renamed from: k */
    public static final C14239j f31765k = m45395a("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);

    /* renamed from: l */
    public static final C14239j f31766l = m45395a("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);

    /* renamed from: m */
    public static final C14239j f31767m = m45395a("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);

    /* renamed from: n */
    public static final C14239j f31768n = m45395a("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);

    /* renamed from: o */
    public static final C14239j f31769o = m45395a("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);

    /* renamed from: p */
    public static final C14239j f31770p = m45395a("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);

    /* renamed from: q */
    public static final C14239j f31771q = m45395a("TLS_AES_128_GCM_SHA256", 4865);

    /* renamed from: r */
    public static final C14239j f31772r = m45395a("TLS_AES_256_GCM_SHA384", 4866);

    /* renamed from: s */
    public static final C14239j f31773s = m45395a("TLS_CHACHA20_POLY1305_SHA256", 4867);

    /* renamed from: a */
    final String f31774a;

    static {
        m45395a("SSL_RSA_WITH_NULL_MD5", 1);
        m45395a("SSL_RSA_WITH_NULL_SHA", 2);
        m45395a("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
        m45395a("SSL_RSA_WITH_RC4_128_MD5", 4);
        m45395a("SSL_RSA_WITH_RC4_128_SHA", 5);
        m45395a("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
        m45395a("SSL_RSA_WITH_DES_CBC_SHA", 9);
        m45395a("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
        m45395a("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
        m45395a("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
        m45395a("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
        m45395a("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
        m45395a("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
        m45395a("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
        m45395a("SSL_DH_anon_WITH_RC4_128_MD5", 24);
        m45395a("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
        m45395a("SSL_DH_anon_WITH_DES_CBC_SHA", 26);
        m45395a("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
        m45395a("TLS_KRB5_WITH_DES_CBC_SHA", 30);
        m45395a("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
        m45395a("TLS_KRB5_WITH_RC4_128_SHA", 32);
        m45395a("TLS_KRB5_WITH_DES_CBC_MD5", 34);
        m45395a("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
        m45395a("TLS_KRB5_WITH_RC4_128_MD5", 36);
        m45395a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
        m45395a("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
        m45395a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
        m45395a("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
        m45395a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
        m45395a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
        m45395a("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
        m45395a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
        m45395a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
        m45395a("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
        m45395a("TLS_RSA_WITH_NULL_SHA256", 59);
        m45395a("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
        m45395a("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
        m45395a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
        m45395a("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
        m45395a("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
        m45395a("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
        m45395a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
        m45395a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
        m45395a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
        m45395a("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
        m45395a("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
        m45395a("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
        m45395a("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
        m45395a("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
        m45395a("TLS_PSK_WITH_RC4_128_SHA", 138);
        m45395a("TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
        m45395a("TLS_PSK_WITH_AES_128_CBC_SHA", 140);
        m45395a("TLS_PSK_WITH_AES_256_CBC_SHA", 141);
        m45395a("TLS_RSA_WITH_SEED_CBC_SHA", 150);
        m45395a("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
        m45395a("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
        m45395a("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
        m45395a("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
        m45395a("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
        m45395a("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
        m45395a("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);
        m45395a("TLS_FALLBACK_SCSV", 22016);
        m45395a("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
        m45395a("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
        m45395a("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
        m45395a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
        m45395a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
        m45395a("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
        m45395a("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
        m45395a("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
        m45395a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
        m45395a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
        m45395a("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
        m45395a("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
        m45395a("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
        m45395a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
        m45395a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
        m45395a("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
        m45395a("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
        m45395a("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
        m45395a("TLS_ECDH_anon_WITH_NULL_SHA", 49173);
        m45395a("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
        m45395a("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
        m45395a("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
        m45395a("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
        m45395a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
        m45395a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
        m45395a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
        m45395a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
        m45395a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
        m45395a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
        m45395a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
        m45395a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
        m45395a("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);
        m45395a("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);
        m45395a("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);
        m45395a("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
        m45395a("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);
        m45395a("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);
        m45395a("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);
        m45395a("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);
        m45395a("TLS_AES_128_CCM_SHA256", 4868);
        m45395a("TLS_AES_128_CCM_8_SHA256", 4869);
    }

    private C14239j(String str) {
        if (str != null) {
            this.f31774a = str;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    static /* synthetic */ int m45392a(String str, String str2) {
        int min = Math.min(str.length(), str2.length());
        int i = 4;
        while (true) {
            int i2 = -1;
            if (i < min) {
                char charAt = str.charAt(i);
                char charAt2 = str2.charAt(i);
                if (charAt != charAt2) {
                    if (charAt >= charAt2) {
                        i2 = 1;
                    }
                    return i2;
                }
                i++;
            } else {
                int length = str.length();
                int length2 = str2.length();
                if (length == length2) {
                    return 0;
                }
                if (length >= length2) {
                    i2 = 1;
                }
                return i2;
            }
        }
    }

    /* renamed from: b */
    private static String m45396b(String str) {
        String str2 = "TLS_";
        String str3 = "SSL_";
        if (str.startsWith(str2)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append(str.substring(4));
            return sb.toString();
        }
        if (str.startsWith(str3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(str.substring(4));
            str = sb2.toString();
        }
        return str;
    }

    public String toString() {
        return this.f31774a;
    }

    /* renamed from: a */
    public static synchronized C14239j m45394a(String str) {
        C14239j jVar;
        synchronized (C14239j.class) {
            jVar = (C14239j) f31757c.get(str);
            if (jVar == null) {
                jVar = (C14239j) f31757c.get(m45396b(str));
                if (jVar == null) {
                    jVar = new C14239j(str);
                }
                f31757c.put(str, jVar);
            }
        }
        return jVar;
    }

    /* renamed from: a */
    static List<C14239j> m45393a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String a : strArr) {
            arrayList.add(m45394a(a));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    private static C14239j m45395a(String str, int i) {
        C14239j jVar = new C14239j(str);
        f31757c.put(str, jVar);
        return jVar;
    }

    /* renamed from: a */
    public String mo36189a() {
        return this.f31774a;
    }
}
