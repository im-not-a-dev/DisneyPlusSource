package com.appboy.p030r.p031o;

import com.appboy.p025o.C1494c;
import com.appboy.p025o.C1494c.C1495a;
import com.appboy.p025o.C1496d;
import org.json.JSONObject;
import p161f.p162a.C4413c1;
import p161f.p162a.C4546p0;
import p161f.p162a.C4569r3;
import p161f.p162a.C4639z2;

/* renamed from: com.appboy.r.o.f */
public final class C1550f extends C1547c {

    /* renamed from: l0 */
    private final String f5682l0;

    /* renamed from: m0 */
    private final String f5683m0;

    /* renamed from: n0 */
    private final String f5684n0;

    /* renamed from: o0 */
    private final String f5685o0;

    public C1550f(JSONObject jSONObject, C1495a aVar, C4546p0 p0Var, C4639z2 z2Var, C4413c1 c1Var) {
        super(jSONObject, aVar, p0Var, z2Var, c1Var);
        this.f5683m0 = C4569r3.m15869a(jSONObject, aVar.mo6747a(C1494c.TEXT_ANNOUNCEMENT_TITLE));
        this.f5682l0 = jSONObject.getString(aVar.mo6747a(C1494c.TEXT_ANNOUNCEMENT_DESCRIPTION));
        this.f5684n0 = C4569r3.m15869a(jSONObject, aVar.mo6747a(C1494c.TEXT_ANNOUNCEMENT_URL));
        this.f5685o0 = C4569r3.m15869a(jSONObject, aVar.mo6747a(C1494c.TEXT_ANNOUNCEMENT_DOMAIN));
    }

    /* renamed from: I */
    public C1496d mo6855I() {
        return C1496d.TEXT_ANNOUNCEMENT;
    }

    /* renamed from: O */
    public String mo6856O() {
        return this.f5684n0;
    }

    /* renamed from: S */
    public String mo6888S() {
        return this.f5682l0;
    }

    /* renamed from: T */
    public String mo6889T() {
        return this.f5685o0;
    }

    /* renamed from: U */
    public String mo6890U() {
        return this.f5683m0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TextAnnouncementCard{");
        sb.append(super.toString());
        sb.append(", mDescription='");
        sb.append(this.f5682l0);
        sb.append('\'');
        sb.append(", mTitle='");
        sb.append(this.f5683m0);
        sb.append('\'');
        sb.append(", mUrl='");
        sb.append(this.f5684n0);
        sb.append('\'');
        sb.append(", mDomain='");
        sb.append(this.f5685o0);
        sb.append('\'');
        sb.append("}");
        return sb.toString();
    }
}
