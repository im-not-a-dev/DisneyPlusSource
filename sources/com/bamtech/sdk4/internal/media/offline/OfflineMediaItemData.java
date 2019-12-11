package com.bamtech.sdk4.internal.media.offline;

import com.bamtech.sdk4.MediaThumbnailLinks;
import com.bamtech.sdk4.internal.configuration.PlaylistType;
import com.bamtech.sdk4.internal.media.HlsPlaylistVariant;
import com.bamtech.sdk4.media.MediaAnalyticsKey;
import com.bamtech.sdk4.media.MediaDescriptor;
import com.bamtech.sdk4.media.MediaItemPlaylist;
import com.bamtech.sdk4.media.MediaPlayhead;
import com.bamtech.sdk4.media.PlaybackContext;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.C12907r;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013J\t\u00105\u001a\u00020\u0003HÂ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\t\u00107\u001a\u00020\u0006HÆ\u0003J\u0011\u00108\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u0017\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bHÆ\u0003J\u0017\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bHÆ\u0003J\u0017\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0001\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001J\u0013\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010\fHÖ\u0003J\u001e\u0010B\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b2\u0006\u0010C\u001a\u00020DH\u0016J\t\u0010E\u001a\u00020FHÖ\u0001J\t\u0010G\u001a\u00020\u0003HÖ\u0001J\u0010\u0010H\u001a\u00020\u001f2\u0006\u0010I\u001a\u00020\u001bH\u0016R\"\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000R\"\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0014\u0010\u001e\u001a\u00020\u001f8VX\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020'X\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0019R\u0016\u0010+\u001a\u0004\u0018\u00010,X\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u0002000\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u0019R\"\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u0015R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104¨\u0006J"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/OfflineMediaItemData;", "Lcom/bamtech/sdk4/internal/media/offline/OfflineMediaItem;", "mediaCacheUrl", "", "contentId", "descriptor", "Lcom/bamtech/sdk4/media/MediaDescriptor;", "playlistVariants", "", "Lcom/bamtech/sdk4/internal/media/HlsPlaylistVariant;", "telemetry", "", "", "adEngine", "conviva", "thumbnails", "Lcom/bamtech/sdk4/MediaThumbnailLinks;", "playbackContext", "Lcom/bamtech/sdk4/media/PlaybackContext;", "(Ljava/lang/String;Ljava/lang/String;Lcom/bamtech/sdk4/media/MediaDescriptor;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lcom/bamtech/sdk4/MediaThumbnailLinks;Lcom/bamtech/sdk4/media/PlaybackContext;)V", "getAdEngine", "()Ljava/util/Map;", "audioRenditions", "Lcom/bamtech/sdk4/media/AudioRendition;", "getAudioRenditions", "()Ljava/util/List;", "availablePlaylistTypes", "Lcom/bamtech/sdk4/internal/configuration/PlaylistType;", "getAvailablePlaylistTypes", "getConviva", "defaultPlaylist", "Lcom/bamtech/sdk4/media/MediaItemPlaylist;", "getDefaultPlaylist", "()Lcom/bamtech/sdk4/media/MediaItemPlaylist;", "getDescriptor", "()Lcom/bamtech/sdk4/media/MediaDescriptor;", "getPlaybackContext", "()Lcom/bamtech/sdk4/media/PlaybackContext;", "playhead", "Lcom/bamtech/sdk4/media/MediaPlayhead;", "getPlayhead", "()Lcom/bamtech/sdk4/media/MediaPlayhead;", "getPlaylistVariants", "preferredDrmScheme", "Ljava/util/UUID;", "getPreferredDrmScheme", "()Ljava/util/UUID;", "subtitleRenditions", "Lcom/bamtech/sdk4/media/SubtitleRendition;", "getSubtitleRenditions", "getTelemetry", "getThumbnails", "()Lcom/bamtech/sdk4/MediaThumbnailLinks;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "getTrackingData", "key", "Lcom/bamtech/sdk4/media/MediaAnalyticsKey;", "hashCode", "", "toString", "tryGetPreferredPlaylist", "playlistType", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: OfflineMediaItemData.kt */
public final class OfflineMediaItemData implements OfflineMediaItem {
    private final Map<String, Object> adEngine;
    private final List<Object> audioRenditions;
    private final List<PlaylistType> availablePlaylistTypes;
    private final String contentId;
    private final Map<String, Object> conviva;
    private final MediaDescriptor descriptor;
    private final String mediaCacheUrl;
    private final PlaybackContext playbackContext;
    private final MediaPlayhead playhead;
    private final List<HlsPlaylistVariant> playlistVariants;
    private final UUID preferredDrmScheme;
    private final List<Object> subtitleRenditions;
    private final Map<String, Object> telemetry;
    private final MediaThumbnailLinks thumbnails;

    @Metadata(mo31005bv = {1, 0, 3}, mo31008k = 3, mo31009mv = {1, 1, 15})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[MediaAnalyticsKey.values().length];

        static {
            $EnumSwitchMapping$0[MediaAnalyticsKey.TELEMETRY.ordinal()] = 1;
            $EnumSwitchMapping$0[MediaAnalyticsKey.AD_ENGINE.ordinal()] = 2;
            $EnumSwitchMapping$0[MediaAnalyticsKey.CONVIVA.ordinal()] = 3;
        }
    }

    public OfflineMediaItemData(String str, String str2, MediaDescriptor mediaDescriptor, List<HlsPlaylistVariant> list, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Map<String, ? extends Object> map3, MediaThumbnailLinks mediaThumbnailLinks, PlaybackContext playbackContext2) {
        this.mediaCacheUrl = str;
        this.contentId = str2;
        this.descriptor = mediaDescriptor;
        this.playlistVariants = list;
        this.telemetry = map;
        this.adEngine = map2;
        this.conviva = map3;
        this.thumbnails = mediaThumbnailLinks;
        this.playbackContext = playbackContext2;
        this.audioRenditions = C13185o.m40513a();
        this.subtitleRenditions = C13185o.m40513a();
        this.availablePlaylistTypes = C13183n.m40498a(PlaylistType.OFFLINE);
        MediaPlayhead mediaPlayhead = new MediaPlayhead(0.0d, null, null, this.contentId, 7, null);
        this.playhead = mediaPlayhead;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007c, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) getPlaybackContext(), (java.lang.Object) r3.getPlaybackContext()) != false) goto L_0x0081;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0081
            boolean r0 = r3 instanceof com.bamtech.sdk4.internal.media.offline.OfflineMediaItemData
            if (r0 == 0) goto L_0x007f
            com.bamtech.sdk4.internal.media.offline.OfflineMediaItemData r3 = (com.bamtech.sdk4.internal.media.offline.OfflineMediaItemData) r3
            java.lang.String r0 = r2.mediaCacheUrl
            java.lang.String r1 = r3.mediaCacheUrl
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x007f
            java.lang.String r0 = r2.contentId
            java.lang.String r1 = r3.contentId
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x007f
            com.bamtech.sdk4.media.MediaDescriptor r0 = r2.getDescriptor()
            com.bamtech.sdk4.media.MediaDescriptor r1 = r3.getDescriptor()
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x007f
            java.util.List r0 = r2.getPlaylistVariants()
            java.util.List r1 = r3.getPlaylistVariants()
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x007f
            java.util.Map r0 = r2.getTelemetry()
            java.util.Map r1 = r3.getTelemetry()
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x007f
            java.util.Map r0 = r2.getAdEngine()
            java.util.Map r1 = r3.getAdEngine()
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x007f
            java.util.Map r0 = r2.getConviva()
            java.util.Map r1 = r3.getConviva()
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x007f
            com.bamtech.sdk4.MediaThumbnailLinks r0 = r2.getThumbnails()
            com.bamtech.sdk4.MediaThumbnailLinks r1 = r3.getThumbnails()
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x007f
            com.bamtech.sdk4.media.PlaybackContext r0 = r2.getPlaybackContext()
            com.bamtech.sdk4.media.PlaybackContext r3 = r3.getPlaybackContext()
            boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
            if (r3 == 0) goto L_0x007f
            goto L_0x0081
        L_0x007f:
            r3 = 0
            return r3
        L_0x0081:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.media.offline.OfflineMediaItemData.equals(java.lang.Object):boolean");
    }

    public Map<String, Object> getAdEngine() {
        return this.adEngine;
    }

    public List<Object> getAudioRenditions() {
        return this.audioRenditions;
    }

    public List<PlaylistType> getAvailablePlaylistTypes() {
        return this.availablePlaylistTypes;
    }

    public Map<String, Object> getConviva() {
        return this.conviva;
    }

    public MediaItemPlaylist getDefaultPlaylist() {
        return tryGetPreferredPlaylist(PlaylistType.OFFLINE);
    }

    public MediaDescriptor getDescriptor() {
        return this.descriptor;
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

    public List<Object> getSubtitleRenditions() {
        return this.subtitleRenditions;
    }

    public Map<String, Object> getTelemetry() {
        return this.telemetry;
    }

    public MediaThumbnailLinks getThumbnails() {
        return this.thumbnails;
    }

    public Map<String, Object> getTrackingData(MediaAnalyticsKey mediaAnalyticsKey) {
        int i = WhenMappings.$EnumSwitchMapping$0[mediaAnalyticsKey.ordinal()];
        if (i == 1) {
            return getTelemetry();
        }
        if (i == 2) {
            return getAdEngine();
        }
        if (i != 3) {
            return C13173j0.m40350a();
        }
        return getConviva();
    }

    public int hashCode() {
        String str = this.mediaCacheUrl;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.contentId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        MediaDescriptor descriptor2 = getDescriptor();
        int hashCode3 = (hashCode2 + (descriptor2 != null ? descriptor2.hashCode() : 0)) * 31;
        List playlistVariants2 = getPlaylistVariants();
        int hashCode4 = (hashCode3 + (playlistVariants2 != null ? playlistVariants2.hashCode() : 0)) * 31;
        Map telemetry2 = getTelemetry();
        int hashCode5 = (hashCode4 + (telemetry2 != null ? telemetry2.hashCode() : 0)) * 31;
        Map adEngine2 = getAdEngine();
        int hashCode6 = (hashCode5 + (adEngine2 != null ? adEngine2.hashCode() : 0)) * 31;
        Map conviva2 = getConviva();
        int hashCode7 = (hashCode6 + (conviva2 != null ? conviva2.hashCode() : 0)) * 31;
        MediaThumbnailLinks thumbnails2 = getThumbnails();
        int hashCode8 = (hashCode7 + (thumbnails2 != null ? thumbnails2.hashCode() : 0)) * 31;
        PlaybackContext playbackContext2 = getPlaybackContext();
        if (playbackContext2 != null) {
            i = playbackContext2.hashCode();
        }
        return hashCode8 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OfflineMediaItemData(mediaCacheUrl=");
        sb.append(this.mediaCacheUrl);
        sb.append(", contentId=");
        sb.append(this.contentId);
        sb.append(", descriptor=");
        sb.append(getDescriptor());
        sb.append(", playlistVariants=");
        sb.append(getPlaylistVariants());
        sb.append(", telemetry=");
        sb.append(getTelemetry());
        sb.append(", adEngine=");
        sb.append(getAdEngine());
        sb.append(", conviva=");
        sb.append(getConviva());
        sb.append(", thumbnails=");
        sb.append(getThumbnails());
        sb.append(", playbackContext=");
        sb.append(getPlaybackContext());
        sb.append(")");
        return sb.toString();
    }

    public MediaItemPlaylist tryGetPreferredPlaylist(PlaylistType playlistType) {
        OfflineMediaItemPlaylistData offlineMediaItemPlaylistData = new OfflineMediaItemPlaylistData(this.mediaCacheUrl, getPlayhead(), C13170i0.m40332a(C12907r.m40244a(MediaAnalyticsKey.TELEMETRY.getValue(), getTelemetry())), getPlaylistVariants(), getAudioRenditions(), getSubtitleRenditions(), null);
        return offlineMediaItemPlaylistData;
    }

    public /* synthetic */ OfflineMediaItemData(String str, String str2, MediaDescriptor mediaDescriptor, List list, Map map, Map map2, Map map3, MediaThumbnailLinks mediaThumbnailLinks, PlaybackContext playbackContext2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = i;
        this(str, str2, mediaDescriptor, list, (i2 & 16) != 0 ? C13173j0.m40350a() : map, (i2 & 32) != 0 ? C13173j0.m40350a() : map2, (i2 & 64) != 0 ? C13173j0.m40350a() : map3, mediaThumbnailLinks, (i2 & 256) != 0 ? null : playbackContext2);
    }
}
