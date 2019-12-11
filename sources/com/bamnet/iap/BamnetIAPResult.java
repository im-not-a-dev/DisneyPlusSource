package com.bamnet.iap;

public class BamnetIAPResult {

    /* renamed from: a */
    int f5735a;

    /* renamed from: b */
    String f5736b;

    public BamnetIAPResult(int i, String str) {
        this.f5735a = i;
        this.f5736b = str;
    }

    /* renamed from: a */
    public String mo7211a() {
        return this.f5736b;
    }

    /* renamed from: b */
    public int mo7212b() {
        return this.f5735a;
    }

    /* renamed from: c */
    public boolean mo7213c() {
        return !mo7214d();
    }

    /* renamed from: d */
    public boolean mo7214d() {
        int i = this.f5735a;
        return i == 0 || 11 == i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IabResult: ");
        sb.append(mo7211a());
        return sb.toString();
    }
}
