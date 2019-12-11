package com.bamtech.sdk4.internal.media.offline.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.bamtech.sdk4.internal.media.offline.DownloadWorkManagerHelper;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.media.offline.OfflineMediaPlugin;
import javax.inject.Provider;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0018\u001a\u00020\u0019H\u0016R$\u0010\u0007\u001a\u00020\b8\u0000@\u0000X.¢\u0006\u0014\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR.\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\u00110\u0010j\u0002`\u00128\u0000@\u0000X.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0013\u0010\n\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/workers/RenewLicenseWorker;", "Landroidx/work/Worker;", "context", "Landroid/content/Context;", "parameters", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "downloadWorkManager", "Lcom/bamtech/sdk4/internal/media/offline/DownloadWorkManagerHelper;", "downloadWorkManager$annotations", "()V", "getDownloadWorkManager$plugin_offline_media_release", "()Lcom/bamtech/sdk4/internal/media/offline/DownloadWorkManagerHelper;", "setDownloadWorkManager$plugin_offline_media_release", "(Lcom/bamtech/sdk4/internal/media/offline/DownloadWorkManagerHelper;)V", "transactionProvider", "Ljavax/inject/Provider;", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "Lcom/bamtech/sdk4/internal/service/ServiceTransactionProvider;", "transactionProvider$annotations", "getTransactionProvider$plugin_offline_media_release", "()Ljavax/inject/Provider;", "setTransactionProvider$plugin_offline_media_release", "(Ljavax/inject/Provider;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: RenewLicenseWorker.kt */
public final class RenewLicenseWorker extends Worker {
    public DownloadWorkManagerHelper downloadWorkManager;
    public Provider<ServiceTransaction> transactionProvider;

    public RenewLicenseWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        OfflineMediaPlugin.Companion.getComponent$plugin_offline_media_release().inject(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003b, code lost:
        if (kotlin.p590y.C13185o.m40520c(androidx.work.WorkInfo.State.RUNNING, androidx.work.WorkInfo.State.ENQUEUED).contains(r0.mo5630a()) == false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.work.ListenableWorker.Result doWork() {
        /*
            r8 = this;
            androidx.work.WorkManager r0 = androidx.work.WorkManager.m5490a()
            java.lang.String r1 = "WorkManager.getInstance()"
            kotlin.jvm.internal.C12880j.m40222a(r0, r1)
            java.lang.String r1 = "renew_licenses"
            com.google.common.util.concurrent.ListenableFuture r0 = r0.mo5645c(r1)
            java.lang.Object r0 = r0.get()
            java.util.List r0 = (java.util.List) r0
            r1 = 0
            if (r0 == 0) goto L_0x001f
            java.lang.Object r0 = kotlin.p590y.C13199w.m40595i(r0)
            androidx.work.WorkInfo r0 = (androidx.work.WorkInfo) r0
            goto L_0x0020
        L_0x001f:
            r0 = r1
        L_0x0020:
            if (r0 == 0) goto L_0x003d
            r2 = 2
            androidx.work.WorkInfo$State[] r2 = new androidx.work.WorkInfo.State[r2]
            r3 = 0
            androidx.work.WorkInfo$State r4 = androidx.work.WorkInfo.State.RUNNING
            r2[r3] = r4
            r3 = 1
            androidx.work.WorkInfo$State r4 = androidx.work.WorkInfo.State.ENQUEUED
            r2[r3] = r4
            java.util.List r2 = kotlin.p590y.C13185o.m40520c(r2)
            androidx.work.WorkInfo$State r0 = r0.mo5630a()
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L_0x0058
        L_0x003d:
            com.bamtech.sdk4.internal.media.offline.DownloadWorkManagerHelper r2 = r8.downloadWorkManager
            if (r2 == 0) goto L_0x0073
            javax.inject.Provider<com.bamtech.sdk4.internal.service.ServiceTransaction> r0 = r8.transactionProvider
            if (r0 == 0) goto L_0x006d
            java.lang.Object r0 = r0.get()
            java.lang.String r1 = "transactionProvider.get()"
            kotlin.jvm.internal.C12880j.m40222a(r0, r1)
            r3 = r0
            com.bamtech.sdk4.internal.service.ServiceTransaction r3 = (com.bamtech.sdk4.internal.service.ServiceTransaction) r3
            r4 = 0
            r6 = 2
            r7 = 0
            com.bamtech.sdk4.internal.media.offline.DownloadWorkManagerHelper.DefaultImpls.startPeriodicLicenseRenewal$default(r2, r3, r4, r6, r7)
        L_0x0058:
            androidx.work.WorkManager r0 = androidx.work.WorkManager.m5490a()
            java.util.UUID r1 = r8.getId()
            r0.mo5640a(r1)
            androidx.work.ListenableWorker$Result r0 = androidx.work.ListenableWorker.Result.m5470c()
            java.lang.String r1 = "Result.success()"
            kotlin.jvm.internal.C12880j.m40222a(r0, r1)
            return r0
        L_0x006d:
            java.lang.String r0 = "transactionProvider"
            kotlin.jvm.internal.C12880j.m40227c(r0)
            throw r1
        L_0x0073:
            java.lang.String r0 = "downloadWorkManager"
            kotlin.jvm.internal.C12880j.m40227c(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.media.offline.workers.RenewLicenseWorker.doWork():androidx.work.ListenableWorker$Result");
    }
}
