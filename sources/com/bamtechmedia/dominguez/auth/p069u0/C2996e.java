package com.bamtechmedia.dominguez.auth.p069u0;

import android.view.View;
import com.bamtechmedia.dominguez.analytics.C2378m;
import com.bamtechmedia.dominguez.analytics.p057o0.C2433b;
import java.util.HashMap;

/* renamed from: com.bamtechmedia.dominguez.auth.u0.e */
/* compiled from: LoginResetFragment.kt */
public final class C2996e extends C3004g {

    /* renamed from: Y */
    private HashMap f7840Y;

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f7840Y;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f7840Y == null) {
            this.f7840Y = new HashMap();
        }
        View view = (View) this.f7840Y.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f7840Y.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: e */
    public C2378m mo11534e() {
        return new C2378m(C2433b.ACCOUNT_SETTINGS_CREATE_PASSWORD, (String) null, 2, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }
}
