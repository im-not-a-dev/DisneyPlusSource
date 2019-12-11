package com.bamtechmedia.dominguez.playback.p237m.p251p;

import com.bamtechmedia.dominguez.playback.p237m.C6342f;
import com.bamtechmedia.dominguez.playback.p237m.p239j.C6410j;
import com.bamtechmedia.dominguez.playback.p237m.p242m.p243e.C6427a;
import com.bamtechmedia.dominguez.playback.p237m.p242m.p244f.C6439c;
import com.bamtechmedia.dominguez.profiles.C6667g1;
import javax.inject.Provider;
import p163g.p201e.p203b.p283i.p284a.p285a.C7284a;
import p163g.p201e.p203b.p283i.p284a.p285a.C7285b;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.playback.m.p.g */
/* compiled from: UpNextListenersImpl_Factory */
public final class C6499g implements C11895c<C6498f> {

    /* renamed from: a */
    private final Provider<C6342f> f14708a;

    /* renamed from: b */
    private final Provider<C7285b> f14709b;

    /* renamed from: c */
    private final Provider<C7284a> f14710c;

    /* renamed from: d */
    private final Provider<C6439c> f14711d;

    /* renamed from: e */
    private final Provider<C6427a> f14712e;

    /* renamed from: f */
    private final Provider<C6410j> f14713f;

    /* renamed from: g */
    private final Provider<C6667g1> f14714g;

    public C6499g(Provider<C6342f> provider, Provider<C7285b> provider2, Provider<C7284a> provider3, Provider<C6439c> provider4, Provider<C6427a> provider5, Provider<C6410j> provider6, Provider<C6667g1> provider7) {
        this.f14708a = provider;
        this.f14709b = provider2;
        this.f14710c = provider3;
        this.f14711d = provider4;
        this.f14712e = provider5;
        this.f14713f = provider6;
        this.f14714g = provider7;
    }

    /* renamed from: a */
    public static C6499g m20246a(Provider<C6342f> provider, Provider<C7285b> provider2, Provider<C7284a> provider3, Provider<C6439c> provider4, Provider<C6427a> provider5, Provider<C6410j> provider6, Provider<C6667g1> provider7) {
        C6499g gVar = new C6499g(provider, provider2, provider3, provider4, provider5, provider6, provider7);
        return gVar;
    }

    public C6498f get() {
        C6498f fVar = new C6498f((C6342f) this.f14708a.get(), (C7285b) this.f14709b.get(), (C7284a) this.f14710c.get(), (C6439c) this.f14711d.get(), (C6427a) this.f14712e.get(), (C6410j) this.f14713f.get(), (C6667g1) this.f14714g.get());
        return fVar;
    }
}
