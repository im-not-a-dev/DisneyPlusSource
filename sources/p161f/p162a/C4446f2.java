package p161f.p162a;

import android.net.Uri;
import com.appboy.p033s.C1557c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: f.a.f2 */
public final class C4446f2 extends C4638z1 {

    /* renamed from: h0 */
    private static final String f11049h0 = C1557c.m7461a(C4446f2.class);

    /* renamed from: g0 */
    private final C4432e1 f11050g0;

    public C4446f2(String str, C4445f1 f1Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("geofence/request");
        super(Uri.parse(sb.toString()), null);
        this.f11050g0 = C4548p1.m15761a(f1Var);
    }

    /* renamed from: a */
    public void mo15458a(C4419d dVar, C4596u1 u1Var) {
        C1557c.m7458a(f11049h0, "GeofenceRefreshRequest executed successfully.");
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
            if (this.f11050g0 != null) {
                i.put("location_event", this.f11050g0.mo6750b());
            }
            return i;
        } catch (JSONException e) {
            C1557c.m7474e(f11049h0, "Experienced JSONException while creating geofence refresh request. Returning null.", e);
            return null;
        }
    }
}
