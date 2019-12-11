package com.bamtech.sdk4.internal.telemetry;

import com.bamtech.core.logging.LogEvent;
import com.bamtech.core.logging.LogLevel;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\f\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/telemetry/TelemetryProcessingFailed;", "Lcom/bamtech/core/logging/LogEvent;", "", "Lcom/bamtech/sdk4/internal/telemetry/MetricEvent;", "source", "t", "", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "extension-telemetry"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: TelemetryMetrics.kt */
public final class TelemetryProcessingFailed extends LogEvent<Object> {
    public TelemetryProcessingFailed(Object obj, Throwable th) {
        Object obj2 = obj;
        super(obj2, "Telemetry processing is disabled", th, LogLevel.DEBUG, false, 16, null);
    }
}
