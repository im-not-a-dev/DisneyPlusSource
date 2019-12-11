package com.google.android.exoplayer2.p393v0;

import android.text.TextUtils;
import android.util.Log;

/* renamed from: com.google.android.exoplayer2.v0.q */
/* compiled from: Log */
public final class C9563q {

    /* renamed from: a */
    private static int f22301a = 0;

    /* renamed from: b */
    private static boolean f22302b = true;

    /* renamed from: a */
    public static void m29495a(String str, String str2) {
        if (f22301a == 0) {
            Log.d(str, str2);
        }
    }

    /* renamed from: b */
    public static void m29498b(String str, String str2, Throwable th) {
        if (!f22302b) {
            m29500d(str, m29494a(str2, th));
        } else if (f22301a <= 2) {
            Log.w(str, str2, th);
        }
    }

    /* renamed from: c */
    public static void m29499c(String str, String str2) {
        if (f22301a <= 1) {
            Log.i(str, str2);
        }
    }

    /* renamed from: d */
    public static void m29500d(String str, String str2) {
        if (f22301a <= 2) {
            Log.w(str, str2);
        }
    }

    /* renamed from: a */
    public static void m29496a(String str, String str2, Throwable th) {
        if (!f22302b) {
            m29497b(str, m29494a(str2, th));
        } else if (f22301a <= 3) {
            Log.e(str, str2, th);
        }
    }

    /* renamed from: b */
    public static void m29497b(String str, String str2) {
        if (f22301a <= 3) {
            Log.e(str, str2);
        }
    }

    /* renamed from: a */
    private static String m29494a(String str, Throwable th) {
        if (th == null) {
            return str;
        }
        String message = th.getMessage();
        if (!TextUtils.isEmpty(message)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" - ");
            sb.append(message);
            str = sb.toString();
        }
        return str;
    }
}
