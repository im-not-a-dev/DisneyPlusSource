package com.bamtech.sdk4.internal.content;

import com.bamtech.sdk4.content.GraphQlConverterProvider;
import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultContentClient_Factory implements C2111c<DefaultContentClient> {
    private final Provider<ConfigurationProvider> configurationProvider;
    private final Provider<GraphQlConverterProvider> converterProvider;

    public DefaultContentClient_Factory(Provider<ConfigurationProvider> provider, Provider<GraphQlConverterProvider> provider2) {
        this.configurationProvider = provider;
        this.converterProvider = provider2;
    }

    public static DefaultContentClient_Factory create(Provider<ConfigurationProvider> provider, Provider<GraphQlConverterProvider> provider2) {
        return new DefaultContentClient_Factory(provider, provider2);
    }

    public DefaultContentClient get() {
        return new DefaultContentClient((ConfigurationProvider) this.configurationProvider.get(), (GraphQlConverterProvider) this.converterProvider.get());
    }
}
