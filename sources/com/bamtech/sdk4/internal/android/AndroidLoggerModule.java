package com.bamtech.sdk4.internal.android;

import com.bamtech.core.logging.LogSink.Collection;
import com.bamtech.sdk4.internal.android.sinks.BamLogcatLogSink;
import com.bamtech.sdk4.internal.android.sinks.DustLogSink;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/android/AndroidLoggerModule;", "", "()V", "sinks", "Lcom/bamtech/core/logging/LogSink$Collection;", "logcatSink", "Lcom/bamtech/sdk4/internal/android/sinks/BamLogcatLogSink;", "dustLogSink", "Lcom/bamtech/sdk4/internal/android/sinks/DustLogSink;", "sdk_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: AndroidLoggerModule.kt */
public final class AndroidLoggerModule {
    public final Collection sinks(BamLogcatLogSink bamLogcatLogSink, DustLogSink dustLogSink) {
        return Collection.Companion.mo7376of(bamLogcatLogSink, dustLogSink);
    }
}
