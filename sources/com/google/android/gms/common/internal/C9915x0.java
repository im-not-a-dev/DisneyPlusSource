package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.p400p.C9931c;

/* renamed from: com.google.android.gms.common.internal.x0 */
public final class C9915x0 {

    /* renamed from: a */
    private static Object f23190a = new Object();

    /* renamed from: b */
    private static boolean f23191b;

    /* renamed from: c */
    private static String f23192c;

    /* renamed from: d */
    private static int f23193d;

    /* renamed from: a */
    public static String m30884a(Context context) {
        m30886c(context);
        return f23192c;
    }

    /* renamed from: b */
    public static int m30885b(Context context) {
        m30886c(context);
        return f23193d;
    }

    /* renamed from: c */
    private static void m30886c(Context context) {
        synchronized (f23190a) {
            if (!f23191b) {
                f23191b = true;
                try {
                    Bundle bundle = C9931c.m30956a(context).mo25459a(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        f23192c = bundle.getString("com.google.app.id");
                        f23193d = bundle.getInt("com.google.android.gms.version");
                    }
                } catch (NameNotFoundException e) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e);
                }
            }
        }
    }
}
