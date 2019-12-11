package com.bamtechmedia.dominguez.ripcut.cache;

import javax.inject.Provider;
import okhttp3.OkHttpClient;
import p512h.p515d.C11895c;
import p520io.reactivex.C11969r;

/* renamed from: com.bamtechmedia.dominguez.ripcut.cache.e */
/* compiled from: UriCaching_Factory */
public final class C7127e implements C11895c<C7120c> {

    /* renamed from: a */
    private final Provider<C7116a> f15762a;

    /* renamed from: b */
    private final Provider<OkHttpClient> f15763b;

    /* renamed from: c */
    private final Provider<C11969r> f15764c;

    public C7127e(Provider<C7116a> provider, Provider<OkHttpClient> provider2, Provider<C11969r> provider3) {
        this.f15762a = provider;
        this.f15763b = provider2;
        this.f15764c = provider3;
    }

    /* renamed from: a */
    public static C7127e m21530a(Provider<C7116a> provider, Provider<OkHttpClient> provider2, Provider<C11969r> provider3) {
        return new C7127e(provider, provider2, provider3);
    }

    public C7120c get() {
        return new C7120c((C7116a) this.f15762a.get(), this.f15763b, (C11969r) this.f15764c.get());
    }
}
