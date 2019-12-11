package com.bamtech.core.logging;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 2}, mo31006d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B7\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0000\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bB5\u0012\u0006\u0010\u0003\u001a\u00020\u0005\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0000\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\fJ\b\u0010\u0016\u001a\u00020\u0005H\u0016R\u0015\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0003\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0017"}, mo31007d2 = {"Lcom/bamtech/core/logging/LogEvent;", "T", "", "source", "name", "", "data", "level", "Lcom/bamtech/core/logging/LogLevel;", "isPublic", "", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Lcom/bamtech/core/logging/LogLevel;Z)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Lcom/bamtech/core/logging/LogLevel;Z)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "()Z", "getLevel", "()Lcom/bamtech/core/logging/LogLevel;", "getName", "()Ljava/lang/String;", "getSource", "toString", "logging"}, mo31008k = 1, mo31009mv = {1, 1, 9})
/* compiled from: LogEvent.kt */
public class LogEvent<T> {
    private final T data;
    private final boolean isPublic;
    private final LogLevel level;
    private final String name;
    private final String source;

    public LogEvent(String str, String str2, T t, LogLevel logLevel, boolean z) {
        this.source = str;
        this.name = str2;
        this.data = t;
        this.level = logLevel;
        this.isPublic = z;
    }

    public final T getData() {
        return this.data;
    }

    public final LogLevel getLevel() {
        return this.level;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSource() {
        return this.source;
    }

    public final boolean isPublic() {
        return this.isPublic;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LogEvent(source='");
        sb.append(this.source);
        sb.append("', level=");
        sb.append(this.level);
        sb.append(", name='");
        sb.append(this.name);
        sb.append("', data=");
        sb.append(this.data);
        sb.append(", isPublic=");
        sb.append(this.isPublic);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ LogEvent(Object obj, String str, Object obj2, LogLevel logLevel, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            obj2 = null;
        }
        Object obj3 = obj2;
        if ((i & 8) != 0) {
            logLevel = LogLevel.DEBUG;
        }
        this(obj, str, (T) obj3, logLevel, (i & 16) != 0 ? false : z);
    }

    public LogEvent(Object obj, String str, T t, LogLevel logLevel, boolean z) {
        this(LogEventKt.getName(obj), str, t, logLevel, z);
    }
}
