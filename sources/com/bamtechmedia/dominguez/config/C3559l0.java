package com.bamtechmedia.dominguez.config;

import com.bamtechmedia.dominguez.collections.p080o0.C3435b;
import com.bamtechmedia.dominguez.dictionaries.C6072g;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.config.l0 */
/* compiled from: LoadConfigsActionImpl_Factory */
public final class C3559l0 implements C11895c<C3557k0> {

    /* renamed from: a */
    private final Provider<C3435b> f8886a;

    /* renamed from: b */
    private final Provider<C6072g> f8887b;

    public C3559l0(Provider<C3435b> provider, Provider<C6072g> provider2) {
        this.f8886a = provider;
        this.f8887b = provider2;
    }

    /* renamed from: a */
    public static C3559l0 m12000a(Provider<C3435b> provider, Provider<C6072g> provider2) {
        return new C3559l0(provider, provider2);
    }

    public C3557k0 get() {
        return new C3557k0((C3435b) this.f8886a.get(), (C6072g) this.f8887b.get());
    }
}
