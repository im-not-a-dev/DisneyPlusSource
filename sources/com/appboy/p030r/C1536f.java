package com.appboy.p030r;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import com.appboy.p025o.p026k.C1506a;
import com.appboy.p025o.p026k.C1507b;
import com.appboy.p025o.p026k.C1508c;
import com.appboy.p025o.p026k.C1510e;
import com.appboy.p025o.p026k.C1513g;
import com.appboy.p025o.p026k.C1515i;
import com.appboy.p033s.C1557c;
import com.appboy.p033s.C1563i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p161f.p162a.C4408b5;
import p161f.p162a.C4432e1;
import p161f.p162a.C4548p1;
import p161f.p162a.C4569r3;
import p161f.p162a.C4595u0;
import p161f.p162a.C4641z4;

/* renamed from: com.appboy.r.f */
public abstract class C1536f implements C1532b {

    /* renamed from: y0 */
    protected static final String f5592y0 = C1557c.m7461a(C1536f.class);

    /* renamed from: U */
    private Map<String, String> f5593U;

    /* renamed from: V */
    private boolean f5594V;

    /* renamed from: W */
    private boolean f5595W;

    /* renamed from: X */
    private C1506a f5596X;

    /* renamed from: Y */
    private Uri f5597Y;

    /* renamed from: Z */
    private C1508c f5598Z;

    /* renamed from: a0 */
    private int f5599a0;

    /* renamed from: b0 */
    String f5600b0;

    /* renamed from: c */
    private String f5601c;

    /* renamed from: c0 */
    String f5602c0;

    /* renamed from: d0 */
    String f5603d0;

    /* renamed from: e0 */
    private String f5604e0;

    /* renamed from: f0 */
    private String f5605f0;

    /* renamed from: g0 */
    private C1513g f5606g0;

    /* renamed from: h0 */
    private Bitmap f5607h0;

    /* renamed from: i0 */
    private boolean f5608i0;

    /* renamed from: j0 */
    protected C1507b f5609j0;

    /* renamed from: k0 */
    protected C1515i f5610k0;

    /* renamed from: l0 */
    protected boolean f5611l0;

    /* renamed from: m0 */
    protected JSONObject f5612m0;

    /* renamed from: n0 */
    protected C4595u0 f5613n0;

    /* renamed from: o0 */
    private int f5614o0;

    /* renamed from: p0 */
    private int f5615p0;

    /* renamed from: q0 */
    private int f5616q0;

    /* renamed from: r0 */
    private int f5617r0;

    /* renamed from: s0 */
    private boolean f5618s0;

    /* renamed from: t0 */
    private boolean f5619t0;

    /* renamed from: u0 */
    private boolean f5620u0;

    /* renamed from: v0 */
    private boolean f5621v0;

    /* renamed from: w0 */
    private String f5622w0;

    /* renamed from: x0 */
    private long f5623x0;

    protected C1536f() {
        this.f5594V = true;
        this.f5595W = true;
        this.f5596X = C1506a.NONE;
        this.f5598Z = C1508c.AUTO_DISMISS;
        this.f5599a0 = 5000;
        this.f5606g0 = C1513g.ANY;
        this.f5608i0 = false;
        this.f5609j0 = C1507b.FIT_CENTER;
        this.f5610k0 = C1515i.CENTER;
        this.f5611l0 = false;
        this.f5614o0 = -1;
        this.f5615p0 = Color.parseColor("#555555");
        this.f5616q0 = -1;
        this.f5617r0 = Color.parseColor("#ff0073d5");
        this.f5618s0 = false;
        this.f5619t0 = false;
        this.f5620u0 = false;
        this.f5621v0 = false;
        this.f5623x0 = -1;
    }

    /* renamed from: A */
    public String mo6795A() {
        return mo6815n();
    }

    /* renamed from: B */
    public C1507b mo6796B() {
        return this.f5609j0;
    }

    /* renamed from: C */
    public int mo6797C() {
        return this.f5615p0;
    }

    /* renamed from: D */
    public C1506a mo6798D() {
        return this.f5596X;
    }

    /* renamed from: E */
    public String mo6799E() {
        return this.f5622w0;
    }

    /* renamed from: F */
    public int mo6800F() {
        return this.f5614o0;
    }

    /* renamed from: a */
    public C1515i mo6832a() {
        return this.f5610k0;
    }

    /* renamed from: c */
    public void mo6807c(boolean z) {
        this.f5594V = z;
    }

    public Map<String, String> getExtras() {
        return this.f5593U;
    }

    public String getIcon() {
        return this.f5604e0;
    }

    public Uri getUri() {
        return this.f5597Y;
    }

    /* renamed from: j */
    public String mo6811j() {
        return this.f5601c;
    }

    /* renamed from: k */
    public boolean mo6812k() {
        return this.f5608i0;
    }

    /* renamed from: l */
    public C1508c mo6813l() {
        return this.f5598Z;
    }

    /* renamed from: m */
    public boolean mo6814m() {
        return this.f5621v0;
    }

    /* renamed from: n */
    public String mo6815n() {
        return this.f5605f0;
    }

    /* renamed from: o */
    public int mo6816o() {
        return this.f5616q0;
    }

    /* renamed from: p */
    public boolean mo6817p() {
        return this.f5611l0;
    }

    /* renamed from: q */
    public Bitmap mo6818q() {
        return this.f5607h0;
    }

    /* renamed from: r */
    public boolean mo6819r() {
        return this.f5595W;
    }

    /* renamed from: s */
    public long mo6820s() {
        return this.f5623x0;
    }

    /* renamed from: t */
    public C1513g mo6821t() {
        return this.f5606g0;
    }

    /* renamed from: u */
    public boolean mo6822u() {
        if (C1563i.m7490d(this.f5600b0) && C1563i.m7490d(this.f5602c0) && C1563i.m7490d(this.f5603d0)) {
            C1557c.m7458a(f5592y0, "Campaign, card, and trigger Ids not found. Not logging in-app message click.");
            return false;
        } else if (this.f5619t0) {
            C1557c.m7469c(f5592y0, "Click already logged for this in-app message. Ignoring.");
            return false;
        } else if (this.f5620u0) {
            C1557c.m7469c(f5592y0, "Display failure already logged for this in-app message. Ignoring.");
            return false;
        } else if (this.f5613n0 == null) {
            C1557c.m7465b(f5592y0, "Cannot log an in-app message click because the AppboyManager is null.");
            return false;
        } else {
            try {
                this.f5613n0.mo15772a((C4432e1) C4548p1.m15784c(this.f5600b0, this.f5602c0, this.f5603d0));
                this.f5619t0 = true;
                return true;
            } catch (JSONException e) {
                this.f5613n0.mo15776b((Throwable) e);
                return false;
            }
        }
    }

    /* renamed from: v */
    public boolean mo6823v() {
        return this.f5594V;
    }

    /* renamed from: w */
    public int mo6824w() {
        return this.f5599a0;
    }

    /* renamed from: x */
    public int mo6825x() {
        return this.f5617r0;
    }

    /* renamed from: y */
    public void mo6826y() {
        if (this.f5619t0 && !C1563i.m7491e(this.f5603d0)) {
            this.f5613n0.mo15767a((C4641z4) new C4408b5(this.f5603d0));
        }
    }

    /* renamed from: z */
    public boolean mo6827z() {
        if (C1563i.m7491e(this.f5600b0) && C1563i.m7491e(this.f5602c0) && C1563i.m7491e(this.f5603d0)) {
            C1557c.m7458a(f5592y0, "Campaign, card, and trigger Ids not found. Not logging in-app message impression.");
            return false;
        } else if (this.f5618s0) {
            C1557c.m7469c(f5592y0, "Impression already logged for this in-app message. Ignoring.");
            return false;
        } else if (this.f5620u0) {
            C1557c.m7469c(f5592y0, "Display failure already logged for this in-app message. Ignoring.");
            return false;
        } else if (this.f5613n0 == null) {
            C1557c.m7465b(f5592y0, "Cannot log an in-app message impression because the AppboyManager is null.");
            return false;
        } else {
            try {
                this.f5613n0.mo15772a((C4432e1) C4548p1.m15780b(this.f5600b0, this.f5602c0, this.f5603d0));
                this.f5618s0 = true;
                return true;
            } catch (JSONException e) {
                this.f5613n0.mo15776b((Throwable) e);
                return false;
            }
        }
    }

    /* renamed from: a */
    public void mo6801a(long j) {
        this.f5623x0 = j;
    }

    /* renamed from: b */
    public void mo6806b(boolean z) {
        this.f5595W = z;
    }

    /* renamed from: a */
    public void mo6833a(int i) {
        String str = " milliseconds.";
        if (i < 999) {
            this.f5599a0 = 5000;
            String str2 = f5592y0;
            StringBuilder sb = new StringBuilder();
            sb.append("Requested in-app message duration ");
            sb.append(i);
            sb.append(" is lower than the minimum of ");
            sb.append(999);
            sb.append(". Defaulting to ");
            sb.append(this.f5599a0);
            sb.append(str);
            C1557c.m7473e(str2, sb.toString());
            return;
        }
        this.f5599a0 = i;
        String str3 = f5592y0;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Set in-app message duration to ");
        sb2.append(this.f5599a0);
        sb2.append(str);
        C1557c.m7458a(str3, sb2.toString());
    }

    /* renamed from: b */
    public void mo6805b(String str) {
        mo6834a(str);
    }

    /* renamed from: b */
    public JSONObject m7320b() {
        JSONObject jSONObject = this.f5612m0;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("message", this.f5601c);
            jSONObject2.put("duration", this.f5599a0);
            jSONObject2.putOpt("campaign_id", this.f5600b0);
            jSONObject2.putOpt("card_id", this.f5602c0);
            jSONObject2.putOpt("trigger_id", this.f5603d0);
            jSONObject2.putOpt("click_action", this.f5596X.toString());
            jSONObject2.putOpt("message_close", this.f5598Z.toString());
            if (this.f5597Y != null) {
                jSONObject2.put("uri", this.f5597Y.toString());
            }
            jSONObject2.put("use_webview", this.f5611l0);
            jSONObject2.put("animate_in", this.f5594V);
            jSONObject2.put("animate_out", this.f5595W);
            jSONObject2.put("bg_color", this.f5614o0);
            jSONObject2.put("text_color", this.f5615p0);
            jSONObject2.put("icon_color", this.f5616q0);
            jSONObject2.put("icon_bg_color", this.f5617r0);
            jSONObject2.putOpt("icon", this.f5604e0);
            jSONObject2.putOpt("image_url", this.f5605f0);
            jSONObject2.putOpt("crop_type", this.f5609j0.toString());
            jSONObject2.putOpt("orientation", this.f5606g0.toString());
            jSONObject2.putOpt("text_align_message", this.f5610k0.toString());
            jSONObject2.putOpt("is_control", Boolean.valueOf(this.f5621v0));
            if (this.f5593U != null) {
                JSONObject jSONObject3 = new JSONObject();
                for (String str : this.f5593U.keySet()) {
                    jSONObject3.put(str, this.f5593U.get(str));
                }
                jSONObject2.put("extras", jSONObject3);
            }
            return jSONObject2;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public void mo6834a(String str) {
        this.f5622w0 = str;
    }

    /* renamed from: a */
    public void mo6802a(Bitmap bitmap) {
        this.f5607h0 = bitmap;
    }

    /* renamed from: a */
    public void mo6803a(boolean z) {
        this.f5608i0 = z;
    }

    /* renamed from: a */
    public boolean mo6804a(C1510e eVar) {
        if (C1563i.m7490d(this.f5600b0) && C1563i.m7490d(this.f5602c0) && C1563i.m7490d(this.f5603d0)) {
            C1557c.m7458a(f5592y0, "Campaign, card, and trigger Ids not found. Not logging in-app message display failure.");
            return false;
        } else if (this.f5620u0) {
            C1557c.m7469c(f5592y0, "Display failure already logged for this in-app message. Ignoring.");
            return false;
        } else if (this.f5619t0) {
            C1557c.m7469c(f5592y0, "Click already logged for this in-app message. Ignoring.");
            return false;
        } else if (this.f5618s0) {
            C1557c.m7469c(f5592y0, "Impression already logged for this in-app message. Ignoring.");
            return false;
        } else if (this.f5613n0 == null) {
            C1557c.m7465b(f5592y0, "Cannot log an in-app message display failure because the AppboyManager is null.");
            return false;
        } else {
            try {
                this.f5613n0.mo15772a((C4432e1) C4548p1.m15768a(this.f5600b0, this.f5602c0, this.f5603d0, eVar));
                this.f5620u0 = true;
                return true;
            } catch (JSONException e) {
                this.f5613n0.mo15776b((Throwable) e);
                return false;
            }
        }
    }

    public C1536f(JSONObject jSONObject, C4595u0 u0Var) {
        JSONObject jSONObject2 = jSONObject;
        JSONObject jSONObject3 = jSONObject;
        C4595u0 u0Var2 = u0Var;
        String optString = jSONObject2.optString("message");
        Map a = C4569r3.m15870a(jSONObject2.optJSONObject("extras"), (Map<String, String>) new HashMap<String,String>());
        boolean optBoolean = jSONObject2.optBoolean("animate_in", true);
        String str = optString;
        JSONObject jSONObject4 = jSONObject2;
        Map map = a;
        boolean z = optBoolean;
        this(str, map, z, jSONObject2.optBoolean("animate_out", true), (C1506a) C4569r3.m15867a(jSONObject2, "click_action", C1506a.class, C1506a.NONE), jSONObject2.optString("uri"), jSONObject2.optInt("bg_color"), jSONObject2.optInt("icon_color"), jSONObject2.optInt("icon_bg_color"), jSONObject2.optInt("text_color"), jSONObject2.optString("icon"), jSONObject2.optString("image_url"), (C1508c) C4569r3.m15867a(jSONObject2, "message_close", C1508c.class, C1508c.AUTO_DISMISS), jSONObject2.optInt("duration"), jSONObject2.optString("campaign_id"), jSONObject4.optString("card_id"), jSONObject4.optString("trigger_id"), false, false, (C1513g) C4569r3.m15867a(jSONObject4, "orientation", C1513g.class, C1513g.ANY), jSONObject4.optBoolean("use_webview", false), jSONObject4.optBoolean("is_control"), jSONObject3, u0Var2);
    }

    private C1536f(String str, Map<String, String> map, boolean z, boolean z2, C1506a aVar, String str2, int i, int i2, int i3, int i4, String str3, String str4, C1508c cVar, int i5, String str5, String str6, String str7, boolean z3, boolean z4, C1513g gVar, boolean z5, boolean z6, JSONObject jSONObject, C4595u0 u0Var) {
        C1508c cVar2 = cVar;
        this.f5594V = true;
        this.f5595W = true;
        this.f5596X = C1506a.NONE;
        this.f5598Z = C1508c.AUTO_DISMISS;
        this.f5599a0 = 5000;
        this.f5606g0 = C1513g.ANY;
        this.f5608i0 = false;
        this.f5609j0 = C1507b.FIT_CENTER;
        this.f5610k0 = C1515i.CENTER;
        this.f5611l0 = false;
        this.f5614o0 = -1;
        this.f5615p0 = Color.parseColor("#555555");
        this.f5616q0 = -1;
        this.f5617r0 = Color.parseColor("#ff0073d5");
        this.f5618s0 = false;
        this.f5619t0 = false;
        this.f5620u0 = false;
        this.f5621v0 = false;
        this.f5623x0 = -1;
        this.f5601c = str;
        this.f5593U = map;
        this.f5594V = z;
        this.f5595W = z2;
        this.f5596X = aVar;
        if (this.f5596X == C1506a.URI && !C1563i.m7490d(str2)) {
            this.f5597Y = Uri.parse(str2);
        }
        if (cVar2 == C1508c.SWIPE) {
            this.f5598Z = C1508c.MANUAL;
        } else {
            this.f5598Z = cVar2;
        }
        mo6833a(i5);
        this.f5614o0 = i;
        this.f5616q0 = i2;
        this.f5617r0 = i3;
        this.f5615p0 = i4;
        this.f5604e0 = str3;
        this.f5605f0 = str4;
        this.f5606g0 = gVar;
        this.f5600b0 = str5;
        this.f5602c0 = str6;
        this.f5603d0 = str7;
        this.f5618s0 = z3;
        this.f5619t0 = z4;
        this.f5611l0 = z5;
        this.f5621v0 = z6;
        this.f5612m0 = jSONObject;
        this.f5613n0 = u0Var;
    }
}
