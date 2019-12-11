package com.bamtechmedia.dominguez.discover;

import com.bamtechmedia.dominguez.collections.p079n0.C3431b;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.discover.c */
/* compiled from: DiscoverCommonBindingModule_ProvidesAutoPagingLifecycleHelperFactory */
public final class C6097c implements C11895c<C3431b> {

    /* renamed from: a */
    private final Provider<C6099e> f14031a;

    /* renamed from: b */
    private final Provider<Boolean> f14032b;

    public C6097c(Provider<C6099e> provider, Provider<Boolean> provider2) {
        this.f14031a = provider;
        this.f14032b = provider2;
    }

    /* renamed from: a */
    public static C6097c m19504a(Provider<C6099e> provider, Provider<Boolean> provider2) {
        return new C6097c(provider, provider2);
    }

    /* renamed from: a */
    public static C3431b m19503a(C6099e eVar, Boolean bool) {
        C3431b a = C6096b.m19501a(eVar, bool);
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public C3431b get() {
        return m19503a((C6099e) this.f14031a.get(), (Boolean) this.f14032b.get());
    }
}
