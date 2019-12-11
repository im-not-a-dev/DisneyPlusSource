package com.bamtechmedia.dominguez.collections.caching;

import com.bamtechmedia.dominguez.core.content.sets.C3780j;
import com.bamtechmedia.dominguez.core.content.sets.C3780j.C3784d;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.collections.caching.e */
/* compiled from: CollectionsActivityModule_OfflineSetCacheFactory */
public final class C3295e implements C11895c<C3780j> {

    /* renamed from: a */
    private final Provider<C3784d> f8339a;

    public C3295e(Provider<C3784d> provider) {
        this.f8339a = provider;
    }

    /* renamed from: a */
    public static C3295e m11379a(Provider<C3784d> provider) {
        return new C3295e(provider);
    }

    /* renamed from: a */
    public static C3780j m11380a(C3784d dVar) {
        C3780j a = C3294d.m11378a(dVar);
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public C3780j get() {
        return m11380a((C3784d) this.f8339a.get());
    }
}
