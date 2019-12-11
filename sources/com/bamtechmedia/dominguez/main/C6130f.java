package com.bamtechmedia.dominguez.main;

import com.bamtechmedia.dominguez.analytics.C2366i0;
import com.bamtechmedia.dominguez.collections.C3330h;
import com.bamtechmedia.dominguez.collections.C3419l;
import com.bamtechmedia.dominguez.profiles.C6667g1;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.main.f */
/* compiled from: MainActivityCommonModule_ProvideCollectionCacheFactory */
public final class C6130f implements C11895c<C3330h> {

    /* renamed from: a */
    private final Provider<MainActivity> f14096a;

    /* renamed from: b */
    private final Provider<C6667g1> f14097b;

    /* renamed from: c */
    private final Provider<C3419l> f14098c;

    /* renamed from: d */
    private final Provider<C2366i0> f14099d;

    public C6130f(Provider<MainActivity> provider, Provider<C6667g1> provider2, Provider<C3419l> provider3, Provider<C2366i0> provider4) {
        this.f14096a = provider;
        this.f14097b = provider2;
        this.f14098c = provider3;
        this.f14099d = provider4;
    }

    /* renamed from: a */
    public static C6130f m19547a(Provider<MainActivity> provider, Provider<C6667g1> provider2, Provider<C3419l> provider3, Provider<C2366i0> provider4) {
        return new C6130f(provider, provider2, provider3, provider4);
    }

    /* renamed from: a */
    public static C3330h m19546a(MainActivity mainActivity, C6667g1 g1Var, C3419l lVar, C2366i0 i0Var) {
        C3330h a = C6128d.m19541a(mainActivity, g1Var, lVar, i0Var);
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public C3330h get() {
        return m19546a((MainActivity) this.f14096a.get(), (C6667g1) this.f14097b.get(), (C3419l) this.f14098c.get(), (C2366i0) this.f14099d.get());
    }
}
