package com.bamtech.sdk4.internal.media;

import com.bamtech.sdk4.media.PlaybackSession;
import com.bamtech.sdk4.media.adapters.AbstractPlayerAdapter;
import com.bamtech.sdk4.media.adapters.PlayerAdapter;
import kotlin.TypeCastException;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0002\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/PlaybackSessionModule;", "", "playerAdapter", "Lcom/bamtech/sdk4/media/adapters/PlayerAdapter;", "(Lcom/bamtech/sdk4/media/adapters/PlayerAdapter;)V", "getPlayerAdapter$sdk_core_api_release", "()Lcom/bamtech/sdk4/media/adapters/PlayerAdapter;", "Lcom/bamtech/sdk4/media/adapters/AbstractPlayerAdapter;", "session", "Lcom/bamtech/sdk4/media/PlaybackSession;", "Lcom/bamtech/sdk4/internal/media/DefaultPlaybackSession;", "streamSampler", "Lcom/bamtech/sdk4/internal/media/StreamSampler;", "sampler", "Lcom/bamtech/sdk4/internal/media/DefaultStreamSampler;", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: PlaybackSessionSubcomponent.kt */
public final class PlaybackSessionModule {
    private final PlayerAdapter playerAdapter;

    public PlaybackSessionModule(PlayerAdapter playerAdapter2) {
        this.playerAdapter = playerAdapter2;
    }

    public final AbstractPlayerAdapter playerAdapter() {
        PlayerAdapter playerAdapter2 = this.playerAdapter;
        if (playerAdapter2 != null) {
            return (AbstractPlayerAdapter) playerAdapter2;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bamtech.sdk4.media.adapters.AbstractPlayerAdapter");
    }

    public final PlaybackSession session(DefaultPlaybackSession defaultPlaybackSession) {
        return defaultPlaybackSession;
    }

    public final StreamSampler streamSampler(DefaultStreamSampler defaultStreamSampler) {
        return defaultStreamSampler;
    }
}
