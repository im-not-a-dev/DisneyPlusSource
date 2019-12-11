package p163g.p441i.p442a.p443a;

import java.io.Serializable;

/* renamed from: g.i.a.a.g */
/* compiled from: JsonLocation */
public class C10905g implements Serializable {

    /* renamed from: U */
    protected final long f25874U;

    /* renamed from: V */
    protected final int f25875V;

    /* renamed from: W */
    protected final int f25876W;

    /* renamed from: X */
    final transient Object f25877X;

    /* renamed from: c */
    protected final long f25878c;

    static {
        new C10905g(null, -1, -1, -1, -1);
    }

    public C10905g(Object obj, long j, long j2, int i, int i2) {
        this.f25877X = obj;
        this.f25878c = j;
        this.f25874U = j2;
        this.f25875V = i;
        this.f25876W = i2;
    }

    /* renamed from: a */
    public long mo28070a() {
        return this.f25878c;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C10905g)) {
            return false;
        }
        C10905g gVar = (C10905g) obj;
        Object obj2 = this.f25877X;
        if (obj2 == null) {
            if (gVar.f25877X != null) {
                return false;
            }
        } else if (!obj2.equals(gVar.f25877X)) {
            return false;
        }
        if (!(this.f25875V == gVar.f25875V && this.f25876W == gVar.f25876W && this.f25874U == gVar.f25874U && mo28070a() == gVar.mo28070a())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        Object obj = this.f25877X;
        return ((((obj == null ? 1 : obj.hashCode()) ^ this.f25875V) + this.f25876W) ^ ((int) this.f25874U)) + ((int) this.f25878c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(80);
        sb.append("[Source: ");
        mo28071a(sb);
        sb.append("; line: ");
        sb.append(this.f25875V);
        sb.append(", column: ");
        sb.append(this.f25876W);
        sb.append(']');
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0098  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.StringBuilder mo28071a(java.lang.StringBuilder r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f25877X
            if (r0 != 0) goto L_0x000a
            java.lang.String r0 = "UNKNOWN"
            r7.append(r0)
            return r7
        L_0x000a:
            boolean r1 = r0 instanceof java.lang.Class
            if (r1 == 0) goto L_0x0012
            r1 = r0
            java.lang.Class r1 = (java.lang.Class) r1
            goto L_0x0016
        L_0x0012:
            java.lang.Class r1 = r0.getClass()
        L_0x0016:
            java.lang.String r2 = r1.getName()
            java.lang.String r3 = "java."
            boolean r3 = r2.startsWith(r3)
            if (r3 == 0) goto L_0x0027
            java.lang.String r2 = r1.getSimpleName()
            goto L_0x0034
        L_0x0027:
            boolean r1 = r0 instanceof byte[]
            if (r1 == 0) goto L_0x002e
            java.lang.String r2 = "byte[]"
            goto L_0x0034
        L_0x002e:
            boolean r1 = r0 instanceof char[]
            if (r1 == 0) goto L_0x0034
            java.lang.String r2 = "char[]"
        L_0x0034:
            r1 = 40
            r7.append(r1)
            r7.append(r2)
            r1 = 41
            r7.append(r1)
            boolean r1 = r0 instanceof java.lang.CharSequence
            r2 = 500(0x1f4, float:7.0E-43)
            r3 = 0
            java.lang.String r4 = " chars"
            if (r1 == 0) goto L_0x0063
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r1 = r0.length()
            int r2 = java.lang.Math.min(r1, r2)
            java.lang.CharSequence r0 = r0.subSequence(r3, r2)
            java.lang.String r0 = r0.toString()
            int r0 = r6.m34414a(r7, r0)
        L_0x0060:
            int r3 = r1 - r0
            goto L_0x0096
        L_0x0063:
            boolean r1 = r0 instanceof char[]
            if (r1 == 0) goto L_0x0078
            char[] r0 = (char[]) r0
            int r1 = r0.length
            java.lang.String r5 = new java.lang.String
            int r2 = java.lang.Math.min(r1, r2)
            r5.<init>(r0, r3, r2)
            int r0 = r6.m34414a(r7, r5)
            goto L_0x0060
        L_0x0078:
            boolean r1 = r0 instanceof byte[]
            if (r1 == 0) goto L_0x0096
            byte[] r0 = (byte[]) r0
            int r1 = r0.length
            int r1 = java.lang.Math.min(r1, r2)
            java.lang.String r2 = new java.lang.String
            java.lang.String r4 = "UTF-8"
            java.nio.charset.Charset r4 = java.nio.charset.Charset.forName(r4)
            r2.<init>(r0, r3, r1, r4)
            r6.m34414a(r7, r2)
            int r0 = r0.length
            int r3 = r0 - r1
            java.lang.String r4 = " bytes"
        L_0x0096:
            if (r3 <= 0) goto L_0x00a8
            java.lang.String r0 = "[truncated "
            r7.append(r0)
            r7.append(r3)
            r7.append(r4)
            r0 = 93
            r7.append(r0)
        L_0x00a8:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p441i.p442a.p443a.C10905g.mo28071a(java.lang.StringBuilder):java.lang.StringBuilder");
    }

    /* renamed from: a */
    private int m34414a(StringBuilder sb, String str) {
        sb.append('\"');
        sb.append(str);
        sb.append('\"');
        return str.length();
    }
}
