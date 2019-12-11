package p161f.p162a;

import com.appboy.p033s.C1563i;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: f.a.k4 */
public final class C4490k4 implements C4456g4 {

    /* renamed from: c */
    String f11133c;

    public C4490k4(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        if (optJSONObject != null) {
            String str = "product_id";
            if (!optJSONObject.isNull(str)) {
                this.f11133c = optJSONObject.optString(str, null);
            }
        }
    }

    /* renamed from: a */
    public boolean mo15493a(C4641z4 z4Var) {
        if (z4Var instanceof C4428d5) {
            if (C1563i.m7490d(this.f11133c)) {
                return true;
            }
            C4428d5 d5Var = (C4428d5) z4Var;
            if (!C1563i.m7490d(d5Var.mo15512a()) && d5Var.mo15512a().equals(this.f11133c)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public JSONObject mo6750b() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "purchase");
            if (this.f11133c != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("product_id", this.f11133c);
                jSONObject.putOpt("data", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
