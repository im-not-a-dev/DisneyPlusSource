package com.bamtechmedia.dominguez.core;

import com.bamtechmedia.dominguez.config.C3524e;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.core.c */
/* compiled from: CoreCommonConfigImpl_Factory */
public final class C3590c implements C11895c<C3586b> {

    /* renamed from: a */
    private final Provider<C3524e> f8929a;

    public C3590c(Provider<C3524e> provider) {
        this.f8929a = provider;
    }

    /* renamed from: a */
    public static C3590c m12077a(Provider<C3524e> provider) {
        return new C3590c(provider);
    }

    public C3586b get() {
        return new C3586b((C3524e) this.f8929a.get());
    }
}
