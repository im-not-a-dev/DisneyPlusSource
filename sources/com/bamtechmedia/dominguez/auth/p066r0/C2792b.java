package com.bamtechmedia.dominguez.auth.p066r0;

import com.bamtech.sdk4.Session;
import p520io.reactivex.Completable;

/* renamed from: com.bamtechmedia.dominguez.auth.r0.b */
/* compiled from: DispatchingLogOutAction.kt */
public final class C2792b {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final Completable m10462b(Session session, boolean z) {
        return session.logout(z).mo30055f();
    }
}
