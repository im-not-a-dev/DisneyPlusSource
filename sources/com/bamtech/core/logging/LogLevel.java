package com.bamtech.core.logging;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 2}, mo31006d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, mo31007d2 = {"Lcom/bamtech/core/logging/LogLevel;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "NONE", "ERROR", "WARN", "INFO", "DEBUG", "TRACE", "VERBOSE", "logging"}, mo31008k = 1, mo31009mv = {1, 1, 9})
/* compiled from: LogLevel.kt */
public enum LogLevel {
    NONE(0),
    ERROR(1),
    WARN(2),
    INFO(3),
    DEBUG(4),
    TRACE(5),
    VERBOSE(5);

    protected LogLevel(int i) {
    }
}
