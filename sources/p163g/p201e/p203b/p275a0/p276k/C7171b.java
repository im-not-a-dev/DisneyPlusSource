package p163g.p201e.p203b.p275a0.p276k;

import com.bamtechmedia.dominguez.ripcut.cache.C7116a;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: g.e.b.a0.k.b */
/* compiled from: CachedRipcutUriFactory_Factory */
public final class C7171b implements C11895c<C7170a> {

    /* renamed from: a */
    private final Provider<C7172c> f15851a;

    /* renamed from: b */
    private final Provider<C7116a> f15852b;

    public C7171b(Provider<C7172c> provider, Provider<C7116a> provider2) {
        this.f15851a = provider;
        this.f15852b = provider2;
    }

    /* renamed from: a */
    public static C7171b m21735a(Provider<C7172c> provider, Provider<C7116a> provider2) {
        return new C7171b(provider, provider2);
    }

    public C7170a get() {
        return new C7170a((C7172c) this.f15851a.get(), (C7116a) this.f15852b.get());
    }
}
