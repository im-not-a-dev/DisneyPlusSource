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

/* renamed from: com.bamtechmedia.dominguez.auth.s0.f0 */
/* compiled from: OtpVerifyBindingModule */
abstract class C2863f0 {
    /* renamed from: a */
    static C2756e m10576a(C5792f fVar) {
        return new C3016i(fVar);
    }

    /* renamed from: b */
    static OneTimePasscodeRequestReason m10581b() {
        return OneTimePasscodeRequestReason.Authenticate;
    }

    /* renamed from: a */
    static String m10580a(C2881m0 m0Var) {
        return m0Var.mo11873r();
    }

    /* renamed from: a */
    static C3140w m10579a() {
        return new C2709e0();
    }

    /* renamed from: a */
    static C2901o0 m10577a(C2881m0 m0Var, String str, C2940x xVar, C2928w wVar, C3140w wVar2, C7626a aVar, C7547h hVar, Boolean bool, C2887n nVar) {
        C2858d dVar = new C2858d(str, xVar, wVar, wVar2, aVar, hVar, bool, nVar);
        C2881m0 m0Var2 = m0Var;
        return (C2901o0) C5856o0.m18893a((Fragment) m0Var, C2901o0.class, (Provider<T>) dVar);
    }

    /* renamed from: a */
    static /* synthetic */ C2901o0 m10578a(String str, C2940x xVar, C2928w wVar, C3140w wVar2, C7626a aVar, C7547h hVar, Boolean bool, C2887n nVar) {
        C2901o0 o0Var = new C2901o0(str, xVar, wVar, wVar2, aVar, hVar, bool.booleanValue(), nVar);
        return o0Var;
    }
}
