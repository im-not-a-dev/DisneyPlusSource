package com.bamnet.iap;

import androidx.annotation.Keep;

public class BamnetIAPProduct {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public BamnetIAPProductType f5719a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f5720b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f5721c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public String f5722d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String f5723e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f5724f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Long f5725g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f5726h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public String f5727i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public String f5728j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public String f5729k;

    @Keep
    public enum BamnetIAPProductType {
        ENTITLED,
        SUBSCRIPTION,
        UNKNOWN
    }

    /* renamed from: com.bamnet.iap.BamnetIAPProduct$a */
    public static class C1620a {

        /* renamed from: a */
        private BamnetIAPProduct f5730a = new BamnetIAPProduct();

        public C1620a(String str) {
            this.f5730a.f5724f = str;
        }

        /* renamed from: a */
        public C1620a mo7194a(String str) {
            this.f5730a.f5723e = str;
            return this;
        }

        /* renamed from: b */
        public C1620a mo7196b(String str) {
            this.f5730a.f5728j = str;
            return this;
        }

        /* renamed from: c */
        public C1620a mo7197c(String str) {
            this.f5730a.f5720b = str;
            return this;
        }

        /* renamed from: d */
        public C1620a mo7198d(String str) {
            this.f5730a.f5721c = str;
            return this;
        }

        /* renamed from: e */
        public C1620a mo7199e(String str) {
            this.f5730a.f5729k = str;
            return this;
        }

        /* renamed from: f */
        public C1620a mo7200f(String str) {
            this.f5730a.f5726h = str;
            return this;
        }

        /* renamed from: g */
        public C1620a mo7201g(String str) {
            this.f5730a.f5727i = str;
            return this;
        }

        /* renamed from: h */
        public C1620a mo7202h(String str) {
            this.f5730a.f5722d = str;
            return this;
        }

        /* renamed from: a */
        public C1620a mo7192a(BamnetIAPProductType bamnetIAPProductType) {
            this.f5730a.f5719a = bamnetIAPProductType;
            return this;
        }

        /* renamed from: a */
        public C1620a mo7193a(Long l) {
            this.f5730a.f5725g = l;
            return this;
        }

        /* renamed from: a */
        public BamnetIAPProduct mo7195a() {
            BamnetIAPProduct bamnetIAPProduct = this.f5730a;
            this.f5730a = null;
            return bamnetIAPProduct;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("sku:");
        sb.append(mo7188f());
        sb.append(",description:");
        sb.append(mo7183a());
        sb.append(",title:");
        sb.append(mo7189g());
        return sb.toString();
    }

    /* renamed from: b */
    public String mo7184b() {
        return this.f5728j;
    }

    /* renamed from: c */
    public String mo7185c() {
        return this.f5721c;
    }

    /* renamed from: d */
    public Long mo7186d() {
        return this.f5725g;
    }

    /* renamed from: e */
    public String mo7187e() {
        return this.f5726h;
    }

    /* renamed from: f */
    public String mo7188f() {
        return this.f5724f;
    }

    /* renamed from: g */
    public String mo7189g() {
        return this.f5722d;
    }

    /* renamed from: h */
    public BamnetIAPProductType mo7190h() {
        return this.f5719a;
    }

    /* renamed from: a */
    public String mo7183a() {
        return this.f5723e;
    }
}
