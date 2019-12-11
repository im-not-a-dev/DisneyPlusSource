package com.bamtech.sdk4.media.offline;

import com.bamtech.core.annotations.android.DontObfuscate;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\bHÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001c"}, mo31007d2 = {"Lcom/bamtech/sdk4/media/offline/DownloadSettings;", "", "wifiOnly", "", "chargingOnly", "batteryNotLow", "storageNotLow", "concurrentDownloads", "", "(ZZZZI)V", "getBatteryNotLow", "()Z", "getChargingOnly", "getConcurrentDownloads", "()I", "getStorageNotLow", "getWifiOnly", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "extension-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DownloadSettings.kt */
public final class DownloadSettings {
    private final boolean batteryNotLow;
    private final boolean chargingOnly;
    private final int concurrentDownloads;
    private final boolean storageNotLow;
    private final boolean wifiOnly;

    public DownloadSettings() {
        this(false, false, false, false, 0, 31, null);
    }

    public DownloadSettings(boolean z, boolean z2, boolean z3, boolean z4, int i) {
        this.wifiOnly = z;
        this.chargingOnly = z2;
        this.batteryNotLow = z3;
        this.storageNotLow = z4;
        this.concurrentDownloads = i;
    }

    public static /* synthetic */ DownloadSettings copy$default(DownloadSettings downloadSettings, boolean z, boolean z2, boolean z3, boolean z4, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = downloadSettings.wifiOnly;
        }
        if ((i2 & 2) != 0) {
            z2 = downloadSettings.chargingOnly;
        }
        boolean z5 = z2;
        if ((i2 & 4) != 0) {
            z3 = downloadSettings.batteryNotLow;
        }
        boolean z6 = z3;
        if ((i2 & 8) != 0) {
            z4 = downloadSettings.storageNotLow;
        }
        boolean z7 = z4;
        if ((i2 & 16) != 0) {
            i = downloadSettings.concurrentDownloads;
        }
        return downloadSettings.copy(z, z5, z6, z7, i);
    }

    public final boolean component1() {
        return this.wifiOnly;
    }

    public final boolean component2() {
        return this.chargingOnly;
    }

    public final boolean component3() {
        return this.batteryNotLow;
    }

    public final boolean component4() {
        return this.storageNotLow;
    }

    public final int component5() {
        return this.concurrentDownloads;
    }

    public final DownloadSettings copy(boolean z, boolean z2, boolean z3, boolean z4, int i) {
        DownloadSettings downloadSettings = new DownloadSettings(z, z2, z3, z4, i);
        return downloadSettings;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DownloadSettings) {
                DownloadSettings downloadSettings = (DownloadSettings) obj;
                if (this.wifiOnly == downloadSettings.wifiOnly) {
                    if (this.chargingOnly == downloadSettings.chargingOnly) {
                        if (this.batteryNotLow == downloadSettings.batteryNotLow) {
                            if (this.storageNotLow == downloadSettings.storageNotLow) {
                                if (this.concurrentDownloads == downloadSettings.concurrentDownloads) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean getBatteryNotLow() {
        return this.batteryNotLow;
    }

    public final boolean getChargingOnly() {
        return this.chargingOnly;
    }

    public final int getConcurrentDownloads() {
        return this.concurrentDownloads;
    }

    public final boolean getStorageNotLow() {
        return this.storageNotLow;
    }

    public final boolean getWifiOnly() {
        return this.wifiOnly;
    }

    public int hashCode() {
        boolean z = this.wifiOnly;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (z ? 1 : 0) * true;
        boolean z2 = this.chargingOnly;
        if (z2) {
            z2 = true;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.batteryNotLow;
        if (z3) {
            z3 = true;
        }
        int i4 = (i3 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.storageNotLow;
        if (!z4) {
            i = z4;
        }
        return ((i4 + i) * 31) + this.concurrentDownloads;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DownloadSettings(wifiOnly=");
        sb.append(this.wifiOnly);
        sb.append(", chargingOnly=");
        sb.append(this.chargingOnly);
        sb.append(", batteryNotLow=");
        sb.append(this.batteryNotLow);
        sb.append(", storageNotLow=");
        sb.append(this.storageNotLow);
        sb.append(", concurrentDownloads=");
        sb.append(this.concurrentDownloads);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ DownloadSettings(boolean z, boolean z2, boolean z3, boolean z4, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z5 = true;
        boolean z6 = (i2 & 1) != 0 ? true : z;
        boolean z7 = (i2 & 2) != 0 ? true : z2;
        if ((i2 & 4) == 0) {
            z5 = z3;
        }
        this(z6, z7, z5, (i2 & 8) != 0 ? false : z4, (i2 & 16) != 0 ? 2 : i);
    }
}
