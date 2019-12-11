package p163g.p201e.p203b.p408f0;

import android.content.Context;
import com.bamtechmedia.dominguez.core.p218n.C5773a;
import javax.inject.Provider;
import p163g.p201e.p203b.p299m.C7547h;
import p512h.p515d.C11895c;

/* renamed from: g.e.b.f0.f */
/* compiled from: WebRouterImpl_Factory */
public final class C10615f implements C11895c<C10612e> {

    /* renamed from: a */
    private final Provider<Context> f25059a;

    /* renamed from: b */
    private final Provider<C5773a> f25060b;

    /* renamed from: c */
    private final Provider<C7547h> f25061c;

    public C10615f(Provider<Context> provider, Provider<C5773a> provider2, Provider<C7547h> provider3) {
        this.f25059a = provider;
        this.f25060b = provider2;
        this.f25061c = provider3;
    }

    /* renamed from: a */
    public static C10615f m33344a(Provider<Context> provider, Provider<C5773a> provider2, Provider<C7547h> provider3) {
        return new C10615f(provider, provider2, provider3);
    }

    public C10612e get() {
        return new C10612e((Context) this.f25059a.get(), (C5773a) this.f25060b.get(), (C7547h) this.f25061c.get());
    }
}
