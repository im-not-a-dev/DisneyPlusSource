package p163g.p201e.p203b.p312q;

import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: g.e.b.q.l */
/* compiled from: GlobalNavTvBindingModule_GlobalNavFragmentModule_KidsModeFactory */
public final class C7693l implements C11895c<Boolean> {

    /* renamed from: a */
    private final Provider<C7702t> f16736a;

    public C7693l(Provider<C7702t> provider) {
        this.f16736a = provider;
    }

    /* renamed from: a */
    public static C7693l m22716a(Provider<C7702t> provider) {
        return new C7693l(provider);
    }

    /* renamed from: a */
    public static boolean m22717a(C7702t tVar) {
        return C7692a.m22714a(tVar);
    }

    public Boolean get() {
        return Boolean.valueOf(m22717a((C7702t) this.f16736a.get()));
    }
}
