package com.bamtech.sdk4.internal.media.offline;

import com.bamtech.sdk4.internal.media.ExoCachedMedia;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.media.offline.CachedMedia;
import com.bamtech.sdk4.media.offline.DownloadSettings;
import com.bamtech.sdk4.media.offline.DownloadStatus.Requested;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Completable;", "kotlin.jvm.PlatformType", "call"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DownloadScheduler.kt */
final class WorkManagerDownloadScheduler$rescheduleRequestedDownloads$1<V> implements Callable<CompletableSource> {
    final /* synthetic */ DownloadSettings $settings;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ WorkManagerDownloadScheduler this$0;

    WorkManagerDownloadScheduler$rescheduleRequestedDownloads$1(WorkManagerDownloadScheduler workManagerDownloadScheduler, ServiceTransaction serviceTransaction, DownloadSettings downloadSettings) {
        this.this$0 = workManagerDownloadScheduler;
        this.$transaction = serviceTransaction;
        this.$settings = downloadSettings;
    }

    public final Completable call() {
        return this.this$0.mediaStorage.getAll(this.$transaction).mo30233g(C20121.INSTANCE).mo30225d((Function<? super T, ? extends ObservableSource<? extends R>>) C20132.INSTANCE).mo30182d((Function<? super T, ? extends CompletableSource>) new Function<CachedMedia, CompletableSource>(this) {
            final /* synthetic */ WorkManagerDownloadScheduler$rescheduleRequestedDownloads$1 this$0;

            {
                this.this$0 = r1;
            }

            public final CompletableSource apply(CachedMedia cachedMedia) {
                if (cachedMedia.getStatus() instanceof Requested) {
                    WorkManagerDownloadScheduler$rescheduleRequestedDownloads$1 workManagerDownloadScheduler$rescheduleRequestedDownloads$1 = this.this$0;
                    WorkManagerDownloadScheduler workManagerDownloadScheduler = workManagerDownloadScheduler$rescheduleRequestedDownloads$1.this$0;
                    ServiceTransaction serviceTransaction = workManagerDownloadScheduler$rescheduleRequestedDownloads$1.$transaction;
                    DownloadSettings downloadSettings = workManagerDownloadScheduler$rescheduleRequestedDownloads$1.$settings;
                    String str = "settings";
                    C12880j.m40222a((Object) downloadSettings, str);
                    if (!((Boolean) workManagerDownloadScheduler.isQueueFull(serviceTransaction, downloadSettings, true).mo30224c()).booleanValue()) {
                        WorkManagerDownloadScheduler$rescheduleRequestedDownloads$1 workManagerDownloadScheduler$rescheduleRequestedDownloads$12 = this.this$0;
                        WorkManagerDownloadScheduler workManagerDownloadScheduler2 = workManagerDownloadScheduler$rescheduleRequestedDownloads$12.this$0;
                        ServiceTransaction serviceTransaction2 = workManagerDownloadScheduler$rescheduleRequestedDownloads$12.$transaction;
                        DownloadSettings downloadSettings2 = workManagerDownloadScheduler$rescheduleRequestedDownloads$12.$settings;
                        C12880j.m40222a((Object) downloadSettings2, str);
                        return workManagerDownloadScheduler2.queueDownload(serviceTransaction2, downloadSettings2, (ExoCachedMedia) cachedMedia);
                    }
                }
                return Completable.m38169h();
            }
        });
    }
}
