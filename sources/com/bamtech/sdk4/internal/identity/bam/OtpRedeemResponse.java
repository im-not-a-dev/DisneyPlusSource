package com.bamtech.sdk4.internal.identity.bam;

import com.bamtech.sdk4.identity.SecurityAction;
import com.bamtech.sdk4.identity.bam.OneTimePasscodeRequestReason;
import com.bamtech.shadow.gson.p050r.C2246c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/identity/bam/OtpRedeemResponse;", "", "expiresIn", "", "tokenId", "", "securityAction", "Lcom/bamtech/sdk4/identity/SecurityAction;", "reason", "Lcom/bamtech/sdk4/identity/bam/OneTimePasscodeRequestReason;", "(ILjava/lang/String;Lcom/bamtech/sdk4/identity/SecurityAction;Lcom/bamtech/sdk4/identity/bam/OneTimePasscodeRequestReason;)V", "getExpiresIn", "()I", "getReason", "()Lcom/bamtech/sdk4/identity/bam/OneTimePasscodeRequestReason;", "getSecurityAction", "()Lcom/bamtech/sdk4/identity/SecurityAction;", "getTokenId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "plugin-identity-bam"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: OtpRedeemResponse.kt */
public final class OtpRedeemResponse {
    @C2246c("expires_in")
    private final int expiresIn;
    private final OneTimePasscodeRequestReason reason;
    private final SecurityAction securityAction;
    @C2246c("id_token")
    private final String tokenId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OtpRedeemResponse) {
                OtpRedeemResponse otpRedeemResponse = (OtpRedeemResponse) obj;
                if (!(this.expiresIn == otpRedeemResponse.expiresIn) || !Intrinsics.areEqual((Object) this.tokenId, (Object) otpRedeemResponse.tokenId) || !Intrinsics.areEqual((Object) this.securityAction, (Object) otpRedeemResponse.securityAction) || !Intrinsics.areEqual((Object) this.reason, (Object) otpRedeemResponse.reason)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int getExpiresIn() {
        return this.expiresIn;
    }

    public final OneTimePasscodeRequestReason getReason() {
        return this.reason;
    }

    public final SecurityAction getSecurityAction() {
        return this.securityAction;
    }

    public final String getTokenId() {
        return this.tokenId;
    }

    public int hashCode() {
        int i = this.expiresIn * 31;
        String str = this.tokenId;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        SecurityAction securityAction2 = this.securityAction;
        int hashCode2 = (hashCode + (securityAction2 != null ? securityAction2.hashCode() : 0)) * 31;
        OneTimePasscodeRequestReason oneTimePasscodeRequestReason = this.reason;
        if (oneTimePasscodeRequestReason != null) {
            i2 = oneTimePasscodeRequestReason.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OtpRedeemResponse(expiresIn=");
        sb.append(this.expiresIn);
        sb.append(", tokenId=");
        sb.append(this.tokenId);
        sb.append(", securityAction=");
        sb.append(this.securityAction);
        sb.append(", reason=");
        sb.append(this.reason);
        sb.append(")");
        return sb.toString();
    }
}
