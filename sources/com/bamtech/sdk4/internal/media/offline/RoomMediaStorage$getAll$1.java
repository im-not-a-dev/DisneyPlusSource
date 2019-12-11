package com.bamtech.sdk4.internal.media.offline;

import com.bamtech.sdk4.internal.media.ExoCachedMedia;
import com.bamtech.sdk4.internal.media.offline.p047db.CachedMediaEntry;
import com.bamtech.sdk4.internal.media.offline.p047db.CachedMediaEntryKt;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo31007d2 = {"<anonymous>", "", "Lcom/bamtech/sdk4/internal/media/ExoCachedMedia;", "call"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: RoomMediaStorage.kt */
final class RoomMediaStorage$getAll$1<V> implements Callable<T> {
    final /* synthetic */ RoomMediaStorage this$0;

    RoomMediaStorage$getAll$1(RoomMediaStorage roomMediaStorage) {
        this.this$0 = roomMediaStorage;
    }

    public final List<ExoCachedMedia> call() {
        List<CachedMediaEntry> all = this.this$0.f6074db.cachedMediaDao().getAll();
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) all, 10));
        for (CachedMediaEntry cachedMedia : all) {
            arrayList.add(CachedMediaEntryKt.toCachedMedia(cachedMedia));
        }
        return arrayList;
    }
}
