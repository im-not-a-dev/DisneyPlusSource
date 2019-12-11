package p161f.p162a;

import com.appboy.p033s.C1557c;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: f.a.o4 */
public abstract class C4538o4 implements C4456g4 {

    /* renamed from: U */
    private static final String f11269U = C1557c.m7461a(C4538o4.class);

    /* renamed from: c */
    C4551p4 f11270c;

    public C4538o4(JSONObject jSONObject) {
        JSONArray jSONArray = jSONObject.getJSONObject("data").getJSONArray("property_filters");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i);
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                arrayList2.add(new C4481j4(jSONArray2.getJSONObject(i2)));
            }
            arrayList.add(new C4570r4(arrayList2));
        }
        this.f11270c = new C4551p4(arrayList);
    }

    /* renamed from: a */
    public boolean mo15493a(C4641z4 z4Var) {
        return this.f11270c.mo15493a(z4Var);
    }

    /* renamed from: a */
    public JSONObject mo6750b() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("property_filters", this.f11270c.mo6750b());
            jSONObject.put("data", jSONObject2);
        } catch (JSONException e) {
            C1557c.m7470c(f11269U, "Caught exception creating Json.", e);
        }
        return jSONObject;
    }
}
