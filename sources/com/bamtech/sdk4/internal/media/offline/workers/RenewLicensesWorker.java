package com.bamtech.sdk4.internal.media.offline.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.bamtech.sdk4.internal.media.offline.DownloadWorkManagerHelper;
import com.bamtech.sdk4.internal.media.offline.ExoCachedMediaHelper;
import com.bamtech.sdk4.internal.media.offline.WidevineLicenseManager;
import com.bamtech.sdk4.internal.media.offline.p047db.OfflineDatabase;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.media.offline.LicenseRenewalResult;
import com.bamtech.sdk4.media.offline.OfflineMediaPlugin;
import java.util.List;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 <2\u00020\u0001:\u0001<B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u00104\u001a\u0002052\u0006\u00106\u001a\u00020&H\u0002J\b\u00107\u001a\u000208H\u0016J\f\u00109\u001a\u00020:*\u00020;H\u0002R$\u0010\u0007\u001a\u00020\b8\u0000@\u0000X.¢\u0006\u0014\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\u00020\u00108\u0000@\u0000X.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0016\u001a\u00020\u00178\u0000@\u0000X.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0018\u0010\n\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001d\u001a\u00020\u001e8\u0000@\u0000X.¢\u0006\u0014\n\u0000\u0012\u0004\b\u001f\u0010\n\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R.\u0010$\u001a\f\u0012\u0004\u0012\u00020&0%j\u0002`'8\u0000@\u0000X.¢\u0006\u0014\n\u0000\u0012\u0004\b(\u0010\n\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010-\u001a\u00020.8\u0006@\u0006X.¢\u0006\u0014\n\u0000\u0012\u0004\b/\u0010\n\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u0006="}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/workers/RenewLicensesWorker;", "Landroidx/work/Worker;", "context", "Landroid/content/Context;", "parameters", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "database", "Lcom/bamtech/sdk4/internal/media/offline/db/OfflineDatabase;", "database$annotations", "()V", "getDatabase$plugin_offline_media_release", "()Lcom/bamtech/sdk4/internal/media/offline/db/OfflineDatabase;", "setDatabase$plugin_offline_media_release", "(Lcom/bamtech/sdk4/internal/media/offline/db/OfflineDatabase;)V", "downloadWorkManager", "Lcom/bamtech/sdk4/internal/media/offline/DownloadWorkManagerHelper;", "downloadWorkManager$annotations", "getDownloadWorkManager$plugin_offline_media_release", "()Lcom/bamtech/sdk4/internal/media/offline/DownloadWorkManagerHelper;", "setDownloadWorkManager$plugin_offline_media_release", "(Lcom/bamtech/sdk4/internal/media/offline/DownloadWorkManagerHelper;)V", "exoCachedMediaHelper", "Lcom/bamtech/sdk4/internal/media/offline/ExoCachedMediaHelper;", "exoCachedMediaHelper$annotations", "getExoCachedMediaHelper$plugin_offline_media_release", "()Lcom/bamtech/sdk4/internal/media/offline/ExoCachedMediaHelper;", "setExoCachedMediaHelper$plugin_offline_media_release", "(Lcom/bamtech/sdk4/internal/media/offline/ExoCachedMediaHelper;)V", "licenseManager", "Lcom/bamtech/sdk4/internal/media/offline/WidevineLicenseManager;", "licenseManager$annotations", "getLicenseManager$plugin_offline_media_release", "()Lcom/bamtech/sdk4/internal/media/offline/WidevineLicenseManager;", "setLicenseManager$plugin_offline_media_release", "(Lcom/bamtech/sdk4/internal/media/offline/WidevineLicenseManager;)V", "transactionProvider", "Ljavax/inject/Provider;", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "Lcom/bamtech/sdk4/internal/service/ServiceTransactionProvider;", "transactionProvider$annotations", "getTransactionProvider$plugin_offline_media_release", "()Ljavax/inject/Provider;", "setTransactionProvider$plugin_offline_media_release", "(Ljavax/inject/Provider;)V", "userAgent", "", "userAgent$annotations", "getUserAgent", "()Ljava/lang/String;", "setUserAgent", "(Ljava/lang/String;)V", "checkJobInterval", "", "transaction", "doWork", "Landroidx/work/ListenableWorker$Result;", "shouldRenewLicense", "", "Lcom/bamtech/sdk4/internal/media/offline/db/CachedMediaEntry;", "Companion", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: RenewLicensesWorker.kt */
public final class RenewLicensesWorker extends Worker {
    private static final List<String> RENEWAL_STATUSES = C13185o.m40520c(LicenseRenewalResult.Recoverable.name(), LicenseRenewalResult.Success.name());
    public OfflineDatabase database;
    public DownloadWorkManagerHelper downloadWorkManager;
    public ExoCachedMediaHelper exoCachedMediaHelper;
    public WidevineLicenseManager licenseManager;
    public Provider<ServiceTransaction> transactionProvider;
    public String userAgent;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/workers/RenewLicensesWorker$Companion;", "", "()V", "MIN_RENEWAL_INTERVAL_HOURS", "", "RENEWAL_STATUSES", "", "", "getRENEWAL_STATUSES", "()Ljava/util/List;", "RENEW_INTERVAL", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: RenewLicensesWorker.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new Companion(null);
    }

    public RenewLicensesWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        OfflineMediaPlugin.Companion.getComponent$plugin_offline_media_release().inject(this);
    }

    private final void checkJobInterval(ServiceTransaction serviceTransaction) {
        long a = getInputData().mo5583a("RENEW_INTERVAL", 0);
        DownloadWorkManagerHelper downloadWorkManagerHelper = this.downloadWorkManager;
        if (downloadWorkManagerHelper != null) {
            downloadWorkManagerHelper.startPeriodicLicenseRenewal(serviceTransaction, a);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("downloadWorkManager");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r0 != null) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean shouldRenewLicense(com.bamtech.sdk4.internal.media.offline.p047db.CachedMediaEntry r7) {
        /*
            r6 = this;
            org.joda.time.DateTime r0 = r7.getLastLicenseRenewal()
            if (r0 == 0) goto L_0x0013
            org.joda.time.DateTimeZone r1 = org.joda.time.DateTimeZone.UTC
            org.joda.time.DateTime r1 = org.joda.time.DateTime.now(r1)
            org.joda.time.Hours r0 = org.joda.time.Hours.hoursBetween(r0, r1)
            if (r0 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            org.joda.time.Hours r0 = org.joda.time.Hours.ZERO
        L_0x0015:
            java.lang.String r1 = r7.getLastLicenseRenewalResult()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x002c
            java.util.List<java.lang.String> r1 = RENEWAL_STATUSES
            java.lang.String r4 = r7.getLastLicenseRenewalResult()
            boolean r1 = r1.contains(r4)
            if (r1 == 0) goto L_0x002a
            goto L_0x002c
        L_0x002a:
            r1 = 0
            goto L_0x002d
        L_0x002c:
            r1 = 1
        L_0x002d:
            org.joda.time.DateTime r4 = r7.getLastLicenseRenewal()
            if (r4 == 0) goto L_0x0042
            java.lang.String r4 = "hoursSinceLastRenewal"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r4)
            int r0 = r0.getHours()
            r4 = 2
            if (r0 < r4) goto L_0x0040
            goto L_0x0042
        L_0x0040:
            r0 = 0
            goto L_0x0043
        L_0x0042:
            r0 = 1
        L_0x0043:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "lastResult: "
            r4.append(r5)
            java.lang.String r5 = r7.getLastLicenseRenewalResult()
            r4.append(r5)
            java.lang.String r5 = " at "
            r4.append(r5)
            org.joda.time.DateTime r7 = r7.getLastLicenseRenewal()
            r4.append(r7)
            java.lang.String r7 = ". Last result eligible: "
            r4.append(r7)
            r4.append(r1)
            java.lang.String r7 = ", time eligible: "
            r4.append(r7)
            r4.append(r0)
            java.lang.String r7 = r4.toString()
            java.lang.String r4 = "RenewLicensesWorker"
            android.util.Log.d(r4, r7)
            if (r1 == 0) goto L_0x007e
            if (r0 == 0) goto L_0x007e
            r2 = 1
        L_0x007e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.media.offline.workers.RenewLicensesWorker.shouldRenewLicense(com.bamtech.sdk4.internal.media.offline.db.CachedMediaEntry):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01b7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0173 A[SYNTHETIC, Splitter:B:76:0x0173] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.work.ListenableWorker.Result doWork() {
        /*
            r28 = this;
            r1 = r28
            java.lang.String r2 = "licenseManager"
            java.lang.String r3 = "exoCachedMediaHelper"
            java.lang.String r4 = "RenewLicensesWorker"
            java.lang.String r0 = "Started renewing licenses"
            android.util.Log.d(r4, r0)
            javax.inject.Provider<com.bamtech.sdk4.internal.service.ServiceTransaction> r0 = r1.transactionProvider
            r5 = 0
            if (r0 == 0) goto L_0x021d
            java.lang.Object r0 = r0.get()
            r14 = r0
            com.bamtech.sdk4.internal.service.ServiceTransaction r14 = (com.bamtech.sdk4.internal.service.ServiceTransaction) r14
            com.bamtech.sdk4.internal.media.offline.db.OfflineDatabase r0 = r1.database
            java.lang.String r15 = "database"
            if (r0 == 0) goto L_0x0219
            com.bamtech.sdk4.internal.media.offline.db.CachedMediaDao r0 = r0.cachedMediaDao()
            r13 = 1
            java.util.List r0 = com.bamtech.sdk4.internal.media.offline.p047db.CachedMediaDao.DefaultImpls.getLicenseRenewalCandidates$default(r0, r5, r13, r5)
            boolean r6 = r0.isEmpty()
            java.lang.String r12 = "Result.success()"
            if (r6 == 0) goto L_0x004a
            java.lang.String r0 = "No renewal candidates, cancelling job"
            android.util.Log.d(r4, r0)
            com.bamtech.sdk4.internal.media.offline.DownloadWorkManagerHelper r0 = r1.downloadWorkManager
            if (r0 == 0) goto L_0x0044
            r0.cancelPeriodicRenewal()
            androidx.work.ListenableWorker$Result r0 = androidx.work.ListenableWorker.Result.m5470c()
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r12)
            return r0
        L_0x0044:
            java.lang.String r0 = "downloadWorkManager"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            throw r5
        L_0x004a:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0053:
            boolean r7 = r0.hasNext()
            r11 = 0
            if (r7 == 0) goto L_0x0076
            java.lang.Object r7 = r0.next()
            r8 = r7
            com.bamtech.sdk4.internal.media.offline.db.CachedMediaEntry r8 = (com.bamtech.sdk4.internal.media.offline.p047db.CachedMediaEntry) r8
            com.bamtech.sdk4.internal.media.offline.db.DownloadStatusEntry r8 = r8.getStatus()
            float r8 = r8.getPercentageComplete()
            r9 = 1120403456(0x42c80000, float:100.0)
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 != 0) goto L_0x0070
            r11 = 1
        L_0x0070:
            if (r11 == 0) goto L_0x0053
            r6.add(r7)
            goto L_0x0053
        L_0x0076:
            java.util.Iterator r16 = r6.iterator()
            r17 = r5
        L_0x007c:
            boolean r0 = r16.hasNext()
            java.lang.String r6 = "transaction"
            if (r0 == 0) goto L_0x01e0
            java.lang.Object r0 = r16.next()
            com.bamtech.sdk4.internal.media.offline.db.CachedMediaEntry r0 = (com.bamtech.sdk4.internal.media.offline.p047db.CachedMediaEntry) r0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Renewing license for "
            r7.append(r8)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            android.util.Log.d(r4, r7)
            boolean r7 = r28.isStopped()
            if (r7 == 0) goto L_0x00aa
            androidx.work.ListenableWorker$Result r17 = androidx.work.ListenableWorker.Result.m5469b()
            goto L_0x01e0
        L_0x00aa:
            boolean r7 = r1.shouldRenewLicense(r0)
            if (r7 != 0) goto L_0x00b6
            r27 = r12
            r6 = 0
            r7 = 1
            goto L_0x01b7
        L_0x00b6:
            com.bamtech.sdk4.internal.media.ExoCachedMedia r10 = com.bamtech.sdk4.internal.media.offline.p047db.CachedMediaEntryKt.toCachedMedia(r0)
            byte[] r9 = r10.getLicense()
            byte[] r21 = r10.getAudioLicense()
            com.bamtech.sdk4.internal.media.offline.ExoCachedMediaHelper r0 = r1.exoCachedMediaHelper     // Catch:{ all -> 0x010c }
            if (r0 == 0) goto L_0x0100
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r14, r6)     // Catch:{ all -> 0x010c }
            r18 = 0
            com.bamtech.sdk4.internal.media.offline.workers.RenewLicensesWorker$doWork$1 r19 = com.bamtech.sdk4.internal.media.offline.workers.RenewLicensesWorker$doWork$1.INSTANCE     // Catch:{ all -> 0x010c }
            r20 = 8
            r22 = 0
            r6 = r0
            r7 = r14
            r8 = r10
            r23 = r9
            r24 = r10
            r10 = r18
            r11 = r19
            r27 = r12
            r12 = r20
            r13 = r22
            com.bamtech.sdk4.internal.media.offline.ExoCachedMediaHelper.DefaultImpls.downloadMediaLicense$default(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x010a }
            com.bamtech.sdk4.internal.media.offline.db.OfflineDatabase r0 = r1.database
            if (r0 == 0) goto L_0x00fc
            com.bamtech.sdk4.internal.media.offline.db.CachedMediaDao r0 = r0.cachedMediaDao()
            com.bamtech.sdk4.internal.media.offline.db.CachedMediaEntry r6 = com.bamtech.sdk4.internal.media.offline.p047db.CachedMediaEntryKt.toCachedMediaEntry(r24)
            r0.store(r6)
            r9 = r23
            r8 = r24
            r6 = 0
            r7 = 1
            goto L_0x016a
        L_0x00fc:
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r15)
            throw r5
        L_0x0100:
            r23 = r9
            r24 = r10
            r27 = r12
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)     // Catch:{ all -> 0x010a }
            throw r5
        L_0x010a:
            r0 = move-exception
            goto L_0x0113
        L_0x010c:
            r0 = move-exception
            r23 = r9
            r24 = r10
            r27 = r12
        L_0x0113:
            java.lang.String r6 = "Error while auto-renewing the license."
            android.util.Log.e(r4, r6, r0)     // Catch:{ all -> 0x01c9 }
            com.bamtech.sdk4.internal.media.offline.ExoCachedMediaHelper r6 = r1.exoCachedMediaHelper     // Catch:{ all -> 0x01c9 }
            if (r6 == 0) goto L_0x01c1
            boolean r0 = r6.isFatalError(r0)     // Catch:{ all -> 0x01c9 }
            if (r0 == 0) goto L_0x014a
            java.lang.String r0 = "Auth error. Deleting the license."
            android.util.Log.e(r4, r0)     // Catch:{ all -> 0x01c9 }
            com.bamtech.sdk4.internal.media.offline.WidevineLicenseManager r0 = r1.licenseManager     // Catch:{ all -> 0x01c9 }
            if (r0 == 0) goto L_0x0144
            byte[] r6 = r24.getLicense()     // Catch:{ all -> 0x01c9 }
            r7 = 1
            r0.release(r6, r7)     // Catch:{ all -> 0x01c9 }
            r6 = 0
            byte[] r0 = new byte[r6]     // Catch:{ all -> 0x01c9 }
            r8 = r24
            r8.setLicense(r0)     // Catch:{ all -> 0x01c7 }
            r8.setExpiration(r5)     // Catch:{ all -> 0x01c7 }
            com.bamtech.sdk4.media.offline.LicenseRenewalResult r0 = com.bamtech.sdk4.media.offline.LicenseRenewalResult.FatalErrorSingle     // Catch:{ all -> 0x01c7 }
            r8.setLastLicenseRenewalResult(r0)     // Catch:{ all -> 0x01c7 }
            goto L_0x0159
        L_0x0144:
            r8 = r24
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)     // Catch:{ all -> 0x01c7 }
            throw r5
        L_0x014a:
            r8 = r24
            r6 = 0
            r7 = 1
            com.bamtech.sdk4.media.offline.LicenseRenewalResult r0 = com.bamtech.sdk4.media.offline.LicenseRenewalResult.Recoverable     // Catch:{ all -> 0x01c7 }
            r8.setLastLicenseRenewalResult(r0)     // Catch:{ all -> 0x01c7 }
            androidx.work.ListenableWorker$Result r0 = androidx.work.ListenableWorker.Result.m5469b()     // Catch:{ all -> 0x01c7 }
            r17 = r0
        L_0x0159:
            com.bamtech.sdk4.internal.media.offline.db.OfflineDatabase r0 = r1.database
            if (r0 == 0) goto L_0x01bd
            com.bamtech.sdk4.internal.media.offline.db.CachedMediaDao r0 = r0.cachedMediaDao()
            com.bamtech.sdk4.internal.media.offline.db.CachedMediaEntry r9 = com.bamtech.sdk4.internal.media.offline.p047db.CachedMediaEntryKt.toCachedMediaEntry(r8)
            r0.store(r9)
            r9 = r23
        L_0x016a:
            int r0 = r9.length
            if (r0 != 0) goto L_0x016f
            r0 = 1
            goto L_0x0170
        L_0x016f:
            r0 = 0
        L_0x0170:
            r0 = r0 ^ r7
            if (r0 == 0) goto L_0x01b7
            com.bamtech.sdk4.internal.media.offline.WidevineLicenseManager r0 = r1.licenseManager     // Catch:{ all -> 0x017f }
            if (r0 == 0) goto L_0x017b
            r0.release(r9, r6)     // Catch:{ all -> 0x017f }
            goto L_0x01b7
        L_0x017b:
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)     // Catch:{ all -> 0x017f }
            throw r5
        L_0x017f:
            r0 = move-exception
            boolean r10 = r0 instanceof java.io.IOException
            if (r10 != 0) goto L_0x0190
            java.lang.Throwable r10 = r0.getCause()
            boolean r10 = r10 instanceof com.bamtech.sdk4.service.ServiceException
            if (r10 != 0) goto L_0x0190
            boolean r0 = r0 instanceof com.bamtech.sdk4.internal.media.offline.error.PlaybackInProgressError
            if (r0 == 0) goto L_0x01b7
        L_0x0190:
            com.bamtech.sdk4.internal.media.offline.db.OfflineDatabase r0 = r1.database
            if (r0 == 0) goto L_0x01b3
            com.bamtech.sdk4.internal.media.offline.db.OldMediaLicenseDao r0 = r0.oldMediaLicenseDao()
            com.bamtech.sdk4.internal.media.offline.db.OldMediaLicenseEntry r10 = new com.bamtech.sdk4.internal.media.offline.db.OldMediaLicenseEntry
            java.lang.String r19 = r8.getId()
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 24
            r26 = 0
            r18 = r10
            r20 = r9
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
            r0.store(r10)
            goto L_0x01b7
        L_0x01b3:
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r15)
            throw r5
        L_0x01b7:
            r12 = r27
            r11 = 0
            r13 = 1
            goto L_0x007c
        L_0x01bd:
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r15)
            throw r5
        L_0x01c1:
            r8 = r24
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)     // Catch:{ all -> 0x01c7 }
            throw r5
        L_0x01c7:
            r0 = move-exception
            goto L_0x01cc
        L_0x01c9:
            r0 = move-exception
            r8 = r24
        L_0x01cc:
            com.bamtech.sdk4.internal.media.offline.db.OfflineDatabase r2 = r1.database
            if (r2 != 0) goto L_0x01d4
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r15)
            throw r5
        L_0x01d4:
            com.bamtech.sdk4.internal.media.offline.db.CachedMediaDao r2 = r2.cachedMediaDao()
            com.bamtech.sdk4.internal.media.offline.db.CachedMediaEntry r3 = com.bamtech.sdk4.internal.media.offline.p047db.CachedMediaEntryKt.toCachedMediaEntry(r8)
            r2.store(r3)
            throw r0
        L_0x01e0:
            r27 = r12
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r14, r6)
            r1.checkJobInterval(r14)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Renew licenses done, result: "
            r0.append(r2)
            if (r17 == 0) goto L_0x01f9
            r2 = r17
            r3 = r27
            goto L_0x0202
        L_0x01f9:
            androidx.work.ListenableWorker$Result r2 = androidx.work.ListenableWorker.Result.m5470c()
            r3 = r27
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r2, r3)
        L_0x0202:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r4, r0)
            if (r17 == 0) goto L_0x0211
            r0 = r17
            goto L_0x0218
        L_0x0211:
            androidx.work.ListenableWorker$Result r0 = androidx.work.ListenableWorker.Result.m5470c()
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r3)
        L_0x0218:
            return r0
        L_0x0219:
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r15)
            throw r5
        L_0x021d:
            java.lang.String r0 = "transactionProvider"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.media.offline.workers.RenewLicensesWorker.doWork():androidx.work.ListenableWorker$Result");
    }
}
