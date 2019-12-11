package com.bamtech.sdk4.internal.media.offline;

import android.content.Context;
import com.bamtech.sdk4.internal.token.AccessTokenProvider;
import com.bamtech.sdk4.plugin.ExtensionInstanceProvider;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class WorkManagerDownloadScheduler_Factory implements C2111c<WorkManagerDownloadScheduler> {
    private final Provider<Context> contextProvider;
    private final Provider<ExoCachedMediaHelper> exoCachedMediaHelperProvider;
    private final Provider<ExtensionInstanceProvider> extensionProvider;
    private final Provider<MediaStorage> mediaStorageProvider;
    private final Provider<AccessTokenProvider> tokenProvider;
    private final Provider<DownloadWorkManagerHelper> workManagerHelperProvider;

    public WorkManagerDownloadScheduler_Factory(Provider<DownloadWorkManagerHelper> provider, Provider<ExoCachedMediaHelper> provider2, Provider<MediaStorage> provider3, Provider<AccessTokenProvider> provider4, Provider<Context> provider5, Provider<ExtensionInstanceProvider> provider6) {
        this.workManagerHelperProvider = provider;
        this.exoCachedMediaHelperProvider = provider2;
        this.mediaStorageProvider = provider3;
        this.tokenProvider = provider4;
        this.contextProvider = provider5;
        this.extensionProvider = provider6;
    }

    public static WorkManagerDownloadScheduler_Factory create(Provider<DownloadWorkManagerHelper> provider, Provider<ExoCachedMediaHelper> provider2, Provider<MediaStorage> provider3, Provider<AccessTokenProvider> provider4, Provider<Context> provider5, Provider<ExtensionInstanceProvider> provider6) {
        WorkManagerDownloadScheduler_Factory workManagerDownloadScheduler_Factory = new WorkManagerDownloadScheduler_Factory(provider, provider2, provider3, provider4, provider5, provider6);
        return workManagerDownloadScheduler_Factory;
    }

    public WorkManagerDownloadScheduler get() {
        WorkManagerDownloadScheduler workManagerDownloadScheduler = new WorkManagerDownloadScheduler((DownloadWorkManagerHelper) this.workManagerHelperProvider.get(), (ExoCachedMediaHelper) this.exoCachedMediaHelperProvider.get(), (MediaStorage) this.mediaStorageProvider.get(), (AccessTokenProvider) this.tokenProvider.get(), (Context) this.contextProvider.get(), (ExtensionInstanceProvider) this.extensionProvider.get());
        return workManagerDownloadScheduler;
    }
}
