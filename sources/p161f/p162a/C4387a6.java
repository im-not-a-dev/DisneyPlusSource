package p161f.p162a;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: f.a.a6 */
public abstract class C4387a6 implements C4418c6 {
    /* renamed from: a */
    public final C4633y5 mo15417a(JSONObject jSONObject, JSONObject jSONObject2) {
        C4633y5 y5Var = new C4633y5();
        mo15483a("", jSONObject, jSONObject2, y5Var);
        return y5Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo15419b(String str, JSONObject jSONObject, JSONObject jSONObject2, C4633y5 y5Var) {
        for (String str2 : C4429d6.m15291a(jSONObject2)) {
            if (!jSONObject.has(str2)) {
                y5Var.mo15945b(str, str2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo15421c(String str, JSONObject jSONObject, JSONObject jSONObject2, C4633y5 y5Var) {
        for (String str2 : C4429d6.m15291a(jSONObject)) {
            Object obj = jSONObject.get(str2);
            if (jSONObject2.has(str2)) {
                mo15481a(C4429d6.m15286a(str, str2), obj, jSONObject2.get(str2), y5Var);
            } else {
                y5Var.mo15941a(str, str2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo15422d(String str, JSONArray jSONArray, JSONArray jSONArray2, C4633y5 y5Var) {
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            Object obj2 = jSONArray2.get(i);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("[");
            sb.append(i);
            sb.append("]");
            mo15481a(sb.toString(), obj, obj2, y5Var);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo15423e(String str, JSONArray jSONArray, JSONArray jSONArray2, C4633y5 y5Var) {
        boolean z;
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            int i2 = 0;
            while (true) {
                z = true;
                if (i2 >= jSONArray2.length()) {
                    z = false;
                    break;
                }
                Object obj2 = jSONArray2.get(i2);
                if (!hashSet.contains(Integer.valueOf(i2)) && obj2.getClass().equals(obj.getClass())) {
                    if (obj instanceof JSONObject) {
                        if (mo15417a((JSONObject) obj, (JSONObject) obj2).mo15944a()) {
                            hashSet.add(Integer.valueOf(i2));
                            break;
                        }
                    } else if (obj instanceof JSONArray) {
                        if (mo15416a((JSONArray) obj, (JSONArray) obj2).mo15944a()) {
                            hashSet.add(Integer.valueOf(i2));
                            break;
                        }
                    } else if (obj.equals(obj2)) {
                        hashSet.add(Integer.valueOf(i2));
                        break;
                    }
                }
                i2++;
            }
            if (!z) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("[");
                sb.append(i);
                sb.append("] Could not find match for element ");
                sb.append(obj);
                y5Var.mo15943a(sb.toString());
                return;
            }
        }
    }

    /* renamed from: a */
    public final C4633y5 mo15416a(JSONArray jSONArray, JSONArray jSONArray2) {
        C4633y5 y5Var = new C4633y5();
        mo15482a("", jSONArray, jSONArray2, y5Var);
        return y5Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo15418b(String str, JSONArray jSONArray, JSONArray jSONArray2, C4633y5 y5Var) {
        String a = C4429d6.m15288a(jSONArray);
        if (a == null || !C4429d6.m15293a(a, jSONArray2)) {
            mo15423e(str, jSONArray, jSONArray2, y5Var);
            return;
        }
        Map a2 = C4429d6.m15290a(jSONArray, a);
        Map a3 = C4429d6.m15290a(jSONArray2, a);
        for (Object next : a2.keySet()) {
            if (!a3.containsKey(next)) {
                y5Var.mo15941a(C4429d6.m15287a(str, a, next), a2.get(next));
            } else {
                mo15481a(C4429d6.m15287a(str, a, next), (Object) (JSONObject) a2.get(next), (Object) (JSONObject) a3.get(next), y5Var);
            }
        }
        for (Object next2 : a3.keySet()) {
            if (!a2.containsKey(next2)) {
                y5Var.mo15945b(C4429d6.m15287a(str, a, next2), a3.get(next2));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo15420c(String str, JSONArray jSONArray, JSONArray jSONArray2, C4633y5 y5Var) {
        String str2;
        Map a = C4429d6.m15289a((Collection<T>) C4429d6.m15294b(jSONArray));
        Map a2 = C4429d6.m15289a((Collection<T>) C4429d6.m15294b(jSONArray2));
        Iterator it = a.keySet().iterator();
        while (true) {
            str2 = "[]";
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!a2.containsKey(next)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(str2);
                y5Var.mo15941a(sb.toString(), next);
            } else if (!((Integer) a2.get(next)).equals(a.get(next))) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append("[]: Expected ");
                sb2.append(a.get(next));
                sb2.append(" occurrence(s) of ");
                sb2.append(next);
                sb2.append(" but got ");
                sb2.append(a2.get(next));
                sb2.append(" occurrence(s)");
                y5Var.mo15943a(sb2.toString());
            }
        }
        for (Object next2 : a2.keySet()) {
            if (!a.containsKey(next2)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(str2);
                y5Var.mo15945b(sb3.toString(), next2);
            }
        }
    }
}
