package com.bamtech.sdk4.internal.android;

import com.bamtech.sdk4.internal.configuration.BootstrapConfiguration;
import com.bamtech.sdk4.internal.telemetry.dust.DustClientConstants;
import com.bamtech.sdk4.internal.telemetry.dust.DustClientConstants.Application;
import com.bamtech.sdk4.internal.telemetry.dust.DustClientConstants.Device;
import com.bamtech.sdk4.internal.telemetry.dust.DustClientConstants.Sdk;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, mo31007d2 = {"com/bamtech/sdk4/internal/android/DustModule$baseDustClient$1", "Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientConstants;", "application", "Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientConstants$Application;", "getApplication", "()Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientConstants$Application;", "correlationIds", "", "", "getCorrelationIds", "()Ljava/util/Map;", "device", "Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientConstants$Device;", "getDevice", "()Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientConstants$Device;", "sdk", "Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientConstants$Sdk;", "getSdk", "()Lcom/bamtech/sdk4/internal/telemetry/dust/DustClientConstants$Sdk;", "sdk_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DustModule.kt */
public final class DustModule$baseDustClient$1 implements DustClientConstants {
    final /* synthetic */ BootstrapConfiguration $bootstrapConfiguration;
    private final Map<String, String> correlationIds;

    DustModule$baseDustClient$1(BootstrapConfiguration bootstrapConfiguration, Map map) {
        this.$bootstrapConfiguration = bootstrapConfiguration;
        this.correlationIds = map;
    }

    public Application getApplication() {
        return new Application(this.$bootstrapConfiguration.getApplicationId(), this.$bootstrapConfiguration.getApplicationVersion(), this.$bootstrapConfiguration.getApplicationName());
    }

    public Map<String, String> getCorrelationIds() {
        return this.correlationIds;
    }

    public Device getDevice() {
        Device device = new Device(this.$bootstrapConfiguration.getDevice().getBrand(), this.$bootstrapConfiguration.getDevice().getManufacturer(), this.$bootstrapConfiguration.getDevice().getModel(), this.$bootstrapConfiguration.getDevice().getProduct(), this.$bootstrapConfiguration.getDevice().getOs(), this.$bootstrapConfiguration.getDevice().getDeviceType());
        return device;
    }

    public Sdk getSdk() {
        return new Sdk("v4.7.4", "android");
    }
}
