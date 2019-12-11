package com.facebook.stetho.common;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;

public class LogRedirector {
    private static volatile Logger sLogger;

    public interface Logger {
        boolean isLoggable(String str, int i);

        void log(int i, String str, String str2);
    }

    /* renamed from: d */
    public static void m24830d(String str, String str2, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("\n");
        sb.append(formatThrowable(th));
        m24829d(str, sb.toString());
    }

    /* renamed from: e */
    public static void m24832e(String str, String str2, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("\n");
        sb.append(formatThrowable(th));
        m24831e(str, sb.toString());
    }

    private static String formatThrowable(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace();
        printWriter.flush();
        return stringWriter.toString();
    }

    /* renamed from: i */
    public static void m24834i(String str, String str2, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("\n");
        sb.append(formatThrowable(th));
        m24833i(str, sb.toString());
    }

    public static boolean isLoggable(String str, int i) {
        Logger logger = sLogger;
        if (logger != null) {
            return logger.isLoggable(str, i);
        }
        return Log.isLoggable(str, i);
    }

    private static void log(int i, String str, String str2) {
        Logger logger = sLogger;
        if (logger != null) {
            logger.log(i, str, str2);
        } else {
            Log.println(i, str, str2);
        }
    }

    public static void setLogger(Logger logger) {
        Util.throwIfNull(logger);
        Util.throwIfNotNull(sLogger);
        sLogger = logger;
    }

    /* renamed from: v */
    public static void m24836v(String str, String str2, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("\n");
        sb.append(formatThrowable(th));
        m24835v(str, sb.toString());
    }

    /* renamed from: w */
    public static void m24838w(String str, String str2, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("\n");
        sb.append(formatThrowable(th));
        m24837w(str, sb.toString());
    }

    /* renamed from: d */
    public static void m24829d(String str, String str2) {
        log(3, str, str2);
    }

    /* renamed from: e */
    public static void m24831e(String str, String str2) {
        log(6, str, str2);
    }

    /* renamed from: i */
    public static void m24833i(String str, String str2) {
        log(4, str, str2);
    }

    /* renamed from: v */
    public static void m24835v(String str, String str2) {
        log(2, str, str2);
    }

    /* renamed from: w */
    public static void m24837w(String str, String str2) {
        log(5, str, str2);
    }
}
