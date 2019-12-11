package p161f.p162a;

import com.appboy.p030r.C1531a;
import com.appboy.p033s.C1557c;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: f.a.k3 */
public final class C4489k3 {

    /* renamed from: a */
    private static final String f11132a = C1557c.m7461a(C4489k3.class);

    /* renamed from: a */
    public static List<C1531a> m15541a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                try {
                    C1557c.m7473e(f11132a, "Received null or blank geofence Json. Not parsing.");
                } catch (JSONException e) {
                    String str = f11132a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to deserialize geofence Json due to JSONException: ");
                    sb.append(optJSONObject);
                    C1557c.m7474e(str, sb.toString(), e);
                } catch (Exception e2) {
                    String str2 = f11132a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Failed to deserialize geofence Json:");
                    sb2.append(optJSONObject);
                    C1557c.m7470c(str2, sb2.toString(), e2);
                }
            } else {
                arrayList.add(new C1531a(optJSONObject));
            }
        }
        return arrayList;
    }
}
