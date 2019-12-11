package p163g.p201e.p203b.p319v.p321b0;

import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: g.e.b.v.b0.h */
/* compiled from: PaywallFragmentFactoryImpl_Factory */
public final class C7854h implements C11895c<C7853g> {

    /* renamed from: a */
    private final Provider<Boolean> f16970a;

    public C7854h(Provider<Boolean> provider) {
        this.f16970a = provider;
    }

    /* renamed from: a */
    public static C7854h m22998a(Provider<Boolean> provider) {
        return new C7854h(provider);
    }

    public C7853g get() {
        return new C7853g(((Boolean) this.f16970a.get()).booleanValue());
    }
}
