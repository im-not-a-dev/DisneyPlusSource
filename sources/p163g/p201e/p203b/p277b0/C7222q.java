package p163g.p201e.p203b.p277b0;

import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: g.e.b.b0.q */
/* compiled from: LazyMediaApi_Factory */
public final class C7222q implements C11895c<C7217p> {

    /* renamed from: a */
    private final Provider<C7195c0> f15946a;

    public C7222q(Provider<C7195c0> provider) {
        this.f15946a = provider;
    }

    /* renamed from: a */
    public static C7222q m21829a(Provider<C7195c0> provider) {
        return new C7222q(provider);
    }

    public C7217p get() {
        return new C7217p((C7195c0) this.f15946a.get());
    }
}
