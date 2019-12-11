package com.bamtech.sdk4.media.offline;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/offline/VariantConstraints;", "", "bitrate", "", "maxHeight", "maxWidth", "(III)V", "getBitrate", "()I", "getMaxHeight", "getMaxWidth", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: VariantConstraints.kt */
public final class VariantConstraints {
    private final int bitrate;
    private final int maxHeight;
    private final int maxWidth;

    public VariantConstraints() {
        this(0, 0, 0, 7, null);
    }

    public VariantConstraints(int i, int i2, int i3) {
        this.bitrate = i;
        this.maxHeight = i2;
        this.maxWidth = i3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VariantConstraints) {
                VariantConstraints variantConstraints = (VariantConstraints) obj;
                if (this.bitrate == variantConstraints.bitrate) {
                    if (this.maxHeight == variantConstraints.maxHeight) {
                        if (this.maxWidth == variantConstraints.maxWidth) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int getBitrate() {
        return this.bitrate;
    }

    public final int getMaxHeight() {
        return this.maxHeight;
    }

    public final int getMaxWidth() {
        return this.maxWidth;
    }

    public int hashCode() {
        return (((this.bitrate * 31) + this.maxHeight) * 31) + this.maxWidth;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VariantConstraints(bitrate=");
        sb.append(this.bitrate);
        sb.append(", maxHeight=");
        sb.append(this.maxHeight);
        sb.append(", maxWidth=");
        sb.append(this.maxWidth);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ VariantConstraints(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i4 & 1) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i4 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i4 & 4) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        this(i, i2, i3);
    }
}
