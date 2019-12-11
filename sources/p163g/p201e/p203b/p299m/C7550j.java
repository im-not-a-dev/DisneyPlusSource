package p163g.p201e.p203b.p299m;

import com.bamtechmedia.dominguez.core.p218n.C5773a;
import com.bamtechmedia.dominguez.dialogs.tier2.C6062c;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: g.e.b.m.j */
/* compiled from: DialogRouterImpl_Factory */
public final class C7550j implements C11895c<C7548i> {

    /* renamed from: a */
    private final Provider<C5773a> f16558a;

    /* renamed from: b */
    private final Provider<C6062c> f16559b;

    public C7550j(Provider<C5773a> provider, Provider<C6062c> provider2) {
        this.f16558a = provider;
        this.f16559b = provider2;
    }

    /* renamed from: a */
    public static C7550j m22513a(Provider<C5773a> provider, Provider<C6062c> provider2) {
        return new C7550j(provider, provider2);
    }

    public C7548i get() {
        return new C7548i((C5773a) this.f16558a.get(), (C6062c) this.f16559b.get());
    }
}
