package com.bamtech.sdk4.internal.media.offline;

import com.bamtech.sdk4.internal.media.ExoCachedMedia;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import java.util.concurrent.Callable;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo31007d2 = {"<anonymous>", "Lcom/bamtech/sdk4/internal/media/ExoCachedMedia;", "call"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: ExoCachedMediaHelper.kt */
final class DefaultExoCachedMediaHelper$downloadMediaLicenseAsync$1<V> implements Callable<T> {
    final /* synthetic */ ExoCachedMedia $media;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultExoCachedMediaHelper this$0;

    DefaultExoCachedMediaHelper$downloadMediaLicenseAsync$1(DefaultExoCachedMediaHelper defaultExoCachedMediaHelper, ServiceTransaction serviceTransaction, ExoCachedMedia exoCachedMedia) {
        this.this$0 = defaultExoCachedMediaHelper;
        this.$transaction = serviceTransaction;
        this.$media = exoCachedMedia;
    }

    public final ExoCachedMedia call() {
        DefaultExoCachedMediaHelper defaultExoCachedMediaHelper = this.this$0;
        ServiceTransaction serviceTransaction = this.$transaction;
        ExoCachedMedia exoCachedMedia = this.$media;
        return defaultExoCachedMediaHelper.downloadMediaLicense(serviceTransaction, exoCachedMedia, exoCachedMedia.getLicense(), this.$media.getAudioLicense(), C19961.INSTANCE);
    }
}
