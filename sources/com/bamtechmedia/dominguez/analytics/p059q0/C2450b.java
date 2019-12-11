package com.bamtechmedia.dominguez.analytics.p059q0;

/* renamed from: com.bamtechmedia.dominguez.analytics.q0.b */
/* compiled from: DeepLinkAnalyticsStore.kt */
public final class C2450b {

    /* renamed from: a */
    private final String f6743a;

    /* renamed from: b */
    private final String f6744b;

    public C2450b() {
        this(null, null, 3, null);
    }

    public C2450b(String str, String str2) {
        this.f6743a = str;
        this.f6744b = str2;
    }

    /* renamed from: a */
    public final String mo11578a() {
        return this.f6744b;
    }

    /* renamed from: b */
    public final String mo11579b() {
        return this.f6743a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f6744b, (java.lang.Object) r3.f6744b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.analytics.p059q0.C2450b
            if (r0 == 0) goto L_0x001d
            com.bamtechmedia.dominguez.analytics.q0.b r3 = (com.bamtechmedia.dominguez.analytics.p059q0.C2450b) r3
            java.lang.String r0 = r2.f6743a
            java.lang.String r1 = r3.f6743a
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.f6744b
            java.lang.String r3 = r3.f6744b
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.analytics.p059q0.C2450b.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.f6743a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f6744b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeepLink(url=");
        sb.append(this.f6743a);
        sb.append(", pageName=");
        sb.append(this.f6744b);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ C2450b(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str3 = "";
        if ((i & 1) != 0) {
            str = str3;
        }
        if ((i & 2) != 0) {
            str2 = str3;
        }
        this(str, str2);
    }
}
