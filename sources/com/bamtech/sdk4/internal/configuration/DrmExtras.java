package com.bamtech.sdk4.internal.configuration;

import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0010¢\u0006\u0002\u0010\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/configuration/DrmExtras;", "Lcom/bamtech/sdk4/internal/configuration/ServiceExtras;", "()V", "minimumRenewalFrequency", "", "playReadyPreferred", "", "widevineCheckKidBase64", "", "(JZLjava/lang/String;)V", "getMinimumRenewalFrequency", "()J", "getPlayReadyPreferred", "()Z", "getWidevineCheckKidBase64", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "sdk-configuration"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DrmServiceConfiguration.kt */
public final class DrmExtras implements ServiceExtras {
    private final long minimumRenewalFrequency;
    private final boolean playReadyPreferred;
    private final String widevineCheckKidBase64;

    public DrmExtras(long j, boolean z, String str) {
        this.minimumRenewalFrequency = j;
        this.playReadyPreferred = z;
        this.widevineCheckKidBase64 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DrmExtras) {
                DrmExtras drmExtras = (DrmExtras) obj;
                if (this.minimumRenewalFrequency == drmExtras.minimumRenewalFrequency) {
                    if (!(this.playReadyPreferred == drmExtras.playReadyPreferred) || !C12880j.m40224a((Object) this.widevineCheckKidBase64, (Object) drmExtras.widevineCheckKidBase64)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final long getMinimumRenewalFrequency() {
        return this.minimumRenewalFrequency;
    }

    public final boolean getPlayReadyPreferred() {
        return this.playReadyPreferred;
    }

    public final String getWidevineCheckKidBase64() {
        return this.widevineCheckKidBase64;
    }

    public int hashCode() {
        long j = this.minimumRenewalFrequency;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        boolean z = this.playReadyPreferred;
        if (z) {
            z = true;
        }
        int i2 = (i + (z ? 1 : 0)) * 31;
        String str = this.widevineCheckKidBase64;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DrmExtras(minimumRenewalFrequency=");
        sb.append(this.minimumRenewalFrequency);
        sb.append(", playReadyPreferred=");
        sb.append(this.playReadyPreferred);
        sb.append(", widevineCheckKidBase64=");
        sb.append(this.widevineCheckKidBase64);
        sb.append(")");
        return sb.toString();
    }

    public DrmExtras() {
        this(86400, false, null);
    }
}
