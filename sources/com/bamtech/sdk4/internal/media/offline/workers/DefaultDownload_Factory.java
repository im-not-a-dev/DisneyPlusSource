package com.bamtech.sdk4.internal.media.offline.workers;

import android.content.Context;
import com.bamtech.sdk4.internal.media.CacheProvider;
import com.bamtech.sdk4.internal.media.ExoCachedMedia;
import com.bamtech.sdk4.internal.media.offline.DownloadScheduler;
import com.bamtech.sdk4.internal.media.offline.p047db.OfflineDatabase;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.google.android.exoplayer2.database.DatabaseProvider;
import com.google.android.exoplayer2.offline.Downloader;
import javax.inject.Provider;

public final class DefaultDownload_Factory implements C2111c<DefaultDownload> {
    private final Provider<CacheProvider> cacheProvider;
    private final Provider<ExoCachedMedia> cachedMediaProvider;
    private final Provider<Context> contextProvider;
    private final Provider<OfflineDatabase> databaseProvider;
    private final Provider<DatabaseProvider> databaseProvider2;
    private final Provider<Downloader> downloaderProvider;
    private final Provider<DownloadScheduler> schedulerProvider;
    private final Provider<ServiceTransaction> transactionProvider;

    public DefaultDownload_Factory(Provider<OfflineDatabase> provider, Provider<Downloader> provider2, Provider<ExoCachedMedia> provider3, Provider<ServiceTransaction> provider4, Provider<DownloadScheduler> provider5, Provider<Context> provider6, Provider<DatabaseProvider> provider7, Provider<CacheProvider> provider8) {
        this.databaseProvider = provider;
        this.downloaderProvider = provider2;
        this.cachedMediaProvider = provider3;
        this.transactionProvider = provider4;
        this.schedulerProvider = provider5;
        this.contextProvider = provider6;
        this.databaseProvider2 = provider7;
        this.cacheProvider = provider8;
    }

    public static DefaultDownload_Factory create(Provider<OfflineDatabase> provider, Provider<Downloader> provider2, Provider<ExoCachedMedia> provider3, Provider<ServiceTransaction> provider4, Provider<DownloadScheduler> provider5, Provider<Context> provider6, Provider<DatabaseProvider> provider7, Provider<CacheProvider> provider8) {
        DefaultDownload_Factory defaultDownload_Factory = new DefaultDownload_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
        return defaultDownload_Factory;
    }

    public DefaultDownload get() {
        DefaultDownload defaultDownload = new DefaultDownload((OfflineDatabase) this.databaseProvider.get(), (Downloader) this.downloaderProvider.get(), (ExoCachedMedia) this.cachedMediaProvider.get(), this.transactionProvider, (DownloadScheduler) this.schedulerProvider.get(), (Context) this.contextProvider.get(), (DatabaseProvider) this.databaseProvider2.get(), (CacheProvider) this.cacheProvider.get());
        return defaultDownload;
    }
}
