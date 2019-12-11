package p163g.p201e.p203b.p275a0.p276k;

import com.bamtechmedia.dominguez.config.C3572r0;
import javax.inject.Provider;
import p163g.p201e.p203b.p275a0.C7152e;
import p512h.p515d.C11895c;

/* renamed from: g.e.b.a0.k.d */
/* compiled from: HttpRipcutUriFactory_Factory */
public final class C7174d implements C11895c<C7172c> {

    /* renamed from: a */
    private final Provider<C3572r0> f15855a;

    /* renamed from: b */
    private final Provider<C7152e> f15856b;

    public C7174d(Provider<C3572r0> provider, Provider<C7152e> provider2) {
        this.f15855a = provider;
        this.f15856b = provider2;
    }

    /* renamed from: a */
    public static C7174d m21739a(Provider<C3572r0> provider, Provider<C7152e> provider2) {
        return new C7174d(provider, provider2);
    }

    public C7172c get() {
        return new C7172c((C3572r0) this.f15855a.get(), (C7152e) this.f15856b.get());
    }
}
