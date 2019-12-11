package com.bamtech.sdk4.internal.media.offline.workers;

import androidx.work.C1032f;
import androidx.work.Operation.State;
import androidx.work.WorkManager;
import com.bamtech.sdk4.internal.media.ExoCachedMedia;
import com.bamtech.sdk4.internal.media.offline.DefaultDownloadWorkManagerHelper;
import com.bamtech.sdk4.internal.media.offline.MediaStorage;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.media.offline.DownloadSettings;
import com.bamtech.sdk4.media.offline.OfflineMediaPlugin;
import com.google.common.util.concurrent.C10413b;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t¸\u0006\u0000"}, mo31007d2 = {"com/bamtech/sdk4/internal/media/offline/workers/DownloadMediaWorker$restartDownload$1$1", "Lcom/google/common/util/concurrent/FutureCallback;", "Landroidx/work/Operation$State;", "onFailure", "", "t", "", "onSuccess", "result", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DownloadMediaWorker.kt */
public final class DownloadMediaWorker$restartDownload$$inlined$let$lambda$1 implements C10413b<State> {
    final /* synthetic */ ExoCachedMedia $cachedMedia$inlined;
    final /* synthetic */ String $operationId;
    final /* synthetic */ DownloadMediaWorker this$0;

    DownloadMediaWorker$restartDownload$$inlined$let$lambda$1(String str, DownloadMediaWorker downloadMediaWorker, ExoCachedMedia exoCachedMedia) {
        this.$operationId = str;
        this.this$0 = downloadMediaWorker;
        this.$cachedMedia$inlined = exoCachedMedia;
    }

    public void onFailure(Throwable th) {
    }

    public void onSuccess(State state) {
        ServiceTransaction serviceTransaction = (ServiceTransaction) this.this$0.getTransactionProvider$plugin_offline_media_release().get();
        MediaStorage mediaStorage = OfflineMediaPlugin.Companion.getComponent$plugin_offline_media_release().mediaStorage();
        C12880j.m40222a((Object) serviceTransaction, "transaction");
        DownloadSettings downloadSettings = (DownloadSettings) mediaStorage.getDownloadSettings(serviceTransaction).mo30224c();
        DefaultDownloadWorkManagerHelper workManagerHelper$plugin_offline_media_release = this.this$0.getWorkManagerHelper$plugin_offline_media_release();
        C12880j.m40222a((Object) downloadSettings, "downloadSettings");
        WorkManager.m5490a().mo5641a(this.$operationId, C1032f.REPLACE, workManagerHelper$plugin_offline_media_release.buildDownloadWorkRequest$plugin_offline_media_release(downloadSettings, this.$cachedMedia$inlined)).mo5759a();
    }
}
