package com.bamtechmedia.dominguez.detail.common.p230g0;

import com.bamtechmedia.dominguez.detail.common.C5904a0;
import com.bamtechmedia.dominguez.detail.common.p229f0.C5925a;
import java.util.List;
import kotlin.C13142s;
import p163g.p509o.p510a.C11847b;
import p163g.p509o.p510a.p511l.C11866a;
import p163g.p509o.p510a.p511l.C11867b;

/* renamed from: com.bamtechmedia.dominguez.detail.common.g0.g */
/* compiled from: TvDetailHeaderSectionViewHolder.kt */
public final class C5956g {

    /* renamed from: a */
    private C11867b f13772a;

    /* renamed from: b */
    private C11867b f13773b;

    /* renamed from: c */
    private final C5904a0 f13774c;

    public C5956g(C5904a0 a0Var) {
        this.f13774c = a0Var;
    }

    /* renamed from: a */
    public final void mo17890a() {
        this.f13772a = null;
        this.f13773b = null;
    }

    /* renamed from: a */
    private final void m19108a(C11866a aVar) {
        C11867b bVar = this.f13773b;
        Object a = bVar != null ? m19106a(bVar, aVar) : null;
        if (this.f13773b == null) {
            this.f13773b = aVar.createViewHolder(this.f13774c.mo17811l());
        }
        C11867b bVar2 = this.f13773b;
        if (bVar2 != null) {
            m19109a(bVar2, aVar, a);
        }
    }

    /* renamed from: a */
    private final void m19107a(C5925a aVar) {
        C11867b bVar = this.f13772a;
        Object a = bVar != null ? m19106a(bVar, aVar) : null;
        if (this.f13772a == null) {
            this.f13772a = aVar.createViewHolder(this.f13774c.mo17810c());
        }
        C11867b bVar2 = this.f13772a;
        if (bVar2 != null) {
            m19109a(bVar2, aVar, a);
        }
    }

    /* renamed from: a */
    private final Object m19106a(C11867b bVar, C11866a aVar) {
        return bVar.mo30013b().getChangePayload(aVar);
    }

    /* renamed from: a */
    private final void m19109a(C11867b bVar, C11866a aVar, Object obj) {
        bVar.mo30012a(aVar, null, null);
        aVar.bind(bVar, 0, obj != null ? C13183n.m40498a(obj) : C13185o.m40513a());
    }

    /* renamed from: a */
    public final void mo17891a(List<? extends C11847b> list) {
        for (C11847b bVar : list) {
            if (bVar instanceof C5925a) {
                m19107a((C5925a) bVar);
            } else if (!this.f13774c.mo17809a(bVar)) {
                continue;
            } else if (bVar != null) {
                m19108a((C11866a) bVar);
            } else {
                throw new C13142s("null cannot be cast to non-null type com.xwray.groupie.kotlinandroidextensions.Item");
            }
        }
    }
}
