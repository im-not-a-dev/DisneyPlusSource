package p163g.p426g.p427a;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import p163g.p426g.p432d.p433a.C10844e;
import p163g.p426g.p432d.p433a.C10847h;
import p163g.p426g.p435f.C10854b;

/* renamed from: g.g.a.e */
/* compiled from: ConvivaBackgroundManager */
public class C10814e implements ActivityLifecycleCallbacks {

    /* renamed from: V */
    private static C10814e f25568V;

    /* renamed from: U */
    private boolean f25569U = false;

    /* renamed from: c */
    private Application f25570c = null;

    private C10814e(Context context) {
        this.f25570c = (Application) context.getApplicationContext();
        this.f25570c.registerActivityLifecycleCallbacks(this);
    }

    /* renamed from: b */
    public static C10814e m34083b() {
        if (f25568V == null) {
            f25568V = new C10814e(C10847h.m34189a());
        }
        return f25568V;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
        if (C10844e.m34186g().booleanValue() && this.f25569U) {
            C10854b.m34212d();
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
        this.f25569U = true;
    }
}
