package p163g.p201e.p203b.p286j;

import javax.inject.Provider;
import p163g.p201e.p203b.p408f0.C10611d;
import p512h.p515d.C11895c;

/* renamed from: g.e.b.j.q */
/* compiled from: UnauthenicatedDeepLinkHandlerImpl_Factory */
public final class C7306q implements C11895c<C7305p> {

    /* renamed from: a */
    private final Provider<C10611d> f16060a;

    /* renamed from: b */
    private final Provider<C7296g> f16061b;

    /* renamed from: c */
    private final Provider<C7287b> f16062c;

    public C7306q(Provider<C10611d> provider, Provider<C7296g> provider2, Provider<C7287b> provider3) {
        this.f16060a = provider;
        this.f16061b = provider2;
        this.f16062c = provider3;
    }

    /* renamed from: a */
    public static C7306q m21943a(Provider<C10611d> provider, Provider<C7296g> provider2, Provider<C7287b> provider3) {
        return new C7306q(provider, provider2, provider3);
    }

    public C7305p get() {
        return new C7305p((C10611d) this.f16060a.get(), (C7296g) this.f16061b.get(), (C7287b) this.f16062c.get());
    }
}
