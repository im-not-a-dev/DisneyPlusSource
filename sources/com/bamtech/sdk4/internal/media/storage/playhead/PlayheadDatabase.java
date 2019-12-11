package com.bamtech.sdk4.internal.media.storage.playhead;

import androidx.room.RoomDatabase;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H&¨\u0006\u0006"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/storage/playhead/PlayheadDatabase;", "Landroidx/room/RoomDatabase;", "()V", "playheadDao", "Lcom/bamtech/sdk4/internal/media/storage/playhead/PlayheadDao;", "Companion", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: PlayheadStorage.kt */
public abstract class PlayheadDatabase extends RoomDatabase {

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/storage/playhead/PlayheadDatabase$Companion;", "", "()V", "DB_NAME", "", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: PlayheadStorage.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new Companion(null);
    }

    public abstract PlayheadDao playheadDao();
}
