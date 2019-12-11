package com.bamtechmedia.dominguez.collections;

import androidx.fragment.app.Fragment;
import com.bamtechmedia.dominguez.collections.items.ShelfFragmentHelper;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.collections.a0 */
/* compiled from: CollectionsModule_FragmentHelperFactory */
public final class C3285a0 implements C11895c<ShelfFragmentHelper> {

    /* renamed from: a */
    private final Provider<Fragment> f8329a;

    public C3285a0(Provider<Fragment> provider) {
        this.f8329a = provider;
    }

    /* renamed from: a */
    public static C3285a0 m11345a(Provider<Fragment> provider) {
        return new C3285a0(provider);
    }

    /* renamed from: a */
    public static ShelfFragmentHelper m11346a(Fragment fragment) {
        ShelfFragmentHelper a = C3505z.m11886a(fragment);
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public ShelfFragmentHelper get() {
        return m11346a((Fragment) this.f8329a.get());
    }
}
