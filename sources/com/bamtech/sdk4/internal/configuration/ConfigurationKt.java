package com.bamtech.sdk4.internal.configuration;

import com.bamtech.sdk4.internal.telemetry.dust.DustConfigSettings;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, mo31007d2 = {"toDustConfigSettings", "Lcom/bamtech/sdk4/internal/telemetry/dust/DustConfigSettings;", "Lcom/bamtech/sdk4/internal/configuration/Configuration;", "sdk-configuration"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* compiled from: Configuration.kt */
public final class ConfigurationKt {
    public static final DustConfigSettings toDustConfigSettings(Configuration configuration) {
        return new DustConfigSettings(configuration.getServices().getTelemetry().getExtras().getDustConfiguration().getMaximumStackTraceElements());
    }
}
