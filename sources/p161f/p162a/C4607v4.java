package p161f.p162a;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: f.a.v4 */
public class C4607v4 implements C4591t4 {

    /* renamed from: U */
    private final long f11476U;

    /* renamed from: V */
    private final int f11477V;

    /* renamed from: W */
    private final int f11478W;

    /* renamed from: X */
    private final int f11479X;

    /* renamed from: Y */
    private final C4583s4 f11480Y;

    /* renamed from: Z */
    private final int f11481Z;

    /* renamed from: c */
    private final long f11482c;

    public C4607v4(JSONObject jSONObject) {
        this.f11482c = jSONObject.optLong("start_time", -1);
        this.f11476U = jSONObject.optLong("end_time", -1);
        this.f11477V = jSONObject.optInt("priority", 0);
        this.f11481Z = jSONObject.optInt("min_seconds_since_last_trigger", -1);
        this.f11478W = jSONObject.optInt("delay", 0);
        this.f11479X = jSONObject.optInt("timeout", -1);
        this.f11480Y = new C4599u4(jSONObject);
    }

    /* renamed from: a */
    public long mo15854a() {
        return this.f11482c;
    }

    /* renamed from: c */
    public int mo15855c() {
        return this.f11477V;
    }

    /* renamed from: d */
    public long mo15856d() {
        return this.f11476U;
    }

    /* renamed from: e */
    public int mo15857e() {
        return this.f11479X;
    }

    /* renamed from: f */
    public C4583s4 mo15858f() {
        return this.f11480Y;
    }

    /* renamed from: g */
    public int mo15859g() {
        return this.f11478W;
    }

    /* renamed from: h */
    public int mo15860h() {
        return this.f11481Z;
    }

    /* renamed from: i */
    public JSONObject mo6750b() {
        try {
            JSONObject jSONObject = (JSONObject) this.f11480Y.mo6750b();
            jSONObject.put("start_time", this.f11482c);
            jSONObject.put("end_time", this.f11476U);
            jSONObject.put("priority", this.f11477V);
            jSONObject.put("min_seconds_since_last_trigger", this.f11481Z);
            jSONObject.put("timeout", this.f11479X);
            jSONObject.put("delay", this.f11478W);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
