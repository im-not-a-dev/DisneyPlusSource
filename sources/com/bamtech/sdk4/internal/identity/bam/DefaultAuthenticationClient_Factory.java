package com.bamtech.sdk4.internal.identity.bam;

import com.bamtech.core.networking.converters.Converter;
import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.networking.ConverterProvider;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultAuthenticationClient_Factory implements C2111c<DefaultAuthenticationClient> {
    private final Provider<ConfigurationProvider> configurationProvider;
    private final Provider<ConverterProvider> convertersProvider;
    private final Provider<Converter> flowConverterProvider;

    public DefaultAuthenticationClient_Factory(Provider<ConfigurationProvider> provider, Provider<ConverterProvider> provider2, Provider<Converter> provider3) {
        this.configurationProvider = provider;
        this.convertersProvider = provider2;
        this.flowConverterProvider = provider3;
    }

    public static DefaultAuthenticationClient_Factory create(Provider<ConfigurationProvider> provider, Provider<ConverterProvider> provider2, Provider<Converter> provider3) {
        return new DefaultAuthenticationClient_Factory(provider, provider2, provider3);
    }

    public DefaultAuthenticationClient get() {
        return new DefaultAuthenticationClient((ConfigurationProvider) this.configurationProvider.get(), (ConverterProvider) this.convertersProvider.get(), (Converter) this.flowConverterProvider.get());
    }
}
