package com.bamtechmedia.dominguez.dictionaries;

import com.bamtechmedia.dominguez.core.BuildInfo;
import com.bamtechmedia.dominguez.core.content.search.C3724a;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p520io.reactivex.Single;

/* renamed from: com.bamtechmedia.dominguez.dictionaries.k */
/* compiled from: DictionaryRequest_Factory */
public final class C6086k implements C11895c<C6082j> {

    /* renamed from: a */
    private final Provider<C3724a> f14009a;

    /* renamed from: b */
    private final Provider<Single<C6063a>> f14010b;

    /* renamed from: c */
    private final Provider<BuildInfo> f14011c;

    public C6086k(Provider<C3724a> provider, Provider<Single<C6063a>> provider2, Provider<BuildInfo> provider3) {
        this.f14009a = provider;
        this.f14010b = provider2;
        this.f14011c = provider3;
    }

    /* renamed from: a */
    public static C6086k m19473a(Provider<C3724a> provider, Provider<Single<C6063a>> provider2, Provider<BuildInfo> provider3) {
        return new C6086k(provider, provider2, provider3);
    }

    public C6082j get() {
        return new C6082j((C3724a) this.f14009a.get(), (Single) this.f14010b.get(), (BuildInfo) this.f14011c.get());
    }
}
