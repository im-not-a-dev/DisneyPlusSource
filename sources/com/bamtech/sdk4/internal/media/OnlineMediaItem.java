package com.bamtech.sdk4.internal.media;

import com.bamtech.sdk4.MediaThumbnailLinks;
import com.bamtech.sdk4.internal.configuration.PlaylistType;
import com.bamtech.sdk4.media.MediaAnalyticsKey;
import com.bamtech.sdk4.media.MediaDescriptor;
import com.bamtech.sdk4.media.MediaItem;
import com.bamtech.sdk4.media.MediaItem.PlaylistNotFound;
import com.bamtech.sdk4.media.MediaItemPlaylist;
import com.bamtech.sdk4.media.MediaPlayhead;
import com.bamtech.sdk4.media.PlaybackContext;
import com.bamtech.sdk4.service.NotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;
import kotlin.C12898l;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0001\b\u0016\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012 \b\u0002\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00060\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010\u0017B3\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u001a\u001a\u00020\r\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010\u001dJ\u000e\u0010=\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\u0019J\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006J\u001e\u0010@\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010A\u001a\u00020BH\u0016J\u0006\u0010C\u001a\u00020DJ\b\u0010E\u001a\u00020\u0003H\u0016J\u0010\u0010F\u001a\u00020(2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u00118VX\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\r0\u00118VX\u0004¢\u0006\u0006\u001a\u0004\b&\u0010$R\u0014\u0010'\u001a\u00020(8VX\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u000e\u0010\u001a\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0014\u0010\b\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u001c\u00105\u001a\n\u0012\u0004\u0012\u000206\u0018\u00010\u00118VX\u0004¢\u0006\u0006\u001a\u0004\b7\u0010$R\u0016\u00108\u001a\u0004\u0018\u00010\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R.\u0010\u0005\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060\u00068@X\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006G"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/OnlineMediaItem;", "Lcom/bamtech/sdk4/media/MediaItem;", "complete", "", "slide", "tracking", "", "", "playhead", "Lcom/bamtech/sdk4/media/MediaPlayhead;", "descriptor", "Lcom/bamtech/sdk4/media/MediaDescriptor;", "playlistType", "Lcom/bamtech/sdk4/internal/configuration/PlaylistType;", "attributes", "Lcom/bamtech/sdk4/internal/media/HlsPlaylistAttributes;", "variants", "", "Lcom/bamtech/sdk4/internal/media/HlsPlaylistVariant;", "mediaThumbnailLinks", "Lcom/bamtech/sdk4/MediaThumbnailLinks;", "playbackContext", "Lcom/bamtech/sdk4/media/PlaybackContext;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/bamtech/sdk4/media/MediaPlayhead;Lcom/bamtech/sdk4/media/MediaDescriptor;Lcom/bamtech/sdk4/internal/configuration/PlaylistType;Lcom/bamtech/sdk4/internal/media/HlsPlaylistAttributes;Ljava/util/List;Lcom/bamtech/sdk4/MediaThumbnailLinks;Lcom/bamtech/sdk4/media/PlaybackContext;)V", "stream", "Lcom/bamtech/sdk4/internal/media/Stream;", "defaultPlaylistType", "preferredDrmScheme", "Ljava/util/UUID;", "(Lcom/bamtech/sdk4/internal/media/Stream;Lcom/bamtech/sdk4/media/MediaDescriptor;Lcom/bamtech/sdk4/internal/configuration/PlaylistType;Ljava/util/UUID;Lcom/bamtech/sdk4/media/PlaybackContext;)V", "adPartner", "getAdPartner", "()Ljava/lang/String;", "audioRenditions", "Lcom/bamtech/sdk4/media/AudioRendition;", "getAudioRenditions", "()Ljava/util/List;", "availablePlaylistTypes", "getAvailablePlaylistTypes", "defaultPlaylist", "Lcom/bamtech/sdk4/media/MediaItemPlaylist;", "getDefaultPlaylist", "()Lcom/bamtech/sdk4/media/MediaItemPlaylist;", "getDescriptor", "()Lcom/bamtech/sdk4/media/MediaDescriptor;", "getPlaybackContext", "()Lcom/bamtech/sdk4/media/PlaybackContext;", "getPlayhead", "()Lcom/bamtech/sdk4/media/MediaPlayhead;", "getPreferredDrmScheme", "()Ljava/util/UUID;", "getStream", "()Lcom/bamtech/sdk4/internal/media/Stream;", "subtitleRenditions", "Lcom/bamtech/sdk4/media/SubtitleRendition;", "getSubtitleRenditions", "thumbnails", "getThumbnails", "()Lcom/bamtech/sdk4/MediaThumbnailLinks;", "getTracking$extension_media_release", "()Ljava/util/Map;", "copy", "newerStream", "getAdEngineData", "getTrackingData", "key", "Lcom/bamtech/sdk4/media/MediaAnalyticsKey;", "isAdEngine", "", "toString", "tryGetPreferredPlaylist", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: OnlineMediaItem.kt */
public final class OnlineMediaItem implements MediaItem {
    private final PlaylistType defaultPlaylistType;
    private final MediaDescriptor descriptor;
    private final PlaybackContext playbackContext;
    private final UUID preferredDrmScheme;
    private final Stream stream;

    @Metadata(mo31005bv = {1, 0, 3}, mo31008k = 3, mo31009mv = {1, 1, 15})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[PlaylistType.values().length];

        static {
            $EnumSwitchMapping$0[PlaylistType.SLIDE.ordinal()] = 1;
            $EnumSwitchMapping$0[PlaylistType.COMPLETE.ordinal()] = 2;
            $EnumSwitchMapping$0[PlaylistType.OFFLINE.ordinal()] = 3;
        }
    }

    public OnlineMediaItem(Stream stream2, MediaDescriptor mediaDescriptor, PlaylistType playlistType, UUID uuid, PlaybackContext playbackContext2) {
        this.stream = stream2;
        this.descriptor = mediaDescriptor;
        this.defaultPlaylistType = playlistType;
        this.preferredDrmScheme = uuid;
        this.playbackContext = playbackContext2;
    }

    public final OnlineMediaItem copy(Stream stream2) {
        OnlineMediaItem onlineMediaItem = new OnlineMediaItem(stream2, getDescriptor(), this.defaultPlaylistType, getPreferredDrmScheme(), getPlaybackContext());
        return onlineMediaItem;
    }

    public final Map<String, String> getAdEngineData() {
        Pair pair;
        Map trackingData = getTrackingData(MediaAnalyticsKey.AD_ENGINE);
        ArrayList arrayList = new ArrayList(trackingData.size());
        for (Entry entry : trackingData.entrySet()) {
            if (C12880j.m40224a((Object) "fguid", (Object) (String) entry.getKey())) {
                pair = new Pair("ssess", String.valueOf(entry.getValue()));
            } else {
                pair = new Pair(entry.getKey(), String.valueOf(entry.getValue()));
            }
            arrayList.add(pair);
        }
        return C13173j0.m40351a((Iterable) arrayList);
    }

    public final String getAdPartner() {
        HlsPlaylistAttributes attributes = this.stream.getHlsPlaylists().getAttributes();
        if (attributes != null) {
            return attributes.getAdPartner();
        }
        return null;
    }

    public List<PlaylistType> getAvailablePlaylistTypes() {
        String slide = this.stream.getHlsPlaylists().getSlide();
        String complete = this.stream.getHlsPlaylists().getComplete();
        ArrayList arrayList = new ArrayList();
        if (slide != null) {
            arrayList.add(PlaylistType.SLIDE);
        }
        if (complete != null) {
            arrayList.add(PlaylistType.COMPLETE);
        }
        return arrayList;
    }

    public MediaItemPlaylist getDefaultPlaylist() throws NotFoundException {
        return tryGetPreferredPlaylist(this.defaultPlaylistType);
    }

    public MediaDescriptor getDescriptor() {
        return this.descriptor;
    }

    public PlaybackContext getPlaybackContext() {
        return this.playbackContext;
    }

    public MediaPlayhead getPlayhead() {
        return this.stream.getPlayhead();
    }

    public UUID getPreferredDrmScheme() {
        return this.preferredDrmScheme;
    }

    public final Stream getStream() {
        return this.stream;
    }

    public MediaThumbnailLinks getThumbnails() {
        return this.stream.getThumbnails();
    }

    public final Map<String, Map<String, Object>> getTracking$extension_media_release() {
        return this.stream.getTracking();
    }

    public Map<String, Object> getTrackingData(MediaAnalyticsKey mediaAnalyticsKey) {
        Map<String, Object> map = (Map) this.stream.getTracking().get(mediaAnalyticsKey.getValue());
        return map != null ? map : C13173j0.m40350a();
    }

    public final boolean isAdEngine() {
        return C12832w.m40122b("adEngine", getAdPartner(), true);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OnlineMediaItem(stream=");
        sb.append(this.stream);
        sb.append(", descriptor=");
        sb.append(getDescriptor());
        sb.append(", defaultPlaylistType=");
        sb.append(this.defaultPlaylistType);
        sb.append(')');
        return sb.toString();
    }

    public MediaItemPlaylist tryGetPreferredPlaylist(PlaylistType playlistType) throws NotFoundException {
        OnlineMediaItemPlaylist onlineMediaItemPlaylist;
        String slide = this.stream.getHlsPlaylists().getSlide();
        String complete = this.stream.getHlsPlaylists().getComplete();
        PlaylistNotFound playlistNotFound = new PlaylistNotFound("Missing slide and complete playlists");
        MediaPlayhead playhead = this.stream.getPlayhead();
        HlsPlaylistAttributes attributes = this.stream.getHlsPlaylists().getAttributes();
        int i = WhenMappings.$EnumSwitchMapping$0[playlistType.ordinal()];
        String str = "UUID.randomUUID()";
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new C12898l();
                }
                throw new IllegalArgumentException("PlaylistType.OFFLINE is not supported for online media items");
            } else if (complete != null) {
                PlaylistType playlistType2 = PlaylistType.COMPLETE;
                Map tracking$extension_media_release = getTracking$extension_media_release();
                List variants = this.stream.getHlsPlaylists().getVariants();
                Renditions renditions = this.stream.getHlsPlaylists().getRenditions();
                List audio = renditions != null ? renditions.getAudio() : null;
                Renditions renditions2 = this.stream.getHlsPlaylists().getRenditions();
                onlineMediaItemPlaylist = new OnlineMediaItemPlaylist(complete, playlistType2, playhead, tracking$extension_media_release, variants, audio, renditions2 != null ? renditions2.getSubtitles() : null, attributes);
            } else if (slide != null) {
                PlaylistType playlistType3 = PlaylistType.SLIDE;
                Map tracking$extension_media_release2 = getTracking$extension_media_release();
                List variants2 = this.stream.getHlsPlaylists().getVariants();
                Renditions renditions3 = this.stream.getHlsPlaylists().getRenditions();
                List audio2 = renditions3 != null ? renditions3.getAudio() : null;
                Renditions renditions4 = this.stream.getHlsPlaylists().getRenditions();
                onlineMediaItemPlaylist = new OnlineMediaItemPlaylist(slide, playlistType3, playhead, tracking$extension_media_release2, variants2, audio2, renditions4 != null ? renditions4.getSubtitles() : null, attributes);
            } else {
                UUID randomUUID = UUID.randomUUID();
                C12880j.m40222a((Object) randomUUID, str);
                NotFoundException notFoundException = new NotFoundException(randomUUID, C13183n.m40498a(playlistNotFound), null, 4, null);
                throw notFoundException;
            }
        } else if (slide != null) {
            PlaylistType playlistType4 = PlaylistType.SLIDE;
            Map tracking$extension_media_release3 = getTracking$extension_media_release();
            List variants3 = this.stream.getHlsPlaylists().getVariants();
            Renditions renditions5 = this.stream.getHlsPlaylists().getRenditions();
            List audio3 = renditions5 != null ? renditions5.getAudio() : null;
            Renditions renditions6 = this.stream.getHlsPlaylists().getRenditions();
            onlineMediaItemPlaylist = new OnlineMediaItemPlaylist(slide, playlistType4, playhead, tracking$extension_media_release3, variants3, audio3, renditions6 != null ? renditions6.getSubtitles() : null, attributes);
        } else if (complete != null) {
            PlaylistType playlistType5 = PlaylistType.COMPLETE;
            Map tracking$extension_media_release4 = getTracking$extension_media_release();
            List variants4 = this.stream.getHlsPlaylists().getVariants();
            Renditions renditions7 = this.stream.getHlsPlaylists().getRenditions();
            List audio4 = renditions7 != null ? renditions7.getAudio() : null;
            Renditions renditions8 = this.stream.getHlsPlaylists().getRenditions();
            onlineMediaItemPlaylist = new OnlineMediaItemPlaylist(complete, playlistType5, playhead, tracking$extension_media_release4, variants4, audio4, renditions8 != null ? renditions8.getSubtitles() : null, attributes);
        } else {
            UUID randomUUID2 = UUID.randomUUID();
            C12880j.m40222a((Object) randomUUID2, str);
            NotFoundException notFoundException2 = new NotFoundException(randomUUID2, C13183n.m40498a(playlistNotFound), null, 4, null);
            throw notFoundException2;
        }
        return onlineMediaItemPlaylist;
    }
}
