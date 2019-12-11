package com.bamtech.sdk4.internal.media;

import com.bamtech.sdk4.BifThumbnailSet;
import com.bamtech.sdk4.MediaThumbnailLink;
import com.bamtech.sdk4.MediaThumbnailLinks;
import com.bamtech.sdk4.ThumbnailResolution;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.media.MediaItem;
import java.util.List;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.Maybe;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\n¢\u0006\u0002\b\u0007"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Maybe;", "", "Lcom/bamtech/sdk4/BifThumbnailSet;", "it", "", "Lcom/bamtech/sdk4/core/types/JWT;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: MediaManager.kt */
final class DefaultMediaManager$getBifThumbnailSets$1<T, R> implements Function<T, MaybeSource<? extends R>> {
    final /* synthetic */ MediaItem $onlineItem;
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultMediaManager this$0;

    DefaultMediaManager$getBifThumbnailSets$1(DefaultMediaManager defaultMediaManager, MediaItem mediaItem, ServiceTransaction serviceTransaction) {
        this.this$0 = defaultMediaManager;
        this.$onlineItem = mediaItem;
        this.$transaction = serviceTransaction;
    }

    public final Maybe<List<BifThumbnailSet>> apply(String str) {
        MediaThumbnailLinks thumbnails = this.$onlineItem.getThumbnails();
        if ((thumbnails != null ? thumbnails.getBif() : null) != null) {
            MediaClient access$getOnlineMediaClient$p = this.this$0.onlineMediaClient;
            ServiceTransaction serviceTransaction = this.$transaction;
            MediaThumbnailLinks thumbnails2 = this.$onlineItem.getThumbnails();
            MediaThumbnailLink bif = thumbnails2 != null ? thumbnails2.getBif() : null;
            if (bif != null) {
                return access$getOnlineMediaClient$p.getBifThumbnails(serviceTransaction, bif, ThumbnailResolution.ALL, C13170i0.m40332a(C12907r.m40244a("{accessToken}", str)));
            }
            C12880j.m40220a();
            throw null;
        }
        Maybe<List<BifThumbnailSet>> c = Maybe.m38258c(C13185o.m40513a());
        C12880j.m40222a((Object) c, "Maybe.just(listOf())");
        return c;
    }
}
