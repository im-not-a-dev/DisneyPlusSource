package p161f.p162a;

import com.appboy.p033s.C1563i;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: f.a.h4 */
public final class C4465h4 implements C4456g4 {

    /* renamed from: U */
    private Set<String> f11090U = new HashSet();

    /* renamed from: c */
    private String f11091c;

    public C4465h4(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        this.f11091c = jSONObject2.getString("id");
        JSONArray optJSONArray = jSONObject2.optJSONArray("buttons");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                this.f11090U.add(optJSONArray.getString(i));
            }
        }
    }

    /* renamed from: a */
    public boolean mo15493a(C4641z4 z4Var) {
        boolean z = false;
        if (z4Var instanceof C4408b5) {
            C4408b5 b5Var = (C4408b5) z4Var;
            if (!C1563i.m7490d(b5Var.mo15478a()) && b5Var.mo15478a().equals(this.f11091c)) {
                if (this.f11090U.size() <= 0) {
                    return C1563i.m7490d(b5Var.mo15480f());
                }
                if (!C1563i.m7490d(b5Var.mo15480f()) && this.f11090U.contains(b5Var.mo15480f())) {
                    z = true;
                }
                return z;
            }
        }
        return false;
    }

    /* renamed from: a */
    public JSONObject mo6750b() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "iam_click");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", this.f11091c);
            if (this.f11090U.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (String put : this.f11090U) {
                    jSONArray.put(put);
                }
                jSONObject2.put("buttons", jSONArray);
            }
            jSONObject.put("data", jSONObject2);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
