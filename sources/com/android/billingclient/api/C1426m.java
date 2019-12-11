package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.android.billingclient.api.m */
/* compiled from: Purchase */
public class C1426m {

    /* renamed from: a */
    private final String f5194a;

    /* renamed from: b */
    private final String f5195b;

    /* renamed from: c */
    private final JSONObject f5196c = new JSONObject(this.f5194a);

    /* renamed from: com.android.billingclient.api.m$a */
    /* compiled from: Purchase */
    public static class C1427a {

        /* renamed from: a */
        private List<C1426m> f5197a;

        /* renamed from: b */
        private C1417h f5198b;

        public C1427a(C1417h hVar, List<C1426m> list) {
            this.f5197a = list;
            this.f5198b = hVar;
        }

        /* renamed from: a */
        public C1417h mo6524a() {
            return this.f5198b;
        }

        /* renamed from: b */
        public List<C1426m> mo6525b() {
            return this.f5197a;
        }

        /* renamed from: c */
        public int mo6526c() {
            return mo6524a().mo6504b();
        }
    }

    public C1426m(String str, String str2) throws JSONException {
        this.f5194a = str;
        this.f5195b = str2;
    }

    /* renamed from: a */
    public String mo6512a() {
        return this.f5196c.optString("developerPayload");
    }

    /* renamed from: b */
    public String mo6513b() {
        return this.f5194a;
    }

    /* renamed from: c */
    public String mo6514c() {
        return this.f5196c.optString("packageName");
    }

    /* renamed from: d */
    public int mo6515d() {
        return this.f5196c.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    /* renamed from: e */
    public long mo6516e() {
        return this.f5196c.optLong("purchaseTime");
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1426m)) {
            return false;
        }
        C1426m mVar = (C1426m) obj;
        if (!TextUtils.equals(this.f5194a, mVar.mo6513b()) || !TextUtils.equals(this.f5195b, mVar.mo6519g())) {
            z = false;
        }
        return z;
    }

    /* renamed from: f */
    public String mo6518f() {
        JSONObject jSONObject = this.f5196c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    /* renamed from: g */
    public String mo6519g() {
        return this.f5195b;
    }

    /* renamed from: h */
    public String mo6520h() {
        return this.f5196c.optString("productId");
    }

    public int hashCode() {
        return this.f5194a.hashCode();
    }

    /* renamed from: i */
    public boolean mo6522i() {
        return this.f5196c.optBoolean("acknowledged", true);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Purchase. Json: ");
        sb.append(this.f5194a);
        return sb.toString();
    }
}
