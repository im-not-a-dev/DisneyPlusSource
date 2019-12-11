package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import androidx.fragment.app.C0532d;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0742z.C0743a;
import androidx.lifecycle.C0742z.C0744b;

/* renamed from: androidx.lifecycle.a0 */
/* compiled from: ViewModelProviders */
public class C0703a0 {
    /* renamed from: a */
    private static Application m3716a(Activity activity) {
        Application application = activity.getApplication();
        if (application != null) {
            return application;
        }
        throw new IllegalStateException("Your activity/fragment is not yet attached to Application. You can't request ViewModel before onCreate call.");
    }

    /* renamed from: b */
    public static C0742z m3720b(Fragment fragment) {
        return m3717a(fragment, (C0744b) null);
    }

    /* renamed from: a */
    private static Activity m3715a(Fragment fragment) {
        C0532d activity = fragment.getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Can't create ViewModelProvider for detached fragment");
    }

    /* renamed from: a */
    public static C0742z m3718a(C0532d dVar) {
        return m3719a(dVar, (C0744b) null);
    }

    /* renamed from: a */
    public static C0742z m3717a(Fragment fragment, C0744b bVar) {
        Application a = m3716a(m3715a(fragment));
        if (bVar == null) {
            bVar = C0743a.m3811a(a);
        }
        return new C0742z(fragment.getViewModelStore(), bVar);
    }

    /* renamed from: a */
    public static C0742z m3719a(C0532d dVar, C0744b bVar) {
        Application a = m3716a((Activity) dVar);
        if (bVar == null) {
            bVar = C0743a.m3811a(a);
        }
        return new C0742z(dVar.getViewModelStore(), bVar);
    }
}
