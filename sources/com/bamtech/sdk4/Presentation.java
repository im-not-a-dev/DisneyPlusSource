package com.bamtech.sdk4;

import com.bamtech.core.annotations.android.DontObfuscate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001d"}, mo31007d2 = {"Lcom/bamtech/sdk4/Presentation;", "", "presentationType", "Lcom/bamtech/sdk4/ThumbnailPresentationType;", "thumbnailCount", "", "offsetMilliseconds", "paths", "", "", "(Lcom/bamtech/sdk4/ThumbnailPresentationType;JJLjava/util/List;)V", "getOffsetMilliseconds", "()J", "getPaths", "()Ljava/util/List;", "getPresentationType", "()Lcom/bamtech/sdk4/ThumbnailPresentationType;", "getThumbnailCount", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: MediaThumbnailLinks.kt */
public final class Presentation {
    private final long offsetMilliseconds;
    private final List<String> paths;
    private final ThumbnailPresentationType presentationType;
    private final long thumbnailCount;

    public Presentation() {
        this(null, 0, 0, null, 15, null);
    }

    public Presentation(ThumbnailPresentationType thumbnailPresentationType, long j, long j2, List<String> list) {
        this.presentationType = thumbnailPresentationType;
        this.thumbnailCount = j;
        this.offsetMilliseconds = j2;
        this.paths = list;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<java.lang.String>, for r10v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.bamtech.sdk4.Presentation copy$default(com.bamtech.sdk4.Presentation r4, com.bamtech.sdk4.ThumbnailPresentationType r5, long r6, long r8, java.util.List<java.lang.String> r10, int r11, java.lang.Object r12) {
        /*
            r12 = r11 & 1
            if (r12 == 0) goto L_0x0006
            com.bamtech.sdk4.ThumbnailPresentationType r5 = r4.presentationType
        L_0x0006:
            r12 = r11 & 2
            if (r12 == 0) goto L_0x000c
            long r6 = r4.thumbnailCount
        L_0x000c:
            r0 = r6
            r6 = r11 & 4
            if (r6 == 0) goto L_0x0013
            long r8 = r4.offsetMilliseconds
        L_0x0013:
            r2 = r8
            r6 = r11 & 8
            if (r6 == 0) goto L_0x001a
            java.util.List<java.lang.String> r10 = r4.paths
        L_0x001a:
            r12 = r10
            r6 = r4
            r7 = r5
            r8 = r0
            r10 = r2
            com.bamtech.sdk4.Presentation r4 = r6.copy(r7, r8, r10, r12)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.Presentation.copy$default(com.bamtech.sdk4.Presentation, com.bamtech.sdk4.ThumbnailPresentationType, long, long, java.util.List, int, java.lang.Object):com.bamtech.sdk4.Presentation");
    }

    public final ThumbnailPresentationType component1() {
        return this.presentationType;
    }

    public final long component2() {
        return this.thumbnailCount;
    }

    public final long component3() {
        return this.offsetMilliseconds;
    }

    public final List<String> component4() {
        return this.paths;
    }

    public final Presentation copy(ThumbnailPresentationType thumbnailPresentationType, long j, long j2, List<String> list) {
        Presentation presentation = new Presentation(thumbnailPresentationType, j, j2, list);
        return presentation;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Presentation) {
                Presentation presentation = (Presentation) obj;
                if (Intrinsics.areEqual((Object) this.presentationType, (Object) presentation.presentationType)) {
                    if (this.thumbnailCount == presentation.thumbnailCount) {
                        if (!(this.offsetMilliseconds == presentation.offsetMilliseconds) || !Intrinsics.areEqual((Object) this.paths, (Object) presentation.paths)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final long getOffsetMilliseconds() {
        return this.offsetMilliseconds;
    }

    public final List<String> getPaths() {
        return this.paths;
    }

    public final ThumbnailPresentationType getPresentationType() {
        return this.presentationType;
    }

    public final long getThumbnailCount() {
        return this.thumbnailCount;
    }

    public int hashCode() {
        ThumbnailPresentationType thumbnailPresentationType = this.presentationType;
        int i = 0;
        int hashCode = (thumbnailPresentationType != null ? thumbnailPresentationType.hashCode() : 0) * 31;
        long j = this.thumbnailCount;
        int i2 = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.offsetMilliseconds;
        int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        List<String> list = this.paths;
        if (list != null) {
            i = list.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Presentation(presentationType=");
        sb.append(this.presentationType);
        sb.append(", thumbnailCount=");
        sb.append(this.thumbnailCount);
        sb.append(", offsetMilliseconds=");
        sb.append(this.offsetMilliseconds);
        sb.append(", paths=");
        sb.append(this.paths);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ Presentation(ThumbnailPresentationType thumbnailPresentationType, long j, long j2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            thumbnailPresentationType = ThumbnailPresentationType.MAIN;
        }
        long j3 = 0;
        long j4 = (i & 2) != 0 ? 0 : j;
        if ((i & 4) == 0) {
            j3 = j2;
        }
        if ((i & 8) != 0) {
            list = C13185o.m40513a();
        }
        this(thumbnailPresentationType, j4, j3, list);
    }
}
