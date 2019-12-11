package com.bamtechmedia.dominguez.analytics.p056n0;

import android.content.Context;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.analytics.n0.d */
/* compiled from: GlimpseExtrasGenerator_Factory */
public final class C2427d implements C11895c<C2426c> {

    /* renamed from: a */
    private final Provider<Context> f6690a;

    public C2427d(Provider<Context> provider) {
        this.f6690a = provider;
    }

    /* renamed from: a */
    public static C2427d m8987a(Provider<Context> provider) {
        return new C2427d(provider);
    }

    public C2426c get() {
        return new C2426c((Context) this.f6690a.get());
    }
}
