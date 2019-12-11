package p161f.p162a;

import com.appboy.p033s.C1557c;
import java.net.URI;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: f.a.g6 */
final class C4458g6 implements C4457g5 {

    /* renamed from: b */
    private static final String f11070b = C1557c.m7461a(C4458g6.class);

    /* renamed from: a */
    private final C4457g5 f11071a;

    public C4458g6(C4457g5 g5Var) {
        this.f11071a = g5Var;
    }

    /* renamed from: a */
    public JSONObject mo15529a(URI uri, Map<String, String> map) {
        String str = "]";
        String str2 = " : ";
        String str3 = "ms] [";
        String str4 = ") Executed in [";
        String str5 = "Request(id = ";
        long currentTimeMillis = System.currentTimeMillis();
        try {
            JSONObject a = this.f11071a.mo15529a(uri, map);
            return a;
        } finally {
            String a2 = C4550p3.m15814a(uri, map, C4601u6.GET);
            long currentTimeMillis2 = System.currentTimeMillis();
            String str6 = f11070b;
            StringBuilder sb = new StringBuilder();
            sb.append(str5);
            sb.append(a2);
            sb.append(str4);
            sb.append(currentTimeMillis2 - currentTimeMillis);
            sb.append(str3);
            sb.append(C4601u6.GET.toString());
            sb.append(str2);
            sb.append(uri.toString());
            sb.append(str);
            C1557c.m7458a(str6, sb.toString());
        }
    }

    /* renamed from: a */
    public JSONObject mo15530a(URI uri, Map<String, String> map, JSONObject jSONObject) {
        URI uri2 = uri;
        Map<String, String> map2 = map;
        JSONObject jSONObject2 = jSONObject;
        String str = "]";
        String str2 = ":";
        String str3 = "ms] [";
        String str4 = ") Executed in [";
        String str5 = "Request(id = ";
        long currentTimeMillis = System.currentTimeMillis();
        try {
            JSONObject a = this.f11071a.mo15530a(uri2, map2, jSONObject2);
            return a;
        } finally {
            char c = 3;
            String a2 = C4550p3.m15814a(uri2, map2, jSONObject2, C4601u6.POST);
            long currentTimeMillis2 = System.currentTimeMillis();
            String str6 = f11070b;
            StringBuilder sb = new StringBuilder();
            sb.append(str5);
            sb.append(a2);
            sb.append(str4);
            sb.append(currentTimeMillis2 - currentTimeMillis);
            sb.append(str3);
            sb.append(C4601u6.POST.toString());
            sb.append(str2);
            sb.append(uri.toString());
            sb.append(str);
            C1557c.m7458a(str6, sb.toString());
        }
    }
}
