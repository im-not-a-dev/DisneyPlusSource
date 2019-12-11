package com.bamtech.sdk4.internal.token;

import com.bamtech.core.annotations.android.DontObfuscate;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/token/TokenExchangeErrorResponse;", "", "error", "", "error_description", "(Ljava/lang/String;Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "getError_description", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: TokenExchangeErrorResponse.kt */
public final class TokenExchangeErrorResponse {
    private final String error;
    private final String error_description;

    public TokenExchangeErrorResponse(String str, String str2) {
        this.error = str;
        this.error_description = str2;
    }

    public static /* synthetic */ TokenExchangeErrorResponse copy$default(TokenExchangeErrorResponse tokenExchangeErrorResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tokenExchangeErrorResponse.error;
        }
        if ((i & 2) != 0) {
            str2 = tokenExchangeErrorResponse.error_description;
        }
        return tokenExchangeErrorResponse.copy(str, str2);
    }

    public final String component1() {
        return this.error;
    }

    public final String component2() {
        return this.error_description;
    }

    public final TokenExchangeErrorResponse copy(String str, String str2) {
        return new TokenExchangeErrorResponse(str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.error_description, (java.lang.Object) r3.error_description) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.bamtech.sdk4.internal.token.TokenExchangeErrorResponse
            if (r0 == 0) goto L_0x001d
            com.bamtech.sdk4.internal.token.TokenExchangeErrorResponse r3 = (com.bamtech.sdk4.internal.token.TokenExchangeErrorResponse) r3
            java.lang.String r0 = r2.error
            java.lang.String r1 = r3.error
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.error_description
            java.lang.String r3 = r3.error_description
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
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.token.TokenExchangeErrorResponse.equals(java.lang.Object):boolean");
    }

    public final String getError() {
        return this.error;
    }

    public final String getError_description() {
        return this.error_description;
    }

    public int hashCode() {
        String str = this.error;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.error_description;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TokenExchangeErrorResponse(error=");
        sb.append(this.error);
        sb.append(", error_description=");
        sb.append(this.error_description);
        sb.append(")");
        return sb.toString();
    }
}
