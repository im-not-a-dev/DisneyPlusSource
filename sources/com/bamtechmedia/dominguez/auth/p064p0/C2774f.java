package com.bamtechmedia.dominguez.auth.p064p0;

import com.bamtechmedia.dominguez.config.C3558l;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.auth.p0.f */
/* compiled from: DevConfigAutoLogin_Factory */
public final class C2774f implements C11895c<C2771e> {

    /* renamed from: a */
    private final Provider<C3558l> f7528a;

    public C2774f(Provider<C3558l> provider) {
        this.f7528a = provider;
    }

    /* renamed from: a */
    public static C2774f m10432a(Provider<C3558l> provider) {
        return new C2774f(provider);
    }

    public C2771e get() {
        return new C2771e((C3558l) this.f7528a.get());
    }
}
