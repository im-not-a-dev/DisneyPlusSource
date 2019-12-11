package com.bamtechmedia.dominguez.auth;

import javax.inject.Provider;
import p163g.p201e.p203b.p286j.C7304o;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.auth.k */
/* compiled from: AuthHostTvBindingModule_FragmentModule_ProvideAuthHostViewModelFactory */
public final class C2722k implements C11895c<C2784r> {

    /* renamed from: a */
    private final Provider<C2712g> f7472a;

    /* renamed from: b */
    private final Provider<C7304o> f7473b;

    public C2722k(Provider<C2712g> provider, Provider<C7304o> provider2) {
        this.f7472a = provider;
        this.f7473b = provider2;
    }

    /* renamed from: a */
    public static C2722k m10357a(Provider<C2712g> provider, Provider<C7304o> provider2) {
        return new C2722k(provider, provider2);
    }

    /* renamed from: a */
    public static C2784r m10358a(C2712g gVar, C7304o oVar) {
        C2784r b = C2717i.m10356b(gVar, oVar);
        C11897e.m38130a(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }

    public C2784r get() {
        return m10358a((C2712g) this.f7472a.get(), (C7304o) this.f7473b.get());
    }
}
