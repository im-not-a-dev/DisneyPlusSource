package com.bamtechmedia.dominguez.collections.items;

import com.bamtechmedia.dominguez.collections.items.C3347e.C3348a;
import com.bamtechmedia.dominguez.collections.items.C3350g.C3353c;
import com.bamtechmedia.dominguez.collections.items.C3366l.C3367a;
import com.bamtechmedia.dominguez.collections.p080o0.C3444j;
import com.bamtechmedia.dominguez.collections.p080o0.C3448m;
import com.bamtechmedia.dominguez.core.content.assets.C3626b;
import com.bamtechmedia.dominguez.core.content.collections.C3658a;
import com.bamtechmedia.dominguez.core.content.containers.Container;
import com.bamtechmedia.dominguez.core.content.containers.ContainerType;
import com.bamtechmedia.dominguez.core.content.paging.C3700c;
import com.bamtechmedia.dominguez.core.content.sets.C3788m;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.p590y.C13180m;
import p163g.p509o.p510a.C11847b;

/* renamed from: com.bamtechmedia.dominguez.collections.items.f */
/* compiled from: CollectionItemsFactoryImpl.kt */
public final class C3349f implements C3347e {

    /* renamed from: a */
    private final C3448m f8423a;

    /* renamed from: b */
    private final C3391u f8424b;

    /* renamed from: c */
    private final C3353c f8425c;

    /* renamed from: d */
    private final C3367a f8426d;

    /* renamed from: e */
    private final boolean f8427e;

    public C3349f(C3448m mVar, C3391u uVar, C3353c cVar, C3367a aVar, boolean z) {
        this.f8423a = mVar;
        this.f8424b = uVar;
        this.f8425c = cVar;
        this.f8426d = aVar;
        this.f8427e = z;
    }

    /* renamed from: a */
    public List<C11847b> mo12439a(C3658a aVar, Container container, Map<String, String> map, C3343b bVar) {
        return C3348a.m11518a((C3347e) this, aVar, container, map, bVar);
    }

    /* renamed from: a */
    public List<C11847b> mo12440a(C3658a aVar, Map<String, String> map) {
        return C3348a.m11519a(this, aVar, map);
    }

    /* renamed from: a */
    public List<C11847b> mo12441a(String str, ContainerType containerType, String str2, String str3, String str4, C3700c<? extends C3626b> cVar, C3343b bVar, Map<String, String> map) {
        C3700c<? extends C3626b> cVar2 = cVar;
        ContainerType a = m11522a(containerType);
        C3444j a2 = this.f8423a.mo12644a(str, a, str2, bVar);
        if (a2.mo12620a(C3788m.TILES_MATCH_ASSET_COUNT)) {
            a2 = C3444j.m11740a(a2, null, 0, 0, 0, false, null, null, false, cVar.size(), 0, null, false, null, null, null, 0.0f, null, null, null, 524031, null);
        }
        if (!a2.mo12639r()) {
            return C13185o.m40513a();
        }
        if (a2.mo12632k()) {
            ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) cVar2, 10));
            int i = 0;
            for (Object next : cVar) {
                int i2 = i + 1;
                if (i >= 0) {
                    arrayList.add(this.f8425c.mo12453a(a2, cVar, (C3626b) next, i, map));
                    i = i2;
                } else {
                    C13180m.m40455c();
                    throw null;
                }
            }
            return arrayList;
        } else if (a2.mo12626f()) {
            return this.f8424b.mo12529b(str, a2, str3, cVar, str4, map);
        } else {
            if (a == ContainerType.HeroFullBleedContainer) {
                return C13183n.m40498a(this.f8426d.mo12475a(a2, str3, cVar2));
            }
            return C13185o.m40517b((Object) C3391u.m11613a(this.f8424b, str, a2, str3, (C3700c) cVar, str4, (Map) null, 32, (Object) null));
        }
    }

    /* renamed from: a */
    private final ContainerType m11522a(ContainerType containerType) {
        return (containerType != ContainerType.HeroFullBleedContainer || m11523a()) ? containerType : ContainerType.HeroContainer;
    }

    /* renamed from: a */
    private final boolean m11523a() {
        return this.f8427e;
    }
}
