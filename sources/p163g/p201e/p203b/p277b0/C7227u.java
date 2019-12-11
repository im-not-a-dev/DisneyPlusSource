package p163g.p201e.p203b.p277b0;

import javax.inject.Provider;
import p163g.p500m.p501a.C11760v;
import p512h.p515d.C11895c;

/* renamed from: g.e.b.b0.u */
/* compiled from: MoshiGraphQlResponseConverter_Factory */
public final class C7227u implements C11895c<C7226t> {

    /* renamed from: a */
    private final Provider<C11760v> f15953a;

    public C7227u(Provider<C11760v> provider) {
        this.f15953a = provider;
    }

    /* renamed from: a */
    public static C7227u m21840a(Provider<C11760v> provider) {
        return new C7227u(provider);
    }

    public C7226t get() {
        return new C7226t((C11760v) this.f15953a.get());
    }
}
