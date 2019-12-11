package com.bamtech.sdk4.internal.media.offline;

import com.bamtech.sdk4.internal.media.ExoCachedMedia;
import com.bamtech.sdk4.internal.media.offline.p047db.CachedMediaEntry;
import com.bamtech.sdk4.internal.media.offline.p047db.CachedMediaEntryKt;
import com.bamtech.sdk4.media.offline.CachedMedia;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import p520io.reactivex.Maybe;
import p520io.reactivex.MaybeSource;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "Lio/reactivex/Maybe;", "Lcom/bamtech/sdk4/media/offline/CachedMedia;", "kotlin.jvm.PlatformType", "call"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: RoomMediaStorage.kt */
final class RoomMediaStorage$get$1<V> implements Callable<MaybeSource<? extends T>> {
    final /* synthetic */ String $mediaId;
    final /* synthetic */ RoomMediaStorage this$0;

    RoomMediaStorage$get$1(RoomMediaStorage roomMediaStorage, String str) {
        this.this$0 = roomMediaStorage;
        this.$mediaId = str;
    }

    public final Maybe<? extends CachedMedia> call() {
        CachedMediaEntry byId = this.this$0.f6074db.cachedMediaDao().getById(this.$mediaId);
        ExoCachedMedia cachedMedia = byId != null ? CachedMediaEntryKt.toCachedMedia(byId) : null;
        if (cachedMedia != null) {
            Maybe<? extends CachedMedia> c = Maybe.m38258c(cachedMedia);
            if (c != null) {
                return c;
            }
        }
        return Maybe.m38259h();
    }
}
