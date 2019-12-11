package com.appboy.p030r;

import com.appboy.p025o.p026k.C1507b;
import com.appboy.p025o.p026k.C1512f;
import org.json.JSONException;
import org.json.JSONObject;
import p161f.p162a.C4569r3;
import p161f.p162a.C4595u0;

/* renamed from: com.appboy.r.h */
public class C1538h extends C1541k {
    public C1538h() {
        this.f5609j0 = C1507b.CENTER_CROP;
    }

    /* renamed from: b */
    public JSONObject m7343b() {
        JSONObject jSONObject = this.f5612m0;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            JSONObject b = super.mo6750b();
            b.put("type", C1512f.FULL.name());
            return b;
        } catch (JSONException unused) {
            return null;
        }
    }

    public C1538h(JSONObject jSONObject, C4595u0 u0Var) {
        super(jSONObject, u0Var);
        this.f5609j0 = (C1507b) C4569r3.m15867a(jSONObject, "crop_type", C1507b.class, C1507b.CENTER_CROP);
    }
}
