package com.bamtech.sdk4.internal.media;

import com.bamtech.sdk4.MediaThumbnailLinks;
import com.bamtech.sdk4.internal.configuration.PlaylistType;
import com.bamtech.sdk4.internal.media.offline.OfflineMediaItem;
import com.bamtech.sdk4.media.MediaAnalyticsKey;
import com.bamtech.sdk4.media.MediaDescriptor;
import com.bamtech.sdk4.media.MediaItemPlaylist;
import com.bamtech.sdk4.media.MediaPlayhead;
import com.bamtech.sdk4.media.PlaybackContext;
import com.bamtech.sdk4.media.exoplayer.OfflineLicenseProvider;
import com.bamtech.sdk4.media.exoplayer.RenditionKeyProvider;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.upstream.cache.Cache;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.C12907r;
import kotlin.Metadata;
import net.danlew.android.joda.DateUtils;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B»\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\u0002\u0010\u001dJ\u001e\u0010C\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r2\u0006\u0010D\u001a\u00020EH\u0016J\u0010\u0010F\u001a\u00020+2\u0006\u0010G\u001a\u00020'H\u0016R\"\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0016\u001a\u00020\u0015X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0012X\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010%R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u0014\u0010*\u001a\u00020+X\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0014\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010!R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0014\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u001c\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0012X\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010%R\u0016\u00106\u001a\u0004\u0018\u000107X\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010%R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020<0\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b=\u0010%R\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010\u001fR\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R.\u0010A\u001a\u001c\u0012\u0004\u0012\u00020\t\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r0\r8BX\u0004¢\u0006\u0006\u001a\u0004\bB\u0010\u001f¨\u0006H"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/CachedMediaItem;", "Lcom/bamtech/sdk4/internal/media/offline/OfflineMediaItem;", "Lcom/bamtech/sdk4/media/exoplayer/RenditionKeyProvider;", "Lcom/bamtech/sdk4/media/exoplayer/OfflineLicenseProvider;", "descriptor", "Lcom/bamtech/sdk4/media/MediaDescriptor;", "cache", "Lcom/google/android/exoplayer2/upstream/cache/Cache;", "mediaCacheUrl", "", "playhead", "Lcom/bamtech/sdk4/media/MediaPlayhead;", "telemetry", "", "", "adEngine", "conviva", "renditionKeys", "", "Lcom/google/android/exoplayer2/offline/StreamKey;", "license", "", "audioLicense", "playlistVariants", "Lcom/bamtech/sdk4/internal/media/HlsPlaylistVariant;", "thumbnails", "Lcom/bamtech/sdk4/MediaThumbnailLinks;", "playbackContext", "Lcom/bamtech/sdk4/media/PlaybackContext;", "(Lcom/bamtech/sdk4/media/MediaDescriptor;Lcom/google/android/exoplayer2/upstream/cache/Cache;Ljava/lang/String;Lcom/bamtech/sdk4/media/MediaPlayhead;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;[B[BLjava/util/List;Lcom/bamtech/sdk4/MediaThumbnailLinks;Lcom/bamtech/sdk4/media/PlaybackContext;)V", "getAdEngine", "()Ljava/util/Map;", "getAudioLicense", "()[B", "audioRenditions", "Lcom/bamtech/sdk4/media/AudioRendition;", "getAudioRenditions", "()Ljava/util/List;", "availablePlaylistTypes", "Lcom/bamtech/sdk4/internal/configuration/PlaylistType;", "getAvailablePlaylistTypes", "getConviva", "defaultPlaylist", "Lcom/bamtech/sdk4/media/MediaItemPlaylist;", "getDefaultPlaylist", "()Lcom/bamtech/sdk4/media/MediaItemPlaylist;", "getDescriptor", "()Lcom/bamtech/sdk4/media/MediaDescriptor;", "getLicense", "getPlaybackContext", "()Lcom/bamtech/sdk4/media/PlaybackContext;", "getPlayhead", "()Lcom/bamtech/sdk4/media/MediaPlayhead;", "getPlaylistVariants", "preferredDrmScheme", "Ljava/util/UUID;", "getPreferredDrmScheme", "()Ljava/util/UUID;", "getRenditionKeys", "subtitleRenditions", "Lcom/bamtech/sdk4/media/SubtitleRendition;", "getSubtitleRenditions", "getTelemetry", "getThumbnails", "()Lcom/bamtech/sdk4/MediaThumbnailLinks;", "tracking", "getTracking", "getTrackingData", "key", "Lcom/bamtech/sdk4/media/MediaAnalyticsKey;", "tryGetPreferredPlaylist", "playlistType", "extension-media-exoplayer_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: CachedMediaItem.kt */
public final class CachedMediaItem implements OfflineMediaItem, RenditionKeyProvider, OfflineLicenseProvider {
    private final Map<String, Object> adEngine;
    private final byte[] audioLicense;
    private final List<PlaylistType> availablePlaylistTypes;
    private final Cache cache;
    private final Map<String, Object> conviva;
    private final MediaItemPlaylist defaultPlaylist;
    private final MediaDescriptor descriptor;
    private final byte[] license;
    private final String mediaCacheUrl;
    private final PlaybackContext playbackContext;
    private final MediaPlayhead playhead;
    private final List<HlsPlaylistVariant> playlistVariants;
    private final UUID preferredDrmScheme;
    private final List<StreamKey> renditionKeys;
    private final Map<String, Object> telemetry;
    private final MediaThumbnailLinks thumbnails;

    public CachedMediaItem(MediaDescriptor mediaDescriptor, Cache cache2, String str, MediaPlayhead mediaPlayhead, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Map<String, ? extends Object> map3, List<StreamKey> list, byte[] bArr, byte[] bArr2, List<HlsPlaylistVariant> list2, MediaThumbnailLinks mediaThumbnailLinks, PlaybackContext playbackContext2) {
        this.descriptor = mediaDescriptor;
        this.cache = cache2;
        this.mediaCacheUrl = str;
        this.playhead = mediaPlayhead;
        this.telemetry = map;
        this.adEngine = map2;
        this.conviva = map3;
        this.renditionKeys = list;
        this.license = bArr;
        this.audioLicense = bArr2;
        this.playlistVariants = list2;
        this.thumbnails = mediaThumbnailLinks;
        this.playbackContext = playbackContext2;
        this.defaultPlaylist = tryGetPreferredPlaylist(PlaylistType.OFFLINE);
        this.availablePlaylistTypes = C13183n.m40498a(PlaylistType.OFFLINE);
    }

    private final Map<String, Map<String, Object>> getTracking() {
        return C13173j0.m40356a(C12907r.m40244a(MediaAnalyticsKey.TELEMETRY.getValue(), getTelemetry()), C12907r.m40244a(MediaAnalyticsKey.AD_ENGINE.getValue(), getAdEngine()), C12907r.m40244a(MediaAnalyticsKey.CONVIVA.getValue(), getConviva()));
    }

    public Map<String, Object> getAdEngine() {
        return this.adEngine;
    }

    public byte[] getAudioLicense() {
        return this.audioLicense;
    }

    public List<Object> getAudioRenditions() {
        return C13185o.m40513a();
    }

    public List<PlaylistType> getAvailablePlaylistTypes() {
        return this.availablePlaylistTypes;
    }

    public Map<String, Object> getConviva() {
        return this.conviva;
    }

    public MediaItemPlaylist getDefaultPlaylist() {
        return this.defaultPlaylist;
    }

    public MediaDescriptor getDescriptor() {
        return this.descriptor;
    }

    public byte[] getLicense() {
        return this.license;
    }

    public PlaybackContext getPlaybackContext() {
        return this.playbackContext;
    }

    public MediaPlayhead getPlayhead() {
        return this.playhead;
    }

    public List<HlsPlaylistVariant> getPlaylistVariants() {
        return this.playlistVariants;
    }

    public UUID getPreferredDrmScheme() {
        return this.preferredDrmScheme;
    }

    public List<StreamKey> getRenditionKeys() {
        return this.renditionKeys;
    }

    public List<Object> getSubtitleRenditions() {
        return C13185o.m40513a();
    }

    public Map<String, Object> getTelemetry() {
        return this.telemetry;
    }

    public MediaThumbnailLinks getThumbnails() {
        return this.thumbnails;
    }

    public Map<String, Object> getTrackingData(MediaAnalyticsKey mediaAnalyticsKey) {
        Map<String, Object> map = (Map) getTracking().get(mediaAnalyticsKey.getValue());
        return map != null ? map : C13173j0.m40350a();
    }

    public MediaItemPlaylist tryGetPreferredPlaylist(PlaylistType playlistType) {
        CachedMediaItemPlaylist cachedMediaItemPlaylist = new CachedMediaItemPlaylist(this.cache, this.mediaCacheUrl, getPlayhead(), getTracking(), getRenditionKeys(), getLicense(), getAudioLicense(), null, getAudioRenditions(), getSubtitleRenditions(), null);
        return cachedMediaItemPlaylist;
    }

    public /* synthetic */ CachedMediaItem(MediaDescriptor mediaDescriptor, Cache cache2, String str, MediaPlayhead mediaPlayhead, Map map, Map map2, Map map3, List list, byte[] bArr, byte[] bArr2, List list2, MediaThumbnailLinks mediaThumbnailLinks, PlaybackContext playbackContext2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        MediaPlayhead mediaPlayhead2;
        int i2 = i;
        if ((i2 & 8) != 0) {
            MediaPlayhead mediaPlayhead3 = new MediaPlayhead(0.0d, null, null, null, 15, null);
            mediaPlayhead2 = mediaPlayhead3;
        } else {
            mediaPlayhead2 = mediaPlayhead;
        }
        this(mediaDescriptor, cache2, str, mediaPlayhead2, (i2 & 16) != 0 ? C13173j0.m40350a() : map, (i2 & 32) != 0 ? C13173j0.m40350a() : map2, (i2 & 64) != 0 ? C13173j0.m40350a() : map3, (i2 & 128) != 0 ? C13185o.m40513a() : list, (i2 & 256) != 0 ? new byte[0] : bArr, (i2 & DateUtils.FORMAT_NO_NOON) != 0 ? new byte[0] : bArr2, list2, (i2 & DateUtils.FORMAT_NO_MIDNIGHT) != 0 ? null : mediaThumbnailLinks, (i2 & 4096) != 0 ? null : playbackContext2);
    }
}
