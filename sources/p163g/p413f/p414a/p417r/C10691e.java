package p163g.p413f.p414a.p417r;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import p163g.p413f.p414a.p417r.C10688c.C10689a;
import p163g.p413f.p414a.p424w.C10774j;

/* renamed from: g.f.a.r.e */
/* compiled from: DefaultConnectivityMonitor */
final class C10691e implements C10688c {

    /* renamed from: U */
    final C10689a f25294U;

    /* renamed from: V */
    boolean f25295V;

    /* renamed from: W */
    private boolean f25296W;

    /* renamed from: X */
    private final BroadcastReceiver f25297X = new C10692a();

    /* renamed from: c */
    private final Context f25298c;

    /* renamed from: g.f.a.r.e$a */
    /* compiled from: DefaultConnectivityMonitor */
    class C10692a extends BroadcastReceiver {
        C10692a() {
        }

        public void onReceive(Context context, Intent intent) {
            C10691e eVar = C10691e.this;
            boolean z = eVar.f25295V;
            eVar.f25295V = eVar.mo27627a(context);
            if (z != C10691e.this.f25295V) {
                String str = "ConnectivityMonitor";
                if (Log.isLoggable(str, 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("connectivity changed, isConnected: ");
                    sb.append(C10691e.this.f25295V);
                    Log.d(str, sb.toString());
                }
                C10691e eVar2 = C10691e.this;
                eVar2.f25294U.mo27579a(eVar2.f25295V);
            }
        }
    }

    C10691e(Context context, C10689a aVar) {
        this.f25298c = context.getApplicationContext();
        this.f25294U = aVar;
    }

    /* renamed from: d */
    private void m33624d() {
        if (!this.f25296W) {
            this.f25295V = mo27627a(this.f25298c);
            try {
                this.f25298c.registerReceiver(this.f25297X, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.f25296W = true;
            } catch (SecurityException e) {
                String str = "ConnectivityMonitor";
                if (Log.isLoggable(str, 5)) {
                    Log.w(str, "Failed to register", e);
                }
            }
        }
    }

    /* renamed from: e */
    private void m33625e() {
        if (this.f25296W) {
            this.f25298c.unregisterReceiver(this.f25297X);
            this.f25296W = false;
        }
    }

    /* access modifiers changed from: 0000 */
    @SuppressLint({"MissingPermission"})
    /* renamed from: a */
    public boolean mo27627a(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        C10774j.m34012a(connectivityManager);
        boolean z = true;
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                z = false;
            }
            return z;
        } catch (RuntimeException e) {
            String str = "ConnectivityMonitor";
            if (Log.isLoggable(str, 5)) {
                Log.w(str, "Failed to determine connectivity status when connectivity changed", e);
            }
            return true;
        }
    }

    /* renamed from: b */
    public void mo27570b() {
    }

    /* renamed from: c */
    public void mo27572c() {
        m33625e();
    }

    /* renamed from: a */
    public void mo27566a() {
        m33624d();
    }
}
