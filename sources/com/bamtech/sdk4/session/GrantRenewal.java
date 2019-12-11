package com.bamtech.sdk4.session;

import com.bamtech.sdk4.token.Grant;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, mo31007d2 = {"Lcom/bamtech/sdk4/session/GrantRenewal;", "Lcom/bamtech/sdk4/session/ReauthorizeMode;", "grant", "Lcom/bamtech/sdk4/token/Grant;", "(Lcom/bamtech/sdk4/token/Grant;)V", "getGrant", "()Lcom/bamtech/sdk4/token/Grant;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "extension-session"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: GrantRenewal.kt */
public final class GrantRenewal implements ReauthorizeMode {
    private final Grant grant;

    public GrantRenewal(Grant grant2) {
        this.grant = grant2;
    }

    public static /* synthetic */ GrantRenewal copy$default(GrantRenewal grantRenewal, Grant grant2, int i, Object obj) {
        if ((i & 1) != 0) {
            grant2 = grantRenewal.grant;
        }
        return grantRenewal.copy(grant2);
    }

    public final Grant component1() {
        return this.grant;
    }

    public final GrantRenewal copy(Grant grant2) {
        return new GrantRenewal(grant2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1.grant, (java.lang.Object) ((com.bamtech.sdk4.session.GrantRenewal) r2).grant) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.bamtech.sdk4.session.GrantRenewal
            if (r0 == 0) goto L_0x0013
            com.bamtech.sdk4.session.GrantRenewal r2 = (com.bamtech.sdk4.session.GrantRenewal) r2
            com.bamtech.sdk4.token.Grant r0 = r1.grant
            com.bamtech.sdk4.token.Grant r2 = r2.grant
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
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.session.GrantRenewal.equals(java.lang.Object):boolean");
    }

    public final Grant getGrant() {
        return this.grant;
    }

    public int hashCode() {
        Grant grant2 = this.grant;
        if (grant2 != null) {
            return grant2.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GrantRenewal(grant=");
        sb.append(this.grant);
        sb.append(")");
        return sb.toString();
    }
}
