package com.bamtechmedia.dominguez.ripcut.cache;

import android.content.Context;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.ripcut.cache.b */
/* compiled from: CacheFileResolver_Factory */
public final class C7119b implements C11895c<C7116a> {

    /* renamed from: a */
    private final Provider<Context> f15749a;

    public C7119b(Provider<Context> provider) {
        this.f15749a = provider;
    }

    /* renamed from: a */
    public static C7119b m21520a(Provider<Context> provider) {
        return new C7119b(provider);
    }

    public C7116a get() {
        return new C7116a((Context) this.f15749a.get());
    }
}
