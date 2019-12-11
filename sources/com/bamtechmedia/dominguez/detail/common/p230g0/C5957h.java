package com.bamtechmedia.dominguez.detail.common.p230g0;

import com.bamtechmedia.dominguez.collections.items.C3343b;
import com.bamtechmedia.dominguez.collections.items.C3392v.C3393a;
import com.bamtechmedia.dominguez.collections.p080o0.C3444j;
import com.bamtechmedia.dominguez.collections.p080o0.C3448m;
import com.bamtechmedia.dominguez.collections.p081ui.C3493c;
import com.bamtechmedia.dominguez.config.C3572r0;
import com.bamtechmedia.dominguez.config.C3572r0.C3573a;
import com.bamtechmedia.dominguez.core.content.C3653c;
import com.bamtechmedia.dominguez.core.content.C3693o;
import com.bamtechmedia.dominguez.core.content.assets.C3626b;
import com.bamtechmedia.dominguez.core.content.containers.ContainerType;
import com.bamtechmedia.dominguez.core.content.paging.C3700c;
import com.bamtechmedia.dominguez.core.content.paging.C3702e;
import com.bamtechmedia.dominguez.detail.common.C5943g;
import com.bamtechmedia.dominguez.detail.common.C5984l;
import com.bamtechmedia.dominguez.detail.common.C6008x;
import com.bamtechmedia.dominguez.detail.common.item.C5981c;
import com.bamtechmedia.dominguez.detail.common.p225b0.C5906a;
import com.bamtechmedia.dominguez.detail.common.p230g0.p231i.C5959a;
import com.bamtechmedia.dominguez.detail.common.p230g0.p231i.C5960b;
import com.bamtechmedia.dominguez.detail.common.p230g0.p231i.C5961c;
import com.bamtechmedia.dominguez.detail.common.p230g0.p231i.C5962d;
import com.bamtechmedia.dominguez.detail.movie.data.C6018a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.p586h0.C12757d;
import kotlin.p590y.C13162e0;
import kotlin.p590y.C13180m;
import p163g.p171c.p172a.p173a.C4793a;
import p163g.p509o.p510a.C11847b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dBG\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J,\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/detail/common/tv/TvExtrasTabFactory;", "Lcom/bamtechmedia/dominguez/detail/common/ExtrasTabFactory;", "resolver", "Lcom/bamtechmedia/dominguez/collections/config/ContainerConfigResolver;", "parametersFactory", "Lcom/bamtechmedia/dominguez/collections/items/ShelfItemParameters$Factory;", "shelfListItemScaleHelper", "Lcom/bamtechmedia/dominguez/collections/ui/ShelfListItemScaleHelper;", "overrideStrings", "Lcom/bamnet/config/strings/OverrideStrings;", "contentTypeRouter", "Lcom/bamtechmedia/dominguez/core/content/ContentTypeRouter;", "analytics", "Lcom/bamtechmedia/dominguez/detail/common/analytics/DetailAnalytics;", "stringDictionary", "Lcom/bamtechmedia/dominguez/config/StringDictionary;", "pagingListener", "Lcom/bamtechmedia/dominguez/core/content/paging/PagingListener;", "(Lcom/bamtechmedia/dominguez/collections/config/ContainerConfigResolver;Lcom/bamtechmedia/dominguez/collections/items/ShelfItemParameters$Factory;Lcom/bamtechmedia/dominguez/collections/ui/ShelfListItemScaleHelper;Lcom/bamnet/config/strings/OverrideStrings;Lcom/bamtechmedia/dominguez/core/content/ContentTypeRouter;Lcom/bamtechmedia/dominguez/detail/common/analytics/DetailAnalytics;Lcom/bamtechmedia/dominguez/config/StringDictionary;Lcom/bamtechmedia/dominguez/core/content/paging/PagingListener;)V", "createExtrasItems", "", "Lcom/xwray/groupie/Group;", "assets", "Lcom/bamtechmedia/dominguez/core/content/paging/PagedList;", "Lcom/bamtechmedia/dominguez/core/content/assets/Asset;", "state", "Lcom/bamtechmedia/dominguez/detail/common/DetailState;", "itemViewStateIntent", "Lcom/bamtechmedia/dominguez/detail/common/item/UserIntent;", "Companion", "contentDetail_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.detail.common.g0.h */
/* compiled from: TvExtrasTabFactory.kt */
public final class C5957h implements C5984l {

    /* renamed from: a */
    private final C3448m f13775a;

    /* renamed from: b */
    private final C3393a f13776b;

    /* renamed from: c */
    private final C3493c f13777c;

    /* renamed from: d */
    private final C4793a f13778d;

    /* renamed from: e */
    private final C3653c f13779e;

    /* renamed from: f */
    private final C5906a f13780f;

    /* renamed from: g */
    private final C3572r0 f13781g;

    /* renamed from: h */
    private final C3702e f13782h;

    /* renamed from: com.bamtechmedia.dominguez.detail.common.g0.h$a */
    /* compiled from: TvExtrasTabFactory.kt */
    private static final class C5958a {
        private C5958a() {
        }

        public /* synthetic */ C5958a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C5958a(null);
    }

    public C5957h(C3448m mVar, C3393a aVar, C3493c cVar, C4793a aVar2, C3653c cVar2, C5906a aVar3, C3572r0 r0Var, C3702e eVar) {
        this.f13775a = mVar;
        this.f13776b = aVar;
        this.f13777c = cVar;
        this.f13778d = aVar2;
        this.f13779e = cVar2;
        this.f13780f = aVar3;
        this.f13781g = r0Var;
        this.f13782h = eVar;
    }

    /* renamed from: a */
    public List<C11847b> mo17892a(C3700c<? extends C3626b> cVar, C5943g gVar, C5981c cVar2) {
        List d;
        C6008x d2 = gVar.mo17871d();
        if (d2 == null) {
            return C13185o.m40513a();
        }
        C3448m mVar = this.f13775a;
        ContainerType containerType = ContainerType.ShelfContainer;
        C3343b bVar = new C3343b(0, null, null, null, null, null, null, 127, null);
        C3444j a = mVar.mo12644a("detailContent", containerType, "extras", bVar);
        ArrayList arrayList = new ArrayList();
        for (Object next : cVar) {
            if (next instanceof C3693o) {
                arrayList.add(next);
            }
        }
        ArrayList<C5962d> arrayList2 = new ArrayList<>(C13187p.m40525a((Iterable) arrayList, 10));
        int i = 0;
        for (Object next2 : arrayList) {
            int i2 = i + 1;
            if (i >= 0) {
                C3693o oVar = (C3693o) next2;
                C3702e eVar = this.f13782h;
                C6018a aVar = new C6018a(i, C3573a.m12035a(this.f13781g, d2.mo18028d(), (Map) null, 2, (Object) null), gVar.mo17870c().indexOf(d2));
                C5962d dVar = new C5962d(a, oVar, this.f13777c, this.f13778d, cVar, eVar, this.f13779e, this.f13780f, aVar);
                arrayList2.add(dVar);
                i = i2;
            } else {
                C13180m.m40455c();
                throw null;
            }
        }
        if (arrayList2.isEmpty()) {
            d = C13185o.m40513a();
        } else {
            C12757d d3 = C12762h.m39920d(0, a.mo12637p() - 1);
            ArrayList arrayList3 = new ArrayList(C13187p.m40525a((Iterable) d3, 10));
            Iterator it = d3.iterator();
            while (it.hasNext()) {
                ((C13162e0) it).mo31079b();
                arrayList3.add(new C5961c(a));
            }
            d = C13199w.m40583d((Collection) arrayList2, (Iterable) arrayList3);
        }
        C5959a aVar2 = new C5959a(this.f13776b.mo12547a("extras_shelf_title", null, a, cVar, d));
        for (C5962d a2 : arrayList2) {
            a2.mo17899a((C5960b) aVar2);
        }
        return C13183n.m40498a(aVar2);
    }
}
