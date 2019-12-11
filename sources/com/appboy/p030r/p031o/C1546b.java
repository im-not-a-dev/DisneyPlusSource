package com.appboy.p030r.p031o;

import com.appboy.p025o.C1494c;
import com.appboy.p025o.C1494c.C1495a;
import com.appboy.p025o.C1496d;
import org.json.JSONObject;
import p161f.p162a.C4413c1;
import p161f.p162a.C4546p0;
import p161f.p162a.C4569r3;
import p161f.p162a.C4639z2;

/* renamed from: com.appboy.r.o.b */
public final class C1546b extends C1547c {

    /* renamed from: l0 */
    private final String f5653l0;

    /* renamed from: m0 */
    private final String f5654m0;

    /* renamed from: n0 */
    private final String f5655n0;

    /* renamed from: o0 */
    private final String f5656o0;

    /* renamed from: p0 */
    private final String f5657p0;

    /* renamed from: q0 */
    private final float f5658q0;

    public C1546b(JSONObject jSONObject, C1495a aVar, C4546p0 p0Var, C4639z2 z2Var, C4413c1 c1Var) {
        super(jSONObject, aVar, p0Var, z2Var, c1Var);
        this.f5653l0 = jSONObject.getString(aVar.mo6747a(C1494c.CAPTIONED_IMAGE_IMAGE));
        this.f5654m0 = jSONObject.getString(aVar.mo6747a(C1494c.CAPTIONED_IMAGE_TITLE));
        this.f5655n0 = jSONObject.getString(aVar.mo6747a(C1494c.CAPTIONED_IMAGE_DESCRIPTION));
        this.f5656o0 = C4569r3.m15869a(jSONObject, aVar.mo6747a(C1494c.CAPTIONED_IMAGE_URL));
        this.f5657p0 = C4569r3.m15869a(jSONObject, aVar.mo6747a(C1494c.CAPTIONED_IMAGE_DOMAIN));
        this.f5658q0 = (float) jSONObject.optDouble(aVar.mo6747a(C1494c.CAPTIONED_IMAGE_ASPECT_RATIO), 0.0d);
    }

    /* renamed from: I */
    public C1496d mo6855I() {
        return C1496d.CAPTIONED_IMAGE;
    }

    /* renamed from: O */
    public String mo6856O() {
        return this.f5656o0;
    }

    /* renamed from: S */
    public float mo6860S() {
        return this.f5658q0;
    }

    /* renamed from: T */
    public String mo6861T() {
        return this.f5655n0;
    }

    /* renamed from: U */
    public String mo6862U() {
        return this.f5657p0;
    }

    /* renamed from: V */
    public String mo6863V() {
        return this.f5653l0;
    }

    /* renamed from: W */
    public String mo6864W() {
        return this.f5654m0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CaptionedImageCard{");
        sb.append(super.toString());
        sb.append(", mImageUrl='");
        sb.append(this.f5653l0);
        sb.append('\'');
        sb.append(", mTitle='");
        sb.append(this.f5654m0);
        sb.append('\'');
        sb.append(", mDescription='");
        sb.append(this.f5655n0);
        sb.append('\'');
        sb.append(", mUrl='");
        sb.append(this.f5656o0);
        sb.append('\'');
        sb.append(", mDomain='");
        sb.append(this.f5657p0);
        sb.append('\'');
        sb.append(", mAspectRatio='");
        sb.append(this.f5658q0);
        sb.append('\'');
        sb.append("}");
        return sb.toString();
    }
}
