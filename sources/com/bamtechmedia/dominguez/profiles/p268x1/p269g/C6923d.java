package com.bamtechmedia.dominguez.profiles.p268x1.p269g;

import com.bamtechmedia.dominguez.profiles.C6667g1;
import com.bamtechmedia.dominguez.profiles.p263u1.p265e.C6865a;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.profiles.x1.g.d */
/* compiled from: AudioResolversImpl_Factory */
public final class C6923d implements C11895c<C6919c> {

    /* renamed from: a */
    private final Provider<C6667g1> f15405a;

    /* renamed from: b */
    private final Provider<C6865a> f15406b;

    /* renamed from: c */
    private final Provider<C6930i> f15407c;

    /* renamed from: d */
    private final Provider<C6941t> f15408d;

    /* renamed from: e */
    private final Provider<C6939r> f15409e;

    /* renamed from: f */
    private final Provider<C6928g> f15410f;

    /* renamed from: g */
    private final Provider<C6932k> f15411g;

    public C6923d(Provider<C6667g1> provider, Provider<C6865a> provider2, Provider<C6930i> provider3, Provider<C6941t> provider4, Provider<C6939r> provider5, Provider<C6928g> provider6, Provider<C6932k> provider7) {
        this.f15405a = provider;
        this.f15406b = provider2;
        this.f15407c = provider3;
        this.f15408d = provider4;
        this.f15409e = provider5;
        this.f15410f = provider6;
        this.f15411g = provider7;
    }

    /* renamed from: a */
    public static C6923d m21161a(Provider<C6667g1> provider, Provider<C6865a> provider2, Provider<C6930i> provider3, Provider<C6941t> provider4, Provider<C6939r> provider5, Provider<C6928g> provider6, Provider<C6932k> provider7) {
        C6923d dVar = new C6923d(provider, provider2, provider3, provider4, provider5, provider6, provider7);
        return dVar;
    }

    public C6919c get() {
        C6919c cVar = new C6919c((C6667g1) this.f15405a.get(), (C6865a) this.f15406b.get(), (C6930i) this.f15407c.get(), (C6941t) this.f15408d.get(), (C6939r) this.f15409e.get(), (C6928g) this.f15410f.get(), (C6932k) this.f15411g.get());
        return cVar;
    }
}
