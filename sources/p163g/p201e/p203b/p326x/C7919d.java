package p163g.p201e.p203b.p326x;

import com.bamnet.iap.Market;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: g.e.b.x.d */
/* compiled from: FeaturePlatformModule_MarketFactory */
public final class C7919d implements C11895c<Market> {

    /* renamed from: a */
    private final Provider<C7922g> f17054a;

    public C7919d(Provider<C7922g> provider) {
        this.f17054a = provider;
    }

    /* renamed from: a */
    public static C7919d m23139a(Provider<C7922g> provider) {
        return new C7919d(provider);
    }

    /* renamed from: a */
    public static Market m23138a(C7922g gVar) {
        Market a = C7917b.m23132a(gVar);
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public Market get() {
        return m23138a((C7922g) this.f17054a.get());
    }
}
