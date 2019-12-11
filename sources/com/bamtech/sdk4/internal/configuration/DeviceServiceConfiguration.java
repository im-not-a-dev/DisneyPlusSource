package com.bamtech.sdk4.internal.configuration;

import com.bamtech.core.networking.Link;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0010¢\u0006\u0002\u0010\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/configuration/DeviceServiceConfiguration;", "Lcom/bamtech/sdk4/internal/configuration/ServiceConfiguration;", "()V", "client", "Lcom/bamtech/sdk4/internal/configuration/ServiceClientDefinition;", "extras", "Lcom/bamtech/sdk4/internal/configuration/NullServiceExtras;", "(Lcom/bamtech/sdk4/internal/configuration/ServiceClientDefinition;Lcom/bamtech/sdk4/internal/configuration/NullServiceExtras;)V", "getClient", "()Lcom/bamtech/sdk4/internal/configuration/ServiceClientDefinition;", "createDeviceGrantLink", "Lcom/bamtech/core/networking/Link;", "getCreateDeviceGrantLink", "()Lcom/bamtech/core/networking/Link;", "getExtras", "()Lcom/bamtech/sdk4/internal/configuration/NullServiceExtras;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "sdk-configuration"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DeviceServiceConfiguration.kt */
public final class DeviceServiceConfiguration implements ServiceConfiguration {
    private final ServiceClientDefinition client;
    private final NullServiceExtras extras;

    public DeviceServiceConfiguration(ServiceClientDefinition serviceClientDefinition, NullServiceExtras nullServiceExtras) {
        this.client = serviceClientDefinition;
        this.extras = nullServiceExtras;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) getExtras(), (java.lang.Object) r3.getExtras()) != false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0027
            boolean r0 = r3 instanceof com.bamtech.sdk4.internal.configuration.DeviceServiceConfiguration
            if (r0 == 0) goto L_0x0025
            com.bamtech.sdk4.internal.configuration.DeviceServiceConfiguration r3 = (com.bamtech.sdk4.internal.configuration.DeviceServiceConfiguration) r3
            com.bamtech.sdk4.internal.configuration.ServiceClientDefinition r0 = r2.getClient()
            com.bamtech.sdk4.internal.configuration.ServiceClientDefinition r1 = r3.getClient()
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0025
            com.bamtech.sdk4.internal.configuration.NullServiceExtras r0 = r2.getExtras()
            com.bamtech.sdk4.internal.configuration.NullServiceExtras r3 = r3.getExtras()
            boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
            if (r3 == 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r3 = 0
            return r3
        L_0x0027:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.configuration.DeviceServiceConfiguration.equals(java.lang.Object):boolean");
    }

    public ServiceClientDefinition getClient() {
        return this.client;
    }

    public final Link getCreateDeviceGrantLink() {
        return getClient().getLink("createDeviceGrant");
    }

    public int hashCode() {
        ServiceClientDefinition client2 = getClient();
        int i = 0;
        int hashCode = (client2 != null ? client2.hashCode() : 0) * 31;
        NullServiceExtras extras2 = getExtras();
        if (extras2 != null) {
            i = extras2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceServiceConfiguration(client=");
        sb.append(getClient());
        sb.append(", extras=");
        sb.append(getExtras());
        sb.append(")");
        return sb.toString();
    }

    public DeviceServiceConfiguration() {
        this(new ServiceClientDefinition(), new NullServiceExtras());
    }

    public NullServiceExtras getExtras() {
        return this.extras;
    }
}
