package com.bamtech.sdk4.internal.android.sinks;

import com.bamtech.core.logging.LogEvent;
import com.bamtech.core.logging.LogLevel;
import com.bamtech.core.logging.LogSink;
import com.bamtech.sdk4.internal.telemetry.EventBuffer;
import com.bamtech.sdk4.internal.telemetry.RequestType;
import com.bamtech.sdk4.internal.telemetry.dust.DustEvent;
import com.bamtech.shadow.dagger.Lazy;
import kotlin.C13142s;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0002\b\u00030\tj\u0002`\nH\u0014J\u0018\u0010\u000b\u001a\u00020\f2\u000e\u0010\b\u001a\n\u0012\u0002\b\u00030\tj\u0002`\nH\u0014R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/android/sinks/DustLogSink;", "Lcom/bamtech/core/logging/LogSink;", "telemetryManager", "Lcom/bamtech/shadow/dagger/Lazy;", "Lcom/bamtech/sdk4/internal/telemetry/EventBuffer;", "(Lcom/bamtech/shadow/dagger/Lazy;)V", "isLoggable", "", "logEvent", "Lcom/bamtech/core/logging/LogEvent;", "Lcom/bamtech/core/logging/AnyEvent;", "log", "", "sdk_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: DustLogSink.kt */
public final class DustLogSink extends LogSink {
    private final Lazy<EventBuffer> telemetryManager;

    public DustLogSink(Lazy<EventBuffer> lazy) {
        this.telemetryManager = lazy;
    }

    /* access modifiers changed from: protected */
    public boolean isLoggable(LogEvent<?> logEvent) {
        if (logEvent.getData() instanceof DustEvent) {
            if (C13174k.m40393b((Object[]) new LogLevel[]{LogLevel.INFO, LogLevel.ERROR, LogLevel.WARN}, (Object) logEvent.getLevel())) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void log(LogEvent<?> logEvent) {
        EventBuffer eventBuffer = (EventBuffer) this.telemetryManager.get();
        Object data = logEvent.getData();
        if (data != null) {
            eventBuffer.postEvent((DustEvent) data, RequestType.SequenceRequest);
            return;
        }
        throw new C13142s("null cannot be cast to non-null type com.bamtech.sdk4.internal.telemetry.dust.DustEvent<*, *>");
    }
}
