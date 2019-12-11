package com.bamtech.sdk4.internal.configuration;

import com.bamtech.sdk4.internal.networking.ConverterProvider;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultConfigurationProvider_Factory implements C2111c<DefaultConfigurationProvider> {
    private final Provider<BootstrapConfiguration> bootstrapConfigurationProvider;
    private final Provider<ConverterProvider> converterProvider;
    private final Provider<ConfigurationManager> managerProvider;

    public DefaultConfigurationProvider_Factory(Provider<ConfigurationManager> provider, Provider<BootstrapConfiguration> provider2, Provider<ConverterProvider> provider3) {
        this.managerProvider = provider;
        this.bootstrapConfigurationProvider = provider2;
        this.converterProvider = provider3;
    }

    public static DefaultConfigurationProvider_Factory create(Provider<ConfigurationManager> provider, Provider<BootstrapConfiguration> provider2, Provider<ConverterProvider> provider3) {
        return new DefaultConfigurationProvider_Factory(provider, provider2, provider3);
    }

    public DefaultConfigurationProvider get() {
        return new DefaultConfigurationProvider((ConfigurationManager) this.managerProvider.get(), (BootstrapConfiguration) this.bootstrapConfigurationProvider.get(), (ConverterProvider) this.converterProvider.get());
    }
}
