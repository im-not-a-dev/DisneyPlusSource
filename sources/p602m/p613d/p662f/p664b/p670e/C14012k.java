package p602m.p613d.p662f.p664b.p670e;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: m.d.f.b.e.k */
/* compiled from: WOTSPlusOid */
final class C14012k implements C14026t {

    /* renamed from: b */
    private static final Map<String, C14012k> f30982b;

    /* renamed from: a */
    private final String f30983a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(m44217a("SHA-256", 32, 16, 67), new C14012k(16777217, "WOTSP_SHA2-256_W16"));
        hashMap.put(m44217a("SHA-512", 64, 16, 131), new C14012k(33554434, "WOTSP_SHA2-512_W16"));
        hashMap.put(m44217a("SHAKE128", 32, 16, 67), new C14012k(50331651, "WOTSP_SHAKE128_W16"));
        hashMap.put(m44217a("SHAKE256", 64, 16, 131), new C14012k(67108868, "WOTSP_SHAKE256_W16"));
        f30982b = Collections.unmodifiableMap(hashMap);
    }

    private C14012k(int i, String str) {
        this.f30983a = str;
    }

    /* renamed from: a */
    private static String m44217a(String str, int i, int i2, int i3) {
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
            return sb.toString();
        }
        throw new NullPointerException("algorithmName == null");
    }

    /* renamed from: b */
    protected static C14012k m44218b(String str, int i, int i2, int i3) {
        if (str != null) {
            return (C14012k) f30982b.get(m44217a(str, i, i2, i3));
        }
        throw new NullPointerException("algorithmName == null");
    }

    public String toString() {
        return this.f30983a;
    }
}
