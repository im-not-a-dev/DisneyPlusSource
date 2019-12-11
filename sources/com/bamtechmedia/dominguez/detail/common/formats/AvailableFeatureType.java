package com.bamtechmedia.dominguez.detail.common.formats;

import androidx.annotation.Keep;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/common/formats/AvailableFeatureType;", "", "sortOrder", "", "(Ljava/lang/String;II)V", "getSortOrder", "()I", "UHD", "DOLBY_VISION", "DOLBY_ATMOS", "DOLBY_VISION_AND_ATMOS", "HDR_10", "HD", "DOLBY_51", "UNKNOWN", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@Keep
/* compiled from: AvailableFeatureData.kt */
public enum AvailableFeatureType {
    UHD(1),
    DOLBY_VISION(2),
    DOLBY_ATMOS(3),
    DOLBY_VISION_AND_ATMOS(4),
    HDR_10(5),
    HD(6),
    DOLBY_51(7),
    UNKNOWN(8);
    
    private final int sortOrder;

    private AvailableFeatureType(int i) {
        this.sortOrder = i;
    }

    public final int getSortOrder() {
        return this.sortOrder;
    }
}
