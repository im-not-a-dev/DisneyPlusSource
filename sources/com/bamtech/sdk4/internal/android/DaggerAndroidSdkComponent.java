package com.bamtech.sdk4.internal.android;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.bamtech.core.logging.DefaultLogger;
import com.bamtech.core.logging.LogDispatcher;
import com.bamtech.core.logging.LogSink.Collection;
import com.bamtech.core.networking.converters.Converter;
import com.bamtech.sdk4.Session;
import com.bamtech.sdk4.android.SdkSession;
import com.bamtech.sdk4.android.SdkSession_Factory;
import com.bamtech.sdk4.bookmarks.storage.BookmarksDao;
import com.bamtech.sdk4.bookmarks.storage.BookmarksDatabase;
import com.bamtech.sdk4.bookmarks.storage.DefaultLocalBookmarkStore;
import com.bamtech.sdk4.bookmarks.storage.DefaultLocalBookmarkStore_Factory;
import com.bamtech.sdk4.customerservice.CustomerServiceApi;
import com.bamtech.sdk4.customerservice.DefaultCustomerServiceApi_Factory;
import com.bamtech.sdk4.edge.DefaultEdgeClient_Factory;
import com.bamtech.sdk4.edge.DefaultEdgeManager_Factory;
import com.bamtech.sdk4.edge.EdgeClient;
import com.bamtech.sdk4.edge.EdgeManager;
import com.bamtech.sdk4.internal.account.legacy.LegacyExtensionModule_AccountExtensionFactory;
import com.bamtech.sdk4.internal.account.legacy.LegacyExtensionModule_ContentExtensionFactory;
import com.bamtech.sdk4.internal.android.sinks.BamLogcatLogSink_Factory;
import com.bamtech.sdk4.internal.android.sinks.DustLogSink;
import com.bamtech.sdk4.internal.android.sinks.DustLogSink_Factory;
import com.bamtech.sdk4.internal.bookmarks.BookmarksRepositoryModule;
import com.bamtech.sdk4.internal.bookmarks.BookmarksRepositoryModule_BookmarkDaoFactory;
import com.bamtech.sdk4.internal.bookmarks.BookmarksRepositoryModule_BookmarksDatabaseFactory;
import com.bamtech.sdk4.internal.configuration.BootstrapConfiguration;
import com.bamtech.sdk4.internal.configuration.ConfigurationClient;
import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.configuration.DefaultConfigurationClient_Factory;
import com.bamtech.sdk4.internal.configuration.DefaultConfigurationManager;
import com.bamtech.sdk4.internal.configuration.DefaultConfigurationManager_Factory;
import com.bamtech.sdk4.internal.configuration.DefaultConfigurationProvider;
import com.bamtech.sdk4.internal.configuration.DefaultConfigurationProvider_Factory;
import com.bamtech.sdk4.internal.configuration.DefaultNetworkConfigurationProvider_Factory;
import com.bamtech.sdk4.internal.configuration.EmbeddedConfiguration;
import com.bamtech.sdk4.internal.configuration.NetworkConfigurationProvider;
import com.bamtech.sdk4.internal.core.Storage;
import com.bamtech.sdk4.internal.core.logging.BaseLoggerModule;
import com.bamtech.sdk4.internal.core.logging.BaseLoggerModule_LogDispatcherFactory;
import com.bamtech.sdk4.internal.core.logging.BaseLoggerModule_LoggerFactory;
import com.bamtech.sdk4.internal.customerservice.CustomerServiceClient;
import com.bamtech.sdk4.internal.customerservice.CustomerServiceManager;
import com.bamtech.sdk4.internal.customerservice.DefaultCustomerServiceClient_Factory;
import com.bamtech.sdk4.internal.customerservice.DefaultCustomerServiceManager_Factory;
import com.bamtech.sdk4.internal.device.DefaultDeviceClient_Factory;
import com.bamtech.sdk4.internal.device.DefaultDeviceManager_Factory;
import com.bamtech.sdk4.internal.device.DeviceClient;
import com.bamtech.sdk4.internal.device.DeviceManager;
import com.bamtech.sdk4.internal.event.LogoutMode;
import com.bamtech.sdk4.internal.event.UserProfileEvent;
import com.bamtech.sdk4.internal.location.DefaultLocationResolver_Factory;
import com.bamtech.sdk4.internal.location.LocationResolver;
import com.bamtech.sdk4.internal.media.BookmarksStorageContextModule;
import com.bamtech.sdk4.internal.media.BookmarksStorageContextModule_BookmarksContextFactory;
import com.bamtech.sdk4.internal.media.DefaultMediaManager_Factory;
import com.bamtech.sdk4.internal.media.DefaultOnlineMediaClient;
import com.bamtech.sdk4.internal.media.DefaultOnlineMediaClient_Factory;
import com.bamtech.sdk4.internal.media.DefaultPlaybackSession;
import com.bamtech.sdk4.internal.media.DefaultStreamSampler;
import com.bamtech.sdk4.internal.media.DrmProviderModule;
import com.bamtech.sdk4.internal.media.DrmProviderModule_ProvidersFactory;
import com.bamtech.sdk4.internal.media.DrmProviderModule_ProvidesTestDrmProvidersFactory;
import com.bamtech.sdk4.internal.media.MediaClient;
import com.bamtech.sdk4.internal.media.MediaManager;
import com.bamtech.sdk4.internal.media.MediaModule_ProvidesMediaClientFactory;
import com.bamtech.sdk4.internal.media.PbsGenerator_Factory;
import com.bamtech.sdk4.internal.media.PlaybackSessionModule;
import com.bamtech.sdk4.internal.media.PlaybackSessionModule_PlayerAdapterFactory;
import com.bamtech.sdk4.internal.media.PlaybackSessionModule_SessionFactory;
import com.bamtech.sdk4.internal.media.PlaybackSessionModule_StreamSamplerFactory;
import com.bamtech.sdk4.internal.media.PlaybackSessionSubcomponent;
import com.bamtech.sdk4.internal.media.StreamSampler;
import com.bamtech.sdk4.internal.media.WidevineVerifier_Factory;
import com.bamtech.sdk4.internal.media.adengine.AdEngineManager;
import com.bamtech.sdk4.internal.media.adengine.DefaultAdEngineClient;
import com.bamtech.sdk4.internal.media.adengine.DefaultAdEngineClient_Factory;
import com.bamtech.sdk4.internal.media.adengine.DefaultAdEngineManager_Factory;
import com.bamtech.sdk4.internal.media.drm.DefaultPlayReadyDrmProvider_Factory;
import com.bamtech.sdk4.internal.media.drm.DefaultWidevineDrmProvider_Factory;
import com.bamtech.sdk4.internal.media.drm.TestWidevineDrmProvider_Factory;
import com.bamtech.sdk4.internal.media.storage.playhead.DefaultLocalPlayheadStore;
import com.bamtech.sdk4.internal.media.storage.playhead.DefaultLocalPlayheadStore_Factory;
import com.bamtech.sdk4.internal.media.storage.playhead.PlayheadDao;
import com.bamtech.sdk4.internal.media.storage.playhead.PlayheadDatabase;
import com.bamtech.sdk4.internal.media.storage.playhead.PlayheadRepositoryModule;
import com.bamtech.sdk4.internal.media.storage.playhead.PlayheadRepositoryModule_PlayheadDaoFactory;
import com.bamtech.sdk4.internal.media.storage.playhead.PlayheadRepositoryModule_PlayheadDatabaseFactory;
import com.bamtech.sdk4.internal.networking.DefaultConverterProvider;
import com.bamtech.sdk4.internal.networking.DefaultConverterProvider_Factory;
import com.bamtech.sdk4.internal.networking.GsonModule;
import com.bamtech.sdk4.internal.networking.GsonModule_DustEventConverterFactory;
import com.bamtech.sdk4.internal.networking.GsonModule_IdentityConverterFactory;
import com.bamtech.sdk4.internal.networking.GsonModule_IdentityConverterForStorageFactory;
import com.bamtech.sdk4.internal.networking.GsonModule_NullIdentityConverterFactory;
import com.bamtech.sdk4.internal.networking.GsonModule_SnakeConverterFactory;
import com.bamtech.sdk4.internal.networking.NetworkModule;
import com.bamtech.sdk4.internal.networking.NetworkModule_MediaOkHttpClientBuilderFactory;
import com.bamtech.sdk4.internal.networking.NetworkModule_OkHttpClientBuilderFactory;
import com.bamtech.sdk4.internal.networking.NetworkModule_OkHttpClientFactory;
import com.bamtech.sdk4.internal.networking.NetworkModule_RawBytesConverterFactory;
import com.bamtech.sdk4.internal.networking.NetworkModule_StringConverterFactory;
import com.bamtech.sdk4.internal.networking.NetworkModule_TrustManagerFactory;
import com.bamtech.sdk4.internal.networking.cookies.CookieCache;
import com.bamtech.sdk4.internal.networking.cookies.CookiePersistor;
import com.bamtech.sdk4.internal.networking.cookies.DefaultCookieCache_Factory;
import com.bamtech.sdk4.internal.networking.cookies.PersistentCookieJar;
import com.bamtech.sdk4.internal.networking.cookies.PersistentCookieJar_Factory;
import com.bamtech.sdk4.internal.plugin.DefaultExtensionProvider;
import com.bamtech.sdk4.internal.plugin.DefaultExtensionProvider_Factory;
import com.bamtech.sdk4.internal.plugin.DefaultPluginRegistry;
import com.bamtech.sdk4.internal.plugin.DefaultPluginRegistry_Factory;
import com.bamtech.sdk4.internal.plugin.ExtensionProviderModule;
import com.bamtech.sdk4.internal.plugin.ExtensionProviderModule_InstanceProviderFactory;
import com.bamtech.sdk4.internal.service.DebugServiceTransaction_Factory;
import com.bamtech.sdk4.internal.service.DefaultServiceTransaction_Factory;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.service.ServiceTransactionModule_TransactionFactory;
import com.bamtech.sdk4.internal.session.DefaultInternalSessionStateProvider;
import com.bamtech.sdk4.internal.session.DefaultInternalSessionStateProvider_Factory;
import com.bamtech.sdk4.internal.session.DefaultRenewSessionTransformers_Factory;
import com.bamtech.sdk4.internal.session.DefaultSessionClient_Factory;
import com.bamtech.sdk4.internal.session.DefaultSessionInfoExtension;
import com.bamtech.sdk4.internal.session.DefaultSessionInfoExtension_Factory;
import com.bamtech.sdk4.internal.session.DefaultSessionInfoUpdater_Factory;
import com.bamtech.sdk4.internal.session.NotifierModule_NotifierFactory;
import com.bamtech.sdk4.internal.session.NotifierModule_UserProfileEventNotifierFactory;
import com.bamtech.sdk4.internal.session.SessionClient;
import com.bamtech.sdk4.internal.session.SessionInfoUpdater;
import com.bamtech.sdk4.internal.session.SessionRenewalModule_AuthorizerExtensionFactory;
import com.bamtech.sdk4.internal.telemetry.DefaultTelemetryClient_Factory;
import com.bamtech.sdk4.internal.telemetry.ErrorHandler;
import com.bamtech.sdk4.internal.telemetry.EventBuffer;
import com.bamtech.sdk4.internal.telemetry.RecoverErrorHandler_Factory;
import com.bamtech.sdk4.internal.telemetry.StreamSampleTelemetryClient_Factory;
import com.bamtech.sdk4.internal.telemetry.TelemetryClient;
import com.bamtech.sdk4.internal.telemetry.TelemetryModule;
import com.bamtech.sdk4.internal.telemetry.TelemetryModule_DustBufferFactory;
import com.bamtech.sdk4.internal.telemetry.TelemetryModule_DustStorageFactory;
import com.bamtech.sdk4.internal.telemetry.TelemetryModule_GlimpseBufferFactory;
import com.bamtech.sdk4.internal.telemetry.TelemetryModule_GlimpseStorageFactory;
import com.bamtech.sdk4.internal.telemetry.TelemetryModule_QosBufferFactory;
import com.bamtech.sdk4.internal.telemetry.TelemetryModule_QosFactory;
import com.bamtech.sdk4.internal.telemetry.TelemetryModule_QosStorageFactory;
import com.bamtech.sdk4.internal.telemetry.TelemetryModule_TelemetryBufferFactory;
import com.bamtech.sdk4.internal.telemetry.TelemetryModule_TelemetryStorageFactory;
import com.bamtech.sdk4.internal.telemetry.TelemetryStorage;
import com.bamtech.sdk4.internal.telemetry.dust.DustClientConstants;
import com.bamtech.sdk4.internal.token.DefaultAccessContextUpdater;
import com.bamtech.sdk4.internal.token.DefaultAccessContextUpdater_Factory;
import com.bamtech.sdk4.internal.token.DefaultDeviceAccessContextHelper_Factory;
import com.bamtech.sdk4.internal.token.DefaultRefreshAccessContextHelper_Factory;
import com.bamtech.sdk4.internal.token.DefaultRefreshActionPlanner_Factory;
import com.bamtech.sdk4.internal.token.DefaultTokenClient;
import com.bamtech.sdk4.internal.token.DefaultTokenClient_Factory;
import com.bamtech.sdk4.internal.token.DefaultTokenExchangeManager;
import com.bamtech.sdk4.internal.token.DefaultTokenExchangeManager_Factory;
import com.bamtech.sdk4.internal.token.DeviceAccessContextHelper;
import com.bamtech.sdk4.internal.token.RefreshAccessContextHelper;
import com.bamtech.sdk4.internal.token.RefreshActionPlanner;
import com.bamtech.sdk4.location.GeoProvider;
import com.bamtech.sdk4.media.DefaultMediaApi_Factory;
import com.bamtech.sdk4.media.DefaultPlaybackSessionProvider;
import com.bamtech.sdk4.media.DefaultPlaybackSessionProvider_Factory;
import com.bamtech.sdk4.media.DefaultQOSPlaybackEventListener;
import com.bamtech.sdk4.media.MediaApi;
import com.bamtech.sdk4.media.MediaCapabilitiesProvider;
import com.bamtech.sdk4.media.PlaybackSession;
import com.bamtech.sdk4.media.QOSNetworkHelper_Factory;
import com.bamtech.sdk4.media.adengine.AdvertisingIdProvider;
import com.bamtech.sdk4.media.drm.DefaultSilkDrmProvider_Factory;
import com.bamtech.sdk4.media.drm.DrmProvider;
import com.bamtech.sdk4.media.storage.DefaultPlayheadRecorder;
import com.bamtech.sdk4.media.storage.DefaultPlayheadRecorder_Factory;
import com.bamtech.sdk4.plugin.ExtensionInstanceProvider;
import com.bamtech.sdk4.plugin.PluginRegistry;
import com.bamtech.sdk4.session.DefaultSessionApi;
import com.bamtech.sdk4.session.DefaultSessionApi_Factory;
import com.bamtech.sdk4.session.DefaultSessionExtension_Factory;
import com.bamtech.sdk4.session.ReauthorizationHandlerRegistry;
import com.bamtech.sdk4.session.RenewSessionTransformers;
import com.bamtech.sdk4.session.SessionExtension;
import com.bamtech.sdk4.session.SessionInfoExtension;
import com.bamtech.sdk4.session.SessionInfoStorage;
import com.bamtech.shadow.dagger.p048a.C2109a;
import com.bamtech.shadow.dagger.p048a.C2110b;
import com.bamtech.shadow.dagger.p048a.C2112d;
import com.bamtech.shadow.dagger.p048a.C2113e;
import com.google.common.base.Optional;
import java.io.File;
import java.net.Proxy;
import java.security.KeyStore;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import javax.net.ssl.X509TrustManager;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor.Level;
import p520io.reactivex.subjects.PublishSubject;

public final class DaggerAndroidSdkComponent implements AndroidSdkComponent {
    private LegacyExtensionModule_AccountExtensionFactory accountExtensionProvider;
    private Provider<AdEngineManager> adEngineManagerProvider;
    private Provider<AdvertisingIdProvider> advertisingIdProvider;
    private Provider<Application> applicationProvider;
    private SessionRenewalModule_AuthorizerExtensionFactory authorizerExtensionProvider;
    private BamLogcatLogSink_Factory bamLogcatLogSinkProvider;
    private Provider<DustClientConstants> baseDustClientProvider;
    private BookmarksRepositoryModule_BookmarkDaoFactory bookmarkDaoProvider;
    private Provider<Context> bookmarksContextProvider;
    private BookmarksRepositoryModule_BookmarksDatabaseFactory bookmarksDatabaseProvider;
    private Provider<BootstrapConfiguration> bootstrapConfigurationProvider;
    private Provider<ConfigurationClient> clientProvider;
    private Provider<EdgeClient> clientProvider2;
    private Provider<TelemetryClient> clientProvider3;
    private Provider<DeviceClient> clientProvider4;
    private LegacyExtensionModule_ContentExtensionFactory contentExtensionProvider;
    private Provider<CookieCache> cookieCacheProvider;
    private Provider<CookiePersistor> cookiePersistorProvider;
    private Provider<SharedPreferences> cookiePreferencesProvider;
    private Provider<Map<String, String>> correlationIdsProvider;
    private Provider<CustomerServiceClient> customerServiceClientProvider;
    private Provider<CustomerServiceManager> customerServiceManagerProvider;
    private Provider<CustomerServiceApi> customerServiceProvider;
    private DebugServiceTransaction_Factory debugServiceTransactionProvider;
    private Provider<DefaultAccessContextUpdater> defaultAccessContextUpdaterProvider;
    private Provider<DefaultAdEngineClient> defaultAdEngineClientProvider;
    private DefaultAdEngineManager_Factory defaultAdEngineManagerProvider;
    private DefaultConfigurationClient_Factory defaultConfigurationClientProvider;
    private Provider<DefaultConfigurationManager> defaultConfigurationManagerProvider;
    /* access modifiers changed from: private */
    public Provider<DefaultConfigurationProvider> defaultConfigurationProvider;
    private Provider<DefaultConverterProvider> defaultConverterProvider;
    private DefaultCustomerServiceApi_Factory defaultCustomerServiceApiProvider;
    private DefaultCustomerServiceClient_Factory defaultCustomerServiceClientProvider;
    private DefaultCustomerServiceManager_Factory defaultCustomerServiceManagerProvider;
    private DefaultDeviceAccessContextHelper_Factory defaultDeviceAccessContextHelperProvider;
    private DefaultDeviceClient_Factory defaultDeviceClientProvider;
    private DefaultDeviceManager_Factory defaultDeviceManagerProvider;
    private DefaultEdgeClient_Factory defaultEdgeClientProvider;
    private DefaultEdgeManager_Factory defaultEdgeManagerProvider;
    private Provider<DefaultExtensionProvider> defaultExtensionProvider;
    private Provider<DefaultInternalSessionStateProvider> defaultInternalSessionStateProvider;
    private DefaultLocalBookmarkStore_Factory defaultLocalBookmarkStoreProvider;
    private DefaultLocalPlayheadStore_Factory defaultLocalPlayheadStoreProvider;
    private DefaultLocationResolver_Factory defaultLocationResolverProvider;
    private DefaultMediaApi_Factory defaultMediaApiProvider;
    private DefaultMediaManager_Factory defaultMediaManagerProvider;
    private DefaultNetworkConfigurationProvider_Factory defaultNetworkConfigurationProvider;
    private Provider<DefaultOnlineMediaClient> defaultOnlineMediaClientProvider;
    private DefaultPlayReadyDrmProvider_Factory defaultPlayReadyDrmProvider;
    private Provider<DefaultPlaybackSessionProvider> defaultPlaybackSessionProvider;
    private DefaultPlayheadRecorder_Factory defaultPlayheadRecorderProvider;
    private Provider<DefaultPluginRegistry> defaultPluginRegistryProvider;
    private DefaultRefreshAccessContextHelper_Factory defaultRefreshAccessContextHelperProvider;
    private DefaultRefreshActionPlanner_Factory defaultRefreshActionPlannerProvider;
    private DefaultRenewSessionTransformers_Factory defaultRenewSessionTransformersProvider;
    private DefaultServiceTransaction_Factory defaultServiceTransactionProvider;
    private Provider<DefaultSessionApi> defaultSessionApiProvider;
    private DefaultSessionClient_Factory defaultSessionClientProvider;
    private DefaultSessionExtension_Factory defaultSessionExtensionProvider;
    private Provider<DefaultSessionInfoExtension> defaultSessionInfoExtensionProvider;
    private DefaultSessionInfoStorage_Factory defaultSessionInfoStorageProvider;
    private DefaultSessionInfoUpdater_Factory defaultSessionInfoUpdaterProvider;
    private DefaultSilkDrmProvider_Factory defaultSilkDrmProvider;
    private DefaultTelemetryClient_Factory defaultTelemetryClientProvider;
    private Provider<DefaultTokenClient> defaultTokenClientProvider;
    private Provider<DefaultTokenExchangeManager> defaultTokenExchangeManagerProvider;
    private DefaultWidevineDrmProvider_Factory defaultWidevineDrmProvider;
    private Provider<Boolean> disableNetworkSecurityProvider;
    private Provider<EventBuffer> dustBufferProvider;
    private Provider<File> dustDirProvider;
    private Provider<Converter> dustEventConverterProvider;
    private Provider<DustLogSink> dustLogSinkProvider;
    private Provider<TelemetryStorage> dustStorageProvider;
    private Provider<EmbeddedConfiguration> embeddedConfigurationProvider;
    private Provider<GeoProvider> geoProvider;
    private Provider<EventBuffer> glimpseBufferProvider;
    private Provider<File> glimpseDirProvider;
    private Provider<TelemetryStorage> glimpseStorageProvider;
    private Provider<ErrorHandler> handlerProvider;
    private Provider<Level> httpLoggingLevelProvider;
    private Provider<Converter> identityConverterForStorageProvider;
    private Provider<Converter> identityConverterProvider;
    private Provider<ExtensionInstanceProvider> instanceProvider;
    private Provider<KeyStore> keyStoreProvider;
    private Provider<LocationResolver> locationResolverProvider;
    private Provider<LogDispatcher> logDispatcherProvider;
    private Provider<DefaultLogger> loggerProvider;
    private Provider<DeviceManager> managerProvider;
    private Provider<EdgeManager> managerProvider2;
    private Provider<MediaApi> mediaApiProvider;
    private Provider<MediaCapabilitiesProvider> mediaCapabilitiesProvider;
    private Provider<MediaManager> mediaManagerProvider;
    private Provider<okhttp3.OkHttpClient.Builder> mediaOkHttpClientBuilderProvider;
    private Provider<NetworkConfigurationProvider> networkConfigurationProvider;
    private Provider<PublishSubject<LogoutMode>> notifierProvider;
    private Provider<Converter> nullIdentityConverterProvider;
    private Provider<Cache> okHttpCacheProvider;
    private Provider<okhttp3.OkHttpClient.Builder> okHttpClientBuilderProvider;
    private Provider<OkHttpClient> okHttpClientProvider;
    private Provider<Optional<Collection>> optionalOfCollectionProvider;
    private Provider<Optional<Level>> optionalOfLevelProvider;
    private PbsGenerator_Factory pbsGeneratorProvider;
    private Provider<PersistentCookieJar> persistentCookieJarProvider;
    private Provider<com.bamtech.sdk4.internal.media.PlaybackSessionSubcomponent.Builder> playbackSessionSubcomponentBuilderProvider;
    private PlayheadRepositoryModule_PlayheadDaoFactory playheadDaoProvider;
    private PlayheadRepositoryModule_PlayheadDatabaseFactory playheadDatabaseProvider;
    private PreferencesCookiePersistor_Factory preferencesCookiePersistorProvider;
    private PreferencesStorage_Factory preferencesStorageProvider;
    /* access modifiers changed from: private */
    public Provider<Set<DrmProvider>> providersProvider;
    private Provider<MediaClient> providesMediaClientProvider;
    private Provider<DrmProvider[]> providesTestDrmProvidersProvider;
    private Provider<Proxy> proxyProvider;
    private QOSNetworkHelper_Factory qOSNetworkHelperProvider;
    private Provider<EventBuffer> qosBufferProvider;
    private Provider<File> qosDirProvider;
    /* access modifiers changed from: private */
    public Provider<DefaultQOSPlaybackEventListener> qosProvider;
    private Provider<TelemetryStorage> qosStorageProvider;
    private Provider<Converter> rawBytesConverterProvider;
    private Provider<ReauthorizationHandlerRegistry> reauthorizeHandlerStorageProvider;
    private Provider<RefreshAccessContextHelper> refreshAccessContextHelperProvider;
    private Provider<RefreshActionPlanner> refreshActionDeciderProvider;
    private Provider<DeviceAccessContextHelper> refreshDeviceAccessContextHelperProvider;
    private Provider<SdkSession> sdkSessionProvider;
    private Provider<Storage> secureStorageProvider;
    private Provider<SessionClient> sessionClientProvider;
    private Provider<SessionExtension> sessionExtensionProvider;
    private Provider<SessionInfoUpdater> sessionInfoUpdaterProvider;
    private Provider<SessionInfoStorage> sessionStorageProvider;
    private Provider<RenewSessionTransformers> sessionTransformerProvider;
    private Provider<SharedPreferences> sharedPreferencesProvider;
    private Provider<Collection> sinksProvider;
    private Provider<Converter> snakeConverterProvider;
    private StreamSampleTelemetryClient_Factory streamSampleTelemetryClientProvider;
    private Provider<Converter> stringConverterProvider;
    /* access modifiers changed from: private */
    public Provider<EventBuffer> telemetryBufferProvider;
    private Provider<File> telemetryDirProvider;
    private Provider<TelemetryStorage> telemetryStorageProvider;
    private TestWidevineDrmProvider_Factory testWidevineDrmProvider;
    /* access modifiers changed from: private */
    public Provider<ServiceTransaction> transactionProvider;
    private Provider<X509TrustManager> trustManagerProvider;
    private Provider<Optional<String>> userAgentOptionalOfStringProvider;
    private Provider<String> userAgentProvider;
    private Provider<PublishSubject<UserProfileEvent>> userProfileEventNotifierProvider;
    private WidevineVerifier_Factory widevineVerifierProvider;

    private static final class Builder implements com.bamtech.sdk4.internal.android.AndroidSdkComponent.Builder {
        /* access modifiers changed from: private */
        public AdvertisingIdProvider advertisingIdProvider;
        /* access modifiers changed from: private */
        public AndroidConfigurationModule androidConfigurationModule;
        /* access modifiers changed from: private */
        public AndroidLoggerModule androidLoggerModule;
        /* access modifiers changed from: private */
        public Application application;
        /* access modifiers changed from: private */
        public ApplicationModule applicationModule;
        /* access modifiers changed from: private */
        public BaseLoggerModule baseLoggerModule;
        /* access modifiers changed from: private */
        public BookmarksStorageContextModule bookmarksStorageContextModule;
        /* access modifiers changed from: private */
        public BootstrapConfiguration bootstrapConfiguration;
        /* access modifiers changed from: private */
        public Map<String, String> correlationIds;
        /* access modifiers changed from: private */
        public Boolean disableNetworkSecurity;
        /* access modifiers changed from: private */
        public DrmProviderModule drmProviderModule;
        /* access modifiers changed from: private */
        public DustModule dustModule;
        /* access modifiers changed from: private */
        public ExtensionProviderModule extensionProviderModule;
        /* access modifiers changed from: private */
        public GeoProvider geoProvider;
        /* access modifiers changed from: private */
        public GsonModule gsonModule;
        /* access modifiers changed from: private */
        public Level httpLoggingLevel;
        /* access modifiers changed from: private */
        public KeyStore keyStore;
        /* access modifiers changed from: private */
        public MediaCapabilitiesProvider mediaCapabilitiesProvider;
        /* access modifiers changed from: private */
        public NetworkModule networkModule;
        /* access modifiers changed from: private */
        public Cache okHttpCache;
        /* access modifiers changed from: private */
        public Proxy proxy;
        /* access modifiers changed from: private */
        public ReauthorizationHandlerRegistry reauthorizeHandlerStorage;
        /* access modifiers changed from: private */
        public TelemetryModule telemetryModule;

        private Builder() {
        }

        public AndroidSdkComponent build() {
            if (this.gsonModule == null) {
                this.gsonModule = new GsonModule();
            }
            if (this.networkModule == null) {
                this.networkModule = new NetworkModule();
            }
            if (this.androidConfigurationModule == null) {
                this.androidConfigurationModule = new AndroidConfigurationModule();
            }
            if (this.applicationModule == null) {
                this.applicationModule = new ApplicationModule();
            }
            if (this.dustModule == null) {
                this.dustModule = new DustModule();
            }
            if (this.telemetryModule == null) {
                this.telemetryModule = new TelemetryModule();
            }
            if (this.androidLoggerModule == null) {
                this.androidLoggerModule = new AndroidLoggerModule();
            }
            if (this.baseLoggerModule == null) {
                this.baseLoggerModule = new BaseLoggerModule();
            }
            if (this.bookmarksStorageContextModule == null) {
                this.bookmarksStorageContextModule = new BookmarksStorageContextModule();
            }
            if (this.extensionProviderModule == null) {
                this.extensionProviderModule = new ExtensionProviderModule();
            }
            if (this.drmProviderModule == null) {
                this.drmProviderModule = new DrmProviderModule();
            }
            String str = " must be set";
            if (this.bootstrapConfiguration == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(BootstrapConfiguration.class.getCanonicalName());
                sb.append(str);
                throw new IllegalStateException(sb.toString());
            } else if (this.httpLoggingLevel == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Level.class.getCanonicalName());
                sb2.append(str);
                throw new IllegalStateException(sb2.toString());
            } else if (this.disableNetworkSecurity == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(Boolean.class.getCanonicalName());
                sb3.append(str);
                throw new IllegalStateException(sb3.toString());
            } else if (this.application == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(Application.class.getCanonicalName());
                sb4.append(str);
                throw new IllegalStateException(sb4.toString());
            } else if (this.geoProvider == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(GeoProvider.class.getCanonicalName());
                sb5.append(str);
                throw new IllegalStateException(sb5.toString());
            } else if (this.correlationIds == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(Map.class.getCanonicalName());
                sb6.append(str);
                throw new IllegalStateException(sb6.toString());
            } else if (this.advertisingIdProvider == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(AdvertisingIdProvider.class.getCanonicalName());
                sb7.append(str);
                throw new IllegalStateException(sb7.toString());
            } else if (this.reauthorizeHandlerStorage != null) {
                return new DaggerAndroidSdkComponent(this);
            } else {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(ReauthorizationHandlerRegistry.class.getCanonicalName());
                sb8.append(str);
                throw new IllegalStateException(sb8.toString());
            }
        }

        public Builder advertisingIdProvider(AdvertisingIdProvider advertisingIdProvider2) {
            C2113e.m8177a(advertisingIdProvider2);
            this.advertisingIdProvider = advertisingIdProvider2;
            return this;
        }

        public Builder application(Application application2) {
            C2113e.m8177a(application2);
            this.application = application2;
            return this;
        }

        public Builder bootstrapConfiguration(BootstrapConfiguration bootstrapConfiguration2) {
            C2113e.m8177a(bootstrapConfiguration2);
            this.bootstrapConfiguration = bootstrapConfiguration2;
            return this;
        }

        public Builder correlationIds(Map<String, String> map) {
            C2113e.m8177a(map);
            this.correlationIds = map;
            return this;
        }

        public Builder disableNetworkSecurity(boolean z) {
            Boolean valueOf = Boolean.valueOf(z);
            C2113e.m8177a(valueOf);
            this.disableNetworkSecurity = valueOf;
            return this;
        }

        public Builder geoProvider(GeoProvider geoProvider2) {
            C2113e.m8177a(geoProvider2);
            this.geoProvider = geoProvider2;
            return this;
        }

        public Builder httpLoggingLevel(Level level) {
            C2113e.m8177a(level);
            this.httpLoggingLevel = level;
            return this;
        }

        public Builder keyStore(KeyStore keyStore2) {
            this.keyStore = keyStore2;
            return this;
        }

        public Builder mediaCapabilitiesProvider(MediaCapabilitiesProvider mediaCapabilitiesProvider2) {
            this.mediaCapabilitiesProvider = mediaCapabilitiesProvider2;
            return this;
        }

        public Builder okHttpCache(Cache cache) {
            this.okHttpCache = cache;
            return this;
        }

        public Builder proxy(Proxy proxy2) {
            this.proxy = proxy2;
            return this;
        }

        public Builder reauthorizeHandlerStorage(ReauthorizationHandlerRegistry reauthorizationHandlerRegistry) {
            C2113e.m8177a(reauthorizationHandlerRegistry);
            this.reauthorizeHandlerStorage = reauthorizationHandlerRegistry;
            return this;
        }
    }

    private final class PlaybackSessionSubcomponentBuilder implements com.bamtech.sdk4.internal.media.PlaybackSessionSubcomponent.Builder {
        /* access modifiers changed from: private */
        public PlaybackSessionModule playbackSessionModule;

        private PlaybackSessionSubcomponentBuilder() {
        }

        public PlaybackSessionSubcomponent build() {
            if (this.playbackSessionModule != null) {
                return new PlaybackSessionSubcomponentImpl(this);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(PlaybackSessionModule.class.getCanonicalName());
            sb.append(" must be set");
            throw new IllegalStateException(sb.toString());
        }

        public PlaybackSessionSubcomponentBuilder module(PlaybackSessionModule playbackSessionModule2) {
            C2113e.m8177a(playbackSessionModule2);
            this.playbackSessionModule = playbackSessionModule2;
            return this;
        }
    }

    private final class PlaybackSessionSubcomponentImpl implements PlaybackSessionSubcomponent {
        private PlaybackSessionModule playbackSessionModule;

        private DefaultPlaybackSession getDefaultPlaybackSession() {
            DefaultPlaybackSession defaultPlaybackSession = new DefaultPlaybackSession(DaggerAndroidSdkComponent.this.transactionProvider, PlaybackSessionModule_PlayerAdapterFactory.proxyPlayerAdapter(this.playbackSessionModule), (Set) DaggerAndroidSdkComponent.this.providersProvider.get(), getStreamSampler(), (DefaultQOSPlaybackEventListener) DaggerAndroidSdkComponent.this.qosProvider.get());
            return defaultPlaybackSession;
        }

        private DefaultStreamSampler getDefaultStreamSampler() {
            DefaultStreamSampler defaultStreamSampler = new DefaultStreamSampler((ConfigurationProvider) DaggerAndroidSdkComponent.this.defaultConfigurationProvider.get(), PlaybackSessionModule_PlayerAdapterFactory.proxyPlayerAdapter(this.playbackSessionModule), (EventBuffer) DaggerAndroidSdkComponent.this.telemetryBufferProvider.get(), DaggerAndroidSdkComponent.this.getDefaultPlayheadRecorder(), (DefaultQOSPlaybackEventListener) DaggerAndroidSdkComponent.this.qosProvider.get(), DaggerAndroidSdkComponent.this.transactionProvider);
            return defaultStreamSampler;
        }

        private StreamSampler getStreamSampler() {
            return PlaybackSessionModule_StreamSamplerFactory.proxyStreamSampler(this.playbackSessionModule, getDefaultStreamSampler());
        }

        private void initialize(PlaybackSessionSubcomponentBuilder playbackSessionSubcomponentBuilder) {
            this.playbackSessionModule = playbackSessionSubcomponentBuilder.playbackSessionModule;
        }

        public PlaybackSession session() {
            return PlaybackSessionModule_SessionFactory.proxySession(this.playbackSessionModule, getDefaultPlaybackSession());
        }

        private PlaybackSessionSubcomponentImpl(PlaybackSessionSubcomponentBuilder playbackSessionSubcomponentBuilder) {
            initialize(playbackSessionSubcomponentBuilder);
        }
    }

    private static final class PresentGuavaOptionalInstanceProvider<T> implements Provider<Optional<T>> {
        private final Provider<T> delegate;

        private PresentGuavaOptionalInstanceProvider(Provider<T> provider) {
            C2113e.m8177a(provider);
            this.delegate = provider;
        }

        /* access modifiers changed from: private */
        /* renamed from: of */
        public static <T> Provider<Optional<T>> m8122of(Provider<T> provider) {
            return new PresentGuavaOptionalInstanceProvider(provider);
        }

        public Optional<T> get() {
            return Optional.m32791c(this.delegate.get());
        }
    }

    public static com.bamtech.sdk4.internal.android.AndroidSdkComponent.Builder builder() {
        return new Builder();
    }

    private BookmarksDao getBookmarksDao() {
        return BookmarksRepositoryModule.bookmarkDao(getBookmarksDatabase());
    }

    private BookmarksDatabase getBookmarksDatabase() {
        return BookmarksRepositoryModule.bookmarksDatabase((Context) this.bookmarksContextProvider.get());
    }

    private DefaultLocalBookmarkStore getDefaultLocalBookmarkStore() {
        return new DefaultLocalBookmarkStore((SessionInfoExtension) this.defaultSessionInfoExtensionProvider.get(), getBookmarksDao());
    }

    private DefaultLocalPlayheadStore getDefaultLocalPlayheadStore() {
        return new DefaultLocalPlayheadStore((SessionInfoExtension) this.defaultSessionInfoExtensionProvider.get(), getPlayheadDao(), (PublishSubject) this.notifierProvider.get(), (PublishSubject) this.userProfileEventNotifierProvider.get());
    }

    /* access modifiers changed from: private */
    public DefaultPlayheadRecorder getDefaultPlayheadRecorder() {
        return new DefaultPlayheadRecorder((SessionInfoExtension) this.defaultSessionInfoExtensionProvider.get(), getDefaultLocalPlayheadStore(), getDefaultLocalBookmarkStore());
    }

    private PlayheadDao getPlayheadDao() {
        return PlayheadRepositoryModule.playheadDao(getPlayheadDatabase());
    }

    private PlayheadDatabase getPlayheadDatabase() {
        return PlayheadRepositoryModule.playheadDatabase((Context) this.bookmarksContextProvider.get());
    }

    private void initialize(Builder builder) {
        this.bootstrapConfigurationProvider = C2112d.m8174a(builder.bootstrapConfiguration);
        this.identityConverterProvider = C2110b.m8173b(GsonModule_IdentityConverterFactory.create(builder.gsonModule));
        this.snakeConverterProvider = C2110b.m8173b(GsonModule_SnakeConverterFactory.create(builder.gsonModule));
        this.stringConverterProvider = C2110b.m8173b(NetworkModule_StringConverterFactory.create(builder.networkModule));
        this.rawBytesConverterProvider = C2110b.m8173b(NetworkModule_RawBytesConverterFactory.create(builder.networkModule));
        this.nullIdentityConverterProvider = C2110b.m8173b(GsonModule_NullIdentityConverterFactory.create(builder.gsonModule));
        this.identityConverterForStorageProvider = C2110b.m8173b(GsonModule_IdentityConverterForStorageFactory.create(builder.gsonModule));
        this.dustEventConverterProvider = C2110b.m8173b(GsonModule_DustEventConverterFactory.create(builder.gsonModule));
        this.defaultConverterProvider = C2110b.m8173b(DefaultConverterProvider_Factory.create(this.identityConverterProvider, this.snakeConverterProvider, this.stringConverterProvider, this.rawBytesConverterProvider, this.nullIdentityConverterProvider, this.identityConverterForStorageProvider, this.dustEventConverterProvider));
        this.defaultConfigurationClientProvider = DefaultConfigurationClient_Factory.create(this.defaultConverterProvider);
        this.clientProvider = C2110b.m8173b(this.defaultConfigurationClientProvider);
        this.embeddedConfigurationProvider = C2110b.m8173b(AndroidConfigurationModule_EmbeddedConfigurationFactory.create(builder.androidConfigurationModule, this.bootstrapConfigurationProvider));
        this.applicationProvider = C2112d.m8174a(builder.application);
        this.sharedPreferencesProvider = C2110b.m8173b(ApplicationModule_SharedPreferencesFactory.create(builder.applicationModule, this.applicationProvider));
        this.preferencesStorageProvider = PreferencesStorage_Factory.create(this.sharedPreferencesProvider, this.bootstrapConfigurationProvider, this.defaultConverterProvider);
        this.secureStorageProvider = C2110b.m8173b(this.preferencesStorageProvider);
        this.defaultConfigurationManagerProvider = C2110b.m8173b(DefaultConfigurationManager_Factory.create(this.bootstrapConfigurationProvider, this.clientProvider, this.embeddedConfigurationProvider, this.secureStorageProvider));
        this.defaultConfigurationProvider = C2110b.m8173b(DefaultConfigurationProvider_Factory.create(this.defaultConfigurationManagerProvider, this.bootstrapConfigurationProvider, this.defaultConverterProvider));
        this.defaultEdgeClientProvider = DefaultEdgeClient_Factory.create(this.defaultConfigurationProvider);
        this.clientProvider2 = C2110b.m8173b(this.defaultEdgeClientProvider);
        this.httpLoggingLevelProvider = C2112d.m8174a(builder.httpLoggingLevel);
        this.optionalOfLevelProvider = PresentGuavaOptionalInstanceProvider.m8122of(this.httpLoggingLevelProvider);
        this.okHttpCacheProvider = C2112d.m8176b(builder.okHttpCache);
        this.userAgentProvider = C2110b.m8173b(AndroidConfigurationModule_UserAgentFactory.create(builder.androidConfigurationModule, this.bootstrapConfigurationProvider));
        this.userAgentOptionalOfStringProvider = PresentGuavaOptionalInstanceProvider.m8122of(this.userAgentProvider);
        this.disableNetworkSecurityProvider = C2112d.m8174a(builder.disableNetworkSecurity);
        this.bamLogcatLogSinkProvider = BamLogcatLogSink_Factory.create(this.bootstrapConfigurationProvider);
        this.transactionProvider = new C2109a();
        this.defaultAccessContextUpdaterProvider = new C2109a();
        this.defaultTelemetryClientProvider = DefaultTelemetryClient_Factory.create(this.defaultConfigurationProvider, this.defaultConverterProvider);
        this.clientProvider3 = C2110b.m8173b(this.defaultTelemetryClientProvider);
        this.dustDirProvider = C2110b.m8173b(DustModule_DustDirFactory.create(builder.dustModule, this.applicationProvider));
        this.handlerProvider = C2110b.m8173b(RecoverErrorHandler_Factory.create());
        this.dustStorageProvider = C2110b.m8173b(TelemetryModule_DustStorageFactory.create(builder.telemetryModule, this.dustDirProvider, this.defaultConverterProvider, this.handlerProvider));
        this.dustBufferProvider = C2110b.m8173b(TelemetryModule_DustBufferFactory.create(builder.telemetryModule, this.transactionProvider, this.defaultAccessContextUpdaterProvider, this.defaultConfigurationProvider, this.clientProvider3, this.dustStorageProvider));
        this.dustLogSinkProvider = C2110b.m8173b(DustLogSink_Factory.create(this.dustBufferProvider));
        this.sinksProvider = C2110b.m8173b(AndroidLoggerModule_SinksFactory.create(builder.androidLoggerModule, this.bamLogcatLogSinkProvider, this.dustLogSinkProvider));
        this.optionalOfCollectionProvider = PresentGuavaOptionalInstanceProvider.m8122of(this.sinksProvider);
        this.loggerProvider = C2110b.m8173b(BaseLoggerModule_LoggerFactory.create(builder.baseLoggerModule, this.bootstrapConfigurationProvider, this.optionalOfCollectionProvider));
        this.logDispatcherProvider = C2110b.m8173b(BaseLoggerModule_LogDispatcherFactory.create(builder.baseLoggerModule, this.loggerProvider));
        this.keyStoreProvider = C2112d.m8176b(builder.keyStore);
        this.trustManagerProvider = C2110b.m8173b(NetworkModule_TrustManagerFactory.create(builder.networkModule, this.disableNetworkSecurityProvider, this.logDispatcherProvider, this.keyStoreProvider));
        this.proxyProvider = C2112d.m8176b(builder.proxy);
        this.cookieCacheProvider = C2110b.m8173b(DefaultCookieCache_Factory.create());
        this.cookiePreferencesProvider = C2110b.m8173b(ApplicationModule_CookiePreferencesFactory.create(builder.applicationModule, this.applicationProvider));
        this.preferencesCookiePersistorProvider = PreferencesCookiePersistor_Factory.create(this.cookiePreferencesProvider);
        this.cookiePersistorProvider = C2110b.m8173b(this.preferencesCookiePersistorProvider);
        this.persistentCookieJarProvider = C2110b.m8173b(PersistentCookieJar_Factory.create(this.cookieCacheProvider, this.cookiePersistorProvider));
        this.okHttpClientBuilderProvider = C2110b.m8173b(NetworkModule_OkHttpClientBuilderFactory.create(builder.networkModule, this.optionalOfLevelProvider, this.okHttpCacheProvider, this.userAgentOptionalOfStringProvider, this.trustManagerProvider, this.proxyProvider, this.persistentCookieJarProvider));
        this.okHttpClientProvider = C2110b.m8173b(NetworkModule_OkHttpClientFactory.create(builder.networkModule, this.okHttpClientBuilderProvider));
        this.correlationIdsProvider = C2112d.m8174a(builder.correlationIds);
        this.baseDustClientProvider = C2110b.m8173b(DustModule_BaseDustClientFactory.create(builder.dustModule, this.bootstrapConfigurationProvider, this.correlationIdsProvider));
        this.defaultServiceTransactionProvider = DefaultServiceTransaction_Factory.create(this.okHttpClientProvider, this.logDispatcherProvider, this.defaultConverterProvider, this.baseDustClientProvider);
        this.debugServiceTransactionProvider = DebugServiceTransaction_Factory.create(this.okHttpClientProvider, this.logDispatcherProvider, this.defaultConverterProvider, this.baseDustClientProvider);
        C2109a aVar = (C2109a) this.transactionProvider;
        this.transactionProvider = ServiceTransactionModule_TransactionFactory.create(this.bootstrapConfigurationProvider, this.defaultServiceTransactionProvider, this.debugServiceTransactionProvider);
        aVar.mo11034a(this.transactionProvider);
        this.defaultPluginRegistryProvider = C2110b.m8173b(DefaultPluginRegistry_Factory.create());
        this.contentExtensionProvider = LegacyExtensionModule_ContentExtensionFactory.create(this.defaultPluginRegistryProvider);
        this.defaultInternalSessionStateProvider = C2110b.m8173b(DefaultInternalSessionStateProvider_Factory.create(this.transactionProvider, this.secureStorageProvider, this.bootstrapConfigurationProvider, this.contentExtensionProvider));
        this.geoProvider = C2112d.m8174a(builder.geoProvider);
        this.defaultLocationResolverProvider = DefaultLocationResolver_Factory.create(this.defaultConfigurationProvider, this.geoProvider);
        this.locationResolverProvider = C2110b.m8173b(this.defaultLocationResolverProvider);
        this.defaultTokenClientProvider = C2110b.m8173b(DefaultTokenClient_Factory.create(this.defaultConfigurationProvider, this.locationResolverProvider, this.defaultConverterProvider));
        this.defaultSessionClientProvider = DefaultSessionClient_Factory.create(this.defaultConfigurationProvider, this.defaultConverterProvider);
        this.sessionClientProvider = C2110b.m8173b(this.defaultSessionClientProvider);
        this.defaultSessionInfoStorageProvider = DefaultSessionInfoStorage_Factory.create(this.secureStorageProvider);
        this.sessionStorageProvider = C2110b.m8173b(this.defaultSessionInfoStorageProvider);
        this.defaultSessionInfoUpdaterProvider = DefaultSessionInfoUpdater_Factory.create(this.sessionClientProvider, this.sessionStorageProvider);
        this.sessionInfoUpdaterProvider = C2110b.m8173b(this.defaultSessionInfoUpdaterProvider);
        this.defaultTokenExchangeManagerProvider = C2110b.m8173b(DefaultTokenExchangeManager_Factory.create(this.bootstrapConfigurationProvider, this.defaultInternalSessionStateProvider, this.defaultTokenClientProvider, this.sessionInfoUpdaterProvider, this.defaultConfigurationProvider));
        this.defaultDeviceClientProvider = DefaultDeviceClient_Factory.create(this.defaultConfigurationProvider, this.locationResolverProvider, this.defaultConverterProvider);
        this.clientProvider4 = C2110b.m8173b(this.defaultDeviceClientProvider);
        this.defaultDeviceManagerProvider = DefaultDeviceManager_Factory.create(this.bootstrapConfigurationProvider, this.clientProvider4, this.secureStorageProvider);
        this.managerProvider = C2110b.m8173b(this.defaultDeviceManagerProvider);
        this.defaultDeviceAccessContextHelperProvider = DefaultDeviceAccessContextHelper_Factory.create(this.managerProvider, this.defaultInternalSessionStateProvider, this.defaultTokenExchangeManagerProvider);
        this.refreshDeviceAccessContextHelperProvider = C2110b.m8173b(this.defaultDeviceAccessContextHelperProvider);
        this.defaultRefreshActionPlannerProvider = DefaultRefreshActionPlanner_Factory.create(this.defaultInternalSessionStateProvider);
        this.refreshActionDeciderProvider = C2110b.m8173b(this.defaultRefreshActionPlannerProvider);
        this.accountExtensionProvider = LegacyExtensionModule_AccountExtensionFactory.create(this.defaultPluginRegistryProvider);
        this.defaultRefreshAccessContextHelperProvider = DefaultRefreshAccessContextHelper_Factory.create(this.defaultConfigurationProvider, this.defaultInternalSessionStateProvider, this.defaultTokenExchangeManagerProvider, this.refreshDeviceAccessContextHelperProvider, this.refreshActionDeciderProvider, this.accountExtensionProvider);
        this.refreshAccessContextHelperProvider = C2110b.m8173b(this.defaultRefreshAccessContextHelperProvider);
        C2109a aVar2 = (C2109a) this.defaultAccessContextUpdaterProvider;
        this.defaultAccessContextUpdaterProvider = C2110b.m8173b(DefaultAccessContextUpdater_Factory.create(this.defaultConfigurationProvider, this.defaultTokenExchangeManagerProvider, this.defaultInternalSessionStateProvider, this.refreshAccessContextHelperProvider, this.refreshDeviceAccessContextHelperProvider));
        aVar2.mo11034a(this.defaultAccessContextUpdaterProvider);
        this.defaultEdgeManagerProvider = DefaultEdgeManager_Factory.create(this.clientProvider2, this.defaultAccessContextUpdaterProvider, this.transactionProvider);
        this.managerProvider2 = C2110b.m8173b(this.defaultEdgeManagerProvider);
        this.defaultSessionInfoExtensionProvider = C2110b.m8173b(DefaultSessionInfoExtension_Factory.create(this.defaultAccessContextUpdaterProvider, this.sessionInfoUpdaterProvider));
        this.defaultSessionExtensionProvider = DefaultSessionExtension_Factory.create(this.defaultAccessContextUpdaterProvider);
        this.sessionExtensionProvider = C2110b.m8173b(this.defaultSessionExtensionProvider);
        this.notifierProvider = C2110b.m8173b(NotifierModule_NotifierFactory.create());
        this.defaultSessionApiProvider = C2110b.m8173b(DefaultSessionApi_Factory.create(this.transactionProvider, this.secureStorageProvider, this.sessionStorageProvider, this.defaultAccessContextUpdaterProvider, this.defaultSessionInfoExtensionProvider, this.defaultInternalSessionStateProvider, this.sessionExtensionProvider, this.notifierProvider));
        this.playbackSessionSubcomponentBuilderProvider = new Provider<com.bamtech.sdk4.internal.media.PlaybackSessionSubcomponent.Builder>() {
            public com.bamtech.sdk4.internal.media.PlaybackSessionSubcomponent.Builder get() {
                return new PlaybackSessionSubcomponentBuilder();
            }
        };
        this.bookmarksContextProvider = C2110b.m8173b(BookmarksStorageContextModule_BookmarksContextFactory.create(builder.bookmarksStorageContextModule, this.applicationProvider));
        this.qOSNetworkHelperProvider = QOSNetworkHelper_Factory.create(this.bookmarksContextProvider);
        this.defaultPlaybackSessionProvider = C2110b.m8173b(DefaultPlaybackSessionProvider_Factory.create(this.transactionProvider, this.playbackSessionSubcomponentBuilderProvider, this.qOSNetworkHelperProvider));
        this.mediaCapabilitiesProvider = C2112d.m8176b(builder.mediaCapabilitiesProvider);
        this.pbsGeneratorProvider = PbsGenerator_Factory.create(this.mediaCapabilitiesProvider);
        this.qosDirProvider = C2110b.m8173b(DustModule_QosDirFactory.create(builder.dustModule, this.applicationProvider));
        this.qosStorageProvider = C2110b.m8173b(TelemetryModule_QosStorageFactory.create(builder.telemetryModule, this.qosDirProvider, this.defaultConverterProvider, this.handlerProvider));
        this.qosBufferProvider = C2110b.m8173b(TelemetryModule_QosBufferFactory.create(builder.telemetryModule, this.transactionProvider, this.defaultAccessContextUpdaterProvider, this.defaultConfigurationProvider, this.clientProvider3, this.qosStorageProvider));
        this.qosProvider = C2110b.m8173b(TelemetryModule_QosFactory.create(builder.telemetryModule, this.qosBufferProvider, this.baseDustClientProvider));
        this.mediaOkHttpClientBuilderProvider = C2110b.m8173b(NetworkModule_MediaOkHttpClientBuilderFactory.create(builder.networkModule, this.userAgentOptionalOfStringProvider, this.trustManagerProvider, this.proxyProvider, this.persistentCookieJarProvider));
        this.defaultNetworkConfigurationProvider = DefaultNetworkConfigurationProvider_Factory.create(this.userAgentProvider, this.okHttpClientBuilderProvider, this.mediaOkHttpClientBuilderProvider, this.transactionProvider);
    }

    private void initialize2(Builder builder) {
        this.networkConfigurationProvider = C2110b.m8173b(this.defaultNetworkConfigurationProvider);
        this.defaultWidevineDrmProvider = DefaultWidevineDrmProvider_Factory.create(this.networkConfigurationProvider, this.defaultConfigurationProvider, this.defaultConverterProvider, this.defaultAccessContextUpdaterProvider, this.qosBufferProvider, this.baseDustClientProvider, this.qOSNetworkHelperProvider);
        this.widevineVerifierProvider = WidevineVerifier_Factory.create(this.defaultConfigurationProvider, this.defaultWidevineDrmProvider);
        this.providesMediaClientProvider = C2110b.m8173b(MediaModule_ProvidesMediaClientFactory.create(this.defaultConfigurationProvider, this.defaultConverterProvider, this.defaultAccessContextUpdaterProvider, this.defaultPluginRegistryProvider, this.pbsGeneratorProvider, this.qosProvider, this.qOSNetworkHelperProvider, this.widevineVerifierProvider));
        this.instanceProvider = C2110b.m8173b(ExtensionProviderModule_InstanceProviderFactory.create(builder.extensionProviderModule, this.defaultPluginRegistryProvider));
        this.defaultAdEngineClientProvider = C2110b.m8173b(DefaultAdEngineClient_Factory.create(this.defaultConfigurationProvider));
        this.advertisingIdProvider = C2112d.m8174a(builder.advertisingIdProvider);
        this.defaultAdEngineManagerProvider = DefaultAdEngineManager_Factory.create(this.defaultConfigurationProvider, this.defaultAdEngineClientProvider, this.locationResolverProvider, this.defaultAccessContextUpdaterProvider, this.advertisingIdProvider);
        this.adEngineManagerProvider = C2110b.m8173b(this.defaultAdEngineManagerProvider);
        this.playheadDatabaseProvider = PlayheadRepositoryModule_PlayheadDatabaseFactory.create(this.bookmarksContextProvider);
        this.playheadDaoProvider = PlayheadRepositoryModule_PlayheadDaoFactory.create(this.playheadDatabaseProvider);
        this.userProfileEventNotifierProvider = C2110b.m8173b(NotifierModule_UserProfileEventNotifierFactory.create());
        this.defaultLocalPlayheadStoreProvider = DefaultLocalPlayheadStore_Factory.create(this.defaultSessionInfoExtensionProvider, this.playheadDaoProvider, this.notifierProvider, this.userProfileEventNotifierProvider);
        this.bookmarksDatabaseProvider = BookmarksRepositoryModule_BookmarksDatabaseFactory.create(this.bookmarksContextProvider);
        this.bookmarkDaoProvider = BookmarksRepositoryModule_BookmarkDaoFactory.create(this.bookmarksDatabaseProvider);
        this.defaultLocalBookmarkStoreProvider = DefaultLocalBookmarkStore_Factory.create(this.defaultSessionInfoExtensionProvider, this.bookmarkDaoProvider);
        this.defaultMediaManagerProvider = DefaultMediaManager_Factory.create(this.providesMediaClientProvider, this.instanceProvider, this.defaultAccessContextUpdaterProvider, this.bookmarksContextProvider, this.adEngineManagerProvider, this.defaultLocalPlayheadStoreProvider, this.defaultSessionInfoExtensionProvider, this.qosProvider, this.defaultLocalBookmarkStoreProvider, this.qOSNetworkHelperProvider);
        this.mediaManagerProvider = C2110b.m8173b(this.defaultMediaManagerProvider);
        this.authorizerExtensionProvider = SessionRenewalModule_AuthorizerExtensionFactory.create(this.defaultPluginRegistryProvider);
        this.reauthorizeHandlerStorageProvider = C2112d.m8174a(builder.reauthorizeHandlerStorage);
        this.defaultRenewSessionTransformersProvider = DefaultRenewSessionTransformers_Factory.create(this.defaultAccessContextUpdaterProvider, this.authorizerExtensionProvider, this.transactionProvider, this.reauthorizeHandlerStorageProvider);
        this.sessionTransformerProvider = C2110b.m8173b(this.defaultRenewSessionTransformersProvider);
        this.defaultMediaApiProvider = DefaultMediaApi_Factory.create(this.transactionProvider, this.defaultPlaybackSessionProvider, this.mediaManagerProvider, this.sessionTransformerProvider, this.qosProvider);
        this.mediaApiProvider = C2110b.m8173b(this.defaultMediaApiProvider);
        this.defaultCustomerServiceClientProvider = DefaultCustomerServiceClient_Factory.create(this.defaultConfigurationProvider, this.defaultConverterProvider);
        this.customerServiceClientProvider = C2110b.m8173b(this.defaultCustomerServiceClientProvider);
        this.defaultCustomerServiceManagerProvider = DefaultCustomerServiceManager_Factory.create(this.transactionProvider, this.defaultAccessContextUpdaterProvider, this.customerServiceClientProvider);
        this.customerServiceManagerProvider = C2110b.m8173b(this.defaultCustomerServiceManagerProvider);
        this.defaultCustomerServiceApiProvider = DefaultCustomerServiceApi_Factory.create(this.transactionProvider, this.customerServiceManagerProvider);
        this.customerServiceProvider = C2110b.m8173b(this.defaultCustomerServiceApiProvider);
        Provider<EdgeManager> provider = this.managerProvider2;
        Provider<ServiceTransaction> provider2 = this.transactionProvider;
        Provider<DefaultSessionApi> provider3 = this.defaultSessionApiProvider;
        Provider<MediaApi> provider4 = this.mediaApiProvider;
        Provider<DefaultPluginRegistry> provider5 = this.defaultPluginRegistryProvider;
        this.sdkSessionProvider = C2110b.m8173b(SdkSession_Factory.create(provider, provider2, provider3, provider4, provider5, provider5, this.customerServiceProvider));
        this.glimpseDirProvider = C2110b.m8173b(DustModule_GlimpseDirFactory.create(builder.dustModule, this.applicationProvider));
        this.glimpseStorageProvider = C2110b.m8173b(TelemetryModule_GlimpseStorageFactory.create(builder.telemetryModule, this.glimpseDirProvider, this.defaultConverterProvider, this.handlerProvider));
        this.glimpseBufferProvider = C2110b.m8173b(TelemetryModule_GlimpseBufferFactory.create(builder.telemetryModule, this.transactionProvider, this.defaultAccessContextUpdaterProvider, this.defaultConfigurationProvider, this.clientProvider3, this.glimpseStorageProvider));
        this.defaultOnlineMediaClientProvider = C2110b.m8173b(DefaultOnlineMediaClient_Factory.create(this.defaultConfigurationProvider, this.defaultConverterProvider, this.defaultAccessContextUpdaterProvider, this.pbsGeneratorProvider, this.qosProvider, this.qOSNetworkHelperProvider, this.widevineVerifierProvider));
        this.defaultSilkDrmProvider = DefaultSilkDrmProvider_Factory.create(this.networkConfigurationProvider, this.defaultOnlineMediaClientProvider, this.defaultAccessContextUpdaterProvider);
        this.testWidevineDrmProvider = TestWidevineDrmProvider_Factory.create(this.networkConfigurationProvider, this.defaultConfigurationProvider, this.defaultConverterProvider, this.defaultAccessContextUpdaterProvider, this.qosBufferProvider, this.baseDustClientProvider, this.qOSNetworkHelperProvider);
        this.defaultPlayReadyDrmProvider = DefaultPlayReadyDrmProvider_Factory.create(this.networkConfigurationProvider, this.defaultConfigurationProvider, this.defaultConverterProvider, this.defaultAccessContextUpdaterProvider, this.qosBufferProvider, this.baseDustClientProvider, this.qOSNetworkHelperProvider);
        this.providesTestDrmProvidersProvider = C2110b.m8173b(DrmProviderModule_ProvidesTestDrmProvidersFactory.create(builder.drmProviderModule, this.defaultSilkDrmProvider, this.testWidevineDrmProvider, this.defaultPlayReadyDrmProvider));
        this.defaultPlayheadRecorderProvider = DefaultPlayheadRecorder_Factory.create(this.defaultSessionInfoExtensionProvider, this.defaultLocalPlayheadStoreProvider, this.defaultLocalBookmarkStoreProvider);
        Provider<DefaultConfigurationProvider> provider6 = this.defaultConfigurationProvider;
        Provider<ServiceTransaction> provider7 = this.transactionProvider;
        Provider<Storage> provider8 = this.secureStorageProvider;
        Provider<DefaultConverterProvider> provider9 = this.defaultConverterProvider;
        Provider<String> provider10 = this.userAgentProvider;
        Provider<okhttp3.OkHttpClient.Builder> provider11 = this.okHttpClientBuilderProvider;
        Provider<DefaultAccessContextUpdater> provider12 = this.defaultAccessContextUpdaterProvider;
        Provider<DefaultAccessContextUpdater> provider13 = provider12;
        Provider<DefaultAccessContextUpdater> provider14 = provider12;
        Provider<DefaultTokenExchangeManager> provider15 = this.defaultTokenExchangeManagerProvider;
        this.defaultExtensionProvider = C2110b.m8173b(DefaultExtensionProvider_Factory.create(provider6, provider7, provider8, provider9, provider10, provider11, provider14, provider13, provider15, provider15, this.dustBufferProvider, this.glimpseBufferProvider, this.qosBufferProvider, this.defaultSessionApiProvider, this.defaultSessionInfoExtensionProvider, this.notifierProvider, this.userProfileEventNotifierProvider, this.sessionTransformerProvider, this.reauthorizeHandlerStorageProvider, this.defaultLocalPlayheadStoreProvider, this.instanceProvider, this.defaultPlaybackSessionProvider, this.providesTestDrmProvidersProvider, this.defaultPlayheadRecorderProvider, this.baseDustClientProvider, this.qOSNetworkHelperProvider));
        this.providersProvider = C2110b.m8173b(DrmProviderModule_ProvidersFactory.create(builder.drmProviderModule, this.defaultSilkDrmProvider, this.defaultWidevineDrmProvider, this.defaultPlayReadyDrmProvider));
        this.streamSampleTelemetryClientProvider = StreamSampleTelemetryClient_Factory.create(this.defaultConfigurationProvider, this.defaultConverterProvider);
        this.telemetryDirProvider = C2110b.m8173b(DustModule_TelemetryDirFactory.create(builder.dustModule, this.applicationProvider));
        this.telemetryStorageProvider = C2110b.m8173b(TelemetryModule_TelemetryStorageFactory.create(builder.telemetryModule, this.telemetryDirProvider, this.defaultConverterProvider, this.handlerProvider));
        this.telemetryBufferProvider = C2110b.m8173b(TelemetryModule_TelemetryBufferFactory.create(builder.telemetryModule, this.transactionProvider, this.defaultAccessContextUpdaterProvider, this.defaultConfigurationProvider, this.streamSampleTelemetryClientProvider, this.telemetryStorageProvider));
    }

    public DefaultExtensionProvider defaultExtensions() {
        return (DefaultExtensionProvider) this.defaultExtensionProvider.get();
    }

    public PluginRegistry registry() {
        return (PluginRegistry) this.defaultPluginRegistryProvider.get();
    }

    public Session session() {
        return (Session) this.sdkSessionProvider.get();
    }

    private DaggerAndroidSdkComponent(Builder builder) {
        initialize(builder);
        initialize2(builder);
    }
}
