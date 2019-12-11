package p163g.p201e.p203b.p275a0;

import com.bamtechmedia.dominguez.config.C3524e;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: g.e.b.a0.f */
/* compiled from: RipcutConfig_Factory */
public final class C7158f implements C11895c<C7152e> {

    /* renamed from: a */
    private final Provider<C3524e> f15812a;

    public C7158f(Provider<C3524e> provider) {
        this.f15812a = provider;
    }

    /* renamed from: a */
    public static C7158f m21687a(Provider<C3524e> provider) {
        return new C7158f(provider);
    }

    public C7152e get() {
        return new C7152e((C3524e) this.f15812a.get());
    }
}
