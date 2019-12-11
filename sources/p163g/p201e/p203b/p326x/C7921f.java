package p163g.p201e.p203b.p326x;

import com.bamtechmedia.dominguez.config.C3524e;
import javax.inject.Provider;
import p163g.p201e.p203b.p405c0.C10562d;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;
import p520io.reactivex.Single;

/* renamed from: g.e.b.x.f */
/* compiled from: FeaturePlatformModule_SmartLockConfigOnceFactory */
public final class C7921f implements C11895c<Single<C10562d>> {

    /* renamed from: a */
    private final Provider<Single<C3524e>> f17056a;

    public C7921f(Provider<Single<C3524e>> provider) {
        this.f17056a = provider;
    }

    /* renamed from: a */
    public static C7921f m23142a(Provider<Single<C3524e>> provider) {
        return new C7921f(provider);
    }

    /* renamed from: a */
    public static Single<C10562d> m23143a(Single<C3524e> single) {
        Single<C10562d> a = C7917b.m23133a(single);
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public Single<C10562d> get() {
        return m23143a((Single) this.f17056a.get());
    }
}
