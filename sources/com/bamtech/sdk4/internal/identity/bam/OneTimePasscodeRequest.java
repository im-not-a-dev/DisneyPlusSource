package com.bamtech.sdk4.internal.identity.bam;

import com.bamtech.core.annotations.android.DontObfuscate;
import com.bamtech.sdk4.identity.bam.OneTimePasscodeRequestReason;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/identity/bam/OneTimePasscodeRequest;", "", "email", "", "reason", "Lcom/bamtech/sdk4/identity/bam/OneTimePasscodeRequestReason;", "(Ljava/lang/String;Lcom/bamtech/sdk4/identity/bam/OneTimePasscodeRequestReason;)V", "getEmail", "()Ljava/lang/String;", "getReason", "()Lcom/bamtech/sdk4/identity/bam/OneTimePasscodeRequestReason;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "plugin-identity-bam"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: AuthenticationClient.kt */
public final class OneTimePasscodeRequest {
    private final String email;
    private final OneTimePasscodeRequestReason reason;

    public OneTimePasscodeRequest(String str, OneTimePasscodeRequestReason oneTimePasscodeRequestReason) {
        this.email = str;
        this.reason = oneTimePasscodeRequestReason;
    }

    public static /* synthetic */ OneTimePasscodeRequest copy$default(OneTimePasscodeRequest oneTimePasscodeRequest, String str, OneTimePasscodeRequestReason oneTimePasscodeRequestReason, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneTimePasscodeRequest.email;
        }
        if ((i & 2) != 0) {
            oneTimePasscodeRequestReason = oneTimePasscodeRequest.reason;
        }
        return oneTimePasscodeRequest.copy(str, oneTimePasscodeRequestReason);
    }

    public final String component1() {
        return this.email;
    }

    public final OneTimePasscodeRequestReason component2() {
        return this.reason;
    }

    public final OneTimePasscodeRequest copy(String str, OneTimePasscodeRequestReason oneTimePasscodeRequestReason) {
        return new OneTimePasscodeRequest(str, oneTimePasscodeRequestReason);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.reason, (java.lang.Object) r3.reason) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.bamtech.sdk4.internal.identity.bam.OneTimePasscodeRequest
            if (r0 == 0) goto L_0x001d
            com.bamtech.sdk4.internal.identity.bam.OneTimePasscodeRequest r3 = (com.bamtech.sdk4.internal.identity.bam.OneTimePasscodeRequest) r3
            java.lang.String r0 = r2.email
            java.lang.String r1 = r3.email
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.bamtech.sdk4.identity.bam.OneTimePasscodeRequestReason r0 = r2.reason
            com.bamtech.sdk4.identity.bam.OneTimePasscodeRequestReason r3 = r3.reason
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
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.identity.bam.OneTimePasscodeRequest.equals(java.lang.Object):boolean");
    }

    public final String getEmail() {
        return this.email;
    }

    public final OneTimePasscodeRequestReason getReason() {
        return this.reason;
    }

    public int hashCode() {
        String str = this.email;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        OneTimePasscodeRequestReason oneTimePasscodeRequestReason = this.reason;
        if (oneTimePasscodeRequestReason != null) {
            i = oneTimePasscodeRequestReason.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OneTimePasscodeRequest(email=");
        sb.append(this.email);
        sb.append(", reason=");
        sb.append(this.reason);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ OneTimePasscodeRequest(String str, OneTimePasscodeRequestReason oneTimePasscodeRequestReason, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            oneTimePasscodeRequestReason = null;
        }
        this(str, oneTimePasscodeRequestReason);
    }
}
