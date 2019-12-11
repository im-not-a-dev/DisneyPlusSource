package com.bamtechmedia.dominguez.main.p235x;

import com.bamtechmedia.dominguez.profiles.C6722l1;
import com.bamtechmedia.dominguez.profiles.C6766q1;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.main.x.c */
/* compiled from: AccountStateUpdater_Factory */
public final class C6218c implements C11895c<C6217b> {

    /* renamed from: a */
    private final Provider<C6234e> f14253a;

    /* renamed from: b */
    private final Provider<C6766q1> f14254b;

    /* renamed from: c */
    private final Provider<C6722l1> f14255c;

    public C6218c(Provider<C6234e> provider, Provider<C6766q1> provider2, Provider<C6722l1> provider3) {
        this.f14253a = provider;
        this.f14254b = provider2;
        this.f14255c = provider3;
    }

    /* renamed from: a */
    public static C6218c m19709a(Provider<C6234e> provider, Provider<C6766q1> provider2, Provider<C6722l1> provider3) {
        return new C6218c(provider, provider2, provider3);
    }

    public C6217b get() {
        return new C6217b((C6234e) this.f14253a.get(), (C6766q1) this.f14254b.get(), (C6722l1) this.f14255c.get());
    }
}
