package p163g.p201e.p203b.p319v;

import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: g.e.b.v.m */
/* compiled from: PaywallFeatureLogoutAction_Factory */
public final class C7883m implements C11895c<C7881l> {

    /* renamed from: a */
    private final Provider<C7885o> f17013a;

    public C7883m(Provider<C7885o> provider) {
        this.f17013a = provider;
    }

    /* renamed from: a */
    public static C7883m m23095a(Provider<C7885o> provider) {
        return new C7883m(provider);
    }

    public C7881l get() {
        return new C7881l((C7885o) this.f17013a.get());
    }
}
