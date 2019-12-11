package com.bamtech.sdk4.internal.media;

import com.bamtech.core.annotations.android.DontObfuscate;
import com.bamtech.sdk4.MediaThumbnailLinks;
import com.bamtech.sdk4.media.MediaPlayhead;
import com.bamtech.shadow.gson.p050r.C2246c;
import java.util.Map;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0010¢\u0006\u0002\u0010\u0002BC\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u001e\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00060\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J!\u0010\u0016\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00060\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u000bHÆ\u0003JK\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042 \b\u0002\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00060\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R)\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/Stream;", "", "()V", "hlsPlaylists", "Lcom/bamtech/sdk4/internal/media/HlsPlaylists;", "tracking", "", "", "playhead", "Lcom/bamtech/sdk4/media/MediaPlayhead;", "thumbnails", "Lcom/bamtech/sdk4/MediaThumbnailLinks;", "(Lcom/bamtech/sdk4/internal/media/HlsPlaylists;Ljava/util/Map;Lcom/bamtech/sdk4/media/MediaPlayhead;Lcom/bamtech/sdk4/MediaThumbnailLinks;)V", "getHlsPlaylists", "()Lcom/bamtech/sdk4/internal/media/HlsPlaylists;", "getPlayhead", "()Lcom/bamtech/sdk4/media/MediaPlayhead;", "getThumbnails", "()Lcom/bamtech/sdk4/MediaThumbnailLinks;", "getTracking", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: PlaylistResponse.kt */
public final class Stream {
    @C2246c("stream")
    private final HlsPlaylists hlsPlaylists;
    private final MediaPlayhead playhead;
    private final MediaThumbnailLinks thumbnails;
    private final Map<String, Map<String, Object>> tracking;

    public Stream(HlsPlaylists hlsPlaylists2, Map<String, ? extends Map<String, ? extends Object>> map, MediaPlayhead mediaPlayhead, MediaThumbnailLinks mediaThumbnailLinks) {
        this.hlsPlaylists = hlsPlaylists2;
        this.tracking = map;
        this.playhead = mediaPlayhead;
        this.thumbnails = mediaThumbnailLinks;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.Map, code=java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>>, for r2v0, types: [java.util.Map] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.bamtech.sdk4.internal.media.Stream copy$default(com.bamtech.sdk4.internal.media.Stream r0, com.bamtech.sdk4.internal.media.HlsPlaylists r1, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> r2, com.bamtech.sdk4.media.MediaPlayhead r3, com.bamtech.sdk4.MediaThumbnailLinks r4, int r5, java.lang.Object r6) {
        /*
            r6 = r5 & 1
            if (r6 == 0) goto L_0x0006
            com.bamtech.sdk4.internal.media.HlsPlaylists r1 = r0.hlsPlaylists
        L_0x0006:
            r6 = r5 & 2
            if (r6 == 0) goto L_0x000c
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> r2 = r0.tracking
        L_0x000c:
            r6 = r5 & 4
            if (r6 == 0) goto L_0x0012
            com.bamtech.sdk4.media.MediaPlayhead r3 = r0.playhead
        L_0x0012:
            r5 = r5 & 8
            if (r5 == 0) goto L_0x0018
            com.bamtech.sdk4.MediaThumbnailLinks r4 = r0.thumbnails
        L_0x0018:
            com.bamtech.sdk4.internal.media.Stream r0 = r0.copy(r1, r2, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.media.Stream.copy$default(com.bamtech.sdk4.internal.media.Stream, com.bamtech.sdk4.internal.media.HlsPlaylists, java.util.Map, com.bamtech.sdk4.media.MediaPlayhead, com.bamtech.sdk4.MediaThumbnailLinks, int, java.lang.Object):com.bamtech.sdk4.internal.media.Stream");
    }

    public final HlsPlaylists component1() {
        return this.hlsPlaylists;
    }

    public final Map<String, Map<String, Object>> component2() {
        return this.tracking;
    }

    public final MediaPlayhead component3() {
        return this.playhead;
    }

    public final MediaThumbnailLinks component4() {
        return this.thumbnails;
    }

    public final Stream copy(HlsPlaylists hlsPlaylists2, Map<String, ? extends Map<String, ? extends Object>> map, MediaPlayhead mediaPlayhead, MediaThumbnailLinks mediaThumbnailLinks) {
        return new Stream(hlsPlaylists2, map, mediaPlayhead, mediaThumbnailLinks);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.thumbnails, (java.lang.Object) r3.thumbnails) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof com.bamtech.sdk4.internal.media.Stream
            if (r0 == 0) goto L_0x0031
            com.bamtech.sdk4.internal.media.Stream r3 = (com.bamtech.sdk4.internal.media.Stream) r3
            com.bamtech.sdk4.internal.media.HlsPlaylists r0 = r2.hlsPlaylists
            com.bamtech.sdk4.internal.media.HlsPlaylists r1 = r3.hlsPlaylists
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.tracking
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> r1 = r3.tracking
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0031
            com.bamtech.sdk4.media.MediaPlayhead r0 = r2.playhead
            com.bamtech.sdk4.media.MediaPlayhead r1 = r3.playhead
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0031
            com.bamtech.sdk4.MediaThumbnailLinks r0 = r2.thumbnails
            com.bamtech.sdk4.MediaThumbnailLinks r3 = r3.thumbnails
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            return r3
        L_0x0033:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.media.Stream.equals(java.lang.Object):boolean");
    }

    public final HlsPlaylists getHlsPlaylists() {
        return this.hlsPlaylists;
    }

    public final MediaPlayhead getPlayhead() {
        return this.playhead;
    }

    public final MediaThumbnailLinks getThumbnails() {
        return this.thumbnails;
    }

    public final Map<String, Map<String, Object>> getTracking() {
        return this.tracking;
    }

    public int hashCode() {
        HlsPlaylists hlsPlaylists2 = this.hlsPlaylists;
        int i = 0;
        int hashCode = (hlsPlaylists2 != null ? hlsPlaylists2.hashCode() : 0) * 31;
        Map<String, Map<String, Object>> map = this.tracking;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        MediaPlayhead mediaPlayhead = this.playhead;
        int hashCode3 = (hashCode2 + (mediaPlayhead != null ? mediaPlayhead.hashCode() : 0)) * 31;
        MediaThumbnailLinks mediaThumbnailLinks = this.thumbnails;
        if (mediaThumbnailLinks != null) {
            i = mediaThumbnailLinks.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Stream(hlsPlaylists=");
        sb.append(this.hlsPlaylists);
        sb.append(", tracking=");
        sb.append(this.tracking);
        sb.append(", playhead=");
        sb.append(this.playhead);
        sb.append(", thumbnails=");
        sb.append(this.thumbnails);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ Stream(HlsPlaylists hlsPlaylists2, Map map, MediaPlayhead mediaPlayhead, MediaThumbnailLinks mediaThumbnailLinks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            mediaPlayhead = new MediaPlayhead(0.0d, null, null, null, 15, null);
        }
        if ((i & 8) != 0) {
            mediaThumbnailLinks = null;
        }
        this(hlsPlaylists2, map, mediaPlayhead, mediaThumbnailLinks);
    }

    public Stream() {
        HlsPlaylists hlsPlaylists2 = new HlsPlaylists();
        Map a = C13173j0.m40350a();
        MediaPlayhead mediaPlayhead = new MediaPlayhead(0.0d, null, null, null, 15, null);
        this(hlsPlaylists2, a, mediaPlayhead, null, 8, null);
    }
}
