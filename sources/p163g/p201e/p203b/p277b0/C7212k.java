package p163g.p201e.p203b.p277b0;

import com.bamtech.sdk4.Session;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;
import p520io.reactivex.Single;

/* renamed from: g.e.b.b0.k */
/* compiled from: FeatureSdkModule_SessionOnceFactory */
public final class C7212k implements C11895c<Single<Session>> {

    /* renamed from: a */
    private final Provider<C7195c0> f15935a;

    public C7212k(Provider<C7195c0> provider) {
        this.f15935a = provider;
    }

    /* renamed from: a */
    public static C7212k m21814a(Provider<C7195c0> provider) {
        return new C7212k(provider);
    }

    /* renamed from: a */
    public static Single<Session> m21815a(C7195c0 c0Var) {
        Single<Session> b = C7194c.m21777b(c0Var);
        C11897e.m38130a(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }

    public Single<Session> get() {
        return m21815a((C7195c0) this.f15935a.get());
    }
}
