package com.bamtech.sdk4.internal.media;

import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.networking.ConverterProvider;
import com.bamtech.sdk4.internal.token.AccessTokenProvider;
import com.bamtech.sdk4.media.DefaultQOSPlaybackEventListener;
import com.bamtech.sdk4.media.QOSNetworkHelper;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultOnlineMediaClient_Factory implements C2111c<DefaultOnlineMediaClient> {
    private final Provider<ConfigurationProvider> configurationProvider;
    private final Provider<ConverterProvider> convertersProvider;
    private final Provider<DefaultQOSPlaybackEventListener> defaultQosPlaybackEventListenerProvider;
    private final Provider<PbsGenerator> pbsGeneratorProvider;
    private final Provider<QOSNetworkHelper> qosNetworkHelperProvider;
    private final Provider<AccessTokenProvider> tokenProvider;
    private final Provider<WidevineVerifier> widevineVerifierProvider;

    public DefaultOnlineMediaClient_Factory(Provider<ConfigurationProvider> provider, Provider<ConverterProvider> provider2, Provider<AccessTokenProvider> provider3, Provider<PbsGenerator> provider4, Provider<DefaultQOSPlaybackEventListener> provider5, Provider<QOSNetworkHelper> provider6, Provider<WidevineVerifier> provider7) {
        this.configurationProvider = provider;
        this.convertersProvider = provider2;
        this.tokenProvider = provider3;
        this.pbsGeneratorProvider = provider4;
        this.defaultQosPlaybackEventListenerProvider = provider5;
        this.qosNetworkHelperProvider = provider6;
        this.widevineVerifierProvider = provider7;
    }

    public static DefaultOnlineMediaClient_Factory create(Provider<ConfigurationProvider> provider, Provider<ConverterProvider> provider2, Provider<AccessTokenProvider> provider3, Provider<PbsGenerator> provider4, Provider<DefaultQOSPlaybackEventListener> provider5, Provider<QOSNetworkHelper> provider6, Provider<WidevineVerifier> provider7) {
        DefaultOnlineMediaClient_Factory defaultOnlineMediaClient_Factory = new DefaultOnlineMediaClient_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
        return defaultOnlineMediaClient_Factory;
    }

    public DefaultOnlineMediaClient get() {
        DefaultOnlineMediaClient defaultOnlineMediaClient = new DefaultOnlineMediaClient((ConfigurationProvider) this.configurationProvider.get(), (ConverterProvider) this.convertersProvider.get(), (AccessTokenProvider) this.tokenProvider.get(), (PbsGenerator) this.pbsGeneratorProvider.get(), (DefaultQOSPlaybackEventListener) this.defaultQosPlaybackEventListenerProvider.get(), (QOSNetworkHelper) this.qosNetworkHelperProvider.get(), (WidevineVerifier) this.widevineVerifierProvider.get());
        return defaultOnlineMediaClient;
    }
}
