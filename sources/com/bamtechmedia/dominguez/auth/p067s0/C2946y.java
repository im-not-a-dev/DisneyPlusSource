package com.bamtechmedia.dominguez.auth.p067s0;

import androidx.fragment.app.Fragment;
import com.bamtech.sdk4.identity.bam.OneTimePasscodeRequestReason;
import com.bamtechmedia.dominguez.auth.C3140w;
import com.bamtechmedia.dominguez.core.utils.C5856o0;
import javax.inject.Provider;
import p163g.p201e.p203b.p299m.C7547h;
import p163g.p201e.p203b.p307o.p308p.C7626a;

/* renamed from: com.bamtechmedia.dominguez.auth.s0.y */
/* compiled from: OtpResetPasswordBindingModule */
abstract class C2946y {
    /* renamed from: a */
    static OneTimePasscodeRequestReason m10713a() {
        return OneTimePasscodeRequestReason.ForgotPassword;
    }

    /* renamed from: a */
    static C2901o0 m10714a(C2857c0 c0Var, String str, C2940x xVar, C2928w wVar, C3140w wVar2, C7626a aVar, C7547h hVar, Boolean bool, C2887n nVar) {
        C2856c cVar = new C2856c(str, xVar, wVar, wVar2, aVar, hVar, bool, nVar);
        C2857c0 c0Var2 = c0Var;
        return (C2901o0) C5856o0.m18893a((Fragment) c0Var, C2901o0.class, (Provider<T>) cVar);
    }

    /* renamed from: a */
    static /* synthetic */ C2901o0 m10715a(String str, C2940x xVar, C2928w wVar, C3140w wVar2, C7626a aVar, C7547h hVar, Boolean bool, C2887n nVar) {
        C2901o0 o0Var = new C2901o0(str, xVar, wVar, wVar2, aVar, hVar, bool.booleanValue(), nVar);
        return o0Var;
    }
}
