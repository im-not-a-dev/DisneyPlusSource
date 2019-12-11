package com.bamtech.sdk4.internal.media.offline;

import android.content.Context;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import com.google.android.exoplayer2.offline.DownloaderConstructorHelper;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.upstream.cache.Cache;
import javax.inject.Provider;

public final class DownloadSessionModule_DownloadConstructorHelperFactory implements C2111c<DownloaderConstructorHelper> {
    private final Provider<Cache> cacheProvider;
    private final Provider<Context> contextProvider;
    private final DownloadSessionModule module;
    private final Provider<TransferListener> transferListenerProvider;
    private final Provider<String> userAgentProvider;

    public DownloadSessionModule_DownloadConstructorHelperFactory(DownloadSessionModule downloadSessionModule, Provider<Context> provider, Provider<String> provider2, Provider<TransferListener> provider3, Provider<Cache> provider4) {
        this.module = downloadSessionModule;
        this.contextProvider = provider;
        this.userAgentProvider = provider2;
        this.transferListenerProvider = provider3;
        this.cacheProvider = provider4;
    }

    public static DownloadSessionModule_DownloadConstructorHelperFactory create(DownloadSessionModule downloadSessionModule, Provider<Context> provider, Provider<String> provider2, Provider<TransferListener> provider3, Provider<Cache> provider4) {
        DownloadSessionModule_DownloadConstructorHelperFactory downloadSessionModule_DownloadConstructorHelperFactory = new DownloadSessionModule_DownloadConstructorHelperFactory(downloadSessionModule, provider, provider2, provider3, provider4);
        return downloadSessionModule_DownloadConstructorHelperFactory;
    }

    public DownloaderConstructorHelper get() {
        DownloaderConstructorHelper downloadConstructorHelper = this.module.downloadConstructorHelper((Context) this.contextProvider.get(), (String) this.userAgentProvider.get(), (TransferListener) this.transferListenerProvider.get(), (Cache) this.cacheProvider.get());
        C2113e.m8178a(downloadConstructorHelper, "Cannot return null from a non-@Nullable @Provides method");
        return downloadConstructorHelper;
    }
}
