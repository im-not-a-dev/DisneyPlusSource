package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: com.google.android.gms.common.api.internal.f1 */
public final class C9735f1 extends BroadcastReceiver {

    /* renamed from: a */
    private Context f22835a;

    /* renamed from: b */
    private final C9739g1 f22836b;

    public C9735f1(C9739g1 g1Var) {
        this.f22836b = g1Var;
    }

    /* renamed from: a */
    public final void mo25169a(Context context) {
        this.f22835a = context;
    }

    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f22836b.mo25173a();
            mo25168a();
        }
    }

    /* renamed from: a */
    public final synchronized void mo25168a() {
        if (this.f22835a != null) {
            this.f22835a.unregisterReceiver(this);
        }
        this.f22835a = null;
    }
}
