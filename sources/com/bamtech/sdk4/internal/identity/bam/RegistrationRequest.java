package com.bamtech.sdk4.internal.identity.bam;

import java.util.Map;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00018\u0000\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0017\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bHÆ\u0003JL\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0004HÖ\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001e"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/identity/bam/RegistrationRequest;", "T", "", "email", "", "password", "attributes", "metadata", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/util/Map;)V", "getAttributes", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getEmail", "()Ljava/lang/String;", "getMetadata", "()Ljava/util/Map;", "getPassword", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/util/Map;)Lcom/bamtech/sdk4/internal/identity/bam/RegistrationRequest;", "equals", "", "other", "hashCode", "", "toString", "plugin-identity-bam"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: RegistrationClient.kt */
public final class RegistrationRequest<T> {
    private final T attributes;
    private final String email;
    private final Map<String, Object> metadata;
    private final String password;

    public RegistrationRequest(String str, String str2, T t, Map<String, ? extends Object> map) {
        this.email = str;
        this.password = str2;
        this.attributes = t;
        this.metadata = map;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.metadata, (java.lang.Object) r3.metadata) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof com.bamtech.sdk4.internal.identity.bam.RegistrationRequest
            if (r0 == 0) goto L_0x0031
            com.bamtech.sdk4.internal.identity.bam.RegistrationRequest r3 = (com.bamtech.sdk4.internal.identity.bam.RegistrationRequest) r3
            java.lang.String r0 = r2.email
            java.lang.String r1 = r3.email
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.password
            java.lang.String r1 = r3.password
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0031
            T r0 = r2.attributes
            T r1 = r3.attributes
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.metadata
            java.util.Map<java.lang.String, java.lang.Object> r3 = r3.metadata
            boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            return r3
        L_0x0033:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.identity.bam.RegistrationRequest.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.email;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.password;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        T t = this.attributes;
        int hashCode3 = (hashCode2 + (t != null ? t.hashCode() : 0)) * 31;
        Map<String, Object> map = this.metadata;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RegistrationRequest(email=");
        sb.append(this.email);
        sb.append(", password=");
        sb.append(this.password);
        sb.append(", attributes=");
        sb.append(this.attributes);
        sb.append(", metadata=");
        sb.append(this.metadata);
        sb.append(")");
        return sb.toString();
    }
}
