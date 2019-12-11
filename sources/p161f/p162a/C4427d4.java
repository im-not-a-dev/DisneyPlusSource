package p161f.p162a;

import com.appboy.p033s.C1557c;
import com.appboy.p033s.C1563i;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: f.a.d4 */
public final class C4427d4 extends C4538o4 {

    /* renamed from: W */
    private static final String f11011W = C1557c.m7461a(C4427d4.class);

    /* renamed from: V */
    private String f11012V;

    public C4427d4(JSONObject jSONObject) {
        super(jSONObject);
        this.f11012V = jSONObject.getJSONObject("data").getString("event_name");
    }

    /* renamed from: a */
    public boolean mo15493a(C4641z4 z4Var) {
        if (z4Var instanceof C4632y4) {
            C4632y4 y4Var = (C4632y4) z4Var;
            if (!C1563i.m7490d(y4Var.mo15940a()) && y4Var.mo15940a().equals(this.f11012V)) {
                return super.mo15493a(z4Var);
            }
        }
        return false;
    }

    /* renamed from: a */
    public JSONObject mo6750b() {
        String str = "data";
        JSONObject a = super.mo6750b();
        try {
            a.put("type", "custom_event_property");
            JSONObject jSONObject = a.getJSONObject(str);
            jSONObject.put("event_name", this.f11012V);
            a.put(str, jSONObject);
        } catch (JSONException e) {
            C1557c.m7470c(f11011W, "Caught exception creating CustomEventWithPropertiesTriggerCondition Json.", e);
        }
        return a;
    }
}
