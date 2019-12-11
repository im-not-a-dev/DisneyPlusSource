package com.appboy.p033s;

import android.content.Context;

/* renamed from: com.appboy.s.h */
public class C1562h {

    /* renamed from: a */
    private static final String f5713a = C1557c.m7461a(C1562h.class);

    /* renamed from: a */
    public static boolean m7482a(Context context, String str) {
        boolean z = false;
        try {
            if (context.checkCallingOrSelfPermission(str) == 0) {
                z = true;
            }
            return z;
        } catch (Throwable th) {
            String str2 = f5713a;
            StringBuilder sb = new StringBuilder();
            sb.append("Failure checking permission ");
            sb.append(str);
            C1557c.m7470c(str2, sb.toString(), th);
            return false;
        }
    }
}
