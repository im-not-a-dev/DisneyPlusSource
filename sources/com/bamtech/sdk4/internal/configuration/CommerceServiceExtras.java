package com.bamtech.sdk4.internal.configuration;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0010¢\u0006\u0002\u0010\u0002B1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\u0015\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\tHÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\tHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/configuration/CommerceServiceExtras;", "Lcom/bamtech/sdk4/internal/configuration/ServiceExtras;", "()V", "namespace", "", "namespaceId", "", "clientId", "createPaymentMethodRegionalEndpoints", "", "(Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;)V", "getClientId", "()Ljava/lang/String;", "getCreatePaymentMethodRegionalEndpoints", "()Ljava/util/Map;", "getNamespace", "getNamespaceId", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "sdk-configuration"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: CommerceServiceConfiguration.kt */
public final class CommerceServiceExtras implements ServiceExtras {
    private final String clientId;
    private final Map<String, String> createPaymentMethodRegionalEndpoints;
    private final String namespace;
    private final int namespaceId;

    public CommerceServiceExtras(String str, int i, String str2, Map<String, String> map) {
        this.namespace = str;
        this.namespaceId = i;
        this.clientId = str2;
        this.createPaymentMethodRegionalEndpoints = map;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CommerceServiceExtras) {
                CommerceServiceExtras commerceServiceExtras = (CommerceServiceExtras) obj;
                if (Intrinsics.areEqual((Object) this.namespace, (Object) commerceServiceExtras.namespace)) {
                    if (!(this.namespaceId == commerceServiceExtras.namespaceId) || !Intrinsics.areEqual((Object) this.clientId, (Object) commerceServiceExtras.clientId) || !Intrinsics.areEqual((Object) this.createPaymentMethodRegionalEndpoints, (Object) commerceServiceExtras.createPaymentMethodRegionalEndpoints)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.namespace;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.namespaceId) * 31;
        String str2 = this.clientId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Map<String, String> map = this.createPaymentMethodRegionalEndpoints;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CommerceServiceExtras(namespace=");
        sb.append(this.namespace);
        sb.append(", namespaceId=");
        sb.append(this.namespaceId);
        sb.append(", clientId=");
        sb.append(this.clientId);
        sb.append(", createPaymentMethodRegionalEndpoints=");
        sb.append(this.createPaymentMethodRegionalEndpoints);
        sb.append(")");
        return sb.toString();
    }

    public CommerceServiceExtras() {
        String str = "";
        this(str, 0, str, C13173j0.m40350a());
    }
}
