package com.bamtechmedia.dominguez.core.content.sets;

import com.bamtechmedia.dominguez.config.C3524e;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.core.content.sets.g */
/* compiled from: ContentSetRequestConfig_Factory */
public final class C3777g implements C11895c<C3776f> {

    /* renamed from: a */
    private final Provider<C3524e> f9418a;

    /* renamed from: b */
    private final Provider<Boolean> f9419b;

    public C3777g(Provider<C3524e> provider, Provider<Boolean> provider2) {
        this.f9418a = provider;
        this.f9419b = provider2;
    }

    /* renamed from: a */
    public static C3777g m12785a(Provider<C3524e> provider, Provider<Boolean> provider2) {
        return new C3777g(provider, provider2);
    }

    public C3776f get() {
        return new C3776f((C3524e) this.f9418a.get(), ((Boolean) this.f9419b.get()).booleanValue());
    }
}
