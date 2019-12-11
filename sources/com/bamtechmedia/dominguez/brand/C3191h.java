package com.bamtechmedia.dominguez.brand;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0703a0;
import com.bamtechmedia.dominguez.collections.AssetStaticImageHandler;
import com.bamtechmedia.dominguez.collections.AssetTransitionHandler;
import com.bamtechmedia.dominguez.collections.AssetVideoArtViewModel;
import com.bamtechmedia.dominguez.collections.C3317e;
import com.bamtechmedia.dominguez.collections.C3327g0;
import com.bamtechmedia.dominguez.core.content.collections.C3676k;
import com.bamtechmedia.dominguez.core.p088i.p091p.C3848a;
import com.bamtechmedia.dominguez.core.utils.C5856o0;
import com.bamtechmedia.dominguez.profiles.C6627c1;
import javax.inject.Provider;
import p163g.p201e.p203b.p275a0.C7159g;

/* renamed from: com.bamtechmedia.dominguez.brand.h */
/* compiled from: BrandPageTvBindingModule */
abstract class C3191h {
    /* renamed from: a */
    static AssetTransitionHandler m11124a(C3176e eVar, AssetStaticImageHandler assetStaticImageHandler, C3317e eVar2, C6627c1 c1Var) {
        return (AssetTransitionHandler) C5856o0.m18893a((Fragment) eVar, AssetTransitionHandler.class, (Provider<T>) new C3172b<T>(eVar2, assetStaticImageHandler, c1Var));
    }

    /* renamed from: b */
    static C3317e m11126b(C3176e eVar) {
        return (C3317e) C0703a0.m3720b(eVar).mo4180a(AssetVideoArtViewModel.class);
    }

    /* renamed from: c */
    static C3327g0 m11127c(C3176e eVar) {
        return (C3327g0) C5856o0.m18893a((Fragment) eVar, C3327g0.class, (Provider<T>) C3173c.f8128a);
    }

    /* renamed from: d */
    static C3676k m11128d(C3176e eVar) {
        return eVar.mo12239x();
    }

    /* renamed from: a */
    static /* synthetic */ AssetTransitionHandler m11125a(C3317e eVar, AssetStaticImageHandler assetStaticImageHandler, C6627c1 c1Var) {
        return new AssetTransitionHandler(eVar, assetStaticImageHandler, c1Var);
    }

    /* renamed from: a */
    static AssetStaticImageHandler m11123a(C3176e eVar, Context context, C7159g gVar, C3848a aVar) {
        return (AssetStaticImageHandler) C5856o0.m18893a((Fragment) eVar, AssetStaticImageHandler.class, (Provider<T>) new C3171a<T>(context, gVar, aVar));
    }

    /* renamed from: a */
    static /* synthetic */ AssetStaticImageHandler m11122a(Context context, C7159g gVar, C3848a aVar) {
        return new AssetStaticImageHandler(context, gVar, aVar);
    }

    /* renamed from: a */
    static BrandPageAnimationHelper m11121a(C3176e eVar) {
        return new BrandPageAnimationHelper(eVar);
    }
}
