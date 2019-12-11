package com.bamtech.sdk4.internal.telemetry;

import com.bamtech.core.logging.LogEvent;
import com.bamtech.core.logging.LogLevel;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\f\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u0003B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/telemetry/EventAddedToQueueEvent;", "Lcom/bamtech/core/logging/LogEvent;", "", "Lcom/bamtech/sdk4/internal/telemetry/MetricEvent;", "source", "event", "Lcom/bamtech/sdk4/internal/telemetry/TelemetryEvent;", "(Ljava/lang/Object;Lcom/bamtech/sdk4/internal/telemetry/TelemetryEvent;)V", "extension-telemetry"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: TelemetryMetrics.kt */
public final class EventAddedToQueueEvent extends LogEvent<Object> {
    public EventAddedToQueueEvent(Object obj, TelemetryEvent<?, ?> telemetryEvent) {
        Object obj2 = obj;
        super(obj2, "Event Added to Queue", telemetryEvent.toString(), LogLevel.DEBUG, false, 16, null);
    }
}
