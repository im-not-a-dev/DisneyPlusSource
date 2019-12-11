package com.android.billingclient.api;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.android.billingclient.api.t */
/* compiled from: SkuDetailsParams */
public class C1435t {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public String f5204a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public List<String> f5205b;

    /* renamed from: com.android.billingclient.api.t$b */
    /* compiled from: SkuDetailsParams */
    public static class C1437b {

        /* renamed from: a */
        private String f5206a;

        /* renamed from: b */
        private List<String> f5207b;

        /* renamed from: a */
        public C1437b mo6549a(List<String> list) {
            this.f5207b = new ArrayList(list);
            return this;
        }

        private C1437b() {
        }

        /* renamed from: a */
        public C1437b mo6548a(String str) {
            this.f5206a = str;
            return this;
        }

        /* renamed from: a */
        public C1435t mo6550a() {
            C1435t tVar = new C1435t();
            tVar.f5204a = this.f5206a;
            tVar.f5205b = this.f5207b;
            return tVar;
        }
    }

    /* renamed from: c */
    public static C1437b m6896c() {
        return new C1437b();
    }

    /* renamed from: b */
    public List<String> mo6547b() {
        return this.f5205b;
    }

    /* renamed from: a */
    public String mo6546a() {
        return this.f5204a;
    }
}
