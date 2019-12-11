package com.bamtech.sdk4.internal.configuration;

import com.bamtech.core.networking.Link;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0010¢\u0006\u0002\u0010\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/configuration/AdEngineServiceConfiguration;", "Lcom/bamtech/sdk4/internal/configuration/ServiceConfiguration;", "()V", "disabled", "", "client", "Lcom/bamtech/sdk4/internal/configuration/ServiceClientDefinition;", "extras", "Lcom/bamtech/sdk4/internal/configuration/AdEngineExtras;", "(ZLcom/bamtech/sdk4/internal/configuration/ServiceClientDefinition;Lcom/bamtech/sdk4/internal/configuration/AdEngineExtras;)V", "getClient", "()Lcom/bamtech/sdk4/internal/configuration/ServiceClientDefinition;", "getDisabled", "()Z", "getExtras", "()Lcom/bamtech/sdk4/internal/configuration/AdEngineExtras;", "getSetTokenLink", "Lcom/bamtech/core/networking/Link;", "getGetSetTokenLink", "()Lcom/bamtech/core/networking/Link;", "sdk-configuration"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: AdEngineServiceConfiguration.kt */
public final class AdEngineServiceConfiguration implements ServiceConfiguration {
    private final ServiceClientDefinition client;
    private final boolean disabled;
    private final AdEngineExtras extras;

    public AdEngineServiceConfiguration(boolean z, ServiceClientDefinition serviceClientDefinition, AdEngineExtras adEngineExtras) {
        this.disabled = z;
        this.client = serviceClientDefinition;
        this.extras = adEngineExtras;
    }

    public ServiceClientDefinition getClient() {
        return this.client;
    }

    public final boolean getDisabled() {
        return this.disabled;
    }

    public final Link getGetSetTokenLink() {
        return getClient().getLink("setToken");
    }

    public AdEngineServiceConfiguration() {
        this(true, new ServiceClientDefinition(), new AdEngineExtras());
    }

    public AdEngineExtras getExtras() {
        return this.extras;
    }
}
