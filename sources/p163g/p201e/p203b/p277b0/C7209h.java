package p163g.p201e.p203b.p277b0;

import com.bamtech.sdk4.content.search.SearchApi;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: g.e.b.b0.h */
/* compiled from: FeatureSdkModule_SearchApiFactory */
public final class C7209h implements C11895c<SearchApi> {

    /* renamed from: a */
    private final Provider<C7234z> f15933a;

    public C7209h(Provider<C7234z> provider) {
        this.f15933a = provider;
    }

    /* renamed from: a */
    public static C7209h m21810a(Provider<C7234z> provider) {
        return new C7209h(provider);
    }

    /* renamed from: a */
    public static SearchApi m21809a(C7234z zVar) {
        SearchApi d = C7194c.m21780d(zVar);
        C11897e.m38130a(d, "Cannot return null from a non-@Nullable @Provides method");
        return d;
    }

    public SearchApi get() {
        return m21809a((C7234z) this.f15933a.get());
    }
}
