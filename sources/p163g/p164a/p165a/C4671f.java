package p163g.p164a.p165a;

import java.util.HashMap;
import java.util.Map;

/* renamed from: g.a.a.f */
/* compiled from: AnalyticsTrackInternal */
final class C4671f {
    /* renamed from: a */
    protected static void m16253a(String str, Map<String, Object> map, long j) {
        HashMap hashMap;
        if (map != null) {
            hashMap = new HashMap(map);
        } else {
            hashMap = new HashMap();
        }
        String str2 = "None";
        hashMap.put("a.internalaction", str != null ? str : str2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("pe", "lnk_o");
        StringBuilder sb = new StringBuilder();
        sb.append("ADBINTERNAL:");
        if (str == null) {
            str = str2;
        }
        sb.append(str);
        hashMap2.put("pev2", sb.toString());
        hashMap2.put("pageName", C4783y0.m16645f());
        C4777w0.m16592a(hashMap, hashMap2, j);
    }
}
