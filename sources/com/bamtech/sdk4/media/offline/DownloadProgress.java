package com.bamtech.sdk4.media.offline;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/offline/DownloadProgress;", "", "bytesDownloaded", "", "getBytesDownloaded", "()J", "percentageComplete", "", "getPercentageComplete", "()F", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DownloadProgress.kt */
public interface DownloadProgress {
    long getBytesDownloaded();

    float getPercentageComplete();
}
