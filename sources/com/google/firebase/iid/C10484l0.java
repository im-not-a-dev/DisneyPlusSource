package com.google.firebase.iid;

import p163g.p449j.p482b.p483e.C11519a;
import p163g.p449j.p482b.p483e.C11520b;

/* renamed from: com.google.firebase.iid.l0 */
/* compiled from: com.google.firebase:firebase-iid@@19.0.1 */
final /* synthetic */ class C10484l0 implements C11520b {

    /* renamed from: a */
    private final C10456a f24847a;

    C10484l0(C10456a aVar) {
        this.f24847a = aVar;
    }

    /* renamed from: a */
    public final void mo27213a(C11519a aVar) {
        C10456a aVar2 = this.f24847a;
        synchronized (aVar2) {
            if (aVar2.mo27287a()) {
                FirebaseInstanceId.this.zzi();
            }
        }
    }
}
