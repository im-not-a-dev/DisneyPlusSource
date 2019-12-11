package com.bamtech.sdk4.internal.media.offline;

import com.bamtech.sdk4.media.offline.DownloadProgress;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003XD¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, mo31007d2 = {"com/bamtech/sdk4/internal/media/offline/StatusProgressExtKt$progress$1", "Lcom/bamtech/sdk4/media/offline/DownloadProgress;", "bytesDownloaded", "", "getBytesDownloaded", "()J", "percentageComplete", "", "getPercentageComplete", "()F", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: StatusProgressExt.kt */
public final class StatusProgressExtKt$progress$1 implements DownloadProgress {
    private final long bytesDownloaded;
    private final float percentageComplete;

    StatusProgressExtKt$progress$1() {
    }

    public long getBytesDownloaded() {
        return this.bytesDownloaded;
    }

    public float getPercentageComplete() {
        return this.percentageComplete;
    }
}
