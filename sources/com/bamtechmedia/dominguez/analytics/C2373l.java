package com.bamtechmedia.dominguez.analytics;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import p163g.p164a.p165a.C4705m;

/* renamed from: com.bamtechmedia.dominguez.analytics.l */
/* compiled from: AnalyticsLifecycleResponder.kt */
public final class C2373l implements ActivityLifecycleCallbacks {
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        C4705m.m16375b();
    }

    public void onActivityResumed(Activity activity) {
        C4705m.m16370a(activity);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
