package com.bamtech.sdk4.internal.media.offline;

import android.content.Context;
import androidx.work.WorkManager;
import com.bamtech.sdk4.bookmarks.storage.DefaultLocalBookmarkStore_Factory;
import com.bamtech.sdk4.internal.bookmarks.BookmarksRepositoryModule_BookmarkDaoFactory;
import com.bamtech.sdk4.internal.bookmarks.BookmarksRepositoryModule_BookmarksDatabaseFactory;
import com.bamtech.sdk4.internal.configuration.ConfigurationProvider;
import com.bamtech.sdk4.internal.configuration.NetworkConfigurationProvider;
import com.bamtech.sdk4.internal.media.CacheProvider;
import com.bamtech.sdk4.internal.media.CacheProvider_Factory;
import com.bamtech.sdk4.internal.media.ExoCachedMedia;
import com.bamtech.sdk4.internal.media.LocalPlayheadStore;
import com.bamtech.sdk4.internal.media.drm.DefaultWidevineDrmProvider_Factory;
import com.bamtech.sdk4.internal.media.offline.p047db.OfflineDatabase;
import com.bamtech.sdk4.internal.media.offline.workers.DefaultDownload;
import com.bamtech.sdk4.internal.media.offline.workers.DefaultDownload_Factory;
import com.bamtech.sdk4.internal.media.offline.workers.Download;
import com.bamtech.sdk4.internal.media.offline.workers.DownloadMediaWorker;
import com.bamtech.sdk4.internal.media.offline.workers.DownloadMediaWorker_MembersInjector;
import com.bamtech.sdk4.internal.media.offline.workers.ReleaseAllLicensesWorker;
import com.bamtech.sdk4.internal.media.offline.workers.ReleaseAllLicensesWorker_MembersInjector;
import com.bamtech.sdk4.internal.media.offline.workers.ReleaseLicenseWorker;
import com.bamtech.sdk4.internal.media.offline.workers.ReleaseLicenseWorker_MembersInjector;
import com.bamtech.sdk4.internal.media.offline.workers.ReleaseLicensesPeriodicWorker;
import com.bamtech.sdk4.internal.media.offline.workers.ReleaseLicensesPeriodicWorker_MembersInjector;
import com.bamtech.sdk4.internal.media.offline.workers.RemoveMediaWorker;
import com.bamtech.sdk4.internal.media.offline.workers.RemoveMediaWorker_MembersInjector;
import com.bamtech.sdk4.internal.media.offline.workers.RenewLicenseWorker;
import com.bamtech.sdk4.internal.media.offline.workers.RenewLicenseWorker_MembersInjector;
import com.bamtech.sdk4.internal.media.offline.workers.RenewLicensesWorker;
import com.bamtech.sdk4.internal.media.offline.workers.RenewLicensesWorker_MembersInjector;
import com.bamtech.sdk4.internal.networking.ConverterProvider;
import com.bamtech.sdk4.internal.plugin.DefaultExtensionModule;
import com.bamtech.sdk4.internal.plugin.DefaultExtensionModule_ConfigurationFactory;
import com.bamtech.sdk4.internal.plugin.DefaultExtensionModule_ConverterProviderFactory;
import com.bamtech.sdk4.internal.plugin.DefaultExtensionModule_GetExtensionFactory;
import com.bamtech.sdk4.internal.plugin.DefaultExtensionModule_GetExtensionProviderFactory;
import com.bamtech.sdk4.internal.plugin.DefaultExtensionModule_NotifierFactory;
import com.bamtech.sdk4.internal.plugin.DefaultExtensionModule_OkHttpBuilderFactory;
import com.bamtech.sdk4.internal.plugin.DefaultExtensionModule_ServiceTransactionFactory;
import com.bamtech.sdk4.internal.plugin.DefaultExtensionModule_UserAgentFactory;
import com.bamtech.sdk4.internal.telemetry.EventBuffer;
import com.bamtech.sdk4.internal.token.AccessTokenProvider;
import com.bamtech.sdk4.media.QOSNetworkHelper_Factory;
import com.bamtech.sdk4.media.adapters.exoplayer.DrmSessionManagerModule_PlaybackDrmSessionManagerFactory;
import com.bamtech.sdk4.media.adapters.exoplayer.WidevineDrmSessionManager;
import com.bamtech.sdk4.media.drm.WidevineDrmProvider;
import com.bamtech.sdk4.media.offline.DownloadSession;
import com.bamtech.sdk4.media.offline.OfflineMediaApi;
import com.bamtech.sdk4.media.offline.OfflineMediaPlugin;
import com.bamtech.sdk4.media.offline.OfflineMediaPlugin_MembersInjector;
import com.bamtech.sdk4.plugin.PluginRegistry;
import com.bamtech.sdk4.session.AccessTokenProviderModule;
import com.bamtech.sdk4.session.AccessTokenProviderModule_AccessTokenProviderFactory;
import com.bamtech.sdk4.session.DustExtensionModule;
import com.bamtech.sdk4.session.DustExtensionModule_QOSExtensionFactory;
import com.bamtech.sdk4.session.SessionInfoExtension;
import com.bamtech.sdk4.session.SessionInfoExtensionModule;
import com.bamtech.sdk4.session.SessionInfoExtensionModule_SessionInfoManagerFactory;
import com.bamtech.shadow.dagger.p048a.C2109a;
import com.bamtech.shadow.dagger.p048a.C2110b;
import com.bamtech.shadow.dagger.p048a.C2112d;
import com.bamtech.shadow.dagger.p048a.C2113e;
import com.google.android.exoplayer2.database.DatabaseProvider;
import com.google.android.exoplayer2.offline.Downloader;
import com.google.android.exoplayer2.offline.DownloaderConstructorHelper;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.upstream.cache.Cache;
import javax.inject.Provider;

public final class DaggerOfflineMediaPluginComponent implements OfflineMediaPluginComponent {
    private Provider<EventBuffer> QOSExtensionProvider;
    private Provider<AccessTokenProvider> accessTokenProvider;
    private BookmarksRepositoryModule_BookmarkDaoFactory bookmarkDaoProvider;
    private BookmarksRepositoryModule_BookmarksDatabaseFactory bookmarksDatabaseProvider;
    /* access modifiers changed from: private */
    public Provider<CacheProvider> cacheProvider;
    private Provider<ExoCachedMediaHelper> cachedMediaHelperProvider;
    private Provider<ConditionReporter> conditionReporterProvider;
    private Provider<ConfigurationProvider> configurationProvider;
    /* access modifiers changed from: private */
    public Provider<Context> contextProvider;
    private Provider<ConverterProvider> converterProvider;
    /* access modifiers changed from: private */
    public Provider<OfflineDatabase> databaseProvider;
    /* access modifiers changed from: private */
    public Provider<DatabaseProvider> databaseProvider2;
    private DefaultConditionReporter_Factory defaultConditionReporterProvider;
    private DefaultDownloadTaskFactory_Factory defaultDownloadTaskFactoryProvider;
    private DefaultDownloadWorkManagerHelper_Factory defaultDownloadWorkManagerHelperProvider;
    private DefaultExoCachedMediaHelper_Factory defaultExoCachedMediaHelperProvider;
    private DefaultExtensionModule defaultExtensionModule;
    private DefaultLocalBookmarkStore_Factory defaultLocalBookmarkStoreProvider;
    private Provider<DefaultOfflineMediaApi> defaultOfflineMediaApiProvider;
    private DefaultOfflineMediaClient_Factory defaultOfflineMediaClientProvider;
    private DefaultWidevineDrmProvider_Factory defaultWidevineDrmProvider;
    private Provider<com.bamtech.sdk4.internal.media.offline.DownloadSessionSubcomponent.Builder> downloadSessionSubcomponentBuilderProvider;
    private Provider<DownloadTaskFactory> downloadTaskFactoryProvider;
    private Provider<DownloadWorkManagerHelper> downloadWorkManagerHelperProvider;
    private ExoDownloadSession_Factory exoDownloadSessionProvider;
    private DefaultExtensionModule_GetExtensionFactory getExtensionProvider;
    private DefaultExtensionModule_GetExtensionProviderFactory getExtensionProvider2;
    private Provider<NetworkConfigurationProvider> networkConfigurationProvider;
    private DefaultExtensionModule_NotifierFactory notifierProvider;
    private Provider<WidevineDrmProvider> offlineDrmProvider;
    private Provider<OfflineLicenseManager> offlineLicenseManagerProvider;
    private OfflineMediaApiModule offlineMediaApiModule;
    private Provider<OfflineMediaClient> offlineMediaClientProvider;
    private DefaultExtensionModule_OkHttpBuilderFactory okHttpBuilderProvider;
    private Provider<WidevineDrmSessionManager> playbackDrmSessionManagerProvider;
    private Provider<LocalPlayheadStore> pluginProvider;
    private QOSNetworkHelper_Factory qOSNetworkHelperProvider;
    private PluginRegistry registry;
    private Provider<PluginRegistry> registryProvider;
    private Provider<RoomMediaStorage> roomMediaStorageProvider;
    /* access modifiers changed from: private */
    public DefaultExtensionModule_ServiceTransactionFactory serviceTransactionProvider;
    private Provider<SessionInfoExtension> sessionInfoManagerProvider;
    private Provider<DownloadSession> sessionProvider;
    private Provider<TrackHelper> trackHelperProvider;
    /* access modifiers changed from: private */
    public DefaultExtensionModule_UserAgentFactory userAgentProvider;
    /* access modifiers changed from: private */
    public Provider<WorkManagerDownloadScheduler> workManagerDownloadSchedulerProvider;
    private Provider<WorkManager> workManagerProvider;

    private static final class Builder implements com.bamtech.sdk4.internal.media.offline.OfflineMediaPluginComponent.Builder {
        /* access modifiers changed from: private */
        public AccessTokenProviderModule accessTokenProviderModule;
        /* access modifiers changed from: private */
        public Context context;
        /* access modifiers changed from: private */
        public DefaultExtensionModule defaultExtensionModule;
        /* access modifiers changed from: private */
        public DustExtensionModule dustExtensionModule;
        /* access modifiers changed from: private */
        public OfflineMediaApiModule offlineMediaApiModule;
        /* access modifiers changed from: private */
        public OfflineMediaClientModule offlineMediaClientModule;
        /* access modifiers changed from: private */
        public PlayheadModule playheadModule;
        /* access modifiers changed from: private */
        public PluginRegistry registry;
        /* access modifiers changed from: private */
        public SessionInfoExtensionModule sessionInfoExtensionModule;

        private Builder() {
        }

        public OfflineMediaPluginComponent build() {
            if (this.defaultExtensionModule == null) {
                this.defaultExtensionModule = new DefaultExtensionModule();
            }
            if (this.accessTokenProviderModule == null) {
                this.accessTokenProviderModule = new AccessTokenProviderModule();
            }
            if (this.dustExtensionModule == null) {
                this.dustExtensionModule = new DustExtensionModule();
            }
            if (this.offlineMediaApiModule == null) {
                this.offlineMediaApiModule = new OfflineMediaApiModule();
            }
            if (this.playheadModule == null) {
                this.playheadModule = new PlayheadModule();
            }
            if (this.sessionInfoExtensionModule == null) {
                this.sessionInfoExtensionModule = new SessionInfoExtensionModule();
            }
            if (this.offlineMediaClientModule == null) {
                this.offlineMediaClientModule = new OfflineMediaClientModule();
            }
            String str = " must be set";
            if (this.registry == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(PluginRegistry.class.getCanonicalName());
                sb.append(str);
                throw new IllegalStateException(sb.toString());
            } else if (this.context != null) {
                return new DaggerOfflineMediaPluginComponent(this);
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Context.class.getCanonicalName());
                sb2.append(str);
                throw new IllegalStateException(sb2.toString());
            }
        }

        public Builder context(Context context2) {
            C2113e.m8177a(context2);
            this.context = context2;
            return this;
        }

        public Builder registry(PluginRegistry pluginRegistry) {
            C2113e.m8177a(pluginRegistry);
            this.registry = pluginRegistry;
            return this;
        }
    }

    private final class DownloadSessionSubcomponentBuilder implements com.bamtech.sdk4.internal.media.offline.DownloadSessionSubcomponent.Builder {
        /* access modifiers changed from: private */
        public DownloadSessionModule downloadSessionModule;

        private DownloadSessionSubcomponentBuilder() {
        }

        public DownloadSessionSubcomponent build() {
            if (this.downloadSessionModule != null) {
                return new DownloadSessionSubcomponentImpl(this);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(DownloadSessionModule.class.getCanonicalName());
            sb.append(" must be set");
            throw new IllegalStateException(sb.toString());
        }

        public DownloadSessionSubcomponentBuilder module(DownloadSessionModule downloadSessionModule2) {
            C2113e.m8177a(downloadSessionModule2);
            this.downloadSessionModule = downloadSessionModule2;
            return this;
        }
    }

    private final class DownloadSessionSubcomponentImpl implements DownloadSessionSubcomponent {
        private Provider<Cache> cacheProvider;
        private Provider<ExoCachedMedia> cachedMediaProvider;
        private Provider<DefaultDownload> defaultDownloadProvider;
        private Provider<DownloaderConstructorHelper> downloadConstructorHelperProvider;
        private Provider<Download> downloadProvider;
        private Provider<Downloader> downloaderProvider;
        private Provider<TransferListener> transferListenerProvider;

        private void initialize(DownloadSessionSubcomponentBuilder downloadSessionSubcomponentBuilder) {
            this.cachedMediaProvider = C2110b.m8173b(DownloadSessionModule_CachedMediaFactory.create(downloadSessionSubcomponentBuilder.downloadSessionModule, DaggerOfflineMediaPluginComponent.this.databaseProvider));
            this.downloadProvider = new C2109a();
            this.transferListenerProvider = C2110b.m8173b(DownloadSessionModule_TransferListenerFactory.create(downloadSessionSubcomponentBuilder.downloadSessionModule, this.downloadProvider));
            this.cacheProvider = C2110b.m8173b(DownloadSessionModule_CacheFactory.create(downloadSessionSubcomponentBuilder.downloadSessionModule, DaggerOfflineMediaPluginComponent.this.cacheProvider, DaggerOfflineMediaPluginComponent.this.serviceTransactionProvider, this.cachedMediaProvider, DaggerOfflineMediaPluginComponent.this.databaseProvider2));
            this.downloadConstructorHelperProvider = C2110b.m8173b(DownloadSessionModule_DownloadConstructorHelperFactory.create(downloadSessionSubcomponentBuilder.downloadSessionModule, DaggerOfflineMediaPluginComponent.this.contextProvider, DaggerOfflineMediaPluginComponent.this.userAgentProvider, this.transferListenerProvider, this.cacheProvider));
            this.downloaderProvider = C2110b.m8173b(DownloadSessionModule_DownloaderFactory.create(downloadSessionSubcomponentBuilder.downloadSessionModule, this.cachedMediaProvider, this.downloadConstructorHelperProvider));
            this.defaultDownloadProvider = C2110b.m8173b(DefaultDownload_Factory.create(DaggerOfflineMediaPluginComponent.this.databaseProvider, this.downloaderProvider, this.cachedMediaProvider, DaggerOfflineMediaPluginComponent.this.serviceTransactionProvider, DaggerOfflineMediaPluginComponent.this.workManagerDownloadSchedulerProvider, DaggerOfflineMediaPluginComponent.this.contextProvider, DaggerOfflineMediaPluginComponent.this.databaseProvider2, DaggerOfflineMediaPluginComponent.this.cacheProvider));
            C2109a aVar = (C2109a) this.downloadProvider;
            this.downloadProvider = C2110b.m8173b(DownloadSessionModule_DownloadFactory.create(downloadSessionSubcomponentBuilder.downloadSessionModule, this.defaultDownloadProvider));
            aVar.mo11034a(this.downloadProvider);
        }

        public Download downloadSession() {
            return (Download) this.downloadProvider.get();
        }

        private DownloadSessionSubcomponentImpl(DownloadSessionSubcomponentBuilder downloadSessionSubcomponentBuilder) {
            initialize(downloadSessionSubcomponentBuilder);
        }
    }

    public static com.bamtech.sdk4.internal.media.offline.OfflineMediaPluginComponent.Builder builder() {
        return new Builder();
    }

    private DefaultDownloadWorkManagerHelper getDefaultDownloadWorkManagerHelper() {
        return new DefaultDownloadWorkManagerHelper((WorkManager) this.workManagerProvider.get(), (ConfigurationProvider) this.configurationProvider.get());
    }

    private OfflineMediaApi getOfflineMediaApi() {
        return OfflineMediaApiModule_ApiFactory.proxyApi(this.offlineMediaApiModule, (DefaultOfflineMediaApi) this.defaultOfflineMediaApiProvider.get());
    }

    private String getUserAgentString() {
        return DefaultExtensionModule_UserAgentFactory.proxyUserAgent(this.defaultExtensionModule, this.registry);
    }

    private void initialize(Builder builder) {
        this.offlineMediaApiModule = builder.offlineMediaApiModule;
        this.registryProvider = C2112d.m8174a(builder.registry);
        this.serviceTransactionProvider = DefaultExtensionModule_ServiceTransactionFactory.create(builder.defaultExtensionModule, this.registryProvider);
        this.contextProvider = C2112d.m8174a(builder.context);
        this.databaseProvider = C2110b.m8173b(C2005xd0d94e54.create(this.contextProvider));
        this.roomMediaStorageProvider = C2110b.m8173b(RoomMediaStorage_Factory.create(this.databaseProvider));
        this.workManagerProvider = C2110b.m8173b(C2008x11664a9.create());
        this.configurationProvider = C2110b.m8173b(DefaultExtensionModule_ConfigurationFactory.create(builder.defaultExtensionModule, this.registryProvider));
        this.defaultDownloadWorkManagerHelperProvider = DefaultDownloadWorkManagerHelper_Factory.create(this.workManagerProvider, this.configurationProvider);
        this.downloadWorkManagerHelperProvider = C2110b.m8173b(this.defaultDownloadWorkManagerHelperProvider);
        this.userAgentProvider = DefaultExtensionModule_UserAgentFactory.create(builder.defaultExtensionModule, this.registryProvider);
        this.okHttpBuilderProvider = DefaultExtensionModule_OkHttpBuilderFactory.create(builder.defaultExtensionModule, this.registryProvider);
        this.networkConfigurationProvider = C2110b.m8173b(C2007x8f73aa16.create(this.userAgentProvider, this.okHttpBuilderProvider, this.serviceTransactionProvider));
        this.converterProvider = C2110b.m8173b(DefaultExtensionModule_ConverterProviderFactory.create(builder.defaultExtensionModule, this.registryProvider));
        this.accessTokenProvider = C2110b.m8173b(AccessTokenProviderModule_AccessTokenProviderFactory.create(builder.accessTokenProviderModule, this.registryProvider));
        this.QOSExtensionProvider = C2110b.m8173b(DustExtensionModule_QOSExtensionFactory.create(builder.dustExtensionModule, this.registryProvider));
        this.getExtensionProvider = DefaultExtensionModule_GetExtensionFactory.create(builder.defaultExtensionModule, this.registryProvider);
        this.qOSNetworkHelperProvider = QOSNetworkHelper_Factory.create(this.contextProvider);
        this.defaultWidevineDrmProvider = DefaultWidevineDrmProvider_Factory.create(this.networkConfigurationProvider, this.configurationProvider, this.converterProvider, this.accessTokenProvider, this.QOSExtensionProvider, this.getExtensionProvider, this.qOSNetworkHelperProvider);
        this.offlineDrmProvider = C2110b.m8173b(this.defaultWidevineDrmProvider);
        this.playbackDrmSessionManagerProvider = C2110b.m8173b(DrmSessionManagerModule_PlaybackDrmSessionManagerFactory.create());
        this.offlineLicenseManagerProvider = C2110b.m8173b(OfflineLicenseManager_Factory.create(this.offlineDrmProvider, this.playbackDrmSessionManagerProvider));
        this.trackHelperProvider = C2110b.m8173b(DefaultTrackHelper_Factory.create());
        this.defaultExoCachedMediaHelperProvider = DefaultExoCachedMediaHelper_Factory.create(this.contextProvider, this.offlineLicenseManagerProvider, this.trackHelperProvider, this.userAgentProvider);
        this.cachedMediaHelperProvider = C2110b.m8173b(this.defaultExoCachedMediaHelperProvider);
        this.getExtensionProvider2 = DefaultExtensionModule_GetExtensionProviderFactory.create(builder.defaultExtensionModule, this.registryProvider);
        this.workManagerDownloadSchedulerProvider = C2110b.m8173b(WorkManagerDownloadScheduler_Factory.create(this.downloadWorkManagerHelperProvider, this.cachedMediaHelperProvider, this.roomMediaStorageProvider, this.accessTokenProvider, this.contextProvider, this.getExtensionProvider2));
        this.defaultDownloadTaskFactoryProvider = DefaultDownloadTaskFactory_Factory.create(this.workManagerDownloadSchedulerProvider, this.serviceTransactionProvider, this.roomMediaStorageProvider);
        this.downloadTaskFactoryProvider = C2110b.m8173b(this.defaultDownloadTaskFactoryProvider);
        this.exoDownloadSessionProvider = ExoDownloadSession_Factory.create(this.serviceTransactionProvider, this.workManagerDownloadSchedulerProvider, this.roomMediaStorageProvider, this.downloadTaskFactoryProvider, this.getExtensionProvider2, this.accessTokenProvider);
        this.sessionProvider = C2110b.m8173b(this.exoDownloadSessionProvider);
        this.notifierProvider = DefaultExtensionModule_NotifierFactory.create(builder.defaultExtensionModule, this.registryProvider);
        this.cacheProvider = C2110b.m8173b(CacheProvider_Factory.create(this.contextProvider));
        this.defaultConditionReporterProvider = DefaultConditionReporter_Factory.create(this.contextProvider);
        this.conditionReporterProvider = C2110b.m8173b(this.defaultConditionReporterProvider);
        this.defaultOfflineMediaApiProvider = C2110b.m8173b(DefaultOfflineMediaApi_Factory.create(this.serviceTransactionProvider, this.roomMediaStorageProvider, this.sessionProvider, this.downloadWorkManagerHelperProvider, this.notifierProvider, this.cacheProvider, this.conditionReporterProvider));
        this.pluginProvider = C2110b.m8173b(PlayheadModule_PluginFactory.create(builder.playheadModule, this.registryProvider));
        this.databaseProvider2 = C2110b.m8173b(C2006x1da49523.create(this.contextProvider));
        this.sessionInfoManagerProvider = C2110b.m8173b(SessionInfoExtensionModule_SessionInfoManagerFactory.create(builder.sessionInfoExtensionModule, this.registryProvider));
        this.bookmarksDatabaseProvider = BookmarksRepositoryModule_BookmarksDatabaseFactory.create(this.contextProvider);
        this.bookmarkDaoProvider = BookmarksRepositoryModule_BookmarkDaoFactory.create(this.bookmarksDatabaseProvider);
        this.defaultLocalBookmarkStoreProvider = DefaultLocalBookmarkStore_Factory.create(this.sessionInfoManagerProvider, this.bookmarkDaoProvider);
        this.defaultOfflineMediaClientProvider = DefaultOfflineMediaClient_Factory.create(this.roomMediaStorageProvider, this.pluginProvider, this.cacheProvider, this.databaseProvider2, this.defaultLocalBookmarkStoreProvider, this.sessionProvider);
        this.offlineMediaClientProvider = C2110b.m8173b(OfflineMediaClientModule_OfflineMediaClientFactory.create(builder.offlineMediaClientModule, this.defaultOfflineMediaClientProvider));
        this.downloadSessionSubcomponentBuilderProvider = new Provider<com.bamtech.sdk4.internal.media.offline.DownloadSessionSubcomponent.Builder>() {
            public com.bamtech.sdk4.internal.media.offline.DownloadSessionSubcomponent.Builder get() {
                return new DownloadSessionSubcomponentBuilder();
            }
        };
        this.defaultExtensionModule = builder.defaultExtensionModule;
        this.registry = builder.registry;
    }

    private DownloadMediaWorker injectDownloadMediaWorker(DownloadMediaWorker downloadMediaWorker) {
        DownloadMediaWorker_MembersInjector.injectSubcomponent(downloadMediaWorker, this.downloadSessionSubcomponentBuilderProvider);
        DownloadMediaWorker_MembersInjector.injectWorkManagerHelper(downloadMediaWorker, getDefaultDownloadWorkManagerHelper());
        DownloadMediaWorker_MembersInjector.injectTransactionProvider(downloadMediaWorker, this.serviceTransactionProvider);
        DownloadMediaWorker_MembersInjector.injectConditionReporter(downloadMediaWorker, (ConditionReporter) this.conditionReporterProvider.get());
        return downloadMediaWorker;
    }

    private OfflineMediaPlugin injectOfflineMediaPlugin(OfflineMediaPlugin offlineMediaPlugin) {
        OfflineMediaPlugin_MembersInjector.injectApi(offlineMediaPlugin, getOfflineMediaApi());
        OfflineMediaPlugin_MembersInjector.injectClient(offlineMediaPlugin, (OfflineMediaClient) this.offlineMediaClientProvider.get());
        return offlineMediaPlugin;
    }

    private ReleaseAllLicensesWorker injectReleaseAllLicensesWorker(ReleaseAllLicensesWorker releaseAllLicensesWorker) {
        ReleaseAllLicensesWorker_MembersInjector.injectLicenseManager(releaseAllLicensesWorker, (WidevineLicenseManager) this.offlineLicenseManagerProvider.get());
        ReleaseAllLicensesWorker_MembersInjector.injectDatabase(releaseAllLicensesWorker, (OfflineDatabase) this.databaseProvider.get());
        return releaseAllLicensesWorker;
    }

    private ReleaseLicenseWorker injectReleaseLicenseWorker(ReleaseLicenseWorker releaseLicenseWorker) {
        ReleaseLicenseWorker_MembersInjector.injectLicenseManager(releaseLicenseWorker, (WidevineLicenseManager) this.offlineLicenseManagerProvider.get());
        ReleaseLicenseWorker_MembersInjector.injectDatabase(releaseLicenseWorker, (OfflineDatabase) this.databaseProvider.get());
        return releaseLicenseWorker;
    }

    private ReleaseLicensesPeriodicWorker injectReleaseLicensesPeriodicWorker(ReleaseLicensesPeriodicWorker releaseLicensesPeriodicWorker) {
        ReleaseLicensesPeriodicWorker_MembersInjector.injectLicenseManager(releaseLicensesPeriodicWorker, (WidevineLicenseManager) this.offlineLicenseManagerProvider.get());
        ReleaseLicensesPeriodicWorker_MembersInjector.injectDatabase(releaseLicensesPeriodicWorker, (OfflineDatabase) this.databaseProvider.get());
        return releaseLicensesPeriodicWorker;
    }

    private RemoveMediaWorker injectRemoveMediaWorker(RemoveMediaWorker removeMediaWorker) {
        RemoveMediaWorker_MembersInjector.injectSubcomponent(removeMediaWorker, this.downloadSessionSubcomponentBuilderProvider);
        return removeMediaWorker;
    }

    private RenewLicenseWorker injectRenewLicenseWorker(RenewLicenseWorker renewLicenseWorker) {
        RenewLicenseWorker_MembersInjector.injectTransactionProvider(renewLicenseWorker, this.serviceTransactionProvider);
        RenewLicenseWorker_MembersInjector.injectDownloadWorkManager(renewLicenseWorker, (DownloadWorkManagerHelper) this.downloadWorkManagerHelperProvider.get());
        return renewLicenseWorker;
    }

    private RenewLicensesWorker injectRenewLicensesWorker(RenewLicensesWorker renewLicensesWorker) {
        RenewLicensesWorker_MembersInjector.injectLicenseManager(renewLicensesWorker, (WidevineLicenseManager) this.offlineLicenseManagerProvider.get());
        RenewLicensesWorker_MembersInjector.injectDatabase(renewLicensesWorker, (OfflineDatabase) this.databaseProvider.get());
        RenewLicensesWorker_MembersInjector.injectTransactionProvider(renewLicensesWorker, this.serviceTransactionProvider);
        RenewLicensesWorker_MembersInjector.injectDownloadWorkManager(renewLicensesWorker, (DownloadWorkManagerHelper) this.downloadWorkManagerHelperProvider.get());
        RenewLicensesWorker_MembersInjector.injectExoCachedMediaHelper(renewLicensesWorker, (ExoCachedMediaHelper) this.cachedMediaHelperProvider.get());
        RenewLicensesWorker_MembersInjector.injectUserAgent(renewLicensesWorker, getUserAgentString());
        return renewLicensesWorker;
    }

    public void inject(OfflineMediaPlugin offlineMediaPlugin) {
        injectOfflineMediaPlugin(offlineMediaPlugin);
    }

    public MediaStorage mediaStorage() {
        return (MediaStorage) this.roomMediaStorageProvider.get();
    }

    private DaggerOfflineMediaPluginComponent(Builder builder) {
        initialize(builder);
    }

    public void inject(DownloadMediaWorker downloadMediaWorker) {
        injectDownloadMediaWorker(downloadMediaWorker);
    }

    public void inject(RemoveMediaWorker removeMediaWorker) {
        injectRemoveMediaWorker(removeMediaWorker);
    }

    public void inject(RenewLicenseWorker renewLicenseWorker) {
        injectRenewLicenseWorker(renewLicenseWorker);
    }

    public void inject(RenewLicensesWorker renewLicensesWorker) {
        injectRenewLicensesWorker(renewLicensesWorker);
    }

    public void inject(ReleaseLicenseWorker releaseLicenseWorker) {
        injectReleaseLicenseWorker(releaseLicenseWorker);
    }

    public void inject(ReleaseAllLicensesWorker releaseAllLicensesWorker) {
        injectReleaseAllLicensesWorker(releaseAllLicensesWorker);
    }

    public void inject(ReleaseLicensesPeriodicWorker releaseLicensesPeriodicWorker) {
        injectReleaseLicensesPeriodicWorker(releaseLicensesPeriodicWorker);
    }
}
