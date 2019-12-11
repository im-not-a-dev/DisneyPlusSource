package com.bamtech.sdk4.internal.media;

import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.networking.ConverterProvider;
import com.bamtech.sdk4.internal.token.AccessTokenProvider;
import com.bamtech.sdk4.media.DefaultQOSPlaybackEventListener;
import com.bamtech.sdk4.media.QOSNetworkHelper;
import com.bamtech.sdk4.plugin.PluginRegistry;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import javax.inject.Provider;

public final class MediaModule_ProvidesMediaClientFactory implements C2111c<MediaClient> {
    private final Provider<ConfigurationProvider> configurationProvider;
    private final Provider<ConverterProvider> convertersProvider;
    private final Provider<DefaultQOSPlaybackEventListener> defaultQosPlaybackEventListenerProvider;
    private final Provider<PbsGenerator> pbsGeneratorProvider;
    private final Provider<PluginRegistry> pluginRegistryProvider;
    private final Provider<QOSNetworkHelper> qosNetworkHelperProvider;
    private final Provider<AccessTokenProvider> tokenProvider;
    private final Provider<WidevineVerifier> widevineVerifierProvider;

    public MediaModule_ProvidesMediaClientFactory(Provider<ConfigurationProvider> provider, Provider<ConverterProvider> provider2, Provider<AccessTokenProvider> provider3, Provider<PluginRegistry> provider4, Provider<PbsGenerator> provider5, Provider<DefaultQOSPlaybackEventListener> provider6, Provider<QOSNetworkHelper> provider7, Provider<WidevineVerifier> provider8) {
        this.configurationProvider = provider;
        this.convertersProvider = provider2;
        this.tokenProvider = provider3;
        this.pluginRegistryProvider = provider4;
        this.pbsGeneratorProvider = provider5;
        this.defaultQosPlaybackEventListenerProvider = provider6;
        this.qosNetworkHelperProvider = provider7;
        this.widevineVerifierProvider = provider8;
    }

    public static MediaModule_ProvidesMediaClientFactory create(Provider<ConfigurationProvider> provider, Provider<ConverterProvider> provider2, Provider<AccessTokenProvider> provider3, Provider<PluginRegistry> provider4, Provider<PbsGenerator> provider5, Provider<DefaultQOSPlaybackEventListener> provider6, Provider<QOSNetworkHelper> provider7, Provider<WidevineVerifier> provider8) {
        MediaModule_ProvidesMediaClientFactory mediaModule_ProvidesMediaClientFactory = new MediaModule_ProvidesMediaClientFactory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
        return mediaModule_ProvidesMediaClientFactory;
    }

    public MediaClient get() {
        MediaClient providesMediaClient = MediaModule.providesMediaClient((ConfigurationProvider) this.configurationProvider.get(), (ConverterProvider) this.convertersProvider.get(), (AccessTokenProvider) this.tokenProvider.get(), (PluginRegistry) this.pluginRegistryProvider.get(), (PbsGenerator) this.pbsGeneratorProvider.get(), (DefaultQOSPlaybackEventListener) this.defaultQosPlaybackEventListenerProvider.get(), (QOSNetworkHelper) this.qosNetworkHelperProvider.get(), (WidevineVerifier) this.widevineVerifierProvider.get());
        C2113e.m8178a(providesMediaClient, "Cannot return null from a non-@Nullable @Provides method");
        return providesMediaClient;
    }
}
