package p161f.p162a;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: f.a.u4 */
public class C4599u4 implements C4583s4 {

    /* renamed from: c */
    private final int f11462c;

    public C4599u4(JSONObject jSONObject) {
        this.f11462c = jSONObject.optInt("re_eligibility", -1);
    }

    /* renamed from: a */
    public boolean mo15828a() {
        return this.f11462c == 0;
    }

    /* renamed from: c */
    public Integer mo15829c() {
        int i = this.f11462c;
        if (i > 0) {
            return Integer.valueOf(i);
        }
        return null;
    }

    /* renamed from: d */
    public boolean mo15830d() {
        return this.f11462c == -1;
    }

    /* renamed from: e */
    public JSONObject mo6750b() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("re_eligibility", this.f11462c);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
