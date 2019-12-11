package p161f.p162a;

import org.json.JSONObject;

/* renamed from: f.a.r1 */
public class C4567r1 extends C4548p1 {
    private C4567r1(C4585s6 s6Var, JSONObject jSONObject) {
        super(s6Var, jSONObject);
    }

    /* renamed from: j */
    public static C4567r1 m15862j(String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cid", str);
        return new C4567r1(C4585s6.PUSH_NOTIFICATION_TRACKING, jSONObject);
    }
}
