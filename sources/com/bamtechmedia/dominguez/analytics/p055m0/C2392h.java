package com.bamtechmedia.dominguez.analytics.p055m0;

import com.bamtechmedia.dominguez.analytics.p059q0.C2451c;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p520io.reactivex.C11969r;

/* renamed from: com.bamtechmedia.dominguez.analytics.m0.h */
/* compiled from: DeepLinkContributor_Factory */
public final class C2392h implements C11895c<C2390g> {

    /* renamed from: a */
    private final Provider<C2451c> f6630a;

    /* renamed from: b */
    private final Provider<C11969r> f6631b;

    public C2392h(Provider<C2451c> provider, Provider<C11969r> provider2) {
        this.f6630a = provider;
        this.f6631b = provider2;
    }

    /* renamed from: a */
    public static C2392h m8936a(Provider<C2451c> provider, Provider<C11969r> provider2) {
        return new C2392h(provider, provider2);
    }

    public C2390g get() {
        return new C2390g((C2451c) this.f6630a.get(), (C11969r) this.f6631b.get());
    }
}
