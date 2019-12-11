package com.bamtech.sdk4.internal.plugin;

import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.core.Storage;
import com.bamtech.sdk4.internal.event.LogoutMode;
import com.bamtech.sdk4.internal.event.UserProfileEvent;
import com.bamtech.sdk4.internal.media.LocalPlayheadStore;
import com.bamtech.sdk4.internal.networking.ConverterProvider;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.telemetry.EventBuffer;
import com.bamtech.sdk4.internal.telemetry.dust.DustClientConstants;
import com.bamtech.sdk4.internal.token.AccessContextUpdater;
import com.bamtech.sdk4.internal.token.AccessTokenProvider;
import com.bamtech.sdk4.internal.token.AccountTokenExchangeProvider;
import com.bamtech.sdk4.internal.token.ExternalTokenExchangeProvider;
import com.bamtech.sdk4.media.PlaybackSessionProvider;
import com.bamtech.sdk4.media.QOSNetworkHelper;
import com.bamtech.sdk4.media.drm.DrmProvider;
import com.bamtech.sdk4.media.storage.PlayheadRecorder;
import com.bamtech.sdk4.plugin.ExtensionInstanceProvider;
import com.bamtech.sdk4.session.ReauthorizationHandlerRegistry;
import com.bamtech.sdk4.session.RenewSessionTransformers;
import com.bamtech.sdk4.session.SessionApi;
import com.bamtech.sdk4.session.SessionInfoExtension;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;
import okhttp3.OkHttpClient.Builder;
import p520io.reactivex.subjects.PublishSubject;

public final class DefaultExtensionProvider_Factory implements C2111c<DefaultExtensionProvider> {
    private final Provider<AccessContextUpdater> accessContextUpdaterProvider;
    private final Provider<AccessTokenProvider> accessTokenProvider;
    private final Provider<AccountTokenExchangeProvider> accountTokenExchangeProvider;
    private final Provider<ConfigurationProvider> configurationProvider;
    private final Provider<ConverterProvider> convertersProvider;
    private final Provider<DrmProvider[]> drmProvidersProvider;
    private final Provider<DustClientConstants> dustClientConstantsProvider;
    private final Provider<EventBuffer> dustEventBufferProvider;
    private final Provider<ExtensionInstanceProvider> extensionProvider;
    private final Provider<ExternalTokenExchangeProvider> externalTokenExchangeProvider;
    private final Provider<EventBuffer> glimpseEventBufferProvider;
    private final Provider<LocalPlayheadStore> localPlayheadStoreProvider;
    private final Provider<PublishSubject<LogoutMode>> notifierProvider;
    private final Provider<Builder> okHttpClientBuilderProvider;
    private final Provider<PlaybackSessionProvider> playbackSessionProvider;
    private final Provider<EventBuffer> qosEventBufferProvider;
    private final Provider<QOSNetworkHelper> qosNetworkHelperProvider;
    private final Provider<PlayheadRecorder> recorderProvider;
    private final Provider<RenewSessionTransformers> renewSessionTransformersProvider;
    private final Provider<ServiceTransaction> serviceTransactionProvider;
    private final Provider<ReauthorizationHandlerRegistry> sessionExchangeRegistryProvider;
    private final Provider<SessionApi> sessionExtensionApiProvider;
    private final Provider<SessionInfoExtension> sessionInfoExtensionProvider;
    private final Provider<Storage> storageProvider;
    private final Provider<String> userAgentProvider;
    private final Provider<PublishSubject<UserProfileEvent>> userProfileEventNotifierProvider;

    public DefaultExtensionProvider_Factory(Provider<ConfigurationProvider> provider, Provider<ServiceTransaction> provider2, Provider<Storage> provider3, Provider<ConverterProvider> provider4, Provider<String> provider5, Provider<Builder> provider6, Provider<AccessTokenProvider> provider7, Provider<AccessContextUpdater> provider8, Provider<AccountTokenExchangeProvider> provider9, Provider<ExternalTokenExchangeProvider> provider10, Provider<EventBuffer> provider11, Provider<EventBuffer> provider12, Provider<EventBuffer> provider13, Provider<SessionApi> provider14, Provider<SessionInfoExtension> provider15, Provider<PublishSubject<LogoutMode>> provider16, Provider<PublishSubject<UserProfileEvent>> provider17, Provider<RenewSessionTransformers> provider18, Provider<ReauthorizationHandlerRegistry> provider19, Provider<LocalPlayheadStore> provider20, Provider<ExtensionInstanceProvider> provider21, Provider<PlaybackSessionProvider> provider22, Provider<DrmProvider[]> provider23, Provider<PlayheadRecorder> provider24, Provider<DustClientConstants> provider25, Provider<QOSNetworkHelper> provider26) {
        this.configurationProvider = provider;
        this.serviceTransactionProvider = provider2;
        this.storageProvider = provider3;
        this.convertersProvider = provider4;
        this.userAgentProvider = provider5;
        this.okHttpClientBuilderProvider = provider6;
        this.accessTokenProvider = provider7;
        this.accessContextUpdaterProvider = provider8;
        this.accountTokenExchangeProvider = provider9;
        this.externalTokenExchangeProvider = provider10;
        this.dustEventBufferProvider = provider11;
        this.glimpseEventBufferProvider = provider12;
        this.qosEventBufferProvider = provider13;
        this.sessionExtensionApiProvider = provider14;
        this.sessionInfoExtensionProvider = provider15;
        this.notifierProvider = provider16;
        this.userProfileEventNotifierProvider = provider17;
        this.renewSessionTransformersProvider = provider18;
        this.sessionExchangeRegistryProvider = provider19;
        this.localPlayheadStoreProvider = provider20;
        this.extensionProvider = provider21;
        this.playbackSessionProvider = provider22;
        this.drmProvidersProvider = provider23;
        this.recorderProvider = provider24;
        this.dustClientConstantsProvider = provider25;
        this.qosNetworkHelperProvider = provider26;
    }

    public static DefaultExtensionProvider_Factory create(Provider<ConfigurationProvider> provider, Provider<ServiceTransaction> provider2, Provider<Storage> provider3, Provider<ConverterProvider> provider4, Provider<String> provider5, Provider<Builder> provider6, Provider<AccessTokenProvider> provider7, Provider<AccessContextUpdater> provider8, Provider<AccountTokenExchangeProvider> provider9, Provider<ExternalTokenExchangeProvider> provider10, Provider<EventBuffer> provider11, Provider<EventBuffer> provider12, Provider<EventBuffer> provider13, Provider<SessionApi> provider14, Provider<SessionInfoExtension> provider15, Provider<PublishSubject<LogoutMode>> provider16, Provider<PublishSubject<UserProfileEvent>> provider17, Provider<RenewSessionTransformers> provider18, Provider<ReauthorizationHandlerRegistry> provider19, Provider<LocalPlayheadStore> provider20, Provider<ExtensionInstanceProvider> provider21, Provider<PlaybackSessionProvider> provider22, Provider<DrmProvider[]> provider23, Provider<PlayheadRecorder> provider24, Provider<DustClientConstants> provider25, Provider<QOSNetworkHelper> provider26) {
        DefaultExtensionProvider_Factory defaultExtensionProvider_Factory = new DefaultExtensionProvider_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19, provider20, provider21, provider22, provider23, provider24, provider25, provider26);
        return defaultExtensionProvider_Factory;
    }

    public DefaultExtensionProvider get() {
        DefaultExtensionProvider defaultExtensionProvider = new DefaultExtensionProvider((ConfigurationProvider) this.configurationProvider.get(), this.serviceTransactionProvider, (Storage) this.storageProvider.get(), (ConverterProvider) this.convertersProvider.get(), (String) this.userAgentProvider.get(), (Builder) this.okHttpClientBuilderProvider.get(), (AccessTokenProvider) this.accessTokenProvider.get(), (AccessContextUpdater) this.accessContextUpdaterProvider.get(), (AccountTokenExchangeProvider) this.accountTokenExchangeProvider.get(), (ExternalTokenExchangeProvider) this.externalTokenExchangeProvider.get(), (EventBuffer) this.dustEventBufferProvider.get(), (EventBuffer) this.glimpseEventBufferProvider.get(), (EventBuffer) this.qosEventBufferProvider.get(), (SessionApi) this.sessionExtensionApiProvider.get(), (SessionInfoExtension) this.sessionInfoExtensionProvider.get(), (PublishSubject) this.notifierProvider.get(), (PublishSubject) this.userProfileEventNotifierProvider.get(), (RenewSessionTransformers) this.renewSessionTransformersProvider.get(), (ReauthorizationHandlerRegistry) this.sessionExchangeRegistryProvider.get(), (LocalPlayheadStore) this.localPlayheadStoreProvider.get(), (ExtensionInstanceProvider) this.extensionProvider.get(), (PlaybackSessionProvider) this.playbackSessionProvider.get(), (DrmProvider[]) this.drmProvidersProvider.get(), (PlayheadRecorder) this.recorderProvider.get(), (DustClientConstants) this.dustClientConstantsProvider.get(), (QOSNetworkHelper) this.qosNetworkHelperProvider.get());
        return defaultExtensionProvider;
    }
}
