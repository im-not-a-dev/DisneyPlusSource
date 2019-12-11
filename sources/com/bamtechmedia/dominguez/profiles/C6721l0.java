package com.bamtechmedia.dominguez.profiles;

import com.bamtechmedia.dominguez.core.p218n.C5773a;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.profiles.l0 */
/* compiled from: ProfilesBindingModule_ProvideProfilesGlobalRouterFactory */
public final class C6721l0 implements C11895c<C6761p0> {

    /* renamed from: a */
    private final Provider<C5773a> f15080a;

    /* renamed from: b */
    private final Provider<C6627c1> f15081b;

    public C6721l0(Provider<C5773a> provider, Provider<C6627c1> provider2) {
        this.f15080a = provider;
        this.f15081b = provider2;
    }

    /* renamed from: a */
    public static C6721l0 m20776a(Provider<C5773a> provider, Provider<C6627c1> provider2) {
        return new C6721l0(provider, provider2);
    }

    /* renamed from: a */
    public static C6761p0 m20777a(C5773a aVar, C6627c1 c1Var) {
        C6761p0 a = C6717k0.m20774a(aVar, c1Var);
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public C6761p0 get() {
        return m20777a((C5773a) this.f15080a.get(), (C6627c1) this.f15081b.get());
    }
}
