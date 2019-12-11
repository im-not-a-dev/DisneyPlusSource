package com.bamtech.sdk4.internal.media.offline;

import com.bamtech.core.annotations.android.DontObfuscate;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/GroupStatus;", "", "batteryCharging", "Lcom/bamtech/sdk4/internal/media/offline/BatteryChargingStatus;", "batteryNotLow", "Lcom/bamtech/sdk4/internal/media/offline/BatteryNotLowStatus;", "networkStatus", "Lcom/bamtech/sdk4/internal/media/offline/NetworkStatus;", "storageStatus", "Lcom/bamtech/sdk4/internal/media/offline/StorageStatus;", "(Lcom/bamtech/sdk4/internal/media/offline/BatteryChargingStatus;Lcom/bamtech/sdk4/internal/media/offline/BatteryNotLowStatus;Lcom/bamtech/sdk4/internal/media/offline/NetworkStatus;Lcom/bamtech/sdk4/internal/media/offline/StorageStatus;)V", "getBatteryCharging", "()Lcom/bamtech/sdk4/internal/media/offline/BatteryChargingStatus;", "getBatteryNotLow", "()Lcom/bamtech/sdk4/internal/media/offline/BatteryNotLowStatus;", "getNetworkStatus", "()Lcom/bamtech/sdk4/internal/media/offline/NetworkStatus;", "getStorageStatus", "()Lcom/bamtech/sdk4/internal/media/offline/StorageStatus;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ConditionReporter.kt */
public final class GroupStatus {
    private final BatteryChargingStatus batteryCharging;
    private final BatteryNotLowStatus batteryNotLow;
    private final NetworkStatus networkStatus;
    private final StorageStatus storageStatus;

    public GroupStatus(BatteryChargingStatus batteryChargingStatus, BatteryNotLowStatus batteryNotLowStatus, NetworkStatus networkStatus2, StorageStatus storageStatus2) {
        this.batteryCharging = batteryChargingStatus;
        this.batteryNotLow = batteryNotLowStatus;
        this.networkStatus = networkStatus2;
        this.storageStatus = storageStatus2;
    }

    public static /* synthetic */ GroupStatus copy$default(GroupStatus groupStatus, BatteryChargingStatus batteryChargingStatus, BatteryNotLowStatus batteryNotLowStatus, NetworkStatus networkStatus2, StorageStatus storageStatus2, int i, Object obj) {
        if ((i & 1) != 0) {
            batteryChargingStatus = groupStatus.batteryCharging;
        }
        if ((i & 2) != 0) {
            batteryNotLowStatus = groupStatus.batteryNotLow;
        }
        if ((i & 4) != 0) {
            networkStatus2 = groupStatus.networkStatus;
        }
        if ((i & 8) != 0) {
            storageStatus2 = groupStatus.storageStatus;
        }
        return groupStatus.copy(batteryChargingStatus, batteryNotLowStatus, networkStatus2, storageStatus2);
    }

    public final BatteryChargingStatus component1() {
        return this.batteryCharging;
    }

    public final BatteryNotLowStatus component2() {
        return this.batteryNotLow;
    }

    public final NetworkStatus component3() {
        return this.networkStatus;
    }

    public final StorageStatus component4() {
        return this.storageStatus;
    }

    public final GroupStatus copy(BatteryChargingStatus batteryChargingStatus, BatteryNotLowStatus batteryNotLowStatus, NetworkStatus networkStatus2, StorageStatus storageStatus2) {
        return new GroupStatus(batteryChargingStatus, batteryNotLowStatus, networkStatus2, storageStatus2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.storageStatus, (java.lang.Object) r3.storageStatus) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof com.bamtech.sdk4.internal.media.offline.GroupStatus
            if (r0 == 0) goto L_0x0031
            com.bamtech.sdk4.internal.media.offline.GroupStatus r3 = (com.bamtech.sdk4.internal.media.offline.GroupStatus) r3
            com.bamtech.sdk4.internal.media.offline.BatteryChargingStatus r0 = r2.batteryCharging
            com.bamtech.sdk4.internal.media.offline.BatteryChargingStatus r1 = r3.batteryCharging
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0031
            com.bamtech.sdk4.internal.media.offline.BatteryNotLowStatus r0 = r2.batteryNotLow
            com.bamtech.sdk4.internal.media.offline.BatteryNotLowStatus r1 = r3.batteryNotLow
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0031
            com.bamtech.sdk4.internal.media.offline.NetworkStatus r0 = r2.networkStatus
            com.bamtech.sdk4.internal.media.offline.NetworkStatus r1 = r3.networkStatus
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L_0x0031
            com.bamtech.sdk4.internal.media.offline.StorageStatus r0 = r2.storageStatus
            com.bamtech.sdk4.internal.media.offline.StorageStatus r3 = r3.storageStatus
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            return r3
        L_0x0033:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtech.sdk4.internal.media.offline.GroupStatus.equals(java.lang.Object):boolean");
    }

    public final BatteryChargingStatus getBatteryCharging() {
        return this.batteryCharging;
    }

    public final BatteryNotLowStatus getBatteryNotLow() {
        return this.batteryNotLow;
    }

    public final NetworkStatus getNetworkStatus() {
        return this.networkStatus;
    }

    public final StorageStatus getStorageStatus() {
        return this.storageStatus;
    }

    public int hashCode() {
        BatteryChargingStatus batteryChargingStatus = this.batteryCharging;
        int i = 0;
        int hashCode = (batteryChargingStatus != null ? batteryChargingStatus.hashCode() : 0) * 31;
        BatteryNotLowStatus batteryNotLowStatus = this.batteryNotLow;
        int hashCode2 = (hashCode + (batteryNotLowStatus != null ? batteryNotLowStatus.hashCode() : 0)) * 31;
        NetworkStatus networkStatus2 = this.networkStatus;
        int hashCode3 = (hashCode2 + (networkStatus2 != null ? networkStatus2.hashCode() : 0)) * 31;
        StorageStatus storageStatus2 = this.storageStatus;
        if (storageStatus2 != null) {
            i = storageStatus2.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GroupStatus(batteryCharging=");
        sb.append(this.batteryCharging);
        sb.append(", batteryNotLow=");
        sb.append(this.batteryNotLow);
        sb.append(", networkStatus=");
        sb.append(this.networkStatus);
        sb.append(", storageStatus=");
        sb.append(this.storageStatus);
        sb.append(")");
        return sb.toString();
    }
}
