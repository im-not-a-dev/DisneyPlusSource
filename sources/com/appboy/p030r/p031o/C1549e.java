package com.appboy.p030r.p031o;

import com.appboy.p025o.C1494c;
import com.appboy.p025o.C1494c.C1495a;
import com.appboy.p025o.C1496d;
import org.json.JSONObject;
import p161f.p162a.C4413c1;
import p161f.p162a.C4546p0;
import p161f.p162a.C4569r3;
import p161f.p162a.C4639z2;

/* renamed from: com.appboy.r.o.e */
public final class C1549e extends C1547c {

    /* renamed from: l0 */
    private final String f5677l0;

    /* renamed from: m0 */
    private final String f5678m0;

    /* renamed from: n0 */
    private final String f5679n0;

    /* renamed from: o0 */
    private final String f5680o0;

    /* renamed from: p0 */
    private final String f5681p0;

    public C1549e(JSONObject jSONObject, C1495a aVar, C4546p0 p0Var, C4639z2 z2Var, C4413c1 c1Var) {
        super(jSONObject, aVar, p0Var, z2Var, c1Var);
        this.f5677l0 = jSONObject.getString(aVar.mo6747a(C1494c.SHORT_NEWS_DESCRIPTION));
        this.f5678m0 = jSONObject.getString(aVar.mo6747a(C1494c.SHORT_NEWS_IMAGE));
        this.f5679n0 = C4569r3.m15869a(jSONObject, aVar.mo6747a(C1494c.SHORT_NEWS_TITLE));
        this.f5680o0 = C4569r3.m15869a(jSONObject, aVar.mo6747a(C1494c.SHORT_NEWS_URL));
        this.f5681p0 = C4569r3.m15869a(jSONObject, aVar.mo6747a(C1494c.SHORT_NEWS_DOMAIN));
    }

    /* renamed from: I */
    public C1496d mo6855I() {
        return C1496d.SHORT_NEWS;
    }

    /* renamed from: O */
    public String mo6856O() {
        return this.f5680o0;
    }

    /* renamed from: S */
    public String mo6884S() {
        return this.f5677l0;
    }

    /* renamed from: T */
    public String mo6885T() {
        return this.f5681p0;
    }

    /* renamed from: U */
    public String mo6886U() {
        return this.f5678m0;
    }

    /* renamed from: V */
    public String mo6887V() {
        return this.f5679n0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ShortNewsCard{");
        sb.append(super.toString());
        sb.append(", mDescription='");
        sb.append(this.f5677l0);
        sb.append('\'');
        sb.append(", mImageUrl='");
        sb.append(this.f5678m0);
        sb.append('\'');
        sb.append(", mTitle='");
        sb.append(this.f5679n0);
        sb.append('\'');
        sb.append(", mUrl='");
        sb.append(this.f5680o0);
        sb.append('\'');
        sb.append(", mDomain='");
        sb.append(this.f5681p0);
        sb.append('\'');
        sb.append("}");
        return sb.toString();
    }
}
