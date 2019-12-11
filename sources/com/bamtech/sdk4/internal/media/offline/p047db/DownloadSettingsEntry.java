package com.bamtech.sdk4.internal.media.offline.p047db;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001f"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/db/DownloadSettingsEntry;", "", "id", "", "wifiOnly", "", "chargingOnly", "batteryNotLow", "storageNotLow", "concurrentDownloads", "(IZZZZI)V", "getBatteryNotLow", "()Z", "getChargingOnly", "getConcurrentDownloads", "()I", "getId", "getStorageNotLow", "getWifiOnly", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtech.sdk4.internal.media.offline.db.DownloadSettingsEntry */
/* compiled from: DownloadSettingsEntry.kt */
public final class DownloadSettingsEntry {
    private final boolean batteryNotLow;
    private final boolean chargingOnly;
    private final int concurrentDownloads;

    /* renamed from: id */
    private final int f6075id;
    private final boolean storageNotLow;
    private final boolean wifiOnly;

    public DownloadSettingsEntry(int i, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.f6075id = i;
        this.wifiOnly = z;
        this.chargingOnly = z2;
        this.batteryNotLow = z3;
        this.storageNotLow = z4;
        this.concurrentDownloads = i2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DownloadSettingsEntry) {
                DownloadSettingsEntry downloadSettingsEntry = (DownloadSettingsEntry) obj;
                if (this.f6075id == downloadSettingsEntry.f6075id) {
                    if (this.wifiOnly == downloadSettingsEntry.wifiOnly) {
                        if (this.chargingOnly == downloadSettingsEntry.chargingOnly) {
                            if (this.batteryNotLow == downloadSettingsEntry.batteryNotLow) {
                                if (this.storageNotLow == downloadSettingsEntry.storageNotLow) {
                                    if (this.concurrentDownloads == downloadSettingsEntry.concurrentDownloads) {
                                        return true;
                                    }
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

    public final int getId() {
        return this.f6075id;
    }

    public final boolean getStorageNotLow() {
        return this.storageNotLow;
    }

    public final boolean getWifiOnly() {
        return this.wifiOnly;
    }

    public int hashCode() {
        int i = this.f6075id * 31;
        boolean z = this.wifiOnly;
        if (z) {
            z = true;
        }
        int i2 = (i + (z ? 1 : 0)) * 31;
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
        if (z4) {
            z4 = true;
        }
        return ((i4 + (z4 ? 1 : 0)) * 31) + this.concurrentDownloads;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DownloadSettingsEntry(id=");
        sb.append(this.f6075id);
        sb.append(", wifiOnly=");
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
}
