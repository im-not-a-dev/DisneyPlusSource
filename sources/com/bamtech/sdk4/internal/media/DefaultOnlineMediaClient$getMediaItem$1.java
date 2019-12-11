package com.bamtech.sdk4.internal.media;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.media.MediaDescriptor;
import com.bamtech.sdk4.media.MediaItem;
import com.bamtech.sdk4.media.PlaybackContext;
import kotlin.Metadata;
import p520io.reactivex.Maybe;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Maybe;", "Lcom/bamtech/sdk4/media/MediaItem;", "allowL1", "", "apply", "(Ljava/lang/Boolean;)Lio/reactivex/Maybe;"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DefaultOnlineMediaClient.kt */
final class DefaultOnlineMediaClient$getMediaItem$1<T, R> implements Function<T, MaybeSource<? extends R>> {
    final /* synthetic */ MediaDescriptor $descriptor;
    final /* synthetic */ PlaybackContext $playbackContext;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultOnlineMediaClient this$0;

    DefaultOnlineMediaClient$getMediaItem$1(DefaultOnlineMediaClient defaultOnlineMediaClient, ServiceTransaction serviceTransaction, MediaDescriptor mediaDescriptor, PlaybackContext playbackContext) {
        this.this$0 = defaultOnlineMediaClient;
        this.$transaction = serviceTransaction;
        this.$descriptor = mediaDescriptor;
        this.$playbackContext = playbackContext;
    }

    public final Maybe<MediaItem> apply(Boolean bool) {
        return this.this$0.getVerifiedMediaItem(this.$transaction, this.$descriptor, this.$playbackContext, bool.booleanValue());
    }
}
