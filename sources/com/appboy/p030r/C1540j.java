package com.appboy.p030r;

import com.appboy.p025o.p026k.C1512f;
import org.json.JSONException;
import org.json.JSONObject;
import p161f.p162a.C4595u0;

/* renamed from: com.appboy.r.j */
public class C1540j extends C1539i {
    public C1540j() {
    }

    public C1540j(JSONObject jSONObject, C4595u0 u0Var) {
        super(jSONObject, u0Var);
    }

    /* renamed from: b */
    public JSONObject m7354b() {
        JSONObject jSONObject = this.f5612m0;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            JSONObject b = super.mo6750b();
            b.put("type", C1512f.HTML_FULL.name());
            return b;
        } catch (JSONException unused) {
            return null;
        }
    }
}
