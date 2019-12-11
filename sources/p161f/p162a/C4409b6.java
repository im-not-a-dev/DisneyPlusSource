package p161f.p162a;

import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: f.a.b6 */
public class C4409b6 extends C4387a6 {

    /* renamed from: a */
    C4626x5 f10985a;

    public C4409b6(C4626x5 x5Var) {
        this.f10985a = x5Var;
    }

    /* renamed from: a */
    public void mo15483a(String str, JSONObject jSONObject, JSONObject jSONObject2, C4633y5 y5Var) {
        mo15421c(str, jSONObject, jSONObject2, y5Var);
        if (!this.f10985a.mo15912a()) {
            mo15419b(str, jSONObject, jSONObject2, y5Var);
        }
    }

    /* renamed from: a */
    public void mo15481a(String str, Object obj, Object obj2, C4633y5 y5Var) {
        if (!(obj instanceof Number) || !(obj2 instanceof Number)) {
            if (!obj.getClass().isAssignableFrom(obj2.getClass())) {
                y5Var.mo15942a(str, obj, obj2);
            } else if (obj instanceof JSONArray) {
                mo15482a(str, (JSONArray) obj, (JSONArray) obj2, y5Var);
            } else if (obj instanceof JSONObject) {
                mo15483a(str, (JSONObject) obj, (JSONObject) obj2, y5Var);
            } else if (!obj.equals(obj2)) {
                y5Var.mo15942a(str, obj, obj2);
            }
        } else if (((Number) obj).doubleValue() != ((Number) obj2).doubleValue()) {
            y5Var.mo15942a(str, obj, obj2);
        }
    }

    /* renamed from: a */
    public void mo15482a(String str, JSONArray jSONArray, JSONArray jSONArray2, C4633y5 y5Var) {
        if (jSONArray.length() != jSONArray2.length()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("[]: Expected ");
            sb.append(jSONArray.length());
            sb.append(" values but got ");
            sb.append(jSONArray2.length());
            y5Var.mo15943a(sb.toString());
        } else if (jSONArray.length() != 0) {
            if (this.f10985a.mo15913b()) {
                mo15422d(str, jSONArray, jSONArray2, y5Var);
            } else if (C4429d6.m15295c(jSONArray)) {
                mo15420c(str, jSONArray, jSONArray2, y5Var);
            } else if (C4429d6.m15296d(jSONArray)) {
                mo15418b(str, jSONArray, jSONArray2, y5Var);
            } else {
                mo15423e(str, jSONArray, jSONArray2, y5Var);
            }
        }
    }
}
