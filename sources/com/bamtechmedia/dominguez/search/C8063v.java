package com.bamtechmedia.dominguez.search;

import com.bamtechmedia.dominguez.collections.items.C3343b;
import com.bamtechmedia.dominguez.collections.items.C3347e;
import com.bamtechmedia.dominguez.collections.items.C3347e.C3348a;
import com.bamtechmedia.dominguez.config.C3572r0;
import com.bamtechmedia.dominguez.config.C3572r0.C3573a;
import com.bamtechmedia.dominguez.core.content.collections.C3658a;
import com.bamtechmedia.dominguez.core.content.containers.ContainerType;
import com.bamtechmedia.dominguez.core.content.paging.C3700c;
import com.bamtechmedia.dominguez.core.utils.C5884x;
import com.bamtechmedia.dominguez.search.C7975b0.C7978c;
import com.bamtechmedia.dominguez.search.C7975b0.C7980e;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.C12907r;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import p163g.p509o.p510a.C11847b;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0014B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\"\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0010J\u0010\u0010\u0012\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/search/SearchPresenter;", "", "searchItemFactory", "Lcom/bamtechmedia/dominguez/search/SearchItemFactory;", "collectionItemsFactory", "Lcom/bamtechmedia/dominguez/collections/items/CollectionItemsFactory;", "dictionary", "Lcom/bamtechmedia/dominguez/config/StringDictionary;", "isTelevision", "", "(Lcom/bamtechmedia/dominguez/search/SearchItemFactory;Lcom/bamtechmedia/dominguez/collections/items/CollectionItemsFactory;Lcom/bamtechmedia/dominguez/config/StringDictionary;Z)V", "createViewState", "Lcom/bamtechmedia/dominguez/search/SearchPresenter$ViewState;", "newState", "Lcom/bamtechmedia/dominguez/search/SearchViewModel$State;", "trackExtraMap", "", "", "isExploreCollection", "state", "ViewState", "search_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.search.v */
/* compiled from: SearchPresenter.kt */
public final class C8063v {

    /* renamed from: a */
    private final C8062u f17256a;

    /* renamed from: b */
    private final C3347e f17257b;

    /* renamed from: c */
    private final C3572r0 f17258c;

    /* renamed from: d */
    private final boolean f17259d;

    /* renamed from: com.bamtechmedia.dominguez.search.v$a */
    /* compiled from: SearchPresenter.kt */
    public static final class C8064a {

        /* renamed from: a */
        private final List<C11847b> f17260a;

        /* renamed from: b */
        private final List<C11847b> f17261b;

        /* renamed from: c */
        private final boolean f17262c;

        /* renamed from: d */
        private final boolean f17263d;

        /* renamed from: e */
        private final String f17264e;

        /* renamed from: f */
        private final boolean f17265f;

        /* renamed from: g */
        private final boolean f17266g;

        public C8064a() {
            this(null, null, false, false, null, false, false, 127, null);
        }

        public C8064a(List<? extends C11847b> list, List<? extends C11847b> list2, boolean z, boolean z2, String str, boolean z3, boolean z4) {
            this.f17260a = list;
            this.f17261b = list2;
            this.f17262c = z;
            this.f17263d = z2;
            this.f17264e = str;
            this.f17265f = z3;
            this.f17266g = z4;
        }

        /* renamed from: a */
        public final List<C11847b> mo21044a() {
            return this.f17260a;
        }

        /* renamed from: b */
        public final boolean mo21045b() {
            return this.f17263d;
        }

        /* renamed from: c */
        public final String mo21046c() {
            return this.f17264e;
        }

        /* renamed from: d */
        public final boolean mo21047d() {
            return this.f17266g;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C8064a) {
                    C8064a aVar = (C8064a) obj;
                    if (C12880j.m40224a((Object) this.f17260a, (Object) aVar.f17260a) && C12880j.m40224a((Object) this.f17261b, (Object) aVar.f17261b)) {
                        if (this.f17262c == aVar.f17262c) {
                            if ((this.f17263d == aVar.f17263d) && C12880j.m40224a((Object) this.f17264e, (Object) aVar.f17264e)) {
                                if (this.f17265f == aVar.f17265f) {
                                    if (this.f17266g == aVar.f17266g) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            List<C11847b> list = this.f17260a;
            int i = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            List<C11847b> list2 = this.f17261b;
            int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
            boolean z = this.f17262c;
            if (z) {
                z = true;
            }
            int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
            boolean z2 = this.f17263d;
            if (z2) {
                z2 = true;
            }
            int i3 = (i2 + (z2 ? 1 : 0)) * 31;
            String str = this.f17264e;
            if (str != null) {
                i = str.hashCode();
            }
            int i4 = (i3 + i) * 31;
            boolean z3 = this.f17265f;
            if (z3) {
                z3 = true;
            }
            int i5 = (i4 + (z3 ? 1 : 0)) * 31;
            boolean z4 = this.f17266g;
            if (z4) {
                z4 = true;
            }
            return i5 + (z4 ? 1 : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ViewState(items=");
            sb.append(this.f17260a);
            sb.append(", recentItems=");
            sb.append(this.f17261b);
            sb.append(", searchButtonChecked=");
            sb.append(this.f17262c);
            sb.append(", loading=");
            sb.append(this.f17263d);
            sb.append(", noResults=");
            sb.append(this.f17264e);
            sb.append(", error=");
            sb.append(this.f17265f);
            sb.append(", showExploreLabel=");
            sb.append(this.f17266g);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ C8064a(List list, List list2, boolean z, boolean z2, String str, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                list = C13185o.m40513a();
            }
            if ((i & 2) != 0) {
                list2 = C13185o.m40513a();
            }
            List list3 = list2;
            boolean z5 = false;
            boolean z6 = (i & 4) != 0 ? false : z;
            boolean z7 = (i & 8) != 0 ? false : z2;
            if ((i & 16) != 0) {
                str = null;
            }
            String str2 = str;
            boolean z8 = (i & 32) != 0 ? false : z3;
            if ((i & 64) == 0) {
                z5 = z4;
            }
            this(list, list3, z6, z7, str2, z8, z5);
        }
    }

    public C8063v(C8062u uVar, C3347e eVar, C3572r0 r0Var, boolean z) {
        this.f17256a = uVar;
        this.f17257b = eVar;
        this.f17258c = r0Var;
        this.f17259d = z;
    }

    /* renamed from: a */
    public final C8064a mo21042a(C7980e eVar, Map<String, String> map) {
        if (mo21043a(eVar)) {
            C3347e eVar2 = this.f17257b;
            C3658a b = eVar.mo20965b();
            if (b != null) {
                List a = eVar2.mo12440a(b, map);
                if (this.f17259d) {
                    C8064a aVar = new C8064a(a, null, false, false, null, false, true, 62, null);
                    return aVar;
                }
                C8064a aVar2 = new C8064a(C13199w.m40583d((Collection) C13183n.m40498a(new C7974b(C3573a.m12035a(this.f17258c, C8051q.explore_label, (Map) null, 2, (Object) null))), (Iterable) a), null, false, false, null, false, false, 126, null);
                return aVar2;
            }
            C12880j.m40220a();
            throw null;
        }
        Map<String, String> map2 = map;
        if (eVar.mo20963a() == C7978c.RECENT_SEARCHES) {
            C8064a aVar3 = new C8064a(null, this.f17256a.mo21012a(eVar.mo20968e()), true, false, null, false, false, 121, null);
            return aVar3;
        }
        if (eVar.mo20963a() == C7978c.SEARCH_RESULTS) {
            C3700c f = eVar.mo20970f();
            if (!(f == null || f.isEmpty())) {
                C3347e eVar3 = this.f17257b;
                C3700c f2 = eVar.mo20970f();
                C5884x.m18951a((Object) f2, (String) null, 1, (Object) null);
                C3700c cVar = f2;
                ContainerType containerType = ContainerType.GridContainer;
                C3343b bVar = new C3343b(0, null, null, null, null, null, null, 127, null);
                C8064a aVar4 = new C8064a(C3348a.m11521a(eVar3, "search", containerType, "results", "searchResults", null, cVar, bVar, map, 16, null), null, true, false, null, false, false, 122, null);
                return aVar4;
            }
        }
        if (eVar.mo20963a() == C7978c.SEARCH_RESULTS && eVar.mo20970f() == null && eVar.mo20966c() == null) {
            C8064a aVar5 = new C8064a(null, null, true, true, null, false, false, 115, null);
            return aVar5;
        }
        if (eVar.mo20963a() == C7978c.SEARCH_RESULTS) {
            C3700c f3 = eVar.mo20970f();
            if (f3 != null && f3.isEmpty()) {
                C8064a aVar6 = new C8064a(null, null, true, false, this.f17258c.mo12772a(C8051q.search_noresults, C13170i0.m40332a(C12907r.m40244a("USER_SEARCH_INPUT", eVar.mo20967d()))), false, false, 107, null);
                return aVar6;
            }
        }
        C8064a aVar7 = new C8064a(null, null, false, true, null, false, false, 119, null);
        return aVar7;
    }

    /* renamed from: a */
    public final boolean mo21043a(C7980e eVar) {
        return (eVar != null ? eVar.mo20963a() : null) == C7978c.EXPLORE && eVar.mo20965b() != null;
    }
}
