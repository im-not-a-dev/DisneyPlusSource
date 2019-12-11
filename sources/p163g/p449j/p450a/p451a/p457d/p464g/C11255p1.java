package p163g.p449j.p450a.p451a.p457d.p464g;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ProviderInfo;
import android.net.Uri;

/* renamed from: g.j.a.a.d.g.p1 */
public final class C11255p1 {

    /* renamed from: a */
    private static volatile C11038b2<Boolean> f26429a = C11038b2.m34791c();

    /* renamed from: b */
    private static final Object f26430b = new Object();

    /* renamed from: a */
    private static boolean m35921a(Context context) {
        try {
            if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                return true;
            }
        } catch (NameNotFoundException unused) {
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m35922a(Context context, Uri uri) {
        boolean z;
        String authority = uri.getAuthority();
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            StringBuilder sb = new StringBuilder(String.valueOf(authority).length() + 91);
            sb.append(authority);
            sb.append(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            throw new IllegalArgumentException(sb.toString());
        } else if (f26429a.mo28314b()) {
            return ((Boolean) f26429a.mo28313a()).booleanValue();
        } else {
            synchronized (f26430b) {
                if (f26429a.mo28314b()) {
                    boolean booleanValue = ((Boolean) f26429a.mo28313a()).booleanValue();
                    return booleanValue;
                }
                boolean z2 = false;
                if (!"com.google.android.gms".equals(context.getPackageName())) {
                    ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", 0);
                    if (resolveContentProvider == null || !"com.google.android.gms".equals(resolveContentProvider.packageName)) {
                        z = false;
                        if (z && m35921a(context)) {
                            z2 = true;
                        }
                        f26429a = C11038b2.m34790a(Boolean.valueOf(z2));
                        return ((Boolean) f26429a.mo28313a()).booleanValue();
                    }
                }
                z = true;
                z2 = true;
                f26429a = C11038b2.m34790a(Boolean.valueOf(z2));
                return ((Boolean) f26429a.mo28313a()).booleanValue();
            }
        }
    }
}
