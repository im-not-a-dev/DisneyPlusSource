package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C9908u;

/* renamed from: com.google.android.gms.measurement.internal.t6 */
public final class C10199t6 {
    /* renamed from: a */
    public static String m31844a(String str, String[] strArr, String[] strArr2) {
        C9908u.m30853a(strArr);
        C9908u.m30853a(strArr2);
        int min = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < min; i++) {
            String str2 = strArr[i];
            boolean z = (str == null && str2 == null) ? true : str == null ? false : str.equals(str2);
            if (z) {
                return strArr2[i];
            }
        }
        return null;
    }
}
