package com.bamtech.sdk4.internal.telemetry;

import com.bamtech.core.logging.LogEvent;
import kotlin.C12907r;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\f\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/telemetry/QueueTrimmed;", "Lcom/bamtech/core/logging/LogEvent;", "", "Lcom/bamtech/sdk4/internal/telemetry/MetricEvent;", "source", "deletedCount", "", "(Ljava/lang/Object;I)V", "extension-telemetry"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: TelemetryMetrics.kt */
public final class QueueTrimmed extends LogEvent<Object> {
    public QueueTrimmed(Object obj, int i) {
        String str = "Queue was over limit and trimmed";
        Object obj2 = obj;
        super(obj2, str, C13170i0.m40332a(C12907r.m40244a("deletedCount", Integer.valueOf(i))), null, false, 24, null);
    }
}
