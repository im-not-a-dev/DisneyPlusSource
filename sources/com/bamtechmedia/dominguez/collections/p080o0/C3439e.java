package com.bamtechmedia.dominguez.collections.p080o0;

import com.bamtechmedia.dominguez.core.utils.C5859p;
import java.util.Map;
import p686n.p687a.Timber;

/* renamed from: com.bamtechmedia.dominguez.collections.o0.e */
/* compiled from: CollectionConfigResolver.kt */
public final class C3439e {

    /* renamed from: a */
    private final C3435b f8670a;

    public C3439e(C3435b bVar) {
        this.f8670a = bVar;
    }

    /* renamed from: a */
    public final C3433a mo12614a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Resolving config for collection: ");
        sb.append(str);
        Timber.m44522a(sb.toString(), new Object[0]);
        Map map = (Map) C5859p.m18897a(this.f8670a.mo12612a(), "default", new String[0]);
        if (map != null) {
            Map map2 = (Map) C5859p.m18897a(this.f8670a.mo12612a(), str, new String[0]);
            if (map2 == null) {
                map2 = C13173j0.m40350a();
            }
            return new C3433a(map, map2);
        }
        throw new IllegalStateException("Default collection must be present");
    }
}
