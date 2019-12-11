package com.bamtech.sdk4.internal.identity.bam;

import com.bamtech.core.annotations.android.DontObfuscate;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/identity/bam/ChangePasswordRequest;", "", "oldPassword", "", "newPassword", "(Ljava/lang/String;Ljava/lang/String;)V", "getNewPassword", "()Ljava/lang/String;", "getOldPassword", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "plugin-identity-bam"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: PasswordClient.kt */
public final class ChangePasswordRequest {
    private final String newPassword;
    private final String oldPassword;

    public ChangePasswordRequest(String str, String str2) {
        this.oldPassword = str;
        this.newPassword = str2;
    }

    public static /* synthetic */ ChangePasswordRequest copy$default(ChangePasswordRequest changePasswordRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = changePasswordRequest.oldPassword;
        }
        if ((i & 2) != 0) {
            str2 = changePasswordRequest.newPassword;
        }
        return changePasswordRequest.copy(str, str2);
    }

    public final String component1() {
        return this.oldPassword;
    }

    public final String component2() {
        return this.newPassword;
    }

    public final ChangePasswordRequest copy(String str, String str2) {
        return new ChangePasswordRequest(str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.newPassword, (java.lang.Object) r3.newPassword) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.bamtech.sdk4.internal.identity.bam.ChangePasswordRequest
            if (r0 == 0) goto L_0x001d
            com.bamtech.sdk4.internal.identity.bam.ChangePasswordRequest r3 = (com.bamtech.sdk4.internal.identity.bam.ChangePasswordRequest) r3
            java.lang.String r0 = r2.oldPassword
            java.lang.String r1 = r3.oldPassword
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.newPassword
            java.lang.String r3 = r3.newPassword
            boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.identity.bam.ChangePasswordRequest.equals(java.lang.Object):boolean");
    }

    public final String getNewPassword() {
        return this.newPassword;
    }

    public final String getOldPassword() {
        return this.oldPassword;
    }

    public int hashCode() {
        String str = this.oldPassword;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.newPassword;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChangePasswordRequest(oldPassword=");
        sb.append(this.oldPassword);
        sb.append(", newPassword=");
        sb.append(this.newPassword);
        sb.append(")");
        return sb.toString();
    }
}
