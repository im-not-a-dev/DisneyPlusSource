package com.bamtech.sdk4.internal.media.offline;

import com.bamtech.core.annotations.android.DontObfuscate;
import kotlin.Metadata;

@DontObfuscate
@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\b\t\nB\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0001\u0003\u000b\f\r¨\u0006\u000e"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/StorageStatus;", "", "conditionMetIfSet", "", "(Ljava/lang/Boolean;)V", "getConditionMetIfSet", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "SpaceLow", "SpaceOk", "Unknown", "Lcom/bamtech/sdk4/internal/media/offline/StorageStatus$Unknown;", "Lcom/bamtech/sdk4/internal/media/offline/StorageStatus$SpaceOk;", "Lcom/bamtech/sdk4/internal/media/offline/StorageStatus$SpaceLow;", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ConditionReporter.kt */
public abstract class StorageStatus {
    private final Boolean conditionMetIfSet;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/StorageStatus$SpaceLow;", "Lcom/bamtech/sdk4/internal/media/offline/StorageStatus;", "()V", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ConditionReporter.kt */
    public static final class SpaceLow extends StorageStatus {
        public SpaceLow() {
            super(Boolean.valueOf(false), null);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/StorageStatus$SpaceOk;", "Lcom/bamtech/sdk4/internal/media/offline/StorageStatus;", "()V", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ConditionReporter.kt */
    public static final class SpaceOk extends StorageStatus {
        public SpaceOk() {
            super(Boolean.valueOf(true), null);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/offline/StorageStatus$Unknown;", "Lcom/bamtech/sdk4/internal/media/offline/StorageStatus;", "()V", "plugin-offline-media_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: ConditionReporter.kt */
    public static final class Unknown extends StorageStatus {
        public Unknown() {
            super(Boolean.valueOf(false), null);
        }
    }

    private StorageStatus(Boolean bool) {
        this.conditionMetIfSet = bool;
    }

    public final Boolean getConditionMetIfSet() {
        return this.conditionMetIfSet;
    }

    public /* synthetic */ StorageStatus(Boolean bool, DefaultConstructorMarker defaultConstructorMarker) {
        this(bool);
    }
}
