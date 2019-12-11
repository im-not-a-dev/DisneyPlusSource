package com.bamtech.sdk4.internal.account;

import com.bamtech.core.annotations.android.DontObfuscate;
import com.bamtech.sdk4.account.UserProfile;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0002\u0010\u0005J\u000e\u0010\t\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0013\u0010\u0004\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/account/ProfileSerializationWrapper;", "T", "Lcom/bamtech/sdk4/account/UserProfile;", "", "activeProfile", "(Lcom/bamtech/sdk4/account/UserProfile;)V", "getActiveProfile", "()Lcom/bamtech/sdk4/account/UserProfile;", "Lcom/bamtech/sdk4/account/UserProfile;", "component1", "copy", "(Lcom/bamtech/sdk4/account/UserProfile;)Lcom/bamtech/sdk4/internal/account/ProfileSerializationWrapper;", "equals", "", "other", "hashCode", "", "toString", "", "extension-account"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: UserProfiles.kt */
public final class ProfileSerializationWrapper<T extends UserProfile> {
    private final T activeProfile;

    public ProfileSerializationWrapper(T t) {
        this.activeProfile = t;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.bamtech.sdk4.account.UserProfile, code=T, for r1v0, types: [com.bamtech.sdk4.account.UserProfile] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.bamtech.sdk4.internal.account.ProfileSerializationWrapper copy$default(com.bamtech.sdk4.internal.account.ProfileSerializationWrapper r0, T r1, int r2, java.lang.Object r3) {
        /*
            r2 = r2 & 1
            if (r2 == 0) goto L_0x0006
            T r1 = r0.activeProfile
        L_0x0006:
            com.bamtech.sdk4.internal.account.ProfileSerializationWrapper r0 = r0.copy(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.account.ProfileSerializationWrapper.copy$default(com.bamtech.sdk4.internal.account.ProfileSerializationWrapper, com.bamtech.sdk4.account.UserProfile, int, java.lang.Object):com.bamtech.sdk4.internal.account.ProfileSerializationWrapper");
    }

    public final T component1() {
        return this.activeProfile;
    }

    public final ProfileSerializationWrapper<T> copy(T t) {
        return new ProfileSerializationWrapper<>(t);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.activeProfile, (java.lang.Object) ((com.bamtech.sdk4.internal.account.ProfileSerializationWrapper) r2).activeProfile) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.bamtech.sdk4.internal.account.ProfileSerializationWrapper
            if (r0 == 0) goto L_0x0013
            com.bamtech.sdk4.internal.account.ProfileSerializationWrapper r2 = (com.bamtech.sdk4.internal.account.ProfileSerializationWrapper) r2
            T r0 = r1.activeProfile
            T r2 = r2.activeProfile
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.account.ProfileSerializationWrapper.equals(java.lang.Object):boolean");
    }

    public final T getActiveProfile() {
        return this.activeProfile;
    }

    public int hashCode() {
        T t = this.activeProfile;
        if (t != null) {
            return t.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProfileSerializationWrapper(activeProfile=");
        sb.append(this.activeProfile);
        sb.append(")");
        return sb.toString();
    }
}
