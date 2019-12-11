package com.google.firebase.iid;

import android.content.Intent;
import android.util.Log;

/* renamed from: com.google.firebase.iid.c0 */
/* compiled from: com.google.firebase:firebase-iid@@19.0.1 */
final /* synthetic */ class C10465c0 implements Runnable {

    /* renamed from: U */
    private final Intent f24814U;

    /* renamed from: c */
    private final C10459a0 f24815c;

    C10465c0(C10459a0 a0Var, Intent intent) {
        this.f24815c = a0Var;
        this.f24814U = intent;
    }

    public final void run() {
        C10459a0 a0Var = this.f24815c;
        String action = this.f24814U.getAction();
        StringBuilder sb = new StringBuilder(String.valueOf(action).length() + 61);
        sb.append("Service took too long to process intent: ");
        sb.append(action);
        sb.append(" App may get closed.");
        Log.w("FirebaseInstanceId", sb.toString());
        a0Var.mo27290a();
    }
}
