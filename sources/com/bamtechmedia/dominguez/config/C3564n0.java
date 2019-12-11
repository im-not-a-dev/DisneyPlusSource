package com.bamtechmedia.dominguez.config;

import android.content.Context;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.config.n0 */
/* compiled from: OverrideConfigResolver_Factory */
public final class C3564n0 implements C11895c<C3561m0> {

    /* renamed from: a */
    private final Provider<Context> f8898a;

    public C3564n0(Provider<Context> provider) {
        this.f8898a = provider;
    }

    /* renamed from: a */
    public static C3564n0 m12010a(Provider<Context> provider) {
        return new C3564n0(provider);
    }

    public C3561m0 get() {
        return new C3561m0((Context) this.f8898a.get());
    }
}
