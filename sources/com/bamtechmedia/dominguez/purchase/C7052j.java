package com.bamtechmedia.dominguez.purchase;

import androidx.fragment.app.Fragment;
import com.bamtechmedia.dominguez.config.C3558l;
import com.bamtechmedia.dominguez.core.utils.C5856o0;
import com.bamtechmedia.dominguez.offline.C6239a;
import com.google.common.base.Optional;
import javax.inject.Provider;
import p163g.p201e.p203b.p307o.p308p.C7626a;
import p163g.p201e.p203b.p307o.p308p.C7628b;
import p163g.p201e.p203b.p319v.C7884n;
import p163g.p201e.p203b.p319v.C7885o;
import p163g.p201e.p203b.p319v.C7904t;
import p163g.p201e.p203b.p319v.C7908x;
import p163g.p201e.p203b.p319v.p321b0.C7838e;
import p520io.reactivex.C11969r;

/* renamed from: com.bamtechmedia.dominguez.purchase.j */
/* compiled from: PaywallBindingModule */
abstract class C7052j {
    /* renamed from: a */
    static C7626a m21401a(C7838e eVar, C7628b bVar) {
        return bVar.mo20542a(eVar, C7904t.paywallConstraintLayout);
    }

    /* renamed from: a */
    static C7084v m21399a(C7838e eVar, C7884n nVar, MarketHolder marketHolder, C11969r rVar, C7908x xVar, C7885o oVar, Optional<C6239a> optional, C3558l lVar, C7061p pVar, C7051i iVar) {
        C7025a aVar = new C7025a(nVar, marketHolder, rVar, xVar, oVar, optional, eVar, lVar, pVar, iVar);
        C7838e eVar2 = eVar;
        return (C7084v) C5856o0.m18893a((Fragment) eVar, C7084v.class, (Provider<T>) aVar);
    }

    /* renamed from: a */
    static /* synthetic */ C7084v m21400a(C7884n nVar, MarketHolder marketHolder, C11969r rVar, C7908x xVar, C7885o oVar, Optional optional, C7838e eVar, C3558l lVar, C7061p pVar, C7051i iVar) {
        C7084v vVar = new C7084v(nVar, marketHolder, rVar, xVar, oVar, (C6239a) optional.mo27107c(), eVar.mo20762r(), lVar.mo12765b(), pVar, iVar);
        return vVar;
    }
}
