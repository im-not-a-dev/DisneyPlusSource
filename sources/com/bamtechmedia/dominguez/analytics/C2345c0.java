package com.bamtechmedia.dominguez.analytics;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.C0538i;
import androidx.fragment.app.C0538i.C0540b;
import androidx.fragment.app.Fragment;
import p512h.C11868a;

/* renamed from: com.bamtechmedia.dominguez.analytics.c0 */
/* compiled from: PageLoadAnalyticsCallbacks.kt */
public final class C2345c0 extends C0540b implements ActivityLifecycleCallbacks {

    /* renamed from: c */
    private final C11868a<C2340b0> f6552c;

    public C2345c0(C11868a<C2340b0> aVar) {
        this.f6552c = aVar;
    }

    /* renamed from: b */
    private final C2340b0 m8845b() {
        return (C2340b0) this.f6552c.get();
    }

    /* renamed from: a */
    public void mo3166a(C0538i iVar, Fragment fragment, View view, Bundle bundle) {
        m8845b().mo11453b(fragment);
    }

    /* renamed from: e */
    public void mo3174e(C0538i iVar, Fragment fragment) {
        m8845b().mo11452a(fragment);
    }

    /* renamed from: g */
    public void mo3176g(C0538i iVar, Fragment fragment) {
        m8845b().mo11454c(fragment);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        m8845b().mo11451a(activity, (C0540b) this);
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
