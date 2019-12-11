package p163g.p201e.p203b.p287k.p288j.p290i;

import com.bamtechmedia.dominguez.collections.items.C3343b;
import com.bamtechmedia.dominguez.collections.items.C3347e;
import com.bamtechmedia.dominguez.collections.items.C3347e.C3348a;
import com.bamtechmedia.dominguez.core.content.containers.ContainerType;
import com.bamtechmedia.dominguez.core.content.paging.C3700c;
import com.bamtechmedia.dominguez.detail.common.C5984l;
import com.bamtechmedia.dominguez.detail.common.C5989o;
import com.bamtechmedia.dominguez.detail.common.C6007w;
import com.bamtechmedia.dominguez.detail.common.C6008x;
import com.bamtechmedia.dominguez.detail.common.item.C5981c;
import com.bamtechmedia.dominguez.detail.common.p227d0.C5917a;
import com.bamtechmedia.dominguez.detail.common.p229f0.C5925a;
import java.util.List;
import p163g.p201e.p203b.p287k.C7313g;
import p163g.p201e.p203b.p287k.p288j.p292k.C7352b.C7354b;
import p163g.p509o.p510a.C11847b;

/* renamed from: g.e.b.k.j.i.a */
/* compiled from: BaseMovieDetailPresenter.kt */
public abstract class C7334a {

    /* renamed from: a */
    private final C5917a f16115a;

    /* renamed from: b */
    private final C3347e f16116b;

    /* renamed from: c */
    private final C5984l f16117c;

    public C7334a(C5917a aVar, C3347e eVar, C5984l lVar) {
        this.f16115a = aVar;
        this.f16116b = eVar;
        this.f16117c = lVar;
    }

    /* renamed from: a */
    public final List<C11847b> mo20154a(C7354b bVar, C5981c cVar) {
        List<C11847b> list;
        C6008x d = bVar.mo17871d();
        if (d != null) {
            if (m21990a(d) && (d instanceof C5989o)) {
                list = this.f16117c.mo17892a(((C5989o) d).m19184a(), bVar, cVar);
            } else if (d instanceof C5989o) {
                C3347e eVar = this.f16116b;
                String c = d.mo18027c();
                String c2 = d.mo18027c();
                C3700c a = ((C5989o) d).m19184a();
                ContainerType containerType = ContainerType.GridContainer;
                C3343b bVar2 = new C3343b(0, null, null, null, null, null, d.mo18026b(), 63, null);
                list = C3348a.m11521a(eVar, "detailContent", containerType, c, c2, null, a, bVar2, null, 144, null);
            } else if (d instanceof C6007w) {
                list = ((C6007w) d).mo18025a();
            } else {
                list = C13185o.m40513a();
            }
            if (list != null) {
                return list;
            }
        }
        return C13185o.m40513a();
    }

    /* renamed from: a */
    public final C5925a mo20153a(C6008x xVar, List<? extends C6008x> list) {
        C5925a aVar = new C5925a(xVar, list, this.f16115a, null, 8, null);
        return aVar;
    }

    /* renamed from: a */
    private final boolean m21990a(C6008x xVar) {
        return xVar.mo18028d() == C7313g.nav_extras;
    }
}
