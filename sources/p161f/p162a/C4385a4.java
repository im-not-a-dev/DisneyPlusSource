package p161f.p162a;

import android.content.Context;
import com.appboy.p033s.C1557c;
import com.appboy.p033s.C1563i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: f.a.a4 */
public class C4385a4 extends C4407b4 implements C4631y3 {

    /* renamed from: f0 */
    private static final String f10926f0 = C1557c.m7461a(C4385a4.class);

    /* renamed from: Z */
    private C4595u0 f10927Z;

    /* renamed from: a0 */
    private String f10928a0;

    /* renamed from: b0 */
    private String f10929b0;

    /* renamed from: c0 */
    private String f10930c0;

    /* renamed from: d0 */
    private String f10931d0;

    /* renamed from: e0 */
    private long f10932e0 = -1;

    public C4385a4(JSONObject jSONObject, C4595u0 u0Var) {
        super(jSONObject);
        String str = f10926f0;
        StringBuilder sb = new StringBuilder();
        sb.append("Parsing templated triggered action with JSON: ");
        sb.append(C4569r3.m15868a(jSONObject));
        C1557c.m7458a(str, sb.toString());
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        this.f10928a0 = jSONObject2.getString("trigger_id");
        JSONArray optJSONArray = jSONObject2.optJSONArray("prefetch_image_urls");
        if (optJSONArray != null) {
            this.f10929b0 = optJSONArray.getString(0);
        }
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("prefetch_zip_urls");
        if (optJSONArray2 != null) {
            this.f10930c0 = optJSONArray2.getString(0);
        }
        this.f10927Z = u0Var;
    }

    /* renamed from: a */
    public void mo15409a(String str) {
        this.f10931d0 = str;
    }

    /* renamed from: f */
    public JSONObject mo6750b() {
        try {
            JSONObject f = super.mo6750b();
            f.put("type", "templated_iam");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("trigger_id", this.f10928a0);
            JSONArray jSONArray = new JSONArray();
            if (!C1563i.m7490d(this.f10929b0)) {
                jSONArray.put(this.f10929b0);
                jSONObject.put("prefetch_image_urls", jSONArray);
            }
            JSONArray jSONArray2 = new JSONArray();
            if (!C1563i.m7490d(this.f10930c0)) {
                jSONArray2.put(this.f10930c0);
                jSONObject.put("prefetch_zip_urls", jSONArray2);
            }
            f.put("data", jSONObject);
            return f;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: g */
    public C4561q5 mo15411g() {
        if (!C1563i.m7490d(this.f10929b0)) {
            return new C4561q5(C4625x4.IMAGE, this.f10929b0);
        }
        if (!C1563i.m7490d(this.f10930c0)) {
            return new C4561q5(C4625x4.ZIP, this.f10930c0);
        }
        return null;
    }

    /* renamed from: k */
    public long mo15412k() {
        return this.f10932e0;
    }

    /* renamed from: l */
    public String mo15413l() {
        return this.f10928a0;
    }

    /* renamed from: m */
    public String mo15414m() {
        return this.f10931d0;
    }

    /* renamed from: a */
    public void mo15408a(Context context, C4419d dVar, C4641z4 z4Var, long j) {
        if (this.f10927Z != null) {
            this.f10932e0 = j;
            String str = f10926f0;
            StringBuilder sb = new StringBuilder();
            sb.append("Posting templating request after delay of ");
            sb.append(mo15472c().mo15859g());
            sb.append(" seconds.");
            C1557c.m7458a(str, sb.toString());
            this.f10927Z.mo15762a(this, z4Var);
        }
    }
}
