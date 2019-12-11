package com.bamtech.sdk4.internal.media.offline;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.token.AccessTokenProvider;
import com.bamtech.sdk4.plugin.ExtensionInstanceProvider;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class ExoDownloadSession_Factory implements C2111c<ExoDownloadSession> {
    private final Provider<ExtensionInstanceProvider> extensionProvider;
    private final Provider<MediaStorage> mediaStorageProvider;
    private final Provider<DownloadScheduler> schedulerProvider;
    private final Provider<DownloadTaskFactory> taskFactoryProvider;
    private final Provider<AccessTokenProvider> tokenProvider;
    private final Provider<ServiceTransaction> transactionProvider;

    public ExoDownloadSession_Factory(Provider<ServiceTransaction> provider, Provider<DownloadScheduler> provider2, Provider<MediaStorage> provider3, Provider<DownloadTaskFactory> provider4, Provider<ExtensionInstanceProvider> provider5, Provider<AccessTokenProvider> provider6) {
        this.transactionProvider = provider;
        this.schedulerProvider = provider2;
        this.mediaStorageProvider = provider3;
        this.taskFactoryProvider = provider4;
        this.extensionProvider = provider5;
        this.tokenProvider = provider6;
    }

    public static ExoDownloadSession_Factory create(Provider<ServiceTransaction> provider, Provider<DownloadScheduler> provider2, Provider<MediaStorage> provider3, Provider<DownloadTaskFactory> provider4, Provider<ExtensionInstanceProvider> provider5, Provider<AccessTokenProvider> provider6) {
        ExoDownloadSession_Factory exoDownloadSession_Factory = new ExoDownloadSession_Factory(provider, provider2, provider3, provider4, provider5, provider6);
        return exoDownloadSession_Factory;
    }

    public ExoDownloadSession get() {
        ExoDownloadSession exoDownloadSession = new ExoDownloadSession(this.transactionProvider, (DownloadScheduler) this.schedulerProvider.get(), (MediaStorage) this.mediaStorageProvider.get(), (DownloadTaskFactory) this.taskFactoryProvider.get(), (ExtensionInstanceProvider) this.extensionProvider.get(), (AccessTokenProvider) this.tokenProvider.get());
        return exoDownloadSession;
    }
}
