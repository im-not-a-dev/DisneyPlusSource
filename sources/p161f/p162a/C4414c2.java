package p161f.p162a;

import android.net.Uri;
import com.appboy.p033s.C1557c;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p161f.p162a.C4517n1.C4519b;

/* renamed from: f.a.c2 */
public final class C4414c2 extends C4638z1 {

    /* renamed from: h0 */
    private static final String f10997h0 = C1557c.m7461a(C4414c2.class);

    /* renamed from: g0 */
    private final C4517n1 f10998g0;

    public C4414c2(String str) {
        this(str, new C4519b().mo15716c());
    }

    /* renamed from: a */
    public void mo15458a(C4419d dVar, C4596u1 u1Var) {
    }

    /* renamed from: a */
    public void mo15459a(Map<String, String> map) {
        super.mo15459a(map);
        if (!this.f10998g0.mo15457d()) {
            boolean z = false;
            String str = "true";
            if (this.f10998g0.mo15709e()) {
                map.put("X-Braze-FeedRequest", str);
                z = true;
            }
            if (this.f10998g0.mo15711g()) {
                map.put("X-Braze-TriggersRequest", str);
                z = true;
            }
            if (z) {
                map.put("X-Braze-DataRequest", str);
            }
        }
    }

    /* renamed from: b */
    public C4601u6 mo15460b() {
        return C4601u6.POST;
    }

    /* renamed from: g */
    public boolean mo15461g() {
        return this.f10998g0.mo15457d() && super.mo15461g();
    }

    /* renamed from: i */
    public JSONObject mo15462i() {
        JSONObject i = super.mo15462i();
        if (i == null) {
            return null;
        }
        try {
            if (!this.f10998g0.mo15457d()) {
                i.put("respond_with", this.f10998g0.mo6750b());
            }
            return i;
        } catch (JSONException e) {
            C1557c.m7474e(f10997h0, "Experienced JSONException while retrieving parameters. Returning null.", e);
            return null;
        }
    }

    public C4414c2(String str, C4517n1 n1Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("data");
        super(Uri.parse(sb.toString()), null);
        this.f10998g0 = n1Var;
        mo15953a(n1Var);
    }
}
