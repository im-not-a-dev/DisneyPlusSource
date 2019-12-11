package com.bamtech.sdk4.internal.media.offline.workers;

import com.bamtech.sdk4.internal.media.offline.WidevineLicenseManager;
import com.bamtech.sdk4.internal.media.offline.p047db.OfflineDatabase;
import com.bamtech.shadow.dagger.MembersInjector;

public final class ReleaseLicensesPeriodicWorker_MembersInjector implements MembersInjector<ReleaseLicensesPeriodicWorker> {
    public static void injectDatabase(ReleaseLicensesPeriodicWorker releaseLicensesPeriodicWorker, OfflineDatabase offlineDatabase) {
        releaseLicensesPeriodicWorker.database = offlineDatabase;
    }

    public static void injectLicenseManager(ReleaseLicensesPeriodicWorker releaseLicensesPeriodicWorker, WidevineLicenseManager widevineLicenseManager) {
        releaseLicensesPeriodicWorker.licenseManager = widevineLicenseManager;
    }
}
