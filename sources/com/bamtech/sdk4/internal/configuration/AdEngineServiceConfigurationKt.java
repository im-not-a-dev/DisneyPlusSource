package com.bamtech.sdk4.internal.configuration;

import com.bamtech.sdk4.internal.telemetry.dust.Dust$Events;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo31007d2 = {"AD_ENGINE_SET_TOKEN", "", "Lcom/bamtech/sdk4/internal/telemetry/dust/Dust$Events;", "getAD_ENGINE_SET_TOKEN", "(Lcom/bamtech/sdk4/internal/telemetry/dust/Dust$Events;)Ljava/lang/String;", "sdk-configuration"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* compiled from: AdEngineServiceConfiguration.kt */
public final class AdEngineServiceConfigurationKt {
    public static final String getAD_ENGINE_SET_TOKEN(Dust$Events dust$Events) {
        return "service:adEngine:setToken";
    }
}
