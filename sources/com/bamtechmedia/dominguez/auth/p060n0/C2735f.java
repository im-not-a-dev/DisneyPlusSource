package com.bamtechmedia.dominguez.auth.p060n0;

import android.os.Bundle;
import android.view.View;
import com.bamtechmedia.dominguez.analytics.C2378m;
import com.bamtechmedia.dominguez.analytics.p057o0.C2433b;
import com.bamtechmedia.dominguez.auth.C2721j0;
import com.bamtechmedia.dominguez.auth.p061o0.p063i.C2752a;
import com.bamtechmedia.dominguez.auth.p069u0.C3004g;
import com.bamtechmedia.dominguez.auth.p069u0.C3017j.C3018a;
import com.bamtechmedia.dominguez.core.design.widgets.textinputlayout.PasswordInputLayout;
import com.bamtechmedia.dominguez.core.utils.C5880u;
import java.util.HashMap;
import kotlin.jvm.internal.C12880j;
import p163g.p201e.p203b.p312q.C7717x;

/* renamed from: com.bamtechmedia.dominguez.auth.n0.f */
/* compiled from: AccountPasswordResetFragment.kt */
public final class C2735f extends C3004g implements C7717x {

    /* renamed from: Y */
    public C2752a f7488Y;

    /* renamed from: Z */
    private HashMap f7489Z;

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f7489Z;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f7489Z == null) {
            this.f7489Z = new HashMap();
        }
        View view = (View) this.f7489Z.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f7489Z.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public void mo11747a(C3018a aVar) {
        if (aVar.mo12026d()) {
            C2752a aVar2 = this.f7488Y;
            if (aVar2 != null) {
                aVar2.mo11750b();
            } else {
                C12880j.m40227c("accountUpdateRouter");
                throw null;
            }
        }
    }

    /* renamed from: e */
    public C2378m mo11534e() {
        return new C2378m(C2433b.ACCOUNT_SETTINGS_CREATE_PASSWORD, (String) null, 2, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        PasswordInputLayout r = mo12011r();
        if (r != null) {
            r.setHint(C5880u.m18936a(C2721j0.password));
        }
    }
}
