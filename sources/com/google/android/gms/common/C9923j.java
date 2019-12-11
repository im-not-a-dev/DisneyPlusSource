package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.util.Log;
import com.google.android.gms.common.internal.C9908u;
import com.google.android.gms.common.p400p.C9931c;

/* renamed from: com.google.android.gms.common.j */
public class C9923j {

    /* renamed from: b */
    private static C9923j f23196b;

    /* renamed from: a */
    private final Context f23197a;

    private C9923j(Context context) {
        this.f23197a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C9923j m30933a(Context context) {
        C9908u.m30853a(context);
        synchronized (C9923j.class) {
            if (f23196b == null) {
                C9935t.m30961a(context);
                f23196b = new C9923j(context);
            }
        }
        return f23196b;
    }

    /* renamed from: a */
    public boolean mo25450a(int i) {
        C9825d0 d0Var;
        String[] a = C9931c.m30956a(this.f23197a).mo25463a(i);
        if (a != null && a.length != 0) {
            d0Var = null;
            for (String a2 : a) {
                d0Var = m30932a(a2, i);
                if (d0Var.f23034a) {
                    break;
                }
            }
        } else {
            d0Var = C9825d0.m30600a("no pkgs");
        }
        d0Var.mo25292b();
        return d0Var.f23034a;
    }

    /* renamed from: a */
    public static boolean m30935a(PackageInfo packageInfo, boolean z) {
        C9958v vVar;
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (z) {
                vVar = m30934a(packageInfo, C9961y.f23235a);
            } else {
                vVar = m30934a(packageInfo, C9961y.f23235a[0]);
            }
            if (vVar != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo25451a(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (m30935a(packageInfo, false)) {
            return true;
        }
        if (m30935a(packageInfo, true)) {
            if (C9832i.m30635e(this.f23197a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    /* renamed from: a */
    private final C9825d0 m30932a(String str, int i) {
        try {
            PackageInfo a = C9931c.m30956a(this.f23197a).mo25460a(str, 64, i);
            boolean e = C9832i.m30635e(this.f23197a);
            if (a == null) {
                return C9825d0.m30600a("null pkg");
            }
            if (a.signatures.length != 1) {
                return C9825d0.m30600a("single cert required");
            }
            C9959w wVar = new C9959w(a.signatures[0].toByteArray());
            String str2 = a.packageName;
            C9825d0 a2 = C9935t.m30959a(str2, wVar, e, false);
            return (!a2.f23034a || a.applicationInfo == null || (a.applicationInfo.flags & 2) == 0 || !C9935t.m30959a(str2, wVar, false, true).f23034a) ? a2 : C9825d0.m30600a("debuggable release cert app rejected");
        } catch (NameNotFoundException unused) {
            String str3 = "no pkg ";
            String valueOf = String.valueOf(str);
            return C9825d0.m30600a(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        }
    }

    /* renamed from: a */
    private static C9958v m30934a(PackageInfo packageInfo, C9958v... vVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        C9959w wVar = new C9959w(signatureArr[0].toByteArray());
        for (int i = 0; i < vVarArr.length; i++) {
            if (vVarArr[i].equals(wVar)) {
                return vVarArr[i];
            }
        }
        return null;
    }
}
