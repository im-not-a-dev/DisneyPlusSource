package com.bamtech.sdk4.media;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H&J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u0007H&J\u001e\u0010\r\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0012"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/PlaybackSession;", "", "currentMediaItem", "Lcom/bamtech/sdk4/media/MediaItem;", "getCurrentMediaItem", "()Lcom/bamtech/sdk4/media/MediaItem;", "collectStreamSample", "", "prepare", "Lcom/bamtech/sdk4/media/MediaItemPlaylist;", "mediaItem", "playlistType", "Lcom/bamtech/sdk4/internal/configuration/PlaylistType;", "release", "playbackEndCause", "Lcom/bamtech/sdk4/media/PlaybackEndCause;", "error", "Lcom/bamtech/sdk4/media/PlaybackError;", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: PlaybackSession.kt */
public interface PlaybackSession {
    void collectStreamSample();

    MediaItemPlaylist prepare(MediaItem mediaItem);

    void release(PlaybackEndCause playbackEndCause, PlaybackError playbackError);
}
