package p161f.p162a;

import com.appboy.p030r.C1535e;
import com.appboy.p033s.C1557c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: f.a.h1 */
public class C4462h1 implements C1535e<JSONObject> {

    /* renamed from: X */
    private static final String f11078X = C1557c.m7461a(C4462h1.class);

    /* renamed from: U */
    private final double f11079U;

    /* renamed from: V */
    private volatile Double f11080V;

    /* renamed from: W */
    private volatile boolean f11081W;

    /* renamed from: c */
    private final C4470i1 f11082c;

    public C4462h1(C4470i1 i1Var, double d) {
        this(i1Var, d, null, false);
    }

    /* renamed from: a */
    public C4470i1 mo15570a() {
        return this.f11082c;
    }

    /* renamed from: c */
    public Double mo15572c() {
        return this.f11080V;
    }

    /* renamed from: d */
    public double mo15573d() {
        return this.f11079U;
    }

    /* renamed from: e */
    public void mo15574e() {
        this.f11081W = true;
        mo15571a(Double.valueOf(C4472i3.m15486b()));
    }

    /* renamed from: f */
    public long mo15575f() {
        if (this.f11080V == null) {
            return -1;
        }
        long doubleValue = (long) (this.f11080V.doubleValue() - this.f11079U);
        if (doubleValue < 0) {
            String str = f11078X;
            StringBuilder sb = new StringBuilder();
            sb.append("End time '");
            sb.append(this.f11080V);
            sb.append("' for session is less than the start time '");
            sb.append(this.f11079U);
            sb.append("' for this session.");
            C1557c.m7473e(str, sb.toString());
        }
        return doubleValue;
    }

    /* renamed from: g */
    public boolean mo15576g() {
        return this.f11081W;
    }

    /* renamed from: h */
    public JSONObject mo6750b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("session_id", this.f11082c);
            jSONObject.put("start_time", this.f11079U);
            jSONObject.put("is_sealed", this.f11081W);
            if (this.f11080V != null) {
                jSONObject.put("end_time", this.f11080V);
            }
        } catch (JSONException e) {
            C1557c.m7470c(f11078X, "Caught exception creating Session Json.", e);
        }
        return jSONObject;
    }

    public C4462h1(C4470i1 i1Var, double d, Double d2, boolean z) {
        this.f11081W = false;
        this.f11082c = i1Var;
        this.f11079U = d;
        this.f11081W = z;
        this.f11080V = d2;
    }

    /* renamed from: a */
    public void mo15571a(Double d) {
        this.f11080V = d;
    }

    public C4462h1(JSONObject jSONObject) {
        this.f11081W = false;
        this.f11082c = C4470i1.m15471a(jSONObject.getString("session_id"));
        this.f11079U = jSONObject.getDouble("start_time");
        this.f11081W = jSONObject.getBoolean("is_sealed");
        String str = "end_time";
        if (jSONObject.has(str)) {
            this.f11080V = Double.valueOf(jSONObject.getDouble(str));
        }
    }
}
