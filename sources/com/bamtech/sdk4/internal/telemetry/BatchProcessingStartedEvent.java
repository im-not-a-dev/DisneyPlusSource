package com.bamtech.sdk4.internal.telemetry;

import com.bamtech.core.logging.LogEvent;
import com.bamtech.core.logging.LogLevel;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\f\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u0003B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\b¨\u0006\t"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/telemetry/BatchProcessingStartedEvent;", "Lcom/bamtech/core/logging/LogEvent;", "", "Lcom/bamtech/sdk4/internal/telemetry/MetricEvent;", "source", "queueSize", "", "batchSize", "(Ljava/lang/Object;II)V", "extension-telemetry"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: TelemetryMetrics.kt */
public final class BatchProcessingStartedEvent extends LogEvent<Object> {
    public BatchProcessingStartedEvent(Object obj, int i, int i2) {
        Pair[] pairArr = {C12907r.m40244a("queueSize", Integer.valueOf(i)), C12907r.m40244a("batchSize", Integer.valueOf(i2))};
        Object obj2 = obj;
        super(obj2, "Queue Processing Started", C13173j0.m40356a(pairArr), LogLevel.DEBUG, false, 16, null);
    }
}
