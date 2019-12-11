package p163g.p201e.p203b.p278h;

import com.bamtech.sdk4.Session;
import com.bamtech.sdk4.account.AccountApi;
import com.bamtech.sdk4.identity.bam.BamIdentityApi;
import com.bamtechmedia.dominguez.auth.p061o0.C2740b;
import com.bamtechmedia.dominguez.auth.p065q0.C2783b;
import com.bamtechmedia.dominguez.ctvactivation.api.C5892c;
import javax.inject.Provider;
import p163g.p201e.p203b.p278h.p279k.C7246a;
import p163g.p201e.p203b.p278h.p282n.C7260a;
import p163g.p201e.p203b.p299m.C7547h;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;
import p520io.reactivex.Single;

/* renamed from: g.e.b.h.f */
/* compiled from: FeatureTvCtvActivationModule_ProvideRequesterViewModelFactory */
public final class C7241f implements C11895c<C7260a> {

    /* renamed from: a */
    private final Provider<Single<Session>> f15960a;

    /* renamed from: b */
    private final Provider<C5892c> f15961b;

    /* renamed from: c */
    private final Provider<BamIdentityApi> f15962c;

    /* renamed from: d */
    private final Provider<AccountApi> f15963d;

    /* renamed from: e */
    private final Provider<C2783b> f15964e;

    /* renamed from: f */
    private final Provider<C2740b> f15965f;

    /* renamed from: g */
    private final Provider<C7547h> f15966g;

    /* renamed from: h */
    private final Provider<C7246a> f15967h;

    public C7241f(Provider<Single<Session>> provider, Provider<C5892c> provider2, Provider<BamIdentityApi> provider3, Provider<AccountApi> provider4, Provider<C2783b> provider5, Provider<C2740b> provider6, Provider<C7547h> provider7, Provider<C7246a> provider8) {
        this.f15960a = provider;
        this.f15961b = provider2;
        this.f15962c = provider3;
        this.f15963d = provider4;
        this.f15964e = provider5;
        this.f15965f = provider6;
        this.f15966g = provider7;
        this.f15967h = provider8;
    }

    /* renamed from: a */
    public static C7241f m21850a(Provider<Single<Session>> provider, Provider<C5892c> provider2, Provider<BamIdentityApi> provider3, Provider<AccountApi> provider4, Provider<C2783b> provider5, Provider<C2740b> provider6, Provider<C7547h> provider7, Provider<C7246a> provider8) {
        C7241f fVar = new C7241f(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
        return fVar;
    }

    /* renamed from: a */
    public static C7260a m21851a(Single<Session> single, C5892c cVar, BamIdentityApi bamIdentityApi, AccountApi accountApi, C2783b bVar, C2740b bVar2, C7547h hVar, C7246a aVar) {
        C7260a a = C7237c.m21847a(single, cVar, bamIdentityApi, accountApi, bVar, bVar2, hVar, aVar);
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public C7260a get() {
        return m21851a((Single) this.f15960a.get(), (C5892c) this.f15961b.get(), (BamIdentityApi) this.f15962c.get(), (AccountApi) this.f15963d.get(), (C2783b) this.f15964e.get(), (C2740b) this.f15965f.get(), (C7547h) this.f15966g.get(), (C7246a) this.f15967h.get());
    }
}
