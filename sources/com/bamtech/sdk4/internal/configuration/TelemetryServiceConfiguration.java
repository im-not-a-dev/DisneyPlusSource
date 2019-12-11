package com.bamtech.sdk4.internal.configuration;

import com.bamtech.core.networking.Link;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0010¢\u0006\u0002\u0010\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\r¨\u0006\u0012"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/configuration/TelemetryServiceConfiguration;", "Lcom/bamtech/sdk4/internal/configuration/ServiceConfiguration;", "()V", "client", "Lcom/bamtech/sdk4/internal/configuration/ServiceClientDefinition;", "extras", "Lcom/bamtech/sdk4/internal/configuration/TelemetryServiceExtras;", "(Lcom/bamtech/sdk4/internal/configuration/ServiceClientDefinition;Lcom/bamtech/sdk4/internal/configuration/TelemetryServiceExtras;)V", "getClient", "()Lcom/bamtech/sdk4/internal/configuration/ServiceClientDefinition;", "dustEventLink", "Lcom/bamtech/core/networking/Link;", "getDustEventLink", "()Lcom/bamtech/core/networking/Link;", "getExtras", "()Lcom/bamtech/sdk4/internal/configuration/TelemetryServiceExtras;", "streamSampleEventLink", "getStreamSampleEventLink", "sdk-configuration"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: TelemetryServiceConfiguration.kt */
public final class TelemetryServiceConfiguration implements ServiceConfiguration {
    private final ServiceClientDefinition client;
    private final TelemetryServiceExtras extras;

    public TelemetryServiceConfiguration(ServiceClientDefinition serviceClientDefinition, TelemetryServiceExtras telemetryServiceExtras) {
        this.client = serviceClientDefinition;
        this.extras = telemetryServiceExtras;
    }

    public ServiceClientDefinition getClient() {
        return this.client;
    }

    public final Link getDustEventLink() {
        return getClient().getLink("dustEvent");
    }

    public final Link getStreamSampleEventLink() {
        return getClient().getLink("postEvent");
    }

    public TelemetryServiceConfiguration() {
        this(new ServiceClientDefinition(), new TelemetryServiceExtras());
    }

    public TelemetryServiceExtras getExtras() {
        return this.extras;
    }
}
