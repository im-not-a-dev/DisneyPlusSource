package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.util.C9957r;

/* renamed from: com.google.android.gms.common.internal.u */
public final class C9908u {
    /* renamed from: a */
    public static <T> T m30853a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null reference");
    }

    /* renamed from: b */
    public static String m30863b(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    /* renamed from: c */
    public static void m30867c(String str) {
        if (C9957r.m31004a()) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: a */
    public static String m30855a(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    /* renamed from: b */
    public static void m30864b(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public static <T> T m30854a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: b */
    public static void m30865b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static int m30852a(int i) {
        if (i != 0) {
            return i;
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    /* renamed from: b */
    public static void m30866b(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    /* renamed from: a */
    public static void m30861a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static void m30862a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    /* renamed from: a */
    public static void m30860a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public static void m30859a(String str) {
        if (!C9957r.m31004a()) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: a */
    public static void m30856a() {
        m30867c("Must not be called on the main application thread");
    }

    /* renamed from: a */
    public static void m30857a(Handler handler) {
        m30858a(handler, "Must be called on the handler thread");
    }

    /* renamed from: a */
    public static void m30858a(Handler handler, String str) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException(str);
        }
    }
}
