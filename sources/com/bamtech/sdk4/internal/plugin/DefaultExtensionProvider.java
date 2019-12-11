package com.bamtech.sdk4.internal.plugin;

import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.core.Storage;
import com.bamtech.sdk4.internal.event.LogoutMode;
import com.bamtech.sdk4.internal.event.UserProfileEvent;
import com.bamtech.sdk4.internal.media.LocalPlayheadStore;
import com.bamtech.sdk4.internal.media.PlaybackSessionProviderExtension;
import com.bamtech.sdk4.internal.media.PlayheadRecorderExtension;
import com.bamtech.sdk4.internal.media.TestDrmProvidersExtension;
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
import com.bamtech.sdk4.plugin.ExtensionProvider;
import com.bamtech.sdk4.plugin.ExtensionRegistry;
import com.bamtech.sdk4.session.ReauthorizationHandlerRegistry;
import com.bamtech.sdk4.session.RenewSessionTransformers;
import com.bamtech.sdk4.session.SessionApi;
import com.bamtech.sdk4.session.SessionInfoExtension;
import javax.inject.Provider;
import kotlin.Metadata;
import okhttp3.OkHttpClient.Builder;
import p520io.reactivex.subjects.PublishSubject;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001Bû\u0001\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f\u0012\b\b\u0001\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0018\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0001\u0010\u001a\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u000e\b\u0001\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 \u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0 \u0012\u0006\u0010$\u001a\u00020%\u0012\u0006\u0010&\u001a\u00020'\u0012\u0006\u0010(\u001a\u00020)\u0012\u0006\u0010*\u001a\u00020+\u0012\u0006\u0010,\u001a\u00020-\u0012\f\u0010.\u001a\b\u0012\u0004\u0012\u0002000/\u0012\u0006\u00101\u001a\u000202\u0012\u0006\u00103\u001a\u000204\u0012\u0006\u00105\u001a\u000206¢\u0006\u0002\u00107J\u0010\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<H\u0016R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010.\u001a\b\u0012\u0004\u0012\u0002000/X\u0004¢\u0006\u0004\n\u0002\u00108R\u000e\u00103\u001a\u000204X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u000206X\u0004¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0 X\u0004¢\u0006\u0002\n\u0000¨\u0006="}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/plugin/DefaultExtensionProvider;", "Lcom/bamtech/sdk4/plugin/ExtensionProvider;", "configurationProvider", "Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;", "serviceTransactionProvider", "Ljavax/inject/Provider;", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "storage", "Lcom/bamtech/sdk4/internal/core/Storage;", "converters", "Lcom/bamtech/sdk4/internal/networking/ConverterProvider;", "userAgent", "", "okHttpClientBuilder", "Lokhttp3/OkHttpClient$Builder;", "accessTokenProvider", "Lcom/bamtech/sdk4/internal/token/AccessTokenProvider;", "accessContextUpdater", "Lcom/bamtech/sdk4/internal/token/AccessContextUpdater;", "accountTokenExchangeProvider", "Lcom/bamtech/sdk4/internal/token/AccountTokenExchangeProvider;", "externalTokenExchangeProvider", "Lcom/bamtech/sdk4/internal/token/ExternalTokenExchangeProvider;", "dustEventBuffer", "Lcom/bamtech/sdk4/internal/telemetry/EventBuffer;", "glimpseEventBuffer", "qosEventBuffer", "sessionExtensionApi", "Lcom/bamtech/sdk4/session/SessionApi;", "sessionInfoExtension", "Lcom/bamtech/sdk4/session/SessionInfoExtension;", "notifier", "Lio/reactivex/subjects/PublishSubject;", "Lcom/bamtech/sdk4/internal/event/LogoutMode;", "userProfileEventNotifier", "Lcom/bamtech/sdk4/internal/event/UserProfileEvent;", "renewSessionTransformers", "Lcom/bamtech/sdk4/session/RenewSessionTransformers;", "sessionExchangeRegistry", "Lcom/bamtech/sdk4/session/ReauthorizationHandlerRegistry;", "localPlayheadStore", "Lcom/bamtech/sdk4/internal/media/LocalPlayheadStore;", "extension", "Lcom/bamtech/sdk4/plugin/ExtensionInstanceProvider;", "playbackSessionProvider", "Lcom/bamtech/sdk4/media/PlaybackSessionProvider;", "drmProviders", "", "Lcom/bamtech/sdk4/media/drm/DrmProvider;", "recorder", "Lcom/bamtech/sdk4/media/storage/PlayheadRecorder;", "dustClientConstants", "Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientConstants;", "qosNetworkHelper", "Lcom/bamtech/sdk4/media/QOSNetworkHelper;", "(Lcom/bamtech/sdk4/internal/configuration/ConfigurationProvider;Ljavax/inject/Provider;Lcom/bamtech/sdk4/internal/core/Storage;Lcom/bamtech/sdk4/internal/networking/ConverterProvider;Ljava/lang/String;Lokhttp3/OkHttpClient$Builder;Lcom/bamtech/sdk4/internal/token/AccessTokenProvider;Lcom/bamtech/sdk4/internal/token/AccessContextUpdater;Lcom/bamtech/sdk4/internal/token/AccountTokenExchangeProvider;Lcom/bamtech/sdk4/internal/token/ExternalTokenExchangeProvider;Lcom/bamtech/sdk4/internal/telemetry/EventBuffer;Lcom/bamtech/sdk4/internal/telemetry/EventBuffer;Lcom/bamtech/sdk4/internal/telemetry/EventBuffer;Lcom/bamtech/sdk4/session/SessionApi;Lcom/bamtech/sdk4/session/SessionInfoExtension;Lio/reactivex/subjects/PublishSubject;Lio/reactivex/subjects/PublishSubject;Lcom/bamtech/sdk4/session/RenewSessionTransformers;Lcom/bamtech/sdk4/session/ReauthorizationHandlerRegistry;Lcom/bamtech/sdk4/internal/media/LocalPlayheadStore;Lcom/bamtech/sdk4/plugin/ExtensionInstanceProvider;Lcom/bamtech/sdk4/media/PlaybackSessionProvider;[Lcom/bamtech/sdk4/media/drm/DrmProvider;Lcom/bamtech/sdk4/media/storage/PlayheadRecorder;Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientConstants;Lcom/bamtech/sdk4/media/QOSNetworkHelper;)V", "[Lcom/bamtech/sdk4/media/drm/DrmProvider;", "register", "", "extensionRegistry", "Lcom/bamtech/sdk4/plugin/ExtensionRegistry;", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DefaultExtensionProvider.kt */
public final class DefaultExtensionProvider implements ExtensionProvider {
    private final AccessContextUpdater accessContextUpdater;
    private final AccessTokenProvider accessTokenProvider;
    private final AccountTokenExchangeProvider accountTokenExchangeProvider;
    private final ConfigurationProvider configurationProvider;
    private final ConverterProvider converters;
    private final DrmProvider[] drmProviders;
    private final DustClientConstants dustClientConstants;
    private final EventBuffer dustEventBuffer;
    private final ExtensionInstanceProvider extension;
    private final ExternalTokenExchangeProvider externalTokenExchangeProvider;
    private final EventBuffer glimpseEventBuffer;
    private final LocalPlayheadStore localPlayheadStore;
    private final PublishSubject<LogoutMode> notifier;
    private final Builder okHttpClientBuilder;
    private final PlaybackSessionProvider playbackSessionProvider;
    private final EventBuffer qosEventBuffer;
    private final QOSNetworkHelper qosNetworkHelper;
    private final PlayheadRecorder recorder;
    private final RenewSessionTransformers renewSessionTransformers;
    private final Provider<ServiceTransaction> serviceTransactionProvider;
    private final ReauthorizationHandlerRegistry sessionExchangeRegistry;
    private final SessionApi sessionExtensionApi;
    private final SessionInfoExtension sessionInfoExtension;
    private final Storage storage;
    private final String userAgent;
    private final PublishSubject<UserProfileEvent> userProfileEventNotifier;

    public DefaultExtensionProvider(ConfigurationProvider configurationProvider2, Provider<ServiceTransaction> provider, Storage storage2, ConverterProvider converterProvider, String str, Builder builder, AccessTokenProvider accessTokenProvider2, AccessContextUpdater accessContextUpdater2, AccountTokenExchangeProvider accountTokenExchangeProvider2, ExternalTokenExchangeProvider externalTokenExchangeProvider2, EventBuffer eventBuffer, EventBuffer eventBuffer2, EventBuffer eventBuffer3, SessionApi sessionApi, SessionInfoExtension sessionInfoExtension2, PublishSubject<LogoutMode> publishSubject, PublishSubject<UserProfileEvent> publishSubject2, RenewSessionTransformers renewSessionTransformers2, ReauthorizationHandlerRegistry reauthorizationHandlerRegistry, LocalPlayheadStore localPlayheadStore2, ExtensionInstanceProvider extensionInstanceProvider, PlaybackSessionProvider playbackSessionProvider2, DrmProvider[] drmProviderArr, PlayheadRecorder playheadRecorder, DustClientConstants dustClientConstants2, QOSNetworkHelper qOSNetworkHelper) {
        this.configurationProvider = configurationProvider2;
        this.serviceTransactionProvider = provider;
        this.storage = storage2;
        this.converters = converterProvider;
        this.userAgent = str;
        this.okHttpClientBuilder = builder;
        this.accessTokenProvider = accessTokenProvider2;
        this.accessContextUpdater = accessContextUpdater2;
        this.accountTokenExchangeProvider = accountTokenExchangeProvider2;
        this.externalTokenExchangeProvider = externalTokenExchangeProvider2;
        this.dustEventBuffer = eventBuffer;
        this.glimpseEventBuffer = eventBuffer2;
        this.qosEventBuffer = eventBuffer3;
        this.sessionExtensionApi = sessionApi;
        this.sessionInfoExtension = sessionInfoExtension2;
        this.notifier = publishSubject;
        this.userProfileEventNotifier = publishSubject2;
        this.renewSessionTransformers = renewSessionTransformers2;
        this.sessionExchangeRegistry = reauthorizationHandlerRegistry;
        this.localPlayheadStore = localPlayheadStore2;
        this.extension = extensionInstanceProvider;
        this.playbackSessionProvider = playbackSessionProvider2;
        this.drmProviders = drmProviderArr;
        this.recorder = playheadRecorder;
        this.dustClientConstants = dustClientConstants2;
        this.qosNetworkHelper = qOSNetworkHelper;
    }

    public void register(ExtensionRegistry extensionRegistry) {
        extensionRegistry.registerExtension(new ConfigurationProviderExtension(this.configurationProvider));
        extensionRegistry.registerExtension(new TransactionProviderExtension(this.serviceTransactionProvider));
        extensionRegistry.registerExtension(new StorageExtension(this.storage));
        extensionRegistry.registerExtension(new ConverterProviderExtension(this.converters));
        extensionRegistry.registerExtension(new UserAgentProvider(this.userAgent));
        extensionRegistry.registerExtension(new OkHttpBuilderProvider(this.okHttpClientBuilder));
        extensionRegistry.registerExtension(new DustEventBufferExtension(this.dustEventBuffer));
        extensionRegistry.registerExtension(new GlimpseEventBufferExtension(this.glimpseEventBuffer));
        extensionRegistry.registerExtension(new QOSEventBufferExtension(this.qosEventBuffer));
        extensionRegistry.registerExtension(this.accessTokenProvider);
        extensionRegistry.registerExtension(this.accessContextUpdater);
        extensionRegistry.registerExtension(this.accountTokenExchangeProvider);
        extensionRegistry.registerExtension(this.externalTokenExchangeProvider);
        extensionRegistry.registerExtension(this.sessionExtensionApi);
        extensionRegistry.registerExtension(this.sessionInfoExtension);
        extensionRegistry.registerExtension(new NotifierExtension(this.notifier));
        extensionRegistry.registerExtension(new UserProfileEventExtension(this.userProfileEventNotifier));
        extensionRegistry.registerExtension(new RenewSessionTransformerExtension(this.renewSessionTransformers));
        extensionRegistry.registerExtension(new DefaultAuthenticationExpiredCallbackExtension(null, 1, null));
        extensionRegistry.registerExtension(new SessionExchangerStoreExtension(this.sessionExchangeRegistry));
        extensionRegistry.registerExtension(this.localPlayheadStore);
        extensionRegistry.registerExtension(this.extension);
        extensionRegistry.registerExtension(new PlaybackSessionProviderExtension(this.playbackSessionProvider));
        extensionRegistry.registerExtension(new TestDrmProvidersExtension(this.drmProviders));
        extensionRegistry.registerExtension(new PlayheadRecorderExtension(this.recorder));
        extensionRegistry.registerExtension(new DustClientConstantsExtension(this.dustClientConstants));
        extensionRegistry.registerExtension(this.qosNetworkHelper);
    }
}
