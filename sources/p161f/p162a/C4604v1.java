package p161f.p162a;

import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: f.a.v1 */
public class C4604v1 {

    /* renamed from: a */
    private final long f11467a;

    /* renamed from: b */
    private final long f11468b;

    /* renamed from: c */
    private final boolean f11469c;

    /* renamed from: d */
    private final JSONArray f11470d;

    public C4604v1(JSONObject jSONObject) {
        this.f11467a = jSONObject.optLong("last_card_updated_at", -1);
        this.f11468b = jSONObject.optLong("last_full_sync_at", -1);
        this.f11469c = jSONObject.optBoolean("full_sync", false);
        this.f11470d = jSONObject.optJSONArray("cards");
    }

    /* renamed from: a */
    public long mo15883a() {
        return this.f11468b;
    }

    /* renamed from: b */
    public long mo15884b() {
        return this.f11467a;
    }

    /* renamed from: c */
    public boolean mo15885c() {
        return this.f11469c;
    }

    /* renamed from: d */
    public JSONArray mo15886d() {
        return this.f11470d;
    }

    public C4604v1(String str) {
        this.f11469c = false;
        this.f11467a = -1;
        this.f11468b = -1;
        this.f11470d = new JSONArray().put(new JSONObject(str));
    }
}
