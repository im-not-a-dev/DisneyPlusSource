package com.google.firebase.messaging;

import android.content.Intent;
import p163g.p449j.p450a.p451a.p467f.C11436i;

/* renamed from: com.google.firebase.messaging.k */
/* compiled from: com.google.firebase:firebase-messaging@@19.0.1 */
final /* synthetic */ class C10523k implements Runnable {

    /* renamed from: U */
    private final Intent f24929U;

    /* renamed from: V */
    private final C11436i f24930V;

    /* renamed from: c */
    private final C10521i f24931c;

    C10523k(C10521i iVar, Intent intent, C11436i iVar2) {
        this.f24931c = iVar;
        this.f24929U = intent;
        this.f24930V = iVar2;
    }

    public final void run() {
        C10521i iVar = this.f24931c;
        Intent intent = this.f24929U;
        C11436i iVar2 = this.f24930V;
        try {
            iVar.mo27380c(intent);
        } finally {
            iVar2.mo29273a(null);
        }
    }
}
