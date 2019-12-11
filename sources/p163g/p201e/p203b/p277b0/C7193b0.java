package p163g.p201e.p203b.p277b0;

import com.bamtechmedia.dominguez.auth.C2725l0;
import com.bamtechmedia.dominguez.sdk.vpn.C7141a;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: g.e.b.b0.b0 */
/* compiled from: SdkPluginProviderImpl_Factory */
public final class C7193b0 implements C11895c<C7178a0> {

    /* renamed from: a */
    private final Provider<C7195c0> f15900a;

    /* renamed from: b */
    private final Provider<C2725l0> f15901b;

    /* renamed from: c */
    private final Provider<C7141a> f15902c;

    public C7193b0(Provider<C7195c0> provider, Provider<C2725l0> provider2, Provider<C7141a> provider3) {
        this.f15900a = provider;
        this.f15901b = provider2;
        this.f15902c = provider3;
    }

    /* renamed from: a */
    public static C7193b0 m21772a(Provider<C7195c0> provider, Provider<C2725l0> provider2, Provider<C7141a> provider3) {
        return new C7193b0(provider, provider2, provider3);
    }

    public C7178a0 get() {
        return new C7178a0((C7195c0) this.f15900a.get(), (C2725l0) this.f15901b.get(), (C7141a) this.f15902c.get());
    }
}
