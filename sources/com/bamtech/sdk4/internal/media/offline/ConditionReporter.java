package com.bamtech.sdk4.internal.media.offline;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\n\u0010\b\u001a\u0004\u0018\u00010\tH&J\n\u0010\n\u001a\u0004\u0018\u00010\u000bH&¨\u0006\f"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/ConditionReporter;", "", "getBatteryChargingStatus", "Lcom/bamtech/sdk4/internal/media/offline/BatteryChargingStatus;", "getBatteryNotLowStatus", "Lcom/bamtech/sdk4/internal/media/offline/BatteryNotLowStatus;", "getGroupStatus", "Lcom/bamtech/sdk4/internal/media/offline/GroupStatus;", "getNetworkStatus", "Lcom/bamtech/sdk4/internal/media/offline/NetworkStatus;", "getStorageStatus", "Lcom/bamtech/sdk4/internal/media/offline/StorageStatus;", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ConditionReporter.kt */
public interface ConditionReporter {
    GroupStatus getGroupStatus();
}
