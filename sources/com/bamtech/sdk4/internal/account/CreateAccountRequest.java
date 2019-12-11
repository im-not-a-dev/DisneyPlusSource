package com.bamtech.sdk4.internal.account;

import com.bamtech.shadow.gson.p050r.C2246c;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\nJ\u0017\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007HÆ\u0003JB\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u00002\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0004HÖ\u0001R\u001a\u0010\u0005\u001a\u0004\u0018\u00018\u00008\u0006X\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR$\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/account/CreateAccountRequest;", "T", "", "identityToken", "", "attributes", "metadata", "", "(Ljava/lang/String;Ljava/lang/Object;Ljava/util/Map;)V", "getAttributes", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getIdentityToken", "()Ljava/lang/String;", "getMetadata", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Object;Ljava/util/Map;)Lcom/bamtech/sdk4/internal/account/CreateAccountRequest;", "equals", "", "other", "hashCode", "", "toString", "extension-account"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: CreateAccountClient.kt */
public final class CreateAccountRequest<T> {
    @C2246c("attributes")
    private final T attributes;
    @C2246c("id_token")
    private final String identityToken;
    @C2246c("metadata")
    private final Map<String, Object> metadata;

    public CreateAccountRequest(String str, T t, Map<String, ? extends Object> map) {
        this.identityToken = str;
        this.attributes = t;
        this.metadata = map;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.metadata, (java.lang.Object) r3.metadata) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.bamtech.sdk4.internal.account.CreateAccountRequest
            if (r0 == 0) goto L_0x0027
            com.bamtech.sdk4.internal.account.CreateAccountRequest r3 = (com.bamtech.sdk4.internal.account.CreateAccountRequest) r3
            java.lang.String r0 = r2.identityToken
            java.lang.String r1 = r3.identityToken
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0027
            T r0 = r2.attributes
            T r1 = r3.attributes
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.metadata
            java.util.Map<java.lang.String, java.lang.Object> r3 = r3.metadata
            boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
            if (r3 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = 0
            return r3
        L_0x0029:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.account.CreateAccountRequest.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.identityToken;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        T t = this.attributes;
        int hashCode2 = (hashCode + (t != null ? t.hashCode() : 0)) * 31;
        Map<String, Object> map = this.metadata;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CreateAccountRequest(identityToken=");
        sb.append(this.identityToken);
        sb.append(", attributes=");
        sb.append(this.attributes);
        sb.append(", metadata=");
        sb.append(this.metadata);
        sb.append(")");
        return sb.toString();
    }
}
