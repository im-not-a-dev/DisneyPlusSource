package p163g.p201e.p203b.p277b0;

import com.bamtech.sdk4.session.SessionInfo;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;
import p520io.reactivex.Single;

/* renamed from: g.e.b.b0.j */
/* compiled from: FeatureSdkModule_SessionInfoOnceFactory */
public final class C7211j implements C11895c<Single<SessionInfo>> {

    /* renamed from: a */
    private final Provider<C7195c0> f15934a;

    public C7211j(Provider<C7195c0> provider) {
        this.f15934a = provider;
    }

    /* renamed from: a */
    public static C7211j m21812a(Provider<C7195c0> provider) {
        return new C7211j(provider);
    }

    /* renamed from: a */
    public static Single<SessionInfo> m21813a(C7195c0 c0Var) {
        Single<SessionInfo> a = C7194c.m21775a(c0Var);
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public Single<SessionInfo> get() {
        return m21813a((C7195c0) this.f15934a.get());
    }
}
