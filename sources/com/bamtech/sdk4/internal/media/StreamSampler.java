package com.bamtech.sdk4.internal.media;

import com.bamtech.sdk4.media.MediaItem;
import com.bamtech.sdk4.media.PlaybackEndCause;
import com.bamtech.sdk4.media.PlaybackError;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0010H&J\b\u0010\u0012\u001a\u00020\u0010H&J\u001c\u0010\u0013\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H&J\b\u0010\u0018\u001a\u00020\u0010H&R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R(\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\tX¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/StreamSampler;", "", "mediaItem", "Lcom/bamtech/sdk4/media/MediaItem;", "getMediaItem", "()Lcom/bamtech/sdk4/media/MediaItem;", "setMediaItem", "(Lcom/bamtech/sdk4/media/MediaItem;)V", "serverData", "", "", "getServerData", "()Ljava/util/Map;", "setServerData", "(Ljava/util/Map;)V", "cleanup", "", "collectPeriodicStreamSample", "collectStreamSample", "release", "endCause", "Lcom/bamtech/sdk4/media/PlaybackEndCause;", "error", "Lcom/bamtech/sdk4/media/PlaybackError;", "stopCollectingStreamSample", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: StreamSampler.kt */
public interface StreamSampler {
    void cleanup();

    void collectPeriodicStreamSample();

    void collectStreamSample();

    void release(PlaybackEndCause playbackEndCause, PlaybackError playbackError);

    void setMediaItem(MediaItem mediaItem);

    void setServerData(Map<String, ? extends Object> map);
}
