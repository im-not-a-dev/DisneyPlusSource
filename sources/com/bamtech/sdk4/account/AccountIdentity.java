package com.bamtech.sdk4.account;

import com.bamtech.core.annotations.android.DontObfuscate;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo31007d2 = {"Lcom/bamtech/sdk4/account/AccountIdentity;", "", "identityId", "", "providerId", "(Ljava/lang/String;Ljava/lang/String;)V", "getIdentityId", "()Ljava/lang/String;", "getProviderId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "extension-account"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: Account.kt */
public final class AccountIdentity {
    private final String identityId;
    private final String providerId;

    public AccountIdentity(String str, String str2) {
        this.identityId = str;
        this.providerId = str2;
    }

    public static /* synthetic */ AccountIdentity copy$default(AccountIdentity accountIdentity, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accountIdentity.identityId;
        }
        if ((i & 2) != 0) {
            str2 = accountIdentity.providerId;
        }
        return accountIdentity.copy(str, str2);
    }

    public final String component1() {
        return this.identityId;
    }

    public final String component2() {
        return this.providerId;
    }

    public final AccountIdentity copy(String str, String str2) {
        return new AccountIdentity(str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.providerId, (java.lang.Object) r3.providerId) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.bamtech.sdk4.account.AccountIdentity
            if (r0 == 0) goto L_0x001d
            com.bamtech.sdk4.account.AccountIdentity r3 = (com.bamtech.sdk4.account.AccountIdentity) r3
            java.lang.String r0 = r2.identityId
            java.lang.String r1 = r3.identityId
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.providerId
            java.lang.String r3 = r3.providerId
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
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.account.AccountIdentity.equals(java.lang.Object):boolean");
    }

    public final String getIdentityId() {
        return this.identityId;
    }

    public final String getProviderId() {
        return this.providerId;
    }

    public int hashCode() {
        String str = this.identityId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.providerId;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AccountIdentity(identityId=");
        sb.append(this.identityId);
        sb.append(", providerId=");
        sb.append(this.providerId);
        sb.append(")");
        return sb.toString();
    }
}
