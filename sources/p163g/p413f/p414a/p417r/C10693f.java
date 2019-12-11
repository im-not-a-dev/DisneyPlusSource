package p163g.p413f.p414a.p417r;

import android.content.Context;
import android.util.Log;
import p096e.p121h.p122j.C4025a;
import p163g.p413f.p414a.p417r.C10688c.C10689a;

/* renamed from: g.f.a.r.f */
/* compiled from: DefaultConnectivityMonitorFactory */
public class C10693f implements C10690d {
    /* renamed from: a */
    public C10688c mo27626a(Context context, C10689a aVar) {
        boolean z = C4025a.m13789a(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        String str = "ConnectivityMonitor";
        if (Log.isLoggable(str, 3)) {
            Log.d(str, z ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        return z ? new C10691e(context, aVar) : new C10697j();
    }
}
