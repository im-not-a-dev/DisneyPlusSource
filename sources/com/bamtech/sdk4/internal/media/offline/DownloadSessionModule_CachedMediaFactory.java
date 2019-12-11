package com.bamtech.sdk4.internal.media.offline;

import com.bamtech.sdk4.internal.media.ExoCachedMedia;
import com.bamtech.sdk4.internal.media.offline.p047db.OfflineDatabase;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import javax.inject.Provider;

public final class DownloadSessionModule_CachedMediaFactory implements C2111c<ExoCachedMedia> {
    private final Provider<OfflineDatabase> databaseProvider;
    private final DownloadSessionModule module;

    public DownloadSessionModule_CachedMediaFactory(DownloadSessionModule downloadSessionModule, Provider<OfflineDatabase> provider) {
        this.module = downloadSessionModule;
        this.databaseProvider = provider;
    }

    public static DownloadSessionModule_CachedMediaFactory create(DownloadSessionModule downloadSessionModule, Provider<OfflineDatabase> provider) {
        return new DownloadSessionModule_CachedMediaFactory(downloadSessionModule, provider);
    }

    public ExoCachedMedia get() {
        ExoCachedMedia cachedMedia = this.module.cachedMedia((OfflineDatabase) this.databaseProvider.get());
        C2113e.m8178a(cachedMedia, "Cannot return null from a non-@Nullable @Provides method");
        return cachedMedia;
    }
}
