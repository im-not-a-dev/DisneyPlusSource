package p163g.p201e.p203b.p277b0;

import com.bamtech.sdk4.useractivity.UserActivityApi;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: g.e.b.b0.n */
/* compiled from: FeatureSdkModule_UserActivityApiFactory */
public final class C7215n implements C11895c<UserActivityApi> {

    /* renamed from: a */
    private final Provider<C7234z> f15938a;

    public C7215n(Provider<C7234z> provider) {
        this.f15938a = provider;
    }

    /* renamed from: a */
    public static C7215n m21821a(Provider<C7234z> provider) {
        return new C7215n(provider);
    }

    /* renamed from: a */
    public static UserActivityApi m21820a(C7234z zVar) {
        UserActivityApi g = C7194c.m21783g(zVar);
        C11897e.m38130a(g, "Cannot return null from a non-@Nullable @Provides method");
        return g;
    }

    public UserActivityApi get() {
        return m21820a((C7234z) this.f15938a.get());
    }
}
