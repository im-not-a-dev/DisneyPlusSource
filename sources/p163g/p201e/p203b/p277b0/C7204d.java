package p163g.p201e.p203b.p277b0;

import com.bamtech.sdk4.account.AccountApi;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: g.e.b.b0.d */
/* compiled from: FeatureSdkModule_AccountApiFactory */
public final class C7204d implements C11895c<AccountApi> {

    /* renamed from: a */
    private final Provider<C7234z> f15921a;

    public C7204d(Provider<C7234z> provider) {
        this.f15921a = provider;
    }

    /* renamed from: a */
    public static C7204d m21801a(Provider<C7234z> provider) {
        return new C7204d(provider);
    }

    /* renamed from: a */
    public static AccountApi m21800a(C7234z zVar) {
        AccountApi a = C7194c.m21773a(zVar);
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public AccountApi get() {
        return m21800a((C7234z) this.f15921a.get());
    }
}
