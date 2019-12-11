package com.bamtech.sdk4.internal.media.offline;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import com.bamtech.sdk4.internal.media.offline.BatteryChargingStatus.Charging;
import com.bamtech.sdk4.internal.media.offline.BatteryChargingStatus.Full;
import com.bamtech.sdk4.internal.media.offline.BatteryChargingStatus.NotFull;
import com.bamtech.sdk4.internal.media.offline.BatteryChargingStatus.OtherBatterySource;
import com.bamtech.sdk4.internal.media.offline.BatteryChargingStatus.Unknown;
import com.bamtech.sdk4.internal.media.offline.BatteryChargingStatus.Using;
import com.bamtech.sdk4.internal.media.offline.BatteryNotLowStatus.BatteryLow;
import com.bamtech.sdk4.internal.media.offline.BatteryNotLowStatus.BatteryNotLow;
import com.bamtech.sdk4.internal.media.offline.BatteryNotLowStatus.NotOnBattery;
import com.bamtech.sdk4.internal.media.offline.StorageStatus.SpaceLow;
import com.bamtech.sdk4.internal.media.offline.StorageStatus.SpaceOk;
import kotlin.TypeCastException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p096e.p121h.p129n.C4063a;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0014"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/DefaultConditionReporter;", "Lcom/bamtech/sdk4/internal/media/offline/ConditionReporter;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "getBatteryChargingStatus", "Lcom/bamtech/sdk4/internal/media/offline/BatteryChargingStatus;", "getBatteryNotLowStatus", "Lcom/bamtech/sdk4/internal/media/offline/BatteryNotLowStatus;", "getGroupStatus", "Lcom/bamtech/sdk4/internal/media/offline/GroupStatus;", "getNetworkStatus", "Lcom/bamtech/sdk4/internal/media/offline/NetworkStatus;", "getStorageStatus", "Lcom/bamtech/sdk4/internal/media/offline/StorageStatus;", "isActiveNetworkValidated", "", "Companion", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ConditionReporter.kt */
public final class DefaultConditionReporter implements ConditionReporter {
    private final Context context;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/DefaultConditionReporter$Companion;", "", "()V", "BATTERY_LOW_PERCENTAGE", "", "BATTERY_PLUGGED_NONE", "", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ConditionReporter.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new Companion(null);
    }

    public DefaultConditionReporter(Context context2) {
        this.context = context2;
    }

    private final boolean isActiveNetworkValidated() {
        boolean z = false;
        if (VERSION.SDK_INT < 23) {
            return false;
        }
        Object systemService = this.context.getSystemService("connectivity");
        NetworkCapabilities networkCapabilities = null;
        if (!(systemService instanceof ConnectivityManager)) {
            systemService = null;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        Network activeNetwork = connectivityManager != null ? connectivityManager.getActiveNetwork() : null;
        if (connectivityManager != null) {
            networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        }
        if (networkCapabilities != null && networkCapabilities.hasCapability(16)) {
            z = true;
        }
        return z;
    }

    public BatteryChargingStatus getBatteryChargingStatus() {
        BatteryChargingStatus using;
        try {
            Intent registerReceiver = this.context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver == null) {
                using = new Unknown(false);
            } else if (VERSION.SDK_INT >= 23) {
                int intExtra = registerReceiver.getIntExtra("status", -1);
                if (intExtra == 2) {
                    using = new Charging();
                } else if (intExtra != 5) {
                    return new NotFull(Integer.valueOf(intExtra));
                } else {
                    using = new Full();
                }
            } else if (registerReceiver.getIntExtra("plugged", 0) != 0) {
                using = new OtherBatterySource();
            } else {
                using = new Using();
            }
            return using;
        } catch (Throwable unused) {
            return null;
        }
    }

    public BatteryNotLowStatus getBatteryNotLowStatus() {
        BatteryNotLowStatus batteryNotLowStatus;
        Intent registerReceiver = this.context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return new BatteryNotLowStatus.Unknown(false);
        }
        int intExtra = registerReceiver.getIntExtra("plugged", 0);
        int intExtra2 = registerReceiver.getIntExtra("status", -1);
        float intExtra3 = ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
        if (intExtra != 0) {
            batteryNotLowStatus = new NotOnBattery();
        } else if (intExtra2 == 1) {
            batteryNotLowStatus = new BatteryNotLowStatus.Unknown(true);
        } else if (intExtra3 > 0.15f) {
            batteryNotLowStatus = new BatteryNotLow(intExtra3);
        } else {
            batteryNotLowStatus = new BatteryLow();
        }
        return batteryNotLowStatus;
    }

    public GroupStatus getGroupStatus() {
        return new GroupStatus(getBatteryChargingStatus(), getBatteryNotLowStatus(), getNetworkStatus(), getStorageStatus());
    }

    public NetworkStatus getNetworkStatus() {
        try {
            Object systemService = this.context.getSystemService("connectivity");
            if (systemService != null) {
                ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                Intrinsics.checkReturnedValueIsNotNull((Object) activeNetworkInfo, "info");
                return new NetworkStatus(activeNetworkInfo.isConnected(), isActiveNetworkValidated(), C4063a.m13968a(connectivityManager), !activeNetworkInfo.isRoaming());
            }
            throw new TypeCastException("null cannot be cast to non-null type android.net.ConnectivityManager");
        } catch (Throwable unused) {
            return null;
        }
    }

    public StorageStatus getStorageStatus() {
        StorageStatus unknown;
        String str = "android.intent.action.DEVICE_STORAGE_LOW";
        String str2 = "android.intent.action.DEVICE_STORAGE_OK";
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(str2);
            intentFilter.addAction(str);
            Intent registerReceiver = this.context.registerReceiver(null, intentFilter);
            if ((registerReceiver != null ? registerReceiver.getAction() : null) == null) {
                unknown = new SpaceOk();
            } else {
                String action = registerReceiver.getAction();
                if (action != null) {
                    int hashCode = action.hashCode();
                    if (hashCode != -1181163412) {
                        if (hashCode == -730838620) {
                            if (action.equals(str2)) {
                                unknown = new SpaceOk();
                            }
                        }
                    } else if (action.equals(str)) {
                        unknown = new SpaceLow();
                    }
                }
                unknown = new StorageStatus.Unknown();
            }
            return unknown;
        } catch (Throwable unused) {
            return null;
        }
    }
}
