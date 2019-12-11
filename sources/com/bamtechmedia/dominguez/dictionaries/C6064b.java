package com.bamtechmedia.dominguez.dictionaries;

import com.bamtechmedia.dominguez.config.C3524e;
import com.bamtechmedia.dominguez.core.BuildInfo;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.dictionaries.b */
/* compiled from: DictionaryConfig_Factory */
public final class C6064b implements C11895c<C6063a> {

    /* renamed from: a */
    private final Provider<C3524e> f13964a;

    /* renamed from: b */
    private final Provider<BuildInfo> f13965b;

    public C6064b(Provider<C3524e> provider, Provider<BuildInfo> provider2) {
        this.f13964a = provider;
        this.f13965b = provider2;
    }

    /* renamed from: a */
    public static C6064b m19435a(Provider<C3524e> provider, Provider<BuildInfo> provider2) {
        return new C6064b(provider, provider2);
    }

    public C6063a get() {
        return new C6063a((C3524e) this.f13964a.get(), (BuildInfo) this.f13965b.get());
    }
}
