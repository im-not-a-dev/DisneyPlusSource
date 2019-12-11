package p161f.p162a;

import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: f.a.w5 */
public final class C4616w5 {
    /* renamed from: a */
    private static C4418c6 m16030a(C4626x5 x5Var) {
        return new C4409b6(x5Var);
    }

    /* renamed from: a */
    public static C4633y5 m16032a(String str, String str2, C4418c6 c6Var) {
        Object a = C4642z5.m16182a(str);
        Object a2 = C4642z5.m16182a(str2);
        boolean z = a instanceof JSONObject;
        if (z && (a2 instanceof JSONObject)) {
            return m16035a((JSONObject) a, (JSONObject) a2, c6Var);
        }
        if ((a instanceof JSONArray) && (a2 instanceof JSONArray)) {
            return m16034a((JSONArray) a, (JSONArray) a2, c6Var);
        }
        if ((a instanceof C4592t5) && (a2 instanceof C4592t5)) {
            return m16031a((C4592t5) a, (C4592t5) a2);
        }
        String str3 = "";
        if (z) {
            C4633y5 y5Var = new C4633y5();
            y5Var.mo15942a(str3, a, a2);
            return y5Var;
        }
        C4633y5 y5Var2 = new C4633y5();
        y5Var2.mo15942a(str3, a, a2);
        return y5Var2;
    }

    /* renamed from: a */
    public static C4633y5 m16035a(JSONObject jSONObject, JSONObject jSONObject2, C4418c6 c6Var) {
        return c6Var.mo15417a(jSONObject, jSONObject2);
    }

    /* renamed from: a */
    public static C4633y5 m16034a(JSONArray jSONArray, JSONArray jSONArray2, C4418c6 c6Var) {
        return c6Var.mo15416a(jSONArray, jSONArray2);
    }

    /* renamed from: a */
    public static C4633y5 m16031a(C4592t5 t5Var, C4592t5 t5Var2) {
        C4633y5 y5Var = new C4633y5();
        if (!t5Var.mo15861a().equals(t5Var2.mo15861a())) {
            y5Var.mo15943a("");
        }
        return y5Var;
    }

    /* renamed from: a */
    public static C4633y5 m16033a(String str, String str2, C4626x5 x5Var) {
        return m16032a(str, str2, m16030a(x5Var));
    }

    /* renamed from: a */
    public static C4633y5 m16036a(JSONObject jSONObject, JSONObject jSONObject2, C4626x5 x5Var) {
        return m16035a(jSONObject, jSONObject2, m16030a(x5Var));
    }
}
