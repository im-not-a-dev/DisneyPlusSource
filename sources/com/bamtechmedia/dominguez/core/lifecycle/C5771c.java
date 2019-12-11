package com.bamtechmedia.dominguez.core.lifecycle;

import android.app.Application;
import androidx.lifecycle.C0722m;
import androidx.lifecycle.C0733v;
import com.bamtechmedia.dominguez.core.p087h.C3824a;
import com.bamtechmedia.dominguez.core.p087h.C3824a.C3825a;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.bamtechmedia.dominguez.core.lifecycle.c */
/* compiled from: AppPresenceInitializationAction.kt */
public final class C5771c implements C3824a {

    /* renamed from: a */
    private final C0722m f13530a = C0733v.m3782i();

    /* renamed from: b */
    private final C5765a f13531b;

    public C5771c(C5765a aVar) {
        this.f13531b = aVar;
    }

    /* renamed from: a */
    public int mo11494a() {
        return C3825a.m12913a(this);
    }

    /* renamed from: a */
    public void mo11495a(Application application) {
        C0722m mVar = this.f13530a;
        Intrinsics.checkReturnedValueIsNotNull((Object) mVar, "processLifecycleOwner");
        mVar.getLifecycle().mo4134a(this.f13531b);
        application.registerActivityLifecycleCallbacks(this.f13531b);
    }
}
