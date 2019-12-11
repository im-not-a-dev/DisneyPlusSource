package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.android.billingclient.api.s */
/* compiled from: SkuDetails */
public class C1433s {

    /* renamed from: a */
    private final String f5199a;

    /* renamed from: b */
    private final JSONObject f5200b = new JSONObject(this.f5199a);

    /* renamed from: com.android.billingclient.api.s$a */
    /* compiled from: SkuDetails */
    public static class C1434a {

        /* renamed from: a */
        private List<C1433s> f5201a;

        /* renamed from: b */
        private int f5202b;

        /* renamed from: c */
        private String f5203c;

        public C1434a(int i, String str, List<C1433s> list) {
            this.f5202b = i;
            this.f5203c = str;
            this.f5201a = list;
        }

        /* renamed from: a */
        public String mo6543a() {
            return this.f5203c;
        }

        /* renamed from: b */
        public int mo6544b() {
            return this.f5202b;
        }

        /* renamed from: c */
        public List<C1433s> mo6545c() {
            return this.f5201a;
        }
    }

    public C1433s(String str) throws JSONException {
        this.f5199a = str;
    }

    /* renamed from: a */
    public String mo6527a() {
        return this.f5200b.optString("description");
    }

    /* renamed from: b */
    public String mo6528b() {
        return this.f5200b.optString("freeTrialPeriod");
    }

    /* renamed from: c */
    public String mo6529c() {
        String str = "original_price";
        if (this.f5200b.has(str)) {
            return this.f5200b.optString(str);
        }
        return mo6530d();
    }

    /* renamed from: d */
    public String mo6530d() {
        return this.f5200b.optString("price");
    }

    /* renamed from: e */
    public long mo6531e() {
        return this.f5200b.optLong("price_amount_micros");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1433s.class != obj.getClass()) {
            return false;
        }
        return TextUtils.equals(this.f5199a, ((C1433s) obj).f5199a);
    }

    /* renamed from: f */
    public String mo6533f() {
        return this.f5200b.optString("price_currency_code");
    }

    /* renamed from: g */
    public String mo6534g() {
        return this.f5200b.optString("productId");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public String mo6535h() {
        return this.f5200b.optString("skuDetailsToken");
    }

    public int hashCode() {
        return this.f5199a.hashCode();
    }

    /* renamed from: i */
    public String mo6537i() {
        return this.f5200b.optString("subscriptionPeriod");
    }

    /* renamed from: j */
    public String mo6538j() {
        return this.f5200b.optString("title");
    }

    /* renamed from: k */
    public String mo6539k() {
        return this.f5200b.optString("type");
    }

    /* renamed from: l */
    public boolean mo6540l() {
        return this.f5200b.has("rewardToken");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public String mo6541m() {
        return this.f5200b.optString("rewardToken");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SkuDetails: ");
        sb.append(this.f5199a);
        return sb.toString();
    }
}
