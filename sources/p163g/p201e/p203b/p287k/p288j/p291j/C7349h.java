package p163g.p201e.p203b.p287k.p288j.p291j;

import com.bamtechmedia.dominguez.collections.items.C3347e;
import com.bamtechmedia.dominguez.core.content.C3653c;
import com.bamtechmedia.dominguez.core.content.C3692n;
import com.bamtechmedia.dominguez.core.content.C3693o;
import com.bamtechmedia.dominguez.core.content.C3716q;
import com.bamtechmedia.dominguez.core.content.PromoLabel;
import com.bamtechmedia.dominguez.core.design.widgets.DownloadStatusView.C5635b;
import com.bamtechmedia.dominguez.core.p088i.p091p.C3850c;
import com.bamtechmedia.dominguez.core.utils.C5821c0;
import com.bamtechmedia.dominguez.detail.common.C5918e;
import com.bamtechmedia.dominguez.detail.common.C5982j;
import com.bamtechmedia.dominguez.detail.common.C5984l;
import com.bamtechmedia.dominguez.detail.common.C5998r;
import com.bamtechmedia.dominguez.detail.common.C6000s;
import com.bamtechmedia.dominguez.detail.common.C6008x;
import com.bamtechmedia.dominguez.detail.common.p227d0.C5917a;
import com.bamtechmedia.dominguez.detail.common.p228e0.C5923c;
import com.bamtechmedia.dominguez.detail.common.p229f0.C5925a;
import com.bamtechmedia.dominguez.detail.common.p230g0.C5948c;
import com.bamtechmedia.dominguez.detail.movie.models.C6024b;
import com.bamtechmedia.dominguez.detail.movie.models.C6026d;
import com.bamtechmedia.dominguez.offline.C6243d;
import com.google.common.base.C10368c;
import com.google.common.base.Optional;
import java.util.List;
import p163g.p201e.p203b.p287k.p288j.C7316a;
import p163g.p201e.p203b.p287k.p288j.C7326g;
import p163g.p201e.p203b.p287k.p288j.p289h.C7327a;
import p163g.p201e.p203b.p287k.p288j.p290i.C7334a;
import p163g.p201e.p203b.p287k.p288j.p292k.C7352b;
import p163g.p201e.p203b.p287k.p288j.p292k.C7352b.C7354b;
import p163g.p509o.p510a.C11847b;
import p163g.p509o.p510a.p511l.C11866a;

/* renamed from: g.e.b.k.j.j.h */
/* compiled from: MovieDetailTvPresenter.kt */
public final class C7349h extends C7334a {

    /* renamed from: d */
    private final C3716q f16149d;

    /* renamed from: e */
    private final C5821c0 f16150e;

    /* renamed from: f */
    private final C3653c f16151f;

    /* renamed from: g */
    private final C7352b f16152g;

    /* renamed from: h */
    private final C5918e f16153h;

    /* renamed from: i */
    private final C7316a f16154i;

    /* renamed from: j */
    private final Optional<C10368c<C6243d, C5635b>> f16155j;

    /* renamed from: k */
    private final C5998r f16156k;

    /* renamed from: l */
    private final C6000s f16157l;

    /* renamed from: m */
    private final C5948c f16158m;

    /* renamed from: n */
    private final C3850c f16159n;

    public C7349h(C3716q qVar, C5821c0 c0Var, C3653c cVar, C7352b bVar, C5918e eVar, C7316a aVar, Optional<C10368c<C6243d, C5635b>> optional, C5998r rVar, C6000s sVar, C5948c cVar2, C3850c cVar3, C5917a aVar2, C3347e eVar2, C5984l lVar) {
        super(aVar2, eVar2, lVar);
        this.f16149d = qVar;
        this.f16150e = c0Var;
        this.f16151f = cVar;
        this.f16152g = bVar;
        this.f16153h = eVar;
        this.f16154i = aVar;
        this.f16155j = optional;
        this.f16156k = rVar;
        this.f16157l = sVar;
        this.f16158m = cVar2;
        this.f16159n = cVar3;
    }

    /* renamed from: a */
    public List<C11847b> mo20170a(C7354b bVar) {
        C11866a aVar;
        C3692n i = bVar.mo20182i();
        C5925a aVar2 = null;
        if (i != null) {
            C6024b j = bVar.mo20183j();
            PromoLabel k = bVar.mo20184k();
            C6026d l = bVar.mo20185l();
            C5982j g = bVar.mo20179g();
            aVar = m22037a(i, j, k, l, g != null ? this.f16157l.mo18048a(g, bVar.mo20184k()) : null);
        } else {
            aVar = null;
        }
        C6008x d = bVar.mo17871d();
        if (d != null) {
            aVar2 = mo20153a(d, bVar.mo17870c());
        }
        return C13185o.m40522d(aVar, aVar2);
    }

    /* renamed from: a */
    private final C7327a m22037a(C3692n nVar, C6024b bVar, PromoLabel promoLabel, C6026d dVar, C3693o oVar) {
        CharSequence charSequence = null;
        String b0 = bVar != null ? bVar.mo18110b0() : null;
        if (bVar != null) {
            C5923c X = bVar.mo18105X();
            if (X != null) {
                charSequence = X.mo17830g();
            }
        }
        C7326g gVar = new C7326g(nVar, bVar, b0, dVar, promoLabel, charSequence, oVar);
        C7327a aVar = new C7327a(gVar, this.f16159n, null, this.f16149d, this.f16150e, this.f16151f, this.f16152g, this.f16153h, this.f16155j, null, this.f16154i, this.f16156k, this.f16158m);
        return aVar;
    }
}
