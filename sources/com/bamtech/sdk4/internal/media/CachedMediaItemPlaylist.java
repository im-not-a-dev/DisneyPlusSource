package com.bamtech.sdk4.internal.media;

import com.bamtech.sdk4.internal.configuration.PlaylistType;
import com.bamtech.sdk4.media.MediaAnalyticsKey;
import com.bamtech.sdk4.media.MediaItemPlaylist;
import com.bamtech.sdk4.media.MediaItemPlaylist.DefaultImpls;
import com.bamtech.sdk4.media.MediaPlayhead;
import com.bamtech.sdk4.media.exoplayer.OfflineLicenseProvider;
import com.bamtech.sdk4.media.exoplayer.RenditionKeyProvider;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.upstream.cache.Cache;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\"\b\u0002\u0010\n\u001a\u001c\u0012\u0004\u0012\u00020\u0007\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b0\u000b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000e\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u000e\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u000e\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\u0002\u0010\u001bR\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0012\u001a\u00020\u0011X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0014\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020(X\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010!R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u001c\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010!R.\u0010\n\u001a\u001c\u0012\u0004\u0012\u00020\u0007\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b0\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u001c\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010!¨\u00062"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/CachedMediaItemPlaylist;", "Lcom/bamtech/sdk4/media/MediaItemPlaylist;", "Lcom/bamtech/sdk4/media/exoplayer/RenditionKeyProvider;", "Lcom/bamtech/sdk4/media/exoplayer/OfflineLicenseProvider;", "cache", "Lcom/google/android/exoplayer2/upstream/cache/Cache;", "streamUri", "", "playhead", "Lcom/bamtech/sdk4/media/MediaPlayhead;", "tracking", "", "", "renditionKeys", "", "Lcom/google/android/exoplayer2/offline/StreamKey;", "license", "", "audioLicense", "variants", "Lcom/bamtech/sdk4/internal/media/HlsPlaylistVariant;", "audioRenditions", "Lcom/bamtech/sdk4/media/AudioRendition;", "subtitleRenditions", "Lcom/bamtech/sdk4/media/SubtitleRendition;", "attributes", "Lcom/bamtech/sdk4/internal/media/HlsPlaylistAttributes;", "(Lcom/google/android/exoplayer2/upstream/cache/Cache;Ljava/lang/String;Lcom/bamtech/sdk4/media/MediaPlayhead;Ljava/util/Map;Ljava/util/List;[B[BLjava/util/List;Ljava/util/List;Ljava/util/List;Lcom/bamtech/sdk4/internal/media/HlsPlaylistAttributes;)V", "getAttributes", "()Lcom/bamtech/sdk4/internal/media/HlsPlaylistAttributes;", "getAudioLicense", "()[B", "getAudioRenditions", "()Ljava/util/List;", "getCache", "()Lcom/google/android/exoplayer2/upstream/cache/Cache;", "getLicense", "getPlayhead", "()Lcom/bamtech/sdk4/media/MediaPlayhead;", "playlistType", "Lcom/bamtech/sdk4/internal/configuration/PlaylistType;", "getPlaylistType", "()Lcom/bamtech/sdk4/internal/configuration/PlaylistType;", "getRenditionKeys", "getStreamUri", "()Ljava/lang/String;", "getSubtitleRenditions", "getTracking", "()Ljava/util/Map;", "getVariants", "extension-media-exoplayer_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: CachedMediaItemPlaylist.kt */
public final class CachedMediaItemPlaylist implements MediaItemPlaylist, RenditionKeyProvider, OfflineLicenseProvider {
    private final byte[] audioLicense;
    private final Cache cache;
    private final byte[] license;
    private final PlaylistType playlistType = PlaylistType.OFFLINE;
    private final List<StreamKey> renditionKeys;
    private final String streamUri;
    private final Map<String, Map<String, Object>> tracking;

    public CachedMediaItemPlaylist(Cache cache2, String str, MediaPlayhead mediaPlayhead, Map<String, ? extends Map<String, ? extends Object>> map, List<StreamKey> list, byte[] bArr, byte[] bArr2, List<HlsPlaylistVariant> list2, List<Object> list3, List<Object> list4, HlsPlaylistAttributes hlsPlaylistAttributes) {
        this.cache = cache2;
        this.streamUri = str;
        this.tracking = map;
        this.renditionKeys = list;
        this.license = bArr;
        this.audioLicense = bArr2;
    }

    public byte[] getAudioLicense() {
        return this.audioLicense;
    }

    public final Cache getCache() {
        return this.cache;
    }

    public byte[] getLicense() {
        return this.license;
    }

    public PlaylistType getPlaylistType() {
        return this.playlistType;
    }

    public List<StreamKey> getRenditionKeys() {
        return this.renditionKeys;
    }

    public String getStreamUri() {
        return this.streamUri;
    }

    public Map<String, Map<String, Object>> getTracking() {
        return this.tracking;
    }

    public Map<String, Object> getTrackingData(MediaAnalyticsKey mediaAnalyticsKey) {
        return DefaultImpls.getTrackingData(this, mediaAnalyticsKey);
    }
}
