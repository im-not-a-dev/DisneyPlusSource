package p163g.p426g.p434e;

import java.util.HashMap;
import java.util.Map;
import p163g.p426g.p435f.C10858e.C10862d;
import p163g.p426g.p436g.C10885m;

/* renamed from: g.g.e.a */
/* compiled from: Protocol */
public class C10852a {

    /* renamed from: a */
    public static String f25646a = "2.5";

    /* renamed from: b */
    public static String f25647b = "/0/wsg";

    /* renamed from: c */
    public static String f25648c = "0";

    /* renamed from: d */
    public static String f25649d = "ok";

    /* renamed from: e */
    public static String f25650e = "sdk.android.1";

    /* renamed from: f */
    public static String f25651f = "pending";

    /* renamed from: a */
    public Map<String, String> mo27925a(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        hashMap.put("sch", f25650e);
        if (map.containsKey(C10885m.f25796e)) {
            hashMap.put("abm", map.get(C10885m.f25796e));
        }
        if (map.containsKey(C10885m.f25797f)) {
            hashMap.put("osv", map.get(C10885m.f25797f));
        }
        if (map.containsKey(C10885m.f25798g)) {
            hashMap.put("dvb", map.get(C10885m.f25798g));
        }
        if (map.containsKey(C10885m.f25799h)) {
            hashMap.put("dvma", map.get(C10885m.f25799h));
        }
        if (map.containsKey(C10885m.f25800i)) {
            hashMap.put("dvm", map.get(C10885m.f25800i));
        }
        if (map.containsKey(C10885m.f25801j)) {
            hashMap.put("dvt", map.get(C10885m.f25801j));
        }
        if (map.containsKey(C10885m.f25802k)) {
            hashMap.put("dvv", map.get(C10885m.f25802k));
        }
        if (map.containsKey(C10885m.f25803l)) {
            hashMap.put("fw", map.get(C10885m.f25803l));
        }
        if (map.containsKey(C10885m.f25804m)) {
            hashMap.put("fwv", map.get(C10885m.f25804m));
        }
        return hashMap;
    }

    /* renamed from: a */
    public static int m34198a(C10862d dVar) {
        if (dVar == C10862d.STOPPED) {
            return 1;
        }
        if (dVar == C10862d.PLAYING) {
            return 3;
        }
        if (dVar == C10862d.BUFFERING) {
            return 6;
        }
        if (dVar == C10862d.PAUSED) {
            return 12;
        }
        return dVar == C10862d.NOT_MONITORED ? 98 : 100;
    }
}
