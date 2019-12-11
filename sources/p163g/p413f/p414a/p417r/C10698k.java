package p163g.p413f.p414a.p417r;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Build.VERSION;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;
import p163g.p413f.p414a.C10652e;
import p163g.p413f.p414a.C10667n;

@Deprecated
/* renamed from: g.f.a.r.k */
/* compiled from: RequestManagerFragment */
public class C10698k extends Fragment {

    /* renamed from: U */
    private final C10703m f25300U;

    /* renamed from: V */
    private final Set<C10698k> f25301V;

    /* renamed from: W */
    private C10667n f25302W;

    /* renamed from: X */
    private C10698k f25303X;

    /* renamed from: Y */
    private Fragment f25304Y;

    /* renamed from: c */
    private final C10686a f25305c;

    /* renamed from: g.f.a.r.k$a */
    /* compiled from: RequestManagerFragment */
    private class C10699a implements C10703m {
        C10699a() {
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append("{fragment=");
            sb.append(C10698k.this);
            sb.append("}");
            return sb.toString();
        }
    }

    public C10698k() {
        this(new C10686a());
    }

    @TargetApi(17)
    /* renamed from: d */
    private Fragment m33642d() {
        Fragment parentFragment = VERSION.SDK_INT >= 17 ? getParentFragment() : null;
        return parentFragment != null ? parentFragment : this.f25304Y;
    }

    /* renamed from: e */
    private void m33643e() {
        C10698k kVar = this.f25303X;
        if (kVar != null) {
            kVar.m33641b(this);
            this.f25303X = null;
        }
    }

    /* renamed from: a */
    public void mo27631a(C10667n nVar) {
        this.f25302W = nVar;
    }

    /* renamed from: b */
    public C10667n mo27632b() {
        return this.f25302W;
    }

    /* renamed from: c */
    public C10703m mo27633c() {
        return this.f25300U;
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            m33639a(activity);
        } catch (IllegalStateException e) {
            String str = "RMFragment";
            if (Log.isLoggable(str, 5)) {
                Log.w(str, "Unable to register fragment with root", e);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f25305c.mo27621a();
        m33643e();
    }

    public void onDetach() {
        super.onDetach();
        m33643e();
    }

    public void onStart() {
        super.onStart();
        this.f25305c.mo27623b();
    }

    public void onStop() {
        super.onStop();
        this.f25305c.mo27625c();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        sb.append(m33642d());
        sb.append("}");
        return sb.toString();
    }

    @SuppressLint({"ValidFragment"})
    C10698k(C10686a aVar) {
        this.f25300U = new C10699a();
        this.f25301V = new HashSet();
        this.f25305c = aVar;
    }

    /* renamed from: b */
    private void m33641b(C10698k kVar) {
        this.f25301V.remove(kVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C10686a mo27629a() {
        return this.f25305c;
    }

    /* renamed from: a */
    private void m33640a(C10698k kVar) {
        this.f25301V.add(kVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo27630a(Fragment fragment) {
        this.f25304Y = fragment;
        if (fragment != null && fragment.getActivity() != null) {
            m33639a(fragment.getActivity());
        }
    }

    /* renamed from: a */
    private void m33639a(Activity activity) {
        m33643e();
        this.f25303X = C10652e.m33418b((Context) activity).mo27528h().mo27647b(activity);
        if (!equals(this.f25303X)) {
            this.f25303X.m33640a(this);
        }
    }
}
