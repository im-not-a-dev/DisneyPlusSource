package com.bamnet.iap.p035c.p037d;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bamnet.iap.c.d.i */
/* compiled from: SkuDetails */
public class C1675i {

    /* renamed from: a */
    String f5837a;

    /* renamed from: b */
    String f5838b;

    /* renamed from: c */
    String f5839c;

    /* renamed from: d */
    String f5840d;

    /* renamed from: e */
    String f5841e;

    /* renamed from: f */
    String f5842f;

    /* renamed from: g */
    String f5843g;

    /* renamed from: h */
    String f5844h;

    /* renamed from: i */
    Long f5845i;

    /* renamed from: j */
    String f5846j;

    public C1675i(String str, String str2) throws JSONException {
        this.f5846j = str2;
        JSONObject jSONObject = new JSONObject(this.f5846j);
        this.f5837a = jSONObject.optString("productId");
        this.f5838b = jSONObject.optString("type");
        this.f5839c = jSONObject.optString("price");
        this.f5840d = jSONObject.optString("title");
        this.f5841e = jSONObject.optString("description");
        this.f5845i = Long.valueOf(jSONObject.optLong("price_amount_micros"));
        this.f5844h = jSONObject.optString("price_currency_code");
        this.f5842f = jSONObject.optString("subscriptionPeriod");
        this.f5843g = jSONObject.optString("freeTrialPeriod");
    }

    /* renamed from: a */
    public String mo7339a() {
        return this.f5841e;
    }

    /* renamed from: b */
    public String mo7340b() {
        return this.f5843g;
    }

    /* renamed from: c */
    public String mo7341c() {
        return this.f5839c;
    }

    /* renamed from: d */
    public Long mo7342d() {
        return this.f5845i;
    }

    /* renamed from: e */
    public String mo7343e() {
        return this.f5844h;
    }

    /* renamed from: f */
    public String mo7344f() {
        return this.f5837a;
    }

    /* renamed from: g */
    public String mo7345g() {
        return this.f5842f;
    }

    /* renamed from: h */
    public String mo7346h() {
        return this.f5840d;
    }

    /* renamed from: i */
    public String mo7347i() {
        return this.f5838b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SkuDetails:");
        sb.append(this.f5846j);
        return sb.toString();
    }
}
