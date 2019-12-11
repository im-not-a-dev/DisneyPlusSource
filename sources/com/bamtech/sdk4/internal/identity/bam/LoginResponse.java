package com.bamtech.sdk4.internal.identity.bam;

import com.bamtech.core.annotations.android.DontObfuscate;
import com.bamtech.sdk4.identity.IdentityToken;
import com.bamtech.sdk4.identity.IdentityToken.DefaultImpls;
import com.bamtech.sdk4.identity.SecurityAction;
import com.bamtech.shadow.gson.p050r.C2246c;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0001\u0004¨\u0006\u0005"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/identity/bam/LoginResponse;", "", "()V", "Success", "Lcom/bamtech/sdk4/internal/identity/bam/LoginResponse$Success;", "plugin-identity-bam"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: AuthenticationClient.kt */
public abstract class LoginResponse {

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u0011\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B/\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\rJ\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\nHÆ\u0003J\t\u0010\u0018\u001a\u00020\fHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J3\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\nHÖ\u0001J\t\u0010 \u001a\u00020\bHÖ\u0001R\u0016\u0010\t\u001a\u00020\n8\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\b8\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/identity/bam/LoginResponse$Success;", "Lcom/bamtech/sdk4/internal/identity/bam/LoginResponse;", "Lcom/bamtech/sdk4/identity/IdentityToken;", "()V", "securityAction", "Lcom/bamtech/sdk4/identity/SecurityAction;", "(Lcom/bamtech/sdk4/identity/SecurityAction;)V", "token", "", "expiresIn", "", "issuedAt", "Lorg/joda/time/DateTime;", "(Ljava/lang/String;ILorg/joda/time/DateTime;Lcom/bamtech/sdk4/identity/SecurityAction;)V", "getExpiresIn", "()I", "getIssuedAt", "()Lorg/joda/time/DateTime;", "getSecurityAction", "()Lcom/bamtech/sdk4/identity/SecurityAction;", "getToken", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "plugin-identity-bam"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: AuthenticationClient.kt */
    public static final class Success extends LoginResponse implements IdentityToken {
        @C2246c("expires_in")
        private final int expiresIn;
        private final DateTime issuedAt;
        private final SecurityAction securityAction;
        @C2246c("id_token")
        private final String token;

        public Success(String str, int i, DateTime dateTime, SecurityAction securityAction2) {
            super(null);
            this.token = str;
            this.expiresIn = i;
            this.issuedAt = dateTime;
            this.securityAction = securityAction2;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Success) {
                    Success success = (Success) obj;
                    if (C12880j.m40224a((Object) getToken(), (Object) success.getToken())) {
                        if (!(getExpiresIn() == success.getExpiresIn()) || !C12880j.m40224a((Object) getIssuedAt(), (Object) success.getIssuedAt()) || !C12880j.m40224a((Object) getSecurityAction(), (Object) success.getSecurityAction())) {
                            return false;
                        }
                    }
                }
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
            String token2 = getToken();
            int i = 0;
            int hashCode = (((token2 != null ? token2.hashCode() : 0) * 31) + getExpiresIn()) * 31;
            DateTime issuedAt2 = getIssuedAt();
            int hashCode2 = (hashCode + (issuedAt2 != null ? issuedAt2.hashCode() : 0)) * 31;
            SecurityAction securityAction2 = getSecurityAction();
            if (securityAction2 != null) {
                i = securityAction2.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Success(token=");
            sb.append(getToken());
            sb.append(", expiresIn=");
            sb.append(getExpiresIn());
            sb.append(", issuedAt=");
            sb.append(getIssuedAt());
            sb.append(", securityAction=");
            sb.append(getSecurityAction());
            sb.append(")");
            return sb.toString();
        }

        public Success() {
            DateTime now = DateTime.now(DateTimeZone.UTC);
            C12880j.m40222a((Object) now, "DateTime.now(DateTimeZone.UTC)");
            this("", 3300, now, null);
        }
    }

    private LoginResponse() {
    }

    public /* synthetic */ LoginResponse(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
