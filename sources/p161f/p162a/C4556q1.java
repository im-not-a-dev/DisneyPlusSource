package p161f.p162a;

import org.json.JSONObject;

/* renamed from: f.a.q1 */
public class C4556q1 extends C4548p1 {

    /* renamed from: a0 */
    private final String f11342a0;

    private C4556q1(C4585s6 s6Var, JSONObject jSONObject, String str) {
        super(s6Var, jSONObject);
        this.f11342a0 = str;
    }

    /* renamed from: e */
    public static C4556q1 m15827e(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cid", str);
        jSONObject.put("a", str2);
        return new C4556q1(C4585s6.PUSH_NOTIFICATION_ACTION_TRACKING, jSONObject, str3);
    }

    /* renamed from: o */
    public boolean mo15792o() {
        return this.f11342a0.equals("ab_none");
    }
}
