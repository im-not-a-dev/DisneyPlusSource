package com.bamtechmedia.dominguez.portability.availability;

import com.bamtechmedia.dominguez.config.C3524e;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.portability.availability.b */
/* compiled from: PortabilityConfig_Factory */
public final class C6603b implements C11895c<C6602a> {

    /* renamed from: a */
    private final Provider<C3524e> f14900a;

    public C6603b(Provider<C3524e> provider) {
        this.f14900a = provider;
    }

    /* renamed from: a */
    public static C6603b m20517a(Provider<C3524e> provider) {
        return new C6603b(provider);
    }

    public C6602a get() {
        return new C6602a((C3524e) this.f14900a.get());
    }
}
