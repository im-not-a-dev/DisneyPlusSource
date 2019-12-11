package com.bamtech.sdk4.internal.media;

import com.bamtech.core.annotations.android.DontObfuscate;
import java.util.List;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002BG\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\fHÆ\u0003JK\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0004HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/HlsPlaylists;", "", "()V", "complete", "", "slide", "attributes", "Lcom/bamtech/sdk4/internal/media/HlsPlaylistAttributes;", "variants", "", "Lcom/bamtech/sdk4/internal/media/HlsPlaylistVariant;", "renditions", "Lcom/bamtech/sdk4/internal/media/Renditions;", "(Ljava/lang/String;Ljava/lang/String;Lcom/bamtech/sdk4/internal/media/HlsPlaylistAttributes;Ljava/util/List;Lcom/bamtech/sdk4/internal/media/Renditions;)V", "getAttributes", "()Lcom/bamtech/sdk4/internal/media/HlsPlaylistAttributes;", "getComplete", "()Ljava/lang/String;", "getRenditions", "()Lcom/bamtech/sdk4/internal/media/Renditions;", "getSlide", "getVariants", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: PlaylistResponse.kt */
public final class HlsPlaylists {
    private final HlsPlaylistAttributes attributes;
    private final String complete;
    private final Renditions renditions;
    private final String slide;
    private final List<HlsPlaylistVariant> variants;

    public HlsPlaylists(String str, String str2, HlsPlaylistAttributes hlsPlaylistAttributes, List<HlsPlaylistVariant> list, Renditions renditions2) {
        this.complete = str;
        this.slide = str2;
        this.attributes = hlsPlaylistAttributes;
        this.variants = list;
        this.renditions = renditions2;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.bamtech.sdk4.internal.media.HlsPlaylistVariant>, for r7v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.bamtech.sdk4.internal.media.HlsPlaylists copy$default(com.bamtech.sdk4.internal.media.HlsPlaylists r3, java.lang.String r4, java.lang.String r5, com.bamtech.sdk4.internal.media.HlsPlaylistAttributes r6, java.util.List<com.bamtech.sdk4.internal.media.HlsPlaylistVariant> r7, com.bamtech.sdk4.internal.media.Renditions r8, int r9, java.lang.Object r10) {
        /*
            r10 = r9 & 1
            if (r10 == 0) goto L_0x0006
            java.lang.String r4 = r3.complete
        L_0x0006:
            r10 = r9 & 2
            if (r10 == 0) goto L_0x000c
            java.lang.String r5 = r3.slide
        L_0x000c:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L_0x0013
            com.bamtech.sdk4.internal.media.HlsPlaylistAttributes r6 = r3.attributes
        L_0x0013:
            r0 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L_0x001a
            java.util.List<com.bamtech.sdk4.internal.media.HlsPlaylistVariant> r7 = r3.variants
        L_0x001a:
            r1 = r7
            r5 = r9 & 16
            if (r5 == 0) goto L_0x0021
            com.bamtech.sdk4.internal.media.Renditions r8 = r3.renditions
        L_0x0021:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r9 = r1
            r10 = r2
            com.bamtech.sdk4.internal.media.HlsPlaylists r3 = r5.copy(r6, r7, r8, r9, r10)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.media.HlsPlaylists.copy$default(com.bamtech.sdk4.internal.media.HlsPlaylists, java.lang.String, java.lang.String, com.bamtech.sdk4.internal.media.HlsPlaylistAttributes, java.util.List, com.bamtech.sdk4.internal.media.Renditions, int, java.lang.Object):com.bamtech.sdk4.internal.media.HlsPlaylists");
    }

    public final String component1() {
        return this.complete;
    }

    public final String component2() {
        return this.slide;
    }

    public final HlsPlaylistAttributes component3() {
        return this.attributes;
    }

    public final List<HlsPlaylistVariant> component4() {
        return this.variants;
    }

    public final Renditions component5() {
        return this.renditions;
    }

    public final HlsPlaylists copy(String str, String str2, HlsPlaylistAttributes hlsPlaylistAttributes, List<HlsPlaylistVariant> list, Renditions renditions2) {
        HlsPlaylists hlsPlaylists = new HlsPlaylists(str, str2, hlsPlaylistAttributes, list, renditions2);
        return hlsPlaylists;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r2.renditions, (java.lang.Object) r3.renditions) != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x003d
            boolean r0 = r3 instanceof com.bamtech.sdk4.internal.media.HlsPlaylists
            if (r0 == 0) goto L_0x003b
            com.bamtech.sdk4.internal.media.HlsPlaylists r3 = (com.bamtech.sdk4.internal.media.HlsPlaylists) r3
            java.lang.String r0 = r2.complete
            java.lang.String r1 = r3.complete
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.slide
            java.lang.String r1 = r3.slide
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x003b
            com.bamtech.sdk4.internal.media.HlsPlaylistAttributes r0 = r2.attributes
            com.bamtech.sdk4.internal.media.HlsPlaylistAttributes r1 = r3.attributes
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.util.List<com.bamtech.sdk4.internal.media.HlsPlaylistVariant> r0 = r2.variants
            java.util.List<com.bamtech.sdk4.internal.media.HlsPlaylistVariant> r1 = r3.variants
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r0, r1)
            if (r0 == 0) goto L_0x003b
            com.bamtech.sdk4.internal.media.Renditions r0 = r2.renditions
            com.bamtech.sdk4.internal.media.Renditions r3 = r3.renditions
            boolean r3 = kotlin.jvm.internal.C12880j.m40224a(r0, r3)
            if (r3 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r3 = 0
            return r3
        L_0x003d:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.media.HlsPlaylists.equals(java.lang.Object):boolean");
    }

    public final HlsPlaylistAttributes getAttributes() {
        return this.attributes;
    }

    public final String getComplete() {
        return this.complete;
    }

    public final Renditions getRenditions() {
        return this.renditions;
    }

    public final String getSlide() {
        return this.slide;
    }

    public final List<HlsPlaylistVariant> getVariants() {
        return this.variants;
    }

    public int hashCode() {
        String str = this.complete;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.slide;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        HlsPlaylistAttributes hlsPlaylistAttributes = this.attributes;
        int hashCode3 = (hashCode2 + (hlsPlaylistAttributes != null ? hlsPlaylistAttributes.hashCode() : 0)) * 31;
        List<HlsPlaylistVariant> list = this.variants;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        Renditions renditions2 = this.renditions;
        if (renditions2 != null) {
            i = renditions2.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HlsPlaylists(complete=");
        sb.append(this.complete);
        sb.append(", slide=");
        sb.append(this.slide);
        sb.append(", attributes=");
        sb.append(this.attributes);
        sb.append(", variants=");
        sb.append(this.variants);
        sb.append(", renditions=");
        sb.append(this.renditions);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ HlsPlaylists(String str, String str2, HlsPlaylistAttributes hlsPlaylistAttributes, List list, Renditions renditions2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str3 = (i & 1) != 0 ? null : str;
        this(str3, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : hlsPlaylistAttributes, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : renditions2);
    }

    public HlsPlaylists() {
        this(null, null, null, null, null);
    }
}
