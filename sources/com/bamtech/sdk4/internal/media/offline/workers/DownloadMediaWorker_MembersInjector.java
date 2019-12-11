package com.bamtech.sdk4.internal.media.offline.workers;

import com.bamtech.sdk4.internal.media.offline.ConditionReporter;
import com.bamtech.sdk4.internal.media.offline.DefaultDownloadWorkManagerHelper;
import com.bamtech.sdk4.internal.media.offline.DownloadSessionSubcomponent.Builder;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.shadow.dagger.MembersInjector;
import javax.inject.Provider;

public final class DownloadMediaWorker_MembersInjector implements MembersInjector<DownloadMediaWorker> {
    public static void injectConditionReporter(DownloadMediaWorker downloadMediaWorker, ConditionReporter conditionReporter) {
        downloadMediaWorker.conditionReporter = conditionReporter;
    }

    public static void injectSubcomponent(DownloadMediaWorker downloadMediaWorker, Provider<Builder> provider) {
        downloadMediaWorker.subcomponent = provider;
    }

    public static void injectTransactionProvider(DownloadMediaWorker downloadMediaWorker, Provider<ServiceTransaction> provider) {
        downloadMediaWorker.transactionProvider = provider;
    }

    public static void injectWorkManagerHelper(DownloadMediaWorker downloadMediaWorker, DefaultDownloadWorkManagerHelper defaultDownloadWorkManagerHelper) {
        downloadMediaWorker.workManagerHelper = defaultDownloadWorkManagerHelper;
    }
}
