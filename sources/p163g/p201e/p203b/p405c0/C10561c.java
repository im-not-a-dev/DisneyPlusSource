package p163g.p201e.p203b.p405c0;

import android.content.Context;
import com.bamtechmedia.dominguez.auth.p064p0.C2775g;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p520io.reactivex.Single;

/* renamed from: g.e.b.c0.c */
/* compiled from: SmartLockAutoLogin_Factory */
public final class C10561c implements C11895c<C10544a> {

    /* renamed from: a */
    private final Provider<Context> f25008a;

    /* renamed from: b */
    private final Provider<Single<C10562d>> f25009b;

    /* renamed from: c */
    private final Provider<C2775g> f25010c;

    public C10561c(Provider<Context> provider, Provider<Single<C10562d>> provider2, Provider<C2775g> provider3) {
        this.f25008a = provider;
        this.f25009b = provider2;
        this.f25010c = provider3;
    }

    /* renamed from: a */
    public static C10561c m33295a(Provider<Context> provider, Provider<Single<C10562d>> provider2, Provider<C2775g> provider3) {
        return new C10561c(provider, provider2, provider3);
    }

    public C10544a get() {
        return new C10544a((Context) this.f25008a.get(), (Single) this.f25009b.get(), (C2775g) this.f25010c.get());
    }
}
