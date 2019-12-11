package p161f.p162a;

import android.net.Uri;
import com.appboy.p027p.C1520e;
import com.appboy.p027p.C1521f;
import com.appboy.p030r.p032p.C1552b;
import com.appboy.p033s.C1557c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* renamed from: f.a.e2 */
public final class C4433e2 extends C4638z1 {

    /* renamed from: h0 */
    private static final String f11018h0 = C1557c.m7461a(C4433e2.class);

    /* renamed from: g0 */
    private final C1552b f11019g0;

    public C4433e2(String str, C1552b bVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("data");
        super(Uri.parse(sb.toString()), null);
        this.f11019g0 = bVar;
    }

    /* renamed from: a */
    public void mo15458a(C4419d dVar, C4596u1 u1Var) {
        dVar.mo15485a(new C1521f(this.f11019g0), C1521f.class);
    }

    /* renamed from: b */
    public C4601u6 mo15460b() {
        return C4601u6.POST;
    }

    /* renamed from: g */
    public boolean mo15461g() {
        return false;
    }

    /* renamed from: i */
    public JSONObject mo15462i() {
        JSONObject i = super.mo15462i();
        if (i == null) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(this.f11019g0.mo6750b());
            i.put("feedback", jSONArray);
            return i;
        } catch (JSONException e) {
            C1557c.m7474e(f11018h0, "Experienced JSONException while retrieving parameters. Returning null.", e);
            return null;
        }
    }

    /* renamed from: a */
    public void mo15527a(C4419d dVar, C4419d dVar2, C4612w1 w1Var) {
        super.mo15527a(dVar, dVar2, w1Var);
        dVar2.mo15485a(new C1520e(this.f11019g0, w1Var), C1520e.class);
    }
}
