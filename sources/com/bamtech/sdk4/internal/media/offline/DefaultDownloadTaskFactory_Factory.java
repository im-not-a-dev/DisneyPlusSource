package com.bamtech.sdk4.internal.media.offline;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;

public final class DefaultDownloadTaskFactory_Factory implements C2111c<DefaultDownloadTaskFactory> {
    private final Provider<MediaStorage> mediaStorageProvider;
    private final Provider<DownloadScheduler> schedulerProvider;
    private final Provider<ServiceTransaction> transactionProvider;

    public DefaultDownloadTaskFactory_Factory(Provider<DownloadScheduler> provider, Provider<ServiceTransaction> provider2, Provider<MediaStorage> provider3) {
        this.schedulerProvider = provider;
        this.transactionProvider = provider2;
        this.mediaStorageProvider = provider3;
    }

    public static DefaultDownloadTaskFactory_Factory create(Provider<DownloadScheduler> provider, Provider<ServiceTransaction> provider2, Provider<MediaStorage> provider3) {
        return new DefaultDownloadTaskFactory_Factory(provider, provider2, provider3);
    }

    public DefaultDownloadTaskFactory get() {
        return new DefaultDownloadTaskFactory((DownloadScheduler) this.schedulerProvider.get(), this.transactionProvider, (MediaStorage) this.mediaStorageProvider.get());
    }
}
