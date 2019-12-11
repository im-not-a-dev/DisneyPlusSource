package p163g.p164a.p165a;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.danlew.android.joda.DateUtils;

/* renamed from: g.a.a.w0 */
/* compiled from: RequestBuilder */
final class C4777w0 {
    /* renamed from: a */
    protected static void m16592a(Map<String, Object> map, Map<String, Object> map2, long j) {
        HashMap hashMap;
        if (C4684g1.m16315d()) {
            HashMap hashMap2 = new HashMap();
            hashMap2.putAll(C4783y0.m16657q());
            long F = C4783y0.m16608F();
            if (F > 0) {
                hashMap2.put("a.TimeSinceLaunch", String.valueOf(F));
            }
            if (map != null) {
                hashMap2.putAll(map);
            }
            if (C4728p0.m16448H().mo16101t() == C4758r0.MOBILE_PRIVACY_STATUS_UNKNOWN) {
                hashMap2.put("a.privacy.mode", "unknown");
            }
            if (map2 != null) {
                hashMap = new HashMap(map2);
            } else {
                hashMap = new HashMap();
            }
            if (C4783y0.m16634b() != null) {
                hashMap.put("aid", C4783y0.m16634b());
            }
            if (C4783y0.m16610H() != null) {
                hashMap.put("vid", C4783y0.m16610H());
            }
            hashMap.put("ce", C4728p0.m16448H().mo16092k());
            if (C4728p0.m16448H().mo16100s()) {
                hashMap.put("ts", Long.toString(j));
            }
            hashMap.put("t", C4783y0.m16609G());
            hashMap.put("cp", C4727p.m16429a() ? "background" : "foreground");
            Iterator it = hashMap2.entrySet().iterator();
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                String str = (String) entry.getKey();
                if (str == null) {
                    it.remove();
                } else if (str.startsWith("&&")) {
                    hashMap.put(str.substring(2), entry.getValue());
                    it.remove();
                }
            }
            if (C4728p0.m16448H().mo16106y()) {
                hashMap.putAll(C4673f1.m16289k().mo16012d());
            }
            C4721o0.m16413a(new HashMap(hashMap), new HashMap(hashMap2), new HashMap(C4727p.m16441e()));
            C4721o0.m16412a(new HashMap(hashMap), new HashMap(hashMap2));
            hashMap.put("c", C4783y0.m16633b((Map<String, Object>) hashMap2));
            if (C4728p0.m16448H().mo16097p() && C4728p0.m16448H().mo16085d()) {
                C4713n nVar = new C4713n();
                C4713n nVar2 = new C4713n();
                nVar2.f11719a = Integer.valueOf(1);
                nVar.mo16051a("coop_unsafe", nVar2);
                hashMap.put("d", nVar);
            }
            StringBuilder sb = new StringBuilder(DateUtils.FORMAT_NO_MIDNIGHT);
            sb.append("ndh=1");
            if (C4728p0.m16448H().mo16106y()) {
                sb.append(C4673f1.m16289k().mo16011c());
            }
            C4783y0.m16631a((Map<String, Object>) hashMap, sb);
            C4783y0.m16630a("Analytics - Request Queued (%s)", sb);
            C4689j.m16331o().mo16027a(sb.toString(), j);
        }
    }
}
