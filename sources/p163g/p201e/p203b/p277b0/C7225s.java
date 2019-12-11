package p163g.p201e.p203b.p277b0;

import com.bamtechmedia.dominguez.config.C3524e;
import com.bamtechmedia.dominguez.core.utils.C5862q0;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: g.e.b.b0.s */
/* compiled from: MediaCapabilitiesConfig_Factory */
public final class C7225s implements C11895c<C7223r> {

    /* renamed from: a */
    private final Provider<C3524e> f15950a;

    /* renamed from: b */
    private final Provider<C5862q0> f15951b;

    public C7225s(Provider<C3524e> provider, Provider<C5862q0> provider2) {
        this.f15950a = provider;
        this.f15951b = provider2;
    }

    /* renamed from: a */
    public static C7225s m21839a(Provider<C3524e> provider, Provider<C5862q0> provider2) {
        return new C7225s(provider, provider2);
    }

    public C7223r get() {
        return new C7223r((C3524e) this.f15950a.get(), (C5862q0) this.f15951b.get());
    }
}
