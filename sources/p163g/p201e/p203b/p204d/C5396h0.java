package p163g.p201e.p203b.p204d;

import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: g.e.b.d.h0 */
/* compiled from: ConvivaCountryCodeContributor_Factory */
public final class C5396h0 implements C11895c<C5390g0> {

    /* renamed from: a */
    private final Provider<C5398i0> f12909a;

    public C5396h0(Provider<C5398i0> provider) {
        this.f12909a = provider;
    }

    /* renamed from: a */
    public static C5396h0 m18143a(Provider<C5398i0> provider) {
        return new C5396h0(provider);
    }

    public C5390g0 get() {
        return new C5390g0((C5398i0) this.f12909a.get());
    }
}
