package com.bamtech.sdk4.internal.configuration;

import com.bamtech.sdk4.internal.telemetry.dust.Dust$Events;
import com.bamtech.sdk4.internal.telemetry.dust.DustConfigSettings;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0007\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, mo31007d2 = {"TELEMETRY_POST_STREAM_SAMPLE", "", "Lcom/bamtech/sdk4/internal/telemetry/dust/Dust$Events;", "getTELEMETRY_POST_STREAM_SAMPLE", "(Lcom/bamtech/sdk4/internal/telemetry/dust/Dust$Events;)Ljava/lang/String;", "toDustConfigSettings", "Lcom/bamtech/sdk4/internal/telemetry/dust/DustConfigSettings;", "Lcom/bamtech/sdk4/internal/configuration/TelemetryServiceConfiguration;", "sdk-configuration"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* compiled from: TelemetryServiceConfiguration.kt */
public final class TelemetryServiceConfigurationKt {
    public static final String getTELEMETRY_POST_STREAM_SAMPLE(Dust$Events dust$Events) {
        return "urn:bamtech:dust:bamsdk:service:telemetry:postEvent";
    }

    public static final DustConfigSettings toDustConfigSettings(TelemetryServiceConfiguration telemetryServiceConfiguration) {
        return new DustConfigSettings(telemetryServiceConfiguration.getExtras().getDustConfiguration().getMaximumStackTraceElements());
    }
}
