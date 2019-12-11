package com.bamtech.sdk4.identity.bam;

import com.bamtech.sdk4.service.ErrorReason;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u001b\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\u0010\u001a\u00020\u0004H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\b\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rXD¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fj\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, mo31007d2 = {"Lcom/bamtech/sdk4/identity/bam/IdentityTokenErrors;", "", "Lcom/bamtech/sdk4/service/ErrorReason;", "code", "", "description", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getDescription", "setDescription", "(Ljava/lang/String;)V", "responseCode", "", "getResponseCode", "()I", "toString", "MISSING", "EXPIRED", "plugin-identity-bam"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: IdentityErrors.kt */
public enum IdentityTokenErrors implements ErrorReason {
    MISSING("sdk.identity.bam.token-missing", "An identity token could not be found. Please authenticate the user before attempting a password change or use `changePassword(email, oldPassword, newPassword)`"),
    EXPIRED("sdk.identity.bam.token-expired", "The current identity token has expired. Please re-authenticate the user before attempting a password change or use `changePassword(email, oldPassword, newPassword)`");
    
    private final String code;
    private String description;
    private final int responseCode;

    private IdentityTokenErrors(String str, String str2) {
        this.code = str;
        this.description = str2;
        this.responseCode = -1;
    }

    public String getCode() {
        return this.code;
    }

    public String getDescription() {
        return this.description;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IdentityTokenErrors(responseCode=");
        sb.append(this.responseCode);
        sb.append(", description=");
        sb.append(getDescription());
        sb.append(')');
        return sb.toString();
    }
}
