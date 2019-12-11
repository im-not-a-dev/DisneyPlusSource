package p163g.p426g.p432d.p433a;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build.VERSION;
import android.os.PowerManager;
import android.os.Process;
import java.util.List;
import p163g.p426g.p427a.p429j.C10829c;

/* renamed from: g.g.d.a.a */
/* compiled from: AndroidGraphicalInterface */
public class C10840a implements C10829c {

    /* renamed from: a */
    private Context f25630a = null;

    public C10840a(Context context) {
        this.f25630a = context;
    }

    /* renamed from: a */
    public boolean mo27894a() {
        Context context = this.f25630a;
        ConnectivityManager connectivityManager = context != null ? (ConnectivityManager) context.getSystemService("connectivity") : null;
        if (C10847h.m34191a("android.permission.ACCESS_NETWORK_STATE") && connectivityManager != null && VERSION.SDK_INT >= 24 && connectivityManager.isActiveNetworkMetered()) {
            int restrictBackgroundStatus = connectivityManager.getRestrictBackgroundStatus();
            if (restrictBackgroundStatus == 1 || restrictBackgroundStatus == 2 || restrictBackgroundStatus != 3) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo27895b() {
        return !((PowerManager) this.f25630a.getSystemService("power")).isScreenOn();
    }

    public boolean isVisible() {
        int myPid = Process.myPid();
        List runningAppProcesses = ((ActivityManager) this.f25630a.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        int i = 0;
        while (i < runningAppProcesses.size()) {
            if (((RunningAppProcessInfo) runningAppProcesses.get(i)).pid != myPid) {
                i++;
            } else if (((RunningAppProcessInfo) runningAppProcesses.get(i)).importance <= 200) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }
}
