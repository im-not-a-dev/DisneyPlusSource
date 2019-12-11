package com.bamtech.sdk4.internal.paywall;

import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.networking.ConverterProvider;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultPaywallClient_Factory implements C2111c<DefaultPaywallClient> {
    private final Provider<ConfigurationProvider> configurationProvider;
    private final Provider<ConverterProvider> converterProvider;

    public DefaultPaywallClient_Factory(Provider<ConfigurationProvider> provider, Provider<ConverterProvider> provider2) {
        this.configurationProvider = provider;
        this.converterProvider = provider2;
    }

    public static DefaultPaywallClient_Factory create(Provider<ConfigurationProvider> provider, Provider<ConverterProvider> provider2) {
        return new DefaultPaywallClient_Factory(provider, provider2);
    }

    public DefaultPaywallClient get() {
        return new DefaultPaywallClient((ConfigurationProvider) this.configurationProvider.get(), (ConverterProvider) this.converterProvider.get());
    }
}
