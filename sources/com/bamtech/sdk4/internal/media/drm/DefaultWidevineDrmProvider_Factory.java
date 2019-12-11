package com.bamtech.sdk4.internal.media.drm;

import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.configuration.NetworkConfigurationProvider;
import com.bamtech.sdk4.internal.networking.ConverterProvider;
import com.bamtech.sdk4.internal.telemetry.EventBuffer;
import com.bamtech.sdk4.internal.telemetry.dust.DustClientConstants;
import com.bamtech.sdk4.internal.token.AccessTokenProvider;
import com.bamtech.sdk4.media.QOSNetworkHelper;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultWidevineDrmProvider_Factory implements C2111c<DefaultWidevineDrmProvider> {
    private final Provider<AccessTokenProvider> accessTokenProvider;
    private final Provider<ConfigurationProvider> configurationProvider;
    private final Provider<ConverterProvider> convertersProvider;
    private final Provider<DustClientConstants> dustConstantsProvider;
    private final Provider<EventBuffer> eventBufferProvider;
    private final Provider<NetworkConfigurationProvider> providerProvider;
    private final Provider<QOSNetworkHelper> qosNetworkHelperProvider;

    public DefaultWidevineDrmProvider_Factory(Provider<NetworkConfigurationProvider> provider, Provider<ConfigurationProvider> provider2, Provider<ConverterProvider> provider3, Provider<AccessTokenProvider> provider4, Provider<EventBuffer> provider5, Provider<DustClientConstants> provider6, Provider<QOSNetworkHelper> provider7) {
        this.providerProvider = provider;
        this.configurationProvider = provider2;
        this.convertersProvider = provider3;
        this.accessTokenProvider = provider4;
        this.eventBufferProvider = provider5;
        this.dustConstantsProvider = provider6;
        this.qosNetworkHelperProvider = provider7;
    }

    public static DefaultWidevineDrmProvider_Factory create(Provider<NetworkConfigurationProvider> provider, Provider<ConfigurationProvider> provider2, Provider<ConverterProvider> provider3, Provider<AccessTokenProvider> provider4, Provider<EventBuffer> provider5, Provider<DustClientConstants> provider6, Provider<QOSNetworkHelper> provider7) {
        DefaultWidevineDrmProvider_Factory defaultWidevineDrmProvider_Factory = new DefaultWidevineDrmProvider_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
        return defaultWidevineDrmProvider_Factory;
    }

    public DefaultWidevineDrmProvider get() {
        DefaultWidevineDrmProvider defaultWidevineDrmProvider = new DefaultWidevineDrmProvider((NetworkConfigurationProvider) this.providerProvider.get(), (ConfigurationProvider) this.configurationProvider.get(), (ConverterProvider) this.convertersProvider.get(), (AccessTokenProvider) this.accessTokenProvider.get(), (EventBuffer) this.eventBufferProvider.get(), (DustClientConstants) this.dustConstantsProvider.get(), (QOSNetworkHelper) this.qosNetworkHelperProvider.get());
        return defaultWidevineDrmProvider;
    }
}
