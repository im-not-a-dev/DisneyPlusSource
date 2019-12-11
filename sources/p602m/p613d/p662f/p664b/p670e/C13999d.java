package p602m.p613d.p662f.p664b.p670e;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: m.d.f.b.e.d */
/* compiled from: DefaultXMSSMTOid */
public final class C13999d implements C14026t {

    /* renamed from: b */
    private static final Map<String, C13999d> f30955b;

    /* renamed from: a */
    private final String f30956a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(m44165a("SHA-256", 32, 16, 67, 20, 2), new C13999d(16777217, "XMSSMT_SHA2-256_W16_H20_D2"));
        hashMap.put(m44165a("SHA-256", 32, 16, 67, 20, 4), new C13999d(16777217, "XMSSMT_SHA2-256_W16_H20_D4"));
        hashMap.put(m44165a("SHA-256", 32, 16, 67, 40, 2), new C13999d(16777217, "XMSSMT_SHA2-256_W16_H40_D2"));
        hashMap.put(m44165a("SHA-256", 32, 16, 67, 40, 2), new C13999d(16777217, "XMSSMT_SHA2-256_W16_H40_D4"));
        hashMap.put(m44165a("SHA-256", 32, 16, 67, 40, 4), new C13999d(16777217, "XMSSMT_SHA2-256_W16_H40_D8"));
        hashMap.put(m44165a("SHA-256", 32, 16, 67, 60, 8), new C13999d(16777217, "XMSSMT_SHA2-256_W16_H60_D3"));
        hashMap.put(m44165a("SHA-256", 32, 16, 67, 60, 6), new C13999d(16777217, "XMSSMT_SHA2-256_W16_H60_D6"));
        hashMap.put(m44165a("SHA-256", 32, 16, 67, 60, 12), new C13999d(16777217, "XMSSMT_SHA2-256_W16_H60_D12"));
        hashMap.put(m44165a("SHA2-512", 64, 16, 131, 20, 2), new C13999d(16777217, "XMSSMT_SHA2-512_W16_H20_D2"));
        hashMap.put(m44165a("SHA2-512", 64, 16, 131, 20, 4), new C13999d(16777217, "XMSSMT_SHA2-512_W16_H20_D4"));
        hashMap.put(m44165a("SHA2-512", 64, 16, 131, 40, 2), new C13999d(16777217, "XMSSMT_SHA2-512_W16_H40_D2"));
        hashMap.put(m44165a("SHA2-512", 64, 16, 131, 40, 4), new C13999d(16777217, "XMSSMT_SHA2-512_W16_H40_D4"));
        hashMap.put(m44165a("SHA2-512", 64, 16, 131, 40, 8), new C13999d(16777217, "XMSSMT_SHA2-512_W16_H40_D8"));
        hashMap.put(m44165a("SHA2-512", 64, 16, 131, 60, 3), new C13999d(16777217, "XMSSMT_SHA2-512_W16_H60_D3"));
        hashMap.put(m44165a("SHA2-512", 64, 16, 131, 60, 6), new C13999d(16777217, "XMSSMT_SHA2-512_W16_H60_D6"));
        hashMap.put(m44165a("SHA2-512", 64, 16, 131, 60, 12), new C13999d(16777217, "XMSSMT_SHA2-512_W16_H60_D12"));
        hashMap.put(m44165a("SHAKE128", 32, 16, 67, 20, 2), new C13999d(16777217, "XMSSMT_SHAKE128_W16_H20_D2"));
        hashMap.put(m44165a("SHAKE128", 32, 16, 67, 20, 4), new C13999d(16777217, "XMSSMT_SHAKE128_W16_H20_D4"));
        hashMap.put(m44165a("SHAKE128", 32, 16, 67, 40, 2), new C13999d(16777217, "XMSSMT_SHAKE128_W16_H40_D2"));
        hashMap.put(m44165a("SHAKE128", 32, 16, 67, 40, 4), new C13999d(16777217, "XMSSMT_SHAKE128_W16_H40_D4"));
        hashMap.put(m44165a("SHAKE128", 32, 16, 67, 40, 8), new C13999d(16777217, "XMSSMT_SHAKE128_W16_H40_D8"));
        hashMap.put(m44165a("SHAKE128", 32, 16, 67, 60, 3), new C13999d(16777217, "XMSSMT_SHAKE128_W16_H60_D3"));
        hashMap.put(m44165a("SHAKE128", 32, 16, 67, 60, 6), new C13999d(16777217, "XMSSMT_SHAKE128_W16_H60_D6"));
        hashMap.put(m44165a("SHAKE128", 32, 16, 67, 60, 12), new C13999d(16777217, "XMSSMT_SHAKE128_W16_H60_D12"));
        hashMap.put(m44165a("SHAKE256", 64, 16, 131, 20, 2), new C13999d(16777217, "XMSSMT_SHAKE256_W16_H20_D2"));
        hashMap.put(m44165a("SHAKE256", 64, 16, 131, 20, 4), new C13999d(16777217, "XMSSMT_SHAKE256_W16_H20_D4"));
        hashMap.put(m44165a("SHAKE256", 64, 16, 131, 40, 2), new C13999d(16777217, "XMSSMT_SHAKE256_W16_H40_D2"));
        hashMap.put(m44165a("SHAKE256", 64, 16, 131, 40, 4), new C13999d(16777217, "XMSSMT_SHAKE256_W16_H40_D4"));
        hashMap.put(m44165a("SHAKE256", 64, 16, 131, 40, 8), new C13999d(16777217, "XMSSMT_SHAKE256_W16_H40_D8"));
        hashMap.put(m44165a("SHAKE256", 64, 16, 131, 60, 3), new C13999d(16777217, "XMSSMT_SHAKE256_W16_H60_D3"));
        hashMap.put(m44165a("SHAKE256", 64, 16, 131, 60, 6), new C13999d(16777217, "XMSSMT_SHAKE256_W16_H60_D6"));
        hashMap.put(m44165a("SHAKE256", 64, 16, 131, 60, 12), new C13999d(16777217, "XMSSMT_SHAKE256_W16_H60_D12"));
        f30955b = Collections.unmodifiableMap(hashMap);
    }

    private C13999d(int i, String str) {
        this.f30956a = str;
    }

    /* renamed from: a */
    private static String m44165a(String str, int i, int i2, int i3, int i4, int i5) {
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
            sb.append(str2);
            sb.append(i5);
            return sb.toString();
        }
        throw new NullPointerException("algorithmName == null");
    }

    /* renamed from: b */
    public static C13999d m44166b(String str, int i, int i2, int i3, int i4, int i5) {
        if (str != null) {
            return (C13999d) f30955b.get(m44165a(str, i, i2, i3, i4, i5));
        }
        throw new NullPointerException("algorithmName == null");
    }

    public String toString() {
        return this.f30956a;
    }
}
