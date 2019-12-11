package com.bamtechmedia.dominguez.ripcut.glide;

import android.app.ActivityManager;
import android.content.Context;
import com.bamtechmedia.dominguez.ripcut.cache.C7120c;
import javax.inject.Provider;
import p163g.p201e.p203b.p275a0.C7152e;
import p163g.p201e.p203b.p275a0.p276k.C7170a;
import p512h.p515d.C11895c;
import p520io.reactivex.C11969r;

/* renamed from: com.bamtechmedia.dominguez.ripcut.glide.g */
/* compiled from: RipcutGlideImageLoader_Factory */
public final class C7138g implements C11895c<C7136f> {

    /* renamed from: a */
    private final Provider<Context> f15780a;

    /* renamed from: b */
    private final Provider<C7170a> f15781b;

    /* renamed from: c */
    private final Provider<ActivityManager> f15782c;

    /* renamed from: d */
    private final Provider<C7120c> f15783d;

    /* renamed from: e */
    private final Provider<C7152e> f15784e;

    /* renamed from: f */
    private final Provider<C11969r> f15785f;

    public C7138g(Provider<Context> provider, Provider<C7170a> provider2, Provider<ActivityManager> provider3, Provider<C7120c> provider4, Provider<C7152e> provider5, Provider<C11969r> provider6) {
        this.f15780a = provider;
        this.f15781b = provider2;
        this.f15782c = provider3;
        this.f15783d = provider4;
        this.f15784e = provider5;
        this.f15785f = provider6;
    }

    /* renamed from: a */
    public static C7138g m21661a(Provider<Context> provider, Provider<C7170a> provider2, Provider<ActivityManager> provider3, Provider<C7120c> provider4, Provider<C7152e> provider5, Provider<C11969r> provider6) {
        C7138g gVar = new C7138g(provider, provider2, provider3, provider4, provider5, provider6);
        return gVar;
    }

    public C7136f get() {
        C7136f fVar = new C7136f((Context) this.f15780a.get(), (C7170a) this.f15781b.get(), (ActivityManager) this.f15782c.get(), (C7120c) this.f15783d.get(), (C7152e) this.f15784e.get(), (C11969r) this.f15785f.get());
        return fVar;
    }
}
