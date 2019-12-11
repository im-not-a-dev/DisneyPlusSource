package com.bamtech.sdk4.internal.media.offline;

import com.bamtech.sdk4.internal.media.CacheProvider;
import com.bamtech.sdk4.internal.media.ExoCachedMedia;
import com.bamtech.sdk4.internal.service.ServiceTransaction;
import com.bamtech.sdk4.media.offline.CachedMedia;
import com.bamtech.sdk4.media.offline.DownloadStatus.MissingCache;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo31007d2 = {"<anonymous>", "Lcom/bamtech/sdk4/media/offline/CachedMedia;", "it", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DefaultOfflineMediaClient.kt */
final class DefaultOfflineMediaClient$getMediaItem$1<T, R> implements Function<T, R> {
    final /* synthetic */ ServiceTransaction $transaction;
    final /* synthetic */ DefaultOfflineMediaClient this$0;

    DefaultOfflineMediaClient$getMediaItem$1(DefaultOfflineMediaClient defaultOfflineMediaClient, ServiceTransaction serviceTransaction) {
        this.this$0 = defaultOfflineMediaClient;
        this.$transaction = serviceTransaction;
    }

    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        CachedMedia cachedMedia = (CachedMedia) obj;
        apply(cachedMedia);
        return cachedMedia;
    }

    public final CachedMedia apply(CachedMedia cachedMedia) {
        ExoCachedMedia exoCachedMedia = (ExoCachedMedia) cachedMedia;
        if (C12880j.m40224a((Object) exoCachedMedia.isCacheIncomplete(new Function1<ExoCachedMedia, Long>(this.this$0.cacheProvider) {
            public final String getName() {
                return "calcBytesForCachedMedia";
            }

            public final KDeclarationContainer getOwner() {
                return C12895y.m40230a(CacheProvider.class);
            }

            public final String getSignature() {
                return "calcBytesForCachedMedia(Lcom/bamtech/sdk4/internal/media/ExoCachedMedia;)J";
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return Long.valueOf(invoke((ExoCachedMedia) obj));
            }

            public final long invoke(ExoCachedMedia exoCachedMedia) {
                return ((CacheProvider) this.receiver).calcBytesForCachedMedia(exoCachedMedia);
            }
        }), (Object) Boolean.valueOf(true))) {
            exoCachedMedia.setStatus(new MissingCache(null, false, 3, null));
            this.this$0.mediaStorage.store(this.$transaction, exoCachedMedia).mo30053d();
        }
        return cachedMedia;
    }
}
