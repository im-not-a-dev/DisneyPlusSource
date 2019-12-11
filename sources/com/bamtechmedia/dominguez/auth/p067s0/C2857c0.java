package com.bamtechmedia.dominguez.auth.p067s0;

import android.view.View;
import com.bamtechmedia.dominguez.analytics.C2378m;
import com.bamtechmedia.dominguez.auth.C2784r;
import com.bamtechmedia.dominguez.auth.p061o0.p063i.C2754c;
import com.bamtechmedia.dominguez.auth.p061o0.p063i.C2756e;
import com.bamtechmedia.dominguez.auth.p067s0.C2901o0.C2903b;
import com.bamtechmedia.dominguez.core.utils.C5839j;
import com.bamtechmedia.dominguez.core.utils.C5883w;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KProperty;

/* renamed from: com.bamtechmedia.dominguez.auth.s0.c0 */
/* compiled from: OtpResetPasswordFragment.kt */
public final class C2857c0 extends C2889o {

    /* renamed from: l0 */
    static final /* synthetic */ KProperty[] f7656l0 = {C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(C2857c0.class), "section", "getSection()Lcom/bamtechmedia/dominguez/analytics/AnalyticsSection;"))};

    /* renamed from: g0 */
    public C2784r f7657g0;

    /* renamed from: h0 */
    public C2756e f7658h0;

    /* renamed from: i0 */
    public C2754c f7659i0;

    /* renamed from: j0 */
    private final C5883w f7660j0 = C5839j.m18852a("section", (Function0) null, 2, (Object) null);

    /* renamed from: k0 */
    private HashMap f7661k0;

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f7661k0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f7661k0 == null) {
            this.f7661k0 = new HashMap();
        }
        View view = (View) this.f7661k0.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f7661k0.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public void mo11869a(C2903b bVar) {
        if (bVar.mo11911e()) {
            C2756e eVar = this.f7658h0;
            if (eVar != null) {
                eVar.mo11773b();
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("passwordResetRouter");
                throw null;
            }
        } else if (bVar.mo11907a()) {
            C2754c cVar = this.f7659i0;
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
        return mo11871q();
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    /* renamed from: q */
    public final C2378m mo11871q() {
        return (C2378m) this.f7660j0.mo17776a(this, f7656l0[0]);
    }

    /* renamed from: e */
    public void mo11870e(String str) {
        getViewModel().mo11904c(str);
    }
}
