package p163g.p201e.p203b.p312q;

import com.bamtechmedia.dominguez.config.C3524e;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: g.e.b.q.d */
/* compiled from: GlobalNavConfig_Factory */
public final class C7662d implements C11895c<C7659c> {

    /* renamed from: a */
    private final Provider<C3524e> f16689a;

    /* renamed from: b */
    private final Provider<Boolean> f16690b;

    public C7662d(Provider<C3524e> provider, Provider<Boolean> provider2) {
        this.f16689a = provider;
        this.f16690b = provider2;
    }

    /* renamed from: a */
    public static C7662d m22653a(Provider<C3524e> provider, Provider<Boolean> provider2) {
        return new C7662d(provider, provider2);
    }

    public C7659c get() {
        return new C7659c((C3524e) this.f16689a.get(), ((Boolean) this.f16690b.get()).booleanValue());
    }
}
