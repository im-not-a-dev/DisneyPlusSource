package com.bamnet.iap.p035c.p037d;

/* renamed from: com.bamnet.iap.c.d.e */
/* compiled from: IabResult */
public class C1671e {

    /* renamed from: a */
    int f5826a;

    /* renamed from: b */
    String f5827b;

    public C1671e(int i, String str) {
        this.f5826a = i;
        if (str == null || str.trim().length() == 0) {
            this.f5827b = C1662d.m7669a(i);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" (response: ");
        sb.append(C1662d.m7669a(i));
        sb.append(")");
        this.f5827b = sb.toString();
    }

    /* renamed from: a */
    public String mo7322a() {
        return this.f5827b;
    }

    /* renamed from: b */
    public int mo7323b() {
        return this.f5826a;
    }

    /* renamed from: c */
    public boolean mo7324c() {
        return this.f5826a == 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IabResult: ");
        sb.append(mo7322a());
        return sb.toString();
    }
}
