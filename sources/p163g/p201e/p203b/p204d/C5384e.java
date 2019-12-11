package p163g.p201e.p203b.p204d;

import com.bamtech.sdk4.Session;
import com.bamtech.sdk4.account.AccountApi;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p520io.reactivex.Single;

/* renamed from: g.e.b.d.e */
/* compiled from: AccountLoginAction_Factory */
public final class C5384e implements C11895c<C5377d> {

    /* renamed from: a */
    private final Provider<Single<Session>> f12894a;

    /* renamed from: b */
    private final Provider<AccountApi> f12895b;

    public C5384e(Provider<Single<Session>> provider, Provider<AccountApi> provider2) {
        this.f12894a = provider;
        this.f12895b = provider2;
    }

    /* renamed from: a */
    public static C5384e m18127a(Provider<Single<Session>> provider, Provider<AccountApi> provider2) {
        return new C5384e(provider, provider2);
    }

    public C5377d get() {
        return new C5377d((Single) this.f12894a.get(), (AccountApi) this.f12895b.get());
    }
}
