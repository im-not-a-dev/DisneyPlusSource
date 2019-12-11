package p163g.p164a.p165a;

import org.json.JSONObject;

/* renamed from: g.a.a.n0 */
/* compiled from: MessageTemplatePii */
final class C4714n0 extends C4712m0 {
    C4714n0() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo16048a(JSONObject jSONObject) {
        if (!super.mo16048a(jSONObject)) {
            return false;
        }
        if (this.f11715s.length() > 0 && this.f11715s.toLowerCase().trim().startsWith("https")) {
            return true;
        }
        C4783y0.m16630a("Data Callback - Unable to create data callback %s, templateurl is empty or does not use https for request", this.f11815a);
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C4660c1 mo16050k() {
        return C4766t0.m16544o();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public String mo16034l() {
        return "PII";
    }
}
