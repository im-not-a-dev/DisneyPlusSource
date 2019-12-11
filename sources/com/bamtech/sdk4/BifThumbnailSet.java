package com.bamtech.sdk4;

import com.bamtech.core.annotations.android.DontObfuscate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003JK\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006%"}, mo31007d2 = {"Lcom/bamtech/sdk4/BifThumbnailSet;", "Lcom/bamtech/sdk4/ThumbnailSet;", "thumbnailWidth", "", "thumbnailHeight", "intervalMilliseconds", "totalBytes", "presentations", "", "Lcom/bamtech/sdk4/Presentation;", "resolution", "Lcom/bamtech/sdk4/ThumbnailResolution;", "(JJJJLjava/util/List;Lcom/bamtech/sdk4/ThumbnailResolution;)V", "getIntervalMilliseconds", "()J", "getPresentations", "()Ljava/util/List;", "getResolution", "()Lcom/bamtech/sdk4/ThumbnailResolution;", "getThumbnailHeight", "getThumbnailWidth", "getTotalBytes", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: MediaThumbnailLinks.kt */
public final class BifThumbnailSet extends ThumbnailSet {
    private final long intervalMilliseconds;
    private final List<Presentation> presentations;
    private final ThumbnailResolution resolution;
    private final long thumbnailHeight;
    private final long thumbnailWidth;
    private final long totalBytes;

    public BifThumbnailSet(long j, long j2, long j3, long j4, List<Presentation> list, ThumbnailResolution thumbnailResolution) {
        this.thumbnailWidth = j;
        this.thumbnailHeight = j2;
        this.intervalMilliseconds = j3;
        this.totalBytes = j4;
        this.presentations = list;
        this.resolution = thumbnailResolution;
    }

    public static /* synthetic */ BifThumbnailSet copy$default(BifThumbnailSet bifThumbnailSet, long j, long j2, long j3, long j4, List list, ThumbnailResolution thumbnailResolution, int i, Object obj) {
        return bifThumbnailSet.copy((i & 1) != 0 ? bifThumbnailSet.getThumbnailWidth() : j, (i & 2) != 0 ? bifThumbnailSet.getThumbnailHeight() : j2, (i & 4) != 0 ? bifThumbnailSet.getIntervalMilliseconds() : j3, (i & 8) != 0 ? bifThumbnailSet.getTotalBytes() : j4, (i & 16) != 0 ? bifThumbnailSet.getPresentations() : list, (i & 32) != 0 ? bifThumbnailSet.getResolution() : thumbnailResolution);
    }

    public final long component1() {
        return getThumbnailWidth();
    }

    public final long component2() {
        return getThumbnailHeight();
    }

    public final long component3() {
        return getIntervalMilliseconds();
    }

    public final long component4() {
        return getTotalBytes();
    }

    public final List<Presentation> component5() {
        return getPresentations();
    }

    public final ThumbnailResolution component6() {
        return getResolution();
    }

    public final BifThumbnailSet copy(long j, long j2, long j3, long j4, List<Presentation> list, ThumbnailResolution thumbnailResolution) {
        BifThumbnailSet bifThumbnailSet = new BifThumbnailSet(j, j2, j3, j4, list, thumbnailResolution);
        return bifThumbnailSet;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BifThumbnailSet) {
                BifThumbnailSet bifThumbnailSet = (BifThumbnailSet) obj;
                if (getThumbnailWidth() == bifThumbnailSet.getThumbnailWidth()) {
                    if (getThumbnailHeight() == bifThumbnailSet.getThumbnailHeight()) {
                        if (getIntervalMilliseconds() == bifThumbnailSet.getIntervalMilliseconds()) {
                            if (!(getTotalBytes() == bifThumbnailSet.getTotalBytes()) || !C12880j.m40224a((Object) getPresentations(), (Object) bifThumbnailSet.getPresentations()) || !C12880j.m40224a((Object) getResolution(), (Object) bifThumbnailSet.getResolution())) {
                                return false;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public long getIntervalMilliseconds() {
        return this.intervalMilliseconds;
    }

    public List<Presentation> getPresentations() {
        return this.presentations;
    }

    public ThumbnailResolution getResolution() {
        return this.resolution;
    }

    public long getThumbnailHeight() {
        return this.thumbnailHeight;
    }

    public long getThumbnailWidth() {
        return this.thumbnailWidth;
    }

    public long getTotalBytes() {
        return this.totalBytes;
    }

    public int hashCode() {
        long thumbnailWidth2 = getThumbnailWidth();
        int i = ((int) (thumbnailWidth2 ^ (thumbnailWidth2 >>> 32))) * 31;
        long thumbnailHeight2 = getThumbnailHeight();
        int i2 = (i + ((int) (thumbnailHeight2 ^ (thumbnailHeight2 >>> 32)))) * 31;
        long intervalMilliseconds2 = getIntervalMilliseconds();
        int i3 = (i2 + ((int) (intervalMilliseconds2 ^ (intervalMilliseconds2 >>> 32)))) * 31;
        long totalBytes2 = getTotalBytes();
        int i4 = (i3 + ((int) (totalBytes2 ^ (totalBytes2 >>> 32)))) * 31;
        List presentations2 = getPresentations();
        int i5 = 0;
        int hashCode = (i4 + (presentations2 != null ? presentations2.hashCode() : 0)) * 31;
        ThumbnailResolution resolution2 = getResolution();
        if (resolution2 != null) {
            i5 = resolution2.hashCode();
        }
        return hashCode + i5;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BifThumbnailSet(thumbnailWidth=");
        sb.append(getThumbnailWidth());
        sb.append(", thumbnailHeight=");
        sb.append(getThumbnailHeight());
        sb.append(", intervalMilliseconds=");
        sb.append(getIntervalMilliseconds());
        sb.append(", totalBytes=");
        sb.append(getTotalBytes());
        sb.append(", presentations=");
        sb.append(getPresentations());
        sb.append(", resolution=");
        sb.append(getResolution());
        sb.append(")");
        return sb.toString();
    }
}
