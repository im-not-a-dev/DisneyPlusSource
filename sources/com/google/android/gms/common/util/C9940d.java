package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.common.p400p.C9931c;

/* renamed from: com.google.android.gms.common.util.d */
public class C9940d {
    /* renamed from: a */
    public static boolean m30967a() {
        return false;
    }

    /* renamed from: a */
    public static boolean m30968a(Context context, String str) {
        "com.google.android.gms".equals(str);
        try {
            if ((C9931c.m30956a(context).mo25459a(str, 0).flags & 2097152) != 0) {
                return true;
            }
        } catch (NameNotFoundException unused) {
        }
        return false;
    }
}
