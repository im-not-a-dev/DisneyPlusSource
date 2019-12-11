package com.bamtech.sdk4.internal.media.offline;

import com.bamtech.sdk4.internal.media.offline.workers.Download;
import com.bamtech.shadow.dagger.Lazy;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J$\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J$\u0010\r\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J$\u0010\u000e\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000f"}, mo31007d2 = {"com/bamtech/sdk4/internal/media/offline/DownloadSessionModule$transferListener$1", "Lcom/google/android/exoplayer2/upstream/TransferListener;", "onBytesTransferred", "", "source", "Lcom/google/android/exoplayer2/upstream/DataSource;", "dataSpec", "Lcom/google/android/exoplayer2/upstream/DataSpec;", "isNetwork", "", "bytesTransferred", "", "onTransferEnd", "onTransferInitializing", "onTransferStart", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DownloadSessionSubcomponent.kt */
public final class DownloadSessionModule$transferListener$1 implements TransferListener {
    final /* synthetic */ Lazy $download;

    DownloadSessionModule$transferListener$1(Lazy lazy) {
        this.$download = lazy;
    }

    public void onBytesTransferred(DataSource dataSource, DataSpec dataSpec, boolean z, int i) {
        ((Download) this.$download.get()).onBytesTransferred(false);
    }

    public void onTransferEnd(DataSource dataSource, DataSpec dataSpec, boolean z) {
        ((Download) this.$download.get()).onBytesTransferred(true);
    }

    public void onTransferInitializing(DataSource dataSource, DataSpec dataSpec, boolean z) {
    }

    public void onTransferStart(DataSource dataSource, DataSpec dataSpec, boolean z) {
    }
}
