package p163g.p201e.p203b.p277b0;

import com.bamtech.sdk4.subscription.SubscriptionApi;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: g.e.b.b0.m */
/* compiled from: FeatureSdkModule_SubscriptionApiFactory */
public final class C7214m implements C11895c<SubscriptionApi> {

    /* renamed from: a */
    private final Provider<C7234z> f15937a;

    public C7214m(Provider<C7234z> provider) {
        this.f15937a = provider;
    }

    /* renamed from: a */
    public static C7214m m21819a(Provider<C7234z> provider) {
        return new C7214m(provider);
    }

    /* renamed from: a */
    public static SubscriptionApi m21818a(C7234z zVar) {
        SubscriptionApi f = C7194c.m21782f(zVar);
        C11897e.m38130a(f, "Cannot return null from a non-@Nullable @Provides method");
        return f;
    }

    public SubscriptionApi get() {
        return m21818a((C7234z) this.f15937a.get());
    }
}
