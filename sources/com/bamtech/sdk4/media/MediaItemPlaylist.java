package com.bamtech.sdk4.media;

import com.bamtech.sdk4.internal.configuration.PlaylistType;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001b2\u0006\u0010\"\u001a\u00020#H\u0016R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\nR,\u0010\u001a\u001a\u001c\u0012\u0004\u0012\u00020\u0014\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001b0\u001bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\n¨\u0006$"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/MediaItemPlaylist;", "", "attributes", "Lcom/bamtech/sdk4/internal/media/HlsPlaylistAttributes;", "getAttributes", "()Lcom/bamtech/sdk4/internal/media/HlsPlaylistAttributes;", "audioRenditions", "", "Lcom/bamtech/sdk4/media/AudioRendition;", "getAudioRenditions", "()Ljava/util/List;", "playhead", "Lcom/bamtech/sdk4/media/MediaPlayhead;", "getPlayhead", "()Lcom/bamtech/sdk4/media/MediaPlayhead;", "playlistType", "Lcom/bamtech/sdk4/internal/configuration/PlaylistType;", "getPlaylistType", "()Lcom/bamtech/sdk4/internal/configuration/PlaylistType;", "streamUri", "", "getStreamUri", "()Ljava/lang/String;", "subtitleRenditions", "Lcom/bamtech/sdk4/media/SubtitleRendition;", "getSubtitleRenditions", "tracking", "", "getTracking", "()Ljava/util/Map;", "variants", "Lcom/bamtech/sdk4/internal/media/HlsPlaylistVariant;", "getVariants", "getTrackingData", "key", "Lcom/bamtech/sdk4/media/MediaAnalyticsKey;", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: MediaItem.kt */
public interface MediaItemPlaylist {

    @Metadata(mo31005bv = {1, 0, 3}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* compiled from: MediaItem.kt */
    public static final class DefaultImpls {
        public static Map<String, Object> getTrackingData(MediaItemPlaylist mediaItemPlaylist, MediaAnalyticsKey mediaAnalyticsKey) {
            Map<String, Object> map = (Map) mediaItemPlaylist.getTracking().get(mediaAnalyticsKey.getValue());
            return map != null ? map : C13173j0.m40350a();
        }
    }

    PlaylistType getPlaylistType();

    String getStreamUri();

    Map<String, Map<String, Object>> getTracking();

    Map<String, Object> getTrackingData(MediaAnalyticsKey mediaAnalyticsKey);
}
