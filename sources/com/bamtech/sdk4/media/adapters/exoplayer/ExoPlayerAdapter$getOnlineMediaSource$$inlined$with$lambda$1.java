package com.bamtech.sdk4.media.adapters.exoplayer;

import com.bamtech.sdk4.media.MediaItemPlaylist;
import com.google.android.exoplayer2.upstream.C9518u;
import com.google.android.exoplayer2.upstream.HttpDataSource.C9439d;
import java.io.IOException;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u0005H\u0016¨\u0006\n¸\u0006\u0000"}, mo31007d2 = {"com/bamtech/sdk4/media/adapters/exoplayer/ExoPlayerAdapter$getOnlineMediaSource$1$1", "Lcom/google/android/exoplayer2/upstream/DefaultLoadErrorHandlingPolicy;", "getBlacklistDurationMsFor", "", "dataType", "", "loadDurationMs", "exception", "Ljava/io/IOException;", "errorCount", "playeradapter-exoplayer-2.10.1_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ExoPlayerAdapter.kt */
public final class ExoPlayerAdapter$getOnlineMediaSource$$inlined$with$lambda$1 extends C9518u {
    ExoPlayerAdapter$getOnlineMediaSource$$inlined$with$lambda$1(int i, ExoPlayerAdapter exoPlayerAdapter, MediaItemPlaylist mediaItemPlaylist) {
        super(i);
    }

    public long getBlacklistDurationMsFor(int i, long j, IOException iOException, int i2) {
        C9439d dVar = (C9439d) (!(iOException instanceof C9439d) ? null : iOException);
        if (dVar == null || dVar.f21948U != 416) {
            return super.getBlacklistDurationMsFor(i, j, iOException, i2);
        }
        return 60000;
    }
}
