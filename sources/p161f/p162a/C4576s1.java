package p161f.p162a;

import org.json.JSONObject;

/* renamed from: f.a.s1 */
public class C4576s1 extends C4548p1 {
    private C4576s1(C4585s6 s6Var, JSONObject jSONObject) {
        super(s6Var, jSONObject);
    }

    /* renamed from: e */
    public static C4576s1 m15896e(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cid", str);
        jSONObject.put("a", str2);
        return new C4576s1(C4585s6.PUSH_STORY_PAGE_CLICK, jSONObject);
    }
}
