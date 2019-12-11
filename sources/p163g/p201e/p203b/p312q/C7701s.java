package p163g.p201e.p203b.p312q;

import androidx.fragment.app.C0538i;
import androidx.fragment.app.Fragment;

/* renamed from: g.e.b.q.s */
/* compiled from: GlobalNavTvEnabled.kt */
public final class C7701s {
    /* renamed from: a */
    public static final boolean m22724a(C0538i iVar) {
        if (iVar.mo3160f() instanceof C7700r) {
            return true;
        }
        Fragment f = iVar.mo3160f();
        if (f != null) {
            C0538i childFragmentManager = f.getChildFragmentManager();
            if (childFragmentManager != null && m22724a(childFragmentManager)) {
                return true;
            }
        }
        return false;
    }
}
