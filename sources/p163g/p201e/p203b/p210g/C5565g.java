package p163g.p201e.p203b.p210g;

import javax.inject.Provider;
import okhttp3.OkHttpClient;
import p512h.p515d.C11895c;

/* renamed from: g.e.b.g.g */
/* compiled from: NetworkConnectivityCheck_Factory */
public final class C5565g implements C11895c<C5562f> {

    /* renamed from: a */
    private final Provider<OkHttpClient> f13123a;

    public C5565g(Provider<OkHttpClient> provider) {
        this.f13123a = provider;
    }

    /* renamed from: a */
    public static C5565g m18369a(Provider<OkHttpClient> provider) {
        return new C5565g(provider);
    }

    public C5562f get() {
        return new C5562f(this.f13123a);
    }
}
