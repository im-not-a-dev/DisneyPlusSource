package com.bamtech.sdk4.internal.media;

import com.bamtech.sdk4.internal.media.MediaClient.DefaultImpls;
import com.bamtech.sdk4.internal.media.offline.OfflineMediaClient;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.media.MediaDescriptor;
import com.bamtech.sdk4.media.MediaItem;
import com.bamtech.sdk4.media.Playhead;
import kotlin.Metadata;
import p520io.reactivex.Maybe;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Maybe;", "Lcom/bamtech/sdk4/media/MediaItem;", "it", "Lcom/bamtech/sdk4/media/Playhead;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: MediaManager.kt */
final class DefaultMediaManager$getCachedItem$4<T, R> implements Function<T, MaybeSource<? extends R>> {
    final /* synthetic */ MediaDescriptor $mediaDescriptor;
    final /* synthetic */ OfflineMediaClient $offlineMediaClient;
    final /* synthetic */ ServiceTransaction $transaction;

    DefaultMediaManager$getCachedItem$4(OfflineMediaClient offlineMediaClient, ServiceTransaction serviceTransaction, MediaDescriptor mediaDescriptor) {
        this.$offlineMediaClient = offlineMediaClient;
        this.$transaction = serviceTransaction;
        this.$mediaDescriptor = mediaDescriptor;
    }

    public final Maybe<MediaItem> apply(Playhead playhead) {
        return DefaultImpls.getMediaItem$default(this.$offlineMediaClient, this.$transaction, this.$mediaDescriptor, null, 4, null);
    }
}
