package p161f.p162a;

import com.appboy.p033s.C1557c;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: f.a.b4 */
public abstract class C4407b4 implements C4631y3 {

    /* renamed from: Y */
    private static final String f10977Y = C1557c.m7461a(C4407b4.class);

    /* renamed from: U */
    private final C4591t4 f10978U;

    /* renamed from: V */
    private final List<C4456g4> f10979V = new ArrayList();

    /* renamed from: W */
    private boolean f10980W;

    /* renamed from: X */
    private C4571r5 f10981X;

    /* renamed from: c */
    private final String f10982c;

    protected C4407b4(JSONObject jSONObject) {
        this.f10982c = jSONObject.getString("id");
        this.f10978U = new C4607v4(jSONObject);
        JSONArray jSONArray = jSONObject.getJSONArray("trigger_condition");
        if (jSONArray != null && jSONArray.length() > 0) {
            this.f10979V.addAll(C4584s5.m15909a(jSONArray));
        }
        this.f10980W = jSONObject.optBoolean("prefetch", true);
    }

    /* renamed from: a */
    public boolean mo15471a(C4641z4 z4Var) {
        if (!mo15475h()) {
            String str = f10977Y;
            StringBuilder sb = new StringBuilder();
            sb.append("Triggered action ");
            sb.append(this.f10982c);
            sb.append("not eligible to be triggered by ");
            sb.append(z4Var.mo15479d());
            sb.append(" event. Current device time outside triggered action time window.");
            C1557c.m7458a(str, sb.toString());
            return false;
        }
        for (C4456g4 a : this.f10979V) {
            if (a.mo15493a(z4Var)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public C4591t4 mo15472c() {
        return this.f10978U;
    }

    /* renamed from: d */
    public String mo15473d() {
        return this.f10982c;
    }

    /* renamed from: e */
    public C4571r5 mo15474e() {
        return this.f10981X;
    }

    /* renamed from: f */
    public JSONObject mo6750b() {
        try {
            JSONObject jSONObject = (JSONObject) this.f10978U.mo6750b();
            jSONObject.put("id", this.f10982c);
            if (this.f10979V != null) {
                JSONArray jSONArray = new JSONArray();
                for (C4456g4 b : this.f10979V) {
                    jSONArray.put(b.mo6750b());
                }
                jSONObject.put("trigger_condition", jSONArray);
                jSONObject.put("prefetch", this.f10980W);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public boolean mo15475h() {
        return mo15476i() && mo15477j();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public boolean mo15476i() {
        return this.f10978U.mo15854a() == -1 || C4472i3.m15480a() > this.f10978U.mo15854a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public boolean mo15477j() {
        return this.f10978U.mo15856d() == -1 || C4472i3.m15480a() < this.f10978U.mo15856d();
    }

    /* renamed from: a */
    public boolean mo15470a() {
        return this.f10980W;
    }

    /* renamed from: a */
    public void mo15469a(C4571r5 r5Var) {
        this.f10981X = r5Var;
    }
}
