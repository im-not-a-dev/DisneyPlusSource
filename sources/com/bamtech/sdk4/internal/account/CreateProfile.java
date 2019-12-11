package com.bamtech.sdk4.internal.account;

import com.bamtech.core.annotations.android.DontObfuscate;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u0007\u001a\u0004\u0018\u00018\u0001¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u0004\u0018\u00018\u0001HÆ\u0003¢\u0006\u0002\u0010\nJ<\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00018\u0001HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0007\u001a\u0004\u0018\u00018\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/account/CreateProfile;", "T", "U", "", "profileName", "", "attributes", "metadata", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", "getAttributes", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getMetadata", "getProfileName", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)Lcom/bamtech/sdk4/internal/account/CreateProfile;", "equals", "", "other", "hashCode", "", "toString", "extension-account"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: UserProfiles.kt */
public final class CreateProfile<T, U> {
    private final T attributes;
    private final U metadata;
    private final String profileName;

    public CreateProfile(String str, T t, U u) {
        this.profileName = str;
        this.attributes = t;
        this.metadata = u;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Object, code=T, for r2v0, types: [java.lang.Object] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Object, code=U, for r3v0, types: [java.lang.Object] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.bamtech.sdk4.internal.account.CreateProfile copy$default(com.bamtech.sdk4.internal.account.CreateProfile r0, java.lang.String r1, T r2, U r3, int r4, java.lang.Object r5) {
        /*
            r5 = r4 & 1
            if (r5 == 0) goto L_0x0006
            java.lang.String r1 = r0.profileName
        L_0x0006:
            r5 = r4 & 2
            if (r5 == 0) goto L_0x000c
            T r2 = r0.attributes
        L_0x000c:
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0012
            U r3 = r0.metadata
        L_0x0012:
            com.bamtech.sdk4.internal.account.CreateProfile r0 = r0.copy(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.account.CreateProfile.copy$default(com.bamtech.sdk4.internal.account.CreateProfile, java.lang.String, java.lang.Object, java.lang.Object, int, java.lang.Object):com.bamtech.sdk4.internal.account.CreateProfile");
    }

    public final String component1() {
        return this.profileName;
    }

    public final T component2() {
        return this.attributes;
    }

    public final U component3() {
        return this.metadata;
    }

    public final CreateProfile<T, U> copy(String str, T t, U u) {
        return new CreateProfile<>(str, t, u);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.metadata, (java.lang.Object) r3.metadata) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.bamtech.sdk4.internal.account.CreateProfile
            if (r0 == 0) goto L_0x0027
            com.bamtech.sdk4.internal.account.CreateProfile r3 = (com.bamtech.sdk4.internal.account.CreateProfile) r3
            java.lang.String r0 = r2.profileName
            java.lang.String r1 = r3.profileName
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0027
            T r0 = r2.attributes
            T r1 = r3.attributes
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0027
            U r0 = r2.metadata
            U r3 = r3.metadata
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
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.account.CreateProfile.equals(java.lang.Object):boolean");
    }

    public final T getAttributes() {
        return this.attributes;
    }

    public final U getMetadata() {
        return this.metadata;
    }

    public final String getProfileName() {
        return this.profileName;
    }

    public int hashCode() {
        String str = this.profileName;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        T t = this.attributes;
        int hashCode2 = (hashCode + (t != null ? t.hashCode() : 0)) * 31;
        U u = this.metadata;
        if (u != null) {
            i = u.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CreateProfile(profileName=");
        sb.append(this.profileName);
        sb.append(", attributes=");
        sb.append(this.attributes);
        sb.append(", metadata=");
        sb.append(this.metadata);
        sb.append(")");
        return sb.toString();
    }
}
