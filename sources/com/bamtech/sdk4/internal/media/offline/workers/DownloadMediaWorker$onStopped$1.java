package com.bamtech.sdk4.internal.media.offline.workers;

import androidx.work.WorkInfo;
import com.bamtech.sdk4.internal.media.offline.workers.Download.DefaultImpls;
import com.google.common.util.concurrent.C10413b;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, mo31007d2 = {"com/bamtech/sdk4/internal/media/offline/workers/DownloadMediaWorker$onStopped$1", "Lcom/google/common/util/concurrent/FutureCallback;", "Landroidx/work/WorkInfo;", "onFailure", "", "t", "", "onSuccess", "result", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DownloadMediaWorker.kt */
public final class DownloadMediaWorker$onStopped$1 implements C10413b<WorkInfo> {
    final /* synthetic */ DownloadMediaWorker this$0;

    DownloadMediaWorker$onStopped$1(DownloadMediaWorker downloadMediaWorker) {
        this.this$0 = downloadMediaWorker;
    }

    public void onFailure(Throwable th) {
        DefaultImpls.cancel$default(this.this$0.getDownload(), null, null, 3, null);
    }

    public void onSuccess(WorkInfo workInfo) {
        this.this$0.cancel(workInfo != null ? workInfo.mo5630a() : null);
    }
}
