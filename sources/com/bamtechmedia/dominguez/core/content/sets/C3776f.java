package com.bamtechmedia.dominguez.core.content.sets;

import com.bamtechmedia.dominguez.config.C3524e;
import java.util.List;
import java.util.Map;
import kotlin.C12907r;

/* renamed from: com.bamtechmedia.dominguez.core.content.sets.f */
/* compiled from: ContentSetRequestConfig.kt */
public final class C3776f {

    /* renamed from: a */
    private final C3524e f9416a;

    /* renamed from: b */
    private final boolean f9417b;

    public C3776f(C3524e eVar, boolean z) {
        this.f9416a = eVar;
        this.f9417b = z;
    }

    /* renamed from: a */
    private final Map<String, List<String>> m12782a() {
        if (!this.f9417b) {
            return C13173j0.m40350a();
        }
        String str = "description";
        String str2 = "title";
        return C13173j0.m40356a(C12907r.m40244a("RecommendationSet", C13185o.m40520c(str2, str)), C12907r.m40244a("ContinueWatchingSet", C13185o.m40520c(str2, str)));
    }

    /* renamed from: b */
    private final Map<String, List<String>> m12783b() {
        Map<String, List<String>> map = (Map) this.f9416a.mo12720d("contentSets", "textEntryFields");
        return map != null ? map : m12782a();
    }

    /* renamed from: a */
    public final List<String> mo13666a(ContentSetType contentSetType) {
        List<String> list = (List) m12783b().get(contentSetType.name());
        return list != null ? list : C13183n.m40498a("title");
    }
}
