package p096e.p121h.p122j.p123c;

import android.content.pm.PackageInfo;
import android.os.Build.VERSION;

/* renamed from: e.h.j.c.a */
/* compiled from: PackageInfoCompat */
public final class C4028a {
    /* renamed from: a */
    public static long m13803a(PackageInfo packageInfo) {
        if (VERSION.SDK_INT >= 28) {
            return packageInfo.getLongVersionCode();
        }
        return (long) packageInfo.versionCode;
    }
}
