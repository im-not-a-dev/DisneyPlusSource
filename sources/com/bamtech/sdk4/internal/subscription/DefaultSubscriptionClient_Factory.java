package com.bamtech.sdk4.internal.subscription;

import com.bamtech.core.networking.converters.Converter;
import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultSubscriptionClient_Factory implements C2111c<DefaultSubscriptionClient> {
    private final Provider<ConfigurationProvider> configurationProvider;
    private final Provider<Converter> converterProvider;

    public DefaultSubscriptionClient_Factory(Provider<ConfigurationProvider> provider, Provider<Converter> provider2) {
        this.configurationProvider = provider;
        this.converterProvider = provider2;
    }

    public static DefaultSubscriptionClient_Factory create(Provider<ConfigurationProvider> provider, Provider<Converter> provider2) {
        return new DefaultSubscriptionClient_Factory(provider, provider2);
    }

    public DefaultSubscriptionClient get() {
        return new DefaultSubscriptionClient((ConfigurationProvider) this.configurationProvider.get(), (Converter) this.converterProvider.get());
    }
}
