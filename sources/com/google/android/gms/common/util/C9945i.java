package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;

/* renamed from: com.google.android.gms.common.util.i */
public final class C9945i {

    /* renamed from: a */
    private static Boolean f23217a;

    /* renamed from: b */
    private static Boolean f23218b;

    /* renamed from: c */
    private static Boolean f23219c;

    @TargetApi(21)
    /* renamed from: a */
    public static boolean m30982a(Context context) {
        if (f23218b == null) {
            f23218b = Boolean.valueOf(C9948l.m30994g() && context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f23218b.booleanValue();
    }

    @TargetApi(20)
    /* renamed from: b */
    public static boolean m30983b(Context context) {
        if (f23217a == null) {
            f23217a = Boolean.valueOf(C9948l.m30993f() && context.getPackageManager().hasSystemFeature("android.hardware.type.watch"));
        }
        return f23217a.booleanValue();
    }

    @TargetApi(26)
    /* renamed from: c */
    public static boolean m30984c(Context context) {
        return m30983b(context) && (!C9948l.m30995h() || (m30982a(context) && !C9948l.m30996i()));
    }

    /* renamed from: d */
    public static boolean m30985d(Context context) {
        if (f23219c == null) {
            f23219c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
        }
        return f23219c.booleanValue();
    }

    /* renamed from: a */
    public static boolean m30981a() {
        return "user".equals(Build.TYPE);
    }
}
