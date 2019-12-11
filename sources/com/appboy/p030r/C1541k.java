package com.appboy.p030r;

import android.graphics.Color;
import com.appboy.p025o.p026k.C1509d;
import com.appboy.p025o.p026k.C1515i;
import com.appboy.p033s.C1557c;
import com.appboy.p033s.C1563i;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p161f.p162a.C4408b5;
import p161f.p162a.C4432e1;
import p161f.p162a.C4548p1;
import p161f.p162a.C4569r3;
import p161f.p162a.C4595u0;
import p161f.p162a.C4641z4;

/* renamed from: com.appboy.r.k */
public abstract class C1541k extends C1536f implements C1534d {

    /* renamed from: A0 */
    private int f5629A0;

    /* renamed from: B0 */
    private String f5630B0;

    /* renamed from: C0 */
    private List<C1544n> f5631C0;

    /* renamed from: D0 */
    protected C1509d f5632D0;

    /* renamed from: E0 */
    private Integer f5633E0;

    /* renamed from: F0 */
    private C1515i f5634F0;

    /* renamed from: G0 */
    private boolean f5635G0;

    /* renamed from: H0 */
    private String f5636H0;

    /* renamed from: z0 */
    private int f5637z0;

    protected C1541k() {
        this.f5637z0 = Color.parseColor("#333333");
        this.f5629A0 = Color.parseColor("#9B9B9B");
        this.f5632D0 = C1509d.TOP;
        this.f5633E0 = null;
        this.f5634F0 = C1515i.CENTER;
        this.f5636H0 = null;
    }

    /* renamed from: G */
    public C1509d mo6829G() {
        return this.f5632D0;
    }

    /* renamed from: H */
    public List<C1544n> mo6830H() {
        return this.f5631C0;
    }

    /* renamed from: a */
    public void mo6838a(List<C1544n> list) {
        this.f5631C0 = list;
    }

    /* renamed from: c */
    public int mo6839c() {
        return this.f5629A0;
    }

    /* renamed from: d */
    public Integer mo6840d() {
        return this.f5633E0;
    }

    /* renamed from: e */
    public String mo6841e() {
        return this.f5630B0;
    }

    /* renamed from: f */
    public C1515i mo6842f() {
        return this.f5634F0;
    }

    /* renamed from: g */
    public int mo6843g() {
        return this.f5637z0;
    }

    /* renamed from: y */
    public void mo6826y() {
        super.mo6826y();
        if (this.f5635G0 && !C1563i.m7490d(this.f5603d0) && !C1563i.m7490d(this.f5636H0)) {
            this.f5613n0.mo15767a((C4641z4) new C4408b5(this.f5603d0, this.f5636H0));
        }
    }

    /* renamed from: a */
    public boolean mo6831a(C1544n nVar) {
        if (C1563i.m7490d(this.f5600b0) && C1563i.m7490d(this.f5602c0) && C1563i.m7490d(this.f5603d0)) {
            C1557c.m7458a(C1536f.f5592y0, "Campaign, trigger, and card Ids not found. Not logging button click.");
            return false;
        } else if (nVar == null) {
            C1557c.m7473e(C1536f.f5592y0, "Message button was null. Ignoring button click.");
            return false;
        } else if (this.f5635G0) {
            C1557c.m7469c(C1536f.f5592y0, "Button click already logged for this message. Ignoring.");
            return false;
        } else if (this.f5613n0 == null) {
            C1557c.m7465b(C1536f.f5592y0, "Cannot log a button click because the AppboyManager is null.");
            return false;
        } else {
            try {
                C4548p1 a = C4548p1.m15769a(this.f5600b0, this.f5602c0, this.f5603d0, nVar);
                this.f5636H0 = C4548p1.m15774a(nVar);
                this.f5613n0.mo15772a((C4432e1) a);
                this.f5635G0 = true;
                return true;
            } catch (JSONException e) {
                this.f5613n0.mo15776b((Throwable) e);
                return false;
            }
        }
    }

    /* renamed from: b */
    public JSONObject m7360b() {
        JSONObject jSONObject = this.f5612m0;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            JSONObject b = super.mo6750b();
            b.putOpt("header", this.f5630B0);
            b.put("header_text_color", this.f5637z0);
            b.put("close_btn_color", this.f5629A0);
            b.putOpt("image_style", this.f5632D0.toString());
            b.putOpt("text_align_header", this.f5634F0.toString());
            if (this.f5633E0 != null) {
                b.put("frame_color", this.f5633E0.intValue());
            }
            if (this.f5631C0 != null) {
                JSONArray jSONArray = new JSONArray();
                for (C1544n b2 : this.f5631C0) {
                    jSONArray.put(b2.mo6750b());
                }
                b.put("btns", jSONArray);
            }
            return b;
        } catch (JSONException unused) {
            return null;
        }
    }

    public C1541k(JSONObject jSONObject, C4595u0 u0Var) {
        JSONObject jSONObject2 = jSONObject;
        C4595u0 u0Var2 = u0Var;
        this(jSONObject2, u0Var2, jSONObject.optString("header"), jSONObject.optInt("header_text_color"), jSONObject.optInt("close_btn_color"), (C1509d) C4569r3.m15867a(jSONObject, "image_style", C1509d.class, C1509d.TOP), (C1515i) C4569r3.m15867a(jSONObject, "text_align_header", C1515i.class, C1515i.CENTER), (C1515i) C4569r3.m15867a(jSONObject, "text_align_message", C1515i.class, C1515i.CENTER));
        String str = "btns";
        if (jSONObject.optJSONArray(str) != null) {
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray(str);
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(new C1544n(optJSONArray.optJSONObject(i)));
            }
            mo6838a((List<C1544n>) arrayList);
        }
        List<C1544n> list = this.f5631C0;
        if (list != null && list.size() == 2) {
            ((C1544n) this.f5631C0.get(0)).mo6853d(true);
            ((C1544n) this.f5631C0.get(1)).mo6853d(false);
        }
    }

    private C1541k(JSONObject jSONObject, C4595u0 u0Var, String str, int i, int i2, C1509d dVar, C1515i iVar, C1515i iVar2) {
        super(jSONObject, u0Var);
        this.f5637z0 = Color.parseColor("#333333");
        this.f5629A0 = Color.parseColor("#9B9B9B");
        this.f5632D0 = C1509d.TOP;
        this.f5633E0 = null;
        this.f5634F0 = C1515i.CENTER;
        this.f5636H0 = null;
        this.f5630B0 = str;
        this.f5637z0 = i;
        this.f5629A0 = i2;
        String str2 = "frame_color";
        if (jSONObject.has(str2)) {
            this.f5633E0 = Integer.valueOf(jSONObject.optInt(str2));
        }
        this.f5632D0 = dVar;
        this.f5634F0 = iVar;
        this.f5610k0 = iVar2;
    }
}
