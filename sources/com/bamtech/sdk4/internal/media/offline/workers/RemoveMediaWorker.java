package com.bamtech.sdk4.internal.media.offline.workers;

import android.content.Context;
import androidx.work.ListenableWorker.Result;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.bamtech.sdk4.internal.media.offline.DownloadSessionModule;
import com.bamtech.sdk4.internal.media.offline.DownloadSessionSubcomponent.Builder;
import com.bamtech.sdk4.media.offline.OfflineMediaPlugin;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R*\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0000@\u0000X.¢\u0006\u0014\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/workers/RemoveMediaWorker;", "Landroidx/work/Worker;", "context", "Landroid/content/Context;", "parameters", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "downloadSession", "Lcom/bamtech/sdk4/internal/media/offline/workers/Download;", "subcomponent", "Ljavax/inject/Provider;", "Lcom/bamtech/sdk4/internal/media/offline/DownloadSessionSubcomponent$Builder;", "subcomponent$annotations", "()V", "getSubcomponent$plugin_offline_media_release", "()Ljavax/inject/Provider;", "setSubcomponent$plugin_offline_media_release", "(Ljavax/inject/Provider;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: RemoveMediaWorker.kt */
public final class RemoveMediaWorker extends Worker {
    private Download downloadSession;
    public Provider<Builder> subcomponent;

    public RemoveMediaWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        OfflineMediaPlugin.Companion.getComponent$plugin_offline_media_release().inject(this);
    }

    public Result doWork() {
        try {
            String a = getInputData().mo5584a("MEDIA_ID");
            if (a != null) {
                C12880j.m40222a((Object) a, "inputData.getString(MEDI…on(\"Media ID is missing\")");
                Provider<Builder> provider = this.subcomponent;
                if (provider != null) {
                    this.downloadSession = ((Builder) provider.get()).module(new DownloadSessionModule(a)).build().downloadSession();
                    Download download = this.downloadSession;
                    if (download != null) {
                        download.remove();
                        Result c = Result.m5470c();
                        C12880j.m40222a((Object) c, "Result.success()");
                        return c;
                    }
                    C12880j.m40227c("downloadSession");
                    throw null;
                }
                C12880j.m40227c("subcomponent");
                throw null;
            }
            throw new IllegalArgumentException("Media ID is missing");
        } catch (Exception e) {
            if (e instanceof IllegalStateException) {
                Result b = Result.m5469b();
                C12880j.m40222a((Object) b, "Result.retry()");
                return b;
            }
            Result a2 = Result.m5467a();
            C12880j.m40222a((Object) a2, "Result.failure()");
            return a2;
        }
    }
}
