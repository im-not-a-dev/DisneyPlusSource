package com.bamnet.iap.p035c.p036c;

/* renamed from: com.bamnet.iap.c.c.f */
/* compiled from: GoogleProductException.kt */
public final class C1646f extends Exception {

    /* renamed from: U */
    private final String f5775U;

    /* renamed from: c */
    private final int f5776c;

    public C1646f(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("SKU Type: ");
        sb.append(str);
        sb.append("; Response Code: ");
        sb.append(i);
        sb.append("; Debug Message: ");
        sb.append(str2);
        super(sb.toString());
        this.f5776c = i;
        this.f5775U = str2;
    }

    /* renamed from: a */
    public final String mo7281a() {
        return this.f5775U;
    }

    /* renamed from: b */
    public final int mo7282b() {
        return this.f5776c;
    }
}
