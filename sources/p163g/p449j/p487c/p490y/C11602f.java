package p163g.p449j.p487c.p490y;

import java.math.BigDecimal;

/* renamed from: g.j.c.y.f */
/* compiled from: LazilyParsedNumber */
public final class C11602f extends Number {

    /* renamed from: c */
    private final String f27061c;

    public C11602f(String str) {
        this.f27061c = str;
    }

    public double doubleValue() {
        return Double.parseDouble(this.f27061c);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11602f)) {
            return false;
        }
        C11602f fVar = (C11602f) obj;
        String str = this.f27061c;
        String str2 = fVar.f27061c;
        if (str != str2 && !str.equals(str2)) {
            z = false;
        }
        return z;
    }

    public float floatValue() {
        return Float.parseFloat(this.f27061c);
    }

    public int hashCode() {
        return this.f27061c.hashCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        return (int) java.lang.Long.parseLong(r2.f27061c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        return new java.math.BigDecimal(r2.f27061c).intValue();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int intValue() {
        /*
            r2 = this;
            java.lang.String r0 = r2.f27061c     // Catch:{ NumberFormatException -> 0x0007 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0007 }
            return r0
        L_0x0007:
            java.lang.String r0 = r2.f27061c     // Catch:{ NumberFormatException -> 0x000f }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x000f }
            int r1 = (int) r0
            return r1
        L_0x000f:
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r1 = r2.f27061c
            r0.<init>(r1)
            int r0 = r0.intValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p449j.p487c.p490y.C11602f.intValue():int");
    }

    public long longValue() {
        try {
            return Long.parseLong(this.f27061c);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f27061c).longValue();
        }
    }

    public String toString() {
        return this.f27061c;
    }
}
