package com.bamtech.sdk4.internal.media.offline.p047db;

import com.bamtech.sdk4.media.offline.DownloadError;
import com.bamtech.sdk4.media.offline.DownloadErrorStatus;
import com.bamtech.sdk4.media.offline.DownloadProgress;
import com.bamtech.sdk4.media.offline.DownloadStatus;
import com.bamtech.sdk4.media.offline.DownloadStatus.Cancelled;
import com.bamtech.sdk4.media.offline.DownloadStatus.Failed;
import com.bamtech.sdk4.media.offline.DownloadStatus.Finished;
import com.bamtech.sdk4.media.offline.DownloadStatus.InProgress;
import com.bamtech.sdk4.media.offline.DownloadStatus.Interrupted;
import com.bamtech.sdk4.media.offline.DownloadStatus.MissingCache;
import com.bamtech.sdk4.media.offline.DownloadStatus.None;
import com.bamtech.sdk4.media.offline.DownloadStatus.Paused;
import com.bamtech.sdk4.media.offline.DownloadStatus.Queued;
import com.bamtech.sdk4.media.offline.DownloadStatus.Requested;
import com.bamtech.sdk4.media.offline.DownloadStatus.Tombstoned;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0000\u001a\u001c\u0010\u0004\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000¨\u0006\n"}, mo31007d2 = {"toDownloadStatus", "Lcom/bamtech/sdk4/media/offline/DownloadStatus;", "Lcom/bamtech/sdk4/internal/media/offline/db/DownloadStatusEntry;", "toDownloadStatusEntry", "updateEntry", "", "dao", "Lcom/bamtech/sdk4/internal/media/offline/db/CachedMediaDao;", "mediaId", "", "plugin-offline-media_release"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtech.sdk4.internal.media.offline.db.DownloadStatusEntryKt */
/* compiled from: DownloadStatusEntry.kt */
public final class DownloadStatusEntryKt {
    public static final DownloadStatus toDownloadStatus(DownloadStatusEntry downloadStatusEntry) {
        String type = downloadStatusEntry.getType();
        if (Intrinsics.areEqual((Object) type, (Object) Queued.class.getSimpleName())) {
            return new Queued(downloadStatusEntry.getBytesDownloaded(), downloadStatusEntry.getPercentageComplete(), downloadStatusEntry.getTimestamp());
        }
        if (Intrinsics.areEqual((Object) type, (Object) Cancelled.class.getSimpleName())) {
            return new Cancelled(downloadStatusEntry.getTimestamp());
        }
        if (Intrinsics.areEqual((Object) type, (Object) Paused.class.getSimpleName())) {
            return new Paused(downloadStatusEntry.getBytesDownloaded(), downloadStatusEntry.getPercentageComplete(), downloadStatusEntry.getTimestamp());
        }
        if (Intrinsics.areEqual((Object) type, (Object) Interrupted.class.getSimpleName())) {
            Interrupted interrupted = new Interrupted(downloadStatusEntry.getBytesDownloaded(), downloadStatusEntry.getPercentageComplete(), downloadStatusEntry.getError(), downloadStatusEntry.getTimestamp());
            return interrupted;
        } else if (Intrinsics.areEqual((Object) type, (Object) InProgress.class.getSimpleName())) {
            return new InProgress(downloadStatusEntry.getBytesDownloaded(), downloadStatusEntry.getPercentageComplete(), downloadStatusEntry.getTimestamp());
        } else {
            if (Intrinsics.areEqual((Object) type, (Object) Finished.class.getSimpleName())) {
                return new Finished(downloadStatusEntry.getBytesDownloaded(), downloadStatusEntry.getPercentageComplete(), downloadStatusEntry.getTimestamp());
            }
            if (Intrinsics.areEqual((Object) type, (Object) Failed.class.getSimpleName())) {
                Failed failed = new Failed(downloadStatusEntry.getBytesDownloaded(), downloadStatusEntry.getPercentageComplete(), downloadStatusEntry.getError(), downloadStatusEntry.getTimestamp());
                return failed;
            } else if (Intrinsics.areEqual((Object) type, (Object) Tombstoned.class.getSimpleName())) {
                return new Tombstoned(downloadStatusEntry.getTimestamp());
            } else {
                if (Intrinsics.areEqual((Object) type, (Object) Requested.class.getSimpleName())) {
                    return new Requested(downloadStatusEntry.getBytesDownloaded(), downloadStatusEntry.getPercentageComplete(), downloadStatusEntry.getTimestamp());
                }
                if (Intrinsics.areEqual((Object) type, (Object) MissingCache.class.getSimpleName())) {
                    return new MissingCache(downloadStatusEntry.getTimestamp(), false, 2, null);
                }
                return new None(downloadStatusEntry.getTimestamp());
            }
        }
    }

    public static final DownloadStatusEntry toDownloadStatusEntry(DownloadStatus downloadStatus) {
        if (downloadStatus instanceof DownloadProgress) {
            String name = downloadStatus.getName();
            DownloadProgress downloadProgress = (DownloadProgress) downloadStatus;
            long bytesDownloaded = downloadProgress.getBytesDownloaded();
            float percentageComplete = downloadProgress.getPercentageComplete();
            DownloadError downloadError = null;
            DownloadErrorStatus downloadErrorStatus = (DownloadErrorStatus) (!(downloadStatus instanceof DownloadErrorStatus) ? null : downloadStatus);
            if (downloadErrorStatus != null) {
                downloadError = downloadErrorStatus.getError();
            }
            DownloadStatusEntry downloadStatusEntry = new DownloadStatusEntry(name, bytesDownloaded, percentageComplete, downloadError, downloadStatus.getTimestamp());
            return downloadStatusEntry;
        }
        DownloadStatusEntry downloadStatusEntry2 = new DownloadStatusEntry(downloadStatus.getName(), 0, 0.0f, null, downloadStatus.getTimestamp());
        return downloadStatusEntry2;
    }

    public static final void updateEntry(DownloadStatus downloadStatus, CachedMediaDao cachedMediaDao, String str) {
        DownloadStatusEntry downloadStatusEntry = toDownloadStatusEntry(downloadStatus);
        cachedMediaDao.updateStatus(str, downloadStatusEntry.getType(), downloadStatusEntry.getBytesDownloaded(), downloadStatusEntry.getPercentageComplete(), downloadStatusEntry.getError(), downloadStatusEntry.getTimestamp());
    }
}
