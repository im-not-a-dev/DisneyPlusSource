package com.bamtech.sdk4.internal.token;

import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.location.LocationResolver;
import com.bamtech.sdk4.internal.networking.ConverterProvider;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultTokenClient_Factory implements C2111c<DefaultTokenClient> {
    private final Provider<ConfigurationProvider> configurationProvider;
    private final Provider<ConverterProvider> convertersProvider;
    private final Provider<LocationResolver> locationResolverProvider;

    public DefaultTokenClient_Factory(Provider<ConfigurationProvider> provider, Provider<LocationResolver> provider2, Provider<ConverterProvider> provider3) {
        this.configurationProvider = provider;
        this.locationResolverProvider = provider2;
        this.convertersProvider = provider3;
    }

    public static DefaultTokenClient_Factory create(Provider<ConfigurationProvider> provider, Provider<LocationResolver> provider2, Provider<ConverterProvider> provider3) {
        return new DefaultTokenClient_Factory(provider, provider2, provider3);
    }

    public DefaultTokenClient get() {
        return new DefaultTokenClient((ConfigurationProvider) this.configurationProvider.get(), (LocationResolver) this.locationResolverProvider.get(), (ConverterProvider) this.convertersProvider.get());
    }
}
