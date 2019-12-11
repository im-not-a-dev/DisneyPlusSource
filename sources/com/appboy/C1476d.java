package com.appboy;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import com.appboy.p033s.C1557c;
import com.appboy.p034ui.inappmessage.AppboyInAppMessageManager;
import com.appboy.push.AppboyNotificationRoutingActivity;
import java.util.Collections;
import java.util.Set;

/* renamed from: com.appboy.d */
/* compiled from: AppboyLifecycleCallbackListener */
public class C1476d implements ActivityLifecycleCallbacks {

    /* renamed from: X */
    private static final String f5313X = C1557c.m7461a(C1476d.class);

    /* renamed from: U */
    private final boolean f5314U;

    /* renamed from: V */
    private Set<Class> f5315V;

    /* renamed from: W */
    private Set<Class> f5316W;

    /* renamed from: c */
    private final boolean f5317c;

    public C1476d() {
        this(true, true, Collections.emptySet(), Collections.emptySet());
    }

    /* renamed from: a */
    private boolean m6997a(Activity activity, boolean z) {
        Class cls = activity.getClass();
        if (cls.equals(AppboyNotificationRoutingActivity.class)) {
            return false;
        }
        if (z) {
            return !this.f5316W.contains(cls);
        }
        return !this.f5315V.contains(cls);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (this.f5317c && m6997a(activity, false)) {
            AppboyInAppMessageManager.getInstance().ensureSubscribedToInAppMessageEvents(activity.getApplicationContext());
        }
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        if (this.f5317c && m6997a(activity, false)) {
            AppboyInAppMessageManager.getInstance().unregisterInAppMessageManager(activity);
        }
    }

    public void onActivityResumed(Activity activity) {
        if (this.f5317c && m6997a(activity, false)) {
            AppboyInAppMessageManager.getInstance().registerInAppMessageManager(activity);
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        if (this.f5314U && m6997a(activity, true)) {
            C1440a.m6921c(activity.getApplicationContext()).mo6572b(activity);
        }
    }

    public void onActivityStopped(Activity activity) {
        if (this.f5314U && m6997a(activity, true)) {
            C1440a.m6921c(activity.getApplicationContext()).mo6558a(activity);
        }
    }

    public C1476d(boolean z, boolean z2) {
        this(z, z2, Collections.emptySet(), Collections.emptySet());
    }

    public C1476d(boolean z, boolean z2, Set<Class> set, Set<Class> set2) {
        this.f5317c = z2;
        this.f5314U = z;
        if (set == null) {
            set = Collections.emptySet();
        }
        this.f5315V = set;
        if (set2 == null) {
            set2 = Collections.emptySet();
        }
        this.f5316W = set2;
        String str = f5313X;
        StringBuilder sb = new StringBuilder();
        sb.append("AppboyLifecycleCallbackListener using in-app messaging blacklist: ");
        sb.append(this.f5315V);
        C1557c.m7471d(str, sb.toString());
        String str2 = f5313X;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AppboyLifecycleCallbackListener using session handling blacklist: ");
        sb2.append(this.f5316W);
        C1557c.m7471d(str2, sb2.toString());
    }
}
