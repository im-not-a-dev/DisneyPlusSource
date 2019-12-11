package p163g.p413f.p414a.p417r;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import androidx.fragment.app.C0532d;
import androidx.fragment.app.Fragment;
import java.util.HashSet;
import java.util.Set;
import p163g.p413f.p414a.C10652e;
import p163g.p413f.p414a.C10667n;

/* renamed from: g.f.a.r.o */
/* compiled from: SupportRequestManagerFragment */
public class C10705o extends Fragment {

    /* renamed from: U */
    private final C10703m f25319U;

    /* renamed from: V */
    private final Set<C10705o> f25320V;

    /* renamed from: W */
    private C10705o f25321W;

    /* renamed from: X */
    private C10667n f25322X;

    /* renamed from: Y */
    private Fragment f25323Y;

    /* renamed from: c */
    private final C10686a f25324c;

    /* renamed from: g.f.a.r.o$a */
    /* compiled from: SupportRequestManagerFragment */
    private class C10706a implements C10703m {
        C10706a() {
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append("{fragment=");
            sb.append(C10705o.this);
            sb.append("}");
            return sb.toString();
        }
    }

    public C10705o() {
        this(new C10686a());
    }

    /* renamed from: b */
    private void m33681b(C10705o oVar) {
        this.f25320V.remove(oVar);
    }

    /* renamed from: r */
    private Fragment m33682r() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.f25323Y;
    }

    /* renamed from: s */
    private void m33683s() {
        C10705o oVar = this.f25321W;
        if (oVar != null) {
            oVar.m33681b(this);
            this.f25321W = null;
        }
    }

    /* renamed from: a */
    public void mo27658a(C10667n nVar) {
        this.f25322X = nVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public C10686a mo27659o() {
        return this.f25324c;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            m33679a(getActivity());
        } catch (IllegalStateException e) {
            String str = "SupportRMFragment";
            if (Log.isLoggable(str, 5)) {
                Log.w(str, "Unable to register fragment with root", e);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f25324c.mo27621a();
        m33683s();
    }

    public void onDetach() {
        super.onDetach();
        this.f25323Y = null;
        m33683s();
    }

    public void onStart() {
        super.onStart();
        this.f25324c.mo27623b();
    }

    public void onStop() {
        super.onStop();
        this.f25324c.mo27625c();
    }

    /* renamed from: p */
    public C10667n mo27660p() {
        return this.f25322X;
    }

    /* renamed from: q */
    public C10703m mo27661q() {
        return this.f25319U;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        sb.append(m33682r());
        sb.append("}");
        return sb.toString();
    }

    @SuppressLint({"ValidFragment"})
    public C10705o(C10686a aVar) {
        this.f25319U = new C10706a();
        this.f25320V = new HashSet();
        this.f25324c = aVar;
    }

    /* renamed from: a */
    private void m33680a(C10705o oVar) {
        this.f25320V.add(oVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo27657a(Fragment fragment) {
        this.f25323Y = fragment;
        if (fragment != null && fragment.getActivity() != null) {
            m33679a(fragment.getActivity());
        }
    }

    /* renamed from: a */
    private void m33679a(C0532d dVar) {
        m33683s();
        this.f25321W = C10652e.m33418b((Context) dVar).mo27528h().mo27648b(dVar);
        if (!equals(this.f25321W)) {
            this.f25321W.m33680a(this);
        }
    }
}
