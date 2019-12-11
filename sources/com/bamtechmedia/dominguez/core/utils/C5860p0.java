package com.bamtechmedia.dominguez.core.utils;

/* renamed from: com.bamtechmedia.dominguez.core.utils.p0 */
/* compiled from: WidevineUtils.kt */
public final class C5860p0 {

    /* renamed from: a */
    private final String f13643a;

    /* renamed from: b */
    private final String f13644b;

    /* renamed from: c */
    private final String f13645c;

    /* renamed from: d */
    private final String f13646d;

    public C5860p0(String str, String str2, String str3, String str4) {
        this.f13643a = str;
        this.f13644b = str2;
        this.f13645c = str3;
        this.f13646d = str4;
    }

    /* renamed from: a */
    public final String mo17761a() {
        return this.f13644b;
    }

    /* renamed from: b */
    public final String mo17762b() {
        return this.f13643a;
    }

    /* renamed from: c */
    public final String mo17763c() {
        return this.f13646d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.f13646d, (java.lang.Object) r3.f13646d) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.core.utils.C5860p0
            if (r0 == 0) goto L_0x0031
            com.bamtechmedia.dominguez.core.utils.p0 r3 = (com.bamtechmedia.dominguez.core.utils.C5860p0) r3
            java.lang.String r0 = r2.f13643a
            java.lang.String r1 = r3.f13643a
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.f13644b
            java.lang.String r1 = r3.f13644b
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.f13645c
            java.lang.String r1 = r3.f13645c
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.f13646d
            java.lang.String r3 = r3.f13646d
            boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            return r3
        L_0x0033:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.core.utils.C5860p0.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.f13643a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f13644b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f13645c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f13646d;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n        Security level ");
        sb.append(this.f13643a);
        sb.append("\n        Max HDCP leve: ");
        sb.append(this.f13644b);
        sb.append("\n        Device ID: ");
        sb.append(this.f13645c);
        sb.append("\n        System ID: ");
        sb.append(this.f13646d);
        sb.append("\n        ");
        return C12823p.m40101c(sb.toString());
    }
}
