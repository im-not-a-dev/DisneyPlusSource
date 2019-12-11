package p161f.p162a;

import com.appboy.p033s.C1557c;
import com.appboy.p033s.C1563i;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: f.a.l4 */
public final class C4502l4 extends C4538o4 {

    /* renamed from: W */
    private static final String f11166W = C1557c.m7461a(C4502l4.class);

    /* renamed from: V */
    private String f11167V;

    public C4502l4(JSONObject jSONObject) {
        super(jSONObject);
        this.f11167V = jSONObject.getJSONObject("data").getString("product_id");
    }

    /* renamed from: a */
    public boolean mo15493a(C4641z4 z4Var) {
        if (!(z4Var instanceof C4428d5) || C1563i.m7490d(this.f11167V)) {
            return false;
        }
        C4428d5 d5Var = (C4428d5) z4Var;
        if (!C1563i.m7490d(d5Var.mo15512a()) && d5Var.mo15512a().equals(this.f11167V)) {
            return super.mo15493a(z4Var);
        }
        return false;
    }

    /* renamed from: a */
    public JSONObject mo6750b() {
        String str = "data";
        JSONObject a = super.mo6750b();
        try {
            a.put("type", "purchase_property");
            JSONObject jSONObject = a.getJSONObject(str);
            jSONObject.put("product_id", this.f11167V);
            a.put(str, jSONObject);
        } catch (JSONException e) {
            C1557c.m7470c(f11166W, "Caught exception creating Json.", e);
        }
        return a;
    }
}
