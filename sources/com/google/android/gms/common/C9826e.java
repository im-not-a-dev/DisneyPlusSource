package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C9896p0;
import com.google.android.gms.common.p400p.C9931c;
import com.google.android.gms.common.util.C9945i;

/* renamed from: com.google.android.gms.common.e */
public class C9826e {

    /* renamed from: a */
    public static final int f23037a = C9832i.f23040a;

    /* renamed from: b */
    private static final C9826e f23038b = new C9826e();

    C9826e() {
    }

    /* renamed from: a */
    public static C9826e m30607a() {
        return f23038b;
    }

    /* renamed from: b */
    public int mo25297b(Context context) {
        return C9832i.m30629b(context);
    }

    /* renamed from: c */
    public int mo24987c(Context context) {
        return mo24977a(context, f23037a);
    }

    /* renamed from: a */
    public int mo24977a(Context context, int i) {
        int a = C9832i.m30623a(context, i);
        if (C9832i.m30633c(context, a)) {
            return 18;
        }
        return a;
    }

    /* renamed from: b */
    public boolean mo25298b(Context context, int i) {
        return C9832i.m30633c(context, i);
    }

    /* renamed from: c */
    public boolean mo24989c(int i) {
        return C9832i.m30630b(i);
    }

    /* renamed from: b */
    public String mo24985b(int i) {
        return C9832i.m30625a(i);
    }

    /* renamed from: b */
    private static String m30608b(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(f23037a);
        String str2 = "-";
        sb.append(str2);
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append(str2);
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append(str2);
        if (context != null) {
            try {
                sb.append(C9931c.m30956a(context).mo25464b(context.getPackageName(), 0).versionCode);
            } catch (NameNotFoundException unused) {
            }
        }
        return sb.toString();
    }

    @Deprecated
    /* renamed from: a */
    public Intent mo25294a(int i) {
        return mo24981a((Context) null, i, (String) null);
    }

    /* renamed from: a */
    public Intent mo24981a(Context context, int i, String str) {
        String str2 = "com.google.android.gms";
        if (i == 1 || i == 2) {
            if (context == null || !C9945i.m30984c(context)) {
                return C9896p0.m30830a(str2, m30608b(context, str));
            }
            return C9896p0.m30828a();
        } else if (i != 3) {
            return null;
        } else {
            return C9896p0.m30829a(str2);
        }
    }

    /* renamed from: a */
    public PendingIntent mo24979a(Context context, int i, int i2) {
        return mo25293a(context, i, i2, null);
    }

    /* renamed from: a */
    public PendingIntent mo25293a(Context context, int i, int i2, String str) {
        Intent a = mo24981a(context, i, str);
        if (a == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i2, a, 134217728);
    }

    /* renamed from: a */
    public void mo25295a(Context context) {
        C9832i.m30626a(context);
    }

    /* renamed from: a */
    public boolean mo25296a(Context context, String str) {
        return C9832i.m30628a(context, str);
    }
}
