package p096e.p121h.p129n;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;

/* renamed from: e.h.n.a */
/* compiled from: ConnectivityManagerCompat */
public final class C4063a {
    /* renamed from: a */
    public static boolean m13968a(ConnectivityManager connectivityManager) {
        if (VERSION.SDK_INT >= 16) {
            return connectivityManager.isActiveNetworkMetered();
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return true;
        }
        switch (activeNetworkInfo.getType()) {
            case 0:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            case 1:
            case 7:
            case 9:
                return false;
            default:
                return true;
        }
    }
}
