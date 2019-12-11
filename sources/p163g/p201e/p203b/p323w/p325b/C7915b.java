package p163g.p201e.p203b.p323w.p325b;

import com.bamtechmedia.dominguez.config.C3524e;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: g.e.b.w.b.b */
/* compiled from: PerformanceConfigImpl_Factory */
public final class C7915b implements C11895c<C7913a> {

    /* renamed from: a */
    private final Provider<C3524e> f17051a;

    public C7915b(Provider<C3524e> provider) {
        this.f17051a = provider;
    }

    /* renamed from: a */
    public static C7915b m23131a(Provider<C3524e> provider) {
        return new C7915b(provider);
    }

    public C7913a get() {
        return new C7913a((C3524e) this.f17051a.get());
    }
}
