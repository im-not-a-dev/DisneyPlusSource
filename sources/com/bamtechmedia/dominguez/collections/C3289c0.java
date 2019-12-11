package com.bamtechmedia.dominguez.collections;

import androidx.fragment.app.Fragment;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.collections.c0 */
/* compiled from: CollectionsModule_ShelfItemSessionFactory */
public final class C3289c0 implements C11895c<C3416k0> {

    /* renamed from: a */
    private final Provider<Fragment> f8330a;

    public C3289c0(Provider<Fragment> provider) {
        this.f8330a = provider;
    }

    /* renamed from: a */
    public static C3289c0 m11359a(Provider<Fragment> provider) {
        return new C3289c0(provider);
    }

    /* renamed from: a */
    public static C3416k0 m11360a(Fragment fragment) {
        C3416k0 c = C3505z.m11888c(fragment);
        C11897e.m38130a(c, "Cannot return null from a non-@Nullable @Provides method");
        return c;
    }

    public C3416k0 get() {
        return m11360a((Fragment) this.f8330a.get());
    }
}
