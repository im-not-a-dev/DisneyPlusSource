package com.bamtech.sdk4.internal.media.offline.workers;

import android.content.Context;
import androidx.work.Data;
import androidx.work.Data.C1011a;
import androidx.work.ListenableWorker.Result;
import androidx.work.Operation;
import androidx.work.WorkInfo.State;
import androidx.work.WorkManager;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.bamtech.sdk4.internal.media.ExoCachedMedia;
import com.bamtech.sdk4.internal.media.offline.ConditionReporter;
import com.bamtech.sdk4.internal.media.offline.DefaultDownloadWorkManagerHelper;
import com.bamtech.sdk4.internal.media.offline.DownloadSessionSubcomponent.Builder;
import com.bamtech.sdk4.internal.media.offline.workers.Download.DefaultImpls;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.media.offline.OfflineMediaPlugin;
import com.google.common.util.concurrent.C10414c;
import com.google.common.util.concurrent.C10417e;
import com.google.common.util.concurrent.ListenableFuture;
import javax.inject.Provider;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C12880j;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010*\u001a\u00020\u0016H\u0002J\u0012\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0002J\b\u0010/\u001a\u000200H\u0016J\r\u00101\u001a\u000200H\u0000¢\u0006\u0002\b2J\b\u00103\u001a\u00020,H\u0016J\b\u00104\u001a\u00020,H\u0002R\u001e\u0010\u0007\u001a\u00020\b8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R*\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0000@\u0000X.¢\u0006\u0014\n\u0000\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00188\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR\u001e\u0010$\u001a\u00020%8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u00065"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/workers/DownloadMediaWorker;", "Landroidx/work/Worker;", "context", "Landroid/content/Context;", "parameters", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "conditionReporter", "Lcom/bamtech/sdk4/internal/media/offline/ConditionReporter;", "getConditionReporter$plugin_offline_media_release", "()Lcom/bamtech/sdk4/internal/media/offline/ConditionReporter;", "setConditionReporter$plugin_offline_media_release", "(Lcom/bamtech/sdk4/internal/media/offline/ConditionReporter;)V", "dateTimeFormatter", "Lorg/joda/time/format/DateTimeFormatter;", "download", "Lcom/bamtech/sdk4/internal/media/offline/workers/Download;", "getDownload", "()Lcom/bamtech/sdk4/internal/media/offline/workers/Download;", "setDownload", "(Lcom/bamtech/sdk4/internal/media/offline/workers/Download;)V", "isCancelled", "", "subcomponent", "Ljavax/inject/Provider;", "Lcom/bamtech/sdk4/internal/media/offline/DownloadSessionSubcomponent$Builder;", "subcomponent$annotations", "()V", "getSubcomponent$plugin_offline_media_release", "()Ljavax/inject/Provider;", "setSubcomponent$plugin_offline_media_release", "(Ljavax/inject/Provider;)V", "transactionProvider", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "getTransactionProvider$plugin_offline_media_release", "setTransactionProvider$plugin_offline_media_release", "workManagerHelper", "Lcom/bamtech/sdk4/internal/media/offline/DefaultDownloadWorkManagerHelper;", "getWorkManagerHelper$plugin_offline_media_release", "()Lcom/bamtech/sdk4/internal/media/offline/DefaultDownloadWorkManagerHelper;", "setWorkManagerHelper$plugin_offline_media_release", "(Lcom/bamtech/sdk4/internal/media/offline/DefaultDownloadWorkManagerHelper;)V", "canRestart", "cancel", "", "state", "Landroidx/work/WorkInfo$State;", "doWork", "Landroidx/work/ListenableWorker$Result;", "getSuccessDownloadData", "getSuccessDownloadData$plugin_offline_media_release", "onStopped", "restartDownload", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DownloadMediaWorker.kt */
public final class DownloadMediaWorker extends Worker {
    public ConditionReporter conditionReporter;
    private final DateTimeFormatter dateTimeFormatter;
    public Download download;
    private boolean isCancelled;
    public Provider<Builder> subcomponent;
    public Provider<ServiceTransaction> transactionProvider;
    public DefaultDownloadWorkManagerHelper workManagerHelper;

    public DownloadMediaWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        DateTimeFormatter dateTime = ISODateTimeFormat.dateTime();
        C12880j.m40222a((Object) dateTime, "ISODateTimeFormat.dateTime()");
        this.dateTimeFormatter = dateTime;
        OfflineMediaPlugin.Companion.getComponent$plugin_offline_media_release().inject(this);
    }

    private final boolean canRestart() {
        Download download2 = this.download;
        ExoCachedMedia exoCachedMedia = null;
        if (download2 != null) {
            if (!(download2 instanceof DefaultDownload)) {
                download2 = null;
            }
            DefaultDownload defaultDownload = (DefaultDownload) download2;
            if (defaultDownload != null) {
                exoCachedMedia = defaultDownload.getCachedMedia();
            }
            return exoCachedMedia != null;
        }
        C12880j.m40227c("download");
        throw null;
    }

    /* access modifiers changed from: private */
    public final void cancel(State state) {
        this.isCancelled = state == State.CANCELLED;
        Download download2 = this.download;
        if (download2 != null) {
            DefaultImpls.cancel$default(download2, state, null, 2, null);
            boolean canRestart = canRestart();
            if (state == State.ENQUEUED && canRestart) {
                restartDownload();
                return;
            }
            return;
        }
        C12880j.m40227c("download");
        throw null;
    }

    private final void restartDownload() {
        Download download2 = this.download;
        if (download2 != null) {
            if (!(download2 instanceof DefaultDownload)) {
                download2 = null;
            }
            DefaultDownload defaultDownload = (DefaultDownload) download2;
            ExoCachedMedia cachedMedia = defaultDownload != null ? defaultDownload.getCachedMedia() : null;
            if (cachedMedia != null) {
                DefaultDownloadWorkManagerHelper defaultDownloadWorkManagerHelper = this.workManagerHelper;
                if (defaultDownloadWorkManagerHelper != null) {
                    String storageOperationMediaWorkId$plugin_offline_media_release = defaultDownloadWorkManagerHelper.getStorageOperationMediaWorkId$plugin_offline_media_release(cachedMedia);
                    Operation a = WorkManager.m5490a().mo5637a(storageOperationMediaWorkId$plugin_offline_media_release);
                    C12880j.m40222a((Object) a, "WorkManager.getInstance(…elUniqueWork(operationId)");
                    C10414c.m32922a(a.mo5618a(), new DownloadMediaWorker$restartDownload$$inlined$let$lambda$1(storageOperationMediaWorkId$plugin_offline_media_release, this, cachedMedia), C10417e.m32923a());
                    return;
                }
                C12880j.m40227c("workManagerHelper");
                throw null;
            }
            return;
        }
        C12880j.m40227c("download");
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0259  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.work.ListenableWorker.Result doWork() {
        /*
            r24 = this;
            r1 = r24
            java.lang.String r2 = "Result.retry()"
            java.lang.String r3 = "conditionReporter"
            java.lang.String r0 = "startTime"
            java.lang.String r4 = "status"
            java.lang.String r5 = "mediaId"
            androidx.work.Data r6 = r24.getInputData()
            java.lang.String r7 = "MEDIA_ID"
            java.lang.String r6 = r6.mo5584a(r7)
            javax.inject.Provider<com.bamtech.sdk4.internal.service.ServiceTransaction> r7 = r1.transactionProvider
            if (r7 == 0) goto L_0x025e
            java.lang.Object r7 = r7.get()
            com.bamtech.sdk4.internal.service.ServiceTransaction r7 = (com.bamtech.sdk4.internal.service.ServiceTransaction) r7
            r17 = 3
            r15 = 4
            r14 = 2
            r18 = 1
            r19 = 0
            org.joda.time.DateTimeZone r9 = org.joda.time.DateTimeZone.UTC     // Catch:{ all -> 0x01c9 }
            org.joda.time.DateTime r13 = org.joda.time.DateTime.now(r9)     // Catch:{ all -> 0x01c9 }
            if (r6 == 0) goto L_0x01bc
            kotlin.Pair[] r9 = new kotlin.Pair[r14]     // Catch:{ all -> 0x01c9 }
            org.joda.time.format.DateTimeFormatter r10 = r1.dateTimeFormatter     // Catch:{ all -> 0x01c9 }
            java.lang.String r10 = r10.print(r13)     // Catch:{ all -> 0x01c9 }
            kotlin.Pair r10 = kotlin.C12907r.m40244a(r0, r10)     // Catch:{ all -> 0x01c9 }
            r9[r19] = r10     // Catch:{ all -> 0x01c9 }
            kotlin.Pair r10 = kotlin.C12907r.m40244a(r5, r6)     // Catch:{ all -> 0x01c9 }
            r9[r18] = r10     // Catch:{ all -> 0x01c9 }
            java.util.Map r12 = kotlin.p590y.C13173j0.m40356a(r9)     // Catch:{ all -> 0x01c9 }
            com.bamtech.sdk4.internal.telemetry.dust.Dust$Events r9 = com.bamtech.sdk4.internal.telemetry.dust.Dust$Events.INSTANCE     // Catch:{ all -> 0x01c9 }
            java.lang.String r10 = com.bamtech.sdk4.internal.media.offline.workers.DownloadMediaWorkerKt.getOFFLINE_MEDIA_API_DOWNLOAD_IN_PROGRESS(r9)     // Catch:{ all -> 0x01c9 }
            java.lang.String r11 = "urn:bamtech:dust:bamsdk:event:sdk"
            com.bamtech.core.logging.LogLevel r16 = com.bamtech.core.logging.LogLevel.INFO     // Catch:{ all -> 0x01c9 }
            r20 = 0
            r21 = 16
            r22 = 0
            r9 = r7
            r8 = r13
            r13 = r16
            r23 = 2
            r14 = r20
            r15 = r21
            r16 = r22
            com.bamtech.sdk4.internal.service.ServiceTransaction.DefaultImpls.logDust$default(r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x01b9 }
            javax.inject.Provider<com.bamtech.sdk4.internal.media.offline.DownloadSessionSubcomponent$Builder> r9 = r1.subcomponent     // Catch:{ all -> 0x01b9 }
            if (r9 == 0) goto L_0x01b1
            java.lang.Object r9 = r9.get()     // Catch:{ all -> 0x01b9 }
            com.bamtech.sdk4.internal.media.offline.DownloadSessionSubcomponent$Builder r9 = (com.bamtech.sdk4.internal.media.offline.DownloadSessionSubcomponent.Builder) r9     // Catch:{ all -> 0x01b9 }
            com.bamtech.sdk4.internal.media.offline.DownloadSessionModule r10 = new com.bamtech.sdk4.internal.media.offline.DownloadSessionModule     // Catch:{ all -> 0x01b9 }
            r10.<init>(r6)     // Catch:{ all -> 0x01b9 }
            com.bamtech.sdk4.internal.media.offline.DownloadSessionSubcomponent$Builder r9 = r9.module(r10)     // Catch:{ all -> 0x01b9 }
            com.bamtech.sdk4.internal.media.offline.DownloadSessionSubcomponent r9 = r9.build()     // Catch:{ all -> 0x01b9 }
            com.bamtech.sdk4.internal.media.offline.workers.Download r9 = r9.downloadSession()     // Catch:{ all -> 0x01b9 }
            r1.download = r9     // Catch:{ all -> 0x01b9 }
            com.bamtech.sdk4.internal.media.offline.workers.Download r9 = r1.download     // Catch:{ all -> 0x01b9 }
            if (r9 == 0) goto L_0x01a9
            r9.loadMedia()     // Catch:{ all -> 0x01b9 }
            org.joda.time.DateTimeZone r9 = org.joda.time.DateTimeZone.UTC     // Catch:{ all -> 0x01b9 }
            org.joda.time.DateTime r9 = org.joda.time.DateTime.now(r9)     // Catch:{ all -> 0x01b9 }
            org.joda.time.Minutes r10 = org.joda.time.Minutes.minutesBetween(r8, r9)     // Catch:{ all -> 0x01b9 }
            java.lang.String r11 = "Minutes.minutesBetween(startTime, endTime)"
            kotlin.jvm.internal.C12880j.m40222a(r10, r11)     // Catch:{ all -> 0x01b9 }
            int r10 = r10.getMinutes()     // Catch:{ all -> 0x01b9 }
            com.bamtech.sdk4.internal.media.offline.ConditionReporter r11 = r1.conditionReporter     // Catch:{ all -> 0x01b9 }
            if (r11 == 0) goto L_0x01a3
            com.bamtech.sdk4.internal.media.offline.GroupStatus r11 = r11.getGroupStatus()     // Catch:{ all -> 0x01b9 }
            boolean r12 = r1.isCancelled     // Catch:{ all -> 0x01b9 }
            java.lang.String r13 = "durationInMinutes"
            r14 = 5
            if (r12 == 0) goto L_0x00f7
            kotlin.Pair[] r12 = new kotlin.Pair[r14]     // Catch:{ all -> 0x01b9 }
            org.joda.time.format.DateTimeFormatter r14 = r1.dateTimeFormatter     // Catch:{ all -> 0x01b9 }
            java.lang.String r8 = r14.print(r8)     // Catch:{ all -> 0x01b9 }
            kotlin.Pair r0 = kotlin.C12907r.m40244a(r0, r8)     // Catch:{ all -> 0x01b9 }
            r12[r19] = r0     // Catch:{ all -> 0x01b9 }
            java.lang.String r0 = "cancelledTime"
            kotlin.Pair r0 = kotlin.C12907r.m40244a(r0, r9)     // Catch:{ all -> 0x01b9 }
            r12[r18] = r0     // Catch:{ all -> 0x01b9 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x01b9 }
            kotlin.Pair r0 = kotlin.C12907r.m40244a(r13, r0)     // Catch:{ all -> 0x01b9 }
            r12[r23] = r0     // Catch:{ all -> 0x01b9 }
            kotlin.Pair r0 = kotlin.C12907r.m40244a(r5, r6)     // Catch:{ all -> 0x01b9 }
            r12[r17] = r0     // Catch:{ all -> 0x01b9 }
            kotlin.Pair r0 = kotlin.C12907r.m40244a(r4, r11)     // Catch:{ all -> 0x01b9 }
            r8 = 4
            r12[r8] = r0     // Catch:{ all -> 0x01c7 }
            java.util.Map r12 = kotlin.p590y.C13173j0.m40356a(r12)     // Catch:{ all -> 0x01c7 }
            com.bamtech.sdk4.internal.telemetry.dust.Dust$Events r0 = com.bamtech.sdk4.internal.telemetry.dust.Dust$Events.INSTANCE     // Catch:{ all -> 0x01c7 }
            java.lang.String r10 = com.bamtech.sdk4.internal.media.offline.workers.DownloadMediaWorkerKt.getOFFLINE_MEDIA_API_DOWNLOAD_CANCELLED(r0)     // Catch:{ all -> 0x01c7 }
            java.lang.String r11 = "urn:bamtech:dust:bamsdk:event:sdk"
            com.bamtech.core.logging.LogLevel r13 = com.bamtech.core.logging.LogLevel.INFO     // Catch:{ all -> 0x01c7 }
            r14 = 0
            r15 = 16
            r16 = 0
            r9 = r7
            com.bamtech.sdk4.internal.service.ServiceTransaction.DefaultImpls.logDust$default(r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x01c7 }
            androidx.work.ListenableWorker$Result r0 = r24.getSuccessDownloadData$plugin_offline_media_release()     // Catch:{ all -> 0x01c7 }
            goto L_0x0258
        L_0x00f7:
            r15 = 4
            com.bamtech.sdk4.internal.media.offline.workers.Download r12 = r1.download     // Catch:{ all -> 0x01b9 }
            if (r12 == 0) goto L_0x019b
            boolean r12 = r12.isComplete()     // Catch:{ all -> 0x01b9 }
            if (r12 == 0) goto L_0x014d
            kotlin.Pair[] r12 = new kotlin.Pair[r14]     // Catch:{ all -> 0x01b9 }
            org.joda.time.format.DateTimeFormatter r14 = r1.dateTimeFormatter     // Catch:{ all -> 0x01b9 }
            java.lang.String r8 = r14.print(r8)     // Catch:{ all -> 0x01b9 }
            kotlin.Pair r0 = kotlin.C12907r.m40244a(r0, r8)     // Catch:{ all -> 0x01b9 }
            r12[r19] = r0     // Catch:{ all -> 0x01b9 }
            java.lang.String r0 = "completedTime"
            kotlin.Pair r0 = kotlin.C12907r.m40244a(r0, r9)     // Catch:{ all -> 0x01b9 }
            r12[r18] = r0     // Catch:{ all -> 0x01b9 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x01b9 }
            kotlin.Pair r0 = kotlin.C12907r.m40244a(r13, r0)     // Catch:{ all -> 0x01b9 }
            r12[r23] = r0     // Catch:{ all -> 0x01b9 }
            kotlin.Pair r0 = kotlin.C12907r.m40244a(r5, r6)     // Catch:{ all -> 0x01b9 }
            r12[r17] = r0     // Catch:{ all -> 0x01b9 }
            kotlin.Pair r0 = kotlin.C12907r.m40244a(r4, r11)     // Catch:{ all -> 0x01b9 }
            r12[r15] = r0     // Catch:{ all -> 0x01b9 }
            java.util.Map r12 = kotlin.p590y.C13173j0.m40356a(r12)     // Catch:{ all -> 0x01b9 }
            com.bamtech.sdk4.internal.telemetry.dust.Dust$Events r0 = com.bamtech.sdk4.internal.telemetry.dust.Dust$Events.INSTANCE     // Catch:{ all -> 0x01b9 }
            java.lang.String r10 = com.bamtech.sdk4.internal.media.offline.workers.DownloadMediaWorkerKt.getOFFLINE_MEDIA_API_DOWNLOAD_COMPLETED(r0)     // Catch:{ all -> 0x01b9 }
            java.lang.String r11 = "urn:bamtech:dust:bamsdk:event:sdk"
            com.bamtech.core.logging.LogLevel r13 = com.bamtech.core.logging.LogLevel.INFO     // Catch:{ all -> 0x01b9 }
            r14 = 0
            r0 = 16
            r16 = 0
            r9 = r7
            r8 = 4
            r15 = r0
            com.bamtech.sdk4.internal.service.ServiceTransaction.DefaultImpls.logDust$default(r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x01c7 }
            androidx.work.ListenableWorker$Result r0 = r24.getSuccessDownloadData$plugin_offline_media_release()     // Catch:{ all -> 0x01c7 }
            goto L_0x0258
        L_0x014d:
            kotlin.Pair[] r12 = new kotlin.Pair[r14]     // Catch:{ all -> 0x01b9 }
            org.joda.time.format.DateTimeFormatter r14 = r1.dateTimeFormatter     // Catch:{ all -> 0x01b9 }
            java.lang.String r8 = r14.print(r8)     // Catch:{ all -> 0x01b9 }
            kotlin.Pair r0 = kotlin.C12907r.m40244a(r0, r8)     // Catch:{ all -> 0x01b9 }
            r12[r19] = r0     // Catch:{ all -> 0x01b9 }
            java.lang.String r0 = "interruptedTime"
            kotlin.Pair r0 = kotlin.C12907r.m40244a(r0, r9)     // Catch:{ all -> 0x01b9 }
            r12[r18] = r0     // Catch:{ all -> 0x01b9 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x01b9 }
            kotlin.Pair r0 = kotlin.C12907r.m40244a(r13, r0)     // Catch:{ all -> 0x01b9 }
            r12[r23] = r0     // Catch:{ all -> 0x01b9 }
            kotlin.Pair r0 = kotlin.C12907r.m40244a(r5, r6)     // Catch:{ all -> 0x01b9 }
            r12[r17] = r0     // Catch:{ all -> 0x01b9 }
            kotlin.Pair r0 = kotlin.C12907r.m40244a(r4, r11)     // Catch:{ all -> 0x01b9 }
            r12[r15] = r0     // Catch:{ all -> 0x01b9 }
            java.util.Map r12 = kotlin.p590y.C13173j0.m40356a(r12)     // Catch:{ all -> 0x01b9 }
            com.bamtech.sdk4.internal.telemetry.dust.Dust$Events r0 = com.bamtech.sdk4.internal.telemetry.dust.Dust$Events.INSTANCE     // Catch:{ all -> 0x01b9 }
            java.lang.String r10 = com.bamtech.sdk4.internal.media.offline.workers.DownloadMediaWorkerKt.getOFFLINE_MEDIA_API_DOWNLOAD_INTERRUPTED(r0)     // Catch:{ all -> 0x01b9 }
            java.lang.String r11 = "urn:bamtech:dust:bamsdk:event:sdk"
            com.bamtech.core.logging.LogLevel r13 = com.bamtech.core.logging.LogLevel.INFO     // Catch:{ all -> 0x01b9 }
            r14 = 0
            r0 = 16
            r16 = 0
            r9 = r7
            r8 = 4
            r15 = r0
            com.bamtech.sdk4.internal.service.ServiceTransaction.DefaultImpls.logDust$default(r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x01c7 }
            androidx.work.ListenableWorker$Result r0 = androidx.work.ListenableWorker.Result.m5469b()     // Catch:{ all -> 0x01c7 }
            kotlin.jvm.internal.C12880j.m40222a(r0, r2)     // Catch:{ all -> 0x01c7 }
            goto L_0x0258
        L_0x019b:
            r8 = 4
            java.lang.String r0 = "download"
            kotlin.jvm.internal.C12880j.m40227c(r0)     // Catch:{ all -> 0x01c7 }
            r2 = 0
            throw r2
        L_0x01a3:
            r8 = 4
            kotlin.jvm.internal.C12880j.m40227c(r3)     // Catch:{ all -> 0x01c7 }
            r2 = 0
            throw r2
        L_0x01a9:
            r8 = 4
            java.lang.String r0 = "download"
            kotlin.jvm.internal.C12880j.m40227c(r0)     // Catch:{ all -> 0x01c7 }
            r2 = 0
            throw r2
        L_0x01b1:
            r8 = 4
            java.lang.String r0 = "subcomponent"
            kotlin.jvm.internal.C12880j.m40227c(r0)     // Catch:{ all -> 0x01c7 }
            r2 = 0
            throw r2
        L_0x01b9:
            r0 = move-exception
            r8 = 4
            goto L_0x01cd
        L_0x01bc:
            r8 = 4
            r23 = 2
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x01c7 }
            java.lang.String r9 = "mediaId was not provided"
            r0.<init>(r9)     // Catch:{ all -> 0x01c7 }
            throw r0     // Catch:{ all -> 0x01c7 }
        L_0x01c7:
            r0 = move-exception
            goto L_0x01cd
        L_0x01c9:
            r0 = move-exception
            r8 = 4
            r23 = 2
        L_0x01cd:
            com.bamtech.sdk4.internal.media.offline.ConditionReporter r9 = r1.conditionReporter
            if (r9 == 0) goto L_0x0259
            com.bamtech.sdk4.internal.media.offline.GroupStatus r3 = r9.getGroupStatus()
            boolean r9 = r0 instanceof java.io.IOException
            java.lang.String r10 = "willRetry"
            java.lang.String r11 = "error"
            if (r9 == 0) goto L_0x021a
            kotlin.Pair[] r8 = new kotlin.Pair[r8]
            kotlin.Pair r0 = kotlin.C12907r.m40244a(r11, r0)
            r8[r19] = r0
            kotlin.Pair r0 = kotlin.C12907r.m40244a(r5, r6)
            r8[r18] = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r18)
            kotlin.Pair r0 = kotlin.C12907r.m40244a(r10, r0)
            r8[r23] = r0
            kotlin.Pair r0 = kotlin.C12907r.m40244a(r4, r3)
            r8[r17] = r0
            java.util.Map r12 = kotlin.p590y.C13173j0.m40356a(r8)
            com.bamtech.sdk4.internal.telemetry.dust.Dust$Events r0 = com.bamtech.sdk4.internal.telemetry.dust.Dust$Events.INSTANCE
            java.lang.String r10 = com.bamtech.sdk4.internal.media.offline.workers.DownloadMediaWorkerKt.getOFFLINE_MEDIA_API_DOWNLOAD_EXCEPTION(r0)
            com.bamtech.core.logging.LogLevel r13 = com.bamtech.core.logging.LogLevel.ERROR
            r14 = 0
            r15 = 16
            r16 = 0
            java.lang.String r11 = "urn:bamtech:dust:bamsdk:error:sdk"
            r9 = r7
            com.bamtech.sdk4.internal.service.ServiceTransaction.DefaultImpls.logDust$default(r9, r10, r11, r12, r13, r14, r15, r16)
            androidx.work.ListenableWorker$Result r0 = androidx.work.ListenableWorker.Result.m5469b()
            kotlin.jvm.internal.C12880j.m40222a(r0, r2)
            goto L_0x0258
        L_0x021a:
            kotlin.Pair[] r2 = new kotlin.Pair[r8]
            kotlin.Pair r0 = kotlin.C12907r.m40244a(r11, r0)
            r2[r19] = r0
            kotlin.Pair r0 = kotlin.C12907r.m40244a(r5, r6)
            r2[r18] = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r19)
            kotlin.Pair r0 = kotlin.C12907r.m40244a(r10, r0)
            r2[r23] = r0
            kotlin.Pair r0 = kotlin.C12907r.m40244a(r4, r3)
            r2[r17] = r0
            java.util.Map r12 = kotlin.p590y.C13173j0.m40356a(r2)
            com.bamtech.sdk4.internal.telemetry.dust.Dust$Events r0 = com.bamtech.sdk4.internal.telemetry.dust.Dust$Events.INSTANCE
            java.lang.String r10 = com.bamtech.sdk4.internal.media.offline.workers.DownloadMediaWorkerKt.getOFFLINE_MEDIA_API_DOWNLOAD_EXCEPTION(r0)
            com.bamtech.core.logging.LogLevel r13 = com.bamtech.core.logging.LogLevel.ERROR
            r14 = 0
            r15 = 16
            r16 = 0
            java.lang.String r11 = "urn:bamtech:dust:bamsdk:error:sdk"
            r9 = r7
            com.bamtech.sdk4.internal.service.ServiceTransaction.DefaultImpls.logDust$default(r9, r10, r11, r12, r13, r14, r15, r16)
            androidx.work.ListenableWorker$Result r0 = androidx.work.ListenableWorker.Result.m5467a()
            java.lang.String r2 = "Result.failure()"
            kotlin.jvm.internal.C12880j.m40222a(r0, r2)
        L_0x0258:
            return r0
        L_0x0259:
            kotlin.jvm.internal.C12880j.m40227c(r3)
            r2 = 0
            throw r2
        L_0x025e:
            r2 = 0
            java.lang.String r0 = "transactionProvider"
            kotlin.jvm.internal.C12880j.m40227c(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.media.offline.workers.DownloadMediaWorker.doWork():androidx.work.ListenableWorker$Result");
    }

    public final Download getDownload() {
        Download download2 = this.download;
        if (download2 != null) {
            return download2;
        }
        C12880j.m40227c("download");
        throw null;
    }

    public final Result getSuccessDownloadData$plugin_offline_media_release() {
        Pair[] pairArr = new Pair[2];
        Download download2 = this.download;
        String str = "download";
        if (download2 != null) {
            pairArr[0] = C12907r.m40244a("downloadedBytes", Long.valueOf(download2.getDownloadedBytes()));
            Download download3 = this.download;
            if (download3 != null) {
                pairArr[1] = C12907r.m40244a("downloadPercentage", Float.valueOf(download3.getDownloadPercentage()));
                C1011a aVar = new C1011a();
                for (Pair pair : pairArr) {
                    aVar.mo5591a((String) pair.mo31015c(), pair.mo31016d());
                }
                Data a = aVar.mo5594a();
                C12880j.m40222a((Object) a, "dataBuilder.build()");
                Result a2 = Result.m5468a(a);
                C12880j.m40222a((Object) a2, "Result.success(workDataO…load.downloadPercentage))");
                return a2;
            }
            C12880j.m40227c(str);
            throw null;
        }
        C12880j.m40227c(str);
        throw null;
    }

    public final Provider<ServiceTransaction> getTransactionProvider$plugin_offline_media_release() {
        Provider<ServiceTransaction> provider = this.transactionProvider;
        if (provider != null) {
            return provider;
        }
        C12880j.m40227c("transactionProvider");
        throw null;
    }

    public final DefaultDownloadWorkManagerHelper getWorkManagerHelper$plugin_offline_media_release() {
        DefaultDownloadWorkManagerHelper defaultDownloadWorkManagerHelper = this.workManagerHelper;
        if (defaultDownloadWorkManagerHelper != null) {
            return defaultDownloadWorkManagerHelper;
        }
        C12880j.m40227c("workManagerHelper");
        throw null;
    }

    public void onStopped() {
        ListenableFuture b = WorkManager.m5490a().mo5644b(getId());
        C12880j.m40222a((Object) b, "WorkManager.getInstance().getWorkInfoById(id)");
        C10414c.m32922a(b, new DownloadMediaWorker$onStopped$1(this), C10417e.m32923a());
    }
}
