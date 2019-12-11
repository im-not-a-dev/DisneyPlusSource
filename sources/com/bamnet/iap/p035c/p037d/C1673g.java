package com.bamnet.iap.p035c.p037d;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bamnet.iap.c.d.g */
/* compiled from: Purchase */
public class C1673g {

    /* renamed from: a */
    String f5830a;

    /* renamed from: b */
    String f5831b;

    /* renamed from: c */
    String f5832c;

    /* renamed from: d */
    String f5833d;

    /* renamed from: e */
    String f5834e;

    /* renamed from: f */
    String f5835f;

    /* renamed from: g */
    String f5836g;

    public C1673g(String str, String str2, String str3) throws JSONException {
        this.f5830a = str;
        this.f5835f = str2;
        JSONObject jSONObject = new JSONObject(this.f5835f);
        jSONObject.optString("orderId");
        this.f5831b = jSONObject.optString("packageName");
        this.f5832c = jSONObject.optString("productId");
        jSONObject.optLong("purchaseTime");
        jSONObject.optInt("purchaseState");
        this.f5833d = jSONObject.optString("developerPayload");
        this.f5834e = jSONObject.optString("token", jSONObject.optString("purchaseToken"));
        this.f5836g = str3;
    }

    /* renamed from: a */
    public String mo7331a() {
        return this.f5833d;
    }

    /* renamed from: b */
    public String mo7332b() {
        return this.f5830a;
    }

    /* renamed from: c */
    public String mo7333c() {
        return this.f5835f;
    }

    /* renamed from: d */
    public String mo7334d() {
        return this.f5831b;
    }

    /* renamed from: e */
    public String mo7335e() {
        return this.f5836g;
    }

    /* renamed from: f */
    public String mo7336f() {
        return this.f5832c;
    }

    /* renamed from: g */
    public String mo7337g() {
        return this.f5834e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PurchaseInfo(type:");
        sb.append(this.f5830a);
        sb.append("):");
        sb.append(this.f5835f);
        return sb.toString();
    }
}
