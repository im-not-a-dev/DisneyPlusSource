package p163g.p201e.p203b.p312q;

import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: g.e.b.q.m */
/* compiled from: GlobalNavTvBindingModule_GlobalNavFragmentModule_ProvideMainHostRouterFactory */
public final class C7694m implements C11895c<C7687h> {

    /* renamed from: a */
    private final Provider<C7702t> f16737a;

    public C7694m(Provider<C7702t> provider) {
        this.f16737a = provider;
    }

    /* renamed from: a */
    public static C7694m m22719a(Provider<C7702t> provider) {
        return new C7694m(provider);
    }

    /* renamed from: a */
    public static C7687h m22718a(C7702t tVar) {
        C7687h b = C7692a.m22715b(tVar);
        C11897e.m38130a(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }

    public C7687h get() {
        return m22718a((C7702t) this.f16737a.get());
    }
}
