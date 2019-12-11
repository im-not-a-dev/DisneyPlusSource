package com.bamtechmedia.dominguez.playback.p237m.p239j;

import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.playback.m.j.i */
/* compiled from: PlayerAnalytics_Factory */
public final class C6409i implements C11895c<C6394h> {

    /* renamed from: a */
    private final Provider<C6391e> f14535a;

    public C6409i(Provider<C6391e> provider) {
        this.f14535a = provider;
    }

    /* renamed from: a */
    public static C6409i m20059a(Provider<C6391e> provider) {
        return new C6409i(provider);
    }

    public C6394h get() {
        return new C6394h((C6391e) this.f14535a.get());
    }
}
