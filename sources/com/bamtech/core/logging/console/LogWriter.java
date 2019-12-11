package com.bamtech.core.logging.console;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 2}, mo31006d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0007H&J\u001a\u0010\t\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0007H&J\u001a\u0010\t\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, mo31007d2 = {"Lcom/bamtech/core/logging/console/LogWriter;", "", "println", "", "priority", "", "tag", "", "message", "wtf", "t", "", "logging-console_release"}, mo31008k = 1, mo31009mv = {1, 1, 9})
/* compiled from: LogWriter.kt */
public interface LogWriter {
    void println(int i, String str, String str2);

    void wtf(String str, Throwable th);
}
