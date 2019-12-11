package com.bamtech.sdk4.internal.media.offline;

import com.bamtech.sdk4.internal.media.CacheProvider;
import com.bamtech.sdk4.internal.media.ExoCachedMedia;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import com.google.android.exoplayer2.database.DatabaseProvider;
import com.google.android.exoplayer2.upstream.cache.Cache;
import javax.inject.Provider;

public final class DownloadSessionModule_CacheFactory implements C2111c<Cache> {
    private final Provider<CacheProvider> cacheProvider;
    private final Provider<ExoCachedMedia> cachedMediaProvider;
    private final Provider<DatabaseProvider> databaseProvider;
    private final DownloadSessionModule module;
    private final Provider<ServiceTransaction> transactionProvider;

    public DownloadSessionModule_CacheFactory(DownloadSessionModule downloadSessionModule, Provider<CacheProvider> provider, Provider<ServiceTransaction> provider2, Provider<ExoCachedMedia> provider3, Provider<DatabaseProvider> provider4) {
        this.module = downloadSessionModule;
        this.cacheProvider = provider;
        this.transactionProvider = provider2;
        this.cachedMediaProvider = provider3;
        this.databaseProvider = provider4;
    }

    public static DownloadSessionModule_CacheFactory create(DownloadSessionModule downloadSessionModule, Provider<CacheProvider> provider, Provider<ServiceTransaction> provider2, Provider<ExoCachedMedia> provider3, Provider<DatabaseProvider> provider4) {
        DownloadSessionModule_CacheFactory downloadSessionModule_CacheFactory = new DownloadSessionModule_CacheFactory(downloadSessionModule, provider, provider2, provider3, provider4);
        return downloadSessionModule_CacheFactory;
    }

    public Cache get() {
        Cache cache = this.module.cache((CacheProvider) this.cacheProvider.get(), this.transactionProvider, (ExoCachedMedia) this.cachedMediaProvider.get(), (DatabaseProvider) this.databaseProvider.get());
        C2113e.m8178a(cache, "Cannot return null from a non-@Nullable @Provides method");
        return cache;
    }
}
