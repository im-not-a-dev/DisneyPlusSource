package p163g.p201e.p203b.p319v;

import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: g.e.b.v.k */
/* compiled from: PaywallFeatureLoginAction_Factory */
public final class C7880k implements C11895c<C7878j> {

    /* renamed from: a */
    private final Provider<C7900q> f17009a;

    public C7880k(Provider<C7900q> provider) {
        this.f17009a = provider;
    }

    /* renamed from: a */
    public static C7880k m23090a(Provider<C7900q> provider) {
        return new C7880k(provider);
    }

    public C7878j get() {
        return new C7878j((C7900q) this.f17009a.get());
    }
}
