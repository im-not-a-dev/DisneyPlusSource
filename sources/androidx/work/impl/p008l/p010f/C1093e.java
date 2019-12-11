package androidx.work.impl.p008l.p010f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import androidx.work.C1034h;
import androidx.work.impl.p008l.C1076b;
import p096e.p121h.p129n.C4063a;

/* renamed from: androidx.work.impl.l.f.e */
/* compiled from: NetworkStateTracker */
public class C1093e extends C1092d<C1076b> {

    /* renamed from: i */
    static final String f4253i = C1034h.m5551a("NetworkStateTracker");

    /* renamed from: f */
    private final ConnectivityManager f4254f = ((ConnectivityManager) this.f4249a.getSystemService("connectivity"));

    /* renamed from: g */
    private C1095b f4255g;

    /* renamed from: h */
    private C1094a f4256h;

    /* renamed from: androidx.work.impl.l.f.e$a */
    /* compiled from: NetworkStateTracker */
    private class C1094a extends BroadcastReceiver {
        C1094a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null && intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                C1034h.m5550a().mo5697a(C1093e.f4253i, "Network broadcast received", new Throwable[0]);
                C1093e eVar = C1093e.this;
                eVar.mo5826a(eVar.mo5828d());
            }
        }
    }

    /* renamed from: androidx.work.impl.l.f.e$b */
    /* compiled from: NetworkStateTracker */
    private class C1095b extends NetworkCallback {
        C1095b() {
        }

        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            C1034h.m5550a().mo5697a(C1093e.f4253i, String.format("Network capabilities changed: %s", new Object[]{networkCapabilities}), new Throwable[0]);
            C1093e eVar = C1093e.this;
            eVar.mo5826a(eVar.mo5828d());
        }

        public void onLost(Network network) {
            C1034h.m5550a().mo5697a(C1093e.f4253i, "Network connection lost", new Throwable[0]);
            C1093e eVar = C1093e.this;
            eVar.mo5826a(eVar.mo5828d());
        }
    }

    public C1093e(Context context) {
        super(context);
        if (m5789f()) {
            this.f4255g = new C1095b();
        } else {
            this.f4256h = new C1094a();
        }
    }

    /* renamed from: e */
    private boolean m5788e() {
        boolean z = false;
        if (VERSION.SDK_INT < 23) {
            return false;
        }
        NetworkCapabilities networkCapabilities = this.f4254f.getNetworkCapabilities(this.f4254f.getActiveNetwork());
        if (networkCapabilities != null && networkCapabilities.hasCapability(16)) {
            z = true;
        }
        return z;
    }

    /* renamed from: f */
    private static boolean m5789f() {
        return VERSION.SDK_INT >= 24;
    }

    /* renamed from: b */
    public void mo5822b() {
        if (m5789f()) {
            C1034h.m5550a().mo5697a(f4253i, "Registering network callback", new Throwable[0]);
            this.f4254f.registerDefaultNetworkCallback(this.f4255g);
            return;
        }
        C1034h.m5550a().mo5697a(f4253i, "Registering broadcast receiver", new Throwable[0]);
        this.f4249a.registerReceiver(this.f4256h, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    /* renamed from: c */
    public void mo5823c() {
        if (m5789f()) {
            try {
                C1034h.m5550a().mo5697a(f4253i, "Unregistering network callback", new Throwable[0]);
                this.f4254f.unregisterNetworkCallback(this.f4255g);
            } catch (IllegalArgumentException e) {
                C1034h.m5550a().mo5698b(f4253i, "Received exception while unregistering network callback", e);
            }
        } else {
            C1034h.m5550a().mo5697a(f4253i, "Unregistering broadcast receiver", new Throwable[0]);
            this.f4249a.unregisterReceiver(this.f4256h);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C1076b mo5828d() {
        NetworkInfo activeNetworkInfo = this.f4254f.getActiveNetworkInfo();
        boolean z = true;
        boolean z2 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean e = m5788e();
        boolean a = C4063a.m13968a(this.f4254f);
        if (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) {
            z = false;
        }
        return new C1076b(z2, e, a, z);
    }

    /* renamed from: a */
    public C1076b m5791a() {
        return mo5828d();
    }
}
