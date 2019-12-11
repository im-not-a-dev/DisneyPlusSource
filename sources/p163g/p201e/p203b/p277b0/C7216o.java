package p163g.p201e.p203b.p277b0;

import com.bamtech.sdk4.account.UserProfileApi;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: g.e.b.b0.o */
/* compiled from: FeatureSdkModule_UserProfileApiFactory */
public final class C7216o implements C11895c<UserProfileApi> {

    /* renamed from: a */
    private final Provider<C7234z> f15939a;

    public C7216o(Provider<C7234z> provider) {
        this.f15939a = provider;
    }

    /* renamed from: a */
    public static C7216o m21823a(Provider<C7234z> provider) {
        return new C7216o(provider);
    }

    /* renamed from: a */
    public static UserProfileApi m21822a(C7234z zVar) {
        UserProfileApi h = C7194c.m21784h(zVar);
        C11897e.m38130a(h, "Cannot return null from a non-@Nullable @Provides method");
        return h;
    }

    public UserProfileApi get() {
        return m21822a((C7234z) this.f15939a.get());
    }
}
