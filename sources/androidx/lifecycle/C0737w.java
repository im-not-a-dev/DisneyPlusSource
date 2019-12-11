package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import androidx.lifecycle.C0715i.C0716a;

/* renamed from: androidx.lifecycle.w */
/* compiled from: ReportFragment */
public class C0737w extends Fragment {

    /* renamed from: c */
    private C0738a f3027c;

    /* renamed from: androidx.lifecycle.w$a */
    /* compiled from: ReportFragment */
    interface C0738a {
        /* renamed from: a */
        void mo4159a();

        /* renamed from: b */
        void mo4160b();

        /* renamed from: c */
        void mo4161c();
    }

    /* renamed from: a */
    static C0737w m3793a(Activity activity) {
        return (C0737w) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
    }

    /* renamed from: b */
    public static void m3795b(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        String str = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag";
        if (fragmentManager.findFragmentByTag(str) == null) {
            fragmentManager.beginTransaction().add(new C0737w(), str).commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* renamed from: c */
    private void m3797c(C0738a aVar) {
        if (aVar != null) {
            aVar.mo4161c();
        }
    }

    /* renamed from: d */
    private void m3798d(C0738a aVar) {
        if (aVar != null) {
            aVar.mo4159a();
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m3796b(this.f3027c);
        m3794a(C0716a.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        m3794a(C0716a.ON_DESTROY);
        this.f3027c = null;
    }

    public void onPause() {
        super.onPause();
        m3794a(C0716a.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        m3797c(this.f3027c);
        m3794a(C0716a.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        m3798d(this.f3027c);
        m3794a(C0716a.ON_START);
    }

    public void onStop() {
        super.onStop();
        m3794a(C0716a.ON_STOP);
    }

    /* renamed from: a */
    private void m3794a(C0716a aVar) {
        Activity activity = getActivity();
        if (activity instanceof C0726o) {
            ((C0726o) activity).getLifecycle().mo4139a(aVar);
            return;
        }
        if (activity instanceof C0722m) {
            C0715i lifecycle = ((C0722m) activity).getLifecycle();
            if (lifecycle instanceof C0723n) {
                ((C0723n) lifecycle).mo4139a(aVar);
            }
        }
    }

    /* renamed from: b */
    private void m3796b(C0738a aVar) {
        if (aVar != null) {
            aVar.mo4160b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4164a(C0738a aVar) {
        this.f3027c = aVar;
    }
}
