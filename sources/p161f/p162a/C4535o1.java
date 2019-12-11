package p161f.p162a;

import com.appboy.p030r.C1535e;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: f.a.o1 */
public class C4535o1 implements C4453g1, C1535e<JSONArray> {

    /* renamed from: U */
    private final JSONArray f11263U = new JSONArray();

    /* renamed from: c */
    private final JSONObject f11264c;

    public C4535o1(JSONObject jSONObject) {
        this.f11264c = jSONObject;
        this.f11263U.put(this.f11264c);
    }

    /* renamed from: a */
    public JSONObject mo15741a() {
        return this.f11264c;
    }

    /* renamed from: c */
    public JSONArray mo6750b() {
        return this.f11263U;
    }

    /* renamed from: d */
    public boolean mo15457d() {
        JSONObject jSONObject = this.f11264c;
        if (jSONObject == null || jSONObject.length() == 0) {
            return true;
        }
        if (this.f11264c.length() != 1 || !this.f11264c.has("user_id")) {
            return false;
        }
        return true;
    }
}
