package p161f.p162a;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: f.a.n4 */
public final class C4523n4 implements C4456g4 {
    /* renamed from: a */
    public boolean mo15493a(C4641z4 z4Var) {
        return z4Var instanceof C4449f5;
    }

    /* renamed from: a */
    public JSONObject mo6750b() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "test");
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
