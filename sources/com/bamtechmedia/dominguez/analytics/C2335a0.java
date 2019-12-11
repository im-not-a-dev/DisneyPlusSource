package com.bamtechmedia.dominguez.analytics;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.bamtechmedia.dominguez.analytics.a0 */
/* compiled from: GlimpseTime.kt */
public final class C2335a0 {

    /* renamed from: a */
    private static final SimpleDateFormat f6534a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");

    /* renamed from: b */
    public static final C2335a0 f6535b = new C2335a0();

    private C2335a0() {
    }

    /* renamed from: a */
    public final String mo11444a() {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = f6534a;
        simpleDateFormat.setTimeZone(timeZone);
        String format = simpleDateFormat.format(new Date());
        Intrinsics.checkReturnedValueIsNotNull((Object) format, "dateFormat.format(Date())");
        Intrinsics.checkReturnedValueIsNotNull((Object) format, "run {\n            val ti….format(Date())\n        }");
        return format;
    }
}
