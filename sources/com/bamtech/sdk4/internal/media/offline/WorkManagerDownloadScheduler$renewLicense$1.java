package com.bamtech.sdk4.internal.media.offline;

import android.util.Log;
import com.bamtech.sdk4.internal.media.ExoCachedMedia;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.media.offline.CachedMedia;
import java.util.Arrays;
import kotlin.Metadata;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableObserver;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Completable;", "kotlin.jvm.PlatformType", "renewedMedia", "Lcom/bamtech/sdk4/media/offline/CachedMedia;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DownloadScheduler.kt */
final class WorkManagerDownloadScheduler$renewLicense$1<T, R> implements Function<CachedMedia, CompletableSource> {
    final /* synthetic */ byte[] $oldAudioLicense;
    final /* synthetic */ byte[] $oldLicense;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ WorkManagerDownloadScheduler this$0;

    WorkManagerDownloadScheduler$renewLicense$1(WorkManagerDownloadScheduler workManagerDownloadScheduler, ServiceTransaction serviceTransaction, byte[] bArr, byte[] bArr2) {
        this.this$0 = workManagerDownloadScheduler;
        this.$transaction = serviceTransaction;
        this.$oldLicense = bArr;
        this.$oldAudioLicense = bArr2;
    }

    public final Completable apply(final CachedMedia cachedMedia) {
        ExoCachedMedia exoCachedMedia = (ExoCachedMedia) cachedMedia;
        StringBuilder sb = new StringBuilder();
        sb.append("renewLicense: Storing renewed media with license: ");
        sb.append(Arrays.toString(exoCachedMedia.getLicense()));
        sb.append('.');
        Log.d("OfflineDlScheduler", sb.toString());
        return this.this$0.mediaStorage.store(this.$transaction, cachedMedia).mo30034a((CompletableSource) new CompletableSource(this) {
            final /* synthetic */ WorkManagerDownloadScheduler$renewLicense$1 this$0;

            {
                this.this$0 = r1;
            }

            public final void subscribe(CompletableObserver completableObserver) {
                WorkManagerDownloadScheduler$renewLicense$1 workManagerDownloadScheduler$renewLicense$1 = this.this$0;
                WorkManagerDownloadScheduler workManagerDownloadScheduler = workManagerDownloadScheduler$renewLicense$1.this$0;
                ServiceTransaction serviceTransaction = workManagerDownloadScheduler$renewLicense$1.$transaction;
                String id = cachedMedia.getId();
                WorkManagerDownloadScheduler$renewLicense$1 workManagerDownloadScheduler$renewLicense$12 = this.this$0;
                workManagerDownloadScheduler.releaseOldLicense(serviceTransaction, id, workManagerDownloadScheduler$renewLicense$12.$oldLicense, workManagerDownloadScheduler$renewLicense$12.$oldAudioLicense, false);
                completableObserver.onComplete();
            }
        });
    }
}
