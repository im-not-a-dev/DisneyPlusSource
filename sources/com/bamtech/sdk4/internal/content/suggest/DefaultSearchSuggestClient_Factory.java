package com.bamtech.sdk4.internal.content.suggest;

import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.networking.ConverterProvider;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultSearchSuggestClient_Factory implements C2111c<DefaultSearchSuggestClient> {
    private final Provider<ConfigurationProvider> configurationProvider;
    private final Provider<ConverterProvider> convertersProvider;

    public DefaultSearchSuggestClient_Factory(Provider<ConfigurationProvider> provider, Provider<ConverterProvider> provider2) {
        this.configurationProvider = provider;
        this.convertersProvider = provider2;
    }

    public static DefaultSearchSuggestClient_Factory create(Provider<ConfigurationProvider> provider, Provider<ConverterProvider> provider2) {
        return new DefaultSearchSuggestClient_Factory(provider, provider2);
    }

    public DefaultSearchSuggestClient get() {
        return new DefaultSearchSuggestClient((ConfigurationProvider) this.configurationProvider.get(), (ConverterProvider) this.convertersProvider.get());
    }
}
