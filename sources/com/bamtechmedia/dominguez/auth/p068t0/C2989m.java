package com.bamtechmedia.dominguez.auth.p068t0;

import javax.inject.Provider;
import p163g.p171c.p172a.p173a.C4793a;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.auth.t0.m */
/* compiled from: PasswordValidatorImpl_Factory */
public final class C2989m implements C11895c<C2986k> {

    /* renamed from: a */
    private final Provider<C4793a> f7832a;

    public C2989m(Provider<C4793a> provider) {
        this.f7832a = provider;
    }

    /* renamed from: a */
    public static C2989m m10780a(Provider<C4793a> provider) {
        return new C2989m(provider);
    }

    public C2986k get() {
        return new C2986k((C4793a) this.f7832a.get());
    }
}
