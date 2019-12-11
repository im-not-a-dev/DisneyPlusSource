package p163g.p201e.p203b.p278h.p280l;

import com.bamtechmedia.dominguez.config.C3524e;
import com.bamtechmedia.dominguez.core.BuildInfo;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: g.e.b.h.l.b */
/* compiled from: CtvActivationConfigImpl_Factory */
public final class C7254b implements C11895c<C7252a> {

    /* renamed from: a */
    private final Provider<C3524e> f15978a;

    /* renamed from: b */
    private final Provider<BuildInfo> f15979b;

    public C7254b(Provider<C3524e> provider, Provider<BuildInfo> provider2) {
        this.f15978a = provider;
        this.f15979b = provider2;
    }

    /* renamed from: a */
    public static C7254b m21865a(Provider<C3524e> provider, Provider<BuildInfo> provider2) {
        return new C7254b(provider, provider2);
    }

    public C7252a get() {
        return new C7252a((C3524e) this.f15978a.get(), (BuildInfo) this.f15979b.get());
    }
}
