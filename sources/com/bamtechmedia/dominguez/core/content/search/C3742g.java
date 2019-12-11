package com.bamtechmedia.dominguez.core.content.search;

import com.bamtechmedia.dominguez.config.C3524e;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.core.content.search.g */
/* compiled from: SearchApiConfig_Factory */
public final class C3742g implements C11895c<C3741f> {

    /* renamed from: a */
    private final Provider<C3524e> f9335a;

    public C3742g(Provider<C3524e> provider) {
        this.f9335a = provider;
    }

    /* renamed from: a */
    public static C3742g m12682a(Provider<C3524e> provider) {
        return new C3742g(provider);
    }

    public C3741f get() {
        return new C3741f((C3524e) this.f9335a.get());
    }
}
