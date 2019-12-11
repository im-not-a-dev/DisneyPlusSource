package p163g.p201e.p203b.p287k.p293k.p296s;

import com.bamtechmedia.dominguez.collections.items.C3347e;
import com.bamtechmedia.dominguez.core.content.C3653c;
import com.bamtechmedia.dominguez.core.content.assets.C3626b;
import com.bamtechmedia.dominguez.detail.common.C5984l;
import com.bamtechmedia.dominguez.detail.common.C6000s;
import com.bamtechmedia.dominguez.detail.common.C6008x;
import com.bamtechmedia.dominguez.detail.common.item.C5981c;
import com.bamtechmedia.dominguez.detail.common.p227d0.C5917a;
import com.bamtechmedia.dominguez.detail.common.p229f0.C5925a;
import com.bamtechmedia.dominguez.detail.series.models.C6046d;
import java.util.List;
import javax.inject.Provider;
import kotlin.jvm.internal.C12880j;
import p163g.p201e.p203b.p287k.p293k.C7382b;
import p163g.p201e.p203b.p287k.p293k.C7391d;
import p163g.p201e.p203b.p287k.p293k.p294q.C7410a.C7435b;
import p163g.p201e.p203b.p287k.p293k.p295r.C7436a;
import p163g.p201e.p203b.p287k.p293k.p297t.C7454a.C7468g;
import p163g.p509o.p510a.p511l.C11866a;

/* renamed from: g.e.b.k.k.s.f */
/* compiled from: SeriesDetailPresenter.kt */
public final class C7443f extends C7436a {

    /* renamed from: i */
    private final C5917a f16348i;

    public C7443f(C7435b bVar, C3653c cVar, C7391d dVar, C3347e eVar, C7382b bVar2, C5984l lVar, C5917a aVar, Provider<C5981c> provider, C6000s sVar) {
        Object obj = provider.get();
        C12880j.m40222a(obj, "itemViewStateUserIntent.get()");
        super(bVar, cVar, dVar, eVar, bVar2, lVar, (C5981c) obj, sVar, false);
        this.f16348i = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C11866a mo20280a(C6008x xVar, List<? extends C6008x> list) {
        C5925a aVar = new C5925a(xVar, list, this.f16348i, null, 8, null);
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C11866a mo20281a(C7468g gVar) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C3626b mo20284b(C7468g gVar) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo20282a(C6046d dVar) {
        return dVar.mo18285b0();
    }
}
