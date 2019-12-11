package com.appboy.p030r;

import com.appboy.p033s.C1557c;
import com.appboy.p033s.C1563i;
import org.json.JSONException;
import org.json.JSONObject;
import p161f.p162a.C4408b5;
import p161f.p162a.C4432e1;
import p161f.p162a.C4548p1;
import p161f.p162a.C4595u0;
import p161f.p162a.C4641z4;

/* renamed from: com.appboy.r.i */
public abstract class C1539i extends C1536f implements C1533c {

    /* renamed from: A0 */
    private String f5625A0;

    /* renamed from: B0 */
    private boolean f5626B0;

    /* renamed from: C0 */
    private String f5627C0;

    /* renamed from: z0 */
    private String f5628z0;

    protected C1539i() {
        this.f5626B0 = false;
        this.f5627C0 = null;
        this.f5611l0 = true;
    }

    /* renamed from: A */
    public String mo6795A() {
        return mo6835c();
    }

    /* renamed from: c */
    public String mo6835c() {
        return this.f5628z0;
    }

    /* renamed from: d */
    public String mo6836d() {
        return this.f5625A0;
    }

    /* renamed from: y */
    public void mo6826y() {
        super.mo6826y();
        if (this.f5626B0 && !C1563i.m7490d(this.f5603d0) && !C1563i.m7490d(this.f5627C0)) {
            this.f5613n0.mo15767a((C4641z4) new C4408b5(this.f5603d0, this.f5627C0));
        }
    }

    /* renamed from: b */
    public void mo6805b(String str) {
        mo6837d(str);
    }

    /* renamed from: c */
    public boolean mo6828c(String str) {
        if (C1563i.m7491e(this.f5600b0) && C1563i.m7491e(this.f5602c0) && C1563i.m7491e(this.f5603d0)) {
            C1557c.m7458a(C1536f.f5592y0, "Campaign, card, and trigger Ids not found. Not logging html in-app message click.");
            return false;
        } else if (C1563i.m7490d(str)) {
            C1557c.m7469c(C1536f.f5592y0, "Button Id was null or blank for this html in-app message. Ignoring.");
            return false;
        } else if (this.f5626B0) {
            C1557c.m7469c(C1536f.f5592y0, "Button click already logged for this html in-app message. Ignoring.");
            return false;
        } else if (this.f5613n0 == null) {
            C1557c.m7465b(C1536f.f5592y0, "Cannot log an html in-app message button click because the AppboyManager is null.");
            return false;
        } else {
            try {
                this.f5613n0.mo15772a((C4432e1) C4548p1.m15770a(this.f5600b0, this.f5602c0, this.f5603d0, str));
                this.f5627C0 = str;
                this.f5626B0 = true;
                return true;
            } catch (JSONException e) {
                this.f5613n0.mo15776b((Throwable) e);
                return false;
            }
        }
    }

    /* renamed from: d */
    public void mo6837d(String str) {
        this.f5625A0 = str;
    }

    /* renamed from: b */
    public JSONObject m7346b() {
        JSONObject jSONObject = this.f5612m0;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            JSONObject b = super.mo6750b();
            b.putOpt("zipped_assets_url", this.f5628z0);
            return b;
        } catch (JSONException unused) {
            return null;
        }
    }

    public C1539i(JSONObject jSONObject, C4595u0 u0Var) {
        super(jSONObject, u0Var);
        this.f5626B0 = false;
        this.f5627C0 = null;
        String str = "zipped_assets_url";
        if (!C1563i.m7490d(jSONObject.optString(str))) {
            this.f5628z0 = jSONObject.optString(str);
        }
        this.f5611l0 = jSONObject.optBoolean("use_webview", true);
    }
}
