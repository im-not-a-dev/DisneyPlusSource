package com.bamtech.sdk4.internal.identity.bam;

import com.bamtech.core.networking.converters.Converter;
import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.core.Storage;
import com.bamtech.sdk4.internal.token.AccessTokenProvider;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultAuthenticationManager_Factory implements C2111c<DefaultAuthenticationManager> {
    private final Provider<AccessTokenProvider> accessTokenProvider;
    private final Provider<IdentityClient> clientProvider;
    private final Provider<ConfigurationProvider> configurationProvider;
    private final Provider<Converter> flowConverterProvider;
    private final Provider<Storage> storageProvider;

    public DefaultAuthenticationManager_Factory(Provider<ConfigurationProvider> provider, Provider<IdentityClient> provider2, Provider<AccessTokenProvider> provider3, Provider<Storage> provider4, Provider<Converter> provider5) {
        this.configurationProvider = provider;
        this.clientProvider = provider2;
        this.accessTokenProvider = provider3;
        this.storageProvider = provider4;
        this.flowConverterProvider = provider5;
    }

    public static DefaultAuthenticationManager_Factory create(Provider<ConfigurationProvider> provider, Provider<IdentityClient> provider2, Provider<AccessTokenProvider> provider3, Provider<Storage> provider4, Provider<Converter> provider5) {
        DefaultAuthenticationManager_Factory defaultAuthenticationManager_Factory = new DefaultAuthenticationManager_Factory(provider, provider2, provider3, provider4, provider5);
        return defaultAuthenticationManager_Factory;
    }

    public DefaultAuthenticationManager get() {
        DefaultAuthenticationManager defaultAuthenticationManager = new DefaultAuthenticationManager((ConfigurationProvider) this.configurationProvider.get(), (IdentityClient) this.clientProvider.get(), (AccessTokenProvider) this.accessTokenProvider.get(), (Storage) this.storageProvider.get(), (Converter) this.flowConverterProvider.get());
        return defaultAuthenticationManager;
    }
}
