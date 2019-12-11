package com.bamtech.sdk4.internal.device;

import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.location.LocationResolver;
import com.bamtech.sdk4.internal.networking.ConverterProvider;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultDeviceClient_Factory implements C2111c<DefaultDeviceClient> {
    private final Provider<ConfigurationProvider> configurationProvider;
    private final Provider<ConverterProvider> convertersProvider;
    private final Provider<LocationResolver> locationResolverProvider;

    public DefaultDeviceClient_Factory(Provider<ConfigurationProvider> provider, Provider<LocationResolver> provider2, Provider<ConverterProvider> provider3) {
        this.configurationProvider = provider;
        this.locationResolverProvider = provider2;
        this.convertersProvider = provider3;
    }

    public static DefaultDeviceClient_Factory create(Provider<ConfigurationProvider> provider, Provider<LocationResolver> provider2, Provider<ConverterProvider> provider3) {
        return new DefaultDeviceClient_Factory(provider, provider2, provider3);
    }

    public DefaultDeviceClient get() {
        return new DefaultDeviceClient((ConfigurationProvider) this.configurationProvider.get(), (LocationResolver) this.locationResolverProvider.get(), (ConverterProvider) this.convertersProvider.get());
    }
}
