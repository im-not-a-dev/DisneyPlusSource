package com.bamtech.sdk4.media.offline;

import com.bamtech.sdk4.ThumbnailResolution;
import com.bamtech.sdk4.internal.media.HlsPlaylistVariant;
import com.bamtech.sdk4.media.MediaItem;
import java.io.File;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u000fHÆ\u0003Je\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\bHÖ\u0001R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006+"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/offline/DownloadRequest;", "", "mediaItem", "Lcom/bamtech/sdk4/media/MediaItem;", "variantConstraints", "Lcom/bamtech/sdk4/media/offline/VariantConstraints;", "audioLanguages", "", "", "subtitleLanguages", "alternateStorageDir", "Ljava/io/File;", "playlistVariants", "Lcom/bamtech/sdk4/internal/media/HlsPlaylistVariant;", "thumbnailResolution", "Lcom/bamtech/sdk4/ThumbnailResolution;", "(Lcom/bamtech/sdk4/media/MediaItem;Lcom/bamtech/sdk4/media/offline/VariantConstraints;Ljava/util/List;Ljava/util/List;Ljava/io/File;Ljava/util/List;Lcom/bamtech/sdk4/ThumbnailResolution;)V", "getAlternateStorageDir", "()Ljava/io/File;", "getAudioLanguages", "()Ljava/util/List;", "getMediaItem", "()Lcom/bamtech/sdk4/media/MediaItem;", "getPlaylistVariants", "getSubtitleLanguages", "getThumbnailResolution", "()Lcom/bamtech/sdk4/ThumbnailResolution;", "getVariantConstraints", "()Lcom/bamtech/sdk4/media/offline/VariantConstraints;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DownloadRequest.kt */
public final class DownloadRequest {
    private final File alternateStorageDir;
    private final List<String> audioLanguages;
    private final MediaItem mediaItem;
    private final List<HlsPlaylistVariant> playlistVariants;
    private final List<String> subtitleLanguages;
    private final ThumbnailResolution thumbnailResolution;
    private final VariantConstraints variantConstraints;

    public DownloadRequest(MediaItem mediaItem2, VariantConstraints variantConstraints2, List<String> list, List<String> list2, File file, List<HlsPlaylistVariant> list3, ThumbnailResolution thumbnailResolution2) {
        this.mediaItem = mediaItem2;
        this.variantConstraints = variantConstraints2;
        this.audioLanguages = list;
        this.subtitleLanguages = list2;
        this.alternateStorageDir = file;
        this.playlistVariants = list3;
        this.thumbnailResolution = thumbnailResolution2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.thumbnailResolution, (java.lang.Object) r3.thumbnailResolution) != false) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0051
            boolean r0 = r3 instanceof com.bamtech.sdk4.media.offline.DownloadRequest
            if (r0 == 0) goto L_0x004f
            com.bamtech.sdk4.media.offline.DownloadRequest r3 = (com.bamtech.sdk4.media.offline.DownloadRequest) r3
            com.bamtech.sdk4.media.MediaItem r0 = r2.mediaItem
            com.bamtech.sdk4.media.MediaItem r1 = r3.mediaItem
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x004f
            com.bamtech.sdk4.media.offline.VariantConstraints r0 = r2.variantConstraints
            com.bamtech.sdk4.media.offline.VariantConstraints r1 = r3.variantConstraints
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x004f
            java.util.List<java.lang.String> r0 = r2.audioLanguages
            java.util.List<java.lang.String> r1 = r3.audioLanguages
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x004f
            java.util.List<java.lang.String> r0 = r2.subtitleLanguages
            java.util.List<java.lang.String> r1 = r3.subtitleLanguages
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x004f
            java.io.File r0 = r2.alternateStorageDir
            java.io.File r1 = r3.alternateStorageDir
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x004f
            java.util.List<com.bamtech.sdk4.internal.media.HlsPlaylistVariant> r0 = r2.playlistVariants
            java.util.List<com.bamtech.sdk4.internal.media.HlsPlaylistVariant> r1 = r3.playlistVariants
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x004f
            com.bamtech.sdk4.ThumbnailResolution r0 = r2.thumbnailResolution
            com.bamtech.sdk4.ThumbnailResolution r3 = r3.thumbnailResolution
            boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
            if (r3 == 0) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            r3 = 0
            return r3
        L_0x0051:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.media.offline.DownloadRequest.equals(java.lang.Object):boolean");
    }

    public final File getAlternateStorageDir() {
        return this.alternateStorageDir;
    }

    public final List<String> getAudioLanguages() {
        return this.audioLanguages;
    }

    public final MediaItem getMediaItem() {
        return this.mediaItem;
    }

    public final List<HlsPlaylistVariant> getPlaylistVariants() {
        return this.playlistVariants;
    }

    public final List<String> getSubtitleLanguages() {
        return this.subtitleLanguages;
    }

    public final ThumbnailResolution getThumbnailResolution() {
        return this.thumbnailResolution;
    }

    public final VariantConstraints getVariantConstraints() {
        return this.variantConstraints;
    }

    public int hashCode() {
        MediaItem mediaItem2 = this.mediaItem;
        int i = 0;
        int hashCode = (mediaItem2 != null ? mediaItem2.hashCode() : 0) * 31;
        VariantConstraints variantConstraints2 = this.variantConstraints;
        int hashCode2 = (hashCode + (variantConstraints2 != null ? variantConstraints2.hashCode() : 0)) * 31;
        List<String> list = this.audioLanguages;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.subtitleLanguages;
        int hashCode4 = (hashCode3 + (list2 != null ? list2.hashCode() : 0)) * 31;
        File file = this.alternateStorageDir;
        int hashCode5 = (hashCode4 + (file != null ? file.hashCode() : 0)) * 31;
        List<HlsPlaylistVariant> list3 = this.playlistVariants;
        int hashCode6 = (hashCode5 + (list3 != null ? list3.hashCode() : 0)) * 31;
        ThumbnailResolution thumbnailResolution2 = this.thumbnailResolution;
        if (thumbnailResolution2 != null) {
            i = thumbnailResolution2.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DownloadRequest(mediaItem=");
        sb.append(this.mediaItem);
        sb.append(", variantConstraints=");
        sb.append(this.variantConstraints);
        sb.append(", audioLanguages=");
        sb.append(this.audioLanguages);
        sb.append(", subtitleLanguages=");
        sb.append(this.subtitleLanguages);
        sb.append(", alternateStorageDir=");
        sb.append(this.alternateStorageDir);
        sb.append(", playlistVariants=");
        sb.append(this.playlistVariants);
        sb.append(", thumbnailResolution=");
        sb.append(this.thumbnailResolution);
        sb.append(")");
        return sb.toString();
    }
}
