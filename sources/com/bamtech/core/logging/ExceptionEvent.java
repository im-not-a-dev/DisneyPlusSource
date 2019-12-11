package com.bamtech.core.logging;

import java.lang.Throwable;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 2}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B)\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000b¨\u0006\f"}, mo31007d2 = {"Lcom/bamtech/core/logging/ExceptionEvent;", "T", "", "Lcom/bamtech/core/logging/LogEvent;", "name", "", "throwable", "level", "Lcom/bamtech/core/logging/LogLevel;", "isPublic", "", "(Ljava/lang/String;Ljava/lang/Throwable;Lcom/bamtech/core/logging/LogLevel;Z)V", "logging"}, mo31008k = 1, mo31009mv = {1, 1, 9})
/* compiled from: LogEvent.kt */
public final class ExceptionEvent<T extends Throwable> extends LogEvent<T> {
    public /* synthetic */ ExceptionEvent(String str, Throwable th, LogLevel logLevel, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            logLevel = LogLevel.ERROR;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        this(str, th, logLevel, z);
    }

    public ExceptionEvent(String str, T t, LogLevel logLevel, boolean z) {
        super(LogEventKt.getThrowerName(t), str, t, logLevel, z);
    }
}
