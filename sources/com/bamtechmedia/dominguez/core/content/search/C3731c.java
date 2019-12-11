package com.bamtechmedia.dominguez.core.content.search;

import com.bamtech.sdk4.content.SearchOverrides;
import com.bamtech.sdk4.content.search.SearchApi;
import com.bamtechmedia.dominguez.core.C3796d;
import com.google.common.base.Optional;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.core.content.search.c */
/* compiled from: DmgzSearchApiImpl_Factory */
public final class C3731c implements C11895c<C3727b> {

    /* renamed from: a */
    private final Provider<SearchApi> f9320a;

    /* renamed from: b */
    private final Provider<Optional<C3796d>> f9321b;

    /* renamed from: c */
    private final Provider<SearchOverrides> f9322c;

    /* renamed from: d */
    private final Provider<C3749j> f9323d;

    /* renamed from: e */
    private final Provider<C3743h> f9324e;

    /* renamed from: f */
    private final Provider<C3741f> f9325f;

    public C3731c(Provider<SearchApi> provider, Provider<Optional<C3796d>> provider2, Provider<SearchOverrides> provider3, Provider<C3749j> provider4, Provider<C3743h> provider5, Provider<C3741f> provider6) {
        this.f9320a = provider;
        this.f9321b = provider2;
        this.f9322c = provider3;
        this.f9323d = provider4;
        this.f9324e = provider5;
        this.f9325f = provider6;
    }

    /* renamed from: a */
    public static C3731c m12672a(Provider<SearchApi> provider, Provider<Optional<C3796d>> provider2, Provider<SearchOverrides> provider3, Provider<C3749j> provider4, Provider<C3743h> provider5, Provider<C3741f> provider6) {
        C3731c cVar = new C3731c(provider, provider2, provider3, provider4, provider5, provider6);
        return cVar;
    }

    public C3727b get() {
        C3727b bVar = new C3727b((SearchApi) this.f9320a.get(), (Optional) this.f9321b.get(), this.f9322c, (C3749j) this.f9323d.get(), (C3743h) this.f9324e.get(), (C3741f) this.f9325f.get());
        return bVar;
    }
}
