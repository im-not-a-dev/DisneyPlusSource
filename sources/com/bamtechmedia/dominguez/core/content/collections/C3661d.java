package com.bamtechmedia.dominguez.core.content.collections;

import com.bamtechmedia.dominguez.config.C3524e;
import com.bamtechmedia.dominguez.core.content.sets.ContentSetType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.C12907r;

/* renamed from: com.bamtechmedia.dominguez.core.content.collections.d */
/* compiled from: CollectionRequestConfigImpl.kt */
public final class C3661d implements C3660c {

    /* renamed from: a */
    private final C3524e f9193a;

    public C3661d(C3524e eVar) {
        this.f9193a = eVar;
    }

    /* renamed from: a */
    private final Map<String, Integer> m12479a() {
        Map map = (Map) this.f9193a.mo12720d("collections", "curatedSetsFilled");
        if (map != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(C13173j0.m40349a(map.size()));
            for (Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), Integer.valueOf(((Number) entry.getValue()).intValue()));
            }
            return linkedHashMap;
        }
        return C13173j0.m40356a(C12907r.m40244a("slug_movies", Integer.valueOf(1)), C12907r.m40244a("slug_series", Integer.valueOf(1)), C12907r.m40244a("contentClass_brand", Integer.valueOf(0)));
    }

    /* renamed from: b */
    private final List<String> m12480b() {
        List<String> list = (List) this.f9193a.mo12720d("collections", "prefetchMap");
        return list != null ? list : C13185o.m40513a();
    }

    /* renamed from: c */
    private final Map<String, List<ContentSetType>> m12481c() {
        Map map = (Map) this.f9193a.mo12720d("collections", "resolveSetTypes");
        if (map != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(C13173j0.m40349a(map.size()));
            for (Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                Iterable<String> iterable = (Iterable) entry.getValue();
                ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) iterable, 10));
                for (String a : iterable) {
                    arrayList.add(ContentSetType.Companion.mo13625a(a));
                }
                linkedHashMap.put(key, arrayList);
            }
            return linkedHashMap;
        }
        String str = "home";
        return C13173j0.m40356a(C12907r.m40244a(str, C13185o.m40520c(ContentSetType.WatchlistSet, ContentSetType.ContinueWatchingSet)), C12907r.m40244a("avatars", C13183n.m40498a(ContentSetType.CuratedSet)));
    }

    /* renamed from: d */
    private final Map<String, String> m12482d() {
        Map<String, String> map = (Map) this.f9193a.mo12720d("collections", "slugQueries");
        return map != null ? map : C13170i0.m40332a(C12907r.m40244a("watchlist", "CompleteCollectionBySlug"));
    }

    /* renamed from: e */
    private final Map<String, List<String>> m12483e() {
        Map<String, List<String>> map = (Map) this.f9193a.mo12720d("collections", "textEntryFields");
        return map != null ? map : C13173j0.m40350a();
    }

    /* renamed from: b */
    public String mo13361b(C3676k kVar) {
        String str = (String) m12482d().get(kVar.mo13377a0());
        return str != null ? str : "CollectionBySlug";
    }

    /* renamed from: d */
    public List<ContentSetType> mo13363d(C3676k kVar) {
        List<ContentSetType> list = (List) m12481c().get(kVar.mo13377a0());
        return list != null ? list : C13185o.m40513a();
    }

    /* renamed from: e */
    public boolean mo13364e(C3676k kVar) {
        List b = m12480b();
        StringBuilder sb = new StringBuilder();
        sb.append("slug_");
        sb.append(kVar.mo13377a0());
        if (!b.contains(sb.toString())) {
            List b2 = m12480b();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("contentClass_");
            sb2.append(kVar.mo13375Y());
            if (!b2.contains(sb2.toString())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public List<String> mo13360a(C3676k kVar) {
        List<String> list = (List) m12483e().get(kVar.mo13377a0());
        return list != null ? list : C13183n.m40498a("title");
    }

    /* renamed from: c */
    public Integer mo13362c(C3676k kVar) {
        Map a = m12479a();
        StringBuilder sb = new StringBuilder();
        sb.append("slug_");
        sb.append(kVar.mo13377a0());
        Integer num = (Integer) a.get(sb.toString());
        if (num != null) {
            return num;
        }
        Map a2 = m12479a();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("contentClass_");
        sb2.append(kVar.mo13375Y());
        return (Integer) a2.get(sb2.toString());
    }
}
