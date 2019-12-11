package com.bamtechmedia.dominguez.core.content.collections;

import com.bamtechmedia.dominguez.collections.C3330h;
import com.bamtechmedia.dominguez.core.content.sets.C3762a;
import com.bamtechmedia.dominguez.core.content.sets.C3765c;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.core.content.collections.j */
/* compiled from: CollectionsRepositoryImpl_Factory */
public final class C3675j implements C11895c<C3668i> {

    /* renamed from: a */
    private final Provider<C3663f> f9213a;

    /* renamed from: b */
    private final Provider<C3765c> f9214b;

    /* renamed from: c */
    private final Provider<C3330h> f9215c;

    /* renamed from: d */
    private final Provider<C3762a> f9216d;

    /* renamed from: e */
    private final Provider<C3660c> f9217e;

    public C3675j(Provider<C3663f> provider, Provider<C3765c> provider2, Provider<C3330h> provider3, Provider<C3762a> provider4, Provider<C3660c> provider5) {
        this.f9213a = provider;
        this.f9214b = provider2;
        this.f9215c = provider3;
        this.f9216d = provider4;
        this.f9217e = provider5;
    }

    /* renamed from: a */
    public static C3675j m12509a(Provider<C3663f> provider, Provider<C3765c> provider2, Provider<C3330h> provider3, Provider<C3762a> provider4, Provider<C3660c> provider5) {
        C3675j jVar = new C3675j(provider, provider2, provider3, provider4, provider5);
        return jVar;
    }

    public C3668i get() {
        C3668i iVar = new C3668i((C3663f) this.f9213a.get(), (C3765c) this.f9214b.get(), (C3330h) this.f9215c.get(), (C3762a) this.f9216d.get(), (C3660c) this.f9217e.get());
        return iVar;
    }
}
