package com.bamtechmedia.dominguez.auth.p067s0;

import androidx.fragment.app.Fragment;
import com.bamtech.sdk4.identity.bam.OneTimePasscodeRequestReason;
import com.bamtechmedia.dominguez.auth.C2709e0;
import com.bamtechmedia.dominguez.auth.C3140w;
import com.bamtechmedia.dominguez.auth.p061o0.p063i.C2756e;
import com.bamtechmedia.dominguez.auth.p069u0.C3016i;
import com.bamtechmedia.dominguez.core.p218n.C5792f;
import com.bamtechmedia.dominguez.core.utils.C5856o0;
import javax.inject.Provider;
import p163g.p201e.p203b.p299m.C7547h;
import p163g.p201e.p203b.p307o.p308p.C7626a;

/* renamed from: com.bamtechmedia.dominguez.auth.s0.e */
/* compiled from: AccountOtpPasscodeBindingModule */
abstract class C2860e {
    /* renamed from: a */
    static C2756e m10564a(C5792f fVar) {
        return new C3016i(fVar);
    }

    /* renamed from: b */
    static OneTimePasscodeRequestReason m10569b() {
        return OneTimePasscodeRequestReason.ForgotPassword;
    }

    /* renamed from: a */
    static String m10568a(C2876l lVar) {
        return lVar.mo11871q();
    }

    /* renamed from: a */
    static C3140w m10567a() {
        return new C2709e0();
    }

    /* renamed from: a */
    static C2901o0 m10565a(C2876l lVar, String str, C2940x xVar, C2928w wVar, C3140w wVar2, C7626a aVar, C7547h hVar, Boolean bool, C2887n nVar) {
        C2852a aVar2 = new C2852a(str, xVar, wVar, wVar2, aVar, hVar, bool, nVar);
        C2876l lVar2 = lVar;
        return (C2901o0) C5856o0.m18893a((Fragment) lVar, C2901o0.class, (Provider<T>) aVar2);
    }

    /* renamed from: a */
    static /* synthetic */ C2901o0 m10566a(String str, C2940x xVar, C2928w wVar, C3140w wVar2, C7626a aVar, C7547h hVar, Boolean bool, C2887n nVar) {
        C2901o0 o0Var = new C2901o0(str, xVar, wVar, wVar2, aVar, hVar, bool.booleanValue(), nVar);
        return o0Var;
    }
}
