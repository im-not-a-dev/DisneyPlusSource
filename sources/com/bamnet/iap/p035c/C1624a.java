package com.bamnet.iap.p035c;

import com.bamnet.iap.BamnetIAPPurchase;
import com.bamnet.iap.Market.MarketType;
import com.bamnet.iap.p035c.p037d.C1659a;
import org.json.JSONObject;
import p686n.p687a.C14100a;

/* renamed from: com.bamnet.iap.c.a */
/* compiled from: GoogleIAPPurchase */
public class C1624a extends BamnetIAPPurchase {

    /* renamed from: X */
    private String f5740X;

    /* renamed from: Y */
    private String f5741Y;

    /* renamed from: Z */
    private String f5742Z;

    /* renamed from: a0 */
    private boolean f5743a0;

    public C1624a() {
        super(MarketType.GOOGLE);
    }

    /* renamed from: a */
    public void mo7234a(int i) {
    }

    /* renamed from: a */
    public void mo7235a(long j) {
    }

    /* renamed from: a */
    public void mo7236a(boolean z) {
        this.f5743a0 = z;
    }

    /* renamed from: c */
    public void mo7237c(String str) {
    }

    /* renamed from: d */
    public void mo7238d(String str) {
        this.f5742Z = str;
    }

    /* renamed from: e */
    public void mo7239e(String str) {
        this.f5740X = str;
    }

    /* renamed from: f */
    public void mo7241f(String str) {
        this.f5741Y = str;
    }

    /* renamed from: g */
    public String mo7242g() {
        return this.f5740X;
    }

    /* renamed from: h */
    public String mo7243h() {
        return this.f5741Y;
    }

    /* renamed from: i */
    public boolean mo7244i() {
        return this.f5743a0;
    }

    /* renamed from: d */
    public JSONObject mo7209d() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("packageName", mo7240f());
                jSONObject2.put("productId", mo7210e());
                jSONObject2.put("signature", C1659a.m7661a(mo7242g().getBytes()));
                jSONObject2.put("purchaseToken", mo7243h());
                try {
                    jSONObject2.put("originalJson", C1659a.m7661a(mo7208c().getBytes()));
                    return jSONObject2;
                } catch (Exception e) {
                    C14100a.m44528b(e, "unable to parse original data into json", new Object[0]);
                    return jSONObject2;
                }
            } catch (Exception unused) {
                return jSONObject2;
            }
        } catch (Exception unused2) {
            return jSONObject;
        }
    }

    /* renamed from: f */
    public String mo7240f() {
        return this.f5742Z;
    }
}
