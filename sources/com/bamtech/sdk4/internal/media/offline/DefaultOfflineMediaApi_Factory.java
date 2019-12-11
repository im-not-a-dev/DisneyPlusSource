package com.bamtech.sdk4.internal.media.offline;

import com.bamtech.sdk4.internal.event.LogoutMode;
import com.bamtech.sdk4.internal.media.CacheProvider;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.media.offline.DownloadSession;
import com.bamtech.shadow.dagger.p048a.C2111c;
import javax.inject.Provider;
import p520io.reactivex.subjects.PublishSubject;

public final class DefaultOfflineMediaApi_Factory implements C2111c<DefaultOfflineMediaApi> {
    private final Provider<CacheProvider> cacheProvider;
    private final Provider<ConditionReporter> conditionReporterProvider;
    private final Provider<DownloadSession> downloadSessionProvider;
    private final Provider<DownloadWorkManagerHelper> helperProvider;
    private final Provider<MediaStorage> mediaStorageProvider;
    private final Provider<PublishSubject<LogoutMode>> notifierProvider;
    private final Provider<ServiceTransaction> transactionProvider;

    public DefaultOfflineMediaApi_Factory(Provider<ServiceTransaction> provider, Provider<MediaStorage> provider2, Provider<DownloadSession> provider3, Provider<DownloadWorkManagerHelper> provider4, Provider<PublishSubject<LogoutMode>> provider5, Provider<CacheProvider> provider6, Provider<ConditionReporter> provider7) {
        this.transactionProvider = provider;
        this.mediaStorageProvider = provider2;
        this.downloadSessionProvider = provider3;
        this.helperProvider = provider4;
        this.notifierProvider = provider5;
        this.cacheProvider = provider6;
        this.conditionReporterProvider = provider7;
    }

    public static DefaultOfflineMediaApi_Factory create(Provider<ServiceTransaction> provider, Provider<MediaStorage> provider2, Provider<DownloadSession> provider3, Provider<DownloadWorkManagerHelper> provider4, Provider<PublishSubject<LogoutMode>> provider5, Provider<CacheProvider> provider6, Provider<ConditionReporter> provider7) {
        DefaultOfflineMediaApi_Factory defaultOfflineMediaApi_Factory = new DefaultOfflineMediaApi_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
        return defaultOfflineMediaApi_Factory;
    }

    public DefaultOfflineMediaApi get() {
        DefaultOfflineMediaApi defaultOfflineMediaApi = new DefaultOfflineMediaApi(this.transactionProvider, (MediaStorage) this.mediaStorageProvider.get(), (DownloadSession) this.downloadSessionProvider.get(), (DownloadWorkManagerHelper) this.helperProvider.get(), (PublishSubject) this.notifierProvider.get(), (CacheProvider) this.cacheProvider.get(), (ConditionReporter) this.conditionReporterProvider.get());
        return defaultOfflineMediaApi;
    }
}
