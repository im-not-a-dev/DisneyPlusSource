package com.bamtechmedia.dominguez.playback.p237m.p239j;

import com.bamtechmedia.dominguez.analytics.C2348e;
import com.bamtechmedia.dominguez.analytics.C2436p;
import com.bamtechmedia.dominguez.analytics.C2476z;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.playback.m.j.f */
/* compiled from: PlaybackAnalytics_Factory */
public final class C6392f implements C11895c<C6391e> {

    /* renamed from: a */
    private final Provider<C2348e> f14516a;

    /* renamed from: b */
    private final Provider<C2436p> f14517b;

    /* renamed from: c */
    private final Provider<C2476z> f14518c;

    public C6392f(Provider<C2348e> provider, Provider<C2436p> provider2, Provider<C2476z> provider3) {
        this.f14516a = provider;
        this.f14517b = provider2;
        this.f14518c = provider3;
    }

    /* renamed from: a */
    public static C6392f m20039a(Provider<C2348e> provider, Provider<C2436p> provider2, Provider<C2476z> provider3) {
        return new C6392f(provider, provider2, provider3);
    }

    public C6391e get() {
        return new C6391e((C2348e) this.f14516a.get(), (C2436p) this.f14517b.get(), (C2476z) this.f14518c.get());
    }
}
