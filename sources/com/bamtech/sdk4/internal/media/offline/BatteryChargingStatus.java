package com.bamtech.sdk4.internal.media.offline;

import com.bamtech.core.annotations.android.DontObfuscate;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\b\t\n\u000b\f\rB\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0001\u0006\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/BatteryChargingStatus;", "", "conditionMetIfSet", "", "(Ljava/lang/Boolean;)V", "getConditionMetIfSet", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "Charging", "Full", "NotFull", "OtherBatterySource", "Unknown", "Using", "Lcom/bamtech/sdk4/internal/media/offline/BatteryChargingStatus$Unknown;", "Lcom/bamtech/sdk4/internal/media/offline/BatteryChargingStatus$Charging;", "Lcom/bamtech/sdk4/internal/media/offline/BatteryChargingStatus$Full;", "Lcom/bamtech/sdk4/internal/media/offline/BatteryChargingStatus$NotFull;", "Lcom/bamtech/sdk4/internal/media/offline/BatteryChargingStatus$Using;", "Lcom/bamtech/sdk4/internal/media/offline/BatteryChargingStatus$OtherBatterySource;", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ConditionReporter.kt */
public abstract class BatteryChargingStatus {
    private final Boolean conditionMetIfSet;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/BatteryChargingStatus$Charging;", "Lcom/bamtech/sdk4/internal/media/offline/BatteryChargingStatus;", "()V", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ConditionReporter.kt */
    public static final class Charging extends BatteryChargingStatus {
        public Charging() {
            super(Boolean.valueOf(true), null);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/BatteryChargingStatus$Full;", "Lcom/bamtech/sdk4/internal/media/offline/BatteryChargingStatus;", "()V", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ConditionReporter.kt */
    public static final class Full extends BatteryChargingStatus {
        public Full() {
            super(Boolean.valueOf(true), null);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/BatteryChargingStatus$NotFull;", "Lcom/bamtech/sdk4/internal/media/offline/BatteryChargingStatus;", "extraStatus", "", "(Ljava/lang/Integer;)V", "getExtraStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ConditionReporter.kt */
    public static final class NotFull extends BatteryChargingStatus {
        public NotFull(Integer num) {
            super(Boolean.valueOf(false), null);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/BatteryChargingStatus$OtherBatterySource;", "Lcom/bamtech/sdk4/internal/media/offline/BatteryChargingStatus;", "()V", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ConditionReporter.kt */
    public static final class OtherBatterySource extends BatteryChargingStatus {
        public OtherBatterySource() {
            super(Boolean.valueOf(true), null);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/BatteryChargingStatus$Unknown;", "Lcom/bamtech/sdk4/internal/media/offline/BatteryChargingStatus;", "conditionMet", "", "(Z)V", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ConditionReporter.kt */
    public static final class Unknown extends BatteryChargingStatus {
        public Unknown(boolean z) {
            super(Boolean.valueOf(z), null);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/BatteryChargingStatus$Using;", "Lcom/bamtech/sdk4/internal/media/offline/BatteryChargingStatus;", "()V", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ConditionReporter.kt */
    public static final class Using extends BatteryChargingStatus {
        public Using() {
            super(Boolean.valueOf(false), null);
        }
    }

    private BatteryChargingStatus(Boolean bool) {
        this.conditionMetIfSet = bool;
    }

    public final Boolean getConditionMetIfSet() {
        return this.conditionMetIfSet;
    }

    public /* synthetic */ BatteryChargingStatus(Boolean bool, DefaultConstructorMarker defaultConstructorMarker) {
        this(bool);
    }
}
