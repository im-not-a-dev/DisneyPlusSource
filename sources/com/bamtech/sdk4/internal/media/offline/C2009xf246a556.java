package com.bamtech.sdk4.internal.media.offline;

import com.bamtech.sdk4.BifThumbnailSet;
import com.bamtech.sdk4.internal.media.DefaultOnlineMediaClient;
import com.bamtech.sdk4.internal.media.ExoCachedMedia;
import java.io.File;
import kotlin.Metadata;
import p520io.reactivex.functions.C11945a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0005"}, mo31007d2 = {"<anonymous>", "", "run", "com/bamtech/sdk4/internal/media/offline/WorkManagerDownloadScheduler$queueDownload$1$2$1$1$1", "com/bamtech/sdk4/internal/media/offline/WorkManagerDownloadScheduler$queueDownload$1$$special$$inlined$forEach$lambda$1", "com/bamtech/sdk4/internal/media/offline/WorkManagerDownloadScheduler$queueDownload$1$$special$$inlined$forEach$lambda$2"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtech.sdk4.internal.media.offline.WorkManagerDownloadScheduler$queueDownload$1$$special$$inlined$let$lambda$1 */
/* compiled from: DownloadScheduler.kt */
final class C2009xf246a556 implements C11945a {
    final /* synthetic */ File $thumbFile;
    final /* synthetic */ WorkManagerDownloadScheduler$queueDownload$1 this$0;

    C2009xf246a556(File file, BifThumbnailSet bifThumbnailSet, WorkManagerDownloadScheduler$queueDownload$1 workManagerDownloadScheduler$queueDownload$1, DefaultOnlineMediaClient defaultOnlineMediaClient) {
        this.$thumbFile = file;
        this.this$0 = workManagerDownloadScheduler$queueDownload$1;
    }

    public final void run() {
        ExoCachedMedia exoCachedMedia = (ExoCachedMedia) this.this$0.$media;
        exoCachedMedia.setThumbnailsSize(exoCachedMedia.getThumbnailsSize() + this.$thumbFile.length());
    }
}
