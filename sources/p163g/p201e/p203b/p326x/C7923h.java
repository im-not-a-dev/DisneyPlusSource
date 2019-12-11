package p163g.p201e.p203b.p326x;

import javax.inject.Provider;
import p163g.p201e.p203b.p319v.C7873f;
import p512h.p515d.C11895c;

/* renamed from: g.e.b.x.h */
/* compiled from: GoogleMarketFactory_Factory */
public final class C7923h implements C11895c<C7922g> {

    /* renamed from: a */
    private final Provider<Boolean> f17060a;

    /* renamed from: b */
    private final Provider<Boolean> f17061b;

    /* renamed from: c */
    private final Provider<C7873f> f17062c;

    public C7923h(Provider<Boolean> provider, Provider<Boolean> provider2, Provider<C7873f> provider3) {
        this.f17060a = provider;
        this.f17061b = provider2;
        this.f17062c = provider3;
    }

    /* renamed from: a */
    public static C7923h m23145a(Provider<Boolean> provider, Provider<Boolean> provider2, Provider<C7873f> provider3) {
        return new C7923h(provider, provider2, provider3);
    }

    public C7922g get() {
        return new C7922g(((Boolean) this.f17060a.get()).booleanValue(), ((Boolean) this.f17061b.get()).booleanValue(), (C7873f) this.f17062c.get());
    }
}
