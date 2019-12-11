package com.bamtechmedia.dominguez.collections.p080o0;

import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.collections.o0.f */
/* compiled from: CollectionConfigResolver_Factory */
public final class C3440f implements C11895c<C3439e> {

    /* renamed from: a */
    private final Provider<C3435b> f8671a;

    public C3440f(Provider<C3435b> provider) {
        this.f8671a = provider;
    }

    /* renamed from: a */
    public static C3440f m11732a(Provider<C3435b> provider) {
        return new C3440f(provider);
    }

    public C3439e get() {
        return new C3439e((C3435b) this.f8671a.get());
    }
}
