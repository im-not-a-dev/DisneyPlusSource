package com.bamtechmedia.dominguez.main.startup;

import com.bamtech.sdk4.Session;
import com.bamtechmedia.dominguez.main.p235x.C6234e;
import com.bamtechmedia.dominguez.profiles.C6667g1;
import javax.inject.Provider;
import p512h.p515d.C11895c;
import p520io.reactivex.Single;

/* renamed from: com.bamtechmedia.dominguez.main.startup.i */
/* compiled from: OfflineAppInitialization_Factory */
public final class C6195i implements C11895c<C6188h> {

    /* renamed from: a */
    private final Provider<Single<Session>> f14200a;

    /* renamed from: b */
    private final Provider<C6667g1> f14201b;

    /* renamed from: c */
    private final Provider<C6234e> f14202c;

    public C6195i(Provider<Single<Session>> provider, Provider<C6667g1> provider2, Provider<C6234e> provider3) {
        this.f14200a = provider;
        this.f14201b = provider2;
        this.f14202c = provider3;
    }

    /* renamed from: a */
    public static C6195i m19666a(Provider<Single<Session>> provider, Provider<C6667g1> provider2, Provider<C6234e> provider3) {
        return new C6195i(provider, provider2, provider3);
    }

    public C6188h get() {
        return new C6188h((Single) this.f14200a.get(), (C6667g1) this.f14201b.get(), (C6234e) this.f14202c.get());
    }
}
