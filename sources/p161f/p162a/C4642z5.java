package p161f.p162a;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: f.a.z5 */
public class C4642z5 {

    /* renamed from: f.a.z5$a */
    static class C4643a implements C4592t5 {

        /* renamed from: a */
        final /* synthetic */ String f11592a;

        C4643a(String str) {
            this.f11592a = str;
        }

        /* renamed from: a */
        public String mo15861a() {
            return this.f11592a;
        }
    }

    /* renamed from: a */
    public static Object m16182a(String str) {
        if (str.trim().startsWith("{")) {
            return new JSONObject(str);
        }
        if (str.trim().startsWith("[")) {
            return new JSONArray(str);
        }
        if (str.trim().startsWith("\"") || str.trim().matches("-?(?:0|[1-9]\\d*)(?:\\.\\d+)?(?:[eE][+-]?\\d+)?")) {
            return new C4643a(str);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unparsable JSON string: ");
        sb.append(str);
        throw new JSONException(sb.toString());
    }
}
