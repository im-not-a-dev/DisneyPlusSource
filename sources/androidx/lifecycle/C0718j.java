package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.lifecycle.j */
/* compiled from: LifecycleDispatcher */
class C0718j {

    /* renamed from: a */
    private static AtomicBoolean f2999a = new AtomicBoolean(false);

    /* renamed from: androidx.lifecycle.j$a */
    /* compiled from: LifecycleDispatcher */
    static class C0719a extends C0711e {
        C0719a() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            C0737w.m3795b(activity);
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: a */
    static void m3749a(Context context) {
        if (!f2999a.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C0719a());
        }
    }
}
