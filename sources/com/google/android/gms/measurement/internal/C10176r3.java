package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.C9908u;

/* renamed from: com.google.android.gms.measurement.internal.r3 */
class C10176r3 extends BroadcastReceiver {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C10126m8 f23881a;

    /* renamed from: b */
    private boolean f23882b;

    /* renamed from: c */
    private boolean f23883c;

    static {
        Class<C10176r3> cls = C10176r3.class;
    }

    C10176r3(C10126m8 m8Var) {
        C9908u.m30853a(m8Var);
        this.f23881a = m8Var;
    }

    /* renamed from: a */
    public final void mo26072a() {
        this.f23881a.mo25941n();
        this.f23881a.mo25897d().mo25662j();
        this.f23881a.mo25897d().mo25662j();
        if (this.f23882b) {
            this.f23881a.mo25898e().mo25869B().mo25908a("Unregistering connectivity change receiver");
            this.f23882b = false;
            this.f23883c = false;
            try {
                this.f23881a.mo25895b().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.f23881a.mo25898e().mo25874t().mo25909a("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    /* renamed from: b */
    public final void mo26073b() {
        this.f23881a.mo25941n();
        this.f23881a.mo25897d().mo25662j();
        if (!this.f23882b) {
            this.f23881a.mo25895b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f23883c = this.f23881a.mo25939l().mo26015v();
            this.f23881a.mo25898e().mo25869B().mo25909a("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f23883c));
            this.f23882b = true;
        }
    }

    public void onReceive(Context context, Intent intent) {
        this.f23881a.mo25941n();
        String action = intent.getAction();
        this.f23881a.mo25898e().mo25869B().mo25909a("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean v = this.f23881a.mo25939l().mo26015v();
            if (this.f23883c != v) {
                this.f23883c = v;
                this.f23881a.mo25897d().mo25800a((Runnable) new C10206u3(this, v));
            }
            return;
        }
        this.f23881a.mo25898e().mo25877w().mo25909a("NetworkBroadcastReceiver received unknown action", action);
    }
}
