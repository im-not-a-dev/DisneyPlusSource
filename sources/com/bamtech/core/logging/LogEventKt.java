package com.bamtech.core.logging;

import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 2}, mo31006d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001b\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0006*\u00020\u0007*\u0002H\u0006H\u0000¢\u0006\u0002\u0010\b\u001a\u001b\u0010\t\u001a\u00020\u0004\"\b\b\u0000\u0010\u0006*\u00020\n*\u0002H\u0006H\u0000¢\u0006\u0002\u0010\u000b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000*\u0012\u0010\f\"\u0006\u0012\u0002\b\u00030\r2\u0006\u0012\u0002\b\u00030\r¨\u0006\u000e"}, mo31007d2 = {"ANONYMOUS_CLASS", "Ljava/util/regex/Pattern;", "cleanAnonymousClass", "Lkotlin/Function1;", "", "getName", "T", "", "(Ljava/lang/Object;)Ljava/lang/String;", "getThrowerName", "", "(Ljava/lang/Throwable;)Ljava/lang/String;", "AnyEvent", "Lcom/bamtech/core/logging/LogEvent;", "logging"}, mo31008k = 2, mo31009mv = {1, 1, 9})
/* compiled from: LogEvent.kt */
public final class LogEventKt {
    /* access modifiers changed from: private */
    public static final Pattern ANONYMOUS_CLASS;
    private static final Function1<String, String> cleanAnonymousClass = LogEventKt$cleanAnonymousClass$1.INSTANCE;

    static {
        Pattern compile = Pattern.compile("(\\$\\d+$)");
        Intrinsics.checkReturnedValueIsNotNull((Object) compile, "Pattern.compile(\"(\\\\$\\\\d+$)\")");
        ANONYMOUS_CLASS = compile;
    }

    public static final <T> String getName(T t) {
        String str;
        if (t instanceof Class) {
            str = (String) cleanAnonymousClass.invoke(((Class) t).getName());
        } else {
            str = t.toString();
        }
        return C12833x.m40163b(str, "@", (String) null, 2, (Object) null);
    }

    public static final <T extends Throwable> String getThrowerName(T t) {
        StackTraceElement stackTraceElement = t.getStackTrace()[0];
        Intrinsics.checkReturnedValueIsNotNull((Object) stackTraceElement, "element");
        return (String) cleanAnonymousClass.invoke(stackTraceElement.getClassName());
    }
}
