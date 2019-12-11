package com.bamtechmedia.dominguez.core.design.widgets.vadergrid;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.C0530c;
import androidx.lifecycle.C0708c;
import androidx.lifecycle.C0710d;
import androidx.lifecycle.C0722m;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0012\u0013\u0014B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/design/widgets/vadergrid/VaderGridHelper;", "", "()V", "PREFERENCE_KEY", "", "application", "Landroid/app/Application;", "preferences", "Landroid/content/SharedPreferences;", "viewId", "", "setup", "", "update", "context", "Landroid/content/Context;", "window", "Landroid/view/Window;", "ActivityLifecycleCallbacks", "ActivityWindowLifecycleObserver", "DialogWindowLifecycleObserver", "lib_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: VaderGridHelper.kt */
public final class VaderGridHelper {

    /* renamed from: a */
    private static final int f13463a = View.generateViewId();

    /* renamed from: b */
    public static final VaderGridHelper f13464b = new VaderGridHelper();

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/design/widgets/vadergrid/VaderGridHelper$ActivityWindowLifecycleObserver;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "activity", "Landroid/app/Activity;", "preferences", "Landroid/content/SharedPreferences;", "(Landroid/app/Activity;Landroid/content/SharedPreferences;)V", "onCreate", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onDestroy", "onSharedPreferenceChanged", "sharedPreferences", "key", "", "lib_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: VaderGridHelper.kt */
    private static final class ActivityWindowLifecycleObserver implements C0710d, OnSharedPreferenceChangeListener {

        /* renamed from: U */
        private final SharedPreferences f13465U;

        /* renamed from: c */
        private final Activity f13466c;

        /* renamed from: a */
        public /* synthetic */ void mo4126a(C0722m mVar) {
            C0708c.m3735d(this, mVar);
        }

        /* renamed from: b */
        public void mo4127b(C0722m mVar) {
            this.f13465U.registerOnSharedPreferenceChangeListener(this);
            VaderGridHelper vaderGridHelper = VaderGridHelper.f13464b;
            Activity activity = this.f13466c;
            Window window = activity.getWindow();
            C12880j.m40222a((Object) window, "activity.window");
            vaderGridHelper.m18635a(activity, window, this.f13465U);
        }

        /* renamed from: c */
        public /* synthetic */ void mo4128c(C0722m mVar) {
            C0708c.m3734c(this, mVar);
        }

        /* renamed from: d */
        public /* synthetic */ void mo4129d(C0722m mVar) {
            C0708c.m3737f(this, mVar);
        }

        /* renamed from: e */
        public void mo4130e(C0722m mVar) {
            this.f13465U.unregisterOnSharedPreferenceChangeListener(this);
        }

        /* renamed from: f */
        public /* synthetic */ void mo4131f(C0722m mVar) {
            C0708c.m3736e(this, mVar);
        }

        public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            if (C12880j.m40224a((Object) str, (Object) "VADER_GRID_ENABLED")) {
                VaderGridHelper vaderGridHelper = VaderGridHelper.f13464b;
                Activity activity = this.f13466c;
                Window window = activity.getWindow();
                C12880j.m40222a((Object) window, "activity.window");
                vaderGridHelper.m18635a(activity, window, this.f13465U);
            }
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/core/design/widgets/vadergrid/VaderGridHelper$DialogWindowLifecycleObserver;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "dialogFragment", "Landroidx/fragment/app/DialogFragment;", "preferences", "Landroid/content/SharedPreferences;", "(Landroidx/fragment/app/DialogFragment;Landroid/content/SharedPreferences;)V", "onSharedPreferenceChanged", "", "sharedPreferences", "key", "", "onStart", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onStop", "lib_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: VaderGridHelper.kt */
    private static final class DialogWindowLifecycleObserver implements C0710d, OnSharedPreferenceChangeListener {

        /* renamed from: U */
        private final SharedPreferences f13467U;

        /* renamed from: c */
        private final C0530c f13468c;

        /* renamed from: a */
        public /* synthetic */ void mo4126a(C0722m mVar) {
            C0708c.m3735d(this, mVar);
        }

        /* renamed from: b */
        public /* synthetic */ void mo4127b(C0722m mVar) {
            C0708c.m3732a(this, mVar);
        }

        /* renamed from: c */
        public /* synthetic */ void mo4128c(C0722m mVar) {
            C0708c.m3734c(this, mVar);
        }

        /* renamed from: d */
        public void mo4129d(C0722m mVar) {
            this.f13467U.unregisterOnSharedPreferenceChangeListener(this);
        }

        /* renamed from: e */
        public /* synthetic */ void mo4130e(C0722m mVar) {
            C0708c.m3733b(this, mVar);
        }

        /* renamed from: f */
        public void mo4131f(C0722m mVar) {
            this.f13467U.registerOnSharedPreferenceChangeListener(this);
            Dialog dialog = this.f13468c.getDialog();
            if (dialog != null) {
                Window window = dialog.getWindow();
                if (window != null) {
                    VaderGridHelper vaderGridHelper = VaderGridHelper.f13464b;
                    Context requireContext = this.f13468c.requireContext();
                    C12880j.m40222a((Object) requireContext, "dialogFragment.requireContext()");
                    vaderGridHelper.m18635a(requireContext, window, this.f13467U);
                }
            }
        }

        public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            if (C12880j.m40224a((Object) str, (Object) "VADER_GRID_ENABLED")) {
                Dialog dialog = this.f13468c.getDialog();
                if (dialog != null) {
                    Window window = dialog.getWindow();
                    if (window != null) {
                        VaderGridHelper vaderGridHelper = VaderGridHelper.f13464b;
                        Context requireContext = this.f13468c.requireContext();
                        C12880j.m40222a((Object) requireContext, "dialogFragment.requireContext()");
                        vaderGridHelper.m18635a(requireContext, window, this.f13467U);
                    }
                }
            }
        }
    }

    private VaderGridHelper() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m18635a(Context context, Window window, SharedPreferences sharedPreferences) {
        View decorView = window.getDecorView();
        if (decorView != null) {
            ViewGroup viewGroup = (ViewGroup) decorView;
            View findViewById = decorView.findViewById(f13463a);
            boolean z = sharedPreferences.getBoolean("VADER_GRID_ENABLED", false);
            if (findViewById == null && z) {
                C5725a aVar = new C5725a(context, null, 0, 6, null);
                aVar.setId(f13463a);
                viewGroup.addView(aVar);
            } else if (findViewById != null && !z) {
                viewGroup.removeView(findViewById);
            }
        } else {
            throw new C13142s("null cannot be cast to non-null type android.view.ViewGroup");
        }
    }
}
