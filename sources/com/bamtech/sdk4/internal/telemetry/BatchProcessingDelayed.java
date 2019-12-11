package com.bamtech.sdk4.internal.telemetry;

import com.bamtech.core.logging.LogEvent;
import com.bamtech.core.logging.LogLevel;
import java.util.Map;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001:\u0001\rB%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\f¨\u0006\u000e"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/telemetry/BatchProcessingDelayed;", "Lcom/bamtech/core/logging/LogEvent;", "", "", "", "source", "queueSize", "", "delay", "", "reason", "Lcom/bamtech/sdk4/internal/telemetry/BatchProcessingDelayed$DelayReason;", "(Ljava/lang/Object;IJLcom/bamtech/sdk4/internal/telemetry/BatchProcessingDelayed$DelayReason;)V", "DelayReason", "extension-telemetry"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: TelemetryMetrics.kt */
public final class BatchProcessingDelayed extends LogEvent<Map<String, ? extends Object>> {

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/telemetry/BatchProcessingDelayed$DelayReason;", "", "(Ljava/lang/String;I)V", "HEADER_DIRECTIVE", "FALLBACK", "EXCEPTION", "extension-telemetry"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: TelemetryMetrics.kt */
    public enum DelayReason {
        HEADER_DIRECTIVE,
        FALLBACK
    }

    public BatchProcessingDelayed(Object obj, int i, long j, DelayReason delayReason) {
        Pair[] pairArr = {C12907r.m40244a("queueSize", Integer.valueOf(i)), C12907r.m40244a("delay", Long.valueOf(j)), C12907r.m40244a("reason", delayReason.name())};
        Object obj2 = obj;
        super(obj2, "Batch Processing Delayed", C13173j0.m40356a(pairArr), LogLevel.DEBUG, false, 16, null);
    }
}
