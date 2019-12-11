package com.google.android.gms.common.util;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.internal.C9908u;

/* renamed from: com.google.android.gms.common.util.g */
public final class C9943g {
    static {
        new String[]{"android.", "com.android.", "dalvik.", "java.", "javax."};
    }

    /* renamed from: a */
    public static boolean m30975a(Context context, Throwable th) {
        return m30976a(context, th, 536870912);
    }

    /* renamed from: a */
    private static boolean m30976a(Context context, Throwable th, int i) {
        try {
            C9908u.m30853a(context);
            C9908u.m30853a(th);
            return false;
        } catch (Exception e) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
            return false;
        }
    }
}
