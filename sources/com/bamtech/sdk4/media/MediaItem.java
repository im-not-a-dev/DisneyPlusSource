package com.bamtech.sdk4.media;

import com.bamtech.sdk4.MediaThumbnailLinks;
import com.bamtech.sdk4.internal.configuration.PlaylistType;
import com.bamtech.sdk4.service.ErrorReason;
import com.bamtech.sdk4.service.NotFoundException;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 ,2\u00020\u0001:\u0002,-J\u001e\u0010%\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0006\u0012\u0004\u0018\u00010\u00010&2\u0006\u0010(\u001a\u00020)H&J\u0010\u0010*\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\bH&R\u001a\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u000b8fX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u001bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0006R\u0014\u0010!\u001a\u0004\u0018\u00010\"X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006."}, mo31007d2 = {"Lcom/bamtech/sdk4/media/MediaItem;", "", "audioRenditions", "", "Lcom/bamtech/sdk4/media/AudioRendition;", "getAudioRenditions", "()Ljava/util/List;", "availablePlaylistTypes", "Lcom/bamtech/sdk4/internal/configuration/PlaylistType;", "getAvailablePlaylistTypes", "defaultPlaylist", "Lcom/bamtech/sdk4/media/MediaItemPlaylist;", "getDefaultPlaylist", "()Lcom/bamtech/sdk4/media/MediaItemPlaylist;", "descriptor", "Lcom/bamtech/sdk4/media/MediaDescriptor;", "getDescriptor", "()Lcom/bamtech/sdk4/media/MediaDescriptor;", "playbackContext", "Lcom/bamtech/sdk4/media/PlaybackContext;", "getPlaybackContext", "()Lcom/bamtech/sdk4/media/PlaybackContext;", "playhead", "Lcom/bamtech/sdk4/media/MediaPlayhead;", "getPlayhead", "()Lcom/bamtech/sdk4/media/MediaPlayhead;", "preferredDrmScheme", "Ljava/util/UUID;", "getPreferredDrmScheme", "()Ljava/util/UUID;", "subtitleRenditions", "Lcom/bamtech/sdk4/media/SubtitleRendition;", "getSubtitleRenditions", "thumbnails", "Lcom/bamtech/sdk4/MediaThumbnailLinks;", "getThumbnails", "()Lcom/bamtech/sdk4/MediaThumbnailLinks;", "getTrackingData", "", "", "key", "Lcom/bamtech/sdk4/media/MediaAnalyticsKey;", "tryGetPreferredPlaylist", "playlistType", "Companion", "PlaylistNotFound", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: MediaItem.kt */
public interface MediaItem {

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/MediaItem$Companion;", "", "()V", "AD_ENGINE_KEY", "", "CONVIVA_KEY", "FGUID", "PRODUCT_TYPE_KEY", "PRODUCT_TYPE_LIVE_VALUE", "SSESS", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: MediaItem.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u0003XD¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0007\"\u0004\b\t\u0010\u0004¨\u0006\n"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/MediaItem$PlaylistNotFound;", "Lcom/bamtech/sdk4/service/ErrorReason;", "description", "", "(Ljava/lang/String;)V", "code", "getCode", "()Ljava/lang/String;", "getDescription", "setDescription", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: MediaItem.kt */
    public static final class PlaylistNotFound implements ErrorReason {
        private final String code = "playlist.not-found";
        private String description;

        public PlaylistNotFound(String str) {
            this.description = str;
        }

        public String getCode() {
            return this.code;
        }

        public String getDescription() {
            return this.description;
        }
    }

    static {
        Companion companion = Companion.$$INSTANCE;
    }

    List<PlaylistType> getAvailablePlaylistTypes();

    MediaItemPlaylist getDefaultPlaylist() throws NotFoundException;

    MediaDescriptor getDescriptor();

    PlaybackContext getPlaybackContext();

    MediaPlayhead getPlayhead();

    UUID getPreferredDrmScheme();

    MediaThumbnailLinks getThumbnails();

    Map<String, Object> getTrackingData(MediaAnalyticsKey mediaAnalyticsKey);

    MediaItemPlaylist tryGetPreferredPlaylist(PlaylistType playlistType) throws NotFoundException;
}
