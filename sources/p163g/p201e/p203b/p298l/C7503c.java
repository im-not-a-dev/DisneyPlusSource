package p163g.p201e.p203b.p298l;

import com.bamtechmedia.dominguez.config.C3524e;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: g.e.b.l.c */
/* compiled from: FreeTrialConfig_Factory */
public final class C7503c implements C11895c<C7501b> {

    /* renamed from: a */
    private final Provider<C3524e> f16463a;

    public C7503c(Provider<C3524e> provider) {
        this.f16463a = provider;
    }

    /* renamed from: a */
    public static C7503c m22395a(Provider<C3524e> provider) {
        return new C7503c(provider);
    }

    public C7501b get() {
        return new C7501b((C3524e) this.f16463a.get());
    }
}
