package p163g.p201e.p203b.p287k.p293k.p296s;

import com.bamtechmedia.dominguez.collections.items.C3343b;
import com.bamtechmedia.dominguez.collections.items.C3392v.C3393a;
import com.bamtechmedia.dominguez.collections.p080o0.C3444j;
import com.bamtechmedia.dominguez.collections.p080o0.C3448m;
import com.bamtechmedia.dominguez.collections.p081ui.C3493c;
import com.bamtechmedia.dominguez.core.content.C3653c;
import com.bamtechmedia.dominguez.core.content.C3685g;
import com.bamtechmedia.dominguez.core.content.C3789t;
import com.bamtechmedia.dominguez.core.content.containers.ContainerType;
import com.bamtechmedia.dominguez.core.content.paging.C3702e;
import com.bamtechmedia.dominguez.detail.common.C6008x;
import com.bamtechmedia.dominguez.detail.common.p225b0.C5906a;
import com.bamtechmedia.dominguez.detail.common.p230g0.p231i.C5959a;
import com.bamtechmedia.dominguez.detail.common.p230g0.p231i.C5960b;
import com.bamtechmedia.dominguez.detail.common.p230g0.p231i.C5961c;
import com.bamtechmedia.dominguez.detail.common.p230g0.p231i.C5962d;
import com.bamtechmedia.dominguez.detail.movie.data.C6018a;
import com.bamtechmedia.dominguez.detail.series.models.C6044b;
import com.bamtechmedia.dominguez.detail.series.models.C6045c;
import com.bamtechmedia.dominguez.detail.series.models.C6046d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.C12907r;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p586h0.C12757d;
import kotlin.p590y.C13162e0;
import kotlin.p590y.C13180m;
import p163g.p171c.p172a.p173a.C4793a;
import p163g.p201e.p203b.p287k.C7313g;
import p163g.p201e.p203b.p287k.p293k.C7382b;
import p163g.p201e.p203b.p287k.p293k.C7391d;
import p163g.p201e.p203b.p287k.p293k.p297t.C7454a.C7468g;
import p163g.p509o.p510a.C11847b;

/* renamed from: g.e.b.k.k.s.j */
/* compiled from: TvEpisodesTabFactory.kt */
public final class C7453j implements C7382b {

    /* renamed from: a */
    private final C3448m f16371a;

    /* renamed from: b */
    private final C3393a f16372b;

    /* renamed from: c */
    private final C4793a f16373c;

    /* renamed from: d */
    private final C3493c f16374d;

    /* renamed from: e */
    private final C3702e f16375e;

    /* renamed from: f */
    private final C3653c f16376f;

    public C7453j(C3448m mVar, C3393a aVar, C4793a aVar2, C3493c cVar, C3702e eVar, C3653c cVar2, C5906a aVar3) {
        this.f16371a = mVar;
        this.f16372b = aVar;
        this.f16373c = aVar2;
        this.f16374d = cVar;
        this.f16375e = eVar;
        this.f16376f = cVar2;
    }

    /* renamed from: a */
    public List<C11847b> mo20210a(Map<String, ? extends C6044b> map, C7468g gVar, C7391d dVar) {
        List list;
        C6008x d = gVar.mo17871d();
        if (d == null) {
            return C13185o.m40513a();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = map.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            C3789t tVar = null;
            if (i >= 0) {
                Entry entry = (Entry) next;
                String str = (String) entry.getKey();
                C6044b bVar = (C6044b) entry.getValue();
                C3448m mVar = this.f16371a;
                C3343b bVar2 = r5;
                ContainerType containerType = ContainerType.ShelfContainer;
                C3448m mVar2 = mVar;
                C6044b bVar3 = bVar;
                Iterator it2 = it;
                String str2 = str;
                C3343b bVar4 = new C3343b(i, null, null, null, null, null, null, 126, null);
                C3448m mVar3 = mVar2;
                C3444j a = mVar3.mo12644a("detailContent", containerType, "seasons", bVar2);
                C6044b bVar5 = bVar3;
                ArrayList<C5962d> arrayList2 = new ArrayList<>(C13187p.m40525a((Iterable) bVar5, 10));
                int i3 = 0;
                for (Object next2 : bVar5) {
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        C3685g gVar2 = (C3685g) next2;
                        C6018a aVar = new C6018a(i3, this.f16373c.mo16170a(d.mo18028d()), gVar.mo17870c().indexOf(d));
                        C5962d dVar2 = new C5962d(a, gVar2, this.f16374d, this.f16373c, bVar5, this.f16375e, this.f16376f, dVar, aVar);
                        arrayList2.add(dVar2);
                        i3 = i4;
                    } else {
                        C13180m.m40455c();
                        throw null;
                    }
                }
                if (arrayList2.isEmpty()) {
                    list = C13185o.m40513a();
                } else {
                    C12757d d2 = C12762h.m39920d(0, a.mo12637p() - 1);
                    ArrayList arrayList3 = new ArrayList(C13187p.m40525a((Iterable) d2, 10));
                    Iterator it3 = d2.iterator();
                    while (it3.hasNext()) {
                        ((C13162e0) it3).mo31079b();
                        arrayList3.add(new C5961c(a));
                    }
                    list = C13199w.m40583d((Collection) arrayList2, (Iterable) arrayList3);
                }
                C6046d n = gVar.mo20363n();
                if (n != null) {
                    C6045c c0 = n.mo18287c0();
                    if (c0 != null) {
                        Iterator it4 = c0.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                break;
                            }
                            Object next3 = it4.next();
                            if (Intrinsics.areEqual((Object) ((C3789t) next3).mo12992E(), (Object) str2)) {
                                tVar = next3;
                                break;
                            }
                        }
                        tVar = tVar;
                    }
                }
                if (tVar != null) {
                    i = tVar.mo12993L();
                }
                C5959a aVar2 = new C5959a(this.f16372b.mo12547a(str2, m22269a(i), a, bVar5, list));
                for (C5962d a2 : arrayList2) {
                    a2.mo17899a((C5960b) aVar2);
                }
                arrayList.add(aVar2);
                i = i2;
                it = it2;
            } else {
                C13180m.m40455c();
                throw null;
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private final String m22269a(int i) {
        return this.f16373c.mo16171a(C7313g.season_number, C13170i0.m40332a(C12907r.m40244a("seasonNumber", String.valueOf(i))));
    }
}
