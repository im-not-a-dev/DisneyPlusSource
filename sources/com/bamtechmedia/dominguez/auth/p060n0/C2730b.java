package com.bamtechmedia.dominguez.auth.p060n0;

import androidx.fragment.app.Fragment;
import com.bamtech.sdk4.account.AccountApi;
import com.bamtechmedia.dominguez.auth.C2709e0;
import com.bamtechmedia.dominguez.auth.C3140w;
import com.bamtechmedia.dominguez.auth.p061o0.p062h.C2750c;
import com.bamtechmedia.dominguez.auth.p064p0.C2760a;
import com.bamtechmedia.dominguez.auth.p067s0.C2887n;
import com.bamtechmedia.dominguez.auth.p069u0.C2997f;
import com.bamtechmedia.dominguez.auth.p069u0.C3017j;
import com.bamtechmedia.dominguez.core.utils.C5856o0;
import com.google.common.base.Optional;
import javax.inject.Provider;
import p163g.p201e.p203b.p307o.p308p.C7626a;

/* renamed from: com.bamtechmedia.dominguez.auth.n0.b */
/* compiled from: AccountPasswordResetBindingModule */
abstract class C2730b {
    /* renamed from: a */
    static C3140w m10366a() {
        return new C2709e0();
    }

    /* renamed from: a */
    static C3017j m10364a(C2735f fVar, C2750c cVar, C2997f fVar2, C3140w wVar, AccountApi accountApi, Optional<C2760a> optional, C7626a aVar, C2887n nVar) {
        C2729a aVar2 = new C2729a(cVar, fVar2, wVar, accountApi, optional, aVar, nVar);
        C2735f fVar3 = fVar;
        return (C3017j) C5856o0.m18893a((Fragment) fVar, C3017j.class, (Provider<T>) aVar2);
    }

    /* renamed from: a */
    static /* synthetic */ C3017j m10365a(C2750c cVar, C2997f fVar, C3140w wVar, AccountApi accountApi, Optional optional, C7626a aVar, C2887n nVar) {
        C3017j jVar = new C3017j(cVar, fVar, wVar, accountApi, (C2760a) optional.mo27107c(), aVar, nVar);
        return jVar;
    }
}
