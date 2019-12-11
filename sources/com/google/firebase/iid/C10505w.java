package com.google.firebase.iid;

import android.os.Binder;
import android.os.Process;
import android.util.Log;
import p163g.p449j.p450a.p451a.p467f.C11428c;

/* renamed from: com.google.firebase.iid.w */
/* compiled from: com.google.firebase:firebase-iid@@19.0.1 */
public final class C10505w extends Binder {

    /* renamed from: a */
    private final C10509y f24892a;

    public C10505w(C10509y yVar) {
        this.f24892a = yVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo27358a(C10459a0 a0Var) {
        if (Binder.getCallingUid() == Process.myUid()) {
            String str = "FirebaseInstanceId";
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "service received new intent via bind strategy");
            }
            this.f24892a.mo27372a(a0Var.f24801a).mo29254a(C10469e0.m33044a(), (C11428c<TResult>) new C10511z<TResult>(a0Var));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
