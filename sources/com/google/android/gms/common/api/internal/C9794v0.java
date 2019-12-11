package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import p163g.p449j.p450a.p451a.p457d.p461d.C10997h;

/* renamed from: com.google.android.gms.common.api.internal.v0 */
final class C9794v0 extends C10997h {

    /* renamed from: a */
    private final /* synthetic */ C9788t0 f22982a;

    C9794v0(C9788t0 t0Var, Looper looper) {
        this.f22982a = t0Var;
        super(looper);
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            ((C9791u0) message.obj).mo25246a(this.f22982a);
        } else if (i != 2) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i);
            Log.w("GACStateManager", sb.toString());
        } else {
            throw ((RuntimeException) message.obj);
        }
    }
}
