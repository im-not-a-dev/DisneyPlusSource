package com.bamtechmedia.dominguez.auth.p070v0.p072h;

import androidx.fragment.app.Fragment;
import com.bamtechmedia.dominguez.auth.C2784r;
import com.bamtechmedia.dominguez.auth.p061o0.p063i.C2753b;
import com.bamtechmedia.dominguez.auth.p061o0.p063i.C2755d;
import com.bamtechmedia.dominguez.auth.p070v0.C3032a;
import com.bamtechmedia.dominguez.auth.p070v0.C3033b;
import com.bamtechmedia.dominguez.auth.p070v0.C3034c;
import com.bamtechmedia.dominguez.auth.p070v0.C3046f;
import com.bamtechmedia.dominguez.core.utils.C5856o0;
import com.bamtechmedia.dominguez.legal.api.ActivityLegalRouter;
import com.bamtechmedia.dominguez.legal.api.LegalDisclosure;
import com.bamtechmedia.dominguez.legal.api.LegalRouter;
import javax.inject.Provider;
import p163g.p201e.p203b.p307o.p308p.C7626a;
import p163g.p201e.p203b.p408f0.C10611d;

/* renamed from: com.bamtechmedia.dominguez.auth.v0.h.g */
/* compiled from: SignupEmailBindingModule */
abstract class C3108g {
    /* renamed from: a */
    static /* synthetic */ C3032a m10940a(LegalRouter legalRouter, C3105e eVar, LegalDisclosure legalDisclosure) {
        return new C3034c(legalDisclosure, legalRouter, eVar);
    }

    /* renamed from: a */
    static C3033b m10941a(@ActivityLegalRouter LegalRouter legalRouter, C3105e eVar) {
        return new C3092a(legalRouter, eVar);
    }

    /* renamed from: a */
    static C3046f m10942a() {
        return C3094c.f7999a;
    }

    /* renamed from: a */
    static C3126n m10944a(C3114l lVar, C3107f fVar, C3095d dVar, C2753b bVar, C7626a aVar, C2755d dVar2, C2784r rVar, C3033b bVar2, C3046f fVar2, C3105e eVar, C10611d dVar3) {
        C3093b bVar3 = new C3093b(fVar, dVar, bVar, aVar, dVar2, rVar, bVar2, fVar2, eVar, dVar3);
        C3114l lVar2 = lVar;
        return (C3126n) C5856o0.m18893a((Fragment) lVar, C3126n.class, (Provider<T>) bVar3);
    }

    /* renamed from: a */
    static /* synthetic */ C3126n m10943a(C3107f fVar, C3095d dVar, C2753b bVar, C7626a aVar, C2755d dVar2, C2784r rVar, C3033b bVar2, C3046f fVar2, C3105e eVar, C10611d dVar3) {
        C3126n nVar = new C3126n(fVar, dVar, bVar, aVar, dVar2, rVar, bVar2, fVar2, eVar, dVar3);
        return nVar;
    }
}
