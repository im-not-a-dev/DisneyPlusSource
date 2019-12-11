package com.bamtechmedia.dominguez.playback.p237m.p242m.p243e;

import com.bamtechmedia.dominguez.profiles.p263u1.p264d.C6861a;
import com.bamtechmedia.dominguez.profiles.p263u1.p264d.C6863c;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.playback.m.m.e.b */
/* compiled from: EngineLanguageSetup_Factory */
public final class C6433b implements C11895c<C6427a> {

    /* renamed from: a */
    private final Provider<C6861a> f14588a;

    /* renamed from: b */
    private final Provider<C6863c> f14589b;

    public C6433b(Provider<C6861a> provider, Provider<C6863c> provider2) {
        this.f14588a = provider;
        this.f14589b = provider2;
    }

    /* renamed from: a */
    public static C6433b m20102a(Provider<C6861a> provider, Provider<C6863c> provider2) {
        return new C6433b(provider, provider2);
    }

    public C6427a get() {
        return new C6427a((C6861a) this.f14588a.get(), (C6863c) this.f14589b.get());
    }
}
