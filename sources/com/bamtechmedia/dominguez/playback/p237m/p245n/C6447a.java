package com.bamtechmedia.dominguez.playback.p237m.p245n;

/* renamed from: com.bamtechmedia.dominguez.playback.m.n.a */
/* compiled from: PlaybackErrorMapper.kt */
public final class C6447a {

    /* renamed from: a */
    private final String f14630a;

    /* renamed from: b */
    private final String f14631b;

    /* renamed from: c */
    private final String f14632c;

    /* renamed from: d */
    private final Throwable f14633d;

    public C6447a(String str, String str2, String str3, Throwable th) {
        this.f14630a = str;
        this.f14631b = str2;
        this.f14632c = str3;
        this.f14633d = th;
    }

    /* renamed from: a */
    public final String mo19096a() {
        return this.f14632c;
    }

    /* renamed from: b */
    public final String mo19097b() {
        return this.f14631b;
    }

    /* renamed from: c */
    public final String mo19098c() {
        return this.f14630a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f14633d, (java.lang.Object) r3.f14633d) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.playback.p237m.p245n.C6447a
            if (r0 == 0) goto L_0x0031
            com.bamtechmedia.dominguez.playback.m.n.a r3 = (com.bamtechmedia.dominguez.playback.p237m.p245n.C6447a) r3
            java.lang.String r0 = r2.f14630a
            java.lang.String r1 = r3.f14630a
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.f14631b
            java.lang.String r1 = r3.f14631b
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.f14632c
            java.lang.String r1 = r3.f14632c
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.Throwable r0 = r2.f14633d
            java.lang.Throwable r3 = r3.f14633d
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            return r3
        L_0x0033:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.playback.p237m.p245n.C6447a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.f14630a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f14631b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f14632c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Throwable th = this.f14633d;
        if (th != null) {
            i = th.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlaybackError(errorTitleText=");
        sb.append(this.f14630a);
        sb.append(", errorMessageText=");
        sb.append(this.f14631b);
        sb.append(", errorButtonText=");
        sb.append(this.f14632c);
        sb.append(", throwable=");
        sb.append(this.f14633d);
        sb.append(")");
        return sb.toString();
    }
}
