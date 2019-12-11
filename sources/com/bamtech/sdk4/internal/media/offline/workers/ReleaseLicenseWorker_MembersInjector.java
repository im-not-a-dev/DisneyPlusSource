package com.bamtech.sdk4.internal.media.offline.workers;

import com.bamtech.sdk4.internal.media.offline.WidevineLicenseManager;
import com.bamtech.sdk4.internal.media.offline.p047db.OfflineDatabase;
import com.bamtech.shadow.dagger.MembersInjector;

public final class ReleaseLicenseWorker_MembersInjector implements MembersInjector<ReleaseLicenseWorker> {
    public static void injectDatabase(ReleaseLicenseWorker releaseLicenseWorker, OfflineDatabase offlineDatabase) {
        releaseLicenseWorker.database = offlineDatabase;
    }

    public static void injectLicenseManager(ReleaseLicenseWorker releaseLicenseWorker, WidevineLicenseManager widevineLicenseManager) {
        releaseLicenseWorker.licenseManager = widevineLicenseManager;
    }
}
