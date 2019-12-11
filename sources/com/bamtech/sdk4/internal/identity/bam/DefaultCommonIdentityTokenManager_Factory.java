package com.bamtech.sdk4.internal.identity.bam;

import com.bamtech.core.networking.converters.Converter;
import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.core.Storage;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultCommonIdentityTokenManager_Factory implements C2111c<DefaultCommonIdentityTokenManager> {
    private final Provider<ConfigurationProvider> configurationProvider;
    private final Provider<Converter> flowConverterProvider;
    private final Provider<Storage> storageProvider;

    public DefaultCommonIdentityTokenManager_Factory(Provider<ConfigurationProvider> provider, Provider<Storage> provider2, Provider<Converter> provider3) {
        this.configurationProvider = provider;
        this.storageProvider = provider2;
        this.flowConverterProvider = provider3;
    }

    public static DefaultCommonIdentityTokenManager_Factory create(Provider<ConfigurationProvider> provider, Provider<Storage> provider2, Provider<Converter> provider3) {
        return new DefaultCommonIdentityTokenManager_Factory(provider, provider2, provider3);
    }

    public DefaultCommonIdentityTokenManager get() {
        return new DefaultCommonIdentityTokenManager((ConfigurationProvider) this.configurationProvider.get(), (Storage) this.storageProvider.get(), (Converter) this.flowConverterProvider.get());
    }
}
