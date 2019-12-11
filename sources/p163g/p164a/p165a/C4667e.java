package p163g.p164a.p165a;

import java.util.HashMap;
import java.util.Map;

/* renamed from: g.a.a.e */
/* compiled from: AnalyticsTrackAction */
final class C4667e {
    /* renamed from: a */
    protected static void m16247a(String str, Map<String, Object> map) {
        HashMap hashMap;
        if (map != null) {
            hashMap = new HashMap(map);
        } else {
            hashMap = new HashMap();
        }
        if (str == null) {
            str = "";
        }
        hashMap.put("a.action", str);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("pe", "lnk_o");
        StringBuilder sb = new StringBuilder();
        sb.append("AMACTION:");
        sb.append(str);
        hashMap2.put("pev2", sb.toString());
        hashMap2.put("pageName", C4783y0.m16645f());
        C4777w0.m16592a(hashMap, hashMap2, C4783y0.m16607E());
    }
}
