package com.appboy.p033s;

import android.content.Context;

/* renamed from: com.appboy.s.g */
public class C1561g {

    /* renamed from: a */
    private static String f5712a;

    static {
        C1557c.m7461a(C1561g.class);
    }

    /* renamed from: a */
    public static String m7481a(Context context) {
        String str = f5712a;
        if (str != null) {
            return str;
        }
        f5712a = context.getPackageName();
        return f5712a;
    }
}
