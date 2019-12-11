package p163g.p201e.p203b.p314r;

import androidx.fragment.app.C0532d;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p520io.reactivex.C11969r;

/* renamed from: g.e.b.r.e */
/* compiled from: BackgroundLoaderImpl_Factory */
public final class C7735e implements C11895c<C7728d> {

    /* renamed from: a */
    private final Provider<C0532d> f16804a;

    /* renamed from: b */
    private final Provider<C11969r> f16805b;

    public C7735e(Provider<C0532d> provider, Provider<C11969r> provider2) {
        this.f16804a = provider;
        this.f16805b = provider2;
    }

    /* renamed from: a */
    public static C7735e m22798a(Provider<C0532d> provider, Provider<C11969r> provider2) {
        return new C7735e(provider, provider2);
    }

    public C7728d get() {
        return new C7728d((C0532d) this.f16804a.get(), (C11969r) this.f16805b.get());
    }
}
