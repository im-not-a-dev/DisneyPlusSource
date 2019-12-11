package com.appboy.p030r.p031o;

import com.appboy.p025o.C1494c;
import com.appboy.p025o.C1494c.C1495a;
import com.appboy.p025o.C1496d;
import org.json.JSONObject;
import p161f.p162a.C4413c1;
import p161f.p162a.C4546p0;
import p161f.p162a.C4569r3;
import p161f.p162a.C4639z2;

/* renamed from: com.appboy.r.o.a */
public final class C1545a extends C1547c {

    /* renamed from: l0 */
    private final String f5649l0;

    /* renamed from: m0 */
    private final String f5650m0;

    /* renamed from: n0 */
    private final String f5651n0;

    /* renamed from: o0 */
    private final float f5652o0;

    public C1545a(JSONObject jSONObject, C1495a aVar, C4546p0 p0Var, C4639z2 z2Var, C4413c1 c1Var) {
        super(jSONObject, aVar, p0Var, z2Var, c1Var);
        this.f5649l0 = jSONObject.getString(aVar.mo6747a(C1494c.BANNER_IMAGE_IMAGE));
        this.f5650m0 = C4569r3.m15869a(jSONObject, aVar.mo6747a(C1494c.BANNER_IMAGE_URL));
        this.f5651n0 = C4569r3.m15869a(jSONObject, aVar.mo6747a(C1494c.BANNER_IMAGE_DOMAIN));
        this.f5652o0 = (float) jSONObject.optDouble(aVar.mo6747a(C1494c.BANNER_IMAGE_ASPECT_RATIO), 0.0d);
    }

    /* renamed from: I */
    public C1496d mo6855I() {
        return C1496d.BANNER;
    }

    /* renamed from: O */
    public String mo6856O() {
        return this.f5650m0;
    }

    /* renamed from: S */
    public float mo6857S() {
        return this.f5652o0;
    }

    /* renamed from: T */
    public String mo6858T() {
        return this.f5649l0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BannerImageCard{");
        sb.append(super.toString());
        sb.append(", mImageUrl='");
        sb.append(this.f5649l0);
        sb.append('\'');
        sb.append(", mUrl='");
        sb.append(this.f5650m0);
        sb.append('\'');
        sb.append(", mDomain='");
        sb.append(this.f5651n0);
        sb.append('\'');
        sb.append(", mAspectRatio='");
        sb.append(this.f5652o0);
        sb.append('\'');
        sb.append("}");
        return sb.toString();
    }
}
