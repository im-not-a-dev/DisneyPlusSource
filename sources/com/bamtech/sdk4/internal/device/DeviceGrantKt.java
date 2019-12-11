package com.bamtech.sdk4.internal.device;

import com.bamtech.sdk4.internal.core.Storage;
import com.bamtech.sdk4.internal.core.Storage.DefaultImpls;
import com.bamtech.sdk4.token.Grant;
import kotlin.Metadata;
import kotlin.jvm.internal.C12895y;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0000\u001a\u000e\u0010\u0007\u001a\u0004\u0018\u00010\b*\u00020\u0002H\u0000\u001a\u0014\u0010\t\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\f"}, mo31007d2 = {"DEVICE_GRANT", "", "Lcom/bamtech/sdk4/internal/core/Storage;", "getDEVICE_GRANT", "(Lcom/bamtech/sdk4/internal/core/Storage;)Ljava/lang/String;", "clearDeviceGrant", "", "getExistingDeviceGrant", "Lcom/bamtech/sdk4/internal/device/DeviceGrant;", "saveDeviceGrant", "deviceGrant", "Lcom/bamtech/sdk4/token/Grant;", "sdk-core-api_release"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* compiled from: DeviceGrant.kt */
public final class DeviceGrantKt {
    public static final void clearDeviceGrant(Storage storage) {
        storage.remove(getDEVICE_GRANT(storage));
    }

    private static final String getDEVICE_GRANT(Storage storage) {
        return "DEVICE_GRANT";
    }

    public static final DeviceGrant getExistingDeviceGrant(Storage storage) {
        return (DeviceGrant) DefaultImpls.get$default(storage, getDEVICE_GRANT(storage), C12895y.m40230a(DeviceGrant.class), null, 4, null);
    }

    public static final void saveDeviceGrant(Storage storage, Grant grant) {
        DefaultImpls.save$default(storage, getDEVICE_GRANT(storage), grant, null, 4, null);
    }
}
