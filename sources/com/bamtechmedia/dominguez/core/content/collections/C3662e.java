package com.bamtechmedia.dominguez.core.content.collections;

import com.bamtechmedia.dominguez.config.C3524e;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.core.content.collections.e */
/* compiled from: CollectionRequestConfigImpl_Factory */
public final class C3662e implements C11895c<C3661d> {

    /* renamed from: a */
    private final Provider<C3524e> f9194a;

    public C3662e(Provider<C3524e> provider) {
        this.f9194a = provider;
    }

    /* renamed from: a */
    public static C3662e m12489a(Provider<C3524e> provider) {
        return new C3662e(provider);
    }

    public C3661d get() {
        return new C3661d((C3524e) this.f9194a.get());
    }
}
