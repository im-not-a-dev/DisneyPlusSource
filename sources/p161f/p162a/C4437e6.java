package p161f.p162a;

import com.appboy.p033s.C1557c;
import java.net.URI;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONObject;

/* renamed from: f.a.e6 */
final class C4437e6 implements C4457g5 {

    /* renamed from: b */
    private static final String f11022b = C1557c.m7461a(C4437e6.class);

    /* renamed from: a */
    private final C4457g5 f11023a;

    public C4437e6(C4457g5 g5Var) {
        this.f11023a = g5Var;
    }

    /* renamed from: a */
    public JSONObject mo15529a(URI uri, Map<String, String> map) {
        String a = C4550p3.m15814a(uri, map, C4601u6.GET);
        m15323a(uri, map, a);
        JSONObject a2 = this.f11023a.mo15529a(uri, map);
        m15325a(a2, a);
        return a2;
    }

    /* renamed from: a */
    public JSONObject mo15530a(URI uri, Map<String, String> map, JSONObject jSONObject) {
        String a = C4550p3.m15814a(uri, map, jSONObject, C4601u6.POST);
        m15324a(uri, map, jSONObject, a);
        JSONObject a2 = this.f11023a.mo15530a(uri, map, jSONObject);
        m15325a(a2, a);
        return a2;
    }

    /* renamed from: a */
    private void m15323a(URI uri, Map<String, String> map, String str) {
        try {
            String str2 = f11022b;
            StringBuilder sb = new StringBuilder();
            sb.append("Making request(id = ");
            sb.append(str);
            sb.append(") to [");
            sb.append(uri.toString());
            sb.append("] \nwith headers: [");
            sb.append(m15322a(map));
            sb.append("]");
            C1557c.m7458a(str2, sb.toString());
        } catch (Exception e) {
            C1557c.m7466b(f11022b, "Exception while logging request: ", (Throwable) e);
        }
    }

    /* renamed from: a */
    private void m15324a(URI uri, Map<String, String> map, JSONObject jSONObject, String str) {
        try {
            String str2 = f11022b;
            StringBuilder sb = new StringBuilder();
            sb.append("Making request(id = ");
            sb.append(str);
            sb.append(") to [");
            sb.append(uri.toString());
            sb.append("] \nwith headers: [");
            sb.append(m15322a(map));
            sb.append("] \nand JSON parameters: \n[");
            sb.append(C4569r3.m15868a(jSONObject));
            sb.append("]");
            C1557c.m7458a(str2, sb.toString());
        } catch (Exception e) {
            C1557c.m7466b(f11022b, "Exception while logging request: ", (Throwable) e);
        }
    }

    /* renamed from: a */
    private void m15325a(JSONObject jSONObject, String str) {
        String str2;
        if (jSONObject == null) {
            str2 = "none";
        } else {
            try {
                str2 = C4569r3.m15868a(jSONObject);
            } catch (Exception e) {
                C1557c.m7466b(f11022b, "Exception while logging result: ", (Throwable) e);
                return;
            }
        }
        String str3 = f11022b;
        StringBuilder sb = new StringBuilder();
        sb.append("Result(id = ");
        sb.append(str);
        sb.append(") \n[");
        sb.append(str2);
        sb.append("]");
        C1557c.m7458a(str3, sb.toString());
    }

    /* renamed from: a */
    private String m15322a(Map<String, String> map) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (Entry entry : map.entrySet()) {
            StringBuilder sb = new StringBuilder();
            sb.append("(");
            sb.append((String) entry.getKey());
            sb.append(" / ");
            sb.append((String) entry.getValue());
            sb.append(")");
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        for (String append : arrayList) {
            sb2.append(append);
            sb2.append(", ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        return sb2.substring(0, sb2.length() - 2);
    }
}
