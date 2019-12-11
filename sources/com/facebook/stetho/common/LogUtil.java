package com.facebook.stetho.common;

import java.util.Locale;

public class LogUtil {
    private static final String TAG = "stetho";

    /* renamed from: d */
    public static void m24840d(String str, Object... objArr) {
        m24839d(format(str, objArr));
    }

    /* renamed from: e */
    public static void m24844e(String str, Object... objArr) {
        m24843e(format(str, objArr));
    }

    private static String format(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* renamed from: i */
    public static void m24848i(String str, Object... objArr) {
        m24847i(format(str, objArr));
    }

    public static boolean isLoggable(int i) {
        if (i == 5 || i == 6) {
            return true;
        }
        return LogRedirector.isLoggable(TAG, i);
    }

    /* renamed from: v */
    public static void m24852v(String str, Object... objArr) {
        m24851v(format(str, objArr));
    }

    /* renamed from: w */
    public static void m24856w(String str, Object... objArr) {
        m24855w(format(str, objArr));
    }

    /* renamed from: d */
    public static void m24842d(Throwable th, String str, Object... objArr) {
        m24841d(th, format(str, objArr));
    }

    /* renamed from: e */
    public static void m24846e(Throwable th, String str, Object... objArr) {
        m24845e(th, format(str, objArr));
    }

    /* renamed from: i */
    public static void m24850i(Throwable th, String str, Object... objArr) {
        m24849i(th, format(str, objArr));
    }

    /* renamed from: v */
    public static void m24854v(Throwable th, String str, Object... objArr) {
        m24853v(th, format(str, objArr));
    }

    /* renamed from: w */
    public static void m24858w(Throwable th, String str, Object... objArr) {
        m24857w(th, format(str, objArr));
    }

    /* renamed from: d */
    public static void m24839d(String str) {
        if (isLoggable(3)) {
            LogRedirector.m24829d(TAG, str);
        }
    }

    /* renamed from: e */
    public static void m24843e(String str) {
        if (isLoggable(6)) {
            LogRedirector.m24831e(TAG, str);
        }
    }

    /* renamed from: i */
    public static void m24847i(String str) {
        if (isLoggable(4)) {
            LogRedirector.m24833i(TAG, str);
        }
    }

    /* renamed from: v */
    public static void m24851v(String str) {
        if (isLoggable(2)) {
            LogRedirector.m24835v(TAG, str);
        }
    }

    /* renamed from: w */
    public static void m24855w(String str) {
        if (isLoggable(5)) {
            LogRedirector.m24837w(TAG, str);
        }
    }

    /* renamed from: d */
    public static void m24841d(Throwable th, String str) {
        if (isLoggable(3)) {
            LogRedirector.m24830d(TAG, str, th);
        }
    }

    /* renamed from: e */
    public static void m24845e(Throwable th, String str) {
        if (isLoggable(6)) {
            LogRedirector.m24832e(TAG, str, th);
        }
    }

    /* renamed from: i */
    public static void m24849i(Throwable th, String str) {
        if (isLoggable(4)) {
            LogRedirector.m24834i(TAG, str, th);
        }
    }

    /* renamed from: v */
    public static void m24853v(Throwable th, String str) {
        if (isLoggable(2)) {
            LogRedirector.m24836v(TAG, str, th);
        }
    }

    /* renamed from: w */
    public static void m24857w(Throwable th, String str) {
        if (isLoggable(5)) {
            LogRedirector.m24838w(TAG, str, th);
        }
    }
}
