package p163g.p201e.p203b.p278h.p282n;

import javax.inject.Provider;
import p163g.p201e.p203b.p278h.p280l.C7252a;
import p512h.p515d.C11895c;

/* renamed from: g.e.b.h.n.d */
/* compiled from: TvCtvActivatorImpl_Factory */
public final class C7283d implements C11895c<C7281c> {

    /* renamed from: a */
    private final Provider<C7252a> f16024a;

    public C7283d(Provider<C7252a> provider) {
        this.f16024a = provider;
    }

    /* renamed from: a */
    public static C7283d m21904a(Provider<C7252a> provider) {
        return new C7283d(provider);
    }

    public C7281c get() {
        return new C7281c((C7252a) this.f16024a.get());
    }
}
