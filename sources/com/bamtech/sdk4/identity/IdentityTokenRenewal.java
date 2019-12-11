package com.bamtech.sdk4.identity;

import com.bamtech.sdk4.session.ReauthorizeMode;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, mo31007d2 = {"Lcom/bamtech/sdk4/identity/IdentityTokenRenewal;", "Lcom/bamtech/sdk4/session/ReauthorizeMode;", "identityToken", "Lcom/bamtech/sdk4/identity/IdentityToken;", "(Lcom/bamtech/sdk4/identity/IdentityToken;)V", "getIdentityToken", "()Lcom/bamtech/sdk4/identity/IdentityToken;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "extension-account"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: IdentityTokenRenewal.kt */
public final class IdentityTokenRenewal implements ReauthorizeMode {
    private final IdentityToken identityToken;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.identityToken, (java.lang.Object) ((com.bamtech.sdk4.identity.IdentityTokenRenewal) r2).identityToken) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.bamtech.sdk4.identity.IdentityTokenRenewal
            if (r0 == 0) goto L_0x0013
            com.bamtech.sdk4.identity.IdentityTokenRenewal r2 = (com.bamtech.sdk4.identity.IdentityTokenRenewal) r2
            com.bamtech.sdk4.identity.IdentityToken r0 = r1.identityToken
            com.bamtech.sdk4.identity.IdentityToken r2 = r2.identityToken
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.identity.IdentityTokenRenewal.equals(java.lang.Object):boolean");
    }

    public final IdentityToken getIdentityToken() {
        return this.identityToken;
    }

    public int hashCode() {
        IdentityToken identityToken2 = this.identityToken;
        if (identityToken2 != null) {
            return identityToken2.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IdentityTokenRenewal(identityToken=");
        sb.append(this.identityToken);
        sb.append(")");
        return sb.toString();
    }
}
