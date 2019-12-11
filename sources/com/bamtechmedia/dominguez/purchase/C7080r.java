package com.bamtechmedia.dominguez.purchase;

import com.bamtech.sdk4.paywall.PaywallApi;
import javax.inject.Provider;
import p163g.p201e.p203b.p319v.C7873f;
import p163g.p201e.p203b.p319v.C7900q;
import p163g.p201e.p203b.p319v.p321b0.C7835b;
import p512h.p515d.C11895c;
import p520io.reactivex.C11969r;

/* renamed from: com.bamtechmedia.dominguez.purchase.r */
/* compiled from: PaywallRepositoryImpl_Factory */
public final class C7080r implements C11895c<C7062q> {

    /* renamed from: a */
    private final Provider<PaywallApi> f15692a;

    /* renamed from: b */
    private final Provider<C7873f> f15693b;

    /* renamed from: c */
    private final Provider<C11969r> f15694c;

    /* renamed from: d */
    private final Provider<C11969r> f15695d;

    /* renamed from: e */
    private final Provider<C7900q> f15696e;

    /* renamed from: f */
    private final Provider<C7835b> f15697f;

    /* renamed from: g */
    private final Provider<Boolean> f15698g;

    public C7080r(Provider<PaywallApi> provider, Provider<C7873f> provider2, Provider<C11969r> provider3, Provider<C11969r> provider4, Provider<C7900q> provider5, Provider<C7835b> provider6, Provider<Boolean> provider7) {
        this.f15692a = provider;
        this.f15693b = provider2;
        this.f15694c = provider3;
        this.f15695d = provider4;
        this.f15696e = provider5;
        this.f15697f = provider6;
        this.f15698g = provider7;
    }

    /* renamed from: a */
    public static C7080r m21453a(Provider<PaywallApi> provider, Provider<C7873f> provider2, Provider<C11969r> provider3, Provider<C11969r> provider4, Provider<C7900q> provider5, Provider<C7835b> provider6, Provider<Boolean> provider7) {
        C7080r rVar = new C7080r(provider, provider2, provider3, provider4, provider5, provider6, provider7);
        return rVar;
    }

    public C7062q get() {
        C7062q qVar = new C7062q((PaywallApi) this.f15692a.get(), (C7873f) this.f15693b.get(), (C11969r) this.f15694c.get(), (C11969r) this.f15695d.get(), (C7900q) this.f15696e.get(), (C7835b) this.f15697f.get(), ((Boolean) this.f15698g.get()).booleanValue());
        return qVar;
    }
}
