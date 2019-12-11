package com.bamtech.sdk4.internal.media.offline.workers;

import android.content.Context;
import android.util.Log;
import androidx.work.WorkInfo.State;
import com.bamtech.sdk4.internal.media.CacheProvider;
import com.bamtech.sdk4.internal.media.ExoCachedMedia;
import com.bamtech.sdk4.internal.media.offline.DownloadScheduler;
import com.bamtech.sdk4.internal.media.offline.p047db.CachedMediaEntry;
import com.bamtech.sdk4.internal.media.offline.p047db.CachedMediaEntryKt;
import com.bamtech.sdk4.internal.media.offline.p047db.DownloadStatusEntryKt;
import com.bamtech.sdk4.internal.media.offline.p047db.OfflineDatabase;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.media.offline.DownloadError;
import com.bamtech.sdk4.media.offline.DownloadErrorStatus;
import com.bamtech.sdk4.media.offline.DownloadStatus;
import com.bamtech.sdk4.media.offline.DownloadStatus.Cancelled;
import com.bamtech.sdk4.media.offline.DownloadStatus.Failed;
import com.bamtech.sdk4.media.offline.DownloadStatus.Finished;
import com.bamtech.sdk4.media.offline.DownloadStatus.InProgress;
import com.bamtech.sdk4.media.offline.DownloadStatus.Interrupted;
import com.bamtech.sdk4.media.offline.DownloadStatus.Paused;
import com.facebook.stetho.server.http.HttpStatus;
import com.google.android.exoplayer2.database.DatabaseProvider;
import com.google.android.exoplayer2.offline.Downloader;
import com.google.android.exoplayer2.offline.Downloader.C8805a;
import com.google.android.exoplayer2.upstream.HttpDataSource.C9439d;
import com.google.android.exoplayer2.upstream.cache.C9484s;
import java.io.IOException;
import java.util.Map;
import javax.inject.Provider;
import kotlin.C12898l;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.ReadableInstant;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 Q2\u00020\u00012\u00020\u0002:\u0001QBS\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\u001c\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:2\b\u0010;\u001a\u0004\u0018\u00010<H\u0007J\u001c\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010@2\b\u0010A\u001a\u0004\u0018\u00010:H\u0016J\b\u0010B\u001a\u00020+H\u0002J\u0012\u0010C\u001a\u00020+2\b\u0010A\u001a\u0004\u0018\u00010:H\u0007J\r\u0010D\u001a\u00020EH\u0000¢\u0006\u0002\bFJ\b\u0010G\u001a\u00020>H\u0016J\u0010\u0010H\u001a\u00020>2\u0006\u0010I\u001a\u00020+H\u0016J \u0010J\u001a\u00020>2\u0006\u0010K\u001a\u00020$2\u0006\u0010L\u001a\u00020$2\u0006\u0010M\u001a\u00020 H\u0016J\b\u0010N\u001a\u00020>H\u0016J\u0010\u0010O\u001a\u00020>2\u0006\u0010P\u001a\u00020EH\u0007R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001e\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020 @RX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001e\u0010%\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020$@RX\u000e¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R$\u0010*\u001a\u00020+8\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b,\u0010-\u001a\u0004\b*\u0010.\"\u0004\b/\u00100R\u0014\u00101\u001a\u00020+8VX\u0004¢\u0006\u0006\u001a\u0004\b1\u0010.R\u000e\u00102\u001a\u00020 X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b5\u00106¨\u0006R"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/workers/DefaultDownload;", "Lcom/bamtech/sdk4/internal/media/offline/workers/Download;", "Lcom/google/android/exoplayer2/offline/Downloader$ProgressListener;", "database", "Lcom/bamtech/sdk4/internal/media/offline/db/OfflineDatabase;", "downloader", "Lcom/google/android/exoplayer2/offline/Downloader;", "cachedMedia", "Lcom/bamtech/sdk4/internal/media/ExoCachedMedia;", "transactionProvider", "Ljavax/inject/Provider;", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "scheduler", "Lcom/bamtech/sdk4/internal/media/offline/DownloadScheduler;", "context", "Landroid/content/Context;", "databaseProvider", "Lcom/google/android/exoplayer2/database/DatabaseProvider;", "cacheProvider", "Lcom/bamtech/sdk4/internal/media/CacheProvider;", "(Lcom/bamtech/sdk4/internal/media/offline/db/OfflineDatabase;Lcom/google/android/exoplayer2/offline/Downloader;Lcom/bamtech/sdk4/internal/media/ExoCachedMedia;Ljavax/inject/Provider;Lcom/bamtech/sdk4/internal/media/offline/DownloadScheduler;Landroid/content/Context;Lcom/google/android/exoplayer2/database/DatabaseProvider;Lcom/bamtech/sdk4/internal/media/CacheProvider;)V", "getCacheProvider", "()Lcom/bamtech/sdk4/internal/media/CacheProvider;", "getCachedMedia", "()Lcom/bamtech/sdk4/internal/media/ExoCachedMedia;", "getContext", "()Landroid/content/Context;", "getDatabase", "()Lcom/bamtech/sdk4/internal/media/offline/db/OfflineDatabase;", "getDatabaseProvider", "()Lcom/google/android/exoplayer2/database/DatabaseProvider;", "<set-?>", "", "downloadPercentage", "getDownloadPercentage", "()F", "", "downloadedBytes", "getDownloadedBytes", "()J", "getDownloader", "()Lcom/google/android/exoplayer2/offline/Downloader;", "isCancelled", "", "isCancelled$annotations", "()V", "()Z", "setCancelled", "(Z)V", "isComplete", "reportedPercentage", "getScheduler", "()Lcom/bamtech/sdk4/internal/media/offline/DownloadScheduler;", "getTransactionProvider", "()Ljavax/inject/Provider;", "calculateRetryCount", "", "oldError", "Lcom/bamtech/sdk4/media/offline/DownloadError;", "uri", "", "cancel", "", "state", "Landroidx/work/WorkInfo$State;", "error", "debounce", "exceededRetryLimit", "getPersistedState", "Lcom/bamtech/sdk4/media/offline/DownloadStatus;", "getPersistedState$plugin_offline_media_release", "loadMedia", "onBytesTransferred", "forceUpdate", "onProgress", "contentLength", "bytesDownloaded", "percentDownloaded", "remove", "updateStatus", "status", "Companion", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: Download.kt */
public final class DefaultDownload implements Download, C8805a {
    private static final Map<Integer, Integer> HTTP_RETRY_LIMITS = C13173j0.m40356a(C12907r.m40244a(Integer.valueOf(403), Integer.valueOf(0)), C12907r.m40244a(Integer.valueOf(HttpStatus.HTTP_NOT_FOUND), Integer.valueOf(1)));
    private final CacheProvider cacheProvider;
    private final ExoCachedMedia cachedMedia;
    private final Context context;
    private final OfflineDatabase database;
    private final DatabaseProvider databaseProvider;
    private float downloadPercentage;
    private long downloadedBytes;
    private final Downloader downloader;
    private boolean isCancelled;
    private float reportedPercentage;
    private final DownloadScheduler scheduler;
    private final Provider<ServiceTransaction> transactionProvider;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/workers/DefaultDownload$Companion;", "", "()V", "HTTP_RETRY_DEFAULT", "", "HTTP_RETRY_LIMITS", "", "getHTTP_RETRY_LIMITS", "()Ljava/util/Map;", "MEDIA_ID", "", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: Download.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31008k = 3, mo31009mv = {1, 1, 15})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[State.values().length];

        static {
            $EnumSwitchMapping$0[State.CANCELLED.ordinal()] = 1;
            $EnumSwitchMapping$0[State.SUCCEEDED.ordinal()] = 2;
            $EnumSwitchMapping$0[State.FAILED.ordinal()] = 3;
        }
    }

    /* JADX INFO: used method not loaded: kotlin.y.j0.a(kotlin.Pair[]):null, types can be incorrect */
    static {
        new Companion(null);
    }

    public DefaultDownload(OfflineDatabase offlineDatabase, Downloader downloader2, ExoCachedMedia exoCachedMedia, Provider<ServiceTransaction> provider, DownloadScheduler downloadScheduler, Context context2, DatabaseProvider databaseProvider2, CacheProvider cacheProvider2) {
        this.database = offlineDatabase;
        this.downloader = downloader2;
        this.cachedMedia = exoCachedMedia;
        this.transactionProvider = provider;
        this.scheduler = downloadScheduler;
        this.context = context2;
        this.databaseProvider = databaseProvider2;
        this.cacheProvider = cacheProvider2;
    }

    private final boolean debounce() {
        return getDownloadPercentage() - this.reportedPercentage < 1.0f;
    }

    public final int calculateRetryCount(DownloadError downloadError, String str) {
        Object obj = null;
        if (str != null) {
            if (downloadError != null) {
                obj = downloadError.getUrl();
            }
            obj = Boolean.valueOf(str.equals(obj));
        }
        int i = 0;
        if (Intrinsics.areEqual(obj, (Object) Boolean.valueOf(false)) || obj == null) {
            return 1;
        }
        if (Intrinsics.areEqual(obj, (Object) Boolean.valueOf(true))) {
            if (downloadError != null) {
                i = downloadError.getRetriesInitiated();
            }
            return 1 + i;
        }
        throw new C12898l();
    }

    public synchronized void cancel(State state, DownloadError downloadError) {
        this.isCancelled = true;
        this.downloader.cancel();
        this.cachedMedia.setStatus(getPersistedState$plugin_offline_media_release());
        if (!(this.cachedMedia.getStatus() instanceof Failed)) {
            if (state != null) {
                int i = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                if (i == 1 || i == 2) {
                    if (!(this.cachedMedia.getStatus() instanceof Paused) && !(this.cachedMedia.getStatus() instanceof Interrupted) && !(this.cachedMedia.getStatus() instanceof Cancelled) && !(this.cachedMedia.getStatus() instanceof Finished)) {
                        Paused paused = new Paused(getDownloadedBytes(), getDownloadPercentage(), null, 4, null);
                        updateStatus(paused);
                    }
                    if ((this.cachedMedia.getStatus() instanceof Cancelled) || (this.cachedMedia.getStatus() instanceof Paused)) {
                        DownloadScheduler downloadScheduler = this.scheduler;
                        Object obj = this.transactionProvider.get();
                        Intrinsics.checkReturnedValueIsNotNull(obj, "transactionProvider.get()");
                        downloadScheduler.rescheduleRequestedDownloads((ServiceTransaction) obj).mo30056g();
                    }
                } else if (i == 3) {
                    if (exceededRetryLimit(downloadError)) {
                        Failed failed = new Failed(getDownloadedBytes(), getDownloadPercentage(), downloadError, null, 8, null);
                        updateStatus(failed);
                    } else {
                        Interrupted interrupted = new Interrupted(getDownloadedBytes(), getDownloadPercentage(), downloadError, null, 8, null);
                        updateStatus(interrupted);
                    }
                }
            }
            Interrupted interrupted2 = new Interrupted(getDownloadedBytes(), getDownloadPercentage(), downloadError, null, 8, null);
            updateStatus(interrupted2);
        }
    }

    public final boolean exceededRetryLimit(DownloadError downloadError) {
        boolean z = false;
        if ((downloadError != null ? downloadError.getHttpCode() : null) == null) {
            return false;
        }
        Map<Integer, Integer> map = HTTP_RETRY_LIMITS;
        Integer httpCode = downloadError.getHttpCode();
        if (httpCode != null) {
            Integer num = (Integer) map.get(httpCode);
            if (downloadError.getRetriesInitiated() > (num != null ? num.intValue() : 5)) {
                z = true;
            }
            return z;
        }
        Intrinsics.throwNpe();
        throw null;
    }

    public final ExoCachedMedia getCachedMedia() {
        return this.cachedMedia;
    }

    public float getDownloadPercentage() {
        return this.downloadPercentage;
    }

    public long getDownloadedBytes() {
        return this.downloadedBytes;
    }

    public final DownloadStatus getPersistedState$plugin_offline_media_release() {
        CachedMediaEntry byId = this.database.cachedMediaDao().getById(this.cachedMedia.getId());
        if (byId != null) {
            ExoCachedMedia cachedMedia2 = CachedMediaEntryKt.toCachedMedia(byId);
            if (cachedMedia2 != null) {
                DownloadStatus status = cachedMedia2.getStatus();
                if (status != null) {
                    return status;
                }
            }
        }
        return this.cachedMedia.getStatus();
    }

    public boolean isComplete() {
        return (getPersistedState$plugin_offline_media_release() instanceof Finished) || (getPersistedState$plugin_offline_media_release() instanceof Failed);
    }

    public void loadMedia() {
        DownloadStatus status = this.cachedMedia.getStatus();
        DownloadError downloadError = null;
        if (!(status instanceof Interrupted)) {
            status = null;
        }
        Interrupted interrupted = (Interrupted) status;
        if (interrupted != null) {
            downloadError = interrupted.getError();
        }
        try {
            this.reportedPercentage = -1.0f;
            this.downloader.mo23019a(this);
            if (!this.isCancelled) {
                Finished finished = new Finished(getDownloadedBytes(), getDownloadPercentage(), null, 4, null);
                updateStatus(finished);
                DownloadScheduler downloadScheduler = this.scheduler;
                Object obj = this.transactionProvider.get();
                Intrinsics.checkReturnedValueIsNotNull(obj, "transactionProvider.get()");
                downloadScheduler.rescheduleRequestedDownloads((ServiceTransaction) obj).mo30056g();
            }
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder();
            sb.append("Download for media ");
            sb.append(this.cachedMedia.getId());
            sb.append(" interrupted!");
            Log.d("OfflineDownloadSession", sb.toString(), th);
            DownloadError downloadError2 = new DownloadError(th);
            if (th instanceof IOException) {
                if (th instanceof C9439d) {
                    C9439d dVar = th;
                    downloadError2.setHttpCode(Integer.valueOf(dVar.f21948U));
                    downloadError2.setUrl(dVar.f21947c.f21938a.toString());
                    downloadError2.setRetriesInitiated(calculateRetryCount(downloadError, dVar.f21947c.f21938a.toString()));
                }
                cancel(State.FAILED, downloadError2);
            } else if (!this.isCancelled) {
                Failed failed = new Failed(getDownloadedBytes(), getDownloadPercentage(), downloadError2, null, 8, null);
                updateStatus(failed);
                throw th;
            }
        }
    }

    public void onBytesTransferred(boolean z) {
        if (this.isCancelled) {
            return;
        }
        if (z || !debounce() || this.cachedMedia.getStatus().getCanResume()) {
            this.reportedPercentage = getDownloadPercentage();
            InProgress inProgress = new InProgress(getDownloadedBytes(), getDownloadPercentage(), null, 4, null);
            updateStatus(inProgress);
        }
    }

    public void onProgress(long j, long j2, float f) {
        this.downloadedBytes = j2;
        this.downloadPercentage = f;
    }

    public void remove() {
        this.cachedMedia.removeThumbnails(this.context);
        this.database.cachedMediaDao().delete(CachedMediaEntryKt.toCachedMediaEntry(this.cachedMedia));
        this.cacheProvider.removeCache(this.cachedMedia);
        ExoCachedMedia exoCachedMedia = this.cachedMedia;
        Context applicationContext = this.context.getApplicationContext();
        Intrinsics.checkReturnedValueIsNotNull((Object) applicationContext, "context.applicationContext");
        C9484s.m29158a(exoCachedMedia.getFileLocation(applicationContext), this.databaseProvider);
    }

    public final void updateStatus(DownloadStatus downloadStatus) {
        if (this.cachedMedia.getStatus().getTimestamp().compareTo((ReadableInstant) downloadStatus.getTimestamp()) <= 0) {
            if (!(downloadStatus instanceof DownloadErrorStatus) || ((DownloadErrorStatus) downloadStatus).getError() != null || !Intrinsics.areEqual((Object) this.cachedMedia.getStatus().getName(), (Object) downloadStatus.getName())) {
                this.cachedMedia.setStatus(downloadStatus);
                DownloadStatusEntryKt.updateEntry(this.cachedMedia.getStatus(), this.database.cachedMediaDao(), this.cachedMedia.getId());
            }
        }
    }
}
