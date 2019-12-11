package p163g.p201e.p203b.p278h.p279k;

import com.bamtechmedia.dominguez.core.p218n.C5773a;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: g.e.b.h.k.b */
/* compiled from: CtvActivationRouter_Factory */
public final class C7247b implements C11895c<C7246a> {

    /* renamed from: a */
    private final Provider<C5773a> f15975a;

    public C7247b(Provider<C5773a> provider) {
        this.f15975a = provider;
    }

    /* renamed from: a */
    public static C7247b m21853a(Provider<C5773a> provider) {
        return new C7247b(provider);
    }

    public C7246a get() {
        return new C7246a((C5773a) this.f15975a.get());
    }
}
