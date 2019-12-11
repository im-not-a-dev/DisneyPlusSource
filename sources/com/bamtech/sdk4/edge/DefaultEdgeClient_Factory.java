package com.bamtech.sdk4.edge;

import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultEdgeClient_Factory implements C2111c<DefaultEdgeClient> {
    private final Provider<ConfigurationProvider> configurationProvider;

    public DefaultEdgeClient_Factory(Provider<ConfigurationProvider> provider) {
        this.configurationProvider = provider;
    }

    public static DefaultEdgeClient_Factory create(Provider<ConfigurationProvider> provider) {
        return new DefaultEdgeClient_Factory(provider);
    }

    public DefaultEdgeClient get() {
        return new DefaultEdgeClient((ConfigurationProvider) this.configurationProvider.get());
    }
}
