package p161f.p162a;

import com.appboy.p030r.C1535e;
import com.appboy.p033s.C1557c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: f.a.m1 */
public class C4507m1 implements C1535e<JSONObject> {

    /* renamed from: U */
    private static final String f11185U = C1557c.m7461a(C4507m1.class);

    /* renamed from: c */
    private final long f11186c;

    public C4507m1(long j) {
        this.f11186c = j;
    }

    /* renamed from: a */
    public JSONObject mo6750b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("config_time", this.f11186c);
            return jSONObject;
        } catch (JSONException e) {
            C1557c.m7466b(f11185U, "Caught exception creating config params json.", (Throwable) e);
            return null;
        }
    }
}
