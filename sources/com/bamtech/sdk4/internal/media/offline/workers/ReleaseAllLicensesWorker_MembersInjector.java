package com.bamtech.sdk4.internal.media.offline.workers;

import com.bamtech.sdk4.internal.media.offline.WidevineLicenseManager;
import com.bamtech.sdk4.internal.media.offline.p047db.OfflineDatabase;
import com.bamtech.shadow.dagger.MembersInjector;

public final class ReleaseAllLicensesWorker_MembersInjector implements MembersInjector<ReleaseAllLicensesWorker> {
    public static void injectDatabase(ReleaseAllLicensesWorker releaseAllLicensesWorker, OfflineDatabase offlineDatabase) {
        releaseAllLicensesWorker.database = offlineDatabase;
    }

    public static void injectLicenseManager(ReleaseAllLicensesWorker releaseAllLicensesWorker, WidevineLicenseManager widevineLicenseManager) {
        releaseAllLicensesWorker.licenseManager = widevineLicenseManager;
    }
}
