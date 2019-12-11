package com.bamtech.sdk4.internal.media;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.media.MediaItem;
import kotlin.Metadata;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Single;", "", "Lcom/bamtech/sdk4/core/types/JWT;", "it", "Lcom/bamtech/sdk4/media/MediaItem;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: MediaManager.kt */
final class DefaultMediaManager$getCachedItem$1<T, R> implements Function<T, SingleSource<? extends R>> {
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultMediaManager this$0;

    DefaultMediaManager$getCachedItem$1(DefaultMediaManager defaultMediaManager, ServiceTransaction serviceTransaction) {
        this.this$0 = defaultMediaManager;
        this.$transaction = serviceTransaction;
    }

    public final Single<String> apply(MediaItem mediaItem) {
        return this.this$0.tokenProvider.getAccessToken(this.$transaction);
    }
}
