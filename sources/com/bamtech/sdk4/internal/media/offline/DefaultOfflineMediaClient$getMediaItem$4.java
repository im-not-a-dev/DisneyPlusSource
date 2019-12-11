package com.bamtech.sdk4.internal.media.offline;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.service.ServiceTransaction.DefaultImpls;
import com.bamtech.sdk4.media.MediaItem;
import kotlin.Metadata;
import p520io.reactivex.functions.Consumer;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "it", "Lcom/bamtech/sdk4/media/MediaItem;", "kotlin.jvm.PlatformType", "accept"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DefaultOfflineMediaClient.kt */
final class DefaultOfflineMediaClient$getMediaItem$4<T> implements Consumer<MediaItem> {
    final /* synthetic */ ServiceTransaction $transaction;

    DefaultOfflineMediaClient$getMediaItem$4(ServiceTransaction serviceTransaction) {
        this.$transaction = serviceTransaction;
    }

    public final void accept(MediaItem mediaItem) {
        DefaultImpls.logDust$default(this.$transaction, "urn:bamtech:dust:bamsdk:api:media:cache:hit", "urn:bamtech:dust:bamsdk:event:sdk:internal", null, false, 12, null);
    }
}
