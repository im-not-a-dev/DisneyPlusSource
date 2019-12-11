package com.bamtech.sdk4.internal.media.storage.playhead;

import android.content.Context;
import androidx.room.C0934f;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007¨\u0006\n"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/storage/playhead/PlayheadRepositoryModule;", "", "()V", "playheadDao", "Lcom/bamtech/sdk4/internal/media/storage/playhead/PlayheadDao;", "db", "Lcom/bamtech/sdk4/internal/media/storage/playhead/PlayheadDatabase;", "playheadDatabase", "context", "Landroid/content/Context;", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: PlayheadRepositoryModule.kt */
public final class PlayheadRepositoryModule {
    static {
        new PlayheadRepositoryModule();
    }

    private PlayheadRepositoryModule() {
    }

    public static final PlayheadDao playheadDao(PlayheadDatabase playheadDatabase) {
        if (playheadDatabase != null) {
            return playheadDatabase.playheadDao();
        }
        return null;
    }

    public static final PlayheadDatabase playheadDatabase(Context context) {
        if (context != null) {
            return (PlayheadDatabase) C0934f.m5137a(context, PlayheadDatabase.class, "db_offline_playheads").mo5229b();
        }
        return null;
    }
}
