package com.bamtech.sdk4.internal.media.offline;

import com.bamtech.sdk4.internal.media.offline.workers.DefaultDownload;
import com.bamtech.sdk4.internal.media.offline.workers.Download;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import javax.inject.Provider;

public final class DownloadSessionModule_DownloadFactory implements C2111c<Download> {
    private final Provider<DefaultDownload> downloadManagerProvider;
    private final DownloadSessionModule module;

    public DownloadSessionModule_DownloadFactory(DownloadSessionModule downloadSessionModule, Provider<DefaultDownload> provider) {
        this.module = downloadSessionModule;
        this.downloadManagerProvider = provider;
    }

    public static DownloadSessionModule_DownloadFactory create(DownloadSessionModule downloadSessionModule, Provider<DefaultDownload> provider) {
        return new DownloadSessionModule_DownloadFactory(downloadSessionModule, provider);
    }

    public Download get() {
        Download download = this.module.download((DefaultDownload) this.downloadManagerProvider.get());
        C2113e.m8178a(download, "Cannot return null from a non-@Nullable @Provides method");
        return download;
    }
}
