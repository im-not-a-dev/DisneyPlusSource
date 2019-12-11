package com.bamtechmedia.dominguez.core.content.collections;

import com.bamtechmedia.dominguez.core.content.search.C3724a;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.core.content.collections.g */
/* compiled from: CollectionsRemoteDataSource_Factory */
public final class C3666g implements C11895c<C3663f> {

    /* renamed from: a */
    private final Provider<C3724a> f9199a;

    /* renamed from: b */
    private final Provider<C3660c> f9200b;

    public C3666g(Provider<C3724a> provider, Provider<C3660c> provider2) {
        this.f9199a = provider;
        this.f9200b = provider2;
    }

    /* renamed from: a */
    public static C3666g m12495a(Provider<C3724a> provider, Provider<C3660c> provider2) {
        return new C3666g(provider, provider2);
    }

    public C3663f get() {
        return new C3663f((C3724a) this.f9199a.get(), (C3660c) this.f9200b.get());
    }
}
