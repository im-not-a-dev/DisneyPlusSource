package com.airbnb.lottie;

import android.util.Log;
import java.util.HashSet;
import java.util.Set;
import p096e.p121h.p130o.C4070g;

/* renamed from: com.airbnb.lottie.c */
/* compiled from: L */
public class C1181c {

    /* renamed from: a */
    public static boolean f4436a = false;

    /* renamed from: b */
    private static final Set<String> f4437b = new HashSet();

    /* renamed from: c */
    private static boolean f4438c = false;

    /* renamed from: d */
    private static String[] f4439d;

    /* renamed from: e */
    private static long[] f4440e;

    /* renamed from: f */
    private static int f4441f = 0;

    /* renamed from: g */
    private static int f4442g = 0;

    /* renamed from: a */
    public static void m6032a(String str) {
        if (f4438c) {
            int i = f4441f;
            if (i == 20) {
                f4442g++;
                return;
            }
            f4439d[i] = str;
            f4440e[i] = System.nanoTime();
            C4070g.m13983a(str);
            f4441f++;
        }
    }

    /* renamed from: b */
    public static void m6033b(String str) {
        if (f4436a) {
            Log.d("LOTTIE", str);
        }
    }

    /* renamed from: c */
    public static float m6034c(String str) {
        int i = f4442g;
        if (i > 0) {
            f4442g = i - 1;
            return 0.0f;
        } else if (!f4438c) {
            return 0.0f;
        } else {
            f4441f--;
            int i2 = f4441f;
            if (i2 == -1) {
                throw new IllegalStateException("Can't end trace section. There are none.");
            } else if (str.equals(f4439d[i2])) {
                C4070g.m13982a();
                return ((float) (System.nanoTime() - f4440e[f4441f])) / 1000000.0f;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unbalanced trace call ");
                sb.append(str);
                sb.append(". Expected ");
                sb.append(f4439d[f4441f]);
                sb.append(".");
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    /* renamed from: d */
    public static void m6035d(String str) {
        if (!f4437b.contains(str)) {
            Log.w("LOTTIE", str);
            f4437b.add(str);
        }
    }
}
