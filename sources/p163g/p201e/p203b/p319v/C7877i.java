package p163g.p201e.p203b.p319v;

import com.bamtechmedia.dominguez.config.C3524e;
import com.bamtechmedia.dominguez.core.BuildInfo;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: g.e.b.v.i */
/* compiled from: PaywallConfigImpl_Factory */
public final class C7877i implements C11895c<C7874g> {

    /* renamed from: a */
    private final Provider<C3524e> f17005a;

    /* renamed from: b */
    private final Provider<BuildInfo> f17006b;

    public C7877i(Provider<C3524e> provider, Provider<BuildInfo> provider2) {
        this.f17005a = provider;
        this.f17006b = provider2;
    }

    /* renamed from: a */
    public static C7877i m23087a(Provider<C3524e> provider, Provider<BuildInfo> provider2) {
        return new C7877i(provider, provider2);
    }

    public C7874g get() {
        return new C7874g((C3524e) this.f17005a.get(), (BuildInfo) this.f17006b.get());
    }
}
