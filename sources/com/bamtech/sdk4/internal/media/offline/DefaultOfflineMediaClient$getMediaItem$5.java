package com.bamtech.sdk4.internal.media.offline;

import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.internal.service.ServiceTransaction.DefaultImpls;
import com.bamtech.sdk4.media.MediaItem;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import p520io.reactivex.Maybe;
import p520io.reactivex.MaybeSource;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Maybe;", "Lcom/bamtech/sdk4/media/MediaItem;", "kotlin.jvm.PlatformType", "call"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DefaultOfflineMediaClient.kt */
final class DefaultOfflineMediaClient$getMediaItem$5<V> implements Callable<MaybeSource<? extends T>> {
    final /* synthetic */ ServiceTransaction $transaction;

    DefaultOfflineMediaClient$getMediaItem$5(ServiceTransaction serviceTransaction) {
        this.$transaction = serviceTransaction;
    }

    public final Maybe<MediaItem> call() {
        DefaultImpls.logDust$default(this.$transaction, "urn:bamtech:dust:bamsdk:api:media:cache:miss", "urn:bamtech:dust:bamsdk:event:sdk:internal", null, false, 12, null);
        return Maybe.m38259h();
    }
}
