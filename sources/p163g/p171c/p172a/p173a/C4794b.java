package p163g.p171c.p172a.p173a;

import com.bamtechmedia.dominguez.config.C3572r0;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: g.c.a.a.b */
/* compiled from: OverrideStrings_Factory */
public final class C4794b implements C11895c<C4793a> {

    /* renamed from: a */
    private final Provider<C3572r0> f11932a;

    public C4794b(Provider<C3572r0> provider) {
        this.f11932a = provider;
    }

    /* renamed from: a */
    public static C4794b m16707a(Provider<C3572r0> provider) {
        return new C4794b(provider);
    }

    public C4793a get() {
        return new C4793a((C3572r0) this.f11932a.get());
    }
}
