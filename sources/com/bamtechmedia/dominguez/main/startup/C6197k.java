package com.bamtechmedia.dominguez.main.startup;

import com.bamtechmedia.dominguez.auth.p061o0.C2742c;
import com.bamtechmedia.dominguez.config.C3555j0;
import com.bamtechmedia.dominguez.core.content.C3716q;
import javax.inject.Provider;
import p163g.p201e.p203b.p314r.C7727c;
import p163g.p201e.p203b.p319v.C7862c;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.main.startup.k */
/* compiled from: OnlineAppInitialization_Factory */
public final class C6197k implements C11895c<C6196j> {

    /* renamed from: a */
    private final Provider<C3555j0> f14208a;

    /* renamed from: b */
    private final Provider<C2742c> f14209b;

    /* renamed from: c */
    private final Provider<C7862c> f14210c;

    /* renamed from: d */
    private final Provider<C7727c> f14211d;

    /* renamed from: e */
    private final Provider<C3716q> f14212e;

    public C6197k(Provider<C3555j0> provider, Provider<C2742c> provider2, Provider<C7862c> provider3, Provider<C7727c> provider4, Provider<C3716q> provider5) {
        this.f14208a = provider;
        this.f14209b = provider2;
        this.f14210c = provider3;
        this.f14211d = provider4;
        this.f14212e = provider5;
    }

    /* renamed from: a */
    public static C6197k m19668a(Provider<C3555j0> provider, Provider<C2742c> provider2, Provider<C7862c> provider3, Provider<C7727c> provider4, Provider<C3716q> provider5) {
        C6197k kVar = new C6197k(provider, provider2, provider3, provider4, provider5);
        return kVar;
    }

    public C6196j get() {
        C6196j jVar = new C6196j((C3555j0) this.f14208a.get(), (C2742c) this.f14209b.get(), (C7862c) this.f14210c.get(), (C7727c) this.f14211d.get(), (C3716q) this.f14212e.get());
        return jVar;
    }
}
