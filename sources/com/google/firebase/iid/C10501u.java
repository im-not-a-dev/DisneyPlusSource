package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;

/* renamed from: com.google.firebase.iid.u */
/* compiled from: com.google.firebase:firebase-iid@@19.0.1 */
final class C10501u extends BroadcastReceiver {

    /* renamed from: a */
    private C10503v f24886a;

    public C10501u(C10503v vVar) {
        this.f24886a = vVar;
    }

    /* renamed from: a */
    public final void mo27353a() {
        if (FirebaseInstanceId.zzd()) {
            Log.d("FirebaseInstanceId", "Connectivity change received registered");
        }
        this.f24886a.mo27355a().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public final void onReceive(Context context, Intent intent) {
        C10503v vVar = this.f24886a;
        if (vVar != null && vVar.mo27356b()) {
            if (FirebaseInstanceId.zzd()) {
                Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
            }
            FirebaseInstanceId.zza((Runnable) this.f24886a, 0);
            this.f24886a.mo27355a().unregisterReceiver(this);
            this.f24886a = null;
        }
    }
}
