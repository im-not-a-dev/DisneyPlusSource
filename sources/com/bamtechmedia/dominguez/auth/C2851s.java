package com.bamtechmedia.dominguez.auth;

import android.app.Application;
import com.bamtechmedia.dominguez.core.p087h.C3824a;
import com.bamtechmedia.dominguez.core.p087h.C3824a.C3825a;

/* renamed from: com.bamtechmedia.dominguez.auth.s */
/* compiled from: AuthInitializationAction.kt */
public final class C2851s implements C3824a {

    /* renamed from: a */
    private final SessionStateObserver f7631a;

    public C2851s(SessionStateObserver sessionStateObserver) {
        this.f7631a = sessionStateObserver;
    }

    /* renamed from: a */
    public int mo11494a() {
        return C3825a.m12913a(this);
    }

    /* renamed from: a */
    public void mo11495a(Application application) {
        this.f7631a.mo11728b();
    }
}
