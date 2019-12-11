package p163g.p201e.p203b.p277b0;

import com.bamtech.sdk4.session.SessionState;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;
import p520io.reactivex.Single;

/* renamed from: g.e.b.b0.l */
/* compiled from: FeatureSdkModule_SessionStateOnceFactory */
public final class C7213l implements C11895c<Single<SessionState>> {

    /* renamed from: a */
    private final Provider<C7195c0> f15936a;

    public C7213l(Provider<C7195c0> provider) {
        this.f15936a = provider;
    }

    /* renamed from: a */
    public static C7213l m21816a(Provider<C7195c0> provider) {
        return new C7213l(provider);
    }

    /* renamed from: a */
    public static Single<SessionState> m21817a(C7195c0 c0Var) {
        Single<SessionState> c = C7194c.m21779c(c0Var);
        C11897e.m38130a(c, "Cannot return null from a non-@Nullable @Provides method");
        return c;
    }

    public Single<SessionState> get() {
        return m21817a((C7195c0) this.f15936a.get());
    }
}
