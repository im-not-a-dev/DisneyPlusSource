package com.bamtechmedia.dominguez.collections.p080o0;

import android.content.res.Resources;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.collections.o0.o */
/* compiled from: ContainerConfigResolverImpl_Factory */
public final class C3450o implements C11895c<C3449n> {

    /* renamed from: a */
    private final Provider<Resources> f8706a;

    /* renamed from: b */
    private final Provider<C3435b> f8707b;

    public C3450o(Provider<Resources> provider, Provider<C3435b> provider2) {
        this.f8706a = provider;
        this.f8707b = provider2;
    }

    /* renamed from: a */
    public static C3450o m11767a(Provider<Resources> provider, Provider<C3435b> provider2) {
        return new C3450o(provider, provider2);
    }

    public C3449n get() {
        return new C3449n((Resources) this.f8706a.get(), (C3435b) this.f8707b.get());
    }
}
