package com.bamtechmedia.dominguez.main;

import com.bamtechmedia.dominguez.core.p218n.C5773a;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.main.e */
/* compiled from: MainActivityCommonModule_ProvideActivityNavigationFactory */
public final class C6129e implements C11895c<C5773a> {

    /* renamed from: a */
    private final Provider<MainActivity> f14095a;

    public C6129e(Provider<MainActivity> provider) {
        this.f14095a = provider;
    }

    /* renamed from: a */
    public static C6129e m19545a(Provider<MainActivity> provider) {
        return new C6129e(provider);
    }

    /* renamed from: a */
    public static C5773a m19544a(MainActivity mainActivity) {
        C5773a a = C6128d.m19542a(mainActivity);
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public C5773a get() {
        return m19544a((MainActivity) this.f14095a.get());
    }
}
