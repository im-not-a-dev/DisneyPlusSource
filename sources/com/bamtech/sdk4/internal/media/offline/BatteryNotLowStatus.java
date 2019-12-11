package com.bamtech.sdk4.internal.media.offline;

import com.bamtech.core.annotations.android.DontObfuscate;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/BatteryNotLowStatus;", "", "conditionMetIfSet", "", "(Ljava/lang/Boolean;)V", "getConditionMetIfSet", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "BatteryLow", "BatteryNotLow", "NotOnBattery", "Unknown", "Lcom/bamtech/sdk4/internal/media/offline/BatteryNotLowStatus$Unknown;", "Lcom/bamtech/sdk4/internal/media/offline/BatteryNotLowStatus$NotOnBattery;", "Lcom/bamtech/sdk4/internal/media/offline/BatteryNotLowStatus$BatteryNotLow;", "Lcom/bamtech/sdk4/internal/media/offline/BatteryNotLowStatus$BatteryLow;", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ConditionReporter.kt */
public abstract class BatteryNotLowStatus {
    private final Boolean conditionMetIfSet;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/BatteryNotLowStatus$BatteryLow;", "Lcom/bamtech/sdk4/internal/media/offline/BatteryNotLowStatus;", "()V", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ConditionReporter.kt */
    public static final class BatteryLow extends BatteryNotLowStatus {
        public BatteryLow() {
            super(Boolean.valueOf(false), null);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/BatteryNotLowStatus$BatteryNotLow;", "Lcom/bamtech/sdk4/internal/media/offline/BatteryNotLowStatus;", "batteryPercentage", "", "(F)V", "getBatteryPercentage", "()F", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ConditionReporter.kt */
    public static final class BatteryNotLow extends BatteryNotLowStatus {
        public BatteryNotLow(float f) {
            super(Boolean.valueOf(true), null);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/BatteryNotLowStatus$NotOnBattery;", "Lcom/bamtech/sdk4/internal/media/offline/BatteryNotLowStatus;", "()V", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ConditionReporter.kt */
    public static final class NotOnBattery extends BatteryNotLowStatus {
        public NotOnBattery() {
            super(Boolean.valueOf(true), null);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/BatteryNotLowStatus$Unknown;", "Lcom/bamtech/sdk4/internal/media/offline/BatteryNotLowStatus;", "conditionMet", "", "(Z)V", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ConditionReporter.kt */
    public static final class Unknown extends BatteryNotLowStatus {
        public Unknown(boolean z) {
            super(Boolean.valueOf(z), null);
        }
    }

    private BatteryNotLowStatus(Boolean bool) {
        this.conditionMetIfSet = bool;
    }

    public final Boolean getConditionMetIfSet() {
        return this.conditionMetIfSet;
    }

    public /* synthetic */ BatteryNotLowStatus(Boolean bool, DefaultConstructorMarker defaultConstructorMarker) {
        this(bool);
    }
}
