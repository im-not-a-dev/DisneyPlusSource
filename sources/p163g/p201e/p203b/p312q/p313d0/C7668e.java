package p163g.p201e.p203b.p312q.p313d0;

import com.bamtechmedia.dominguez.core.p218n.C5792f;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: g.e.b.q.d0.e */
/* compiled from: TabFragmentTvBindingModule_FragmentModule_ProvideTaFragmentViewNavigationFactory */
public final class C7668e implements C11895c<C5792f> {

    /* renamed from: a */
    private final Provider<C7664b> f16703a;

    public C7668e(Provider<C7664b> provider) {
        this.f16703a = provider;
    }

    /* renamed from: a */
    public static C7668e m22667a(Provider<C7664b> provider) {
        return new C7668e(provider);
    }

    /* renamed from: a */
    public static C5792f m22666a(C7664b bVar) {
        C5792f a = C7666c.m22661a(bVar);
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public C5792f get() {
        return m22666a((C7664b) this.f16703a.get());
    }
}
