package com.bamtechmedia.dominguez.auth.p066r0;

import com.bamtechmedia.dominguez.core.p218n.C5773a;
import javax.inject.Provider;
import p163g.p201e.p203b.p299m.C7547h;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.auth.r0.l */
/* compiled from: LogOutRouterImpl_Factory */
public final class C2813l implements C11895c<C2811k> {

    /* renamed from: a */
    private final Provider<C5773a> f7568a;

    /* renamed from: b */
    private final Provider<C7547h> f7569b;

    public C2813l(Provider<C5773a> provider, Provider<C7547h> provider2) {
        this.f7568a = provider;
        this.f7569b = provider2;
    }

    /* renamed from: a */
    public static C2813l m10490a(Provider<C5773a> provider, Provider<C7547h> provider2) {
        return new C2813l(provider, provider2);
    }

    public C2811k get() {
        return new C2811k((C5773a) this.f7568a.get(), (C7547h) this.f7569b.get());
    }
}
