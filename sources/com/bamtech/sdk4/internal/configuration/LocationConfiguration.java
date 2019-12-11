package com.bamtech.sdk4.internal.configuration;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0010¢\u0006\u0002\u0010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/configuration/LocationConfiguration;", "", "()V", "timeout", "", "(J)V", "getTimeout", "()J", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sdk-configuration"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: LocationConfiguration.kt */
public final class LocationConfiguration {
    private final long timeout;

    public LocationConfiguration(long j) {
        this.timeout = j;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LocationConfiguration) {
                if (this.timeout == ((LocationConfiguration) obj).timeout) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final long getTimeout() {
        return this.timeout;
    }

    public int hashCode() {
        long j = this.timeout;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LocationConfiguration(timeout=");
        sb.append(this.timeout);
        sb.append(")");
        return sb.toString();
    }

    public LocationConfiguration() {
        this(60);
    }
}
