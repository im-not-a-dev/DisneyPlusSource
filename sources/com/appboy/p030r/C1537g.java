package com.appboy.p030r;

import com.appboy.p033s.C1557c;
import com.appboy.p033s.C1563i;
import org.json.JSONException;
import org.json.JSONObject;
import p161f.p162a.C4432e1;
import p161f.p162a.C4548p1;
import p161f.p162a.C4595u0;

/* renamed from: com.appboy.r.g */
public class C1537g extends C1536f {

    /* renamed from: z0 */
    private boolean f5624z0 = false;

    public C1537g(JSONObject jSONObject, C4595u0 u0Var) {
        super(jSONObject, u0Var);
    }

    /* renamed from: z */
    public boolean mo6827z() {
        if (this.f5624z0) {
            C1557c.m7469c(C1536f.f5592y0, "Control impression already logged for this in-app message. Ignoring.");
            return false;
        } else if (C1563i.m7491e(this.f5603d0)) {
            C1557c.m7473e(C1536f.f5592y0, "Trigger Id not found. Not logging in-app message control impression.");
            return false;
        } else if (this.f5613n0 == null) {
            C1557c.m7465b(C1536f.f5592y0, "Cannot log an in-app message control impression because the AppboyManager is null.");
            return false;
        } else {
            try {
                C1557c.m7471d(C1536f.f5592y0, "Logging control in-app message impression event");
                this.f5613n0.mo15772a((C4432e1) C4548p1.m15767a(this.f5600b0, this.f5602c0, this.f5603d0));
                this.f5624z0 = true;
                return true;
            } catch (JSONException e) {
                this.f5613n0.mo15776b((Throwable) e);
                return false;
            }
        }
    }
}
