package com.bamtech.sdk4.media.drm;

import com.bamtech.sdk4.internal.configuration.NetworkConfigurationProvider;
import com.bamtech.sdk4.internal.media.SilkDrmClient;
import com.bamtech.sdk4.internal.token.AccessTokenProvider;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultSilkDrmProvider_Factory implements C2111c<DefaultSilkDrmProvider> {
    private final Provider<AccessTokenProvider> accessTokenProvider;
    private final Provider<SilkDrmClient> clientProvider;
    private final Provider<NetworkConfigurationProvider> providerProvider;

    public DefaultSilkDrmProvider_Factory(Provider<NetworkConfigurationProvider> provider, Provider<SilkDrmClient> provider2, Provider<AccessTokenProvider> provider3) {
        this.providerProvider = provider;
        this.clientProvider = provider2;
        this.accessTokenProvider = provider3;
    }

    public static DefaultSilkDrmProvider_Factory create(Provider<NetworkConfigurationProvider> provider, Provider<SilkDrmClient> provider2, Provider<AccessTokenProvider> provider3) {
        return new DefaultSilkDrmProvider_Factory(provider, provider2, provider3);
    }

    public DefaultSilkDrmProvider get() {
        return new DefaultSilkDrmProvider((NetworkConfigurationProvider) this.providerProvider.get(), (SilkDrmClient) this.clientProvider.get(), (AccessTokenProvider) this.accessTokenProvider.get());
    }
}
