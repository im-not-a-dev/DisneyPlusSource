package com.bamtech.sdk4.internal.media.offline;

import com.bamtech.sdk4.internal.media.offline.p047db.DownloadSettingsEntryKt;
import com.bamtech.sdk4.media.offline.DownloadSettings;
import java.util.concurrent.Callable;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo31007d2 = {"<anonymous>", "Lcom/bamtech/sdk4/media/offline/DownloadSettings;", "call"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: RoomMediaStorage.kt */
final class RoomMediaStorage$getDownloadSettings$1<V> implements Callable<T> {
    final /* synthetic */ RoomMediaStorage this$0;

    RoomMediaStorage$getDownloadSettings$1(RoomMediaStorage roomMediaStorage) {
        this.this$0 = roomMediaStorage;
    }

    public final DownloadSettings call() {
        return DownloadSettingsEntryKt.fromEntry(this.this$0.f6074db.downloadSettingsDao().get());
    }
}
