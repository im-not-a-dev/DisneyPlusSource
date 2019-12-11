package com.google.android.gms.common.p400p;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.util.C9948l;

/* renamed from: com.google.android.gms.common.p.b */
public class C9930b {

    /* renamed from: a */
    private final Context f23207a;

    public C9930b(Context context) {
        this.f23207a = context;
    }

    /* renamed from: a */
    public ApplicationInfo mo25459a(String str, int i) throws NameNotFoundException {
        return this.f23207a.getPackageManager().getApplicationInfo(str, i);
    }

    /* renamed from: b */
    public PackageInfo mo25464b(String str, int i) throws NameNotFoundException {
        return this.f23207a.getPackageManager().getPackageInfo(str, i);
    }

    /* renamed from: a */
    public final PackageInfo mo25460a(String str, int i, int i2) throws NameNotFoundException {
        return this.f23207a.getPackageManager().getPackageInfo(str, 64);
    }

    /* renamed from: b */
    public CharSequence mo25465b(String str) throws NameNotFoundException {
        return this.f23207a.getPackageManager().getApplicationLabel(this.f23207a.getPackageManager().getApplicationInfo(str, 0));
    }

    /* renamed from: a */
    public final String[] mo25463a(int i) {
        return this.f23207a.getPackageManager().getPackagesForUid(i);
    }

    @TargetApi(19)
    /* renamed from: a */
    public final boolean mo25462a(int i, String str) {
        if (C9948l.m30992e()) {
            try {
                ((AppOpsManager) this.f23207a.getSystemService("appops")).checkPackage(i, str);
                return true;
            } catch (SecurityException unused) {
                return false;
            }
        } else {
            String[] packagesForUid = this.f23207a.getPackageManager().getPackagesForUid(i);
            if (!(str == null || packagesForUid == null)) {
                for (String equals : packagesForUid) {
                    if (str.equals(equals)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: a */
    public int mo25458a(String str) {
        return this.f23207a.checkCallingOrSelfPermission(str);
    }

    /* renamed from: a */
    public boolean mo25461a() {
        if (Binder.getCallingUid() == Process.myUid()) {
            return C9929a.m30947a(this.f23207a);
        }
        if (C9948l.m30996i()) {
            String nameForUid = this.f23207a.getPackageManager().getNameForUid(Binder.getCallingUid());
            if (nameForUid != null) {
                return this.f23207a.getPackageManager().isInstantApp(nameForUid);
            }
        }
        return false;
    }
}
