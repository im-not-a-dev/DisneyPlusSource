package p161f.p162a;

import android.content.Context;
import com.appboy.p030r.C1532b;
import com.appboy.p030r.C1533c;
import com.appboy.p033s.C1557c;
import com.appboy.p033s.C1563i;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: f.a.z3 */
public class C4640z3 extends C4407b4 implements C4631y3 {

    /* renamed from: c0 */
    private static final String f11588c0 = C1557c.m7461a(C4640z3.class);

    /* renamed from: Z */
    private C1532b f11589Z;

    /* renamed from: a0 */
    private C4595u0 f11590a0;

    /* renamed from: b0 */
    private String f11591b0;

    public C4640z3(JSONObject jSONObject, C4595u0 u0Var) {
        super(jSONObject);
        String str = f11588c0;
        StringBuilder sb = new StringBuilder();
        sb.append("Parsing in-app message triggered action with JSON: ");
        sb.append(C4569r3.m15868a(jSONObject));
        C1557c.m7458a(str, sb.toString());
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        if (jSONObject2 != null) {
            this.f11590a0 = u0Var;
            this.f11589Z = C4558q3.m15834a(jSONObject2, this.f11590a0);
            return;
        }
        C1557c.m7473e(f11588c0, "InAppMessageTriggeredAction Json did not contain in-app message.");
    }

    /* renamed from: a */
    public void mo15409a(String str) {
        this.f11591b0 = str;
    }

    /* renamed from: f */
    public JSONObject mo6750b() {
        try {
            JSONObject f = super.mo6750b();
            f.put("data", this.f11589Z.mo6750b());
            f.put("type", "inapp");
            return f;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: g */
    public C4561q5 mo15411g() {
        if (C1563i.m7490d(this.f11589Z.mo6795A())) {
            return null;
        }
        C1532b bVar = this.f11589Z;
        if (bVar instanceof C1533c) {
            return new C4561q5(C4625x4.ZIP, bVar.mo6795A());
        }
        return new C4561q5(C4625x4.IMAGE, bVar.mo6795A());
    }

    /* renamed from: a */
    public void mo15408a(Context context, C4419d dVar, C4641z4 z4Var, long j) {
        try {
            String str = f11588c0;
            StringBuilder sb = new StringBuilder();
            sb.append("Attempting to publish in-app message after delay of ");
            sb.append(mo15472c().mo15859g());
            sb.append(" seconds.");
            C1557c.m7458a(str, sb.toString());
            if (!C1563i.m7490d(this.f11591b0)) {
                this.f11589Z.mo6805b(this.f11591b0);
            }
            this.f11589Z.mo6801a(j);
            dVar.mo15485a(new C4476j(this, this.f11589Z, this.f11590a0.mo15779e()), C4476j.class);
        } catch (Exception e) {
            C1557c.m7474e(f11588c0, "Caught exception while performing triggered action.", e);
        }
    }
}
