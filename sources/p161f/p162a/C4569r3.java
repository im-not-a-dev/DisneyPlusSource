package p161f.p162a;

import com.appboy.p030r.C1535e;
import com.appboy.p033s.C1557c;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: f.a.r3 */
public final class C4569r3 extends JSONObject {

    /* renamed from: a */
    private static final String f11372a = C1557c.m7461a(C4569r3.class);

    /* renamed from: a */
    public static <TargetEnum extends Enum<TargetEnum>> TargetEnum m15866a(JSONObject jSONObject, String str, Class<TargetEnum> cls) {
        return C4480j3.m15505a(jSONObject.getString(str).toUpperCase(Locale.US), cls);
    }

    /* renamed from: a */
    public static <TargetEnum extends Enum<TargetEnum>> TargetEnum m15867a(JSONObject jSONObject, String str, Class<TargetEnum> cls, TargetEnum targetenum) {
        try {
            return m15866a(jSONObject, str, cls);
        } catch (Exception unused) {
            return targetenum;
        }
    }

    /* renamed from: a */
    public static <T> JSONArray m15871a(Collection<? extends C1535e<T>> collection) {
        JSONArray jSONArray = new JSONArray();
        for (C1535e b : collection) {
            jSONArray.put(b.mo6750b());
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static <T> JSONArray m15872a(T[] tArr) {
        JSONArray jSONArray = new JSONArray();
        for (T put : tArr) {
            jSONArray.put(put);
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static String m15869a(JSONObject jSONObject, String str) {
        if (!jSONObject.has(str) || jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    /* renamed from: a */
    public static Map<String, String> m15870a(JSONObject jSONObject, Map<String, String> map) {
        if (jSONObject != null) {
            HashMap hashMap = new HashMap();
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                hashMap.put(str, jSONObject.getString(str));
            }
            return hashMap;
        } else if (map != null) {
            return map;
        } else {
            String str2 = "Cannot convert JSONObject to Map because JSONObject is null and no default was provided.";
            C1557c.m7458a(f11372a, str2);
            throw new JSONException(str2);
        }
    }

    /* renamed from: a */
    public static JSONObject m15873a(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONObject jSONObject3 = new JSONObject();
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                jSONObject3.put(str, jSONObject.get(str));
            }
            Iterator keys2 = jSONObject2.keys();
            while (keys2.hasNext()) {
                String str2 = (String) keys2.next();
                jSONObject3.put(str2, jSONObject2.get(str2));
            }
            return jSONObject3;
        } catch (JSONException e) {
            C1557c.m7470c(f11372a, "Caught exception merging Json objects.", e);
            return null;
        }
    }

    /* renamed from: a */
    public static String m15868a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return "";
        }
        try {
            return jSONObject.toString(2);
        } catch (JSONException e) {
            C1557c.m7470c(f11372a, "Caught JSONException while generating pretty printed json. Returning standard toString().", e);
            return jSONObject.toString();
        }
    }
}
