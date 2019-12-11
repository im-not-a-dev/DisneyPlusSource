package com.bamtech.sdk4.internal.media.offline.workers;

import androidx.work.WorkInfo.State;
import com.bamtech.sdk4.media.offline.DownloadError;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J \u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H&J\b\u0010\u0013\u001a\u00020\u000eH&J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000bH&J\b\u0010\u0016\u001a\u00020\u000eH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\f¨\u0006\u0017"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/workers/Download;", "", "downloadPercentage", "", "getDownloadPercentage", "()F", "downloadedBytes", "", "getDownloadedBytes", "()J", "isComplete", "", "()Z", "cancel", "", "state", "Landroidx/work/WorkInfo$State;", "error", "Lcom/bamtech/sdk4/media/offline/DownloadError;", "loadMedia", "onBytesTransferred", "forceUpdate", "remove", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: Download.kt */
public interface Download {

    @Metadata(mo31005bv = {1, 0, 3}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* compiled from: Download.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ void cancel$default(Download download, State state, DownloadError downloadError, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    state = null;
                }
                if ((i & 2) != 0) {
                    downloadError = null;
                }
                download.cancel(state, downloadError);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }
    }

    void cancel(State state, DownloadError downloadError);

    float getDownloadPercentage();

    long getDownloadedBytes();

    boolean isComplete();

    void loadMedia();

    void onBytesTransferred(boolean z);

    void remove();
}
