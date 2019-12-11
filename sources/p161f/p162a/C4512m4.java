package p161f.p162a;

import com.appboy.p033s.C1563i;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: f.a.m4 */
public final class C4512m4 implements C4456g4 {

    /* renamed from: c */
    private String f11197c;

    public C4512m4(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        if (optJSONObject != null) {
            String str = "campaign_id";
            if (!optJSONObject.isNull(str)) {
                this.f11197c = optJSONObject.optString(str, null);
            }
        }
    }

    /* renamed from: a */
    public boolean mo15493a(C4641z4 z4Var) {
        if (z4Var instanceof C4436e5) {
            if (C1563i.m7490d(this.f11197c)) {
                return true;
            }
            C4436e5 e5Var = (C4436e5) z4Var;
            if (!C1563i.m7490d(e5Var.mo15528a()) && e5Var.mo15528a().equals(this.f11197c)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public JSONObject mo6750b() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "push_click");
            if (this.f11197c != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("campaign_id", this.f11197c);
                jSONObject.putOpt("data", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
