package com.bamtech.sdk4.internal.media.offline.workers;

import com.bamtech.sdk4.internal.media.offline.DownloadWorkManagerHelper;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.shadow.dagger.MembersInjector;
import javax.inject.Provider;

public final class RenewLicenseWorker_MembersInjector implements MembersInjector<RenewLicenseWorker> {
    public static void injectDownloadWorkManager(RenewLicenseWorker renewLicenseWorker, DownloadWorkManagerHelper downloadWorkManagerHelper) {
        renewLicenseWorker.downloadWorkManager = downloadWorkManagerHelper;
    }

    public static void injectTransactionProvider(RenewLicenseWorker renewLicenseWorker, Provider<ServiceTransaction> provider) {
        renewLicenseWorker.transactionProvider = provider;
    }
}
