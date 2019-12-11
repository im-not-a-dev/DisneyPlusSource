package com.bamtechmedia.dominguez.brand;

import android.content.Context;
import com.bamtechmedia.dominguez.collections.AssetStaticImageHandler;
import com.bamtechmedia.dominguez.core.p088i.p091p.C3848a;
import javax.inject.Provider;
import p163g.p201e.p203b.p275a0.C7159g;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.brand.m */
/* compiled from: BrandPageTvBindingModule_FragmentModule_ProvidesAssetStaticImageHandlerFactory */
public final class C3197m implements C11895c<AssetStaticImageHandler> {

    /* renamed from: a */
    private final Provider<C3176e> f8161a;

    /* renamed from: b */
    private final Provider<Context> f8162b;

    /* renamed from: c */
    private final Provider<C7159g> f8163c;

    /* renamed from: d */
    private final Provider<C3848a> f8164d;

    public C3197m(Provider<C3176e> provider, Provider<Context> provider2, Provider<C7159g> provider3, Provider<C3848a> provider4) {
        this.f8161a = provider;
        this.f8162b = provider2;
        this.f8163c = provider3;
        this.f8164d = provider4;
    }

    /* renamed from: a */
    public static C3197m m11134a(Provider<C3176e> provider, Provider<Context> provider2, Provider<C7159g> provider3, Provider<C3848a> provider4) {
        return new C3197m(provider, provider2, provider3, provider4);
    }

    /* renamed from: a */
    public static AssetStaticImageHandler m11135a(C3176e eVar, Context context, C7159g gVar, C3848a aVar) {
        AssetStaticImageHandler a = C3191h.m11123a(eVar, context, gVar, aVar);
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public AssetStaticImageHandler get() {
        return m11135a((C3176e) this.f8161a.get(), (Context) this.f8162b.get(), (C7159g) this.f8163c.get(), (C3848a) this.f8164d.get());
    }
}
