package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import p163g.p449j.p450a.p451a.p457d.p461d.C10997h;

/* renamed from: com.google.android.gms.common.api.internal.q0 */
final class C9779q0 extends C10997h {

    /* renamed from: a */
    private final /* synthetic */ C9755k0 f22943a;

    C9779q0(C9755k0 k0Var, Looper looper) {
        this.f22943a = k0Var;
        super(looper);
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            this.f22943a.m30359q();
        } else if (i != 2) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i);
            Log.w("GoogleApiClientImpl", sb.toString());
        } else {
            this.f22943a.m30357o();
        }
    }
}
