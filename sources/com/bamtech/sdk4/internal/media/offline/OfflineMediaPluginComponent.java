package com.bamtech.sdk4.internal.media.offline;

import android.content.Context;
import com.bamtech.sdk4.internal.media.offline.workers.DownloadMediaWorker;
import com.bamtech.sdk4.internal.media.offline.workers.ReleaseAllLicensesWorker;
import com.bamtech.sdk4.internal.media.offline.workers.ReleaseLicenseWorker;
import com.bamtech.sdk4.internal.media.offline.workers.ReleaseLicensesPeriodicWorker;
import com.bamtech.sdk4.internal.media.offline.workers.RemoveMediaWorker;
import com.bamtech.sdk4.internal.media.offline.workers.RenewLicenseWorker;
import com.bamtech.sdk4.internal.media.offline.workers.RenewLicensesWorker;
import com.bamtech.sdk4.media.offline.OfflineMediaPlugin;
import com.bamtech.sdk4.plugin.PluginRegistry;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0010J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\tH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\nH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000fH&¨\u0006\u0011"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/OfflineMediaPluginComponent;", "", "inject", "", "worker", "Lcom/bamtech/sdk4/internal/media/offline/workers/DownloadMediaWorker;", "Lcom/bamtech/sdk4/internal/media/offline/workers/ReleaseAllLicensesWorker;", "Lcom/bamtech/sdk4/internal/media/offline/workers/ReleaseLicenseWorker;", "Lcom/bamtech/sdk4/internal/media/offline/workers/ReleaseLicensesPeriodicWorker;", "Lcom/bamtech/sdk4/internal/media/offline/workers/RemoveMediaWorker;", "Lcom/bamtech/sdk4/internal/media/offline/workers/RenewLicenseWorker;", "Lcom/bamtech/sdk4/internal/media/offline/workers/RenewLicensesWorker;", "plugin", "Lcom/bamtech/sdk4/media/offline/OfflineMediaPlugin;", "mediaStorage", "Lcom/bamtech/sdk4/internal/media/offline/MediaStorage;", "Builder", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: OfflineMediaPluginComponent.kt */
public interface OfflineMediaPluginComponent {

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bH'¨\u0006\t"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/OfflineMediaPluginComponent$Builder;", "", "build", "Lcom/bamtech/sdk4/internal/media/offline/OfflineMediaPluginComponent;", "context", "Landroid/content/Context;", "registry", "pluginRegistry", "Lcom/bamtech/sdk4/plugin/PluginRegistry;", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: OfflineMediaPluginComponent.kt */
    public interface Builder {
        OfflineMediaPluginComponent build();

        Builder context(Context context);

        Builder registry(PluginRegistry pluginRegistry);
    }

    void inject(DownloadMediaWorker downloadMediaWorker);

    void inject(ReleaseAllLicensesWorker releaseAllLicensesWorker);

    void inject(ReleaseLicenseWorker releaseLicenseWorker);

    void inject(ReleaseLicensesPeriodicWorker releaseLicensesPeriodicWorker);

    void inject(RemoveMediaWorker removeMediaWorker);

    void inject(RenewLicenseWorker renewLicenseWorker);

    void inject(RenewLicensesWorker renewLicensesWorker);

    void inject(OfflineMediaPlugin offlineMediaPlugin);

    MediaStorage mediaStorage();
}
