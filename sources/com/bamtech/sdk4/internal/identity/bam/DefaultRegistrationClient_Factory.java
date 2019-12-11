package com.bamtech.sdk4.internal.identity.bam;

import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.networking.ConverterProvider;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultRegistrationClient_Factory implements C2111c<DefaultRegistrationClient> {
    private final Provider<ConfigurationProvider> configurationProvider;
    private final Provider<ConverterProvider> convertersProvider;

    public DefaultRegistrationClient_Factory(Provider<ConfigurationProvider> provider, Provider<ConverterProvider> provider2) {
        this.configurationProvider = provider;
        this.convertersProvider = provider2;
    }

    public static DefaultRegistrationClient_Factory create(Provider<ConfigurationProvider> provider, Provider<ConverterProvider> provider2) {
        return new DefaultRegistrationClient_Factory(provider, provider2);
    }

    public DefaultRegistrationClient get() {
        return new DefaultRegistrationClient((ConfigurationProvider) this.configurationProvider.get(), (ConverterProvider) this.convertersProvider.get());
    }
}
