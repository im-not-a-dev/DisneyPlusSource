package p161f.p162a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: f.a.d6 */
public final class C4429d6 {

    /* renamed from: a */
    private static Integer f11014a = new Integer(1);

    /* renamed from: a */
    public static Map<Object, JSONObject> m15290a(JSONArray jSONArray, String str) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = (JSONObject) jSONArray.get(i);
            hashMap.put(jSONObject.get(str), jSONObject);
        }
        return hashMap;
    }

    /* renamed from: b */
    public static List<Object> m15294b(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.get(i));
        }
        return arrayList;
    }

    /* renamed from: c */
    public static boolean m15295c(JSONArray jSONArray) {
        for (int i = 0; i < jSONArray.length(); i++) {
            if (!m15292a(jSONArray.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m15296d(JSONArray jSONArray) {
        for (int i = 0; i < jSONArray.length(); i++) {
            if (!(jSONArray.get(i) instanceof JSONObject)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static String m15288a(JSONArray jSONArray) {
        for (String str : m15291a((JSONObject) jSONArray.get(0))) {
            if (m15293a(str, jSONArray)) {
                return str;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m15293a(String str, JSONArray jSONArray) {
        HashSet hashSet = new HashSet();
        int i = 0;
        while (i < jSONArray.length()) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.has(str)) {
                    Object obj2 = jSONObject.get(str);
                    if (m15292a(obj2) && !hashSet.contains(obj2)) {
                        hashSet.add(obj2);
                        i++;
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m15292a(Object obj) {
        return !(obj instanceof JSONObject) && !(obj instanceof JSONArray);
    }

    /* renamed from: a */
    public static Set<String> m15291a(JSONObject jSONObject) {
        TreeSet treeSet = new TreeSet();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            treeSet.add((String) keys.next());
        }
        return treeSet;
    }

    /* renamed from: a */
    public static String m15286a(String str, String str2) {
        if ("".equals(str)) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: a */
    public static String m15287a(String str, String str2, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("[");
        sb.append(str2);
        sb.append("=");
        sb.append(obj);
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: a */
    public static <T> Map<T, Integer> m15289a(Collection<T> collection) {
        HashMap hashMap = new HashMap();
        for (Object next : collection) {
            Integer num = (Integer) hashMap.get(next);
            if (num == null) {
                hashMap.put(next, f11014a);
            } else {
                hashMap.put(next, new Integer(num.intValue() + 1));
            }
        }
        return hashMap;
    }
}
