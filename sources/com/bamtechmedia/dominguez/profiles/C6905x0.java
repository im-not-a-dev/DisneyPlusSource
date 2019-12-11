package com.bamtechmedia.dominguez.profiles;

import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.profiles.x0 */
/* compiled from: ProfilesHostTvBindingModule_ProfilesHostFragmentModule_ProvideProfilesHostViewModelFactory */
public final class C6905x0 implements C11895c<C6969y0> {

    /* renamed from: a */
    private final Provider<C6769r0> f15373a;

    public C6905x0(Provider<C6769r0> provider) {
        this.f15373a = provider;
    }

    /* renamed from: a */
    public static C6905x0 m21111a(Provider<C6769r0> provider) {
        return new C6905x0(provider);
    }

    /* renamed from: a */
    public static C6969y0 m21112a(C6769r0 r0Var) {
        C6969y0 b = C6846t0.m20996b(r0Var);
        C11897e.m38130a(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }

    public C6969y0 get() {
        return m21112a((C6769r0) this.f15373a.get());
    }
}
