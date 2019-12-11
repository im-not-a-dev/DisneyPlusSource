package com.bamtechmedia.dominguez.profiles.p268x1.p269g;

import com.bamtechmedia.dominguez.profiles.C6667g1;
import com.bamtechmedia.dominguez.profiles.p268x1.C6913e;
import javax.inject.Provider;
import p512h.p515d.C11895c;

/* renamed from: com.bamtechmedia.dominguez.profiles.x1.g.f */
/* compiled from: CaptionsResolversImpl_Factory */
public final class C6927f implements C11895c<C6924e> {

    /* renamed from: a */
    private final Provider<C6667g1> f15423a;

    /* renamed from: b */
    private final Provider<C6913e> f15424b;

    /* renamed from: c */
    private final Provider<C6945x> f15425c;

    /* renamed from: d */
    private final Provider<C6937p> f15426d;

    /* renamed from: e */
    private final Provider<C6943v> f15427e;

    /* renamed from: f */
    private final Provider<C6934m> f15428f;

    public C6927f(Provider<C6667g1> provider, Provider<C6913e> provider2, Provider<C6945x> provider3, Provider<C6937p> provider4, Provider<C6943v> provider5, Provider<C6934m> provider6) {
        this.f15423a = provider;
        this.f15424b = provider2;
        this.f15425c = provider3;
        this.f15426d = provider4;
        this.f15427e = provider5;
        this.f15428f = provider6;
    }

    /* renamed from: a */
    public static C6927f m21167a(Provider<C6667g1> provider, Provider<C6913e> provider2, Provider<C6945x> provider3, Provider<C6937p> provider4, Provider<C6943v> provider5, Provider<C6934m> provider6) {
        C6927f fVar = new C6927f(provider, provider2, provider3, provider4, provider5, provider6);
        return fVar;
    }

    public C6924e get() {
        C6924e eVar = new C6924e((C6667g1) this.f15423a.get(), (C6913e) this.f15424b.get(), (C6945x) this.f15425c.get(), (C6937p) this.f15426d.get(), (C6943v) this.f15427e.get(), (C6934m) this.f15428f.get());
        return eVar;
    }
}
