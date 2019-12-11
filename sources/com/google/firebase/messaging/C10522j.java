package com.google.firebase.messaging;

import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.messaging.j */
/* compiled from: com.google.firebase:firebase-messaging@@19.0.1 */
final /* synthetic */ class C10522j implements Executor {

    /* renamed from: c */
    static final Executor f24928c = new C10522j();

    private C10522j() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
