package com.bamtechmedia.dominguez.brand;

import com.bamtechmedia.dominguez.collections.AssetStaticImageHandler;
import com.bamtechmedia.dominguez.collections.AssetTransitionHandler;
import com.bamtechmedia.dominguez.collections.C3317e;
import com.bamtechmedia.dominguez.profiles.C6627c1;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.brand.l */
/* compiled from: BrandPageTvBindingModule_FragmentModule_ProvidesAssetFocusCallbackFactory */
public final class C3196l implements C11895c<AssetTransitionHandler> {

    /* renamed from: a */
    private final Provider<C3176e> f8157a;

    /* renamed from: b */
    private final Provider<AssetStaticImageHandler> f8158b;

    /* renamed from: c */
    private final Provider<C3317e> f8159c;

    /* renamed from: d */
    private final Provider<C6627c1> f8160d;

    public C3196l(Provider<C3176e> provider, Provider<AssetStaticImageHandler> provider2, Provider<C3317e> provider3, Provider<C6627c1> provider4) {
        this.f8157a = provider;
        this.f8158b = provider2;
        this.f8159c = provider3;
        this.f8160d = provider4;
    }

    /* renamed from: a */
    public static C3196l m11132a(Provider<C3176e> provider, Provider<AssetStaticImageHandler> provider2, Provider<C3317e> provider3, Provider<C6627c1> provider4) {
        return new C3196l(provider, provider2, provider3, provider4);
    }

    /* renamed from: a */
    public static AssetTransitionHandler m11133a(C3176e eVar, AssetStaticImageHandler assetStaticImageHandler, C3317e eVar2, C6627c1 c1Var) {
        AssetTransitionHandler a = C3191h.m11124a(eVar, assetStaticImageHandler, eVar2, c1Var);
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public AssetTransitionHandler get() {
        return m11133a((C3176e) this.f8157a.get(), (AssetStaticImageHandler) this.f8158b.get(), (C3317e) this.f8159c.get(), (C6627c1) this.f8160d.get());
    }
}
