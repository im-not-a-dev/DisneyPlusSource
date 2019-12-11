package com.bamtechmedia.dominguez.playback.p237m.p242m;

import com.bamtechmedia.dominguez.core.utils.C5862q0;
import com.bamtechmedia.dominguez.playback.C6266a;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.playback.m.m.c */
/* compiled from: PlaybackScenarioProvider_Factory */
public final class C6424c implements C11895c<C6423b> {

    /* renamed from: a */
    private final Provider<C5862q0> f14572a;

    /* renamed from: b */
    private final Provider<C6266a> f14573b;

    public C6424c(Provider<C5862q0> provider, Provider<C6266a> provider2) {
        this.f14572a = provider;
        this.f14573b = provider2;
    }

    /* renamed from: a */
    public static C6424c m20085a(Provider<C5862q0> provider, Provider<C6266a> provider2) {
        return new C6424c(provider, provider2);
    }

    public C6423b get() {
        return new C6423b((C5862q0) this.f14572a.get(), (C6266a) this.f14573b.get());
    }
}
