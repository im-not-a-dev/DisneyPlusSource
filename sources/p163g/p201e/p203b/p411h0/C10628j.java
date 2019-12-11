package p163g.p201e.p203b.p411h0;

import javax.inject.Provider;
import p163g.p201e.p203b.p319v.C7873f;
import p163g.p201e.p203b.p319v.C7885o;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: g.e.b.h0.j */
/* compiled from: WelcomeBindingModule_WelcomeFragmentModule_ProvideWelcomeViewModelFactory */
public final class C10628j implements C11895c<C10640n> {

    /* renamed from: a */
    private final Provider<C10629k> f25079a;

    /* renamed from: b */
    private final Provider<C7885o> f25080b;

    /* renamed from: c */
    private final Provider<C7873f> f25081c;

    public C10628j(Provider<C10629k> provider, Provider<C7885o> provider2, Provider<C7873f> provider3) {
        this.f25079a = provider;
        this.f25080b = provider2;
        this.f25081c = provider3;
    }

    /* renamed from: a */
    public static C10628j m33350a(Provider<C10629k> provider, Provider<C7885o> provider2, Provider<C7873f> provider3) {
        return new C10628j(provider, provider2, provider3);
    }

    /* renamed from: a */
    public static C10640n m33351a(C10629k kVar, C7885o oVar, C7873f fVar) {
        C10640n a = C10625h.m33348a(kVar, oVar, fVar);
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public C10640n get() {
        return m33351a((C10629k) this.f25079a.get(), (C7885o) this.f25080b.get(), (C7873f) this.f25081c.get());
    }
}
