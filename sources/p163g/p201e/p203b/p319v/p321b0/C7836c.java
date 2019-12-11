package p163g.p201e.p203b.p319v.p321b0;

import com.bamtechmedia.dominguez.core.p218n.C5773a;
import javax.inject.Provider;
import p163g.p201e.p203b.p319v.p321b0.C7831a.C7833b;
import p512h.p515d.C11895c;

/* renamed from: g.e.b.v.b0.c */
/* compiled from: IapSetupFragment_Helper_Factory */
public final class C7836c implements C11895c<C7833b> {

    /* renamed from: a */
    private final Provider<C5773a> f16938a;

    public C7836c(Provider<C5773a> provider) {
        this.f16938a = provider;
    }

    /* renamed from: a */
    public static C7836c m22951a(Provider<C5773a> provider) {
        return new C7836c(provider);
    }

    public C7833b get() {
        return new C7833b((C5773a) this.f16938a.get());
    }
}
