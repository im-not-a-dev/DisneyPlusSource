package p163g.p201e.p203b.p314r;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.C12880j;

/* renamed from: g.e.b.r.g */
/* compiled from: KidsModeInflaterExt.kt */
public final class C7738g {
    /* renamed from: a */
    public static /* synthetic */ View m22802a(Fragment fragment, int i, ViewGroup viewGroup, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m22801a(fragment, i, viewGroup, z);
    }

    /* renamed from: a */
    public static final View m22801a(Fragment fragment, int i, ViewGroup viewGroup, boolean z) {
        LayoutInflater layoutInflater = fragment.getLayoutInflater();
        C12880j.m40222a((Object) layoutInflater, "this.layoutInflater");
        return m22803a(fragment, layoutInflater, i, viewGroup, z);
    }

    /* renamed from: a */
    private static final View m22803a(Fragment fragment, LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z) {
        while (true) {
            Fragment parentFragment = fragment.getParentFragment();
            if (fragment instanceof C7736f) {
                return ((C7736f) fragment).mo19494a(layoutInflater, i, viewGroup, z);
            }
            if (parentFragment == null) {
                View inflate = layoutInflater.inflate(i, viewGroup, z);
                C12880j.m40222a((Object) inflate, "inflater.inflate(resourc… container, attachToRoot)");
                return inflate;
            }
            fragment = parentFragment;
        }
    }
}
