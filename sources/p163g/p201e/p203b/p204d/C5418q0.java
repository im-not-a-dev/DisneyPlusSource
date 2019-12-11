package p163g.p201e.p203b.p204d;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import p512h.p513c.p514k.C11890i;

/* renamed from: g.e.b.d.q0 */
/* compiled from: SubscriptionFragment.kt */
public final class C5418q0 extends C11890i {

    /* renamed from: U */
    public C5402j f12927U;

    /* renamed from: V */
    private HashMap f12928V;

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f12928V;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C5413o0.fragment_account_settings, viewGroup, false);
        Intrinsics.checkReturnedValueIsNotNull((Object) inflate, "inflater.inflate(R.layou…ttings, container, false)");
        return inflate;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (bundle == null) {
            C5402j jVar = this.f12927U;
            if (jVar != null) {
                jVar.mo17146a();
                requireFragmentManager().mo3161g();
                return;
            }
            Intrinsics.throwUninitializedPropertyAccessException("accountSettingsRouter");
            throw null;
        }
    }
}
