package com.bamtechmedia.dominguez.playback.p237m.p245n;

import com.bamtechmedia.dominguez.config.C3572r0;
import javax.inject.Provider;
import p163g.p201e.p203b.p307o.C7614e;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.playback.m.n.e */
/* compiled from: PlaybackErrorMapper_Factory */
public final class C6454e implements C11895c<C6453d> {

    /* renamed from: a */
    private final Provider<C7614e> f14642a;

    /* renamed from: b */
    private final Provider<C3572r0> f14643b;

    public C6454e(Provider<C7614e> provider, Provider<C3572r0> provider2) {
        this.f14642a = provider;
        this.f14643b = provider2;
    }

    /* renamed from: a */
    public static C6454e m20142a(Provider<C7614e> provider, Provider<C3572r0> provider2) {
        return new C6454e(provider, provider2);
    }

    public C6453d get() {
        return new C6453d((C7614e) this.f14642a.get(), (C3572r0) this.f14643b.get());
    }
}
