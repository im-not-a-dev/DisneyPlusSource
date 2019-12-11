package com.google.android.exoplayer2;

import java.util.HashSet;

/* renamed from: com.google.android.exoplayer2.a0 */
/* compiled from: ExoPlayerLibraryInfo */
public final class C8672a0 {

    /* renamed from: a */
    private static final HashSet<String> f18407a = new HashSet<>();

    /* renamed from: b */
    private static String f18408b = "goog.exo.core";

    /* renamed from: a */
    public static synchronized String m24989a() {
        String str;
        synchronized (C8672a0.class) {
            str = f18408b;
        }
        return str;
    }

    /* renamed from: a */
    public static synchronized void m24990a(String str) {
        synchronized (C8672a0.class) {
            if (f18407a.add(str)) {
                StringBuilder sb = new StringBuilder();
                sb.append(f18408b);
                sb.append(", ");
                sb.append(str);
                f18408b = sb.toString();
            }
        }
    }
}
