package com.bamtechmedia.dominguez.auth;

import com.bamtechmedia.dominguez.config.C3524e;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.auth.d */
/* compiled from: AuthConfigImpl_Factory */
public final class C2706d implements C11895c<C2704c> {

    /* renamed from: a */
    private final Provider<C3524e> f7462a;

    public C2706d(Provider<C3524e> provider) {
        this.f7462a = provider;
    }

    /* renamed from: a */
    public static C2706d m10341a(Provider<C3524e> provider) {
        return new C2706d(provider);
    }

    public C2704c get() {
        return new C2704c((C3524e) this.f7462a.get());
    }
}
