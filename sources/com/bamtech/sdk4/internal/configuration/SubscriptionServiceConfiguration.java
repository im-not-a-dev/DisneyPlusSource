package com.bamtech.sdk4.internal.configuration;

import com.bamtech.core.networking.Link;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007\b\u0010¢\u0006\u0002\u0010\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/configuration/SubscriptionServiceConfiguration;", "Lcom/bamtech/sdk4/internal/configuration/ServiceConfiguration;", "()V", "client", "Lcom/bamtech/sdk4/internal/configuration/ServiceClientDefinition;", "extras", "Lcom/bamtech/sdk4/internal/configuration/NullServiceExtras;", "(Lcom/bamtech/sdk4/internal/configuration/ServiceClientDefinition;Lcom/bamtech/sdk4/internal/configuration/NullServiceExtras;)V", "getClient", "()Lcom/bamtech/sdk4/internal/configuration/ServiceClientDefinition;", "getExtras", "()Lcom/bamtech/sdk4/internal/configuration/NullServiceExtras;", "getSubscriptions", "Lcom/bamtech/core/networking/Link;", "getGetSubscriptions", "()Lcom/bamtech/core/networking/Link;", "linkSubscriptionsFromDevice", "getLinkSubscriptionsFromDevice", "sdk-configuration"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: SubscriptionServiceConfiguration.kt */
public final class SubscriptionServiceConfiguration implements ServiceConfiguration {
    private final ServiceClientDefinition client;
    private final NullServiceExtras extras;

    public SubscriptionServiceConfiguration(ServiceClientDefinition serviceClientDefinition, NullServiceExtras nullServiceExtras) {
        this.client = serviceClientDefinition;
        this.extras = nullServiceExtras;
    }

    public ServiceClientDefinition getClient() {
        return this.client;
    }

    public final Link getGetSubscriptions() {
        return getClient().getLink("getSubscriptions");
    }

    public final Link getLinkSubscriptionsFromDevice() {
        return getClient().getLink("linkSubscriptionsFromDevice");
    }

    public SubscriptionServiceConfiguration() {
        this(new ServiceClientDefinition(), new NullServiceExtras());
    }

    public NullServiceExtras getExtras() {
        return this.extras;
    }
}
