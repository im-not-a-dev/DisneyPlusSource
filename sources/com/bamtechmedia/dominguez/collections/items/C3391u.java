package com.bamtechmedia.dominguez.collections.items;

import com.bamtechmedia.dominguez.collections.items.C3355h.C3357b;
import com.bamtechmedia.dominguez.collections.items.C3375p.C3376a;
import com.bamtechmedia.dominguez.collections.items.C3392v.C3393a;
import com.bamtechmedia.dominguez.collections.items.C3397y.C3398a;
import com.bamtechmedia.dominguez.collections.p079n0.C3431b;
import com.bamtechmedia.dominguez.collections.p080o0.C3444j;
import com.bamtechmedia.dominguez.core.content.C3693o;
import com.bamtechmedia.dominguez.core.content.assets.C3626b;
import com.bamtechmedia.dominguez.core.content.paging.C3700c;
import com.bamtechmedia.dominguez.core.utils.C5825e;
import com.google.common.base.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C12898l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p586h0.C12757d;
import kotlin.p590y.C13162e0;
import kotlin.p590y.C13180m;
import p163g.p509o.p510a.C11847b;
import p163g.p509o.p510a.p511l.C11866a;

/* renamed from: com.bamtechmedia.dominguez.collections.items.u */
/* compiled from: ShelfItemFactory.kt */
public final class C3391u {

    /* renamed from: a */
    private final C3398a f8543a;

    /* renamed from: b */
    private final C3357b f8544b;

    /* renamed from: c */
    private final C3376a f8545c;

    /* renamed from: d */
    private final C3393a f8546d;

    /* renamed from: e */
    private final boolean f8547e;

    /* renamed from: f */
    private final C3341a f8548f;

    /* renamed from: g */
    private final C5825e f8549g;

    /* renamed from: h */
    private final Optional<C3431b> f8550h;

    public C3391u(C3398a aVar, C3357b bVar, C3376a aVar2, C3393a aVar3, boolean z, C3341a aVar4, C5825e eVar, Optional<C3431b> optional) {
        this.f8543a = aVar;
        this.f8544b = bVar;
        this.f8545c = aVar2;
        this.f8546d = aVar3;
        this.f8547e = z;
        this.f8548f = aVar4;
        this.f8549g = eVar;
        this.f8550h = optional;
    }

    /* renamed from: a */
    public static /* synthetic */ C3384s m11613a(C3391u uVar, String str, C3444j jVar, String str2, C3700c cVar, String str3, Map map, int i, Object obj) {
        if ((i & 16) != 0) {
            str3 = null;
        }
        String str4 = str3;
        if ((i & 32) != 0) {
            map = C13173j0.m40350a();
        }
        return uVar.mo12528a(str, jVar, str2, cVar, str4, map);
    }

    /* renamed from: b */
    public final List<C11847b> mo12529b(String str, C3444j jVar, String str2, C3700c<? extends C3626b> cVar, String str3, Map<String, String> map) {
        List b = C13199w.m40567b((Iterable) cVar, jVar.mo12637p());
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) b, 10));
        int i = 0;
        for (Object next : b) {
            int i2 = i + 1;
            if (i >= 0) {
                List list = (List) next;
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(i);
                String sb2 = sb.toString();
                C3700c<? extends C3626b> cVar2 = cVar;
                arrayList.add(new C3379q(this.f8546d.mo12547a(sb2, str3, jVar, cVar2, m11616a(str, jVar, sb2, cVar2, list, map)), i));
                i = i2;
            } else {
                C13180m.m40455c();
                throw null;
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final C3384s mo12528a(String str, C3444j jVar, String str2, C3700c<? extends C3626b> cVar, String str3, Map<String, String> map) {
        C3384s sVar;
        List a = m11615a(this, str, jVar, str2, (C3700c) cVar, (List) null, (Map) map, 16, (Object) null);
        if (a.isEmpty()) {
            return null;
        }
        C3392v a2 = this.f8546d.mo12547a(str2, str3, jVar, cVar, a);
        int i = C3390t.$EnumSwitchMapping$0[jVar.mo12627g().ordinal()];
        if (i == 1) {
            sVar = new C3342a0(a2);
        } else if (i == 2) {
            sVar = new C3344b0(a2);
        } else if (i == 3) {
            sVar = new C3380r(a2, this.f8550h);
        } else {
            throw new C12898l();
        }
        return sVar;
    }

    /* renamed from: a */
    static /* synthetic */ List m11615a(C3391u uVar, String str, C3444j jVar, String str2, C3700c cVar, List list, Map map, int i, Object obj) {
        return uVar.m11616a(str, jVar, str2, cVar, (i & 16) != 0 ? cVar : list, map);
    }

    /* renamed from: a */
    private final List<C11866a> m11616a(String str, C3444j jVar, String str2, C3700c<? extends C3626b> cVar, List<? extends C3626b> list, Map<String, String> map) {
        ArrayList arrayList;
        if (!list.isEmpty()) {
            arrayList = new ArrayList(C13187p.m40525a((Iterable) list, 10));
            for (C3626b a : list) {
                arrayList.add(m11614a(str, jVar, str2, a, cVar, map));
            }
        } else {
            C12757d dVar = new C12757d(0, jVar.mo12637p() + 1);
            arrayList = new ArrayList(C13187p.m40525a((Iterable) dVar, 10));
            Iterator it = dVar.iterator();
            int i = 0;
            while (it.hasNext()) {
                ((C13162e0) it).mo31079b();
                int i2 = i + 1;
                if (i >= 0) {
                    arrayList.add(C3398a.m11652a(this.f8543a, jVar, str2, cVar, null, i, false, map, this.f8548f, str, 32, null));
                    i = i2;
                } else {
                    C13180m.m40455c();
                    throw null;
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private final C11866a m11614a(String str, C3444j jVar, String str2, C3626b bVar, C3700c<? extends C3626b> cVar, Map<String, String> map) {
        C3444j jVar2 = jVar;
        C3626b bVar2 = bVar;
        C3700c<? extends C3626b> cVar2 = cVar;
        if (Intrinsics.areEqual((Object) jVar.mo12636o(), (Object) "bookmark")) {
            C3357b bVar3 = this.f8544b;
            if (bVar2 != null) {
                return bVar3.mo12457a(jVar, str2, (C3693o) bVar2, this.f8548f);
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bamtechmedia.dominguez.core.content.Playable");
        }
        String str3 = str2;
        if (Intrinsics.areEqual((Object) jVar.mo12636o(), (Object) "category")) {
            return this.f8545c.mo12485a(jVar, bVar2, map);
        }
        Map<String, String> map2 = map;
        if (Intrinsics.areEqual((Object) jVar.mo12636o(), (Object) "character")) {
            return this.f8543a.mo12556a(jVar, str2, cVar, bVar, cVar2.indexOf(bVar2), this.f8547e && this.f8549g.mo17734a(28), map, this.f8548f, str);
        }
        return C3398a.m11652a(this.f8543a, jVar, str2, cVar, bVar, cVar2.indexOf(bVar2), false, map, this.f8548f, str, 32, null);
    }
}
