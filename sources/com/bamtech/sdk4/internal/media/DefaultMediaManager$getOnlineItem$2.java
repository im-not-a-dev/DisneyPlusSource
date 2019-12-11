package com.bamtech.sdk4.internal.media;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.media.MediaItem;
import kotlin.TypeCastException;
import kotlin.Metadata;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "it", "Lcom/bamtech/sdk4/media/MediaItem;", "kotlin.jvm.PlatformType", "accept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: MediaManager.kt */
final class DefaultMediaManager$getOnlineItem$2<T> implements Consumer<MediaItem> {
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultMediaManager this$0;

    DefaultMediaManager$getOnlineItem$2(DefaultMediaManager defaultMediaManager, ServiceTransaction serviceTransaction) {
        this.this$0 = defaultMediaManager;
        this.$transaction = serviceTransaction;
    }

    public final void accept(MediaItem mediaItem) {
        if (mediaItem != null) {
            this.this$0.setAdEngineToken(this.$transaction, (OnlineMediaItem) mediaItem);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bamtech.sdk4.internal.media.OnlineMediaItem");
    }
}
