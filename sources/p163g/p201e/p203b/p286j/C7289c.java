package p163g.p201e.p203b.p286j;

import com.bamtechmedia.dominguez.config.C3524e;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: g.e.b.j.c */
/* compiled from: DeepLinkConfig_Factory */
public final class C7289c implements C11895c<C7287b> {

    /* renamed from: a */
    private final Provider<C3524e> f16029a;

    public C7289c(Provider<C3524e> provider) {
        this.f16029a = provider;
    }

    /* renamed from: a */
    public static C7289c m21908a(Provider<C3524e> provider) {
        return new C7289c(provider);
    }

    public C7287b get() {
        return new C7287b((C3524e) this.f16029a.get());
    }
}
