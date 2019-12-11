package com.bamtechmedia.dominguez.collections.caching;

import com.bamtechmedia.dominguez.core.content.collections.C3667h;
import com.bamtechmedia.dominguez.core.content.collections.C3678l;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.collections.caching.c */
/* compiled from: CollectionPrefetchHelperImpl_Factory */
public final class C3293c implements C11895c<C3292b> {

    /* renamed from: a */
    private final Provider<C3667h> f8337a;

    /* renamed from: b */
    private final Provider<C3678l> f8338b;

    public C3293c(Provider<C3667h> provider, Provider<C3678l> provider2) {
        this.f8337a = provider;
        this.f8338b = provider2;
    }

    /* renamed from: a */
    public static C3293c m11377a(Provider<C3667h> provider, Provider<C3678l> provider2) {
        return new C3293c(provider, provider2);
    }

    public C3292b get() {
        return new C3292b((C3667h) this.f8337a.get(), (C3678l) this.f8338b.get());
    }
}
