package p163g.p201e.p203b.p204d;

import com.bamtech.sdk4.account.AccountApi;
import com.bamtech.sdk4.session.SessionInfo;
import com.bamtech.sdk4.session.SessionState;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p520io.reactivex.Single;

/* renamed from: g.e.b.d.k0 */
/* compiled from: CountryCodeProvider_Factory */
public final class C5405k0 implements C11895c<C5398i0> {

    /* renamed from: a */
    private final Provider<Single<SessionState>> f12920a;

    /* renamed from: b */
    private final Provider<Single<SessionInfo>> f12921b;

    /* renamed from: c */
    private final Provider<AccountApi> f12922c;

    public C5405k0(Provider<Single<SessionState>> provider, Provider<Single<SessionInfo>> provider2, Provider<AccountApi> provider3) {
        this.f12920a = provider;
        this.f12921b = provider2;
        this.f12922c = provider3;
    }

    /* renamed from: a */
    public static C5405k0 m18165a(Provider<Single<SessionState>> provider, Provider<Single<SessionInfo>> provider2, Provider<AccountApi> provider3) {
        return new C5405k0(provider, provider2, provider3);
    }

    public C5398i0 get() {
        return new C5398i0((Single) this.f12920a.get(), (Single) this.f12921b.get(), (AccountApi) this.f12922c.get());
    }
}
