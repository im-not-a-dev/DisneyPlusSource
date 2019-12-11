package com.bamtech.core.logging.console;

import com.bamtech.core.logging.LogEvent;
import com.bamtech.core.logging.LogLevel;
import com.bamtech.core.logging.LogSink;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 2}, mo31006d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0016\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0002\b\u00030\bj\u0002`\tH\u0014J\u0018\u0010\n\u001a\u00020\u000b2\u000e\u0010\u0007\u001a\n\u0012\u0002\b\u00030\bj\u0002`\tH\u0014J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, mo31007d2 = {"Lcom/bamtech/core/logging/console/ConsoleLogSink;", "Lcom/bamtech/core/logging/LogSink;", "writer", "Lcom/bamtech/core/logging/console/LogWriter;", "(Lcom/bamtech/core/logging/console/LogWriter;)V", "isLoggable", "", "logEvent", "Lcom/bamtech/core/logging/LogEvent;", "Lcom/bamtech/core/logging/AnyEvent;", "log", "", "onError", "e", "", "Companion", "logging-console_release"}, mo31008k = 1, mo31009mv = {1, 1, 9})
/* compiled from: ConsoleLogSink.kt */
public class ConsoleLogSink extends LogSink {
    public static final Companion Companion = new Companion(null);
    /* access modifiers changed from: private */
    public static final int MAX_LOG_LENGTH = MAX_LOG_LENGTH;
    private final LogWriter writer;

    @Metadata(mo31005bv = {1, 0, 2}, mo31006d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo31007d2 = {"Lcom/bamtech/core/logging/console/ConsoleLogSink$Companion;", "", "()V", "MAX_LOG_LENGTH", "", "getMAX_LOG_LENGTH", "()I", "logging-console_release"}, mo31008k = 1, mo31009mv = {1, 1, 9})
    /* compiled from: ConsoleLogSink.kt */
    public static final class Companion {
        private Companion() {
        }

        public final int getMAX_LOG_LENGTH() {
            return ConsoleLogSink.MAX_LOG_LENGTH;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo31005bv = {1, 0, 2}, mo31008k = 3, mo31009mv = {1, 1, 9})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[LogLevel.values().length];

        static {
            $EnumSwitchMapping$0[LogLevel.TRACE.ordinal()] = 1;
            $EnumSwitchMapping$0[LogLevel.VERBOSE.ordinal()] = 2;
            $EnumSwitchMapping$0[LogLevel.DEBUG.ordinal()] = 3;
            $EnumSwitchMapping$0[LogLevel.INFO.ordinal()] = 4;
            $EnumSwitchMapping$0[LogLevel.WARN.ordinal()] = 5;
            $EnumSwitchMapping$0[LogLevel.ERROR.ordinal()] = 6;
        }
    }

    public ConsoleLogSink(LogWriter logWriter) {
        this.writer = logWriter;
    }

    /* access modifiers changed from: protected */
    public void log(LogEvent<?> logEvent) {
        int i;
        StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append(str);
        sb.append(logEvent.getName());
        sb.append(str);
        Object data = logEvent.getData();
        if (data != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" (");
            sb2.append(data);
            sb2.append(')');
            String sb3 = sb2.toString();
            if (sb3 != null) {
                str = sb3;
            }
        }
        sb.append(str);
        String sb4 = sb.toString();
        String source = logEvent.getSource();
        String source2 = logEvent.getSource();
        int b = C12833x.m40156b((CharSequence) source, '.', 0, false, 6, (Object) null) + 1;
        String str2 = "null cannot be cast to non-null type java.lang.String";
        if (source2 != null) {
            String substring = source2.substring(b);
            Intrinsics.checkReturnedValueIsNotNull((Object) substring, "(this as java.lang.String).substring(startIndex)");
            switch (WhenMappings.$EnumSwitchMapping$0[logEvent.getLevel().ordinal()]) {
                case 1:
                case 2:
                    i = 2;
                    break;
                case 3:
                    i = 3;
                    break;
                case 4:
                    i = 4;
                    break;
                case 5:
                    i = 5;
                    break;
                case 6:
                    i = 6;
                    break;
                default:
                    return;
            }
            if (sb4.length() < Companion.getMAX_LOG_LENGTH()) {
                this.writer.println(i, substring, sb4);
            } else {
                int length = sb4.length();
                int i2 = 0;
                while (i2 < length) {
                    int a = C12833x.m40128a((CharSequence) sb4, 10, i2, false, 4, (Object) null);
                    if (a == -1) {
                        a = length;
                    }
                    while (true) {
                        int min = Math.min(a, Companion.getMAX_LOG_LENGTH() + i2);
                        if (sb4 != null) {
                            String substring2 = sb4.substring(i2, min);
                            Intrinsics.checkReturnedValueIsNotNull((Object) substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            this.writer.println(i, substring, substring2);
                            if (min >= a) {
                                i2 = min + 1;
                            } else {
                                i2 = min;
                            }
                        } else {
                            throw new C13142s(str2);
                        }
                    }
                }
            }
            return;
        }
        throw new C13142s(str2);
    }

    public void onError(Throwable th) {
        this.writer.wtf(getClass().getName(), th);
    }
}
