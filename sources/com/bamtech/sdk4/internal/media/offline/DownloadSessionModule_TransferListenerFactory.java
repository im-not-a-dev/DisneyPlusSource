package com.bamtech.sdk4.internal.media.offline;

import com.bamtech.sdk4.internal.media.offline.workers.Download;
import com.bamtech.shadow.dagger.p048a.C2110b;
import com.bamtech.shadow.dagger.p048a.C2111c;
import com.bamtech.shadow.dagger.p048a.C2113e;
import com.google.android.exoplayer2.upstream.TransferListener;
import javax.inject.Provider;

public final class DownloadSessionModule_TransferListenerFactory implements C2111c<TransferListener> {
    private final Provider<Download> downloadProvider;
    private final DownloadSessionModule module;

    public DownloadSessionModule_TransferListenerFactory(DownloadSessionModule downloadSessionModule, Provider<Download> provider) {
        this.module = downloadSessionModule;
        this.downloadProvider = provider;
    }

    public static DownloadSessionModule_TransferListenerFactory create(DownloadSessionModule downloadSessionModule, Provider<Download> provider) {
        return new DownloadSessionModule_TransferListenerFactory(downloadSessionModule, provider);
    }

    public TransferListener get() {
        TransferListener transferListener = this.module.transferListener(C2110b.m8172a(this.downloadProvider));
        C2113e.m8178a(transferListener, "Cannot return null from a non-@Nullable @Provides method");
        return transferListener;
    }
}
