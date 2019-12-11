package com.bamtech.core.logging;

import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;

@Metadata(mo31005bv = {1, 0, 2}, mo31006d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo31007d2 = {"<anonymous>", "", "it", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 9})
/* compiled from: LogEvent.kt */
final class LogEventKt$cleanAnonymousClass$1 extends C12881k implements Function1<String, String> {
    public static final LogEventKt$cleanAnonymousClass$1 INSTANCE = new LogEventKt$cleanAnonymousClass$1();

    LogEventKt$cleanAnonymousClass$1() {
        super(1);
    }

    public final String invoke(String str) {
        Matcher matcher = LogEventKt.ANONYMOUS_CLASS.matcher(str);
        if (!matcher.find()) {
            return str;
        }
        String replaceAll = matcher.replaceAll("");
        Intrinsics.checkReturnedValueIsNotNull((Object) replaceAll, "m.replaceAll(\"\")");
        return replaceAll;
    }
}
