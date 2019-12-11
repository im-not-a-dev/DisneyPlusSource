package p161f.p162a;

import com.appboy.p033s.C1557c;
import java.util.List;
import org.json.JSONArray;

/* renamed from: f.a.q4 */
public abstract class C4560q4 implements C4435e4 {

    /* renamed from: U */
    private static final String f11348U = C1557c.m7461a(C4560q4.class);

    /* renamed from: c */
    protected List<C4435e4> f11349c;

    protected C4560q4(List<C4435e4> list) {
        this.f11349c = list;
    }

    /* renamed from: a */
    public JSONArray mo6750b() {
        JSONArray jSONArray = new JSONArray();
        try {
            for (C4435e4 b : this.f11349c) {
                jSONArray.put(b.mo6750b());
            }
        } catch (Exception e) {
            C1557c.m7470c(f11348U, "Caught exception creating Json.", e);
        }
        return jSONArray;
    }
}
