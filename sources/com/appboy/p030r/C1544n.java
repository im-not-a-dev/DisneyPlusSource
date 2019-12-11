package com.appboy.p030r;

import android.graphics.Color;
import android.net.Uri;
import com.appboy.p025o.p026k.C1506a;
import com.appboy.p033s.C1557c;
import com.appboy.p033s.C1563i;
import org.json.JSONException;
import org.json.JSONObject;
import p161f.p162a.C4569r3;

/* renamed from: com.appboy.r.n */
public class C1544n implements C1535e<JSONObject> {

    /* renamed from: U */
    private int f5640U;

    /* renamed from: V */
    private C1506a f5641V;

    /* renamed from: W */
    private Uri f5642W;

    /* renamed from: X */
    private String f5643X;

    /* renamed from: Y */
    private boolean f5644Y;

    /* renamed from: Z */
    private int f5645Z;

    /* renamed from: a0 */
    private int f5646a0;

    /* renamed from: b0 */
    private int f5647b0;

    /* renamed from: c */
    private JSONObject f5648c;

    static {
        C1557c.m7461a(C1544n.class);
    }

    public C1544n() {
        this.f5640U = -1;
        this.f5641V = C1506a.NONE;
        this.f5645Z = Color.parseColor("#1B78CF");
        this.f5646a0 = -1;
        this.f5647b0 = this.f5645Z;
    }

    /* renamed from: D */
    public C1506a mo6846D() {
        return this.f5641V;
    }

    /* renamed from: F */
    public int mo6847F() {
        return this.f5645Z;
    }

    /* renamed from: I */
    public int mo6848I() {
        return this.f5647b0;
    }

    /* renamed from: J */
    public int mo6849J() {
        return this.f5640U;
    }

    /* renamed from: K */
    public boolean mo6850K() {
        return this.f5644Y;
    }

    /* renamed from: L */
    public String mo6851L() {
        return this.f5643X;
    }

    /* renamed from: M */
    public int mo6852M() {
        return this.f5646a0;
    }

    /* renamed from: d */
    public void mo6853d(boolean z) {
    }

    public Uri getUri() {
        return this.f5642W;
    }

    /* renamed from: b */
    public JSONObject m7381b() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", this.f5640U);
            jSONObject.put("click_action", this.f5641V.toString());
            if (this.f5642W != null) {
                jSONObject.put("uri", this.f5642W.toString());
            }
            jSONObject.putOpt("text", this.f5643X);
            jSONObject.put("bg_color", this.f5645Z);
            jSONObject.put("text_color", this.f5646a0);
            jSONObject.put("use_webview", this.f5644Y);
            jSONObject.put("border_color", this.f5647b0);
            return jSONObject;
        } catch (JSONException unused) {
            return this.f5648c;
        }
    }

    public C1544n(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        this(jSONObject2, jSONObject.optInt("id", -1), (C1506a) C4569r3.m15867a(jSONObject, "click_action", C1506a.class, C1506a.NEWS_FEED), jSONObject.optString("uri"), jSONObject.optString("text"), jSONObject.optInt("bg_color"), jSONObject.optInt("text_color"), jSONObject.optBoolean("use_webview", false), jSONObject.optInt("border_color"));
    }

    private C1544n(JSONObject jSONObject, int i, C1506a aVar, String str, String str2, int i2, int i3, boolean z, int i4) {
        this.f5640U = -1;
        this.f5641V = C1506a.NONE;
        this.f5645Z = Color.parseColor("#1B78CF");
        this.f5646a0 = -1;
        this.f5647b0 = this.f5645Z;
        this.f5648c = jSONObject;
        this.f5640U = i;
        this.f5641V = aVar;
        if (this.f5641V == C1506a.URI && !C1563i.m7490d(str)) {
            this.f5642W = Uri.parse(str);
        }
        this.f5643X = str2;
        this.f5645Z = i2;
        this.f5646a0 = i3;
        this.f5644Y = z;
        this.f5647b0 = i4;
    }
}
