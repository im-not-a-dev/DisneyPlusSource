package com.bamtechmedia.dominguez.profiles.p259s1;

/* renamed from: com.bamtechmedia.dominguez.profiles.s1.j */
/* compiled from: AddProfileViewModel.kt */
public final class C6828j {

    /* renamed from: a */
    private final String f15268a;

    /* renamed from: b */
    private final String f15269b;

    /* renamed from: c */
    private final String f15270c;

    public C6828j() {
        this(null, null, null, 7, null);
    }

    public C6828j(String str, String str2, String str3) {
        this.f15268a = str;
        this.f15269b = str2;
        this.f15270c = str3;
    }

    /* renamed from: a */
    public final String mo19592a() {
        return this.f15270c;
    }

    /* renamed from: b */
    public final String mo19593b() {
        return this.f15269b;
    }

    /* renamed from: c */
    public final String mo19594c() {
        return this.f15268a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.f15270c, (java.lang.Object) r3.f15270c) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.bamtechmedia.dominguez.profiles.p259s1.C6828j
            if (r0 == 0) goto L_0x0027
            com.bamtechmedia.dominguez.profiles.s1.j r3 = (com.bamtechmedia.dominguez.profiles.p259s1.C6828j) r3
            java.lang.String r0 = r2.f15268a
            java.lang.String r1 = r3.f15268a
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f15269b
            java.lang.String r1 = r3.f15269b
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f15270c
            java.lang.String r3 = r3.f15270c
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = 0
            return r3
        L_0x0029:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.profiles.p259s1.C6828j.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.f15268a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f15269b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f15270c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProfileError(errorTitleText=");
        sb.append(this.f15268a);
        sb.append(", errorMessageText=");
        sb.append(this.f15269b);
        sb.append(", errorBtnText=");
        sb.append(this.f15270c);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ C6828j(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        this(str, str2, str3);
    }
}
