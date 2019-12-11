package com.bamtech.sdk4.internal.media;

import com.bamtech.sdk4.media.PlaybackSession;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0004J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0005"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/PlaybackSessionSubcomponent;", "", "session", "Lcom/bamtech/sdk4/media/PlaybackSession;", "Builder", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: PlaybackSessionSubcomponent.kt */
public interface PlaybackSessionSubcomponent {

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/PlaybackSessionSubcomponent$Builder;", "", "build", "Lcom/bamtech/sdk4/internal/media/PlaybackSessionSubcomponent;", "module", "Lcom/bamtech/sdk4/internal/media/PlaybackSessionModule;", "sdk-core-api_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: PlaybackSessionSubcomponent.kt */
    public interface Builder {
        PlaybackSessionSubcomponent build();

        Builder module(PlaybackSessionModule playbackSessionModule);
    }

    PlaybackSession session();
}
