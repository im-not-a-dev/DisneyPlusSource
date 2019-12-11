package com.bamtechmedia.dominguez.playback.p237m.p252q;

import com.bamtechmedia.dominguez.config.C3524e;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.playback.m.q.f */
/* compiled from: UpNextConfig_Factory */
public final class C6511f implements C11895c<C6510e> {

    /* renamed from: a */
    private final Provider<C3524e> f14725a;

    public C6511f(Provider<C3524e> provider) {
        this.f14725a = provider;
    }

    /* renamed from: a */
    public static C6511f m20258a(Provider<C3524e> provider) {
        return new C6511f(provider);
    }

    public C6510e get() {
        return new C6510e((C3524e) this.f14725a.get());
    }
}
