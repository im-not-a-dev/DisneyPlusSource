package p163g.p201e.p203b.p319v;

import android.content.res.Resources;
import com.bamtechmedia.dominguez.config.C3572r0;
import javax.inject.Provider;
import p163g.p201e.p203b.p275a0.C7159g;
import p512h.p515d.C11895c;
import p520io.reactivex.C11969r;

/* renamed from: g.e.b.v.e */
/* compiled from: OnboardingImageLoaderImpl_Factory */
public final class C7872e implements C11895c<C7864d> {

    /* renamed from: a */
    private final Provider<Resources> f16999a;

    /* renamed from: b */
    private final Provider<C3572r0> f17000b;

    /* renamed from: c */
    private final Provider<C7159g> f17001c;

    /* renamed from: d */
    private final Provider<C11969r> f17002d;

    public C7872e(Provider<Resources> provider, Provider<C3572r0> provider2, Provider<C7159g> provider3, Provider<C11969r> provider4) {
        this.f16999a = provider;
        this.f17000b = provider2;
        this.f17001c = provider3;
        this.f17002d = provider4;
    }

    /* renamed from: a */
    public static C7872e m23066a(Provider<Resources> provider, Provider<C3572r0> provider2, Provider<C7159g> provider3, Provider<C11969r> provider4) {
        return new C7872e(provider, provider2, provider3, provider4);
    }

    public C7864d get() {
        return new C7864d((Resources) this.f16999a.get(), this.f17000b, (C7159g) this.f17001c.get(), (C11969r) this.f17002d.get());
    }
}
