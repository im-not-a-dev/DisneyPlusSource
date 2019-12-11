package com.bamtech.sdk4.internal.media;

import com.bamtech.sdk4.internal.configuration.PlaylistType;
import com.bamtech.sdk4.media.MediaAnalyticsKey;
import com.bamtech.sdk4.media.MediaItemPlaylist;
import com.bamtech.sdk4.media.MediaItemPlaylist.DefaultImpls;
import com.bamtech.sdk4.media.MediaPlayhead;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\"\b\u0002\u0010\b\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\n0\t0\t\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J#\u0010&\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\n0\t0\tHÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\fHÆ\u0003J\u0011\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\fHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\"\b\u0002\u0010\b\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\n0\t0\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R.\u0010\b\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\n0\t0\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001c\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018¨\u00062"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/OnlineMediaItemPlaylist;", "Lcom/bamtech/sdk4/media/MediaItemPlaylist;", "streamUri", "", "playlistType", "Lcom/bamtech/sdk4/internal/configuration/PlaylistType;", "playhead", "Lcom/bamtech/sdk4/media/MediaPlayhead;", "tracking", "", "", "variants", "", "Lcom/bamtech/sdk4/internal/media/HlsPlaylistVariant;", "audioRenditions", "Lcom/bamtech/sdk4/media/AudioRendition;", "subtitleRenditions", "Lcom/bamtech/sdk4/media/SubtitleRendition;", "attributes", "Lcom/bamtech/sdk4/internal/media/HlsPlaylistAttributes;", "(Ljava/lang/String;Lcom/bamtech/sdk4/internal/configuration/PlaylistType;Lcom/bamtech/sdk4/media/MediaPlayhead;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/bamtech/sdk4/internal/media/HlsPlaylistAttributes;)V", "getAttributes", "()Lcom/bamtech/sdk4/internal/media/HlsPlaylistAttributes;", "getAudioRenditions", "()Ljava/util/List;", "getPlayhead", "()Lcom/bamtech/sdk4/media/MediaPlayhead;", "getPlaylistType", "()Lcom/bamtech/sdk4/internal/configuration/PlaylistType;", "getStreamUri", "()Ljava/lang/String;", "getSubtitleRenditions", "getTracking", "()Ljava/util/Map;", "getVariants", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: OnlineMediaItemPlaylist.kt */
public final class OnlineMediaItemPlaylist implements MediaItemPlaylist {
    private final HlsPlaylistAttributes attributes;
    private final List<Object> audioRenditions;
    private final MediaPlayhead playhead;
    private final PlaylistType playlistType;
    private final String streamUri;
    private final List<Object> subtitleRenditions;
    private final Map<String, Map<String, Object>> tracking;
    private final List<HlsPlaylistVariant> variants;

    public OnlineMediaItemPlaylist(String str, PlaylistType playlistType2, MediaPlayhead mediaPlayhead, Map<String, ? extends Map<String, ? extends Object>> map, List<HlsPlaylistVariant> list, List<Object> list2, List<Object> list3, HlsPlaylistAttributes hlsPlaylistAttributes) {
        this.streamUri = str;
        this.playlistType = playlistType2;
        this.playhead = mediaPlayhead;
        this.tracking = map;
        this.variants = list;
        this.audioRenditions = list2;
        this.subtitleRenditions = list3;
        this.attributes = hlsPlaylistAttributes;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0076, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) getAttributes(), (java.lang.Object) r3.getAttributes()) != false) goto L_0x007b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x007b
            boolean r0 = r3 instanceof com.bamtech.sdk4.internal.media.OnlineMediaItemPlaylist
            if (r0 == 0) goto L_0x0079
            com.bamtech.sdk4.internal.media.OnlineMediaItemPlaylist r3 = (com.bamtech.sdk4.internal.media.OnlineMediaItemPlaylist) r3
            java.lang.String r0 = r2.getStreamUri()
            java.lang.String r1 = r3.getStreamUri()
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0079
            com.bamtech.sdk4.internal.configuration.PlaylistType r0 = r2.getPlaylistType()
            com.bamtech.sdk4.internal.configuration.PlaylistType r1 = r3.getPlaylistType()
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0079
            com.bamtech.sdk4.media.MediaPlayhead r0 = r2.getPlayhead()
            com.bamtech.sdk4.media.MediaPlayhead r1 = r3.getPlayhead()
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0079
            java.util.Map r0 = r2.getTracking()
            java.util.Map r1 = r3.getTracking()
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0079
            java.util.List r0 = r2.getVariants()
            java.util.List r1 = r3.getVariants()
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0079
            java.util.List r0 = r2.getAudioRenditions()
            java.util.List r1 = r3.getAudioRenditions()
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0079
            java.util.List r0 = r2.getSubtitleRenditions()
            java.util.List r1 = r3.getSubtitleRenditions()
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x0079
            com.bamtech.sdk4.internal.media.HlsPlaylistAttributes r0 = r2.getAttributes()
            com.bamtech.sdk4.internal.media.HlsPlaylistAttributes r3 = r3.getAttributes()
            boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
            if (r3 == 0) goto L_0x0079
            goto L_0x007b
        L_0x0079:
            r3 = 0
            return r3
        L_0x007b:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.media.OnlineMediaItemPlaylist.equals(java.lang.Object):boolean");
    }

    public HlsPlaylistAttributes getAttributes() {
        return this.attributes;
    }

    public List<Object> getAudioRenditions() {
        return this.audioRenditions;
    }

    public MediaPlayhead getPlayhead() {
        return this.playhead;
    }

    public PlaylistType getPlaylistType() {
        return this.playlistType;
    }

    public String getStreamUri() {
        return this.streamUri;
    }

    public List<Object> getSubtitleRenditions() {
        return this.subtitleRenditions;
    }

    public Map<String, Map<String, Object>> getTracking() {
        return this.tracking;
    }

    public Map<String, Object> getTrackingData(MediaAnalyticsKey mediaAnalyticsKey) {
        return DefaultImpls.getTrackingData(this, mediaAnalyticsKey);
    }

    public List<HlsPlaylistVariant> getVariants() {
        return this.variants;
    }

    public int hashCode() {
        String streamUri2 = getStreamUri();
        int i = 0;
        int hashCode = (streamUri2 != null ? streamUri2.hashCode() : 0) * 31;
        PlaylistType playlistType2 = getPlaylistType();
        int hashCode2 = (hashCode + (playlistType2 != null ? playlistType2.hashCode() : 0)) * 31;
        MediaPlayhead playhead2 = getPlayhead();
        int hashCode3 = (hashCode2 + (playhead2 != null ? playhead2.hashCode() : 0)) * 31;
        Map tracking2 = getTracking();
        int hashCode4 = (hashCode3 + (tracking2 != null ? tracking2.hashCode() : 0)) * 31;
        List variants2 = getVariants();
        int hashCode5 = (hashCode4 + (variants2 != null ? variants2.hashCode() : 0)) * 31;
        List audioRenditions2 = getAudioRenditions();
        int hashCode6 = (hashCode5 + (audioRenditions2 != null ? audioRenditions2.hashCode() : 0)) * 31;
        List subtitleRenditions2 = getSubtitleRenditions();
        int hashCode7 = (hashCode6 + (subtitleRenditions2 != null ? subtitleRenditions2.hashCode() : 0)) * 31;
        HlsPlaylistAttributes attributes2 = getAttributes();
        if (attributes2 != null) {
            i = attributes2.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OnlineMediaItemPlaylist(streamUri=");
        sb.append(getStreamUri());
        sb.append(", playlistType=");
        sb.append(getPlaylistType());
        sb.append(", playhead=");
        sb.append(getPlayhead());
        sb.append(", tracking=");
        sb.append(getTracking());
        sb.append(", variants=");
        sb.append(getVariants());
        sb.append(", audioRenditions=");
        sb.append(getAudioRenditions());
        sb.append(", subtitleRenditions=");
        sb.append(getSubtitleRenditions());
        sb.append(", attributes=");
        sb.append(getAttributes());
        sb.append(")");
        return sb.toString();
    }
}
