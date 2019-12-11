package com.bamtech.sdk4.internal.account;

import com.bamtech.core.networking.converters.Converter;
import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.networking.ConverterProvider;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultUserProfileClient_Factory implements C2111c<DefaultUserProfileClient> {
    private final Provider<ConfigurationProvider> configurationProvider;
    private final Provider<ConverterProvider> convertersProvider;
    private final Provider<Converter> customConverterProvider;

    public DefaultUserProfileClient_Factory(Provider<ConfigurationProvider> provider, Provider<ConverterProvider> provider2, Provider<Converter> provider3) {
        this.configurationProvider = provider;
        this.convertersProvider = provider2;
        this.customConverterProvider = provider3;
    }

    public static DefaultUserProfileClient_Factory create(Provider<ConfigurationProvider> provider, Provider<ConverterProvider> provider2, Provider<Converter> provider3) {
        return new DefaultUserProfileClient_Factory(provider, provider2, provider3);
    }

    public DefaultUserProfileClient get() {
        return new DefaultUserProfileClient((ConfigurationProvider) this.configurationProvider.get(), (ConverterProvider) this.convertersProvider.get(), (Converter) this.customConverterProvider.get());
    }
}
