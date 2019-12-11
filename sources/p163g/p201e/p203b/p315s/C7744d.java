package p163g.p201e.p203b.p315s;

import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: g.e.b.s.d */
/* compiled from: LandingPageAccessibilityHelper_Factory */
public final class C7744d implements C11895c<C7742c> {

    /* renamed from: a */
    private final Provider<Boolean> f16811a;

    public C7744d(Provider<Boolean> provider) {
        this.f16811a = provider;
    }

    /* renamed from: a */
    public static C7744d m22807a(Provider<Boolean> provider) {
        return new C7744d(provider);
    }

    public C7742c get() {
        return new C7742c(((Boolean) this.f16811a.get()).booleanValue());
    }
}
