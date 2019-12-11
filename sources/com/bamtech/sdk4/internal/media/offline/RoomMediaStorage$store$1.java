package com.bamtech.sdk4.internal.media.offline;

import com.bamtech.sdk4.internal.media.ExoCachedMedia;
import com.bamtech.sdk4.internal.media.offline.p047db.CachedMediaEntryKt;
import com.bamtech.sdk4.media.offline.CachedMedia;
import kotlin.C13142s;
import kotlin.Metadata;
import p520io.reactivex.functions.C11945a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo31007d2 = {"<anonymous>", "", "run"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: RoomMediaStorage.kt */
final class RoomMediaStorage$store$1 implements C11945a {
    final /* synthetic */ CachedMedia $media;
    final /* synthetic */ RoomMediaStorage this$0;

    RoomMediaStorage$store$1(RoomMediaStorage roomMediaStorage, CachedMedia cachedMedia) {
        this.this$0 = roomMediaStorage;
        this.$media = cachedMedia;
    }

    public final void run() {
        CachedMedia cachedMedia = this.$media;
        if (cachedMedia != null) {
            this.this$0.f6074db.cachedMediaDao().store(CachedMediaEntryKt.toCachedMediaEntry((ExoCachedMedia) cachedMedia));
            return;
        }
        throw new C13142s("null cannot be cast to non-null type com.bamtech.sdk4.internal.media.ExoCachedMedia");
    }
}
