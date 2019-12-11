package com.google.firebase.iid;

import android.os.Bundle;
import p163g.p449j.p450a.p451a.p467f.C11436i;

/* renamed from: com.google.firebase.iid.o0 */
/* compiled from: com.google.firebase:firebase-iid@@19.0.1 */
final /* synthetic */ class C10490o0 implements Runnable {

    /* renamed from: U */
    private final Bundle f24865U;

    /* renamed from: V */
    private final C11436i f24866V;

    /* renamed from: c */
    private final C10486m0 f24867c;

    C10490o0(C10486m0 m0Var, Bundle bundle, C11436i iVar) {
        this.f24867c = m0Var;
        this.f24865U = bundle;
        this.f24866V = iVar;
    }

    public final void run() {
        this.f24867c.mo27323a(this.f24865U, this.f24866V);
    }
}
