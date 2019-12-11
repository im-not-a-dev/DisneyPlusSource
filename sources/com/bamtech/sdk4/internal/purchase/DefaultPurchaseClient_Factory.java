package com.bamtech.sdk4.internal.purchase;

import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.networking.ConverterProvider;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultPurchaseClient_Factory implements C2111c<DefaultPurchaseClient> {
    private final Provider<ConfigurationProvider> configurationProvider;
    private final Provider<ConverterProvider> convertersProvider;

    public DefaultPurchaseClient_Factory(Provider<ConfigurationProvider> provider, Provider<ConverterProvider> provider2) {
        this.configurationProvider = provider;
        this.convertersProvider = provider2;
    }

    public static DefaultPurchaseClient_Factory create(Provider<ConfigurationProvider> provider, Provider<ConverterProvider> provider2) {
        return new DefaultPurchaseClient_Factory(provider, provider2);
    }

    public DefaultPurchaseClient get() {
        return new DefaultPurchaseClient((ConfigurationProvider) this.configurationProvider.get(), (ConverterProvider) this.convertersProvider.get());
    }
}
