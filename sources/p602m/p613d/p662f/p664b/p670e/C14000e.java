package p602m.p613d.p662f.p664b.p670e;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: m.d.f.b.e.e */
/* compiled from: DefaultXMSSOid */
public final class C14000e implements C14026t {

    /* renamed from: b */
    private static final Map<String, C14000e> f30957b;

    /* renamed from: a */
    private final String f30958a;

    static {
        HashMap hashMap = new HashMap();
        String str = "SHA-256";
        hashMap.put(m44167a(str, 32, 16, 67, 10), new C14000e(16777217, "XMSS_SHA2-256_W16_H10"));
        hashMap.put(m44167a(str, 32, 16, 67, 16), new C14000e(33554434, "XMSS_SHA2-256_W16_H16"));
        hashMap.put(m44167a(str, 32, 16, 67, 20), new C14000e(50331651, "XMSS_SHA2-256_W16_H20"));
        String str2 = "SHA-512";
        hashMap.put(m44167a(str2, 64, 16, 131, 10), new C14000e(67108868, "XMSS_SHA2-512_W16_H10"));
        hashMap.put(m44167a(str2, 64, 16, 131, 16), new C14000e(83886085, "XMSS_SHA2-512_W16_H16"));
        hashMap.put(m44167a(str2, 64, 16, 131, 20), new C14000e(100663302, "XMSS_SHA2-512_W16_H20"));
        String str3 = "SHAKE128";
        hashMap.put(m44167a(str3, 32, 16, 67, 10), new C14000e(117440519, "XMSS_SHAKE128_W16_H10"));
        hashMap.put(m44167a(str3, 32, 16, 67, 16), new C14000e(134217736, "XMSS_SHAKE128_W16_H16"));
        hashMap.put(m44167a(str3, 32, 16, 67, 20), new C14000e(150994953, "XMSS_SHAKE128_W16_H20"));
        String str4 = "SHAKE256";
        hashMap.put(m44167a(str4, 64, 16, 131, 10), new C14000e(167772170, "XMSS_SHAKE256_W16_H10"));
        hashMap.put(m44167a(str4, 64, 16, 131, 16), new C14000e(184549387, "XMSS_SHAKE256_W16_H16"));
        hashMap.put(m44167a(str4, 64, 16, 131, 20), new C14000e(201326604, "XMSS_SHAKE256_W16_H20"));
        f30957b = Collections.unmodifiableMap(hashMap);
    }

    private C14000e(int i, String str) {
        this.f30958a = str;
    }

    /* renamed from: a */
    private static String m44167a(String str, int i, int i2, int i3, int i4) {
        if (str != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            String str2 = "-";
            sb.append(str2);
            sb.append(i);
            sb.append(str2);
            sb.append(i2);
            sb.append(str2);
            sb.append(i3);
            sb.append(str2);
            sb.append(i4);
            return sb.toString();
        }
        throw new NullPointerException("algorithmName == null");
    }

    /* renamed from: b */
    public static C14000e m44168b(String str, int i, int i2, int i3, int i4) {
        if (str != null) {
            return (C14000e) f30957b.get(m44167a(str, i, i2, i3, i4));
        }
        throw new NullPointerException("algorithmName == null");
    }

    public String toString() {
        return this.f30958a;
    }
}
