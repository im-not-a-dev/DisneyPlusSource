package com.bamtech.sdk4.internal.account;

import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.networking.ConverterProvider;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultCreateAccountGrantClient_Factory implements C2111c<DefaultCreateAccountGrantClient> {
    private final Provider<ConfigurationProvider> configurationProvider;
    private final Provider<ConverterProvider> convertersProvider;

    public DefaultCreateAccountGrantClient_Factory(Provider<ConfigurationProvider> provider, Provider<ConverterProvider> provider2) {
        this.configurationProvider = provider;
        this.convertersProvider = provider2;
    }

    public static DefaultCreateAccountGrantClient_Factory create(Provider<ConfigurationProvider> provider, Provider<ConverterProvider> provider2) {
        return new DefaultCreateAccountGrantClient_Factory(provider, provider2);
    }

    public DefaultCreateAccountGrantClient get() {
        return new DefaultCreateAccountGrantClient((ConfigurationProvider) this.configurationProvider.get(), (ConverterProvider) this.convertersProvider.get());
    }
}
