package com.google.android.gms.common.p400p;

import android.content.Context;
import com.google.android.gms.common.util.C9948l;

/* renamed from: com.google.android.gms.common.p.a */
public class C9929a {

    /* renamed from: a */
    private static Context f23205a;

    /* renamed from: b */
    private static Boolean f23206b;

    /* renamed from: a */
    public static synchronized boolean m30947a(Context context) {
        synchronized (C9929a.class) {
            Context applicationContext = context.getApplicationContext();
            if (f23205a == null || f23206b == null || f23205a != applicationContext) {
                f23206b = null;
                if (C9948l.m30996i()) {
                    f23206b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
                } else {
                    try {
                        context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                        f23206b = Boolean.valueOf(true);
                    } catch (ClassNotFoundException unused) {
                        f23206b = Boolean.valueOf(false);
                    }
                }
                f23205a = applicationContext;
                boolean booleanValue = f23206b.booleanValue();
                return booleanValue;
            }
            boolean booleanValue2 = f23206b.booleanValue();
            return booleanValue2;
        }
    }
}
