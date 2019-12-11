package p161f.p162a;

import com.appboy.p030r.C1532b;
import com.appboy.p033s.C1557c;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: f.a.s5 */
public final class C4584s5 {

    /* renamed from: a */
    private static final String f11398a = C1557c.m7461a(C4584s5.class);

    /* renamed from: a */
    public static C1532b m15908a(JSONObject jSONObject, C4595u0 u0Var) {
        if (jSONObject == null) {
            try {
                C1557c.m7458a(f11398a, "Templated message Json was null. Not de-serializing templated message.");
                return null;
            } catch (JSONException e) {
                String str = f11398a;
                StringBuilder sb = new StringBuilder();
                sb.append("Encountered JSONException processing templated message: ");
                sb.append(jSONObject);
                C1557c.m7474e(str, sb.toString(), e);
                return null;
            } catch (Exception e2) {
                String str2 = f11398a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Encountered general exception processing templated message: ");
                sb2.append(jSONObject);
                C1557c.m7474e(str2, sb2.toString(), e2);
                return null;
            }
        } else {
            String string = jSONObject.getString("type");
            if (string.equals("inapp")) {
                return C4558q3.m15834a(jSONObject.getJSONObject("data"), u0Var);
            }
            String str3 = f11398a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Received templated message Json with unknown type: ");
            sb3.append(string);
            sb3.append(". Not parsing.");
            C1557c.m7473e(str3, sb3.toString());
            return null;
        }
    }

    /* renamed from: b */
    public static C4631y3 m15911b(JSONObject jSONObject, C4595u0 u0Var) {
        C4631y3 a4Var;
        try {
            String string = jSONObject.getString("type");
            if (string.equals("inapp")) {
                a4Var = new C4640z3(jSONObject, u0Var);
            } else if (string.equals("templated_iam")) {
                a4Var = new C4385a4(jSONObject, u0Var);
            } else {
                String str = f11398a;
                StringBuilder sb = new StringBuilder();
                sb.append("Received unknown trigger type: ");
                sb.append(string);
                C1557c.m7469c(str, sb.toString());
                return null;
            }
            return a4Var;
        } catch (JSONException e) {
            String str2 = f11398a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Encountered JSONException processing triggered action Json: ");
            sb2.append(jSONObject);
            C1557c.m7474e(str2, sb2.toString(), e);
            return null;
        } catch (Exception e2) {
            String str3 = f11398a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Failed to deserialize triggered action Json: ");
            sb3.append(jSONObject);
            C1557c.m7474e(str3, sb3.toString(), e2);
            return null;
        }
    }

    /* renamed from: a */
    public static List<C4631y3> m15910a(JSONArray jSONArray, C4595u0 u0Var) {
        if (jSONArray == null) {
            try {
                C1557c.m7458a(f11398a, "Triggered actions Json array was null. Not de-serializing triggered actions.");
                return null;
            } catch (JSONException e) {
                String str = f11398a;
                StringBuilder sb = new StringBuilder();
                sb.append("Encountered JSONException processing triggered actions Json array: ");
                sb.append(jSONArray);
                C1557c.m7474e(str, sb.toString(), e);
                return null;
            } catch (Exception e2) {
                String str2 = f11398a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to deserialize triggered actions Json array: ");
                sb2.append(jSONArray);
                C1557c.m7474e(str2, sb2.toString(), e2);
                return null;
            }
        } else {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                C4631y3 b = m15911b(jSONArray.getJSONObject(i), u0Var);
                if (b != null) {
                    arrayList.add(b);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: a */
    public static List<C4456g4> m15909a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                C1557c.m7473e(f11398a, "Received null or blank trigger condition Json. Not parsing.");
            } else {
                String string = optJSONObject.getString("type");
                if (string.equals("purchase")) {
                    arrayList.add(new C4490k4(optJSONObject));
                } else if (string.equals("custom_event")) {
                    arrayList.add(new C4416c4(optJSONObject));
                } else if (string.equals("push_click")) {
                    arrayList.add(new C4512m4(optJSONObject));
                } else if (string.equals("open")) {
                    arrayList.add(new C4473i4());
                } else if (string.equals("iam_click")) {
                    arrayList.add(new C4465h4(optJSONObject));
                } else if (string.equals("test")) {
                    arrayList.add(new C4523n4());
                } else if (string.equals("custom_event_property")) {
                    arrayList.add(new C4427d4(optJSONObject));
                } else if (string.equals("purchase_property")) {
                    arrayList.add(new C4502l4(optJSONObject));
                } else {
                    String str = f11398a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Received triggered condition Json with unknown type: ");
                    sb.append(string);
                    sb.append(". Not parsing.");
                    C1557c.m7473e(str, sb.toString());
                }
            }
        }
        return arrayList;
    }
}
