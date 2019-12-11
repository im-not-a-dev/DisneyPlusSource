package com.bamtechmedia.dominguez.collections.p080o0;

import com.bamtechmedia.dominguez.config.C3524e;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.collections.o0.i */
/* compiled from: CollectionsAppConfigImpl_Factory */
public final class C3443i implements C11895c<C3442h> {

    /* renamed from: a */
    private final Provider<C3524e> f8673a;

    public C3443i(Provider<C3524e> provider) {
        this.f8673a = provider;
    }

    /* renamed from: a */
    public static C3443i m11739a(Provider<C3524e> provider) {
        return new C3443i(provider);
    }

    public C3442h get() {
        return new C3442h((C3524e) this.f8673a.get());
    }
}
