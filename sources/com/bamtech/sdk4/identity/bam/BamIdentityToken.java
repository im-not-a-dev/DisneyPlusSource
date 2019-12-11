package com.bamtech.sdk4.identity.bam;

import com.bamtech.sdk4.identity.IdentityToken;
import com.bamtech.sdk4.identity.IdentityToken.DefaultImpls;
import com.bamtech.sdk4.identity.SecurityAction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0005H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, mo31007d2 = {"Lcom/bamtech/sdk4/identity/bam/BamIdentityToken;", "Lcom/bamtech/sdk4/identity/IdentityToken;", "token", "", "expiresIn", "", "issuedAt", "Lorg/joda/time/DateTime;", "securityAction", "Lcom/bamtech/sdk4/identity/SecurityAction;", "(Ljava/lang/String;ILorg/joda/time/DateTime;Lcom/bamtech/sdk4/identity/SecurityAction;)V", "getExpiresIn", "()I", "getIssuedAt", "()Lorg/joda/time/DateTime;", "getSecurityAction", "()Lcom/bamtech/sdk4/identity/SecurityAction;", "getToken", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "plugin-identity-bam"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: BamIdentityToken.kt */
public final class BamIdentityToken implements IdentityToken {
    private final int expiresIn;
    private final DateTime issuedAt;
    private final SecurityAction securityAction;
    private final String token;

    public BamIdentityToken(String str, int i, DateTime dateTime, SecurityAction securityAction2) {
        this.token = str;
        this.expiresIn = i;
        this.issuedAt = dateTime;
        this.securityAction = securityAction2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BamIdentityToken)) {
            obj = null;
        }
        BamIdentityToken bamIdentityToken = (BamIdentityToken) obj;
        if (bamIdentityToken == null || !Intrinsics.areEqual((Object) getToken(), (Object) bamIdentityToken.getToken()) || getExpiresIn() != bamIdentityToken.getExpiresIn() || !Intrinsics.areEqual((Object) getIssuedAt(), (Object) bamIdentityToken.getIssuedAt())) {
            return false;
        }
        return true;
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
        return hashCode + (securityAction2 != null ? securityAction2.hashCode() : 0);
    }
}
