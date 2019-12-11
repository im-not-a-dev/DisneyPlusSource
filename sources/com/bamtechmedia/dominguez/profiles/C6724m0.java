package com.bamtechmedia.dominguez.profiles;

import androidx.fragment.app.C0532d;
import com.bamtechmedia.dominguez.collections.C3419l;
import com.bamtechmedia.dominguez.dictionaries.C6090n;
import javax.inject.Provider;
import p163g.p201e.p203b.p299m.C7547h;
import p163g.p201e.p203b.p307o.C7614e;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.profiles.m0 */
/* compiled from: ProfilesBindingModule_ProvideProfilesViewModelFactory */
public final class C6724m0 implements C11895c<C6725m1> {

    /* renamed from: a */
    private final Provider<C0532d> f15082a;

    /* renamed from: b */
    private final Provider<C6667g1> f15083b;

    /* renamed from: c */
    private final Provider<C6675i> f15084c;

    /* renamed from: d */
    private final Provider<C6657f> f15085d;

    /* renamed from: e */
    private final Provider<C6090n> f15086e;

    /* renamed from: f */
    private final Provider<C3419l> f15087f;

    /* renamed from: g */
    private final Provider<C7614e> f15088g;

    /* renamed from: h */
    private final Provider<C7547h> f15089h;

    public C6724m0(Provider<C0532d> provider, Provider<C6667g1> provider2, Provider<C6675i> provider3, Provider<C6657f> provider4, Provider<C6090n> provider5, Provider<C3419l> provider6, Provider<C7614e> provider7, Provider<C7547h> provider8) {
        this.f15082a = provider;
        this.f15083b = provider2;
        this.f15084c = provider3;
        this.f15085d = provider4;
        this.f15086e = provider5;
        this.f15087f = provider6;
        this.f15088g = provider7;
        this.f15089h = provider8;
    }

    /* renamed from: a */
    public static C6724m0 m20786a(Provider<C0532d> provider, Provider<C6667g1> provider2, Provider<C6675i> provider3, Provider<C6657f> provider4, Provider<C6090n> provider5, Provider<C3419l> provider6, Provider<C7614e> provider7, Provider<C7547h> provider8) {
        C6724m0 m0Var = new C6724m0(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
        return m0Var;
    }

    /* renamed from: a */
    public static C6725m1 m20787a(C0532d dVar, C6667g1 g1Var, C6675i iVar, C6657f fVar, C6090n nVar, C3419l lVar, C7614e eVar, C7547h hVar) {
        C6725m1 a = C6717k0.m20772a(dVar, g1Var, iVar, fVar, nVar, lVar, eVar, hVar);
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public C6725m1 get() {
        return m20787a((C0532d) this.f15082a.get(), (C6667g1) this.f15083b.get(), (C6675i) this.f15084c.get(), (C6657f) this.f15085d.get(), (C6090n) this.f15086e.get(), (C3419l) this.f15087f.get(), (C7614e) this.f15088g.get(), (C7547h) this.f15089h.get());
    }
}
