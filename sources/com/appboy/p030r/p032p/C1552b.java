package com.appboy.p030r.p032p;

import com.appboy.p030r.C1535e;
import com.appboy.p033s.C1557c;
import com.appboy.p033s.C1563i;
import com.bamtech.sdk4.internal.configuration.SubjectTokenTypes;
import org.json.JSONException;
import org.json.JSONObject;
import p161f.p162a.C4498l1;

@Deprecated
/* renamed from: com.appboy.r.p.b */
public final class C1552b implements C1535e<JSONObject> {

    /* renamed from: Y */
    private static final String f5688Y = C1557c.m7461a(C1552b.class);

    /* renamed from: U */
    private final String f5689U;

    /* renamed from: V */
    private final boolean f5690V;

    /* renamed from: W */
    private final C4498l1 f5691W;

    /* renamed from: X */
    private final String f5692X;

    /* renamed from: c */
    private final String f5693c;

    public C1552b(String str, String str2, boolean z, C4498l1 l1Var, String str3) {
        if (!C1563i.m7490d(str)) {
            this.f5693c = str;
            this.f5689U = str2;
            this.f5690V = z;
            this.f5691W = l1Var;
            this.f5692X = str3;
            return;
        }
        throw new IllegalArgumentException("Message cannot be null or blank");
    }

    /* renamed from: b */
    public JSONObject m7435b() {
        JSONObject jSONObject = new JSONObject();
        String str = "message";
        try {
            String str2 = this.f5693c;
            C1563i.m7485a(str2);
            jSONObject.put(str, str2);
            jSONObject.put("reply_to", this.f5689U);
            jSONObject.put("is_bug", this.f5690V);
            if (this.f5691W != null) {
                jSONObject.put(SubjectTokenTypes.DEVICE, this.f5691W.mo6750b());
            }
            if (!C1563i.m7491e(this.f5692X)) {
                jSONObject.put("user_id", this.f5692X);
            }
        } catch (JSONException e) {
            C1557c.m7470c(f5688Y, "Caught exception creating feedback Json.", e);
        }
        return jSONObject;
    }
}
