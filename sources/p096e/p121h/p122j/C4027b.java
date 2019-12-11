package p096e.p121h.p122j;

import android.content.Context;
import android.os.Binder;
import android.os.Process;
import androidx.core.app.C0471d;

/* renamed from: e.h.j.b */
/* compiled from: PermissionChecker */
public final class C4027b {
    /* renamed from: a */
    public static int m13801a(Context context, String str, int i, int i2, String str2) {
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String a = C0471d.m2508a(str);
        if (a == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        if (C0471d.m2507a(context, a, str2) != 0) {
            return -2;
        }
        return 0;
    }

    /* renamed from: b */
    public static int m13802b(Context context, String str) {
        return m13801a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }

    /* renamed from: a */
    public static int m13800a(Context context, String str) {
        return m13801a(context, str, Binder.getCallingPid(), Binder.getCallingUid(), Binder.getCallingPid() == Process.myPid() ? context.getPackageName() : null);
    }
}
