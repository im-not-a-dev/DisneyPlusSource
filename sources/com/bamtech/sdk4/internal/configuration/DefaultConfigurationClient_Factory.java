package com.bamtech.sdk4.internal.configuration;

import com.bamtech.sdk4.internal.networking.ConverterProvider;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultConfigurationClient_Factory implements C2111c<DefaultConfigurationClient> {
    private final Provider<ConverterProvider> convertersProvider;

    public DefaultConfigurationClient_Factory(Provider<ConverterProvider> provider) {
        this.convertersProvider = provider;
    }

    public static DefaultConfigurationClient_Factory create(Provider<ConverterProvider> provider) {
        return new DefaultConfigurationClient_Factory(provider);
    }

    public DefaultConfigurationClient get() {
        return new DefaultConfigurationClient((ConverterProvider) this.convertersProvider.get());
    }
}
