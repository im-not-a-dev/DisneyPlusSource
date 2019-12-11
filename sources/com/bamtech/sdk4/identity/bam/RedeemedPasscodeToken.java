package com.bamtech.sdk4.identity.bam;

import com.bamtech.sdk4.identity.IdentityToken;
import com.bamtech.sdk4.identity.IdentityToken.DefaultImpls;
import com.bamtech.sdk4.identity.SecurityAction;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003J?\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J\b\u0010!\u001a\u00020\u0005H\u0016J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, mo31007d2 = {"Lcom/bamtech/sdk4/identity/bam/RedeemedPasscodeToken;", "Lcom/bamtech/sdk4/identity/IdentityToken;", "token", "", "expiresIn", "", "issuedAt", "Lorg/joda/time/DateTime;", "securityAction", "Lcom/bamtech/sdk4/identity/SecurityAction;", "reason", "Lcom/bamtech/sdk4/identity/bam/OneTimePasscodeRequestReason;", "(Ljava/lang/String;ILorg/joda/time/DateTime;Lcom/bamtech/sdk4/identity/SecurityAction;Lcom/bamtech/sdk4/identity/bam/OneTimePasscodeRequestReason;)V", "getExpiresIn", "()I", "getIssuedAt", "()Lorg/joda/time/DateTime;", "getReason", "()Lcom/bamtech/sdk4/identity/bam/OneTimePasscodeRequestReason;", "getSecurityAction", "()Lcom/bamtech/sdk4/identity/SecurityAction;", "getToken", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "plugin-identity-bam"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: RedeemPasscodeToken.kt */
public final class RedeemedPasscodeToken implements IdentityToken {
    private final int expiresIn;
    private final DateTime issuedAt;
    private final OneTimePasscodeRequestReason reason;
    private final SecurityAction securityAction;
    private final String token;

    public RedeemedPasscodeToken(String str, int i, DateTime dateTime, SecurityAction securityAction2, OneTimePasscodeRequestReason oneTimePasscodeRequestReason) {
        this.token = str;
        this.expiresIn = i;
        this.issuedAt = dateTime;
        this.securityAction = securityAction2;
        this.reason = oneTimePasscodeRequestReason;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual((Object) RedeemedPasscodeToken.class, (Object) obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            RedeemedPasscodeToken redeemedPasscodeToken = (RedeemedPasscodeToken) obj;
            return !(Intrinsics.areEqual((Object) getToken(), (Object) redeemedPasscodeToken.getToken()) ^ true) && getExpiresIn() == redeemedPasscodeToken.getExpiresIn() && !(Intrinsics.areEqual((Object) getIssuedAt(), (Object) redeemedPasscodeToken.getIssuedAt()) ^ true) && !(Intrinsics.areEqual((Object) getSecurityAction(), (Object) redeemedPasscodeToken.getSecurityAction()) ^ true) && this.reason == redeemedPasscodeToken.reason;
        }
        throw new C13142s("null cannot be cast to non-null type com.bamtech.sdk4.identity.bam.RedeemedPasscodeToken");
    }

    public DateTime getExpiration() {
        return DefaultImpls.getExpiration(this);
    }

    public int getExpiresIn() {
        return this.expiresIn;
    }

    public DateTime getIssuedAt() {
        return this.issuedAt;
    }

    public SecurityAction getSecurityAction() {
        return this.securityAction;
    }

    public String getToken() {
        return this.token;
    }

    public int hashCode() {
        int hashCode = ((((getToken().hashCode() * 31) + getExpiresIn()) * 31) + getIssuedAt().hashCode()) * 31;
        SecurityAction securityAction2 = getSecurityAction();
        int i = 0;
        int hashCode2 = (hashCode + (securityAction2 != null ? securityAction2.hashCode() : 0)) * 31;
        OneTimePasscodeRequestReason oneTimePasscodeRequestReason = this.reason;
        if (oneTimePasscodeRequestReason != null) {
            i = oneTimePasscodeRequestReason.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RedeemedPasscodeToken(token=");
        sb.append(getToken());
        sb.append(", expiresIn=");
        sb.append(getExpiresIn());
        sb.append(", issuedAt=");
        sb.append(getIssuedAt());
        sb.append(", securityAction=");
        sb.append(getSecurityAction());
        sb.append(", reason=");
        sb.append(this.reason);
        sb.append(")");
        return sb.toString();
    }
}
