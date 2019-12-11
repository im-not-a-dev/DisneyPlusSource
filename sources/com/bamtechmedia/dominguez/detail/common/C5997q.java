package com.bamtechmedia.dominguez.detail.common;

import com.bamtech.sdk4.content.SearchOverrides;
import com.bamtechmedia.dominguez.config.C3524e;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.detail.common.q */
/* compiled from: PromoConfig_Factory */
public final class C5997q implements C11895c<C5996p> {

    /* renamed from: a */
    private final Provider<C3524e> f13838a;

    /* renamed from: b */
    private final Provider<SearchOverrides> f13839b;

    public C5997q(Provider<C3524e> provider, Provider<SearchOverrides> provider2) {
        this.f13838a = provider;
        this.f13839b = provider2;
    }

    /* renamed from: a */
    public static C5997q m19212a(Provider<C3524e> provider, Provider<SearchOverrides> provider2) {
        return new C5997q(provider, provider2);
    }

    public C5996p get() {
        return new C5996p((C3524e) this.f13838a.get(), (SearchOverrides) this.f13839b.get());
    }
}
