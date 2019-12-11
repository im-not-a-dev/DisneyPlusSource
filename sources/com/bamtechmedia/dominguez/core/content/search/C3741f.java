package com.bamtechmedia.dominguez.core.content.search;

import com.bamtechmedia.dominguez.config.C3524e;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12880j;

/* renamed from: com.bamtechmedia.dominguez.core.content.search.f */
/* compiled from: SearchApiConfig.kt */
public final class C3741f {

    /* renamed from: a */
    private final C3524e f9334a;

    public C3741f(C3524e eVar) {
        this.f9334a = eVar;
    }

    /* renamed from: a */
    public final List<Map<?, ?>> mo13589a(String str) {
        List a = m12680a();
        ArrayList arrayList = new ArrayList();
        for (Object next : a) {
            if (C12880j.m40224a(((Map) next).get("queryId"), (Object) str)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private final List<Map<?, ?>> m12680a() {
        List<Map<?, ?>> list = (List) this.f9334a.mo12720d("searchApi", "overrideUrls");
        return list != null ? list : C13185o.m40513a();
    }
}
