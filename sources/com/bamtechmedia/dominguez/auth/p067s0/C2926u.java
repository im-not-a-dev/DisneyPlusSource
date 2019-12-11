package com.bamtechmedia.dominguez.auth.p067s0;

import android.view.View;
import com.bamtechmedia.dominguez.analytics.C2378m;
import com.bamtechmedia.dominguez.analytics.p057o0.C2433b;
import com.bamtechmedia.dominguez.auth.p061o0.p063i.C2754c;
import com.bamtechmedia.dominguez.auth.p061o0.p063i.C2756e;
import com.bamtechmedia.dominguez.auth.p067s0.C2901o0.C2903b;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.bamtechmedia.dominguez.auth.s0.u */
/* compiled from: OtpLoginFragment.kt */
public final class C2926u extends C2889o {

    /* renamed from: g0 */
    public C2756e f7747g0;

    /* renamed from: h0 */
    public C2754c f7748h0;

    /* renamed from: i0 */
    private HashMap f7749i0;

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f7749i0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f7749i0 == null) {
            this.f7749i0 = new HashMap();
        }
        View view = (View) this.f7749i0.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f7749i0.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public void mo11869a(C2903b bVar) {
        if (bVar.mo11911e()) {
            C2756e eVar = this.f7747g0;
            if (eVar != null) {
                eVar.mo11773b();
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("passwordResetRouter");
                throw null;
            }
        } else if (bVar.mo11907a()) {
            C2754c cVar = this.f7748h0;
            if (cVar != null) {
                cVar.mo11764a();
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("authHostRouter");
                throw null;
            }
        }
    }

    /* renamed from: e */
    public C2378m mo11534e() {
        return new C2378m(C2433b.FORGOT_PASSWORD_ENTER_CODE, (String) null, 2, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    /* renamed from: e */
    public void mo11870e(String str) {
        getViewModel().mo11903b(str);
    }
}
