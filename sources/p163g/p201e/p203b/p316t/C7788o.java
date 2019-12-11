package p163g.p201e.p203b.p316t;

import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: g.e.b.t.o */
/* compiled from: OptionsTvItemProvider_Factory */
public final class C7788o implements C11895c<C7787n> {

    /* renamed from: a */
    private final Provider<Boolean> f16867a;

    public C7788o(Provider<Boolean> provider) {
        this.f16867a = provider;
    }

    /* renamed from: a */
    public static C7788o m22873a(Provider<Boolean> provider) {
        return new C7788o(provider);
    }

    public C7787n get() {
        return new C7787n(((Boolean) this.f16867a.get()).booleanValue());
    }
}
