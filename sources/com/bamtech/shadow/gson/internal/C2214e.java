package com.bamtech.shadow.gson.internal;

import java.math.BigDecimal;

/* renamed from: com.bamtech.shadow.gson.internal.e */
/* compiled from: LazilyParsedNumber */
public final class C2214e extends Number {

    /* renamed from: c */
    private final String f6303c;

    public C2214e(String str) {
        this.f6303c = str;
    }

    public double doubleValue() {
        return Double.parseDouble(this.f6303c);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2214e)) {
            return false;
        }
        C2214e eVar = (C2214e) obj;
        String str = this.f6303c;
        String str2 = eVar.f6303c;
        if (str != str2 && !str.equals(str2)) {
            z = false;
        }
        return z;
    }

    public float floatValue() {
        return Float.parseFloat(this.f6303c);
    }

    public int hashCode() {
        return this.f6303c.hashCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        return (int) java.lang.Long.parseLong(r2.f6303c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        return new java.math.BigDecimal(r2.f6303c).intValue();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int intValue() {
        /*
            r2 = this;
            java.lang.String r0 = r2.f6303c     // Catch:{ NumberFormatException -> 0x0007 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0007 }
            return r0
        L_0x0007:
            java.lang.String r0 = r2.f6303c     // Catch:{ NumberFormatException -> 0x000f }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x000f }
            int r1 = (int) r0
            return r1
        L_0x000f:
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r1 = r2.f6303c
            r0.<init>(r1)
            int r0 = r0.intValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.shadow.gson.internal.C2214e.intValue():int");
    }

    public long longValue() {
        try {
            return Long.parseLong(this.f6303c);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f6303c).longValue();
        }
    }

    public String toString() {
        return this.f6303c;
    }
}
