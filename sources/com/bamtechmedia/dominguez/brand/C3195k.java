package com.bamtechmedia.dominguez.brand;

import com.bamtechmedia.dominguez.collections.C3317e;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.brand.k */
/* compiled from: BrandPageTvBindingModule_FragmentModule_ProvideAssetVideoArtHandlerFactory */
public final class C3195k implements C11895c<C3317e> {

    /* renamed from: a */
    private final Provider<C3176e> f8156a;

    public C3195k(Provider<C3176e> provider) {
        this.f8156a = provider;
    }

    /* renamed from: a */
    public static C3195k m11130a(Provider<C3176e> provider) {
        return new C3195k(provider);
    }

    /* renamed from: a */
    public static C3317e m11131a(C3176e eVar) {
        C3317e b = C3191h.m11126b(eVar);
        C11897e.m38130a(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }

    public C3317e get() {
        return m11131a((C3176e) this.f8156a.get());
    }
}
