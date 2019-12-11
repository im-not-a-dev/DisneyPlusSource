package p163g.p201e.p203b.p277b0;

import com.bamtech.sdk4.identity.bam.BamIdentityApi;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: g.e.b.b0.e */
/* compiled from: FeatureSdkModule_BamIdentityApiFactory */
public final class C7206e implements C11895c<BamIdentityApi> {

    /* renamed from: a */
    private final Provider<C7234z> f15929a;

    public C7206e(Provider<C7234z> provider) {
        this.f15929a = provider;
    }

    /* renamed from: a */
    public static C7206e m21804a(Provider<C7234z> provider) {
        return new C7206e(provider);
    }

    /* renamed from: a */
    public static BamIdentityApi m21803a(C7234z zVar) {
        BamIdentityApi b = C7194c.m21776b(zVar);
        C11897e.m38130a(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }

    public BamIdentityApi get() {
        return m21803a((C7234z) this.f15929a.get());
    }
}
