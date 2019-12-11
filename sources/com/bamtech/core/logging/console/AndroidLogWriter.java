package com.bamtech.core.logging.console;

import android.util.Log;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 2}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0016J\u001a\u0010\r\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0016J\u001a\u0010\r\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtech/core/logging/console/AndroidLogWriter;", "Lcom/bamtech/core/logging/console/LogWriter;", "prefix", "", "(Ljava/lang/String;)V", "getPrefix", "()Ljava/lang/String;", "println", "", "priority", "", "tag", "message", "wtf", "t", "", "logging-console_release"}, mo31008k = 1, mo31009mv = {1, 1, 9})
/* compiled from: AndroidLogWriter.kt */
public final class AndroidLogWriter implements LogWriter {
    private final String prefix;

    public AndroidLogWriter(String str) {
        this.prefix = str;
    }

    public void println(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        String str3 = "";
        sb.append(str3);
        sb.append(this.prefix);
        sb.append(str3);
        sb.append(str);
        Log.println(i, sb.toString(), str2);
    }

    public void wtf(String str, Throwable th) {
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        sb.append(str2);
        sb.append(this.prefix);
        sb.append(str2);
        sb.append(str);
        Log.wtf(sb.toString(), th);
    }
}
