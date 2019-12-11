package com.bamtechmedia.dominguez.auth.p064p0;

import com.bamtech.sdk4.account.AccountApi;
import com.bamtech.sdk4.identity.bam.BamIdentityApi;
import com.google.common.base.Optional;
import javax.inject.Provider;
import p163g.p201e.p203b.p299m.C7547h;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.auth.p0.c */
/* compiled from: AutoLoginAction_Factory */
public final class C2769c implements C11895c<C2763b> {

    /* renamed from: a */
    private final Provider<Optional<C2760a>> f7517a;

    /* renamed from: b */
    private final Provider<C2771e> f7518b;

    /* renamed from: c */
    private final Provider<BamIdentityApi> f7519c;

    /* renamed from: d */
    private final Provider<AccountApi> f7520d;

    /* renamed from: e */
    private final Provider<C7547h> f7521e;

    /* renamed from: f */
    private final Provider<C2776h> f7522f;

    public C2769c(Provider<Optional<C2760a>> provider, Provider<C2771e> provider2, Provider<BamIdentityApi> provider3, Provider<AccountApi> provider4, Provider<C7547h> provider5, Provider<C2776h> provider6) {
        this.f7517a = provider;
        this.f7518b = provider2;
        this.f7519c = provider3;
        this.f7520d = provider4;
        this.f7521e = provider5;
        this.f7522f = provider6;
    }

    /* renamed from: a */
    public static C2769c m10425a(Provider<Optional<C2760a>> provider, Provider<C2771e> provider2, Provider<BamIdentityApi> provider3, Provider<AccountApi> provider4, Provider<C7547h> provider5, Provider<C2776h> provider6) {
        C2769c cVar = new C2769c(provider, provider2, provider3, provider4, provider5, provider6);
        return cVar;
    }

    public C2763b get() {
        C2763b bVar = new C2763b((Optional) this.f7517a.get(), (C2771e) this.f7518b.get(), (BamIdentityApi) this.f7519c.get(), (AccountApi) this.f7520d.get(), (C7547h) this.f7521e.get(), (C2776h) this.f7522f.get());
        return bVar;
    }
}
