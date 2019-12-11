package com.appboy.p033s;

import android.util.Log;
import p161f.p162a.C4381a1;
import p161f.p162a.C4606v3;

/* renamed from: com.appboy.s.c */
public class C1557c {

    /* renamed from: a */
    private static C4381a1 f5704a;

    /* renamed from: b */
    private static final String f5705b = m7461a(C1557c.class);

    /* renamed from: c */
    private static int f5706c = 4;

    /* renamed from: d */
    private static final int f5707d = 15;

    /* renamed from: e */
    private static final int f5708e = (80 - f5707d);

    /* renamed from: a */
    public static synchronized void m7462a() {
        synchronized (C1557c.class) {
            String a = C4606v3.m16007a("log.tag.APPBOY", "");
            if (!C1563i.m7490d(a) && a.trim().equalsIgnoreCase("verbose")) {
                f5706c = 2;
                String str = f5705b;
                StringBuilder sb = new StringBuilder();
                sb.append("AppboyLogger log level set to ");
                sb.append(a);
                sb.append(" via device system property. Note that subsequent calls to AppboyLogger.setLogLevel() will have no effect.");
                m7469c(str, sb.toString());
            }
        }
    }

    /* renamed from: b */
    public static int m7466b(String str, String str2, Throwable th) {
        return m7459a(str, str2, th, true);
    }

    /* renamed from: c */
    public static int m7469c(String str, String str2) {
        return m7468b(str, str2, true);
    }

    /* renamed from: d */
    public static int m7471d(String str, String str2) {
        if (f5706c <= 2) {
            return Log.v(str, str2);
        }
        return 0;
    }

    /* renamed from: e */
    public static int m7473e(String str, String str2) {
        m7464a(str, str2, (Throwable) null);
        if (f5706c <= 5) {
            return Log.w(str, str2);
        }
        return 0;
    }

    /* renamed from: b */
    public static int m7468b(String str, String str2, boolean z) {
        return m7467b(str, str2, null, z);
    }

    /* renamed from: c */
    public static int m7470c(String str, String str2, Throwable th) {
        m7464a(str, str2, (Throwable) null);
        if (f5706c <= 6) {
            return Log.e(str, str2, th);
        }
        return 0;
    }

    /* renamed from: b */
    public static int m7467b(String str, String str2, Throwable th, boolean z) {
        if (z) {
            m7464a(str, str2, (Throwable) null);
        }
        if (f5706c > 4) {
            return 0;
        }
        if (th != null) {
            return Log.i(str, str2, th);
        }
        return Log.i(str, str2);
    }

    /* renamed from: d */
    public static int m7472d(String str, String str2, Throwable th) {
        return m7467b(str, str2, th, true);
    }

    /* renamed from: e */
    public static int m7474e(String str, String str2, Throwable th) {
        m7464a(str, str2, th);
        if (f5706c <= 5) {
            return Log.w(str, str2, th);
        }
        return 0;
    }

    /* renamed from: a */
    public static int m7458a(String str, String str2) {
        return m7460a(str, str2, true);
    }

    /* renamed from: a */
    public static int m7460a(String str, String str2, boolean z) {
        return m7459a(str, str2, null, z);
    }

    /* renamed from: b */
    public static int m7465b(String str, String str2) {
        m7464a(str, str2, (Throwable) null);
        if (f5706c <= 6) {
            return Log.e(str, str2);
        }
        return 0;
    }

    /* renamed from: a */
    public static int m7459a(String str, String str2, Throwable th, boolean z) {
        if (z) {
            m7464a(str, str2, (Throwable) null);
        }
        if (f5706c > 3) {
            return 0;
        }
        if (th != null) {
            return Log.d(str, str2, th);
        }
        return Log.d(str, str2);
    }

    /* renamed from: a */
    public static String m7461a(Class cls) {
        String name = cls.getName();
        int length = name.length();
        int i = f5708e;
        if (length > i) {
            name = name.substring(length - i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Appboy v3.2.2 .");
        sb.append(name);
        return sb.toString();
    }

    /* renamed from: a */
    public static void m7463a(C4381a1 a1Var) {
        f5704a = a1Var;
    }

    /* renamed from: a */
    private static void m7464a(String str, String str2, Throwable th) {
        C4381a1 a1Var = f5704a;
        if (a1Var != null && a1Var.mo15400a() && str != null) {
            f5704a.mo15398a(str, str2, th);
        }
    }
}
