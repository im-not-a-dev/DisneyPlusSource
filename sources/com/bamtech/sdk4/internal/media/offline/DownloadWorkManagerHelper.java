package com.bamtech.sdk4.internal.media.offline;

import com.bamtech.sdk4.internal.media.ExoCachedMedia;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.media.offline.DownloadSettings;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import p520io.reactivex.Completable;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\nH&J(\u0010\u000b\u001a\u00020\u00032\u001e\u0010\f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e0\rH&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\nH&J\b\u0010\u0016\u001a\u00020\u0007H&J\u001a\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0018\u001a\u00020\u0019H&J&\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\n2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001cH&¨\u0006\u001d"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/DownloadWorkManagerHelper;", "", "cancelDownload", "Lio/reactivex/Completable;", "media", "Lcom/bamtech/sdk4/media/offline/CachedMedia;", "cancelPeriodicRenewal", "", "isDownloadWorkStarted", "", "Lcom/bamtech/sdk4/internal/media/ExoCachedMedia;", "removeAllLicenses", "licenses", "", "Lkotlin/Triple;", "", "removeDownloadedMedia", "startDownload", "transaction", "Lcom/bamtech/sdk4/internal/service/ServiceTransaction;", "settings", "Lcom/bamtech/sdk4/media/offline/DownloadSettings;", "startOldLicensesCleanupWork", "startPeriodicLicenseRenewal", "skipIfRenewalEquals", "", "syncDownloadTaskStatus", "prepareSync", "Lkotlin/Function0;", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DownloadWorkManagerHelper.kt */
public interface DownloadWorkManagerHelper {

    @Metadata(mo31005bv = {1, 0, 3}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* compiled from: DownloadWorkManagerHelper.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ void startPeriodicLicenseRenewal$default(DownloadWorkManagerHelper downloadWorkManagerHelper, ServiceTransaction serviceTransaction, long j, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    j = -1;
                }
                downloadWorkManagerHelper.startPeriodicLicenseRenewal(serviceTransaction, j);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startPeriodicLicenseRenewal");
        }
    }

    void cancelPeriodicRenewal();

    Completable removeAllLicenses(List<Triple<String, String, String>> list);

    void startDownload(ServiceTransaction serviceTransaction, DownloadSettings downloadSettings, ExoCachedMedia exoCachedMedia);

    void startOldLicensesCleanupWork();

    void startPeriodicLicenseRenewal(ServiceTransaction serviceTransaction, long j);
}
