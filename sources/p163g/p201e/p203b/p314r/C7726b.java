package p163g.p201e.p203b.p314r;

import androidx.fragment.app.C0532d;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: g.e.b.r.b */
/* compiled from: BackgroundHelperImpl_Factory */
public final class C7726b implements C11895c<C7720a> {

    /* renamed from: a */
    private final Provider<Boolean> f16789a;

    /* renamed from: b */
    private final Provider<C7727c> f16790b;

    /* renamed from: c */
    private final Provider<C0532d> f16791c;

    public C7726b(Provider<Boolean> provider, Provider<C7727c> provider2, Provider<C0532d> provider3) {
        this.f16789a = provider;
        this.f16790b = provider2;
        this.f16791c = provider3;
    }

    /* renamed from: a */
    public static C7726b m22779a(Provider<Boolean> provider, Provider<C7727c> provider2, Provider<C0532d> provider3) {
        return new C7726b(provider, provider2, provider3);
    }

    public C7720a get() {
        return new C7720a(((Boolean) this.f16789a.get()).booleanValue(), (C7727c) this.f16790b.get(), (C0532d) this.f16791c.get());
    }
}
