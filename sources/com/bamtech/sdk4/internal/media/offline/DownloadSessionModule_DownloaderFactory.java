package com.bamtech.sdk4.internal.media.offline;

import com.bamtech.sdk4.internal.media.ExoCachedMedia;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import com.google.android.exoplayer2.offline.Downloader;
import com.google.android.exoplayer2.offline.DownloaderConstructorHelper;
import javax.inject.Provider;

public final class DownloadSessionModule_DownloaderFactory implements C2111c<Downloader> {
    private final Provider<ExoCachedMedia> cachedMediaProvider;
    private final Provider<DownloaderConstructorHelper> helperProvider;
    private final DownloadSessionModule module;

    public DownloadSessionModule_DownloaderFactory(DownloadSessionModule downloadSessionModule, Provider<ExoCachedMedia> provider, Provider<DownloaderConstructorHelper> provider2) {
        this.module = downloadSessionModule;
        this.cachedMediaProvider = provider;
        this.helperProvider = provider2;
    }

    public static DownloadSessionModule_DownloaderFactory create(DownloadSessionModule downloadSessionModule, Provider<ExoCachedMedia> provider, Provider<DownloaderConstructorHelper> provider2) {
        return new DownloadSessionModule_DownloaderFactory(downloadSessionModule, provider, provider2);
    }

    public Downloader get() {
        Downloader downloader = this.module.downloader((ExoCachedMedia) this.cachedMediaProvider.get(), (DownloaderConstructorHelper) this.helperProvider.get());
        C2113e.m8178a(downloader, "Cannot return null from a non-@Nullable @Provides method");
        return downloader;
    }
}
