package com.bamtech.sdk4.internal.media.offline;

import com.bamtech.sdk4.media.offline.DownloadProgress;
import com.bamtech.sdk4.media.offline.DownloadStatus;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo31007d2 = {"progress", "Lcom/bamtech/sdk4/media/offline/DownloadProgress;", "Lcom/bamtech/sdk4/media/offline/DownloadStatus;", "getProgress", "(Lcom/bamtech/sdk4/media/offline/DownloadStatus;)Lcom/bamtech/sdk4/media/offline/DownloadProgress;", "plugin-offline-media_release"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* compiled from: StatusProgressExt.kt */
public final class StatusProgressExtKt {
    public static final DownloadProgress getProgress(DownloadStatus downloadStatus) {
        return downloadStatus instanceof DownloadProgress ? (DownloadProgress) downloadStatus : new StatusProgressExtKt$progress$1();
    }
}
