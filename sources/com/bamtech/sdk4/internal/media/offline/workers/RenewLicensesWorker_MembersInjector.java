package com.bamtech.sdk4.internal.media.offline.workers;

import com.bamtech.sdk4.internal.media.offline.DownloadWorkManagerHelper;
import com.bamtech.sdk4.internal.media.offline.ExoCachedMediaHelper;
import com.bamtech.sdk4.internal.media.offline.WidevineLicenseManager;
import com.bamtech.sdk4.internal.media.offline.p047db.OfflineDatabase;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.shadow.dagger.MembersInjector;
import javax.inject.Provider;

public final class RenewLicensesWorker_MembersInjector implements MembersInjector<RenewLicensesWorker> {
    public static void injectDatabase(RenewLicensesWorker renewLicensesWorker, OfflineDatabase offlineDatabase) {
        renewLicensesWorker.database = offlineDatabase;
    }

    public static void injectDownloadWorkManager(RenewLicensesWorker renewLicensesWorker, DownloadWorkManagerHelper downloadWorkManagerHelper) {
        renewLicensesWorker.downloadWorkManager = downloadWorkManagerHelper;
    }

    public static void injectExoCachedMediaHelper(RenewLicensesWorker renewLicensesWorker, ExoCachedMediaHelper exoCachedMediaHelper) {
        renewLicensesWorker.exoCachedMediaHelper = exoCachedMediaHelper;
    }

    public static void injectLicenseManager(RenewLicensesWorker renewLicensesWorker, WidevineLicenseManager widevineLicenseManager) {
        renewLicensesWorker.licenseManager = widevineLicenseManager;
    }

    public static void injectTransactionProvider(RenewLicensesWorker renewLicensesWorker, Provider<ServiceTransaction> provider) {
        renewLicensesWorker.transactionProvider = provider;
    }

    public static void injectUserAgent(RenewLicensesWorker renewLicensesWorker, String str) {
        renewLicensesWorker.userAgent = str;
    }
}
