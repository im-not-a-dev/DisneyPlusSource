package com.bamtech.core.networking;

/* renamed from: com.bamtech.core.networking.b */
/* compiled from: Link.kt */
public final class C1680b {

    /* renamed from: a */
    private final String f5871a;

    /* renamed from: b */
    private final String f5872b;

    /* renamed from: c */
    private final String f5873c;

    /* renamed from: a */
    public final String mo7487a() {
        return this.f5871a;
    }

    /* renamed from: b */
    public final String mo7488b() {
        return this.f5872b;
    }

    /* renamed from: c */
    public final String mo7489c() {
        return this.f5873c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.f5873c, (java.lang.Object) r3.f5873c) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.bamtech.core.networking.C1680b
            if (r0 == 0) goto L_0x0027
            com.bamtech.core.networking.b r3 = (com.bamtech.core.networking.C1680b) r3
            java.lang.String r0 = r2.f5871a
            java.lang.String r1 = r3.f5871a
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f5872b
            java.lang.String r1 = r3.f5872b
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f5873c
            java.lang.String r3 = r3.f5873c
            boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
            if (r3 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = 0
            return r3
        L_0x0029:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.core.networking.C1680b.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.f5871a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f5872b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f5873c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OptionalHeader(name=");
        sb.append(this.f5871a);
        sb.append(", template=");
        sb.append(this.f5872b);
        sb.append(", value=");
        sb.append(this.f5873c);
        sb.append(")");
        return sb.toString();
    }
}
