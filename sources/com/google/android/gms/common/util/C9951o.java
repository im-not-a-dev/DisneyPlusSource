package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import com.google.android.gms.common.C9923j;
import com.google.android.gms.common.p400p.C9931c;

/* renamed from: com.google.android.gms.common.util.o */
public final class C9951o {
    /* renamed from: a */
    public static boolean m31001a(Context context, int i) {
        String str = "com.google.android.gms";
        if (!m31002a(context, i, str)) {
            return false;
        }
        try {
            return C9923j.m30933a(context).mo25451a(context.getPackageManager().getPackageInfo(str, 64));
        } catch (NameNotFoundException unused) {
            String str2 = "UidVerifier";
            if (Log.isLoggable(str2, 3)) {
                Log.d(str2, "Package manager can't find google play services package, defaulting to false");
            }
            return false;
        }
    }

    @TargetApi(19)
    /* renamed from: a */
    public static boolean m31002a(Context context, int i, String str) {
        return C9931c.m30956a(context).mo25462a(i, str);
    }
}
