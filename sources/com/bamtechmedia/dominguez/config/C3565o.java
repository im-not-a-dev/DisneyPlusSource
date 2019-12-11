package com.bamtechmedia.dominguez.config;

import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.config.o */
/* compiled from: DictionaryKeysSource_Factory */
public final class C3565o implements C11895c<C3563n> {

    /* renamed from: a */
    private final Provider<C3572r0> f8899a;

    public C3565o(Provider<C3572r0> provider) {
        this.f8899a = provider;
    }

    /* renamed from: a */
    public static C3565o m12011a(Provider<C3572r0> provider) {
        return new C3565o(provider);
    }

    public C3563n get() {
        return new C3563n((C3572r0) this.f8899a.get());
    }
}
