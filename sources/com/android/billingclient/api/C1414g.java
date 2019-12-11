package com.android.billingclient.api;

/* renamed from: com.android.billingclient.api.g */
/* compiled from: BillingFlowParams */
public class C1414g {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C1433s f5158a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f5159b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f5160c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f5161d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f5162e = 0;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f5163f;

    /* renamed from: com.android.billingclient.api.g$b */
    /* compiled from: BillingFlowParams */
    public static class C1416b {

        /* renamed from: a */
        private C1433s f5164a;

        /* renamed from: b */
        private String f5165b;

        /* renamed from: c */
        private String f5166c;

        /* renamed from: d */
        private boolean f5167d;

        /* renamed from: e */
        private int f5168e;

        /* renamed from: f */
        private String f5169f;

        /* renamed from: a */
        public C1416b mo6501a(C1433s sVar) {
            this.f5164a = sVar;
            return this;
        }

        private C1416b() {
            this.f5168e = 0;
        }

        /* renamed from: a */
        public C1414g mo6502a() {
            C1414g gVar = new C1414g();
            gVar.f5158a = this.f5164a;
            gVar.f5159b = this.f5165b;
            gVar.f5160c = this.f5166c;
            gVar.f5161d = this.f5167d;
            gVar.f5162e = this.f5168e;
            gVar.f5163f = this.f5169f;
            return gVar;
        }
    }

    /* renamed from: j */
    public static C1416b m6836j() {
        return new C1416b();
    }

    /* renamed from: d */
    public int mo6495d() {
        return this.f5162e;
    }

    /* renamed from: e */
    public String mo6496e() {
        C1433s sVar = this.f5158a;
        if (sVar == null) {
            return null;
        }
        return sVar.mo6534g();
    }

    /* renamed from: f */
    public C1433s mo6497f() {
        return this.f5158a;
    }

    /* renamed from: g */
    public String mo6498g() {
        C1433s sVar = this.f5158a;
        if (sVar == null) {
            return null;
        }
        return sVar.mo6539k();
    }

    /* renamed from: h */
    public boolean mo6499h() {
        return this.f5161d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public boolean mo6500i() {
        return (!this.f5161d && this.f5160c == null && this.f5163f == null && this.f5162e == 0) ? false : true;
    }

    /* renamed from: b */
    public String mo6493b() {
        return this.f5163f;
    }

    /* renamed from: c */
    public String mo6494c() {
        return this.f5159b;
    }

    /* renamed from: a */
    public String mo6492a() {
        return this.f5160c;
    }
}
