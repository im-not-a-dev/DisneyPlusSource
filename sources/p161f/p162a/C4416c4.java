package p161f.p162a;

import com.appboy.p033s.C1563i;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: f.a.c4 */
public final class C4416c4 implements C4456g4 {

    /* renamed from: c */
    private String f11001c;

    public C4416c4(JSONObject jSONObject) {
        this.f11001c = jSONObject.getJSONObject("data").getString("event_name");
    }

    /* renamed from: a */
    public boolean mo15493a(C4641z4 z4Var) {
        if (z4Var instanceof C4632y4) {
            C4632y4 y4Var = (C4632y4) z4Var;
            if (!C1563i.m7490d(y4Var.mo15940a()) && y4Var.mo15940a().equals(this.f11001c)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public JSONObject mo6750b() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "custom_event");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("event_name", this.f11001c);
            jSONObject.put("data", jSONObject2);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
