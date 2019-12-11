package com.bamtechmedia.dominguez.core.content.collections;

import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.core.content.collections.m */
/* compiled from: SlugProvider_Factory */
public final class C3679m implements C11895c<C3678l> {

    /* renamed from: a */
    private final Provider<String> f9222a;

    public C3679m(Provider<String> provider) {
        this.f9222a = provider;
    }

    /* renamed from: a */
    public static C3679m m12525a(Provider<String> provider) {
        return new C3679m(provider);
    }

    public C3678l get() {
        return new C3678l(this.f9222a);
    }
}
