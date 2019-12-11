package com.bamtech.sdk4.internal.media;

import com.bamtech.core.annotations.android.DontObfuscate;
import java.util.List;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B!\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0002\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0016"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/Renditions;", "", "()V", "audio", "", "Lcom/bamtech/sdk4/media/AudioRendition;", "subtitles", "Lcom/bamtech/sdk4/media/SubtitleRendition;", "(Ljava/util/List;Ljava/util/List;)V", "getAudio", "()Ljava/util/List;", "getSubtitles", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: PlaylistResponse.kt */
public final class Renditions {
    private final List<Object> audio;
    private final List<Object> subtitles;

    public Renditions(List<Object> list, List<Object> list2) {
        this.audio = list;
        this.subtitles = list2;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<java.lang.Object>, for r1v0, types: [java.util.List] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<java.lang.Object>, for r2v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.bamtech.sdk4.internal.media.Renditions copy$default(com.bamtech.sdk4.internal.media.Renditions r0, java.util.List<java.lang.Object> r1, java.util.List<java.lang.Object> r2, int r3, java.lang.Object r4) {
        /*
            r4 = r3 & 1
            if (r4 == 0) goto L_0x0006
            java.util.List<java.lang.Object> r1 = r0.audio
        L_0x0006:
            r3 = r3 & 2
            if (r3 == 0) goto L_0x000c
            java.util.List<java.lang.Object> r2 = r0.subtitles
        L_0x000c:
            com.bamtech.sdk4.internal.media.Renditions r0 = r0.copy(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.media.Renditions.copy$default(com.bamtech.sdk4.internal.media.Renditions, java.util.List, java.util.List, int, java.lang.Object):com.bamtech.sdk4.internal.media.Renditions");
    }

    public final List<Object> component1() {
        return this.audio;
    }

    public final List<Object> component2() {
        return this.subtitles;
    }

    public final Renditions copy(List<Object> list, List<Object> list2) {
        return new Renditions(list, list2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.subtitles, (java.lang.Object) r3.subtitles) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.bamtech.sdk4.internal.media.Renditions
            if (r0 == 0) goto L_0x001d
            com.bamtech.sdk4.internal.media.Renditions r3 = (com.bamtech.sdk4.internal.media.Renditions) r3
            java.util.List<java.lang.Object> r0 = r2.audio
            java.util.List<java.lang.Object> r1 = r3.audio
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.util.List<java.lang.Object> r0 = r2.subtitles
            java.util.List<java.lang.Object> r3 = r3.subtitles
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.media.Renditions.equals(java.lang.Object):boolean");
    }

    public final List<Object> getAudio() {
        return this.audio;
    }

    public final List<Object> getSubtitles() {
        return this.subtitles;
    }

    public int hashCode() {
        List<Object> list = this.audio;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<Object> list2 = this.subtitles;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Renditions(audio=");
        sb.append(this.audio);
        sb.append(", subtitles=");
        sb.append(this.subtitles);
        sb.append(")");
        return sb.toString();
    }

    public Renditions() {
        this(C13185o.m40513a(), C13185o.m40513a());
    }
}
