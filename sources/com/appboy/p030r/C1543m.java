package com.appboy.p030r;

import android.graphics.Color;
import com.appboy.p025o.p026k.C1507b;
import com.appboy.p025o.p026k.C1512f;
import com.appboy.p025o.p026k.C1514h;
import com.appboy.p025o.p026k.C1515i;
import org.json.JSONException;
import org.json.JSONObject;
import p161f.p162a.C4569r3;
import p161f.p162a.C4595u0;

/* renamed from: com.appboy.r.m */
public class C1543m extends C1536f {

    /* renamed from: A0 */
    private int f5638A0;

    /* renamed from: z0 */
    private C1514h f5639z0;

    public C1543m() {
        this.f5639z0 = C1514h.BOTTOM;
        this.f5638A0 = Color.parseColor("#9B9B9B");
        this.f5610k0 = C1515i.START;
    }

    /* renamed from: c */
    public int mo6844c() {
        return this.f5638A0;
    }

    /* renamed from: d */
    public C1514h mo6845d() {
        return this.f5639z0;
    }

    /* renamed from: b */
    public JSONObject m7370b() {
        JSONObject jSONObject = this.f5612m0;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            JSONObject b = super.mo6750b();
            b.putOpt("slide_from", this.f5639z0.toString());
            b.put("close_btn_color", this.f5638A0);
            b.put("type", C1512f.SLIDEUP.name());
            return b;
        } catch (JSONException unused) {
            return null;
        }
    }

    public C1543m(JSONObject jSONObject, C4595u0 u0Var) {
        this(jSONObject, u0Var, (C1514h) C4569r3.m15867a(jSONObject, "slide_from", C1514h.class, C1514h.BOTTOM), jSONObject.optInt("close_btn_color"));
    }

    private C1543m(JSONObject jSONObject, C4595u0 u0Var, C1514h hVar, int i) {
        super(jSONObject, u0Var);
        this.f5639z0 = C1514h.BOTTOM;
        this.f5638A0 = Color.parseColor("#9B9B9B");
        this.f5639z0 = hVar;
        if (this.f5639z0 == null) {
            this.f5639z0 = C1514h.BOTTOM;
        }
        this.f5638A0 = i;
        this.f5609j0 = (C1507b) C4569r3.m15867a(jSONObject, "crop_type", C1507b.class, C1507b.FIT_CENTER);
        this.f5610k0 = (C1515i) C4569r3.m15867a(jSONObject, "text_align_message", C1515i.class, C1515i.START);
    }
}
