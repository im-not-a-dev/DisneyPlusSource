package p161f.p162a;

import android.net.Uri;
import com.appboy.p033s.C1557c;
import com.appboy.p033s.C1563i;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: f.a.o2 */
public class C4536o2 extends C4638z1 {

    /* renamed from: j0 */
    private static final String f11265j0 = C1557c.m7461a(C4536o2.class);

    /* renamed from: g0 */
    private final long f11266g0;

    /* renamed from: h0 */
    private final List<String> f11267h0;

    /* renamed from: i0 */
    private final String f11268i0;

    public C4536o2(String str, List<String> list, long j, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("data");
        super(Uri.parse(sb.toString()), null);
        this.f11266g0 = j;
        this.f11267h0 = list;
        this.f11268i0 = str2;
    }

    /* renamed from: a */
    public void mo15458a(C4419d dVar, C4596u1 u1Var) {
    }

    /* renamed from: b */
    public C4601u6 mo15460b() {
        return C4601u6.POST;
    }

    /* renamed from: g */
    public boolean mo15461g() {
        return this.f11267h0.isEmpty() && super.mo15461g();
    }

    /* renamed from: i */
    public JSONObject mo15462i() {
        JSONObject i = super.mo15462i();
        if (i == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("time", this.f11266g0);
            if (!C1563i.m7490d(this.f11268i0)) {
                jSONObject.put("user_id", this.f11268i0);
            }
            if (!this.f11267h0.isEmpty()) {
                jSONObject.put("device_logs", new JSONArray(this.f11267h0));
            }
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            i.put("test_user_data", jSONArray);
            return i;
        } catch (JSONException e) {
            C1557c.m7470c(f11265j0, "Experienced JSONException while retrieving parameters. Returning null.", e);
            return null;
        }
    }
}
