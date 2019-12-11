package com.appboy.p030r;

import com.appboy.p025o.p026k.C1507b;
import com.appboy.p025o.p026k.C1509d;
import com.appboy.p025o.p026k.C1512f;
import org.json.JSONException;
import org.json.JSONObject;
import p161f.p162a.C4569r3;
import p161f.p162a.C4595u0;

/* renamed from: com.appboy.r.l */
public class C1542l extends C1541k {
    public C1542l() {
    }

    public C1542l(JSONObject jSONObject, C4595u0 u0Var) {
        super(jSONObject, u0Var);
        String str = "crop_type";
        if (this.f5632D0.equals(C1509d.GRAPHIC)) {
            this.f5609j0 = (C1507b) C4569r3.m15867a(jSONObject, str, C1507b.class, C1507b.CENTER_CROP);
        } else {
            this.f5609j0 = (C1507b) C4569r3.m15867a(jSONObject, str, C1507b.class, C1507b.FIT_CENTER);
        }
    }

    /* renamed from: b */
    public JSONObject m7368b() {
        JSONObject jSONObject = this.f5612m0;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            JSONObject b = super.mo6750b();
            b.put("type", C1512f.MODAL.name());
            return b;
        } catch (JSONException unused) {
            return null;
        }
    }
}
