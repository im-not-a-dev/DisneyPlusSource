package com.bamtech.sdk4.identity;

import com.bamtech.core.annotations.android.DontObfuscate;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import org.joda.time.DateTime;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001:\u0001\u0014R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\u0004\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, mo31007d2 = {"Lcom/bamtech/sdk4/identity/IdentityToken;", "", "expiration", "Lorg/joda/time/DateTime;", "getExpiration", "()Lorg/joda/time/DateTime;", "expiresIn", "", "getExpiresIn", "()I", "issuedAt", "getIssuedAt", "securityAction", "Lcom/bamtech/sdk4/identity/SecurityAction;", "getSecurityAction", "()Lcom/bamtech/sdk4/identity/SecurityAction;", "token", "", "getToken", "()Ljava/lang/String;", "Default", "extension-account"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: IdentityToken.kt */
public interface IdentityToken {

    @Metadata(mo31005bv = {1, 0, 3}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* compiled from: IdentityToken.kt */
    public static final class DefaultImpls {
        public static DateTime getExpiration(IdentityToken identityToken) {
            DateTime plusSeconds = identityToken.getIssuedAt().plusSeconds(identityToken.getExpiresIn());
            C12880j.m40222a((Object) plusSeconds, "issuedAt.plusSeconds(expiresIn)");
            return plusSeconds;
        }
    }

    DateTime getExpiration();

    int getExpiresIn();

    DateTime getIssuedAt();

    SecurityAction getSecurityAction();

    String getToken();
}
