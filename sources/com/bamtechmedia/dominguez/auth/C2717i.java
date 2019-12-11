package com.bamtechmedia.dominguez.auth;

import androidx.fragment.app.Fragment;
import com.bamtechmedia.dominguez.analytics.C2378m;
import com.bamtechmedia.dominguez.analytics.p057o0.C2433b;
import com.bamtechmedia.dominguez.auth.p061o0.p063i.C2755d;
import com.bamtechmedia.dominguez.auth.p061o0.p063i.C2756e;
import com.bamtechmedia.dominguez.auth.p067s0.C2861e0;
import com.bamtechmedia.dominguez.auth.p069u0.C3016i;
import com.bamtechmedia.dominguez.core.p218n.C5792f;
import com.bamtechmedia.dominguez.core.utils.C5856o0;
import com.disney.disneyplus.R;
import javax.inject.Provider;
import p163g.p201e.p203b.p286j.C7304o;
import p163g.p201e.p203b.p307o.p308p.C7626a;
import p163g.p201e.p203b.p307o.p308p.C7628b;

/* renamed from: com.bamtechmedia.dominguez.auth.i */
/* compiled from: AuthHostTvBindingModule */
abstract class C2717i {
    /* renamed from: a */
    static C3145z m10352a(C2712g gVar, C2727m0 m0Var) {
        return new C3145z(C5792f.m18756a(gVar, R.id.authContent), m0Var);
    }

    /* renamed from: b */
    static C2784r m10356b(C2712g gVar, C7304o oVar) {
        return (C2784r) C5856o0.m18893a((Fragment) gVar, C2784r.class, (Provider<T>) new C2692a<T>(gVar, oVar));
    }

    /* renamed from: b */
    static C2378m m10355b(C2784r rVar) {
        if (rVar.mo11796D()) {
            return new C2378m(C2433b.ONBOARDING_FORGOT_PASSWORD);
        }
        return new C2378m(C2433b.FORGOT_PASSWORD_ENTER_CODE);
    }

    /* renamed from: a */
    static C7626a m10353a(C2712g gVar, C7628b bVar) {
        return bVar.mo20542a(gVar, R.id.authContent);
    }

    /* renamed from: a */
    static /* synthetic */ C2784r m10351a(C2712g gVar, C7304o oVar) {
        return new C2784r(gVar.getSavedStateRegistry(), oVar);
    }

    /* renamed from: a */
    static C2755d m10349a(C2712g gVar, C2378m mVar) {
        return new C2861e0(C5792f.m18756a(gVar, R.id.authContent), mVar);
    }

    /* renamed from: a */
    static C2756e m10350a(C2712g gVar) {
        return new C3016i(C5792f.m18756a(gVar, R.id.authContent));
    }

    /* renamed from: a */
    static boolean m10354a(C2784r rVar) {
        return rVar.mo11796D();
    }
}
