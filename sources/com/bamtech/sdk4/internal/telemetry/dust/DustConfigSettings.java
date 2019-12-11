package com.bamtech.sdk4.internal.telemetry.dust;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/telemetry/dust/DustConfigSettings;", "", "stackFrameLimit", "", "(I)V", "getStackFrameLimit", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "sdk-service"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DustConfigSettings.kt */
public final class DustConfigSettings {
    private final int stackFrameLimit;

    public DustConfigSettings() {
        this(0, 1, null);
    }

    public DustConfigSettings(int i) {
        this.stackFrameLimit = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DustConfigSettings) {
                if (this.stackFrameLimit == ((DustConfigSettings) obj).stackFrameLimit) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int getStackFrameLimit() {
        return this.stackFrameLimit;
    }

    public int hashCode() {
        return this.stackFrameLimit;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DustConfigSettings(stackFrameLimit=");
        sb.append(this.stackFrameLimit);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ DustConfigSettings(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        this(i);
    }
}
