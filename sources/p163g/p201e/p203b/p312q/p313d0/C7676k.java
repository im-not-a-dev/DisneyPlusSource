package p163g.p201e.p203b.p312q.p313d0;

import com.bamtechmedia.dominguez.collections.C3330h;
import com.bamtechmedia.dominguez.core.p218n.C5792f;
import com.bamtechmedia.dominguez.playback.p236l.C6334b;
import javax.inject.Provider;
import p163g.p201e.p203b.p287k.p293k.C7396f;
import p163g.p201e.p203b.p327y.p328g.C7931b;
import p512h.p515d.C11895c;

/* renamed from: g.e.b.q.d0.k */
/* compiled from: TabRouterTvImpl_Factory */
public final class C7676k implements C11895c<C7674j> {

    /* renamed from: a */
    private final Provider<C5792f> f16711a;

    /* renamed from: b */
    private final Provider<C6334b> f16712b;

    /* renamed from: c */
    private final Provider<C7396f> f16713c;

    /* renamed from: d */
    private final Provider<C3330h> f16714d;

    /* renamed from: e */
    private final Provider<C7931b> f16715e;

    public C7676k(Provider<C5792f> provider, Provider<C6334b> provider2, Provider<C7396f> provider3, Provider<C3330h> provider4, Provider<C7931b> provider5) {
        this.f16711a = provider;
        this.f16712b = provider2;
        this.f16713c = provider3;
        this.f16714d = provider4;
        this.f16715e = provider5;
    }

    /* renamed from: a */
    public static C7676k m22687a(Provider<C5792f> provider, Provider<C6334b> provider2, Provider<C7396f> provider3, Provider<C3330h> provider4, Provider<C7931b> provider5) {
        C7676k kVar = new C7676k(provider, provider2, provider3, provider4, provider5);
        return kVar;
    }

    public C7674j get() {
        C7674j jVar = new C7674j((C5792f) this.f16711a.get(), (C6334b) this.f16712b.get(), (C7396f) this.f16713c.get(), (C3330h) this.f16714d.get(), (C7931b) this.f16715e.get());
        return jVar;
    }
}
