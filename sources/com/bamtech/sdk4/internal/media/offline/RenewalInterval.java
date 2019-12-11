package com.bamtech.sdk4.internal.media.offline;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/RenewalInterval;", "", "interval", "", "flex", "(JJ)V", "getFlex", "()J", "getInterval", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: LicenseUtils.kt */
public final class RenewalInterval {
    private final long flex;
    private final long interval;

    public RenewalInterval(long j, long j2) {
        this.interval = j;
        this.flex = j2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RenewalInterval) {
                RenewalInterval renewalInterval = (RenewalInterval) obj;
                if (this.interval == renewalInterval.interval) {
                    if (this.flex == renewalInterval.flex) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final long getFlex() {
        return this.flex;
    }

    public final long getInterval() {
        return this.interval;
    }

    public int hashCode() {
        long j = this.interval;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.flex;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RenewalInterval(interval=");
        sb.append(this.interval);
        sb.append(", flex=");
        sb.append(this.flex);
        sb.append(")");
        return sb.toString();
    }
}
