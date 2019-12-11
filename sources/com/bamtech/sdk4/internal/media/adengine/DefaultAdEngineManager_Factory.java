package com.bamtech.sdk4.internal.media.adengine;

import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.location.LocationResolver;
import com.bamtech.sdk4.internal.token.AccessTokenProvider;
import com.bamtech.sdk4.media.adengine.AdvertisingIdProvider;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultAdEngineManager_Factory implements C2111c<DefaultAdEngineManager> {
    private final Provider<AdEngineClient> adEngineClientProvider;
    private final Provider<AdvertisingIdProvider> advertisingIdProvider;
    private final Provider<ConfigurationProvider> configurationProvider;
    private final Provider<LocationResolver> locationResolverProvider;
    private final Provider<AccessTokenProvider> tokenProvider;

    public DefaultAdEngineManager_Factory(Provider<ConfigurationProvider> provider, Provider<AdEngineClient> provider2, Provider<LocationResolver> provider3, Provider<AccessTokenProvider> provider4, Provider<AdvertisingIdProvider> provider5) {
        this.configurationProvider = provider;
        this.adEngineClientProvider = provider2;
        this.locationResolverProvider = provider3;
        this.tokenProvider = provider4;
        this.advertisingIdProvider = provider5;
    }

    public static DefaultAdEngineManager_Factory create(Provider<ConfigurationProvider> provider, Provider<AdEngineClient> provider2, Provider<LocationResolver> provider3, Provider<AccessTokenProvider> provider4, Provider<AdvertisingIdProvider> provider5) {
        DefaultAdEngineManager_Factory defaultAdEngineManager_Factory = new DefaultAdEngineManager_Factory(provider, provider2, provider3, provider4, provider5);
        return defaultAdEngineManager_Factory;
    }

    public DefaultAdEngineManager get() {
        DefaultAdEngineManager defaultAdEngineManager = new DefaultAdEngineManager((ConfigurationProvider) this.configurationProvider.get(), (AdEngineClient) this.adEngineClientProvider.get(), (LocationResolver) this.locationResolverProvider.get(), (AccessTokenProvider) this.tokenProvider.get(), (AdvertisingIdProvider) this.advertisingIdProvider.get());
        return defaultAdEngineManager;
    }
}
