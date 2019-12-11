package com.bamtech.sdk4.internal.configuration;

import com.bamtech.core.networking.Link;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0010¢\u0006\u0002\u0010\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/configuration/SessionServiceConfiguration;", "Lcom/bamtech/sdk4/internal/configuration/ServiceConfiguration;", "()V", "client", "Lcom/bamtech/sdk4/internal/configuration/ServiceClientDefinition;", "extras", "Lcom/bamtech/sdk4/internal/configuration/NullServiceExtras;", "(Lcom/bamtech/sdk4/internal/configuration/ServiceClientDefinition;Lcom/bamtech/sdk4/internal/configuration/NullServiceExtras;)V", "getClient", "()Lcom/bamtech/sdk4/internal/configuration/ServiceClientDefinition;", "getExtras", "()Lcom/bamtech/sdk4/internal/configuration/NullServiceExtras;", "getSessionInfoLink", "Lcom/bamtech/core/networking/Link;", "getGetSessionInfoLink", "()Lcom/bamtech/core/networking/Link;", "sdk-configuration"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: SessionServiceConfiguration.kt */
public final class SessionServiceConfiguration implements ServiceConfiguration {
    private final ServiceClientDefinition client;
    private final NullServiceExtras extras;

    public SessionServiceConfiguration(ServiceClientDefinition serviceClientDefinition, NullServiceExtras nullServiceExtras) {
        this.client = serviceClientDefinition;
        this.extras = nullServiceExtras;
    }

    public ServiceClientDefinition getClient() {
        return this.client;
    }

    public final Link getGetSessionInfoLink() {
        return getClient().getLink("getInfo");
    }

    public SessionServiceConfiguration() {
        this(new ServiceClientDefinition(), new NullServiceExtras());
    }

    public NullServiceExtras getExtras() {
        return this.extras;
    }
}
