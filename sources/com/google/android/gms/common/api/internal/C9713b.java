package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.gms.common.util.C9948l;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.common.api.internal.b */
public final class C9713b implements ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: X */
    private static final C9713b f22763X = new C9713b();

    /* renamed from: U */
    private final AtomicBoolean f22764U = new AtomicBoolean();

    /* renamed from: V */
    private final ArrayList<C9714a> f22765V = new ArrayList<>();

    /* renamed from: W */
    private boolean f22766W = false;

    /* renamed from: c */
    private final AtomicBoolean f22767c = new AtomicBoolean();

    /* renamed from: com.google.android.gms.common.api.internal.b$a */
    public interface C9714a {
        /* renamed from: a */
        void mo25115a(boolean z);
    }

    private C9713b() {
    }

    /* renamed from: a */
    public static void m30161a(Application application) {
        synchronized (f22763X) {
            if (!f22763X.f22766W) {
                application.registerActivityLifecycleCallbacks(f22763X);
                application.registerComponentCallbacks(f22763X);
                f22763X.f22766W = true;
            }
        }
    }

    /* renamed from: c */
    public static C9713b m30163c() {
        return f22763X;
    }

    /* renamed from: b */
    public final boolean mo25104b() {
        return this.f22767c.get();
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f22767c.compareAndSet(true, false);
        this.f22764U.set(true);
        if (compareAndSet) {
            m30162b(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f22767c.compareAndSet(true, false);
        this.f22764U.set(true);
        if (compareAndSet) {
            m30162b(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        if (i == 20 && this.f22767c.compareAndSet(false, true)) {
            this.f22764U.set(true);
            m30162b(true);
        }
    }

    /* renamed from: b */
    private final void m30162b(boolean z) {
        synchronized (f22763X) {
            ArrayList<C9714a> arrayList = this.f22765V;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((C9714a) obj).mo25115a(z);
            }
        }
    }

    @TargetApi(16)
    /* renamed from: a */
    public final boolean mo25103a(boolean z) {
        if (!this.f22764U.get()) {
            if (!C9948l.m30990c()) {
                return z;
            }
            RunningAppProcessInfo runningAppProcessInfo = new RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f22764U.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f22767c.set(true);
            }
        }
        return mo25104b();
    }

    /* renamed from: a */
    public final void mo25102a(C9714a aVar) {
        synchronized (f22763X) {
            this.f22765V.add(aVar);
        }
    }
}
