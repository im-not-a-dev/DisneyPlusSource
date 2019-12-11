package com.bamtech.sdk4.internal.android.sinks;

import com.bamtech.core.logging.LogEvent;
import com.bamtech.core.logging.console.AndroidLogWriter;
import com.bamtech.core.logging.console.ConsoleLogSink;
import com.bamtech.sdk4.internal.configuration.BootstrapConfiguration;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/android/sinks/BamLogcatLogSink;", "Lcom/bamtech/core/logging/console/ConsoleLogSink;", "bootstrapConfiguration", "Lcom/bamtech/sdk4/internal/configuration/BootstrapConfiguration;", "(Lcom/bamtech/sdk4/internal/configuration/BootstrapConfiguration;)V", "isLoggable", "", "logEvent", "Lcom/bamtech/core/logging/LogEvent;", "sdk_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: BamLogcatLogSink.kt */
public final class BamLogcatLogSink extends ConsoleLogSink {
    private final BootstrapConfiguration bootstrapConfiguration;

    public BamLogcatLogSink(BootstrapConfiguration bootstrapConfiguration2) {
        super(new AndroidLogWriter("[BAM-SDK]"));
        this.bootstrapConfiguration = bootstrapConfiguration2;
    }

    /* access modifiers changed from: protected */
    public boolean isLoggable(LogEvent<?> logEvent) {
        return this.bootstrapConfiguration.getEnableDebugLogging() || logEvent.isPublic();
    }
}
