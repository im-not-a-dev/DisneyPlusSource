package com.bamtech.sdk4.internal.media.offline;

import com.bamtech.sdk4.internal.media.ExoCachedMedia;
import com.bamtech.sdk4.internal.media.offline.DefaultOfflineMediaClient.WhenMappings;
import com.bamtech.sdk4.media.offline.CachedMedia;
import kotlin.Metadata;
import p520io.reactivex.Maybe;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.functions.Function;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Maybe;", "Lcom/bamtech/sdk4/internal/media/ExoCachedMedia;", "kotlin.jvm.PlatformType", "it", "Lcom/bamtech/sdk4/media/offline/CachedMedia;", "apply"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: DefaultOfflineMediaClient.kt */
final class DefaultOfflineMediaClient$getMediaItem$2<T, R> implements Function<T, MaybeSource<? extends R>> {
    final /* synthetic */ DefaultOfflineMediaClient this$0;

    DefaultOfflineMediaClient$getMediaItem$2(DefaultOfflineMediaClient defaultOfflineMediaClient) {
        this.this$0 = defaultOfflineMediaClient;
    }

    public final Maybe<ExoCachedMedia> apply(CachedMedia cachedMedia) {
        ExoCachedMedia exoCachedMedia = (ExoCachedMedia) cachedMedia;
        if (WhenMappings.$EnumSwitchMapping$0[cachedMedia.getLicenseStatus().ordinal()] != 1) {
            return this.this$0.downloadSession.renewLicense(cachedMedia).mo30042a((MaybeSource<T>) Maybe.m38258c(cachedMedia)).mo30101a((MaybeSource<? extends T>) Maybe.m38259h());
        }
        return Maybe.m38258c(cachedMedia);
    }
}
