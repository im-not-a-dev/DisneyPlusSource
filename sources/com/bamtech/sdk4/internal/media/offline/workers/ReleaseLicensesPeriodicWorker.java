package com.bamtech.sdk4.internal.media.offline.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.bamtech.sdk4.internal.media.offline.WidevineLicenseManager;
import com.bamtech.sdk4.internal.media.offline.p047db.OfflineDatabase;
import com.bamtech.sdk4.media.offline.OfflineMediaPlugin;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0016\u001a\u00020\u0017H\u0016R$\u0010\u0007\u001a\u00020\b8\u0000@\u0000X.¢\u0006\u0014\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\u00020\u00108\u0000@\u0000X.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/workers/ReleaseLicensesPeriodicWorker;", "Landroidx/work/Worker;", "context", "Landroid/content/Context;", "parameters", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "database", "Lcom/bamtech/sdk4/internal/media/offline/db/OfflineDatabase;", "database$annotations", "()V", "getDatabase$plugin_offline_media_release", "()Lcom/bamtech/sdk4/internal/media/offline/db/OfflineDatabase;", "setDatabase$plugin_offline_media_release", "(Lcom/bamtech/sdk4/internal/media/offline/db/OfflineDatabase;)V", "licenseManager", "Lcom/bamtech/sdk4/internal/media/offline/WidevineLicenseManager;", "licenseManager$annotations", "getLicenseManager$plugin_offline_media_release", "()Lcom/bamtech/sdk4/internal/media/offline/WidevineLicenseManager;", "setLicenseManager$plugin_offline_media_release", "(Lcom/bamtech/sdk4/internal/media/offline/WidevineLicenseManager;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ReleaseLicensesPeriodicWorker.kt */
public final class ReleaseLicensesPeriodicWorker extends Worker {
    public OfflineDatabase database;
    public WidevineLicenseManager licenseManager;

    public ReleaseLicensesPeriodicWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        OfflineMediaPlugin.Companion.getComponent$plugin_offline_media_release().inject(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        if ((r8.getCause() instanceof com.bamtech.sdk4.service.ServiceException) == false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0070, code lost:
        if ((r7.getCause() instanceof com.bamtech.sdk4.service.ServiceException) == false) goto L_0x0074;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.work.ListenableWorker.Result doWork() {
        /*
            r12 = this;
            java.lang.String r0 = "licenseManager"
            com.bamtech.sdk4.internal.media.offline.db.OfflineDatabase r1 = r12.database
            r2 = 0
            if (r1 == 0) goto L_0x00a7
            com.bamtech.sdk4.internal.media.offline.db.OldMediaLicenseDao r1 = r1.oldMediaLicenseDao()
            java.util.List r3 = r1.getAll()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0018:
            boolean r5 = r3.hasNext()
            r6 = 0
            if (r5 == 0) goto L_0x007a
            java.lang.Object r5 = r3.next()
            r7 = r5
            com.bamtech.sdk4.internal.media.offline.db.OldMediaLicenseEntry r7 = (com.bamtech.sdk4.internal.media.offline.p047db.OldMediaLicenseEntry) r7
            byte[] r8 = r7.getLicense()
            r9 = 1
            com.bamtech.sdk4.internal.media.offline.WidevineLicenseManager r10 = r12.licenseManager     // Catch:{ all -> 0x003b }
            if (r10 == 0) goto L_0x0037
            boolean r11 = r7.getPermanently()     // Catch:{ all -> 0x003b }
            r10.release(r8, r11)     // Catch:{ all -> 0x003b }
            goto L_0x0049
        L_0x0037:
            kotlin.jvm.internal.C12880j.m40227c(r0)     // Catch:{ all -> 0x003b }
            throw r2
        L_0x003b:
            r8 = move-exception
            boolean r10 = r8 instanceof java.io.IOException
            if (r10 != 0) goto L_0x0049
            java.lang.Throwable r8 = r8.getCause()
            boolean r8 = r8 instanceof com.bamtech.sdk4.service.ServiceException
            if (r8 != 0) goto L_0x0049
            goto L_0x0074
        L_0x0049:
            byte[] r8 = r7.getAudioLicense()
            int r10 = r8.length
            if (r10 != 0) goto L_0x0052
            r10 = 1
            goto L_0x0053
        L_0x0052:
            r10 = 0
        L_0x0053:
            if (r10 != 0) goto L_0x0073
            com.bamtech.sdk4.internal.media.offline.WidevineLicenseManager r10 = r12.licenseManager     // Catch:{ all -> 0x0065 }
            if (r10 == 0) goto L_0x0061
            boolean r7 = r7.getPermanently()     // Catch:{ all -> 0x0065 }
            r10.release(r8, r7)     // Catch:{ all -> 0x0065 }
            goto L_0x0073
        L_0x0061:
            kotlin.jvm.internal.C12880j.m40227c(r0)     // Catch:{ all -> 0x0065 }
            throw r2
        L_0x0065:
            r7 = move-exception
            boolean r8 = r7 instanceof java.io.IOException
            if (r8 != 0) goto L_0x0073
            java.lang.Throwable r7 = r7.getCause()
            boolean r7 = r7 instanceof com.bamtech.sdk4.service.ServiceException
            if (r7 != 0) goto L_0x0073
            goto L_0x0074
        L_0x0073:
            r6 = 1
        L_0x0074:
            if (r6 == 0) goto L_0x0018
            r4.add(r5)
            goto L_0x0018
        L_0x007a:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x009d
            com.bamtech.sdk4.internal.media.offline.db.OldMediaLicenseEntry[] r0 = new com.bamtech.sdk4.internal.media.offline.p047db.OldMediaLicenseEntry[r6]
            java.lang.Object[] r0 = r4.toArray(r0)
            if (r0 == 0) goto L_0x0095
            com.bamtech.sdk4.internal.media.offline.db.OldMediaLicenseEntry[] r0 = (com.bamtech.sdk4.internal.media.offline.p047db.OldMediaLicenseEntry[]) r0
            int r2 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            com.bamtech.sdk4.internal.media.offline.db.OldMediaLicenseEntry[] r0 = (com.bamtech.sdk4.internal.media.offline.p047db.OldMediaLicenseEntry[]) r0
            r1.deleteLicenses(r0)
            goto L_0x009d
        L_0x0095:
            kotlin.s r0 = new kotlin.s
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T>"
            r0.<init>(r1)
            throw r0
        L_0x009d:
            androidx.work.ListenableWorker$Result r0 = androidx.work.ListenableWorker.Result.m5470c()
            java.lang.String r1 = "Result.success()"
            kotlin.jvm.internal.C12880j.m40222a(r0, r1)
            return r0
        L_0x00a7:
            java.lang.String r0 = "database"
            kotlin.jvm.internal.C12880j.m40227c(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.media.offline.workers.ReleaseLicensesPeriodicWorker.doWork():androidx.work.ListenableWorker$Result");
    }
}
